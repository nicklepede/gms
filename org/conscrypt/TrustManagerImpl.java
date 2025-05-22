package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.ct.CertificateTransparency;
import defpackage.cbsl$$ExternalSyntheticApiModelOutline2;
import j$.util.DesugarCollections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.CertPath;
import java.security.cert.CertPathChecker;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509ExtendedTrustManager;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class TrustManagerImpl extends X509ExtendedTrustManager {
    private static ConscryptHostnameVerifier defaultHostnameVerifier;
    private final X509Certificate[] acceptedIssuers;
    private final CertBlocklist blocklist;
    private final CertificateTransparency ct;
    private final Exception err;
    private final CertificateFactory factory;
    private ConscryptHostnameVerifier hostnameVerifier;
    private final TrustedCertificateIndex intermediateIndex;
    private final CertPinManager pinManager;
    private final KeyStore rootKeyStore;
    private final TrustedCertificateIndex trustedCertificateIndex;
    private final ConscryptCertStore trustedCertificateStore;
    private final CertPathValidator validator;
    private static final Logger logger = Logger.getLogger(TrustManagerImpl.class.getName());
    private static final TrustAnchorComparator TRUST_ANCHOR_COMPARATOR = new TrustAnchorComparator();
    private static final Set REVOCATION_CHECK_OPTIONS = revocationOptions();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class ExtendedKeyUsagePKIXCertPathChecker extends PKIXCertPathChecker {
        private static final String EKU_anyExtendedKeyUsage = "2.5.29.37.0";
        private static final String EKU_clientAuth = "1.3.6.1.5.5.7.3.2";
        private static final String EKU_msSGC = "1.3.6.1.4.1.311.10.3.3";
        private static final String EKU_nsSGC = "2.16.840.1.113730.4.1";
        private static final String EKU_serverAuth = "1.3.6.1.5.5.7.3.1";
        private final boolean clientAuth;
        private final X509Certificate leaf;
        private static final String EKU_OID = "2.5.29.37";
        private static final Set SUPPORTED_EXTENSIONS = DesugarCollections.unmodifiableSet(new HashSet(Collections.singletonList(EKU_OID)));

        @Override // java.security.cert.PKIXCertPathChecker
        public void check(Certificate certificate, Collection collection) {
            X509Certificate x509Certificate = this.leaf;
            if (certificate != x509Certificate) {
                return;
            }
            try {
                List<String> extendedKeyUsage = x509Certificate.getExtendedKeyUsage();
                if (extendedKeyUsage != null) {
                    for (String str : extendedKeyUsage) {
                        if (!str.equals(EKU_anyExtendedKeyUsage)) {
                            if (this.clientAuth) {
                                if (str.equals(EKU_clientAuth)) {
                                }
                            } else if (!str.equals(EKU_serverAuth) && !str.equals(EKU_nsSGC) && !str.equals(EKU_msSGC)) {
                            }
                        }
                        collection.remove(EKU_OID);
                        return;
                    }
                    throw new CertPathValidatorException("End-entity certificate does not have a valid extendedKeyUsage.");
                }
            } catch (CertificateParsingException e) {
                throw new CertPathValidatorException(e);
            }
        }

        @Override // java.security.cert.PKIXCertPathChecker
        public Set getSupportedExtensions() {
            return SUPPORTED_EXTENSIONS;
        }

        @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
        public boolean isForwardCheckingSupported() {
            return true;
        }

        private ExtendedKeyUsagePKIXCertPathChecker(boolean z, X509Certificate x509Certificate) {
            this.clientAuth = z;
            this.leaf = x509Certificate;
        }

        @Override // java.security.cert.PKIXCertPathChecker, java.security.cert.CertPathChecker
        public void init(boolean z) {
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    enum GlobalHostnameVerifierAdapter implements ConscryptHostnameVerifier {
        INSTANCE;

        @Override // com.google.android.gms.org.conscrypt.ConscryptHostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class TrustAnchorComparator implements Comparator {
        private static final CertificatePriorityComparator CERT_COMPARATOR = new CertificatePriorityComparator();

        private TrustAnchorComparator() {
        }

        @Override // java.util.Comparator
        public int compare(TrustAnchor trustAnchor, TrustAnchor trustAnchor2) {
            return CERT_COMPARATOR.compare(trustAnchor.getTrustedCert(), trustAnchor2.getTrustedCert());
        }
    }

    public TrustManagerImpl(KeyStore keyStore) {
        this(keyStore, null);
    }

    private static X509Certificate[] acceptedIssuers(KeyStore keyStore) {
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    arrayList.add(x509Certificate);
                }
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
        } catch (KeyStoreException unused) {
            return new X509Certificate[0];
        }
    }

    private void checkBlocklist(X509Certificate x509Certificate) {
        CertBlocklist certBlocklist = this.blocklist;
        if (certBlocklist != null && certBlocklist.isPublicKeyBlockListed(x509Certificate.getPublicKey())) {
            throw new CertificateException("Certificate blocklisted by public key: ".concat(String.valueOf(String.valueOf(x509Certificate))));
        }
    }

    private List checkTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession, SSLParameters sSLParameters, boolean z) {
        byte[] bArr;
        byte[] bArr2;
        String str2;
        String endpointIdentificationAlgorithm;
        if (sSLSession != null) {
            str2 = sSLSession.getPeerHost();
            bArr = getOcspDataFromSession(sSLSession);
            bArr2 = getTlsSctDataFromSession(sSLSession);
        } else {
            bArr = null;
            bArr2 = null;
            str2 = null;
        }
        if (sSLSession != null && sSLParameters != null) {
            endpointIdentificationAlgorithm = sSLParameters.getEndpointIdentificationAlgorithm();
            if ("HTTPS".equalsIgnoreCase(endpointIdentificationAlgorithm) && !getHttpsVerifier().verify(str2, sSLSession)) {
                throw new CertificateException("No subjectAltNames on the certificate match");
            }
        }
        return checkTrusted(x509CertificateArr, bArr, bArr2, str, str2, z);
    }

    private List checkTrustedRecursive(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, boolean z, List list, List list2, Set set) {
        X509Certificate trustedCert = list2.isEmpty() ? (X509Certificate) list.get(list.size() - 1) : ((TrustAnchor) list2.get(list2.size() - 1)).getTrustedCert();
        checkBlocklist(trustedCert);
        if (trustedCert.getIssuerDN().equals(trustedCert.getSubjectDN())) {
            return verifyChain(list, list2, str, z, bArr, bArr2);
        }
        Iterator it = sortPotentialAnchors(findAllTrustAnchorsByIssuerAndSignature(trustedCert)).iterator();
        boolean z2 = false;
        CertificateException certificateException = null;
        while (true) {
            if (!it.hasNext()) {
                if (!list2.isEmpty()) {
                    if (z2) {
                        throw certificateException;
                    }
                    return verifyChain(list, list2, str, z, bArr, bArr2);
                }
                for (int i = 1; i < x509CertificateArr.length; i++) {
                    X509Certificate x509Certificate = x509CertificateArr[i];
                    if (!set.contains(x509Certificate) && trustedCert.getIssuerDN().equals(x509Certificate.getSubjectDN())) {
                        try {
                            x509Certificate.checkValidity();
                            ChainStrengthAnalyzer.checkCert(x509Certificate);
                            set.add(x509Certificate);
                            list.add(x509Certificate);
                            try {
                                return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, list, list2, set);
                            } catch (CertificateException e) {
                                set.remove(x509Certificate);
                                list.remove(list.size() - 1);
                                certificateException = e;
                            }
                        } catch (CertificateException e2) {
                            certificateException = new CertificateException("Unacceptable certificate: ".concat(String.valueOf(String.valueOf(x509Certificate.getSubjectX500Principal()))), e2);
                        }
                    }
                }
                Iterator it2 = sortPotentialAnchors(this.intermediateIndex.findAllByIssuerAndSignature(trustedCert)).iterator();
                while (it2.hasNext()) {
                    X509Certificate trustedCert2 = ((TrustAnchor) it2.next()).getTrustedCert();
                    if (!set.contains(trustedCert2)) {
                        set.add(trustedCert2);
                        list.add(trustedCert2);
                        try {
                            return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, list, list2, set);
                        } catch (CertificateException e3) {
                            certificateException = e3;
                            list.remove(list.size() - 1);
                            set.remove(trustedCert2);
                        }
                    }
                }
                if (certificateException != null) {
                    throw certificateException;
                }
                throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", null, this.factory.generateCertPath((List<? extends Certificate>) list), -1));
            }
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            X509Certificate trustedCert3 = trustAnchor.getTrustedCert();
            if (!set.contains(trustedCert3)) {
                set.add(trustedCert3);
                list2.add(trustAnchor);
                try {
                    return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str, z, list, list2, set);
                } catch (CertificateException e4) {
                    certificateException = e4;
                    list2.remove(list2.size() - 1);
                    set.remove(trustedCert3);
                    z2 = true;
                }
            }
        }
    }

    private Set findAllTrustAnchorsByIssuerAndSignature(X509Certificate x509Certificate) {
        ConscryptCertStore conscryptCertStore;
        Set findAllByIssuerAndSignature = this.trustedCertificateIndex.findAllByIssuerAndSignature(x509Certificate);
        if (findAllByIssuerAndSignature.isEmpty() && (conscryptCertStore = this.trustedCertificateStore) != null) {
            Set findAllIssuers = conscryptCertStore.findAllIssuers(x509Certificate);
            if (!findAllIssuers.isEmpty()) {
                findAllByIssuerAndSignature = new HashSet(findAllIssuers.size());
                Iterator it = findAllIssuers.iterator();
                while (it.hasNext()) {
                    findAllByIssuerAndSignature.add(this.trustedCertificateIndex.index((X509Certificate) it.next()));
                }
            }
        }
        return findAllByIssuerAndSignature;
    }

    private TrustAnchor findTrustAnchorBySubjectAndPublicKey(X509Certificate x509Certificate) {
        X509Certificate trustAnchor;
        TrustAnchor findBySubjectAndPublicKey = this.trustedCertificateIndex.findBySubjectAndPublicKey(x509Certificate);
        if (findBySubjectAndPublicKey != null) {
            return findBySubjectAndPublicKey;
        }
        ConscryptCertStore conscryptCertStore = this.trustedCertificateStore;
        if (conscryptCertStore == null || (trustAnchor = conscryptCertStore.getTrustAnchor(x509Certificate)) == null) {
            return null;
        }
        return new TrustAnchor(trustAnchor, null);
    }

    static synchronized ConscryptHostnameVerifier getDefaultHostnameVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier;
        synchronized (TrustManagerImpl.class) {
            conscryptHostnameVerifier = defaultHostnameVerifier;
        }
        return conscryptHostnameVerifier;
    }

    private static SSLSession getHandshakeSessionOrThrow(SSLSocket sSLSocket) {
        SSLSession handshakeSession;
        handshakeSession = sSLSocket.getHandshakeSession();
        if (handshakeSession != null) {
            return handshakeSession;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    private ConscryptHostnameVerifier getHttpsVerifier() {
        ConscryptHostnameVerifier conscryptHostnameVerifier = this.hostnameVerifier;
        if (conscryptHostnameVerifier != null) {
            return conscryptHostnameVerifier;
        }
        ConscryptHostnameVerifier defaultHostnameVerifier2 = getDefaultHostnameVerifier();
        return defaultHostnameVerifier2 != null ? defaultHostnameVerifier2 : GlobalHostnameVerifierAdapter.INSTANCE;
    }

    private static byte[] getOcspDataFromSession(SSLSession sSLSession) {
        List list;
        if (sSLSession instanceof ConscryptSession) {
            list = ((ConscryptSession) sSLSession).getStatusResponses();
        } else {
            try {
                Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getStatusResponses", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(sSLSession, null);
                if (invoke instanceof List) {
                    list = (List) invoke;
                }
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (byte[]) list.get(0);
    }

    private byte[] getTlsSctDataFromSession(SSLSession sSLSession) {
        if (sSLSession instanceof ConscryptSession) {
            return ((ConscryptSession) sSLSession).getPeerSignedCertificateTimestamp();
        }
        try {
            Method declaredMethod = sSLSession.getClass().getDeclaredMethod("getPeerSignedCertificateTimestamp", null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(sSLSession, null);
            if (invoke instanceof byte[]) {
                return (byte[]) invoke;
            }
            return null;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException unused) {
            return null;
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private static Set revocationOptions() {
        PKIXRevocationChecker.Option option;
        PKIXRevocationChecker.Option option2;
        HashSet hashSet = new HashSet();
        option = PKIXRevocationChecker.Option.ONLY_END_ENTITY;
        hashSet.add(option);
        option2 = PKIXRevocationChecker.Option.NO_FALLBACK;
        hashSet.add(option2);
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    static synchronized void setDefaultHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        synchronized (TrustManagerImpl.class) {
            defaultHostnameVerifier = conscryptHostnameVerifier;
        }
    }

    private void setOcspResponses(PKIXParameters pKIXParameters, X509Certificate x509Certificate, byte[] bArr) {
        PKIXRevocationChecker pKIXRevocationChecker;
        CertPathChecker revocationChecker;
        if (bArr == null) {
            return;
        }
        List<PKIXCertPathChecker> arrayList = new ArrayList<>(pKIXParameters.getCertPathCheckers());
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pKIXRevocationChecker = null;
                break;
            }
            PKIXCertPathChecker pKIXCertPathChecker = arrayList.get(i);
            i++;
            if (cbsl$$ExternalSyntheticApiModelOutline2.m$1(pKIXCertPathChecker)) {
                pKIXRevocationChecker = cbsl$$ExternalSyntheticApiModelOutline2.m189m((Object) pKIXCertPathChecker);
                break;
            }
        }
        if (pKIXRevocationChecker == null) {
            try {
                revocationChecker = this.validator.getRevocationChecker();
                pKIXRevocationChecker = cbsl$$ExternalSyntheticApiModelOutline2.m189m((Object) revocationChecker);
                arrayList.add(pKIXRevocationChecker);
                pKIXRevocationChecker.setOptions(REVOCATION_CHECK_OPTIONS);
            } catch (UnsupportedOperationException unused) {
                return;
            }
        }
        pKIXRevocationChecker.setOcspResponses(Collections.singletonMap(x509Certificate, bArr));
        pKIXParameters.setCertPathCheckers(arrayList);
    }

    private static Collection sortPotentialAnchors(Set set) {
        if (set.size() <= 1) {
            return set;
        }
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList, TRUST_ANCHOR_COMPARATOR);
        return arrayList;
    }

    private static Set trustAnchors(X509Certificate[] x509CertificateArr) {
        HashSet hashSet = new HashSet(x509CertificateArr.length);
        for (X509Certificate x509Certificate : x509CertificateArr) {
            hashSet.add(new TrustAnchor(x509Certificate, null));
        }
        return hashSet;
    }

    private List verifyChain(List list, List list2, String str, boolean z, byte[] bArr, byte[] bArr2) {
        CertificateTransparency certificateTransparency;
        try {
            CertPath generateCertPath = this.factory.generateCertPath((List<? extends Certificate>) list);
            if (list2.isEmpty()) {
                throw new CertificateException(new CertPathValidatorException("Trust anchor for certification path not found.", null, generateCertPath, -1));
            }
            ArrayList arrayList = new ArrayList(list);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((TrustAnchor) it.next()).getTrustedCert());
            }
            CertPinManager certPinManager = this.pinManager;
            if (certPinManager != null) {
                certPinManager.checkChainPinning(str, arrayList);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                checkBlocklist((X509Certificate) it2.next());
            }
            if (!z && str != null && (certificateTransparency = this.ct) != null && certificateTransparency.isCTVerificationRequired(str)) {
                this.ct.checkCT(arrayList, bArr, bArr2, str);
            }
            if (!list.isEmpty()) {
                ChainStrengthAnalyzer.check(list);
                try {
                    HashSet hashSet = new HashSet();
                    hashSet.add((TrustAnchor) list2.get(0));
                    PKIXParameters pKIXParameters = new PKIXParameters(hashSet);
                    pKIXParameters.setRevocationEnabled(false);
                    X509Certificate x509Certificate = (X509Certificate) list.get(0);
                    setOcspResponses(pKIXParameters, x509Certificate, bArr);
                    pKIXParameters.addCertPathChecker(new ExtendedKeyUsagePKIXCertPathChecker(z, x509Certificate));
                    this.validator.validate(generateCertPath, pKIXParameters);
                    for (int i = 1; i < list.size(); i++) {
                        this.intermediateIndex.index((X509Certificate) list.get(i));
                    }
                } catch (InvalidAlgorithmParameterException e) {
                    throw new CertificateException("Chain validation failed", e);
                } catch (CertPathValidatorException e2) {
                    throw new CertificateException("Chain validation failed", e2);
                }
            }
            return arrayList;
        } catch (CertificateException e3) {
            logger.logp(Level.FINE, "com.google.android.gms.org.conscrypt.TrustManagerImpl", "verifyChain", "Rejected candidate cert chain due to error: ".concat(String.valueOf(e3.getMessage())));
            throw e3;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, null, null, true);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        checkTrusted(x509CertificateArr, str, null, null, false);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        return x509CertificateArr != null ? (X509Certificate[]) x509CertificateArr.clone() : acceptedIssuers(this.rootKeyStore);
    }

    public ConscryptHostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        SSLSession sSLSession;
        SSLParameters sSLParameters;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        return checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, false);
    }

    public void handleTrustStorageUpdate() {
        X509Certificate[] x509CertificateArr = this.acceptedIssuers;
        if (x509CertificateArr == null) {
            this.trustedCertificateIndex.reset();
        } else {
            this.trustedCertificateIndex.reset(trustAnchors(x509CertificateArr));
        }
    }

    public void setHostnameVerifier(ConscryptHostnameVerifier conscryptHostnameVerifier) {
        this.hostnameVerifier = conscryptHostnameVerifier;
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager) {
        this(keyStore, certPinManager, null);
    }

    public List checkClientTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        return checkTrusted(x509CertificateArr, null, null, str, str2, true);
    }

    public List checkServerTrusted(X509Certificate[] x509CertificateArr, String str, String str2) {
        return checkTrusted(x509CertificateArr, null, null, str, str2, false);
    }

    public TrustManagerImpl(KeyStore keyStore, CertPinManager certPinManager, ConscryptCertStore conscryptCertStore) {
        this(keyStore, certPinManager, conscryptCertStore, null, null);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        SSLSession sSLSession;
        SSLParameters sSLParameters;
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            SSLSession handshakeSessionOrThrow = getHandshakeSessionOrThrow(sSLSocket);
            sSLParameters = sSLSocket.getSSLParameters();
            sSLSession = handshakeSessionOrThrow;
        } else {
            sSLSession = null;
            sSLParameters = null;
        }
        checkTrusted(x509CertificateArr, str, sSLSession, sSLParameters, true);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        getTrustedChainForServer(x509CertificateArr, str, socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private TrustManagerImpl(java.security.KeyStore r6, com.google.android.gms.org.conscrypt.CertPinManager r7, com.google.android.gms.org.conscrypt.ConscryptCertStore r8, com.google.android.gms.org.conscrypt.CertBlocklist r9, com.google.android.gms.org.conscrypt.ct.CertificateTransparency r10) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            java.lang.String r1 = "PKIX"
            java.security.cert.CertPathValidator r1 = java.security.cert.CertPathValidator.getInstance(r1)     // Catch: java.lang.Exception -> L3d
            java.lang.String r2 = "X509"
            java.security.cert.CertificateFactory r2 = java.security.cert.CertificateFactory.getInstance(r2)     // Catch: java.lang.Exception -> L37
            java.lang.String r3 = "AndroidCAStore"
            java.lang.String r4 = r6.getType()     // Catch: java.lang.Exception -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L1e
            int r3 = com.google.android.gms.org.conscrypt.Platform.a     // Catch: java.lang.Exception -> L32
        L1e:
            java.security.cert.X509Certificate[] r6 = acceptedIssuers(r6)     // Catch: java.lang.Exception -> L2f
            com.google.android.gms.org.conscrypt.TrustedCertificateIndex r3 = new com.google.android.gms.org.conscrypt.TrustedCertificateIndex     // Catch: java.lang.Exception -> L2d
            java.util.Set r4 = trustAnchors(r6)     // Catch: java.lang.Exception -> L2d
            r3.<init>(r4)     // Catch: java.lang.Exception -> L2d
            r4 = r0
            goto L45
        L2d:
            r3 = move-exception
            goto L43
        L2f:
            r3 = move-exception
            r6 = r0
            goto L43
        L32:
            r6 = move-exception
            r3 = r6
            r6 = r0
            r8 = r6
            goto L43
        L37:
            r6 = move-exception
            r3 = r6
            r6 = r0
            r8 = r6
            r2 = r8
            goto L43
        L3d:
            r6 = move-exception
            r3 = r6
            r6 = r0
            r8 = r6
            r1 = r8
            r2 = r1
        L43:
            r4 = r3
            r3 = r0
        L45:
            if (r10 != 0) goto L4a
            int r10 = com.google.android.gms.org.conscrypt.Platform.a
            r10 = r0
        L4a:
            if (r9 != 0) goto L4f
            int r9 = com.google.android.gms.org.conscrypt.Platform.a
            r9 = r0
        L4f:
            r5.pinManager = r7
            r5.rootKeyStore = r0
            r5.trustedCertificateStore = r8
            r5.validator = r1
            r5.factory = r2
            r5.trustedCertificateIndex = r3
            com.google.android.gms.org.conscrypt.TrustedCertificateIndex r7 = new com.google.android.gms.org.conscrypt.TrustedCertificateIndex
            r7.<init>()
            r5.intermediateIndex = r7
            r5.acceptedIssuers = r6
            r5.err = r4
            r5.blocklist = r9
            r5.ct = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.TrustManagerImpl.<init>(java.security.KeyStore, com.google.android.gms.org.conscrypt.CertPinManager, com.google.android.gms.org.conscrypt.ConscryptCertStore, com.google.android.gms.org.conscrypt.CertBlocklist, com.google.android.gms.org.conscrypt.ct.CertificateTransparency):void");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        getTrustedChainForServer(x509CertificateArr, str, sSLEngine);
    }

    public List checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLSession sSLSession) {
        return checkTrusted(x509CertificateArr, str, sSLSession, null, false);
    }

    public List getTrustedChainForServer(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        SSLSession handshakeSession;
        handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            return checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), false);
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        SSLSession handshakeSession;
        handshakeSession = sSLEngine.getHandshakeSession();
        if (handshakeSession != null) {
            checkTrusted(x509CertificateArr, str, handshakeSession, sSLEngine.getSSLParameters(), true);
            return;
        }
        throw new CertificateException("Not in handshake; no session available");
    }

    private List checkTrusted(X509Certificate[] x509CertificateArr, byte[] bArr, byte[] bArr2, String str, String str2, boolean z) {
        if (x509CertificateArr != null && x509CertificateArr.length != 0 && str != null && !str.isEmpty()) {
            Exception exc = this.err;
            if (exc == null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                X509Certificate x509Certificate = x509CertificateArr[0];
                TrustAnchor findTrustAnchorBySubjectAndPublicKey = findTrustAnchorBySubjectAndPublicKey(x509Certificate);
                if (findTrustAnchorBySubjectAndPublicKey != null) {
                    arrayList2.add(findTrustAnchorBySubjectAndPublicKey);
                    hashSet.add(findTrustAnchorBySubjectAndPublicKey.getTrustedCert());
                } else {
                    arrayList.add(x509Certificate);
                }
                hashSet.add(x509Certificate);
                return checkTrustedRecursive(x509CertificateArr, bArr, bArr2, str2, z, arrayList, arrayList2, hashSet);
            }
            throw new CertificateException(exc);
        }
        throw new IllegalArgumentException("null or zero-length parameter");
    }
}
