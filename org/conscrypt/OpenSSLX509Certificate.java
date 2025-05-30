package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.OpenSSLX509CertificateFactory;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OpenSSLX509Certificate extends X509Certificate {
    private static final long serialVersionUID = 1992239142393372128L;
    private volatile transient long mContext;
    private transient Integer mHashCode;
    private final Date notAfter;
    private final Date notBefore;

    public OpenSSLX509Certificate(long j) {
        this.mContext = j;
        this.notBefore = toDate(NativeCrypto.X509_get_notBefore(this.mContext, this));
        this.notAfter = toDate(NativeCrypto.X509_get_notAfter(this.mContext, this));
    }

    private static Collection alternativeNameArrayToList(Object[][] objArr) {
        if (objArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object[] objArr2 : objArr) {
            arrayList.add(DesugarCollections.unmodifiableList(Arrays.asList(objArr2)));
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public static OpenSSLX509Certificate fromCertificate(Certificate certificate) {
        if (certificate instanceof OpenSSLX509Certificate) {
            return (OpenSSLX509Certificate) certificate;
        }
        if (certificate instanceof X509Certificate) {
            return fromX509Der(certificate.getEncoded());
        }
        throw new CertificateEncodingException("Only X.509 certificates are supported");
    }

    public static List fromPkcs7DerInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long[] d2i_PKCS7_bio = NativeCrypto.d2i_PKCS7_bio(openSSLBIOInputStream.getBioContext(), 1);
                if (d2i_PKCS7_bio == null) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(d2i_PKCS7_bio.length);
                for (long j : d2i_PKCS7_bio) {
                    if (j != 0) {
                        arrayList.add(new OpenSSLX509Certificate(j));
                    }
                }
                return arrayList;
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    public static List fromPkcs7PemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long[] PEM_read_bio_PKCS7 = NativeCrypto.PEM_read_bio_PKCS7(openSSLBIOInputStream.getBioContext(), 1);
                openSSLBIOInputStream.release();
                ArrayList arrayList = new ArrayList(PEM_read_bio_PKCS7.length);
                for (long j : PEM_read_bio_PKCS7) {
                    if (j != 0) {
                        arrayList.add(new OpenSSLX509Certificate(j));
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

    public static OpenSSLX509Certificate fromX509Der(byte[] bArr) {
        try {
            return new OpenSSLX509Certificate(NativeCrypto.d2i_X509(bArr));
        } catch (OpenSSLX509CertificateFactory.ParsingException e) {
            throw new CertificateEncodingException(e);
        }
    }

    public static OpenSSLX509Certificate fromX509DerInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long d2i_X509_bio = NativeCrypto.d2i_X509_bio(openSSLBIOInputStream.getBioContext());
                return d2i_X509_bio == 0 ? null : new OpenSSLX509Certificate(d2i_X509_bio);
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    public static OpenSSLX509Certificate fromX509PemInputStream(InputStream inputStream) {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long PEM_read_bio_X509 = NativeCrypto.PEM_read_bio_X509(openSSLBIOInputStream.getBioContext());
                return PEM_read_bio_X509 == 0 ? null : new OpenSSLX509Certificate(PEM_read_bio_X509);
            } catch (Exception e) {
                throw new OpenSSLX509CertificateFactory.ParsingException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    private static Date toDate(long j) {
        Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        calendar.set(14, 0);
        NativeCrypto.ASN1_TIME_to_Calendar(j, calendar);
        return calendar.getTime();
    }

    private void verifyInternal(PublicKey publicKey, String str) {
        Signature signature = str == null ? Signature.getInstance(getSigAlgName()) : Signature.getInstance(getSigAlgName(), str);
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("signature did not verify");
        }
    }

    private void verifyOpenSSL(OpenSSLKey openSSLKey) {
        try {
            NativeCrypto.X509_verify(this.mContext, this, openSSLKey.getNativeRef());
        } catch (RuntimeException e) {
            throw new CertificateException(e);
        } catch (BadPaddingException e2) {
            e = e2;
            throw new SignatureException(e);
        } catch (IllegalBlockSizeException e3) {
            e = e3;
            throw new SignatureException(e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() {
        checkValidity(new Date());
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (!(obj instanceof OpenSSLX509Certificate)) {
            return super.equals(obj);
        }
        OpenSSLX509Certificate openSSLX509Certificate = (OpenSSLX509Certificate) obj;
        return NativeCrypto.X509_cmp(this.mContext, this, openSSLX509Certificate.mContext, openSSLX509Certificate) == 0;
    }

    protected void finalize() {
        try {
            long j = this.mContext;
            if (j != 0) {
                this.mContext = 0L;
                NativeCrypto.X509_free(j, this);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        if ((NativeCrypto.get_X509_ex_flags(this.mContext, this) & 16) == 0) {
            return -1;
        }
        int i = NativeCrypto.get_X509_ex_pathlen(this.mContext, this);
        if (i == -1) {
            return Integer.MAX_VALUE;
        }
        return i;
    }

    public long getContext() {
        return this.mContext;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_ext_oids(this.mContext, this, 1);
        if (strArr.length == 0 && NativeCrypto.get_X509_ext_oids(this.mContext, this, 0).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        return NativeCrypto.i2d_X509(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() {
        String[] strArr = NativeCrypto.get_X509_ex_xkusage(this.mContext, this);
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return NativeCrypto.X509_get_ext_oid(this.mContext, this, str);
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() {
        return alternativeNameArrayToList(NativeCrypto.get_X509_GENERAL_NAME_stack(this.mContext, this, 2));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return getIssuerX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return NativeCrypto.get_X509_issuerUID(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        return new X500Principal(NativeCrypto.X509_get_issuer_name(this.mContext, this));
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        boolean[] zArr = NativeCrypto.get_X509_ex_kusage(this.mContext, this);
        if (zArr == null) {
            return null;
        }
        int length = zArr.length;
        if (length >= 9) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[9];
        System.arraycopy(zArr, 0, zArr2, 0, length);
        return zArr2;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_ext_oids(this.mContext, this, 0);
        if (strArr.length == 0 && NativeCrypto.get_X509_ext_oids(this.mContext, this, 1).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return (Date) this.notAfter.clone();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return (Date) this.notBefore.clone();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return new OpenSSLKey(NativeCrypto.X509_get_pubkey(this.mContext, this)).getPublicKey();
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            String str = NativeCrypto.get_X509_pubkey_oid(this.mContext, this);
            byte[] i2d_X509_PUBKEY = NativeCrypto.i2d_X509_PUBKEY(this.mContext, this);
            try {
                return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(i2d_X509_PUBKEY));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException unused2) {
                return new X509PublicKey(str, i2d_X509_PUBKEY);
            }
        }
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return new BigInteger(NativeCrypto.X509_get_serialNumber(this.mContext, this));
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        String sigAlgOID = getSigAlgOID();
        String oidToAlgorithmName = OidData.oidToAlgorithmName(sigAlgOID);
        if (oidToAlgorithmName != null) {
            return oidToAlgorithmName;
        }
        String oidToAlgorithmName2 = Platform.oidToAlgorithmName(sigAlgOID);
        return oidToAlgorithmName2 != null ? oidToAlgorithmName2 : sigAlgOID;
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return NativeCrypto.get_X509_sig_alg_oid(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return NativeCrypto.get_X509_sig_alg_parameter(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return NativeCrypto.get_X509_signature(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() {
        return alternativeNameArrayToList(NativeCrypto.get_X509_GENERAL_NAME_stack(this.mContext, this, 1));
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return getSubjectX500Principal();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return NativeCrypto.get_X509_subjectUID(this.mContext, this);
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        return new X500Principal(NativeCrypto.X509_get_subject_name(this.mContext, this));
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() {
        return NativeCrypto.get_X509_tbs_cert(this.mContext, this);
    }

    public byte[] getTBSCertificateWithoutExtension(String str) {
        return NativeCrypto.get_X509_tbs_cert_without_ext(this.mContext, this, str);
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return ((int) NativeCrypto.X509_get_version(this.mContext, this)) + 1;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return (NativeCrypto.get_X509_ex_flags(this.mContext, this) & 512) != 0;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        Integer num = this.mHashCode;
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(super.hashCode());
        this.mHashCode = valueOf;
        return valueOf.intValue();
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long create_BIO_OutputStream = NativeCrypto.create_BIO_OutputStream(byteArrayOutputStream);
        try {
            NativeCrypto.X509_print_ex(create_BIO_OutputStream, this.mContext, this, 0L, 0L);
            return byteArrayOutputStream.toString();
        } finally {
            NativeCrypto.BIO_free_all(create_BIO_OutputStream);
        }
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) {
        if (publicKey instanceof OpenSSLKeyHolder) {
            verifyOpenSSL(((OpenSSLKeyHolder) publicKey).getOpenSSLKey());
        } else {
            verifyInternal(publicKey, null);
        }
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) {
        if (getNotBefore().compareTo(date) > 0) {
            throw new CertificateNotYetValidException("Certificate not valid until " + getNotBefore().toString() + " (compared to " + date.toString() + ")");
        }
        if (getNotAfter().compareTo(date) >= 0) {
            return;
        }
        throw new CertificateExpiredException("Certificate expired at " + getNotAfter().toString() + " (compared to " + date.toString() + ")");
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) {
        verifyInternal(publicKey, str);
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public void verify(PublicKey publicKey, Provider provider) {
        Signature signature;
        if ((publicKey instanceof OpenSSLKeyHolder) && (provider instanceof OpenSSLProvider)) {
            verifyOpenSSL(((OpenSSLKeyHolder) publicKey).getOpenSSLKey());
            return;
        }
        if (provider == null) {
            signature = Signature.getInstance(getSigAlgName());
        } else {
            signature = Signature.getInstance(getSigAlgName(), provider);
        }
        signature.initVerify(publicKey);
        signature.update(getTBSCertificate());
        if (!signature.verify(getSignature())) {
            throw new SignatureException("signature did not verify");
        }
    }
}
