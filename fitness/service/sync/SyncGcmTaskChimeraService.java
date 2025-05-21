package com.google.android.gms.fitness.service.sync;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asot;
import defpackage.bgbg;
import defpackage.bgbh;
import defpackage.bgbi;
import defpackage.bgbj;
import defpackage.bguu;
import defpackage.bgzc;
import defpackage.bhae;
import defpackage.bhaf;
import defpackage.bry;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.eijr;
import defpackage.eits;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SyncGcmTaskChimeraService extends GmsTaskChimeraService {
    static final eits a;
    public static final /* synthetic */ int b = 0;
    private static final asot c = bhaf.a();
    private static final bgbj d;
    private static final Map e;

    static {
        eijr eijrVar = new eijr() { // from class: bgur
            @Override // defpackage.eijr
            public final Object a() {
                return foei.a.a().y();
            }
        };
        bgbh bgbhVar = new bgbh() { // from class: bgus
            @Override // defpackage.bgbh
            public final Object a(Object obj, Object obj2) {
                String str = (String) obj;
                int i = SyncGcmTaskChimeraService.b;
                eito eitoVar = new eito();
                try {
                    for (Map.Entry entry : bhad.b(str).entrySet()) {
                        eitoVar.i(Integer.valueOf((String) entry.getKey()), Long.valueOf((String) entry.getValue()));
                    }
                    return eitoVar.b();
                } catch (IllegalArgumentException unused) {
                    return ejcg.a;
                }
            }
        };
        int i = bgbg.a;
        d = new bgbi(eijrVar, bgbhVar);
        a = eits.n(bguu.SKIPPED, "com.google.android.gms.fitness.sync.SKIPPED", bguu.SUCCESS, "com.google.android.gms.fitness.sync.SUCCESS", bguu.FAILURE, "com.google.android.gms.fitness.sync.FAILED");
        e = new bry();
    }

    static int d(String str) {
        return ((Integer) bhae.a(e, str, -1)).intValue();
    }

    static void e(String str, int i) {
        Map map = e;
        synchronized (map) {
            map.put(str, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:40|(3:42|(1:44)|45)(1:503)|46|47|(17:48|49|50|51|52|53|54|55|(1:57)|58|59|60|61|62|63|64|65)|(18:(6:67|68|69|70|71|(60:73|74|75|(1:478)(2:79|(2:81|82)(53:477|84|85|86|87|(8:90|91|92|93|94|(2:96|97)(1:99)|98|88)|320|321|322|323|324|325|(1:327)(3:467|(1:469)|470)|328|(3:330|(2:331|(3:333|(2:335|336)(7:338|(1:340)|341|(4:344|(2:346|347)(1:349)|348|342)|350|351|352)|337))|354)|355|356|(4:359|(2:361|362)(1:364)|363|357)|365|366|(11:368|(1:370)|371|(1:373)|374|(4:376|(1:378)(5:402|(1:404)|405|(1:407)(2:408|(2:410|(2:412|(1:414))))|(6:381|(1:383)|384|(1:386)|387|(1:392)(1:391)))|379|(0))(1:415)|393|(1:395)|396|(2:398|399)(1:401)|400)|416|417|(1:419)|420|(1:422)|423|(1:425)|426|(14:429|(1:431)|432|(1:434)|435|(1:437)|438|(7:440|(1:442)(1:450)|443|(1:445)|446|(1:448)|449)|451|(1:453)|454|(2:456|457)(1:459)|458|427)|460|461|(2:463|464)|466|103|104|105|106|107|108|109|(1:111)(1:302)|112|114|115|(2:288|(1:299)(1:298))(1:121)|122|(1:124)(35:131|132|133|134|(4:137|138|(2:140|141)(1:142)|135)|143|144|(2:146|(1:148)(2:149|(1:151)(2:152|(1:157)(1:156))))(5:277|278|279|280|(5:282|126|127|(1:129)|130)(1:283))|158|(2:160|(2:162|(1:164)(1:274))(1:275))(1:276)|165|166|168|(2:170|(2:172|(2:174|(3:218|(1:220)|221))(3:222|(1:224)|225))(3:226|(1:228)|229))(3:230|(1:232)|233)|176|177|178|(1:180)(1:211)|(1:182)(1:210)|183|(1:185)|186|(1:188)|189|(1:191)|192|(1:194)|195|(4:198|(3:200|201|202)(1:204)|203|196)|205|206|(1:208)(1:209)|127|(0)|130)|125|126|127|(0)|130))|83|84|85|86|87|(1:88)|320|321|322|323|324|325|(0)(0)|328|(0)|355|356|(1:357)|365|366|(0)|416|417|(0)|420|(0)|423|(0)|426|(1:427)|460|461|(0)|466|103|104|105|106|107|108|109|(0)(0)|112|114|115|(1:117)|288|(1:290)|299|122|(0)(0)|125|126|127|(0)|130)(1:479))(1:483)|108|109|(0)(0)|112|114|115|(0)|288|(0)|299|122|(0)(0)|125|126|127|(0)|130)|480|74|75|(1:77)|478|83|84|85|86|87|(1:88)|320|321|322|323|324|325|(0)(0)|328|(0)|355|356|(1:357)|365|366|(0)|416|417|(0)|420|(0)|423|(0)|426|(1:427)|460|461|(0)|466|103|104|105|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0d24, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0d25, code lost:
    
        r1 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0d28, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0693, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x069b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x069c, code lost:
    
        r47 = r4;
        r46 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x074b A[Catch: all -> 0x0cf8, TryCatch #15 {all -> 0x0cf8, blocks: (B:115:0x0737, B:117:0x074b, B:119:0x0751, B:121:0x0758, B:122:0x0786, B:124:0x07a3, B:131:0x07cd, B:134:0x07da, B:135:0x07e2, B:137:0x07e8, B:141:0x07f6, B:144:0x081f, B:146:0x0827, B:148:0x082d, B:149:0x0857, B:151:0x0871, B:152:0x089e, B:154:0x08a4, B:156:0x08af, B:277:0x08df, B:288:0x075b, B:290:0x0767, B:292:0x076d, B:294:0x0773, B:296:0x077a, B:298:0x0781, B:299:0x0784), top: B:114:0x0737 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x07a3 A[Catch: all -> 0x0cf8, TryCatch #15 {all -> 0x0cf8, blocks: (B:115:0x0737, B:117:0x074b, B:119:0x0751, B:121:0x0758, B:122:0x0786, B:124:0x07a3, B:131:0x07cd, B:134:0x07da, B:135:0x07e2, B:137:0x07e8, B:141:0x07f6, B:144:0x081f, B:146:0x0827, B:148:0x082d, B:149:0x0857, B:151:0x0871, B:152:0x089e, B:154:0x08a4, B:156:0x08af, B:277:0x08df, B:288:0x075b, B:290:0x0767, B:292:0x076d, B:294:0x0773, B:296:0x077a, B:298:0x0781, B:299:0x0784), top: B:114:0x0737 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0cb7 A[Catch: all -> 0x0cf4, TryCatch #13 {all -> 0x0cf4, blocks: (B:27:0x0cbc, B:29:0x0cc6, B:30:0x0ccd, B:32:0x0cd1, B:34:0x0cd9, B:127:0x0c99, B:129:0x0cb7, B:130:0x0cb9, B:213:0x0cfc, B:215:0x0d1b, B:216:0x0d1d, B:217:0x0d20), top: B:24:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x07cd A[Catch: all -> 0x0cf8, TRY_LEAVE, TryCatch #15 {all -> 0x0cf8, blocks: (B:115:0x0737, B:117:0x074b, B:119:0x0751, B:121:0x0758, B:122:0x0786, B:124:0x07a3, B:131:0x07cd, B:134:0x07da, B:135:0x07e2, B:137:0x07e8, B:141:0x07f6, B:144:0x081f, B:146:0x0827, B:148:0x082d, B:149:0x0857, B:151:0x0871, B:152:0x089e, B:154:0x08a4, B:156:0x08af, B:277:0x08df, B:288:0x075b, B:290:0x0767, B:292:0x076d, B:294:0x0773, B:296:0x077a, B:298:0x0781, B:299:0x0784), top: B:114:0x0737 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0d1b A[Catch: all -> 0x0cf4, TryCatch #13 {all -> 0x0cf4, blocks: (B:27:0x0cbc, B:29:0x0cc6, B:30:0x0ccd, B:32:0x0cd1, B:34:0x0cd9, B:127:0x0c99, B:129:0x0cb7, B:130:0x0cb9, B:213:0x0cfc, B:215:0x0d1b, B:216:0x0d1d, B:217:0x0d20), top: B:24:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0767 A[Catch: all -> 0x0cf8, TryCatch #15 {all -> 0x0cf8, blocks: (B:115:0x0737, B:117:0x074b, B:119:0x0751, B:121:0x0758, B:122:0x0786, B:124:0x07a3, B:131:0x07cd, B:134:0x07da, B:135:0x07e2, B:137:0x07e8, B:141:0x07f6, B:144:0x081f, B:146:0x0827, B:148:0x082d, B:149:0x0857, B:151:0x0871, B:152:0x089e, B:154:0x08a4, B:156:0x08af, B:277:0x08df, B:288:0x075b, B:290:0x0767, B:292:0x076d, B:294:0x0773, B:296:0x077a, B:298:0x0781, B:299:0x0784), top: B:114:0x0737 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0cc6 A[Catch: all -> 0x0cf4, TryCatch #13 {all -> 0x0cf4, blocks: (B:27:0x0cbc, B:29:0x0cc6, B:30:0x0ccd, B:32:0x0cd1, B:34:0x0cd9, B:127:0x0c99, B:129:0x0cb7, B:130:0x0cb9, B:213:0x0cfc, B:215:0x0d1b, B:216:0x0d1d, B:217:0x0d20), top: B:24:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0d3c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0cd1 A[Catch: all -> 0x0cf4, TryCatch #13 {all -> 0x0cf4, blocks: (B:27:0x0cbc, B:29:0x0cc6, B:30:0x0ccd, B:32:0x0cd1, B:34:0x0cd9, B:127:0x0c99, B:129:0x0cb7, B:130:0x0cb9, B:213:0x0cfc, B:215:0x0d1b, B:216:0x0d1d, B:217:0x0d20), top: B:24:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0334 A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0407 A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x044a A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0cea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x04cf A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x054a A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x056d A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0586 A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x059f A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0681 A[Catch: IOException -> 0x0693, all -> 0x0d28, TRY_LEAVE, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x02c4 A[Catch: IOException -> 0x0693, all -> 0x0d28, TryCatch #5 {IOException -> 0x0693, blocks: (B:325:0x028e, B:328:0x02f6, B:330:0x0334, B:331:0x033f, B:333:0x0343, B:337:0x03ec, B:338:0x035d, B:340:0x037c, B:341:0x037f, B:342:0x039c, B:344:0x03a2, B:346:0x03c1, B:348:0x03c4, B:351:0x03e3, B:356:0x03fb, B:357:0x0401, B:359:0x0407, B:361:0x041d, B:363:0x0420, B:366:0x043b, B:368:0x044a, B:370:0x0456, B:371:0x0458, B:373:0x045c, B:374:0x045e, B:376:0x0466, B:381:0x04cf, B:383:0x04d3, B:384:0x04d5, B:386:0x04d9, B:387:0x04db, B:389:0x04e5, B:392:0x04ef, B:393:0x04fa, B:395:0x04fe, B:396:0x0500, B:398:0x050b, B:400:0x050d, B:402:0x0474, B:404:0x0486, B:405:0x0489, B:407:0x04aa, B:408:0x04b1, B:410:0x04ba, B:412:0x04c6, B:417:0x0524, B:419:0x054a, B:420:0x054d, B:422:0x056d, B:423:0x0570, B:425:0x0586, B:426:0x0589, B:427:0x0599, B:429:0x059f, B:431:0x05b5, B:432:0x05b7, B:434:0x05c1, B:435:0x05c4, B:437:0x05dc, B:438:0x05df, B:440:0x05ed, B:442:0x0606, B:443:0x060b, B:445:0x061b, B:446:0x061e, B:448:0x063a, B:449:0x063d, B:450:0x0609, B:451:0x0649, B:453:0x0651, B:454:0x0654, B:456:0x0669, B:458:0x066f, B:461:0x0676, B:463:0x0681, B:467:0x02c4, B:469:0x02d6, B:470:0x02d8), top: B:324:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v29, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r0v32, types: [bggi] */
    /* JADX WARN: Type inference failed for: r0v48, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r0v53, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v29, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r1v37, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bgaf] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v11, types: [bggi] */
    /* JADX WARN: Type inference failed for: r6v21, types: [bgaf] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(defpackage.byln r52) {
        /*
            Method dump skipped, instructions count: 3422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.service.sync.SyncGcmTaskChimeraService.a(byln):int");
    }

    protected final synchronized void f(Context context, Bundle bundle, String str, long j) {
        byjl a2 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.j = "com.google.android.gms.fitness.sync.SyncGcmTaskService";
        Set set = bgzc.a;
        bykjVar.t("FitGcmTask_AfterAppCallback_".concat(str));
        bykjVar.v(1);
        bykjVar.y(0, 0);
        bykjVar.u = bundle;
        bykjVar.e(j, 5 + j);
        a2.f(bykjVar.b());
    }
}
