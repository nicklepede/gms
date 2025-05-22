package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import defpackage.a;
import j$.util.Objects;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.BadPaddingException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class HpkeImpl implements HpkeSpi {
    private NativeRef.EVP_HPKE_CTX ctx;
    private byte[] encapsulated = null;
    private final HpkeSuite hpkeSuite;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class X25519_AES_128 extends HpkeImpl {
        public X25519_AES_128() {
            super(new HpkeSuite(32, 1, 1));
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class X25519_AES_256 extends HpkeImpl {
        public X25519_AES_256() {
            super(new HpkeSuite(32, 1, 2));
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class X25519_CHACHA20 extends HpkeImpl {
        public X25519_CHACHA20() {
            super(new HpkeSuite(32, 1, 3));
        }
    }

    public HpkeImpl(HpkeSuite hpkeSuite) {
        this.hpkeSuite = hpkeSuite;
    }

    private void checkArgumentsForBaseModeOnly(Key key, byte[] bArr, byte[] bArr2) {
        if (key != null) {
            throw new UnsupportedOperationException("Asymmetric authentication not supported");
        }
        Objects.requireNonNull(bArr);
        Objects.requireNonNull(bArr2);
        if (bArr.length > 0 || bArr2.length > 0) {
            throw new UnsupportedOperationException("PSK authentication not supported");
        }
    }

    private void checkInitialised() {
        if (this.ctx == null) {
            throw new IllegalStateException("Not initialised");
        }
    }

    private void checkIsRecipient() {
        checkInitialised();
        if (this.encapsulated != null) {
            throw new IllegalStateException("Internal error");
        }
    }

    private void checkIsSender() {
        checkInitialised();
        if (this.encapsulated == null) {
            throw new IllegalStateException("Internal error");
        }
    }

    private void checkNotInitialised() {
        if (this.ctx != null) {
            throw new IllegalStateException("Already initialised");
        }
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public byte[] engineExport(int i, byte[] bArr) {
        checkInitialised();
        long maxExportLength = this.hpkeSuite.getKdf().maxExportLength();
        if (i >= 0 && i <= maxExportLength) {
            return NativeCrypto.EVP_HPKE_CTX_export(this.ctx, bArr, i);
        }
        throw new IllegalArgumentException("Export length must be between 0 and " + maxExportLength + ", but was " + i);
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public void engineInitRecipient(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey, byte[] bArr3, byte[] bArr4) {
        checkNotInitialised();
        checkArgumentsForBaseModeOnly(publicKey, bArr3, bArr4);
        Preconditions.checkNotNull(bArr, "null encapsulated data");
        HpkeSuite hpkeSuite = this.hpkeSuite;
        int length = bArr.length;
        if (length != hpkeSuite.getKem().getEncapsulatedLength()) {
            throw new InvalidKeyException(a.j(length, "Invalid encapsulated length: "));
        }
        if (privateKey == null) {
            throw new InvalidKeyException("null recipient key");
        }
        if (!(privateKey instanceof OpenSSLX25519PrivateKey)) {
            throw new InvalidKeyException("Unsupported recipient key class: ".concat(String.valueOf(String.valueOf(privateKey.getClass()))));
        }
        this.ctx = (NativeRef.EVP_HPKE_CTX) NativeCrypto.EVP_HPKE_CTX_setup_base_mode_recipient(this.hpkeSuite, ((OpenSSLX25519PrivateKey) privateKey).getU(), bArr, bArr2);
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public void engineInitSender(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3) {
        checkNotInitialised();
        checkArgumentsForBaseModeOnly(privateKey, bArr2, bArr3);
        if (publicKey == null) {
            throw new InvalidKeyException("null recipient key");
        }
        if (!(publicKey instanceof OpenSSLX25519PublicKey)) {
            throw new InvalidKeyException("Unsupported recipient key class: ".concat(String.valueOf(String.valueOf(publicKey.getClass()))));
        }
        Object[] EVP_HPKE_CTX_setup_base_mode_sender = NativeCrypto.EVP_HPKE_CTX_setup_base_mode_sender(this.hpkeSuite, ((OpenSSLX25519PublicKey) publicKey).getU(), bArr);
        this.ctx = (NativeRef.EVP_HPKE_CTX) EVP_HPKE_CTX_setup_base_mode_sender[0];
        this.encapsulated = (byte[]) EVP_HPKE_CTX_setup_base_mode_sender[1];
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public void engineInitSenderForTesting(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        checkNotInitialised();
        Objects.requireNonNull(bArr4);
        checkArgumentsForBaseModeOnly(privateKey, bArr2, bArr3);
        if (publicKey == null) {
            throw new InvalidKeyException("null recipient key");
        }
        if (!(publicKey instanceof OpenSSLX25519PublicKey)) {
            throw new InvalidKeyException("Unsupported recipient key class: ".concat(String.valueOf(String.valueOf(publicKey.getClass()))));
        }
        Object[] EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing = NativeCrypto.EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing(this.hpkeSuite, ((OpenSSLX25519PublicKey) publicKey).getU(), bArr, bArr4);
        this.ctx = (NativeRef.EVP_HPKE_CTX) EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing[0];
        this.encapsulated = (byte[]) EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing[1];
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public byte[] engineOpen(byte[] bArr, byte[] bArr2) {
        checkIsRecipient();
        Preconditions.checkNotNull(bArr, "null ciphertext");
        try {
            return NativeCrypto.EVP_HPKE_CTX_open(this.ctx, bArr, bArr2);
        } catch (BadPaddingException e) {
            throw new HpkeDecryptException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public byte[] engineSeal(byte[] bArr, byte[] bArr2) {
        checkIsSender();
        Preconditions.checkNotNull(bArr, "null plaintext");
        return NativeCrypto.EVP_HPKE_CTX_seal(this.ctx, bArr, bArr2);
    }

    @Override // com.google.android.gms.org.conscrypt.HpkeSpi
    public byte[] getEncapsulated() {
        checkIsSender();
        return this.encapsulated;
    }
}
