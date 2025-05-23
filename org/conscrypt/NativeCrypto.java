package com.google.android.gms.org.conscrypt;

import com.google.android.gms.org.conscrypt.NativeRef;
import defpackage.a;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NativeCrypto {
    static final String[] DEFAULT_PSK_CIPHER_SUITES;
    static final String[] DEFAULT_SPAKE_CIPHER_SUITES;
    static final String[] DEFAULT_X509_CIPHER_SUITES;
    static final String DEPRECATED_PROTOCOL_TLSV1 = "TLSv1";
    static final String DEPRECATED_PROTOCOL_TLSV1_1 = "TLSv1.1";
    static final int EXTENSION_TYPE_CRITICAL = 1;
    static final int EXTENSION_TYPE_NON_CRITICAL = 0;
    static final int GN_STACK_ISSUER_ALT_NAME = 2;
    static final int GN_STACK_SUBJECT_ALT_NAME = 1;
    private static final boolean HAS_AES_HARDWARE;
    static final String OBSOLETE_PROTOCOL_SSLV3 = "SSLv3";
    static final int PKCS7_CERTS = 1;
    static final int PKCS7_CRLS = 2;
    private static final Set SUPPORTED_LEGACY_CIPHER_SUITES_SET;
    private static final String SUPPORTED_PROTOCOL_TLSV1_2 = "TLSv1.2";
    static final String SUPPORTED_PROTOCOL_TLSV1_3 = "TLSv1.3";
    private static final String[] SUPPORTED_TLS_1_2_CIPHER_SUITES;
    static final Set SUPPORTED_TLS_1_2_CIPHER_SUITES_SET;
    static final String[] SUPPORTED_TLS_1_3_CIPHER_SUITES;
    static final Set SUPPORTED_TLS_1_3_CIPHER_SUITES_SET;
    static final String[] TLSV11_PROTOCOLS;
    static final String[] TLSV1_PROTOCOLS;
    static final String TLS_EMPTY_RENEGOTIATION_INFO_SCSV = "TLS_EMPTY_RENEGOTIATION_INFO_SCSV";
    private static final String TLS_FALLBACK_SCSV = "TLS_FALLBACK_SCSV";
    private static final UnsatisfiedLinkError loadError;
    private static String[] supportedProtocols;
    static String[] tlsv12protocols;
    static String[] tlsv13protocols;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class Range {
        public final String max;
        public final String min;

        public Range(String str, String str2) {
            this.min = str;
            this.max = str2;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    interface SSLHandshakeCallbacks {
        void clientCertificateRequested(byte[] bArr, int[] iArr, byte[][] bArr2);

        int clientPSKKeyRequested(String str, byte[] bArr, byte[] bArr2);

        void onNewSessionEstablished(long j);

        void onSSLStateChange(int i, int i2);

        int selectApplicationProtocol(byte[] bArr);

        void serverCertificateRequested();

        int serverPSKKeyRequested(String str, String str2, byte[] bArr);

        long serverSessionRequested(byte[] bArr);

        void verifyCertificateChain(byte[][] bArr, String str);
    }

    static {
        char c;
        char c2;
        char c3;
        char c4;
        String[] strArr;
        try {
            NativeCryptoJni.init();
            clinit();
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        loadError = e;
        setTlsV1DeprecationStatus(Platform.isTlsV1Deprecated(), Platform.isTlsV1Supported());
        String[] strArr2 = {"TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256"};
        SUPPORTED_TLS_1_3_CIPHER_SUITES = strArr2;
        SUPPORTED_TLS_1_2_CIPHER_SUITES_SET = new HashSet();
        SUPPORTED_LEGACY_CIPHER_SUITES_SET = new HashSet();
        SUPPORTED_TLS_1_3_CIPHER_SUITES_SET = new HashSet(Arrays.asList(strArr2));
        if (e == null) {
            String[] strArr3 = get_cipher_names("ALL");
            c = 7;
            int length = strArr3.length;
            if ((length & 1) != 0) {
                throw new IllegalArgumentException("Invalid cipher list returned by get_cipher_names");
            }
            int i = length >> 1;
            c2 = 6;
            SUPPORTED_TLS_1_2_CIPHER_SUITES = new String[i + 2];
            for (int i2 = 0; i2 < length; i2 += 2) {
                String cipherSuiteToJava = cipherSuiteToJava(strArr3[i2]);
                SUPPORTED_TLS_1_2_CIPHER_SUITES[i2 / 2] = cipherSuiteToJava;
                SUPPORTED_TLS_1_2_CIPHER_SUITES_SET.add(cipherSuiteToJava);
                SUPPORTED_LEGACY_CIPHER_SUITES_SET.add(strArr3[i2 + 1]);
            }
            c3 = 4;
            c4 = 5;
            String[] strArr4 = SUPPORTED_TLS_1_2_CIPHER_SUITES;
            strArr4[i] = TLS_EMPTY_RENEGOTIATION_INFO_SCSV;
            strArr4[i + 1] = TLS_FALLBACK_SCSV;
            boolean z = EVP_has_aes_hardware() == 1;
            HAS_AES_HARDWARE = z;
            if (z) {
                strArr = new String[]{"TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA"};
                DEFAULT_X509_CIPHER_SUITES = strArr;
                DEFAULT_PSK_CIPHER_SUITES = new String[]{"TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA"};
                DEFAULT_SPAKE_CIPHER_SUITES = new String[]{"TLS1_3_NAMED_PAKE_SPAKE2PLUSV1"};
                String[] strArr5 = {DEPRECATED_PROTOCOL_TLSV1, DEPRECATED_PROTOCOL_TLSV1_1, SUPPORTED_PROTOCOL_TLSV1_2};
                TLSV11_PROTOCOLS = strArr5;
                TLSV1_PROTOCOLS = strArr5;
            }
        } else {
            c = 7;
            c2 = 6;
            c3 = 4;
            c4 = 5;
            HAS_AES_HARDWARE = false;
            SUPPORTED_TLS_1_2_CIPHER_SUITES = new String[0];
        }
        strArr = new String[14];
        strArr[0] = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256";
        strArr[1] = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256";
        strArr[2] = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384";
        strArr[3] = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256";
        strArr[c3] = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256";
        strArr[c4] = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384";
        strArr[c2] = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA";
        strArr[c] = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA";
        strArr[8] = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA";
        strArr[9] = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA";
        strArr[10] = "TLS_RSA_WITH_AES_128_GCM_SHA256";
        strArr[11] = "TLS_RSA_WITH_AES_256_GCM_SHA384";
        strArr[12] = "TLS_RSA_WITH_AES_128_CBC_SHA";
        strArr[13] = "TLS_RSA_WITH_AES_256_CBC_SHA";
        DEFAULT_X509_CIPHER_SUITES = strArr;
        DEFAULT_PSK_CIPHER_SUITES = new String[]{"TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA"};
        DEFAULT_SPAKE_CIPHER_SUITES = new String[]{"TLS1_3_NAMED_PAKE_SPAKE2PLUSV1"};
        String[] strArr52 = {DEPRECATED_PROTOCOL_TLSV1, DEPRECATED_PROTOCOL_TLSV1_1, SUPPORTED_PROTOCOL_TLSV1_2};
        TLSV11_PROTOCOLS = strArr52;
        TLSV1_PROTOCOLS = strArr52;
    }

    static native void ASN1_TIME_to_Calendar(long j, Calendar calendar);

    static native byte[] ASN1_seq_pack_X509(long[] jArr);

    static native long[] ASN1_seq_unpack_X509_bio(long j);

    static native void BIO_free_all(long j);

    static native int BIO_read(long j, byte[] bArr);

    static native void BIO_write(long j, byte[] bArr, int i, int i2);

    static native void CMAC_CTX_free(long j);

    static native long CMAC_CTX_new();

    static native byte[] CMAC_Final(NativeRef.CMAC_CTX cmac_ctx);

    static native void CMAC_Init(NativeRef.CMAC_CTX cmac_ctx, byte[] bArr);

    static native void CMAC_Reset(NativeRef.CMAC_CTX cmac_ctx);

    static native void CMAC_Update(NativeRef.CMAC_CTX cmac_ctx, byte[] bArr, int i, int i2);

    static native void CMAC_UpdateDirect(NativeRef.CMAC_CTX cmac_ctx, long j, int i);

    static native int ECDH_compute_key(byte[] bArr, int i, NativeRef.EVP_PKEY evp_pkey, NativeRef.EVP_PKEY evp_pkey2);

    static native int ECDSA_sign(byte[] bArr, byte[] bArr2, NativeRef.EVP_PKEY evp_pkey);

    static native int ECDSA_size(NativeRef.EVP_PKEY evp_pkey);

    static native int ECDSA_verify(byte[] bArr, byte[] bArr2, NativeRef.EVP_PKEY evp_pkey);

    static native void EC_GROUP_clear_free(long j);

    static native byte[] EC_GROUP_get_cofactor(NativeRef.EC_GROUP ec_group);

    static native byte[][] EC_GROUP_get_curve(NativeRef.EC_GROUP ec_group);

    static native String EC_GROUP_get_curve_name(NativeRef.EC_GROUP ec_group);

    static native int EC_GROUP_get_degree(NativeRef.EC_GROUP ec_group);

    static native long EC_GROUP_get_generator(NativeRef.EC_GROUP ec_group);

    static native byte[] EC_GROUP_get_order(NativeRef.EC_GROUP ec_group);

    static native long EC_GROUP_new_arbitrary(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i);

    static native long EC_GROUP_new_by_curve_name(String str);

    static native long EC_KEY_generate_key(NativeRef.EC_GROUP ec_group);

    static native long EC_KEY_get1_group(NativeRef.EVP_PKEY evp_pkey);

    static native byte[] EC_KEY_get_private_key(NativeRef.EVP_PKEY evp_pkey);

    static native long EC_KEY_get_public_key(NativeRef.EVP_PKEY evp_pkey);

    static native byte[] EC_KEY_marshal_curve_name(NativeRef.EC_GROUP ec_group);

    static native long EC_KEY_parse_curve_name(byte[] bArr);

    static native void EC_POINT_clear_free(long j);

    static native byte[][] EC_POINT_get_affine_coordinates(NativeRef.EC_GROUP ec_group, NativeRef.EC_POINT ec_point);

    static native long EC_POINT_new(NativeRef.EC_GROUP ec_group);

    static native void EC_POINT_set_affine_coordinates(NativeRef.EC_GROUP ec_group, NativeRef.EC_POINT ec_point, byte[] bArr, byte[] bArr2);

    static native void ED25519_keypair(byte[] bArr, byte[] bArr2);

    static native int ENGINE_SSL_do_handshake(long j, NativeSsl nativeSsl, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native void ENGINE_SSL_force_read(long j, NativeSsl nativeSsl, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native int ENGINE_SSL_read_BIO_direct(long j, NativeSsl nativeSsl, long j2, long j3, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native int ENGINE_SSL_read_direct(long j, NativeSsl nativeSsl, long j2, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native void ENGINE_SSL_shutdown(long j, NativeSsl nativeSsl, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native int ENGINE_SSL_write_BIO_direct(long j, NativeSsl nativeSsl, long j2, long j3, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native int ENGINE_SSL_write_direct(long j, NativeSsl nativeSsl, long j2, int i, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native int EVP_AEAD_CTX_open(long j, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5);

    static native int EVP_AEAD_CTX_open_buf(long j, byte[] bArr, int i, ByteBuffer byteBuffer, byte[] bArr2, ByteBuffer byteBuffer2, byte[] bArr3);

    static native int EVP_AEAD_CTX_seal(long j, byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5);

    static native int EVP_AEAD_CTX_seal_buf(long j, byte[] bArr, int i, ByteBuffer byteBuffer, byte[] bArr2, ByteBuffer byteBuffer2, byte[] bArr3);

    static native int EVP_AEAD_max_overhead(long j);

    static native int EVP_AEAD_nonce_length(long j);

    static native int EVP_CIPHER_CTX_block_size(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx);

    static native void EVP_CIPHER_CTX_free(long j);

    static native long EVP_CIPHER_CTX_new();

    static native void EVP_CIPHER_CTX_set_key_length(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx, int i);

    static native void EVP_CIPHER_CTX_set_padding(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx, boolean z);

    static native int EVP_CIPHER_iv_length(long j);

    static native int EVP_CipherFinal_ex(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx, byte[] bArr, int i);

    static native void EVP_CipherInit_ex(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx, long j, byte[] bArr, byte[] bArr2, boolean z);

    static native int EVP_CipherUpdate(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    static native int EVP_DigestFinal_ex(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i);

    static native int EVP_DigestInit_ex(NativeRef.EVP_MD_CTX evp_md_ctx, long j);

    static native byte[] EVP_DigestSign(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i, int i2);

    static native byte[] EVP_DigestSignFinal(NativeRef.EVP_MD_CTX evp_md_ctx);

    static native long EVP_DigestSignInit(NativeRef.EVP_MD_CTX evp_md_ctx, long j, NativeRef.EVP_PKEY evp_pkey);

    static native void EVP_DigestSignUpdate(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i, int i2);

    static native void EVP_DigestSignUpdateDirect(NativeRef.EVP_MD_CTX evp_md_ctx, long j, int i);

    static native void EVP_DigestUpdate(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i, int i2);

    static native void EVP_DigestUpdateDirect(NativeRef.EVP_MD_CTX evp_md_ctx, long j, int i);

    static native boolean EVP_DigestVerify(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    static native boolean EVP_DigestVerifyFinal(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i, int i2);

    static native long EVP_DigestVerifyInit(NativeRef.EVP_MD_CTX evp_md_ctx, long j, NativeRef.EVP_PKEY evp_pkey);

    static native void EVP_DigestVerifyUpdate(NativeRef.EVP_MD_CTX evp_md_ctx, byte[] bArr, int i, int i2);

    static native void EVP_DigestVerifyUpdateDirect(NativeRef.EVP_MD_CTX evp_md_ctx, long j, int i);

    static native byte[] EVP_HPKE_CTX_export(NativeRef.EVP_HPKE_CTX evp_hpke_ctx, byte[] bArr, int i);

    static native void EVP_HPKE_CTX_free(long j);

    static native byte[] EVP_HPKE_CTX_open(NativeRef.EVP_HPKE_CTX evp_hpke_ctx, byte[] bArr, byte[] bArr2);

    static native byte[] EVP_HPKE_CTX_seal(NativeRef.EVP_HPKE_CTX evp_hpke_ctx, byte[] bArr, byte[] bArr2);

    static native Object EVP_HPKE_CTX_setup_base_mode_recipient(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3);

    static Object EVP_HPKE_CTX_setup_base_mode_recipient(HpkeSuite hpkeSuite, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return EVP_HPKE_CTX_setup_base_mode_recipient(hpkeSuite.getKem().getId(), hpkeSuite.getKdf().getId(), hpkeSuite.getAead().getId(), bArr, bArr2, bArr3);
    }

    static native Object[] EVP_HPKE_CTX_setup_base_mode_sender(int i, int i2, int i3, byte[] bArr, byte[] bArr2);

    static Object[] EVP_HPKE_CTX_setup_base_mode_sender(HpkeSuite hpkeSuite, byte[] bArr, byte[] bArr2) {
        return EVP_HPKE_CTX_setup_base_mode_sender(hpkeSuite.getKem().getId(), hpkeSuite.getKdf().getId(), hpkeSuite.getAead().getId(), bArr, bArr2);
    }

    static native Object[] EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing(int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3);

    static Object[] EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing(HpkeSuite hpkeSuite, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return EVP_HPKE_CTX_setup_base_mode_sender_with_seed_for_testing(hpkeSuite.getKem().getId(), hpkeSuite.getKdf().getId(), hpkeSuite.getAead().getId(), bArr, bArr2, bArr3);
    }

    static native void EVP_MD_CTX_cleanup(NativeRef.EVP_MD_CTX evp_md_ctx);

    static native int EVP_MD_CTX_copy_ex(NativeRef.EVP_MD_CTX evp_md_ctx, NativeRef.EVP_MD_CTX evp_md_ctx2);

    static native long EVP_MD_CTX_create();

    static native void EVP_MD_CTX_destroy(long j);

    static native int EVP_MD_size(long j);

    static native void EVP_PKEY_CTX_free(long j);

    static native void EVP_PKEY_CTX_set_rsa_mgf1_md(long j, long j2);

    static native void EVP_PKEY_CTX_set_rsa_oaep_label(long j, byte[] bArr);

    static native void EVP_PKEY_CTX_set_rsa_oaep_md(long j, long j2);

    static native void EVP_PKEY_CTX_set_rsa_padding(long j, int i);

    static native void EVP_PKEY_CTX_set_rsa_pss_saltlen(long j, int i);

    static native int EVP_PKEY_cmp(NativeRef.EVP_PKEY evp_pkey, NativeRef.EVP_PKEY evp_pkey2);

    static native int EVP_PKEY_decrypt(NativeRef.EVP_PKEY_CTX evp_pkey_ctx, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    static native long EVP_PKEY_decrypt_init(NativeRef.EVP_PKEY evp_pkey);

    static native int EVP_PKEY_encrypt(NativeRef.EVP_PKEY_CTX evp_pkey_ctx, byte[] bArr, int i, byte[] bArr2, int i2, int i3);

    static native long EVP_PKEY_encrypt_init(NativeRef.EVP_PKEY evp_pkey);

    static native void EVP_PKEY_free(long j);

    static native long EVP_PKEY_new_EC_KEY(NativeRef.EC_GROUP ec_group, NativeRef.EC_POINT ec_point, byte[] bArr);

    static native long EVP_PKEY_new_RSA(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8);

    static native String EVP_PKEY_print_params(NativeRef.EVP_PKEY evp_pkey);

    static native String EVP_PKEY_print_public(NativeRef.EVP_PKEY evp_pkey);

    static native int EVP_PKEY_type(NativeRef.EVP_PKEY evp_pkey);

    static native long EVP_aead_aes_128_gcm();

    static native long EVP_aead_aes_128_gcm_siv();

    static native long EVP_aead_aes_256_gcm();

    static native long EVP_aead_aes_256_gcm_siv();

    static native long EVP_aead_chacha20_poly1305();

    static native long EVP_get_cipherbyname(String str);

    static native long EVP_get_digestbyname(String str);

    static native int EVP_has_aes_hardware();

    static native byte[] EVP_marshal_private_key(NativeRef.EVP_PKEY evp_pkey);

    static native byte[] EVP_marshal_public_key(NativeRef.EVP_PKEY evp_pkey);

    static native long EVP_parse_private_key(byte[] bArr);

    static native long EVP_parse_public_key(byte[] bArr);

    static native byte[] EVP_raw_X25519_private_key(byte[] bArr);

    static native void HMAC_CTX_free(long j);

    static native long HMAC_CTX_new();

    static native byte[] HMAC_Final(NativeRef.HMAC_CTX hmac_ctx);

    static native void HMAC_Init_ex(NativeRef.HMAC_CTX hmac_ctx, byte[] bArr, long j);

    static native void HMAC_Reset(NativeRef.HMAC_CTX hmac_ctx);

    static native void HMAC_Update(NativeRef.HMAC_CTX hmac_ctx, byte[] bArr, int i, int i2);

    static native void HMAC_UpdateDirect(NativeRef.HMAC_CTX hmac_ctx, long j, int i);

    static native byte[] MLDSA65_public_key_from_seed(byte[] bArr);

    static native byte[] MLDSA65_sign(byte[] bArr, byte[] bArr2);

    static native int MLDSA65_verify(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static native long[] PEM_read_bio_PKCS7(long j, int i);

    static native long PEM_read_bio_PUBKEY(long j);

    static native long PEM_read_bio_PrivateKey(long j);

    static native long PEM_read_bio_X509(long j);

    static native long PEM_read_bio_X509_CRL(long j);

    static native void RAND_bytes(byte[] bArr);

    static native long RSA_generate_key_ex(int i, byte[] bArr);

    static native int RSA_private_decrypt(int i, byte[] bArr, byte[] bArr2, NativeRef.EVP_PKEY evp_pkey, int i2);

    static native int RSA_private_encrypt(int i, byte[] bArr, byte[] bArr2, NativeRef.EVP_PKEY evp_pkey, int i2);

    static native int RSA_public_decrypt(int i, byte[] bArr, byte[] bArr2, NativeRef.EVP_PKEY evp_pkey, int i2);

    static native int RSA_public_encrypt(int i, byte[] bArr, byte[] bArr2, NativeRef.EVP_PKEY evp_pkey, int i2);

    static native int RSA_size(NativeRef.EVP_PKEY evp_pkey);

    static native void SLHDSA_SHA2_128S_generate_key(byte[] bArr, byte[] bArr2);

    static native byte[] SLHDSA_SHA2_128S_sign(byte[] bArr, byte[] bArr2);

    static native int SLHDSA_SHA2_128S_verify(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static native long SSL_BIO_new(long j, NativeSsl nativeSsl);

    static native String SSL_CIPHER_get_kx_name(long j);

    static native void SSL_CTX_free(long j, AbstractSessionContext abstractSessionContext);

    static native long SSL_CTX_new();

    static native void SSL_CTX_set_session_id_context(long j, AbstractSessionContext abstractSessionContext, byte[] bArr);

    static native void SSL_CTX_set_spake_credential(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, int i, long j, AbstractSessionContext abstractSessionContext);

    static native long SSL_CTX_set_timeout(long j, AbstractSessionContext abstractSessionContext, long j2);

    static native String SSL_SESSION_cipher(long j);

    static native void SSL_SESSION_free(long j);

    static native long SSL_SESSION_get_time(long j);

    static native long SSL_SESSION_get_timeout(long j);

    static native String SSL_SESSION_get_version(long j);

    static native byte[] SSL_SESSION_session_id(long j);

    static native boolean SSL_SESSION_should_be_single_use(long j);

    static native void SSL_SESSION_up_ref(long j);

    static native void SSL_accept_renegotiations(long j, NativeSsl nativeSsl);

    static native void SSL_clear_error();

    static native long SSL_clear_mode(long j, NativeSsl nativeSsl, long j2);

    static native long SSL_clear_options(long j, NativeSsl nativeSsl, long j2);

    static native void SSL_do_handshake(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks, int i);

    static native void SSL_enable_ocsp_stapling(long j, NativeSsl nativeSsl);

    static native void SSL_enable_signed_cert_timestamps(long j, NativeSsl nativeSsl);

    static native void SSL_enable_tls_channel_id(long j, NativeSsl nativeSsl);

    static native byte[] SSL_export_keying_material(long j, NativeSsl nativeSsl, byte[] bArr, byte[] bArr2, int i);

    static native void SSL_free(long j, NativeSsl nativeSsl);

    static native byte[][] SSL_get0_peer_certificates(long j, NativeSsl nativeSsl);

    static native long SSL_get1_session(long j, NativeSsl nativeSsl);

    static native long[] SSL_get_ciphers(long j, NativeSsl nativeSsl);

    public static native String SSL_get_current_cipher(long j, NativeSsl nativeSsl);

    static native int SSL_get_error(long j, NativeSsl nativeSsl, int i);

    static native long SSL_get_mode(long j, NativeSsl nativeSsl);

    static native byte[] SSL_get_ocsp_response(long j, NativeSsl nativeSsl);

    static native long SSL_get_options(long j, NativeSsl nativeSsl);

    static native String SSL_get_servername(long j, NativeSsl nativeSsl);

    static native int SSL_get_shutdown(long j, NativeSsl nativeSsl);

    static native int SSL_get_signature_algorithm_key_type(int i);

    static native byte[] SSL_get_signed_cert_timestamp_list(long j, NativeSsl nativeSsl);

    static native long SSL_get_time(long j, NativeSsl nativeSsl);

    static native long SSL_get_timeout(long j, NativeSsl nativeSsl);

    static native byte[] SSL_get_tls_channel_id(long j, NativeSsl nativeSsl);

    static native byte[] SSL_get_tls_unique(long j, NativeSsl nativeSsl);

    public static native String SSL_get_version(long j, NativeSsl nativeSsl);

    static native void SSL_interrupt(long j, NativeSsl nativeSsl);

    static native int SSL_max_seal_overhead(long j, NativeSsl nativeSsl);

    static native long SSL_new(long j, AbstractSessionContext abstractSessionContext);

    static native int SSL_pending_readable_bytes(long j, NativeSsl nativeSsl);

    static native int SSL_pending_written_bytes_in_BIO(long j);

    static native int SSL_read(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks, byte[] bArr, int i, int i2, int i3);

    static native byte[] SSL_session_id(long j, NativeSsl nativeSsl);

    static native boolean SSL_session_reused(long j, NativeSsl nativeSsl);

    static native void SSL_set1_tls_channel_id(long j, NativeSsl nativeSsl, NativeRef.EVP_PKEY evp_pkey);

    static native void SSL_set_accept_state(long j, NativeSsl nativeSsl);

    static native void SSL_set_cipher_lists(long j, NativeSsl nativeSsl, String[] strArr);

    static native void SSL_set_client_CA_list(long j, NativeSsl nativeSsl, byte[][] bArr);

    static native void SSL_set_connect_state(long j, NativeSsl nativeSsl);

    static native long SSL_set_mode(long j, NativeSsl nativeSsl, long j2);

    static native void SSL_set_ocsp_response(long j, NativeSsl nativeSsl, byte[] bArr);

    static native long SSL_set_options(long j, NativeSsl nativeSsl, long j2);

    static native int SSL_set_protocol_versions(long j, NativeSsl nativeSsl, int i, int i2);

    static native void SSL_set_session(long j, NativeSsl nativeSsl, long j2);

    static native void SSL_set_session_creation_enabled(long j, NativeSsl nativeSsl, boolean z);

    static native void SSL_set_signed_cert_timestamp_list(long j, NativeSsl nativeSsl, byte[] bArr);

    static native long SSL_set_timeout(long j, NativeSsl nativeSsl, long j2);

    static native void SSL_set_tlsext_host_name(long j, NativeSsl nativeSsl, String str);

    static native void SSL_set_verify(long j, NativeSsl nativeSsl, int i);

    static native void SSL_shutdown(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks);

    static native void SSL_use_psk_identity_hint(long j, NativeSsl nativeSsl, String str);

    static native void SSL_write(long j, NativeSsl nativeSsl, FileDescriptor fileDescriptor, SSLHandshakeCallbacks sSLHandshakeCallbacks, byte[] bArr, int i, int i2, int i3);

    static native byte[] Scrypt_generate_key(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4);

    static native boolean X25519(byte[] bArr, byte[] bArr2, byte[] bArr3);

    static native void X25519_keypair(byte[] bArr, byte[] bArr2);

    static native void X509_CRL_free(long j, OpenSSLX509CRL openSSLX509CRL);

    static native long X509_CRL_get0_by_cert(long j, OpenSSLX509CRL openSSLX509CRL, long j2, OpenSSLX509Certificate openSSLX509Certificate);

    static native long X509_CRL_get0_by_serial(long j, OpenSSLX509CRL openSSLX509CRL, byte[] bArr);

    static native long[] X509_CRL_get_REVOKED(long j, OpenSSLX509CRL openSSLX509CRL);

    static native long X509_CRL_get_ext(long j, OpenSSLX509CRL openSSLX509CRL, String str);

    static native byte[] X509_CRL_get_ext_oid(long j, OpenSSLX509CRL openSSLX509CRL, String str);

    static native byte[] X509_CRL_get_issuer_name(long j, OpenSSLX509CRL openSSLX509CRL);

    static native long X509_CRL_get_lastUpdate(long j, OpenSSLX509CRL openSSLX509CRL);

    static native long X509_CRL_get_nextUpdate(long j, OpenSSLX509CRL openSSLX509CRL);

    static native long X509_CRL_get_version(long j, OpenSSLX509CRL openSSLX509CRL);

    static native void X509_CRL_print(long j, long j2, OpenSSLX509CRL openSSLX509CRL);

    static native void X509_CRL_verify(long j, OpenSSLX509CRL openSSLX509CRL, NativeRef.EVP_PKEY evp_pkey);

    static int X509_NAME_hash(X500Principal x500Principal) {
        return X509_NAME_hash(x500Principal, "SHA1");
    }

    public static int X509_NAME_hash_old(X500Principal x500Principal) {
        return X509_NAME_hash(x500Principal, "MD5");
    }

    static native long X509_REVOKED_dup(long j);

    static native long X509_REVOKED_get_ext(long j, String str);

    static native byte[] X509_REVOKED_get_ext_oid(long j, String str);

    static native byte[] X509_REVOKED_get_serialNumber(long j);

    static native void X509_REVOKED_print(long j, long j2);

    static native int X509_check_issued(long j, OpenSSLX509Certificate openSSLX509Certificate, long j2, OpenSSLX509Certificate openSSLX509Certificate2);

    static native int X509_cmp(long j, OpenSSLX509Certificate openSSLX509Certificate, long j2, OpenSSLX509Certificate openSSLX509Certificate2);

    static native void X509_free(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] X509_get_ext_oid(long j, OpenSSLX509Certificate openSSLX509Certificate, String str);

    static native byte[] X509_get_issuer_name(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native long X509_get_notAfter(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native long X509_get_notBefore(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native long X509_get_pubkey(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] X509_get_serialNumber(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] X509_get_subject_name(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native long X509_get_version(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native void X509_print_ex(long j, long j2, OpenSSLX509Certificate openSSLX509Certificate, long j3, long j4);

    static native int X509_supported_extension(long j);

    static native void X509_verify(long j, OpenSSLX509Certificate openSSLX509Certificate, NativeRef.EVP_PKEY evp_pkey);

    static native void asn1_read_free(long j);

    static native long asn1_read_init(byte[] bArr);

    static native boolean asn1_read_is_empty(long j);

    static native boolean asn1_read_next_tag_is(long j, int i);

    static native void asn1_read_null(long j);

    static native byte[] asn1_read_octetstring(long j);

    static native String asn1_read_oid(long j);

    static native long asn1_read_sequence(long j);

    static native long asn1_read_tagged(long j);

    static native long asn1_read_uint64(long j);

    static native void asn1_write_cleanup(long j);

    static native byte[] asn1_write_finish(long j);

    static native void asn1_write_flush(long j);

    static native void asn1_write_free(long j);

    static native long asn1_write_init();

    static native void asn1_write_null(long j);

    static native void asn1_write_octetstring(long j, byte[] bArr);

    static native void asn1_write_oid(long j, String str);

    static native long asn1_write_sequence(long j);

    static native long asn1_write_tag(long j, int i);

    static native void asn1_write_uint64(long j, long j2);

    static native void chacha20_encrypt_decrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, byte[] bArr4, int i4);

    static void checkAvailability() {
        UnsatisfiedLinkError unsatisfiedLinkError = loadError;
        if (unsatisfiedLinkError != null) {
            throw unsatisfiedLinkError;
        }
    }

    static String[] checkEnabledCipherSuites(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("cipherSuites == null");
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str == null) {
                throw new IllegalArgumentException(a.l(i, "cipherSuites[", "] == null"));
            }
            if (!str.equals(TLS_EMPTY_RENEGOTIATION_INFO_SCSV) && !strArr[i].equals(TLS_FALLBACK_SCSV) && !SUPPORTED_TLS_1_2_CIPHER_SUITES_SET.contains(strArr[i]) && !DEFAULT_SPAKE_CIPHER_SUITES[0].equals(strArr[i]) && !SUPPORTED_LEGACY_CIPHER_SUITES_SET.contains(strArr[i])) {
                throw new IllegalArgumentException("cipherSuite " + strArr[i] + " is not supported.");
            }
        }
        return strArr;
    }

    static String[] checkEnabledProtocols(String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        for (String str : strArr) {
            if (str == null) {
                throw new IllegalArgumentException("protocols contains null");
            }
            if (!Arrays.asList(supportedProtocols).contains(str)) {
                throw new IllegalArgumentException(a.a(str, "protocol ", " is not supported"));
            }
        }
        return strArr;
    }

    static String cipherSuiteFromJava(String str) {
        return "SSL_RSA_WITH_3DES_EDE_CBC_SHA".equals(str) ? "TLS_RSA_WITH_3DES_EDE_CBC_SHA" : str;
    }

    static String cipherSuiteToJava(String str) {
        return "TLS_RSA_WITH_3DES_EDE_CBC_SHA".equals(str) ? "SSL_RSA_WITH_3DES_EDE_CBC_SHA" : str;
    }

    private static native void clinit();

    static native long create_BIO_InputStream(OpenSSLBIOInputStream openSSLBIOInputStream, boolean z);

    static native long create_BIO_OutputStream(OutputStream outputStream);

    static native long[] d2i_PKCS7_bio(long j, int i);

    static native long d2i_SSL_SESSION(byte[] bArr);

    static native long d2i_X509(byte[] bArr);

    static native long d2i_X509_CRL_bio(long j);

    static native long d2i_X509_bio(long j);

    static native byte[] getApplicationProtocol(long j, NativeSsl nativeSsl);

    public static String[] getDefaultProtocols() {
        return (String[]) tlsv13protocols.clone();
    }

    static native long getDirectBufferAddress(Buffer buffer);

    static native long getECPrivateKeyWrapper(PrivateKey privateKey, NativeRef.EC_GROUP ec_group);

    private static int getProtocolConstant(String str) {
        if (str.equals(DEPRECATED_PROTOCOL_TLSV1)) {
            return 769;
        }
        if (str.equals(DEPRECATED_PROTOCOL_TLSV1_1)) {
            return 770;
        }
        if (str.equals(SUPPORTED_PROTOCOL_TLSV1_2)) {
            return 771;
        }
        if (str.equals(SUPPORTED_PROTOCOL_TLSV1_3)) {
            return 772;
        }
        throw new AssertionError("Unknown protocol encountered: ".concat(String.valueOf(str)));
    }

    private static Range getProtocolRange(String[] strArr) {
        List asList = Arrays.asList(strArr);
        int i = 0;
        String str = null;
        String str2 = null;
        while (true) {
            String[] strArr2 = supportedProtocols;
            if (i >= strArr2.length) {
                break;
            }
            String str3 = strArr2[i];
            if (asList.contains(str3)) {
                if (str == null) {
                    str = str3;
                }
                str2 = str3;
            } else if (str != null) {
                break;
            }
            i++;
        }
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("No protocols enabled.");
        }
        return new Range(str, str2);
    }

    static native long getRSAPrivateKeyWrapper(PrivateKey privateKey, byte[] bArr);

    static String[] getSupportedCipherSuites() {
        return SSLUtils.concat(SUPPORTED_TLS_1_3_CIPHER_SUITES, (String[]) SUPPORTED_TLS_1_2_CIPHER_SUITES.clone());
    }

    static String[] getSupportedProtocols() {
        return (String[]) supportedProtocols.clone();
    }

    static native int get_EVP_CIPHER_CTX_buf_len(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx);

    static native boolean get_EVP_CIPHER_CTX_final_used(NativeRef.EVP_CIPHER_CTX evp_cipher_ctx);

    static native byte[][] get_RSA_private_params(NativeRef.EVP_PKEY evp_pkey);

    static native byte[][] get_RSA_public_params(NativeRef.EVP_PKEY evp_pkey);

    static native byte[] get_X509_CRL_crl_enc(long j, OpenSSLX509CRL openSSLX509CRL);

    static native String[] get_X509_CRL_ext_oids(long j, OpenSSLX509CRL openSSLX509CRL, int i);

    static native String get_X509_CRL_sig_alg_oid(long j, OpenSSLX509CRL openSSLX509CRL);

    static native byte[] get_X509_CRL_sig_alg_parameter(long j, OpenSSLX509CRL openSSLX509CRL);

    static native byte[] get_X509_CRL_signature(long j, OpenSSLX509CRL openSSLX509CRL);

    static native Object[][] get_X509_GENERAL_NAME_stack(long j, OpenSSLX509Certificate openSSLX509Certificate, int i);

    static native String[] get_X509_REVOKED_ext_oids(long j, int i);

    static native long get_X509_REVOKED_revocationDate(long j);

    static native int get_X509_ex_flags(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native boolean[] get_X509_ex_kusage(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native int get_X509_ex_pathlen(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native String[] get_X509_ex_xkusage(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native String[] get_X509_ext_oids(long j, OpenSSLX509Certificate openSSLX509Certificate, int i);

    static native boolean[] get_X509_issuerUID(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native String get_X509_pubkey_oid(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native String get_X509_sig_alg_oid(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] get_X509_sig_alg_parameter(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] get_X509_signature(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native boolean[] get_X509_subjectUID(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] get_X509_tbs_cert(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] get_X509_tbs_cert_without_ext(long j, OpenSSLX509Certificate openSSLX509Certificate, String str);

    static native String[] get_cipher_names(String str);

    public static native byte[] get_ocsp_single_extension(byte[] bArr, String str, long j, OpenSSLX509Certificate openSSLX509Certificate, long j2, OpenSSLX509Certificate openSSLX509Certificate2);

    static native byte[] i2d_PKCS7(long[] jArr);

    static native byte[] i2d_SSL_SESSION(long j);

    static native byte[] i2d_X509(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] i2d_X509_CRL(long j, OpenSSLX509CRL openSSLX509CRL);

    static native byte[] i2d_X509_PUBKEY(long j, OpenSSLX509Certificate openSSLX509Certificate);

    static native byte[] i2d_X509_REVOKED(long j);

    static native void setApplicationProtocols(long j, NativeSsl nativeSsl, boolean z, byte[] bArr);

    static void setEnabledCipherSuites(long j, NativeSsl nativeSsl, String[] strArr, String[] strArr2) {
        checkEnabledCipherSuites(strArr);
        String str = getProtocolRange(strArr2).max;
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (!str2.equals(TLS_EMPTY_RENEGOTIATION_INFO_SCSV)) {
                if (str2.equals(TLS_FALLBACK_SCSV) && (str.equals(DEPRECATED_PROTOCOL_TLSV1) || str.equals(DEPRECATED_PROTOCOL_TLSV1_1))) {
                    SSL_set_mode(j, nativeSsl, 1024L);
                } else {
                    arrayList.add(cipherSuiteFromJava(str2));
                }
            }
        }
        SSL_set_cipher_lists(j, nativeSsl, (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    static void setEnabledProtocols(long j, NativeSsl nativeSsl, String[] strArr) {
        checkEnabledProtocols(strArr);
        Range protocolRange = getProtocolRange(strArr);
        SSL_set_protocol_versions(j, nativeSsl, getProtocolConstant(protocolRange.min), getProtocolConstant(protocolRange.max));
    }

    static native void setHasApplicationProtocolSelector(long j, NativeSsl nativeSsl, boolean z);

    static native void setLocalCertsAndPrivateKey(long j, NativeSsl nativeSsl, byte[][] bArr, NativeRef.EVP_PKEY evp_pkey);

    public static void setTlsV1DeprecationStatus(boolean z, boolean z2) {
        if (z) {
            tlsv12protocols = new String[]{SUPPORTED_PROTOCOL_TLSV1_2};
            tlsv13protocols = new String[]{SUPPORTED_PROTOCOL_TLSV1_2, SUPPORTED_PROTOCOL_TLSV1_3};
        } else {
            tlsv12protocols = new String[]{DEPRECATED_PROTOCOL_TLSV1, DEPRECATED_PROTOCOL_TLSV1_1, SUPPORTED_PROTOCOL_TLSV1_2};
            tlsv13protocols = new String[]{DEPRECATED_PROTOCOL_TLSV1, DEPRECATED_PROTOCOL_TLSV1_1, SUPPORTED_PROTOCOL_TLSV1_2, SUPPORTED_PROTOCOL_TLSV1_3};
        }
        if (z2) {
            supportedProtocols = new String[]{DEPRECATED_PROTOCOL_TLSV1, DEPRECATED_PROTOCOL_TLSV1_1, SUPPORTED_PROTOCOL_TLSV1_2, SUPPORTED_PROTOCOL_TLSV1_3};
        } else {
            supportedProtocols = new String[]{SUPPORTED_PROTOCOL_TLSV1_2, SUPPORTED_PROTOCOL_TLSV1_3};
        }
    }

    static native void set_SSL_psk_client_callback_enabled(long j, NativeSsl nativeSsl, boolean z);

    static native void set_SSL_psk_server_callback_enabled(long j, NativeSsl nativeSsl, boolean z);

    static native boolean usesBoringSsl_FIPS_mode();

    static native boolean usesFipsMode();

    private static int X509_NAME_hash(X500Principal x500Principal, String str) {
        try {
            byte[] digest = MessageDigest.getInstance(str).digest(x500Principal.getEncoded());
            return ((digest[3] & 255) << 24) | (digest[0] & 255) | ((digest[1] & 255) << 8) | ((digest[2] & 255) << 16);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }
}
