package com.google.android.gms.clearcut.uploader;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.clearcut.uploader.QosUploaderChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.apzy;
import defpackage.apzz;
import defpackage.aqdk;
import defpackage.aqer;
import defpackage.aqev;
import defpackage.aqfi;
import defpackage.aqfx;
import defpackage.aqgf;
import defpackage.aqgt;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.aspm;
import defpackage.byln;
import defpackage.cwxm;
import defpackage.eijr;
import defpackage.eijx;
import defpackage.eijy;
import defpackage.eitj;
import defpackage.entt;
import defpackage.fecj;
import defpackage.fief;
import defpackage.figp;
import defpackage.fmha;
import defpackage.fmhj;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class QosUploaderChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final eitj b = eitj.o(fief.FAST_IF_RADIO_AWAKE, fief.DEFAULT, fief.UNMETERED_OR_DAILY, fief.UNMETERED_ONLY);
    private Context c;
    private aqfx d;
    private aqer e;
    private aqgf f;
    private asnv h;
    private eijr i;
    private eijr j;
    private final aqfi k;
    private fecj l;

    public QosUploaderChimeraService() {
        this.l = figp.a.v();
        this.k = null;
    }

    private static void h(Context context) {
        String str = null;
        if (!fmhj.f()) {
            synchronized (apzz.a) {
                if (apzz.b != null) {
                    apzz.b.j();
                    apzz.b = null;
                }
            }
            return;
        }
        apzy a2 = apzz.a();
        a2.g();
        a2.c();
        String str2 = cwxm.b(context).a;
        if (str2 != null && str2.length() > 0) {
            str = str2;
        }
        a2.k(str);
    }

    private final void j() {
        aqdk aqdkVar = (aqdk) this.j.a();
        if (aqdkVar == null) {
            return;
        }
        try {
            entt.a(aqdkVar.b((figp) this.l.Q()));
        } catch (ExecutionException e) {
            Log.e("CCTQosUploaderService", "Failed to save UploadLogResult to ProtoDataStore.", e);
        }
    }

    private static boolean k(String str) {
        return str.contains("qos_debug_force_upload");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Boolean valueOf;
        String str = bylnVar.a;
        if (k(str)) {
            valueOf = Boolean.valueOf(aqgt.d(new eijr() { // from class: aqgs
                @Override // defpackage.eijr
                public final Object a() {
                    return Boolean.valueOf(fmik.a.a().G());
                }
            }, "debug", false));
            if (!valueOf.booleanValue()) {
                return 2;
            }
        }
        return g(str) ? 0 : 2;
    }

    protected final SharedPreferences d() {
        return this.c.getSharedPreferences("CCTQosUploaderService", 0);
    }

    public final void e(final Context context) {
        this.c = context;
        this.d = aqfx.a();
        this.e = aqev.c();
        asnz asnzVar = asnz.a;
        this.f = new aqgf(context, asnzVar);
        this.h = asnzVar;
        this.j = fmha.e() ? eijy.a(new eijr() { // from class: aqgb
            @Override // defpackage.eijr
            public final Object a() {
                int i = QosUploaderChimeraService.a;
                return aqdk.a(context);
            }
        }) : new eijx(null);
        this.i = eijy.a(new eijr() { // from class: aqgc
            @Override // defpackage.eijr
            public final Object a() {
                int i = QosUploaderChimeraService.a;
                aqxd aqxdVar = cvzk.a;
                Context context2 = context;
                return new cwao(new cwal(context2), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", context2);
            }
        });
    }

    public final void f() {
        aspm.f(this.e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(6:(45:128|(43:132|133|(3:587|588|(43:590|591|592|593|136|(1:138)(1:582)|(1:(1:144)(1:145))|159|160|(1:162)(2:552|(2:554|(1:556)(1:557))(44:558|(1:560)|561|562|563|(38:567|568|(34:572|(1:575)|576|(2:550|551)(1:165)|166|(1:168)|169|(1:171)|172|(1:545)(1:176)|177|178|179|180|181|182|183|184|185|186|188|189|190|(2:191|(5:193|194|(2:195|(3:197|(2:202|203)(8:205|206|207|208|(3:211|(4:213|(1:215)(5:349|(1:351)(2:438|(1:440))|352|(6:358|359|(2:433|434)(1:361)|362|(22:372|(1:374)|375|(2:428|429)|377|378|(1:427)(3:382|(1:384)|385)|386|(3:388|(1:390)|391)|392|(1:394)|395|(1:397)|398|(3:400|(1:402)|403)|404|(3:408|(1:410)|411)|412|(3:414|(1:416)|417)|418|(3:422|(1:424)|425)|426)|366)|354)|216|(1:219)(1:218))(1:442)|209)|445|443|444)|204)(5:451|452|(1:454)|455|456))|221|(2:230|231)(3:223|(2:225|226)(2:228|229)|227))(4:460|461|(4:463|(1:465)(2:469|(1:471)(3:472|(21:477|(1:479)|480|(1:482)|483|(3:487|(1:489)|490)|491|(3:493|(1:495)|496)|497|(1:499)|500|(1:502)|503|(3:505|(1:507)|508)|509|(3:513|(1:515)|516)|517|(3:519|(1:521)|522)|523|(3:527|(1:529)|530)|531)|532))|466|(1:468))|533))|232|(11:234|235|236|(2:336|337)|238|239|(3:241|(1:243)|244)(1:335)|245|(6:247|(1:249)|250|251|252|253)(1:334)|254|(3:256|(1:258)|259))(1:345)|260|(2:262|(1:264))|265|266|267|268|(1:270)|(1:274)(3:272|273|154))|577|(1:575)|576|(0)(0)|166|(0)|169|(0)|172|(1:174)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0))|578|568|(35:572|(0)|576|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0))|577|(0)|576|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0)))|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0)))|135|136|(0)(0)|(2:140|(0)(0))|159|160|(0)(0)|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0))|597|133|(0)|135|136|(0)(0)|(0)|159|160|(0)(0)|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0))|(43:132|133|(0)|135|136|(0)(0)|(0)|159|160|(0)(0)|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266|267|268|(0)|(0)(0))|267|268|(0)|(0)(0))|185|186|188|189|190|(3:191|(0)(0)|227)|232|(0)(0)|260|(0)|265|266) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019e, code lost:
    
        if (android.provider.Settings.Secure.getInt(r1.c.getContentResolver(), "user_setup_complete", 0) == 1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0272, code lost:
    
        if (r4 == false) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0274, code lost:
    
        if (r15 == false) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0280, code lost:
    
        r7 = r28 ? 1 : 0;
        r4 = r29 ? 1 : 0;
        r15 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0277, code lost:
    
        if (r6 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0279, code lost:
    
        if (r0 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x027b, code lost:
    
        r12.b("DeferFastUpload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0645, code lost:
    
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x099c, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x099f, code lost:
    
        r2.f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x09a4, code lost:
    
        if (r38 == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x09a6, code lost:
    
        if (r32 != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x09a8, code lost:
    
        if (r39 == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x09aa, code lost:
    
        r2.d.d(r2.f.b() + 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x09bf, code lost:
    
        if ("qos_oneoff".equals(r51) == false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x09c1, code lost:
    
        defpackage.fmii.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x09c4, code lost:
    
        h(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x09cd, code lost:
    
        if (defpackage.fmha.e() == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x09d3, code lost:
    
        if (k(r51) != false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x09d5, code lost:
    
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x09d8, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x09e0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0b56, code lost:
    
        android.util.Log.e("CCTQosUploaderService", "task exception", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0b5d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x09db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x09dc, code lost:
    
        r1 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0b65, code lost:
    
        if ("qos_oneoff".equals(r1) != false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0b67, code lost:
    
        defpackage.fmii.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0b6a, code lost:
    
        h(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0b73, code lost:
    
        if (defpackage.fmha.e() != false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0b7b, code lost:
    
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0b7e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (k(r2) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        r1.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0461, code lost:
    
        if (r10.j != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0a16, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0a17, code lost:
    
        r2 = r1;
        r39 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0a74, code lost:
    
        r29 = r2;
        r2 = r1;
        r29 = r4;
        r32 = r8;
        r39 = r9;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0a80, code lost:
    
        if (r14 == false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0a82, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0a8e, code lost:
    
        if (defpackage.fmik.a.a().P() == false) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0a90, code lost:
    
        r3 = r0.a();
        r0 = r0.b;
        r6 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0a9e, code lost:
    
        if (r3 == 0) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0aa2, code lost:
    
        if (r3 > r6) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0aa4, code lost:
    
        r8.e((r6 - r3) / 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0aab, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0aad, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0ab0, code lost:
    
        if (r14 == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0ab2, code lost:
    
        r2.f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0ab7, code lost:
    
        if (r15 == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0ab9, code lost:
    
        if (r32 != false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0abb, code lost:
    
        if (r39 == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0abd, code lost:
    
        r2.d.d(r2.f.b() + 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0ad0, code lost:
    
        if ("qos_oneoff".equals(r29) == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ad2, code lost:
    
        defpackage.fmii.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ad5, code lost:
    
        h(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0ade, code lost:
    
        if (defpackage.fmha.e() == false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0ae4, code lost:
    
        if (k(r29) != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0ae6, code lost:
    
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ae9, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0aed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0aee, code lost:
    
        r4 = r14;
        r7 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0130, code lost:
    
        if (k(r2) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0178, code lost:
    
        if (k(r2) == false) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1 A[Catch: all -> 0x0b02, TryCatch #21 {all -> 0x0b02, blocks: (B:85:0x014b, B:99:0x0181, B:100:0x0186, B:102:0x0192, B:104:0x0194, B:108:0x01b1, B:109:0x01b8, B:650:0x01a5), top: B:84:0x014b, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0259 A[Catch: all -> 0x0a4d, TryCatch #28 {all -> 0x0a4d, blocks: (B:593:0x022a, B:136:0x024a, B:140:0x0259, B:144:0x0260, B:145:0x026a, B:158:0x027b), top: B:592:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260 A[Catch: all -> 0x0a4d, TryCatch #28 {all -> 0x0a4d, blocks: (B:593:0x022a, B:136:0x024a, B:140:0x0259, B:144:0x0260, B:145:0x026a, B:158:0x027b), top: B:592:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026a A[Catch: all -> 0x0a4d, TryCatch #28 {all -> 0x0a4d, blocks: (B:593:0x022a, B:136:0x024a, B:140:0x0259, B:144:0x0260, B:145:0x026a, B:158:0x027b), top: B:592:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0297 A[Catch: all -> 0x0a3e, TryCatch #18 {all -> 0x0a3e, blocks: (B:160:0x0289, B:162:0x0297, B:552:0x029f, B:554:0x02a7, B:556:0x02b3, B:557:0x02ba, B:558:0x02c3, B:560:0x02d7, B:561:0x02dc), top: B:159:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0367 A[Catch: all -> 0x0358, TryCatch #36 {all -> 0x0358, blocks: (B:551:0x0332, B:166:0x035f, B:168:0x0367, B:169:0x0375, B:171:0x037a, B:174:0x0384, B:176:0x038a, B:177:0x0393, B:563:0x02f2, B:568:0x030d, B:575:0x0327, B:576:0x032c), top: B:550:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037a A[Catch: all -> 0x0358, TryCatch #36 {all -> 0x0358, blocks: (B:551:0x0332, B:166:0x035f, B:168:0x0367, B:169:0x0375, B:171:0x037a, B:174:0x0384, B:176:0x038a, B:177:0x0393, B:563:0x02f2, B:568:0x030d, B:575:0x0327, B:576:0x032c), top: B:550:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0384 A[Catch: all -> 0x0358, TryCatch #36 {all -> 0x0358, blocks: (B:551:0x0332, B:166:0x035f, B:168:0x0367, B:169:0x0375, B:171:0x037a, B:174:0x0384, B:176:0x038a, B:177:0x0393, B:563:0x02f2, B:568:0x030d, B:575:0x0327, B:576:0x032c), top: B:550:0x0332 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x095e A[Catch: all -> 0x0a08, TryCatch #25 {all -> 0x0a08, blocks: (B:253:0x0922, B:254:0x0929, B:256:0x092f, B:258:0x0939, B:259:0x093c, B:260:0x0954, B:262:0x095e, B:264:0x097b, B:265:0x0988), top: B:252:0x0922 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0995 A[Catch: all -> 0x0a04, TRY_LEAVE, TryCatch #23 {all -> 0x0a04, blocks: (B:268:0x0990, B:270:0x0995), top: B:267:0x0990 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x099c A[EDGE_INSN: B:274:0x099c->B:275:0x099c BREAK  A[LOOP:0: B:111:0x01c4->B:154:0x01c4], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0b2d A[Catch: RuntimeException -> 0x0b33, all -> 0x0b5e, TRY_ENTER, TryCatch #24 {RuntimeException -> 0x0b33, blocks: (B:311:0x0b2d, B:315:0x0b3b, B:316:0x0b48, B:627:0x0ab2, B:631:0x0abd), top: B:80:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0b37 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x06e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x029f A[Catch: all -> 0x0a3e, TryCatch #18 {all -> 0x0a3e, blocks: (B:160:0x0289, B:162:0x0297, B:552:0x029f, B:554:0x02a7, B:556:0x02b3, B:557:0x02ba, B:558:0x02c3, B:560:0x02d7, B:561:0x02dc), top: B:159:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0325 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0a74 A[EDGE_INSN: B:611:0x0a74->B:612:0x0a74 BREAK  A[LOOP:0: B:111:0x01c4->B:154:0x01c4], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.clearcut.uploader.QosUploaderChimeraService] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.gms.clearcut.uploader.QosUploaderChimeraService] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.gms.clearcut.uploader.QosUploaderChimeraService] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.google.android.gms.clearcut.uploader.QosUploaderChimeraService] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34, types: [com.google.android.gms.clearcut.uploader.QosUploaderChimeraService] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.clearcut.uploader.QosUploaderChimeraService] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v90 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 2946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.clearcut.uploader.QosUploaderChimeraService.g(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        e(this);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        f();
        super.onDestroy();
    }

    QosUploaderChimeraService(final Context context, aqfi aqfiVar, aqfx aqfxVar, aqer aqerVar, aqgf aqgfVar, asnv asnvVar) {
        this(context, aqfiVar, aqfxVar, aqerVar, aqgfVar, asnvVar, eijy.a(new eijr() { // from class: aqga
            @Override // defpackage.eijr
            public final Object a() {
                int i = QosUploaderChimeraService.a;
                aqxd aqxdVar = cvzk.a;
                Context context2 = context;
                return new cwao(new cwal(context2), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", context2);
            }
        }));
    }

    public QosUploaderChimeraService(final Context context, aqfi aqfiVar, aqfx aqfxVar, aqer aqerVar, aqgf aqgfVar, asnv asnvVar, eijr eijrVar) {
        this.l = figp.a.v();
        this.c = context;
        this.k = aqfiVar;
        this.d = aqfxVar;
        this.e = aqerVar;
        this.f = aqgfVar;
        this.h = asnvVar;
        this.i = eijrVar;
        this.j = fmha.e() ? eijy.a(new eijr() { // from class: aqfz
            @Override // defpackage.eijr
            public final Object a() {
                int i = QosUploaderChimeraService.a;
                return aqdk.a(context);
            }
        }) : new eijx(null);
    }
}
