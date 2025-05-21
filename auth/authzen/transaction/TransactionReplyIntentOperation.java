package com.google.android.gms.auth.authzen.transaction;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.fftw;
import defpackage.ffwr;
import defpackage.ffws;
import defpackage.zwe;
import defpackage.zwf;
import defpackage.zwh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class TransactionReplyIntentOperation extends IntentOperation {
    public static final arxo a = new arxo("TransactionReplyIntentOperation");
    private static final zwh b = new zwh();

    public static Intent a(String str, byte[] bArr, ffws ffwsVar) {
        arwm.q(str);
        return IntentOperation.getStartIntent(AppContextProvider.a(), TransactionReplyIntentOperation.class, "com.google.android.gms.auth.authzen.operation.TRANSACTION_REPLY").putExtra("account", str).putExtra("keyHandle", bArr).putExtra("type", ffwsVar);
    }

    public static Intent b(String str, byte[] bArr, fftw fftwVar, ffwr ffwrVar) {
        Intent a2 = a(str, bArr, ffwrVar.a);
        a2.putExtra("message", ffwrVar.b);
        a2.putExtra("transaction_id", fftwVar.c.M());
        String d = zwf.d(fftwVar);
        if (d != null) {
            a2.putExtra("txCacheKey", d);
        }
        return a2;
    }

    public static void c(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        Intent intent = new Intent("AUTHZEN_UPDATE_ACTIVITY");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("transaction_id", bArr);
        zwe a2 = b.a(bArr);
        intent.putExtra("transaction_state", a2 != null ? a2.h : -1);
        AppContextProvider.a().sendBroadcast(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x07b9 A[Catch: all -> 0x07d4, TRY_LEAVE, TryCatch #17 {all -> 0x07d4, blocks: (B:51:0x0186, B:53:0x0194, B:54:0x0197, B:56:0x01b1, B:58:0x01c3, B:59:0x01c6, B:60:0x01d4, B:62:0x01dc, B:64:0x01ec, B:65:0x01ef, B:66:0x01ff, B:68:0x0207, B:70:0x0217, B:71:0x021a, B:72:0x022e, B:73:0x0281, B:82:0x04dd, B:84:0x04f2, B:86:0x0723, B:88:0x0727, B:90:0x072f, B:95:0x0759, B:101:0x0779, B:102:0x077b, B:109:0x07af, B:110:0x07b4, B:113:0x07ac, B:114:0x07b5, B:116:0x07b9, B:118:0x0501, B:120:0x0509, B:122:0x0517, B:123:0x0591, B:124:0x059b, B:126:0x05a3, B:128:0x05af, B:134:0x0603, B:137:0x060e, B:140:0x0617, B:143:0x06be, B:153:0x0711, B:154:0x0634, B:157:0x064a, B:160:0x0652, B:162:0x066b, B:163:0x0673, B:165:0x067b, B:166:0x0684, B:146:0x06e8, B:148:0x06f6, B:150:0x06f3, B:179:0x068e, B:182:0x0698, B:185:0x06b2, B:199:0x0702, B:201:0x0706, B:203:0x05d2, B:204:0x0530, B:206:0x0544, B:208:0x0559, B:209:0x055e, B:212:0x0582, B:216:0x058e, B:221:0x0717, B:225:0x02b1, B:231:0x02ec, B:235:0x02fc, B:237:0x0304, B:238:0x0307, B:241:0x030b, B:243:0x0310, B:245:0x0320, B:246:0x0323, B:249:0x0365, B:252:0x0387, B:255:0x03a5, B:322:0x0345, B:327:0x02d0, B:337:0x0257, B:92:0x073c, B:94:0x0752, B:96:0x075d, B:98:0x0763, B:100:0x0771, B:103:0x077f, B:105:0x0788, B:106:0x0791, B:107:0x079b, B:112:0x079f), top: B:36:0x0133, inners: #24, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05a3 A[Catch: all -> 0x07d4, TryCatch #17 {all -> 0x07d4, blocks: (B:51:0x0186, B:53:0x0194, B:54:0x0197, B:56:0x01b1, B:58:0x01c3, B:59:0x01c6, B:60:0x01d4, B:62:0x01dc, B:64:0x01ec, B:65:0x01ef, B:66:0x01ff, B:68:0x0207, B:70:0x0217, B:71:0x021a, B:72:0x022e, B:73:0x0281, B:82:0x04dd, B:84:0x04f2, B:86:0x0723, B:88:0x0727, B:90:0x072f, B:95:0x0759, B:101:0x0779, B:102:0x077b, B:109:0x07af, B:110:0x07b4, B:113:0x07ac, B:114:0x07b5, B:116:0x07b9, B:118:0x0501, B:120:0x0509, B:122:0x0517, B:123:0x0591, B:124:0x059b, B:126:0x05a3, B:128:0x05af, B:134:0x0603, B:137:0x060e, B:140:0x0617, B:143:0x06be, B:153:0x0711, B:154:0x0634, B:157:0x064a, B:160:0x0652, B:162:0x066b, B:163:0x0673, B:165:0x067b, B:166:0x0684, B:146:0x06e8, B:148:0x06f6, B:150:0x06f3, B:179:0x068e, B:182:0x0698, B:185:0x06b2, B:199:0x0702, B:201:0x0706, B:203:0x05d2, B:204:0x0530, B:206:0x0544, B:208:0x0559, B:209:0x055e, B:212:0x0582, B:216:0x058e, B:221:0x0717, B:225:0x02b1, B:231:0x02ec, B:235:0x02fc, B:237:0x0304, B:238:0x0307, B:241:0x030b, B:243:0x0310, B:245:0x0320, B:246:0x0323, B:249:0x0365, B:252:0x0387, B:255:0x03a5, B:322:0x0345, B:327:0x02d0, B:337:0x0257, B:92:0x073c, B:94:0x0752, B:96:0x075d, B:98:0x0763, B:100:0x0771, B:103:0x077f, B:105:0x0788, B:106:0x0791, B:107:0x079b, B:112:0x079f), top: B:36:0x0133, inners: #24, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0404 A[Catch: all -> 0x0495, fedk -> 0x049f, TRY_ENTER, TryCatch #6 {fedk -> 0x049f, blocks: (B:262:0x0404, B:264:0x0412, B:265:0x0415, B:267:0x0431, B:268:0x0434, B:269:0x0443, B:271:0x044b, B:272:0x044e, B:274:0x046b, B:275:0x046e, B:301:0x0492), top: B:257:0x03b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x044b A[Catch: all -> 0x0495, fedk -> 0x049f, TryCatch #6 {fedk -> 0x049f, blocks: (B:262:0x0404, B:264:0x0412, B:265:0x0415, B:267:0x0431, B:268:0x0434, B:269:0x0443, B:271:0x044b, B:272:0x044e, B:274:0x046b, B:275:0x046e, B:301:0x0492), top: B:257:0x03b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x046b A[Catch: all -> 0x0495, fedk -> 0x049f, TryCatch #6 {fedk -> 0x049f, blocks: (B:262:0x0404, B:264:0x0412, B:265:0x0415, B:267:0x0431, B:268:0x0434, B:269:0x0443, B:271:0x044b, B:272:0x044e, B:274:0x046b, B:275:0x046e, B:301:0x0492), top: B:257:0x03b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04ad A[Catch: all -> 0x0495, TryCatch #18 {all -> 0x0495, blocks: (B:79:0x04ad, B:80:0x04ba, B:223:0x0290, B:226:0x02b3, B:229:0x02e4, B:232:0x02ee, B:247:0x0357, B:250:0x0368, B:253:0x038a, B:256:0x03a7, B:262:0x0404, B:264:0x0412, B:265:0x0415, B:267:0x0431, B:268:0x0434, B:269:0x0443, B:271:0x044b, B:272:0x044e, B:274:0x046b, B:275:0x046e, B:314:0x049f, B:277:0x03ba, B:280:0x03c3, B:283:0x03c9, B:284:0x03cb, B:301:0x0492, B:320:0x033d, B:323:0x0348, B:325:0x02c6, B:328:0x02d3), top: B:222:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04ba A[Catch: all -> 0x0495, TRY_LEAVE, TryCatch #18 {all -> 0x0495, blocks: (B:79:0x04ad, B:80:0x04ba, B:223:0x0290, B:226:0x02b3, B:229:0x02e4, B:232:0x02ee, B:247:0x0357, B:250:0x0368, B:253:0x038a, B:256:0x03a7, B:262:0x0404, B:264:0x0412, B:265:0x0415, B:267:0x0431, B:268:0x0434, B:269:0x0443, B:271:0x044b, B:272:0x044e, B:274:0x046b, B:275:0x046e, B:314:0x049f, B:277:0x03ba, B:280:0x03c3, B:283:0x03c9, B:284:0x03cb, B:301:0x0492, B:320:0x033d, B:323:0x0348, B:325:0x02c6, B:328:0x02d3), top: B:222:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0727 A[Catch: all -> 0x07d4, TryCatch #17 {all -> 0x07d4, blocks: (B:51:0x0186, B:53:0x0194, B:54:0x0197, B:56:0x01b1, B:58:0x01c3, B:59:0x01c6, B:60:0x01d4, B:62:0x01dc, B:64:0x01ec, B:65:0x01ef, B:66:0x01ff, B:68:0x0207, B:70:0x0217, B:71:0x021a, B:72:0x022e, B:73:0x0281, B:82:0x04dd, B:84:0x04f2, B:86:0x0723, B:88:0x0727, B:90:0x072f, B:95:0x0759, B:101:0x0779, B:102:0x077b, B:109:0x07af, B:110:0x07b4, B:113:0x07ac, B:114:0x07b5, B:116:0x07b9, B:118:0x0501, B:120:0x0509, B:122:0x0517, B:123:0x0591, B:124:0x059b, B:126:0x05a3, B:128:0x05af, B:134:0x0603, B:137:0x060e, B:140:0x0617, B:143:0x06be, B:153:0x0711, B:154:0x0634, B:157:0x064a, B:160:0x0652, B:162:0x066b, B:163:0x0673, B:165:0x067b, B:166:0x0684, B:146:0x06e8, B:148:0x06f6, B:150:0x06f3, B:179:0x068e, B:182:0x0698, B:185:0x06b2, B:199:0x0702, B:201:0x0706, B:203:0x05d2, B:204:0x0530, B:206:0x0544, B:208:0x0559, B:209:0x055e, B:212:0x0582, B:216:0x058e, B:221:0x0717, B:225:0x02b1, B:231:0x02ec, B:235:0x02fc, B:237:0x0304, B:238:0x0307, B:241:0x030b, B:243:0x0310, B:245:0x0320, B:246:0x0323, B:249:0x0365, B:252:0x0387, B:255:0x03a5, B:322:0x0345, B:327:0x02d0, B:337:0x0257, B:92:0x073c, B:94:0x0752, B:96:0x075d, B:98:0x0763, B:100:0x0771, B:103:0x077f, B:105:0x0788, B:106:0x0791, B:107:0x079b, B:112:0x079f), top: B:36:0x0133, inners: #24, #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0752 A[Catch: all -> 0x079c, IOException -> 0x079e, TRY_LEAVE, TryCatch #24 {all -> 0x079c, blocks: (B:92:0x073c, B:94:0x0752, B:96:0x075d, B:98:0x0763, B:100:0x0771, B:103:0x077f, B:105:0x0788, B:106:0x0791, B:107:0x079b, B:112:0x079f), top: B:91:0x073c, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x075d A[Catch: all -> 0x079c, IOException -> 0x079e, TRY_ENTER, TryCatch #24 {all -> 0x079c, blocks: (B:92:0x073c, B:94:0x0752, B:96:0x075d, B:98:0x0763, B:100:0x0771, B:103:0x077f, B:105:0x0788, B:106:0x0791, B:107:0x079b, B:112:0x079f), top: B:91:0x073c, outer: #17 }] */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.String] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 2020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
