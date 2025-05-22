package com.google.android.gms.auth.authzen.transaction;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.authzen.phone.AppContextProvider;
import defpackage.abwe;
import defpackage.abwf;
import defpackage.abwh;
import defpackage.atzb;
import defpackage.auad;
import defpackage.fiiu;
import defpackage.filp;
import defpackage.filq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TransactionReplyIntentOperation extends IntentOperation {
    public static final auad a = new auad("TransactionReplyIntentOperation");
    private static final abwh b = new abwh();

    public static Intent a(String str, byte[] bArr, filq filqVar) {
        atzb.q(str);
        return IntentOperation.getStartIntent(AppContextProvider.a(), TransactionReplyIntentOperation.class, "com.google.android.gms.auth.authzen.operation.TRANSACTION_REPLY").putExtra("account", str).putExtra("keyHandle", bArr).putExtra("type", filqVar);
    }

    public static Intent b(String str, byte[] bArr, fiiu fiiuVar, filp filpVar) {
        Intent a2 = a(str, bArr, filpVar.a);
        a2.putExtra("message", filpVar.b);
        a2.putExtra("transaction_id", fiiuVar.c.M());
        String d = abwf.d(fiiuVar);
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
        abwe a2 = b.a(bArr);
        intent.putExtra("transaction_state", a2 != null ? a2.h : -1);
        AppContextProvider.a().sendBroadcast(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07b3 A[Catch: all -> 0x07ce, TRY_LEAVE, TryCatch #17 {all -> 0x07ce, blocks: (B:51:0x0182, B:53:0x0190, B:54:0x0193, B:56:0x01ad, B:58:0x01bf, B:59:0x01c2, B:60:0x01d0, B:62:0x01d8, B:64:0x01e8, B:65:0x01eb, B:66:0x01fb, B:68:0x0203, B:70:0x0213, B:71:0x0216, B:72:0x022a, B:73:0x027d, B:82:0x04d7, B:84:0x04ec, B:86:0x071d, B:88:0x0721, B:91:0x0729, B:96:0x0753, B:102:0x0773, B:103:0x0775, B:113:0x07a9, B:114:0x07ae, B:111:0x07a6, B:115:0x07af, B:117:0x07b3, B:119:0x04fb, B:121:0x0503, B:123:0x0511, B:124:0x058b, B:125:0x0595, B:127:0x059d, B:129:0x05a9, B:135:0x05fd, B:138:0x0608, B:142:0x0611, B:145:0x06b8, B:155:0x070b, B:157:0x062e, B:160:0x0644, B:162:0x064c, B:164:0x0665, B:165:0x066d, B:167:0x0675, B:168:0x067e, B:148:0x06e2, B:150:0x06f0, B:152:0x06ed, B:178:0x0688, B:181:0x0692, B:184:0x06ac, B:199:0x06fc, B:201:0x0700, B:203:0x05cc, B:204:0x052a, B:206:0x053e, B:208:0x0553, B:209:0x0558, B:212:0x057c, B:216:0x0588, B:221:0x0711, B:225:0x02ab, B:231:0x02e6, B:235:0x02f6, B:237:0x02fe, B:238:0x0301, B:241:0x0305, B:243:0x030a, B:245:0x031a, B:246:0x031d, B:249:0x035f, B:252:0x0381, B:255:0x039f, B:322:0x033f, B:327:0x02ca, B:337:0x0253, B:93:0x0736, B:95:0x074c, B:97:0x0757, B:99:0x075d, B:101:0x076b, B:104:0x0779, B:106:0x0782, B:107:0x078b, B:108:0x0795, B:110:0x0799), top: B:36:0x012f, inners: #11, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x059d A[Catch: all -> 0x07ce, TryCatch #17 {all -> 0x07ce, blocks: (B:51:0x0182, B:53:0x0190, B:54:0x0193, B:56:0x01ad, B:58:0x01bf, B:59:0x01c2, B:60:0x01d0, B:62:0x01d8, B:64:0x01e8, B:65:0x01eb, B:66:0x01fb, B:68:0x0203, B:70:0x0213, B:71:0x0216, B:72:0x022a, B:73:0x027d, B:82:0x04d7, B:84:0x04ec, B:86:0x071d, B:88:0x0721, B:91:0x0729, B:96:0x0753, B:102:0x0773, B:103:0x0775, B:113:0x07a9, B:114:0x07ae, B:111:0x07a6, B:115:0x07af, B:117:0x07b3, B:119:0x04fb, B:121:0x0503, B:123:0x0511, B:124:0x058b, B:125:0x0595, B:127:0x059d, B:129:0x05a9, B:135:0x05fd, B:138:0x0608, B:142:0x0611, B:145:0x06b8, B:155:0x070b, B:157:0x062e, B:160:0x0644, B:162:0x064c, B:164:0x0665, B:165:0x066d, B:167:0x0675, B:168:0x067e, B:148:0x06e2, B:150:0x06f0, B:152:0x06ed, B:178:0x0688, B:181:0x0692, B:184:0x06ac, B:199:0x06fc, B:201:0x0700, B:203:0x05cc, B:204:0x052a, B:206:0x053e, B:208:0x0553, B:209:0x0558, B:212:0x057c, B:216:0x0588, B:221:0x0711, B:225:0x02ab, B:231:0x02e6, B:235:0x02f6, B:237:0x02fe, B:238:0x0301, B:241:0x0305, B:243:0x030a, B:245:0x031a, B:246:0x031d, B:249:0x035f, B:252:0x0381, B:255:0x039f, B:322:0x033f, B:327:0x02ca, B:337:0x0253, B:93:0x0736, B:95:0x074c, B:97:0x0757, B:99:0x075d, B:101:0x076b, B:104:0x0779, B:106:0x0782, B:107:0x078b, B:108:0x0795, B:110:0x0799), top: B:36:0x012f, inners: #11, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03fe A[Catch: all -> 0x048f, fgsd -> 0x0499, TRY_ENTER, TryCatch #0 {fgsd -> 0x0499, blocks: (B:262:0x03fe, B:264:0x040c, B:265:0x040f, B:267:0x042b, B:268:0x042e, B:269:0x043d, B:271:0x0445, B:272:0x0448, B:274:0x0465, B:275:0x0468, B:301:0x048c), top: B:257:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0445 A[Catch: all -> 0x048f, fgsd -> 0x0499, TryCatch #0 {fgsd -> 0x0499, blocks: (B:262:0x03fe, B:264:0x040c, B:265:0x040f, B:267:0x042b, B:268:0x042e, B:269:0x043d, B:271:0x0445, B:272:0x0448, B:274:0x0465, B:275:0x0468, B:301:0x048c), top: B:257:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0465 A[Catch: all -> 0x048f, fgsd -> 0x0499, TryCatch #0 {fgsd -> 0x0499, blocks: (B:262:0x03fe, B:264:0x040c, B:265:0x040f, B:267:0x042b, B:268:0x042e, B:269:0x043d, B:271:0x0445, B:272:0x0448, B:274:0x0465, B:275:0x0468, B:301:0x048c), top: B:257:0x03af }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04a7 A[Catch: all -> 0x048f, TryCatch #18 {all -> 0x048f, blocks: (B:79:0x04a7, B:80:0x04b4, B:223:0x028c, B:226:0x02ad, B:229:0x02de, B:232:0x02e8, B:247:0x0351, B:250:0x0362, B:253:0x0384, B:256:0x03a1, B:262:0x03fe, B:264:0x040c, B:265:0x040f, B:267:0x042b, B:268:0x042e, B:269:0x043d, B:271:0x0445, B:272:0x0448, B:274:0x0465, B:275:0x0468, B:314:0x0499, B:277:0x03b4, B:280:0x03bd, B:283:0x03c3, B:284:0x03c5, B:301:0x048c, B:320:0x0337, B:323:0x0342, B:325:0x02c0, B:328:0x02cd), top: B:222:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04b4 A[Catch: all -> 0x048f, TRY_LEAVE, TryCatch #18 {all -> 0x048f, blocks: (B:79:0x04a7, B:80:0x04b4, B:223:0x028c, B:226:0x02ad, B:229:0x02de, B:232:0x02e8, B:247:0x0351, B:250:0x0362, B:253:0x0384, B:256:0x03a1, B:262:0x03fe, B:264:0x040c, B:265:0x040f, B:267:0x042b, B:268:0x042e, B:269:0x043d, B:271:0x0445, B:272:0x0448, B:274:0x0465, B:275:0x0468, B:314:0x0499, B:277:0x03b4, B:280:0x03bd, B:283:0x03c3, B:284:0x03c5, B:301:0x048c, B:320:0x0337, B:323:0x0342, B:325:0x02c0, B:328:0x02cd), top: B:222:0x028c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0721 A[Catch: all -> 0x07ce, TryCatch #17 {all -> 0x07ce, blocks: (B:51:0x0182, B:53:0x0190, B:54:0x0193, B:56:0x01ad, B:58:0x01bf, B:59:0x01c2, B:60:0x01d0, B:62:0x01d8, B:64:0x01e8, B:65:0x01eb, B:66:0x01fb, B:68:0x0203, B:70:0x0213, B:71:0x0216, B:72:0x022a, B:73:0x027d, B:82:0x04d7, B:84:0x04ec, B:86:0x071d, B:88:0x0721, B:91:0x0729, B:96:0x0753, B:102:0x0773, B:103:0x0775, B:113:0x07a9, B:114:0x07ae, B:111:0x07a6, B:115:0x07af, B:117:0x07b3, B:119:0x04fb, B:121:0x0503, B:123:0x0511, B:124:0x058b, B:125:0x0595, B:127:0x059d, B:129:0x05a9, B:135:0x05fd, B:138:0x0608, B:142:0x0611, B:145:0x06b8, B:155:0x070b, B:157:0x062e, B:160:0x0644, B:162:0x064c, B:164:0x0665, B:165:0x066d, B:167:0x0675, B:168:0x067e, B:148:0x06e2, B:150:0x06f0, B:152:0x06ed, B:178:0x0688, B:181:0x0692, B:184:0x06ac, B:199:0x06fc, B:201:0x0700, B:203:0x05cc, B:204:0x052a, B:206:0x053e, B:208:0x0553, B:209:0x0558, B:212:0x057c, B:216:0x0588, B:221:0x0711, B:225:0x02ab, B:231:0x02e6, B:235:0x02f6, B:237:0x02fe, B:238:0x0301, B:241:0x0305, B:243:0x030a, B:245:0x031a, B:246:0x031d, B:249:0x035f, B:252:0x0381, B:255:0x039f, B:322:0x033f, B:327:0x02ca, B:337:0x0253, B:93:0x0736, B:95:0x074c, B:97:0x0757, B:99:0x075d, B:101:0x076b, B:104:0x0779, B:106:0x0782, B:107:0x078b, B:108:0x0795, B:110:0x0799), top: B:36:0x012f, inners: #11, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x074c A[Catch: all -> 0x0796, IOException -> 0x0798, TRY_LEAVE, TryCatch #11 {IOException -> 0x0798, blocks: (B:93:0x0736, B:95:0x074c, B:97:0x0757, B:99:0x075d, B:101:0x076b, B:104:0x0779, B:106:0x0782, B:107:0x078b, B:108:0x0795), top: B:92:0x0736, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0757 A[Catch: all -> 0x0796, IOException -> 0x0798, TRY_ENTER, TryCatch #11 {IOException -> 0x0798, blocks: (B:93:0x0736, B:95:0x074c, B:97:0x0757, B:99:0x075d, B:101:0x076b, B:104:0x0779, B:106:0x0782, B:107:0x078b, B:108:0x0795), top: B:92:0x0736, outer: #17 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v21, types: [fikh] */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5, types: [int] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 2014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.authzen.transaction.TransactionReplyIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
