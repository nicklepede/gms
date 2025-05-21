package com.google.android.gms.org.conscrypt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
abstract class NativeRef {
    final long address;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class CMAC_CTX extends NativeRef {
        public CMAC_CTX(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.CMAC_CTX_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EC_GROUP extends NativeRef {
        public EC_GROUP(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EC_GROUP_clear_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EC_POINT extends NativeRef {
        public EC_POINT(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EC_POINT_clear_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EVP_CIPHER_CTX extends NativeRef {
        public EVP_CIPHER_CTX(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_CIPHER_CTX_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EVP_HPKE_CTX extends NativeRef {
        public EVP_HPKE_CTX(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_HPKE_CTX_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EVP_MD_CTX extends NativeRef {
        public EVP_MD_CTX(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_MD_CTX_destroy(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EVP_PKEY extends NativeRef {
        public EVP_PKEY(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_PKEY_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class EVP_PKEY_CTX extends NativeRef {
        public EVP_PKEY_CTX(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.EVP_PKEY_CTX_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class HMAC_CTX extends NativeRef {
        public HMAC_CTX(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.HMAC_CTX_free(j);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    final class SSL_SESSION extends NativeRef {
        public SSL_SESSION(long j) {
            super(j);
        }

        @Override // com.google.android.gms.org.conscrypt.NativeRef
        public void doFree(long j) {
            NativeCrypto.SSL_SESSION_free(j);
        }
    }

    public NativeRef(long j) {
        if (j == 0) {
            throw new NullPointerException("address == 0");
        }
        this.address = j;
    }

    public abstract void doFree(long j);

    public boolean equals(Object obj) {
        return (obj instanceof NativeRef) && ((NativeRef) obj).address == this.address;
    }

    protected void finalize() {
        try {
            long j = this.address;
            if (j != 0) {
                doFree(j);
            }
        } finally {
            super.finalize();
        }
    }

    public int hashCode() {
        return NativeRef$$ExternalSyntheticBackport0.m(this.address);
    }

    public boolean isNull() {
        return this.address == 0;
    }
}
