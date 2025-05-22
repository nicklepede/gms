package com.google.android.gms.org.conscrypt.ct;

import com.google.android.gms.org.conscrypt.NativeCrypto;
import com.google.android.gms.org.conscrypt.OpenSSLX509Certificate;
import com.google.android.gms.org.conscrypt.ct.SignedCertificateTimestamp;
import com.google.android.gms.org.conscrypt.ct.VerifiedSCT;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Verifier {
    private final LogStore store;

    public Verifier(LogStore logStore) {
        this.store = logStore;
    }

    private List getSCTsFromOCSPResponse(byte[] bArr, OpenSSLX509Certificate[] openSSLX509CertificateArr) {
        if (bArr == null || openSSLX509CertificateArr.length < 2) {
            return Collections.EMPTY_LIST;
        }
        byte[] bArr2 = NativeCrypto.get_ocsp_single_extension(bArr, Constants.OCSP_SCT_LIST_OID, openSSLX509CertificateArr[0].getContext(), openSSLX509CertificateArr[0], openSSLX509CertificateArr[1].getContext(), openSSLX509CertificateArr[1]);
        if (bArr2 == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            return getSCTsFromSCTList(Serialization.readDEROctetString(Serialization.readDEROctetString(bArr2)), SignedCertificateTimestamp.Origin.OCSP_RESPONSE);
        } catch (SerializationException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static List getSCTsFromSCTList(byte[] bArr, SignedCertificateTimestamp.Origin origin) {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            byte[][] readList = Serialization.readList(bArr, 2, 2);
            ArrayList arrayList = new ArrayList();
            for (byte[] bArr2 : readList) {
                try {
                    arrayList.add(SignedCertificateTimestamp.decode(bArr2, origin));
                } catch (SerializationException unused) {
                }
            }
            return arrayList;
        } catch (SerializationException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    private List getSCTsFromTLSExtension(byte[] bArr) {
        return getSCTsFromSCTList(bArr, SignedCertificateTimestamp.Origin.TLS_EXTENSION);
    }

    private List getSCTsFromX509Extension(OpenSSLX509Certificate openSSLX509Certificate) {
        byte[] extensionValue = openSSLX509Certificate.getExtensionValue(Constants.X509_SCT_LIST_OID);
        if (extensionValue == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            return getSCTsFromSCTList(Serialization.readDEROctetString(Serialization.readDEROctetString(extensionValue)), SignedCertificateTimestamp.Origin.EMBEDDED);
        } catch (SerializationException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private void markSCTsAsInvalid(List list, VerificationResult verificationResult) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VerifiedSCT.Builder builder = new VerifiedSCT.Builder((SignedCertificateTimestamp) it.next());
            builder.setStatus(VerifiedSCT.Status.INVALID_SCT);
            verificationResult.add(builder.build());
        }
    }

    private void verifyEmbeddedSCTs(List list, OpenSSLX509Certificate[] openSSLX509CertificateArr, VerificationResult verificationResult) {
        if (list.isEmpty()) {
            return;
        }
        CertificateEntry certificateEntry = null;
        if (openSSLX509CertificateArr.length >= 2) {
            try {
                certificateEntry = CertificateEntry.createForPrecertificate(openSSLX509CertificateArr[0], openSSLX509CertificateArr[1]);
            } catch (CertificateException unused) {
            }
        }
        if (certificateEntry == null) {
            markSCTsAsInvalid(list, verificationResult);
        } else {
            verifySCTs(list, certificateEntry, verificationResult);
        }
    }

    private void verifyExternalSCTs(List list, OpenSSLX509Certificate openSSLX509Certificate, VerificationResult verificationResult) {
        if (list.isEmpty()) {
            return;
        }
        try {
            verifySCTs(list, CertificateEntry.createForX509Certificate(openSSLX509Certificate), verificationResult);
        } catch (CertificateException unused) {
            markSCTsAsInvalid(list, verificationResult);
        }
    }

    private void verifySCTs(List list, CertificateEntry certificateEntry, VerificationResult verificationResult) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SignedCertificateTimestamp signedCertificateTimestamp = (SignedCertificateTimestamp) it.next();
            VerifiedSCT.Builder builder = new VerifiedSCT.Builder(signedCertificateTimestamp);
            LogInfo knownLog = this.store.getKnownLog(signedCertificateTimestamp.getLogID());
            if (knownLog == null) {
                builder.setStatus(VerifiedSCT.Status.UNKNOWN_LOG);
            } else {
                VerifiedSCT.Status verifySingleSCT = knownLog.verifySingleSCT(signedCertificateTimestamp, certificateEntry);
                builder.setStatus(verifySingleSCT);
                if (verifySingleSCT == VerifiedSCT.Status.VALID) {
                    builder.setLogInfo(knownLog);
                }
            }
            verificationResult.add(builder.build());
        }
    }

    public VerificationResult verifySignedCertificateTimestamps(List list, byte[] bArr, byte[] bArr2) {
        OpenSSLX509Certificate[] openSSLX509CertificateArr = new OpenSSLX509Certificate[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            openSSLX509CertificateArr[i] = OpenSSLX509Certificate.fromCertificate((X509Certificate) it.next());
            i++;
        }
        return verifySignedCertificateTimestamps(openSSLX509CertificateArr, bArr, bArr2);
    }

    public VerificationResult verifySignedCertificateTimestamps(OpenSSLX509Certificate[] openSSLX509CertificateArr, byte[] bArr, byte[] bArr2) {
        if (openSSLX509CertificateArr.length != 0) {
            OpenSSLX509Certificate openSSLX509Certificate = openSSLX509CertificateArr[0];
            VerificationResult verificationResult = new VerificationResult();
            verifyExternalSCTs(getSCTsFromTLSExtension(bArr), openSSLX509Certificate, verificationResult);
            verifyExternalSCTs(getSCTsFromOCSPResponse(bArr2, openSSLX509CertificateArr), openSSLX509Certificate, verificationResult);
            verifyEmbeddedSCTs(getSCTsFromX509Extension(openSSLX509CertificateArr[0]), openSSLX509CertificateArr, verificationResult);
            return verificationResult;
        }
        throw new IllegalArgumentException("Chain of certificates mustn't be empty.");
    }
}
