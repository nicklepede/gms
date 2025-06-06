package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.Principal;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class OpenSSLX509CRL extends X509CRL {
    private volatile long mContext;
    private final Date nextUpdate;
    private final Date thisUpdate;

    private OpenSSLX509CRL(long j) {
        this.mContext = j;
        this.thisUpdate = toDate(NativeCrypto.X509_CRL_get_lastUpdate(this.mContext, this));
        this.nextUpdate = toDate(NativeCrypto.X509_CRL_get_nextUpdate(this.mContext, this));
    }

    static List fromPkcs7DerInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long[] d2i_PKCS7_bio = NativeCrypto.d2i_PKCS7_bio(openSSLBIOInputStream.getBioContext(), 2);
                openSSLBIOInputStream.release();
                ArrayList arrayList = new ArrayList(d2i_PKCS7_bio.length);
                for (long j : d2i_PKCS7_bio) {
                    if (j != 0) {
                        arrayList.add(new OpenSSLX509CRL(j));
                    }
                }
                return arrayList;
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } catch (Throwable th) {
            openSSLBIOInputStream.release();
            throw th;
        }
    }

    static List fromPkcs7PemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long[] PEM_read_bio_PKCS7 = NativeCrypto.PEM_read_bio_PKCS7(openSSLBIOInputStream.getBioContext(), 2);
                openSSLBIOInputStream.release();
                ArrayList arrayList = new ArrayList(PEM_read_bio_PKCS7.length);
                for (long j : PEM_read_bio_PKCS7) {
                    if (j != 0) {
                        arrayList.add(new OpenSSLX509CRL(j));
                    }
                }
                return arrayList;
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } catch (Throwable th) {
            openSSLBIOInputStream.release();
            throw th;
        }
    }

    static OpenSSLX509CRL fromX509DerInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long d2i_X509_CRL_bio = NativeCrypto.d2i_X509_CRL_bio(openSSLBIOInputStream.getBioContext());
                return d2i_X509_CRL_bio == 0 ? null : new OpenSSLX509CRL(d2i_X509_CRL_bio);
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    static OpenSSLX509CRL fromX509PemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long PEM_read_bio_X509_CRL = NativeCrypto.PEM_read_bio_X509_CRL(openSSLBIOInputStream.getBioContext());
                return PEM_read_bio_X509_CRL == 0 ? null : new OpenSSLX509CRL(PEM_read_bio_X509_CRL);
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    static Date toDate(long j) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar.set(14, 0);
        NativeCrypto.ASN1_TIME_to_Calendar(j, calendar);
        return calendar.getTime();
    }

    private void verifyInternal(PublicKey publicKey, String str) {
        String sigAlgName = getSigAlgName();
        if (sigAlgName == null) {
            sigAlgName = getSigAlgOID();
        }
        Signature signature = str == null ? Signature.getInstance(sigAlgName) : Signature.getInstance(sigAlgName, str);
        signature.initVerify(publicKey);
        signature.update(getTBSCertList());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("signature did not verify");
        }
    }

    private void verifyOpenSSL(OpenSSLKey openSSLKey) {
        try {
            NativeCrypto.X509_CRL_verify(this.mContext, this, openSSLKey.getNativeRef());
        } catch (BadPaddingException | IllegalBlockSizeException e) {
            throw new SignatureException(e);
        }
    }

    protected void finalize() {
        try {
            long j = this.mContext;
            if (j != 0) {
                this.mContext = 0L;
                NativeCrypto.X509_CRL_free(j, this);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_CRL_ext_oids(this.mContext, this, 1);
        if (strArr.length == 0 && NativeCrypto.get_X509_CRL_ext_oids(this.mContext, this, 0).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() {
        return NativeCrypto.i2d_X509_CRL(this.mContext, this);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return NativeCrypto.X509_CRL_get_ext_oid(this.mContext, this, str);
    }

    @Override // java.security.cert.X509CRL
    public Principal getIssuerDN() {
        return getIssuerX500Principal();
    }

    @Override // java.security.cert.X509CRL
    public X500Principal getIssuerX500Principal() {
        return new X500Principal(NativeCrypto.X509_CRL_get_issuer_name(this.mContext, this));
    }

    @Override // java.security.cert.X509CRL
    public Date getNextUpdate() {
        return (Date) this.nextUpdate.clone();
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_CRL_ext_oids(this.mContext, this, 0);
        if (strArr.length == 0 && NativeCrypto.get_X509_CRL_ext_oids(this.mContext, this, 1).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        long X509_CRL_get0_by_serial = NativeCrypto.X509_CRL_get0_by_serial(this.mContext, this, bigInteger.toByteArray());
        if (X509_CRL_get0_by_serial == 0) {
            return null;
        }
        try {
            return new OpenSSLX509CRLEntry(NativeCrypto.X509_REVOKED_dup(X509_CRL_get0_by_serial));
        } catch (OpenSSLX509CertificateFactory.ParsingException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        long[] X509_CRL_get_REVOKED = NativeCrypto.X509_CRL_get_REVOKED(this.mContext, this);
        if (X509_CRL_get_REVOKED == null || (X509_CRL_get_REVOKED.length) == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (long j : X509_CRL_get_REVOKED) {
            try {
                hashSet.add(new OpenSSLX509CRLEntry(j));
            } catch (OpenSSLX509CertificateFactory.ParsingException unused) {
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgName() {
        String sigAlgOID = getSigAlgOID();
        String oidToAlgorithmName = OidData.oidToAlgorithmName(sigAlgOID);
        if (oidToAlgorithmName != null) {
            return oidToAlgorithmName;
        }
        String oidToAlgorithmName2 = Platform.oidToAlgorithmName(sigAlgOID);
        return oidToAlgorithmName2 != null ? oidToAlgorithmName2 : sigAlgOID;
    }

    @Override // java.security.cert.X509CRL
    public String getSigAlgOID() {
        return NativeCrypto.get_X509_CRL_sig_alg_oid(this.mContext, this);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSigAlgParams() {
        return NativeCrypto.get_X509_CRL_sig_alg_parameter(this.mContext, this);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getSignature() {
        return NativeCrypto.get_X509_CRL_signature(this.mContext, this);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() {
        return NativeCrypto.get_X509_CRL_crl_enc(this.mContext, this);
    }

    @Override // java.security.cert.X509CRL
    public Date getThisUpdate() {
        return (Date) this.thisUpdate.clone();
    }

    @Override // java.security.cert.X509CRL
    public int getVersion() {
        return ((int) NativeCrypto.X509_CRL_get_version(this.mContext, this)) + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        for (String str : NativeCrypto.get_X509_CRL_ext_oids(this.mContext, this, 1)) {
            if (NativeCrypto.X509_supported_extension(NativeCrypto.X509_CRL_get_ext(this.mContext, this, str)) != 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public boolean isRevoked(Certificate certificate) {
        OpenSSLX509Certificate fromX509DerInputStream;
        if (!(certificate instanceof X509Certificate)) {
            return false;
        }
        if (certificate instanceof OpenSSLX509Certificate) {
            fromX509DerInputStream = (OpenSSLX509Certificate) certificate;
        } else {
            try {
                fromX509DerInputStream = OpenSSLX509Certificate.fromX509DerInputStream(new ByteArrayInputStream(certificate.getEncoded()));
            } catch (Exception e) {
                throw new RuntimeException("cannot convert certificate", e);
            }
        }
        OpenSSLX509Certificate openSSLX509Certificate = fromX509DerInputStream;
        return NativeCrypto.X509_CRL_get0_by_cert(this.mContext, this, openSSLX509Certificate.getContext(), openSSLX509Certificate) != 0;
    }

    @Override // java.security.cert.CRL
    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long create_BIO_OutputStream = NativeCrypto.create_BIO_OutputStream(byteArrayOutputStream);
        try {
            NativeCrypto.X509_CRL_print(create_BIO_OutputStream, this.mContext, this);
            return byteArrayOutputStream.toString();
        } finally {
            NativeCrypto.BIO_free_all(create_BIO_OutputStream);
        }
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) {
        if (publicKey instanceof OpenSSLKeyHolder) {
            verifyOpenSSL(((OpenSSLKeyHolder) publicKey).getOpenSSLKey());
        } else {
            verifyInternal(publicKey, null);
        }
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(X509Certificate x509Certificate) {
        if (x509Certificate instanceof OpenSSLX509Certificate) {
            OpenSSLX509Certificate openSSLX509Certificate = (OpenSSLX509Certificate) x509Certificate;
            long X509_CRL_get0_by_cert = NativeCrypto.X509_CRL_get0_by_cert(this.mContext, this, openSSLX509Certificate.getContext(), openSSLX509Certificate);
            if (X509_CRL_get0_by_cert == 0) {
                return null;
            }
            try {
                return new OpenSSLX509CRLEntry(NativeCrypto.X509_REVOKED_dup(X509_CRL_get0_by_cert));
            } catch (OpenSSLX509CertificateFactory.ParsingException unused) {
                return null;
            }
        }
        return getRevokedCertificate(x509Certificate.getSerialNumber());
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) {
        verifyInternal(publicKey, str);
    }
}
