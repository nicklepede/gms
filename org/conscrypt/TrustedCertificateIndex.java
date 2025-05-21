package com.google.android.gms.org.conscrypt;

import java.security.PublicKey;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TrustedCertificateIndex {
    private final Map subjectToTrustAnchors = new HashMap();

    public TrustedCertificateIndex() {
    }

    public Set findAllByIssuerAndSignature(X509Certificate x509Certificate) {
        Map map = this.subjectToTrustAnchors;
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        synchronized (map) {
            List<TrustAnchor> list = (List) this.subjectToTrustAnchors.get(issuerX500Principal);
            if (list == null) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet();
            for (TrustAnchor trustAnchor : list) {
                try {
                    X509Certificate trustedCert = trustAnchor.getTrustedCert();
                    PublicKey publicKey = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor.getCAPublicKey();
                    if (publicKey != null) {
                        x509Certificate.verify(publicKey);
                        hashSet.add(trustAnchor);
                    }
                } catch (Exception unused) {
                }
            }
            return hashSet;
        }
    }

    public TrustAnchor findByIssuerAndSignature(X509Certificate x509Certificate) {
        Map map = this.subjectToTrustAnchors;
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        synchronized (map) {
            List<TrustAnchor> list = (List) this.subjectToTrustAnchors.get(issuerX500Principal);
            if (list == null) {
                return null;
            }
            for (TrustAnchor trustAnchor : list) {
                try {
                    X509Certificate trustedCert = trustAnchor.getTrustedCert();
                    x509Certificate.verify(trustedCert != null ? trustedCert.getPublicKey() : trustAnchor.getCAPublicKey());
                    return trustAnchor;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate) {
        Map map = this.subjectToTrustAnchors;
        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
        synchronized (map) {
            List list = (List) this.subjectToTrustAnchors.get(subjectX500Principal);
            if (list == null) {
                return null;
            }
            return findBySubjectAndPublicKey(x509Certificate, list);
        }
    }

    public void index(TrustAnchor trustAnchor) {
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        X500Principal subjectX500Principal = trustedCert != null ? trustedCert.getSubjectX500Principal() : trustAnchor.getCA();
        synchronized (this.subjectToTrustAnchors) {
            List list = (List) this.subjectToTrustAnchors.get(subjectX500Principal);
            if (list == null) {
                list = new ArrayList(1);
                this.subjectToTrustAnchors.put(subjectX500Principal, list);
            } else if (trustedCert != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (trustedCert.equals(((TrustAnchor) it.next()).getTrustedCert())) {
                        return;
                    }
                }
            }
            list.add(trustAnchor);
        }
    }

    public void reset() {
        synchronized (this.subjectToTrustAnchors) {
            this.subjectToTrustAnchors.clear();
        }
    }

    public TrustedCertificateIndex(Set set) {
        index(set);
    }

    public void reset(Set set) {
        synchronized (this.subjectToTrustAnchors) {
            reset();
            index(set);
        }
    }

    private static TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate, Collection collection) {
        PublicKey cAPublicKey;
        PublicKey publicKey = x509Certificate.getPublicKey();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            try {
                X509Certificate trustedCert = trustAnchor.getTrustedCert();
                if (trustedCert != null) {
                    cAPublicKey = trustedCert.getPublicKey();
                } else {
                    cAPublicKey = trustAnchor.getCAPublicKey();
                }
            } catch (Exception unused) {
            }
            if (!cAPublicKey.equals(publicKey)) {
                if ("X.509".equals(cAPublicKey.getFormat()) && "X.509".equals(publicKey.getFormat())) {
                    byte[] encoded = cAPublicKey.getEncoded();
                    byte[] encoded2 = publicKey.getEncoded();
                    if (encoded2 != null && encoded != null && Arrays.equals(encoded, encoded2)) {
                    }
                }
            }
            return trustAnchor;
        }
        return null;
    }

    public TrustAnchor index(X509Certificate x509Certificate) {
        TrustAnchor trustAnchor = new TrustAnchor(x509Certificate, null);
        index(trustAnchor);
        return trustAnchor;
    }

    private void index(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            index((TrustAnchor) it.next());
        }
    }
}
