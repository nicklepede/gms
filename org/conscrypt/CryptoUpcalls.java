package com.google.android.gms.org.conscrypt;

import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if ("EC".equals(privateKey.getAlgorithm())) {
            return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
        }
        throw new RuntimeException("Unexpected key type: ".concat(String.valueOf(String.valueOf(privateKey))));
    }

    private static List getExternalProviders(String str) {
        ArrayList arrayList = new ArrayList(1);
        for (Provider provider : Security.getProviders(str)) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            logger.logp(Level.WARNING, "com.google.android.gms.org.conscrypt.CryptoUpcalls", "getExternalProviders", "Could not find external provider for algorithm: ".concat(String.valueOf(str)));
        }
        return arrayList;
    }

    static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if (true == com.google.android.gms.org.conscrypt.Conscrypt.isConscrypt(r1.getProvider())) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[LOOP:0: B:21:0x007a->B:31:0x007a, LOOP_START] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] rsaOpWithPrivateKey(java.security.PrivateKey r11, int r12, int r13, byte[] r14) {
        /*
            java.lang.String r0 = r11.getAlgorithm()
            java.lang.String r1 = "RSA"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "rsaOpWithPrivateKey"
            java.lang.String r3 = "com.google.android.gms.org.conscrypt.CryptoUpcalls"
            r4 = 0
            if (r1 != 0) goto L23
            java.lang.String r11 = java.lang.String.valueOf(r0)
            java.util.logging.Logger r12 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r13 = java.util.logging.Level.WARNING
            java.lang.String r14 = "Unexpected key type: "
            java.lang.String r11 = r14.concat(r11)
            r12.logp(r13, r3, r2, r11)
            return r4
        L23:
            r0 = 1
            if (r12 == r0) goto L40
            r1 = 3
            if (r12 == r1) goto L3d
            r1 = 4
            if (r12 == r1) goto L3a
            java.util.logging.Logger r11 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r13 = java.util.logging.Level.WARNING
            java.lang.String r14 = "Unsupported OpenSSL/BoringSSL padding: "
            java.lang.String r12 = defpackage.a.j(r12, r14)
            r11.logp(r13, r3, r2, r12)
            return r4
        L3a:
            java.lang.String r12 = "OAEPPadding"
            goto L42
        L3d:
            java.lang.String r12 = "NoPadding"
            goto L42
        L40:
            java.lang.String r12 = "PKCS1Padding"
        L42:
            java.lang.String r1 = "RSA/ECB/"
            java.lang.String r12 = r1.concat(r12)
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r12)     // Catch: java.security.InvalidKeyException -> L5a java.lang.Throwable -> Ld2
            r1.init(r13, r11)     // Catch: java.security.InvalidKeyException -> L5a java.lang.Throwable -> Ld2
            java.security.Provider r5 = r1.getProvider()     // Catch: java.security.InvalidKeyException -> L5a java.lang.Throwable -> Ld2
            boolean r5 = com.google.android.gms.org.conscrypt.Conscrypt.isConscrypt(r5)     // Catch: java.security.InvalidKeyException -> L5a java.lang.Throwable -> Ld2
            if (r0 != r5) goto L6a
            goto L69
        L5a:
            r0 = move-exception
            r10 = r0
            java.util.logging.Logger r5 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r8 = "rsaOpWithPrivateKey"
            java.lang.String r9 = "Preferred provider doesn't support key:"
            java.lang.String r7 = "com.google.android.gms.org.conscrypt.CryptoUpcalls"
            r5.logp(r6, r7, r8, r9, r10)
        L69:
            r1 = r4
        L6a:
            if (r1 != 0) goto La0
            java.lang.String r0 = "Cipher."
            java.lang.String r0 = r0.concat(r12)
            java.util.List r0 = getExternalProviders(r0)
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            java.security.Provider r1 = (java.security.Provider) r1
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r12, r1)     // Catch: java.lang.Throwable -> L7a
            r1.init(r13, r11)     // Catch: java.lang.Throwable -> L7a
            goto L8f
        L8e:
            r1 = r4
        L8f:
            if (r1 == 0) goto L92
            goto La0
        L92:
            java.lang.String r11 = "Could not find provider for algorithm: "
            java.lang.String r11 = r11.concat(r12)
            java.util.logging.Logger r12 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r13 = java.util.logging.Level.WARNING
            r12.logp(r13, r3, r2, r11)
            return r4
        La0:
            byte[] r11 = r1.doFinal(r14)     // Catch: java.lang.Exception -> La5
            return r11
        La5:
            r0 = move-exception
            r10 = r0
            java.util.logging.Logger r5 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r6 = java.util.logging.Level.WARNING
            java.lang.String r11 = r11.getAlgorithm()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Exception while decrypting message with "
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r11 = " private key using "
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = ":"
            r13.append(r11)
            java.lang.String r9 = r13.toString()
            java.lang.String r7 = "com.google.android.gms.org.conscrypt.CryptoUpcalls"
            java.lang.String r8 = "rsaOpWithPrivateKey"
            r5.logp(r6, r7, r8, r9, r10)
            return r4
        Ld2:
            java.lang.String r11 = "Unsupported cipher algorithm: "
            java.lang.String r11 = r11.concat(r12)
            java.util.logging.Logger r12 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r13 = java.util.logging.Level.WARNING
            r12.logp(r13, r3, r2, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.CryptoUpcalls.rsaOpWithPrivateKey(java.security.PrivateKey, int, int, byte[]):byte[]");
    }

    static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 1, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (true == com.google.android.gms.org.conscrypt.Conscrypt.isConscrypt(r0.getProvider())) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[LOOP:0: B:8:0x003b->B:26:0x003b, LOOP_START, PHI: r5
  0x003b: PHI (r5v3 java.lang.RuntimeException) = (r5v2 java.lang.RuntimeException), (r5v4 java.lang.RuntimeException) binds: [B:7:0x0028, B:26:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] signDigestWithPrivateKey(java.security.PrivateKey r10, byte[] r11, java.lang.String r12) {
        /*
            java.lang.String r1 = "signDigestWithPrivateKey"
            java.lang.String r2 = "com.google.android.gms.org.conscrypt.CryptoUpcalls"
            r3 = 0
            java.security.Signature r0 = java.security.Signature.getInstance(r12)     // Catch: java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L9a
            r0.initSign(r10)     // Catch: java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L9a
            java.security.Provider r4 = r0.getProvider()     // Catch: java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L9a
            boolean r4 = com.google.android.gms.org.conscrypt.Conscrypt.isConscrypt(r4)     // Catch: java.security.InvalidKeyException -> L18 java.security.NoSuchAlgorithmException -> L9a
            r5 = 1
            if (r5 != r4) goto L26
            goto L25
        L18:
            r0 = move-exception
            java.util.logging.Logger r4 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.String r6 = "Preferred provider doesn't support key:"
            r4.logp(r5, r2, r1, r6)
            r0.printStackTrace()
        L25:
            r0 = r3
        L26:
            if (r0 != 0) goto L6c
            java.lang.String r0 = java.lang.String.valueOf(r12)
            java.lang.String r4 = "Signature."
            java.lang.String r0 = r4.concat(r0)
            java.util.List r0 = getExternalProviders(r0)
            java.util.Iterator r4 = r0.iterator()
            r5 = r3
        L3b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r4.next()
            java.security.Provider r0 = (java.security.Provider) r0
            java.security.Signature r0 = java.security.Signature.getInstance(r12, r0)     // Catch: java.lang.Throwable -> L3b java.lang.RuntimeException -> L4f
            r0.initSign(r10)     // Catch: java.lang.Throwable -> L3b java.lang.RuntimeException -> L4f
            goto L55
        L4f:
            r0 = move-exception
            if (r5 != 0) goto L3b
            r5 = r0
            goto L3b
        L54:
            r0 = r3
        L55:
            if (r0 != 0) goto L6c
            if (r5 != 0) goto L6b
            java.lang.String r10 = java.lang.String.valueOf(r12)
            java.util.logging.Logger r11 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r12 = java.util.logging.Level.WARNING
            java.lang.String r0 = "Could not find provider for algorithm: "
            java.lang.String r10 = r0.concat(r10)
            r11.logp(r12, r2, r1, r10)
            return r3
        L6b:
            throw r5
        L6c:
            r0.update(r11)     // Catch: java.lang.Exception -> L74
            byte[] r10 = r0.sign()     // Catch: java.lang.Exception -> L74
            return r10
        L74:
            r0 = move-exception
            r11 = r0
            r9 = r11
            java.util.logging.Logger r4 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r5 = java.util.logging.Level.WARNING
            java.lang.String r10 = r10.getAlgorithm()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Exception while signing message with "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = " private key:"
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            java.lang.String r6 = "com.google.android.gms.org.conscrypt.CryptoUpcalls"
            java.lang.String r7 = "signDigestWithPrivateKey"
            r4.logp(r5, r6, r7, r8, r9)
            return r3
        L9a:
            java.lang.String r10 = java.lang.String.valueOf(r12)
            java.util.logging.Logger r11 = com.google.android.gms.org.conscrypt.CryptoUpcalls.logger
            java.util.logging.Level r12 = java.util.logging.Level.WARNING
            java.lang.String r0 = "Unsupported signature algorithm: "
            java.lang.String r10 = r0.concat(r10)
            r11.logp(r12, r2, r1, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.org.conscrypt.CryptoUpcalls.signDigestWithPrivateKey(java.security.PrivateKey, byte[], java.lang.String):byte[]");
    }
}
