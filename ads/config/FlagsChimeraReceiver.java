package com.google.android.gms.ads.config;

import android.util.Base64;
import com.google.android.chimera.BroadcastReceiver;
import java.nio.charset.StandardCharsets;
import java.security.PublicKey;
import java.security.Signature;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FlagsChimeraReceiver extends BroadcastReceiver {
    private final String b;

    public FlagsChimeraReceiver(String str) {
        this.b = str;
    }

    private static final boolean a(PublicKey publicKey, String str, String str2) {
        Signature signature = Signature.getInstance("SHA1withRSA");
        signature.initVerify(publicKey);
        signature.update(str.getBytes(StandardCharsets.UTF_8));
        return signature.verify(Base64.decode(str2, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:21|(1:23)(1:135)|24|(4:25|26|(1:28)(1:133)|29)|(18:34|(2:35|(1:37)(1:38))|39|40|41|(1:43)(1:129)|44|(2:48|(3:49|50|(2:52|(1:55)(1:54))(2:92|93)))(0)|97|98|(1:100)(4:121|(2:124|122)|125|126)|(3:(2:111|(1:117))|120|(3:113|115|117))(1:102)|103|(2:105|106)|65|(2:66|(2:68|(2:70|71)(1:88))(2:89|90))|72|(7:74|75|76|77|(2:79|(1:81))(1:84)|82|83)(1:87))|132|40|41|(0)(0)|44|(3:46|48|(4:49|50|(0)(0)|54))(0)|97|98|(0)(0)|(0)(0)|103|(0)|65|(3:66|(0)(0)|88)|72|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:21|(1:23)(1:135)|24|25|26|(1:28)(1:133)|29|(18:34|(2:35|(1:37)(1:38))|39|40|41|(1:43)(1:129)|44|(2:48|(3:49|50|(2:52|(1:55)(1:54))(2:92|93)))(0)|97|98|(1:100)(4:121|(2:124|122)|125|126)|(3:(2:111|(1:117))|120|(3:113|115|117))(1:102)|103|(2:105|106)|65|(2:66|(2:68|(2:70|71)(1:88))(2:89|90))|72|(7:74|75|76|77|(2:79|(1:81))(1:84)|82|83)(1:87))|132|40|41|(0)(0)|44|(3:46|48|(4:49|50|(0)(0)|54))(0)|97|98|(0)(0)|(0)(0)|103|(0)|65|(3:66|(0)(0)|88)|72|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01fd, code lost:
    
        if (com.google.android.gms.ads.config.b.b(r13).contains(r11) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0200, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0201, code lost:
    
        r10 = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.j("Exception in devicekey check", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0183, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0184, code lost:
    
        r10 = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.j("Exception in testkey check", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013b, code lost:
    
        r0 = defpackage.asnh.e("MD5");
        r12 = new byte[2048];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
    
        r10 = r15.read(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0149, code lost:
    
        if (r10 <= 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014b, code lost:
    
        r0.update(r12, 0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016d, code lost:
    
        if (java.util.Arrays.equals(r0.digest(), new java.math.BigInteger("4033dafc873dc7271e205b83cc9b4b17", 16).toByteArray()) == false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0214 A[Catch: UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x02a1, GeneralSecurityException -> 0x02a3, IllegalArgumentException -> 0x02a5, TryCatch #7 {UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x02a1, blocks: (B:17:0x005c, B:19:0x0078, B:21:0x007e, B:23:0x00a2, B:24:0x00a9, B:26:0x00ac, B:28:0x00b2, B:29:0x00c7, B:31:0x00cd, B:34:0x00d4, B:35:0x00e3, B:37:0x00e9, B:39:0x00ed, B:65:0x021d, B:66:0x0234, B:68:0x023a, B:72:0x024a, B:74:0x0253, B:76:0x025c, B:79:0x0268, B:81:0x0284, B:82:0x0293, B:84:0x028d, B:103:0x0208, B:105:0x0214, B:128:0x0201, B:131:0x0184, B:132:0x00f1, B:133:0x00c0, B:135:0x00a7), top: B:16:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193 A[Catch: Exception -> 0x0200, TryCatch #0 {Exception -> 0x0200, blocks: (B:98:0x018b, B:108:0x01c9, B:111:0x01d0, B:113:0x01e0, B:115:0x01e6, B:117:0x01f5, B:121:0x0193, B:122:0x019c, B:124:0x01a2, B:126:0x01b1), top: B:97:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x010c A[Catch: Exception -> 0x0183, TryCatch #7 {Exception -> 0x0183, blocks: (B:41:0x00f8, B:43:0x00fe, B:44:0x0113, B:46:0x0119, B:48:0x011f, B:62:0x0167, B:93:0x0174, B:95:0x017c, B:96:0x0182, B:129:0x010c, B:50:0x0129, B:52:0x012f, B:56:0x013b, B:57:0x0145, B:59:0x014b, B:61:0x0152), top: B:40:0x00f8, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe A[Catch: Exception -> 0x0183, TryCatch #7 {Exception -> 0x0183, blocks: (B:41:0x00f8, B:43:0x00fe, B:44:0x0113, B:46:0x0119, B:48:0x011f, B:62:0x0167, B:93:0x0174, B:95:0x017c, B:96:0x0182, B:129:0x010c, B:50:0x0129, B:52:0x012f, B:56:0x013b, B:57:0x0145, B:59:0x014b, B:61:0x0152), top: B:40:0x00f8, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f A[Catch: all -> 0x017b, TryCatch #6 {all -> 0x017b, blocks: (B:50:0x0129, B:52:0x012f, B:56:0x013b, B:57:0x0145, B:59:0x014b, B:61:0x0152), top: B:49:0x0129, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023a A[Catch: UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x02a1, GeneralSecurityException -> 0x02a3, IllegalArgumentException -> 0x02a5, TryCatch #7 {UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x02a1, blocks: (B:17:0x005c, B:19:0x0078, B:21:0x007e, B:23:0x00a2, B:24:0x00a9, B:26:0x00ac, B:28:0x00b2, B:29:0x00c7, B:31:0x00cd, B:34:0x00d4, B:35:0x00e3, B:37:0x00e9, B:39:0x00ed, B:65:0x021d, B:66:0x0234, B:68:0x023a, B:72:0x024a, B:74:0x0253, B:76:0x025c, B:79:0x0268, B:81:0x0284, B:82:0x0293, B:84:0x028d, B:103:0x0208, B:105:0x0214, B:128:0x0201, B:131:0x0184, B:132:0x00f1, B:133:0x00c0, B:135:0x00a7), top: B:16:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0253 A[Catch: UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x02a1, GeneralSecurityException -> 0x02a3, IllegalArgumentException -> 0x02a5, TRY_LEAVE, TryCatch #7 {UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException -> 0x02a1, blocks: (B:17:0x005c, B:19:0x0078, B:21:0x007e, B:23:0x00a2, B:24:0x00a9, B:26:0x00ac, B:28:0x00b2, B:29:0x00c7, B:31:0x00cd, B:34:0x00d4, B:35:0x00e3, B:37:0x00e9, B:39:0x00ed, B:65:0x021d, B:66:0x0234, B:68:0x023a, B:72:0x024a, B:74:0x0253, B:76:0x025c, B:79:0x0268, B:81:0x0284, B:82:0x0293, B:84:0x028d, B:103:0x0208, B:105:0x0214, B:128:0x0201, B:131:0x0184, B:132:0x00f1, B:133:0x00c0, B:135:0x00a7), top: B:16:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174 A[SYNTHETIC] */
    @Override // com.google.android.chimera.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.config.FlagsChimeraReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public FlagsChimeraReceiver() {
        this("/system/etc/security/otacerts.zip");
    }
}
