package com.google.android.gms.org.conscrypt;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.cert.X509CRLEntry;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class OpenSSLX509CRLEntry extends X509CRLEntry {
    private final long mContext;
    private final Date revocationDate;

    public OpenSSLX509CRLEntry(long j) {
        this.mContext = j;
        this.revocationDate = OpenSSLX509CRL.toDate(NativeCrypto.get_X509_REVOKED_revocationDate(j));
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 1);
        if (strArr.length == 0 && NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 0).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() {
        return NativeCrypto.i2d_X509_REVOKED(this.mContext);
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return NativeCrypto.X509_REVOKED_get_ext_oid(this.mContext, str);
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        String[] strArr = NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 0);
        if (strArr.length == 0 && NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 1).length == 0) {
            return null;
        }
        return new HashSet(Arrays.asList(strArr));
    }

    @Override // java.security.cert.X509CRLEntry
    public Date getRevocationDate() {
        return (Date) this.revocationDate.clone();
    }

    @Override // java.security.cert.X509CRLEntry
    public BigInteger getSerialNumber() {
        return new BigInteger(NativeCrypto.X509_REVOKED_get_serialNumber(this.mContext));
    }

    @Override // java.security.cert.X509CRLEntry
    public boolean hasExtensions() {
        return (NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 0).length == 0 && NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 1).length == 0) ? false : true;
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        for (String str : NativeCrypto.get_X509_REVOKED_ext_oids(this.mContext, 1)) {
            if (NativeCrypto.X509_supported_extension(NativeCrypto.X509_REVOKED_get_ext(this.mContext, str)) != 1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.X509CRLEntry
    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long create_BIO_OutputStream = NativeCrypto.create_BIO_OutputStream(byteArrayOutputStream);
        try {
            NativeCrypto.X509_REVOKED_print(create_BIO_OutputStream, this.mContext);
            return byteArrayOutputStream.toString();
        } finally {
            NativeCrypto.BIO_free_all(create_BIO_OutputStream);
        }
    }
}
