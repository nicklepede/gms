package com.google.android.gms.clearcut.uploader;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.clearcut.uploader.QosUploaderChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ascp;
import defpackage.ascq;
import defpackage.asgb;
import defpackage.ashi;
import defpackage.ashm;
import defpackage.ashz;
import defpackage.asio;
import defpackage.asiw;
import defpackage.asjk;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.autg;
import defpackage.cauf;
import defpackage.czhk;
import defpackage.ekww;
import defpackage.ekxc;
import defpackage.ekxd;
import defpackage.elgo;
import defpackage.eqhm;
import defpackage.fgrc;
import defpackage.fkuc;
import defpackage.fkwm;
import defpackage.foym;
import defpackage.foyv;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class QosUploaderChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final elgo b = elgo.o(fkuc.FAST_IF_RADIO_AWAKE, fkuc.DEFAULT, fkuc.UNMETERED_OR_DAILY, fkuc.UNMETERED_ONLY);
    private Context c;
    private asio d;
    private ashi e;
    private asiw f;
    private aurp h;
    private ekww i;
    private ekww j;
    private final ashz k;
    private fgrc l;

    public QosUploaderChimeraService() {
        this.l = fkwm.a.v();
        this.k = null;
    }

    private static void h(Context context) {
        String str = null;
        if (!foyv.f()) {
            synchronized (ascq.a) {
                if (ascq.b != null) {
                    ascq.b.j();
                    ascq.b = null;
                }
            }
            return;
        }
        ascp a2 = ascq.a();
        a2.g();
        a2.c();
        String str2 = czhk.b(context).a;
        if (str2 != null && str2.length() > 0) {
            str = str2;
        }
        a2.k(str);
    }

    private final void j() {
        asgb asgbVar = (asgb) this.j.lK();
        if (asgbVar == null) {
            return;
        }
        try {
            eqhm.a(asgbVar.b((fkwm) this.l.Q()));
        } catch (ExecutionException e) {
            Log.e("CCTQosUploaderService", "Failed to save UploadLogResult to ProtoDataStore.", e);
        }
    }

    private static boolean k(String str) {
        return str.contains("qos_debug_force_upload");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Boolean valueOf;
        String str = caufVar.a;
        if (k(str)) {
            valueOf = Boolean.valueOf(asjk.d(new ekww() { // from class: asjj
                @Override // defpackage.ekww
                public final Object lK() {
                    return Boolean.valueOf(fozw.a.lK().G());
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
        this.d = asio.a();
        this.e = ashm.c();
        aurt aurtVar = aurt.a;
        this.f = new asiw(context, aurtVar);
        this.h = aurtVar;
        this.j = foym.e() ? ekxd.a(new ekww() { // from class: asis
            @Override // defpackage.ekww
            public final Object lK() {
                int i = QosUploaderChimeraService.a;
                return asgb.a(context);
            }
        }) : new ekxc(null);
        this.i = ekxd.a(new ekww() { // from class: asit
            @Override // defpackage.ekww
            public final Object lK() {
                int i = QosUploaderChimeraService.a;
                aszs aszsVar = cyjh.a;
                Context context2 = context;
                return new cykl(new cyki(context2), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", context2);
            }
        });
    }

    public final void f() {
        autg.f(this.e);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(6:(45:128|(43:132|133|(3:587|588|(43:590|591|592|593|136|(1:138)(1:582)|(1:(1:144)(1:145))|159|160|(1:162)(2:552|(2:554|(1:556)(1:557))(44:558|(1:560)|561|562|563|(38:567|568|(34:572|(1:575)|576|(2:550|551)(1:165)|166|(1:168)|169|(1:171)|172|(1:545)(1:176)|177|178|179|180|181|182|183|184|185|186|187|188|189|(2:190|(5:192|193|(2:194|(3:196|(2:201|202)(8:204|205|206|207|(3:210|(4:212|(1:214)(5:348|(1:350)(2:437|(1:439))|351|(6:357|358|(2:432|433)(1:360)|361|(22:371|(1:373)|374|(2:427|428)|376|377|(1:426)(3:381|(1:383)|384)|385|(3:387|(1:389)|390)|391|(1:393)|394|(1:396)|397|(3:399|(1:401)|402)|403|(3:407|(1:409)|410)|411|(3:413|(1:415)|416)|417|(3:421|(1:423)|424)|425)|365)|353)|215|(1:218)(1:217))(1:441)|208)|444|442|443)|203)(5:450|451|(1:453)|454|455))|220|(2:229|230)(3:222|(2:224|225)(2:227|228)|226))(4:459|460|(4:462|(1:464)(2:468|(1:470)(3:471|(21:476|(1:478)|479|(1:481)|482|(3:486|(1:488)|489)|490|(3:492|(1:494)|495)|496|(1:498)|499|(1:501)|502|(3:504|(1:506)|507)|508|(3:512|(1:514)|515)|516|(3:518|(1:520)|521)|522|(3:526|(1:528)|529)|530)|531))|465|(1:467))|532))|231|(11:233|234|235|(2:335|336)|237|238|(3:240|(1:242)|243)(1:334)|244|(6:246|(1:248)|249|250|251|252)(1:333)|253|(3:255|(1:257)|258))(1:344)|259|(2:261|(1:263))|264|265|266|267|(1:269)|(1:273)(3:271|272|154))|577|(1:575)|576|(0)(0)|166|(0)|169|(0)|172|(1:174)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0))|578|568|(35:572|(0)|576|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0))|577|(0)|576|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0)))|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0)))|135|136|(0)(0)|(2:140|(0)(0))|159|160|(0)(0)|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0))|597|133|(0)|135|136|(0)(0)|(0)|159|160|(0)(0)|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0))|(43:132|133|(0)|135|136|(0)(0)|(0)|159|160|(0)(0)|163|(0)(0)|166|(0)|169|(0)|172|(0)|545|177|178|179|180|181|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265|266|267|(0)|(0)(0))|266|267|(0)|(0)(0))|182|183|184|185|186|187|188|189|(3:190|(0)(0)|226)|231|(0)(0)|259|(0)|264|265) */
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
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0643, code lost:
    
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x099a, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x099d, code lost:
    
        r2.f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x09a2, code lost:
    
        if (r38 == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x09a4, code lost:
    
        if (r32 != false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x09a6, code lost:
    
        if (r39 == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x09a8, code lost:
    
        r2.d.d(r2.f.b() + 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x09bd, code lost:
    
        if ("qos_oneoff".equals(r51) == false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x09bf, code lost:
    
        defpackage.fozu.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x09c2, code lost:
    
        h(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x09cb, code lost:
    
        if (defpackage.foym.e() == false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x09d1, code lost:
    
        if (k(r51) != false) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x09d3, code lost:
    
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x09d6, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x09de, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0b54, code lost:
    
        android.util.Log.e("CCTQosUploaderService", "task exception", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0b5b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x09d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x09da, code lost:
    
        r1 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0b63, code lost:
    
        if ("qos_oneoff".equals(r1) != false) goto L583;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0b65, code lost:
    
        defpackage.fozu.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0b68, code lost:
    
        h(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0b71, code lost:
    
        if (defpackage.foym.e() != false) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0b79, code lost:
    
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0b7c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (k(r2) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        r1.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x045f, code lost:
    
        if (r10.j != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0a14, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0a15, code lost:
    
        r2 = r1;
        r39 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0a1f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0a20, code lost:
    
        r2 = r1;
        r39 = r9;
        r29 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0a72, code lost:
    
        r29 = r2;
        r2 = r1;
        r29 = r4;
        r32 = r8;
        r39 = r9;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0a7e, code lost:
    
        if (r14 == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0a80, code lost:
    
        r0 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0a8c, code lost:
    
        if (defpackage.fozw.a.lK().P() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0a8e, code lost:
    
        r3 = r0.a();
        r0 = r0.b;
        r6 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x0a9c, code lost:
    
        if (r3 == 0) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0aa0, code lost:
    
        if (r3 > r6) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0aa2, code lost:
    
        r8.e((r6 - r3) / 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0aa9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0aab, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0aae, code lost:
    
        if (r14 == false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0ab0, code lost:
    
        r2.f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0ab5, code lost:
    
        if (r15 == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0ab7, code lost:
    
        if (r32 != false) goto L537;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0ab9, code lost:
    
        if (r39 == false) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0abb, code lost:
    
        r2.d.d(r2.f.b() + 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x0ace, code lost:
    
        if ("qos_oneoff".equals(r29) == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ad0, code lost:
    
        defpackage.fozu.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ad3, code lost:
    
        h(r2.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:0x0adc, code lost:
    
        if (defpackage.foym.e() == false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0ae2, code lost:
    
        if (k(r29) != false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0ae4, code lost:
    
        r2.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ae7, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0aeb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0aec, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b1 A[Catch: all -> 0x0b00, TryCatch #19 {all -> 0x0b00, blocks: (B:85:0x014b, B:99:0x0181, B:100:0x0186, B:102:0x0192, B:104:0x0194, B:108:0x01b1, B:109:0x01b8, B:650:0x01a5), top: B:84:0x014b, inners: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0259 A[Catch: all -> 0x0a4b, TryCatch #26 {all -> 0x0a4b, blocks: (B:593:0x022a, B:136:0x024a, B:140:0x0259, B:144:0x0260, B:145:0x026a, B:158:0x027b), top: B:592:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260 A[Catch: all -> 0x0a4b, TryCatch #26 {all -> 0x0a4b, blocks: (B:593:0x022a, B:136:0x024a, B:140:0x0259, B:144:0x0260, B:145:0x026a, B:158:0x027b), top: B:592:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026a A[Catch: all -> 0x0a4b, TryCatch #26 {all -> 0x0a4b, blocks: (B:593:0x022a, B:136:0x024a, B:140:0x0259, B:144:0x0260, B:145:0x026a, B:158:0x027b), top: B:592:0x022a }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0297 A[Catch: all -> 0x0a3c, TryCatch #16 {all -> 0x0a3c, blocks: (B:160:0x0289, B:162:0x0297, B:552:0x029f, B:554:0x02a7, B:556:0x02b3, B:557:0x02ba, B:558:0x02c3, B:560:0x02d7, B:561:0x02dc), top: B:159:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0365 A[Catch: all -> 0x0356, TryCatch #34 {all -> 0x0356, blocks: (B:551:0x0330, B:166:0x035d, B:168:0x0365, B:169:0x0373, B:171:0x0378, B:174:0x0382, B:176:0x0388, B:177:0x0391, B:563:0x02f2, B:568:0x030d, B:575:0x0325, B:576:0x032a), top: B:550:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0378 A[Catch: all -> 0x0356, TryCatch #34 {all -> 0x0356, blocks: (B:551:0x0330, B:166:0x035d, B:168:0x0365, B:169:0x0373, B:171:0x0378, B:174:0x0382, B:176:0x0388, B:177:0x0391, B:563:0x02f2, B:568:0x030d, B:575:0x0325, B:576:0x032a), top: B:550:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0382 A[Catch: all -> 0x0356, TryCatch #34 {all -> 0x0356, blocks: (B:551:0x0330, B:166:0x035d, B:168:0x0365, B:169:0x0373, B:171:0x0378, B:174:0x0382, B:176:0x0388, B:177:0x0391, B:563:0x02f2, B:568:0x030d, B:575:0x0325, B:576:0x032a), top: B:550:0x0330 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x095c A[Catch: all -> 0x0a06, TryCatch #23 {all -> 0x0a06, blocks: (B:252:0x0920, B:253:0x0927, B:255:0x092d, B:257:0x0937, B:258:0x093a, B:259:0x0952, B:261:0x095c, B:263:0x0979, B:264:0x0986), top: B:251:0x0920 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0993 A[Catch: all -> 0x0a02, TRY_LEAVE, TryCatch #20 {all -> 0x0a02, blocks: (B:267:0x098e, B:269:0x0993), top: B:266:0x098e }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x099a A[EDGE_INSN: B:273:0x099a->B:274:0x099a BREAK  A[LOOP:0: B:111:0x01c4->B:154:0x01c4], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0b2b A[Catch: RuntimeException -> 0x0b31, all -> 0x0b5c, TRY_ENTER, TryCatch #22 {RuntimeException -> 0x0b31, blocks: (B:310:0x0b2b, B:314:0x0b39, B:315:0x0b46, B:627:0x0ab0, B:631:0x0abb), top: B:80:0x0137 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0b35 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0330 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x029f A[Catch: all -> 0x0a3c, TryCatch #16 {all -> 0x0a3c, blocks: (B:160:0x0289, B:162:0x0297, B:552:0x029f, B:554:0x02a7, B:556:0x02b3, B:557:0x02ba, B:558:0x02c3, B:560:0x02d7, B:561:0x02dc), top: B:159:0x0289 }] */
    /* JADX WARN: Removed duplicated region for block: B:574:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0a72 A[EDGE_INSN: B:611:0x0a72->B:612:0x0a72 BREAK  A[LOOP:0: B:111:0x01c4->B:154:0x01c4], SYNTHETIC] */
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
            Method dump skipped, instructions count: 2944
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

    QosUploaderChimeraService(final Context context, ashz ashzVar, asio asioVar, ashi ashiVar, asiw asiwVar, aurp aurpVar) {
        this(context, ashzVar, asioVar, ashiVar, asiwVar, aurpVar, ekxd.a(new ekww() { // from class: asir
            @Override // defpackage.ekww
            public final Object lK() {
                int i = QosUploaderChimeraService.a;
                aszs aszsVar = cyjh.a;
                Context context2 = context;
                return new cykl(new cyki(context2), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", context2);
            }
        }));
    }

    public QosUploaderChimeraService(final Context context, ashz ashzVar, asio asioVar, ashi ashiVar, asiw asiwVar, aurp aurpVar, ekww ekwwVar) {
        this.l = fkwm.a.v();
        this.c = context;
        this.k = ashzVar;
        this.d = asioVar;
        this.e = ashiVar;
        this.f = asiwVar;
        this.h = aurpVar;
        this.i = ekwwVar;
        this.j = foym.e() ? ekxd.a(new ekww() { // from class: asiq
            @Override // defpackage.ekww
            public final Object lK() {
                int i = QosUploaderChimeraService.a;
                return asgb.a(context);
            }
        }) : new ekxc(null);
    }
}
