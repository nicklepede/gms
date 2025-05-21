package com.google.android.gms.notifications;

import android.accounts.Account;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.chimera.IntentOperation;
import defpackage.abnj$$ExternalSyntheticApiModelOutline0;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asit;
import defpackage.asnd;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.bxvr;
import defpackage.bzgc;
import defpackage.crzb;
import defpackage.crzj;
import defpackage.crzm;
import defpackage.crzn;
import defpackage.crzq;
import defpackage.crzr;
import defpackage.crzt;
import defpackage.crzu;
import defpackage.crzv;
import defpackage.csax;
import defpackage.csay;
import defpackage.csbb;
import defpackage.csbe;
import defpackage.csbf;
import defpackage.csfm;
import defpackage.csfn;
import defpackage.dfaq;
import defpackage.dfee;
import defpackage.dhqf;
import defpackage.egep;
import defpackage.eges;
import defpackage.egew;
import defpackage.egfa;
import defpackage.egfc;
import defpackage.egfe;
import defpackage.eghv;
import defpackage.eghw;
import defpackage.eghx;
import defpackage.eghy;
import defpackage.eghz;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.feab;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fgbv;
import defpackage.fgbx;
import defpackage.fgby;
import defpackage.fgcc;
import defpackage.fgcd;
import defpackage.fqnl;
import defpackage.fqnm;
import defpackage.fttm;
import defpackage.ftxb;
import defpackage.ftxd;
import defpackage.ftxe;
import defpackage.ftyg;
import defpackage.furn;
import defpackage.furo;
import defpackage.fusb;
import defpackage.fvbo;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GunsIntentOperation extends IntentOperation {
    private static final asot a = asot.b("GunsIntentOperation", asej.GUNS);
    private static final long b = TimeUnit.SECONDS.toMicros(10);
    private dfaq c;
    private bqqa d;

    public static String a(egew egewVar) {
        if (crzq.f(egewVar) && crzq.g(egewVar)) {
            eges egesVar = egewVar.d;
            if (egesVar == null) {
                egesVar = eges.a;
            }
            String str = egesVar.d;
            egfa egfaVar = egewVar.c;
            if (egfaVar == null) {
                egfaVar = egfa.a;
            }
            return str + ":" + egfaVar.c;
        }
        if (!crzq.g(egewVar)) {
            eges egesVar2 = egewVar.d;
            if (egesVar2 == null) {
                egesVar2 = eges.a;
            }
            return egesVar2.g;
        }
        eges egesVar3 = egewVar.d;
        if (egesVar3 == null) {
            egesVar3 = eges.a;
        }
        String str2 = egesVar3.g;
        egfa egfaVar2 = egewVar.c;
        if (egfaVar2 == null) {
            egfaVar2 = egfa.a;
        }
        return str2 + ":" + egfaVar2.c;
    }

    private final PendingIntent d(egew egewVar, Intent intent) {
        return PendingIntent.getBroadcast(this, a(egewVar).hashCode(), crzm.b(this, intent, 6, true, "com.google.android.gms.notifications.intents.EXPIRE_NOTIFICATION", null), 134217728);
    }

    private final dfaq e() {
        if (this.c == null) {
            this.c = dhqf.a(getApplicationContext()).aL();
        }
        return this.c;
    }

    private final String f(egew egewVar) {
        egfa egfaVar = egewVar.c;
        if (egfaVar == null) {
            egfaVar = egfa.a;
        }
        String str = egfaVar.c;
        Context applicationContext = getApplicationContext();
        try {
            for (Account account : asnd.h(applicationContext, applicationContext.getPackageName())) {
                String str2 = account.name;
                String str3 = uny.a;
                if (str.equals(uoh.e(applicationContext, str2))) {
                    return account.name;
                }
            }
            return null;
        } catch (IOException | unx e) {
            ((ejhf) ((ejhf) a.j()).s(e)).B("Failed to get account ID for OID: %s.", str);
            return null;
        }
    }

    private final void g(Intent intent, egew egewVar) {
        Context applicationContext = getApplicationContext();
        Intent className = new Intent().setClassName(applicationContext, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        className.setAction("com.google.android.gms.notifications.intents.SHOW_NOTIFICATION");
        className.putExtras(intent);
        className.putExtra("GunsService.refetch", false);
        className.putExtra("gms.gnots.payload", crzq.d(egewVar));
        applicationContext.sendOrderedBroadcast(className, null);
    }

    private final void h(eitj eitjVar) {
        int size = eitjVar.size();
        for (int i = 0; i < size; i++) {
            egew egewVar = (egew) eitjVar.get(i);
            if ((egewVar.b & 8) != 0) {
                fecj w = egew.a.w(egewVar);
                egfe egfeVar = egewVar.f;
                if (egfeVar == null) {
                    egfeVar = egfe.a;
                }
                fecj w2 = egfe.a.w(egfeVar);
                if (!w2.b.L()) {
                    w2.U();
                }
                fecp fecpVar = w2.b;
                egfe egfeVar2 = (egfe) fecpVar;
                egfeVar2.b |= 2048;
                egfeVar2.n = false;
                if (!fecpVar.L()) {
                    w2.U();
                }
                egfe egfeVar3 = (egfe) w2.b;
                egfeVar3.b |= 4096;
                egfeVar3.o = false;
                if (!w.b.L()) {
                    w.U();
                }
                egew egewVar2 = (egew) w.b;
                egfe egfeVar4 = (egfe) w2.Q();
                egfeVar4.getClass();
                egewVar2.f = egfeVar4;
                egewVar2.b |= 8;
                egewVar = (egew) w.Q();
            }
            Intent intent = new Intent();
            intent.putExtra("GunsService.refetch", false);
            intent.putExtra("GunsService.loadedFromDb", true);
            g(intent, egewVar);
        }
    }

    private final void i(egew egewVar) {
        if (fqnl.f()) {
            asbo.f(this).o(a(egewVar), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, dfee.NOTIFICATIONS_MODULE);
        } else {
            asbo.f(this).n(a(egewVar), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        if (fqnm.a.a().a()) {
            new asit(this).a(d(egewVar, new Intent()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r1.equals(r4.d.toLowerCase()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x071f, code lost:
    
        if (r5 > 0) goto L414;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(android.content.Intent r35, defpackage.egew r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 2110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.GunsIntentOperation.j(android.content.Intent, egew, java.lang.String):void");
    }

    private final boolean k() {
        getApplicationContext();
        getApplicationContext();
        getApplicationContext();
        return !fqnl.a.a().p();
    }

    private final boolean l(egew egewVar) {
        boolean c = k() ? crzu.c(this, a(egewVar)) : false;
        i(egewVar);
        return c;
    }

    private final void m(int i, egew egewVar, String str) {
        csax b2 = csay.a(getApplicationContext(), str, e(), egewVar.m).b(i);
        b2.b = egewVar;
        b2.b();
    }

    public final void b(Intent intent, egew egewVar, String str, int i) {
        eghz eghzVar;
        csbe csbbVar;
        ftxe ftxeVar;
        String id;
        int importance;
        String group;
        String group2;
        if (!TextUtils.isEmpty(str) && crzq.f(egewVar) && crzq.g(egewVar)) {
            Context applicationContext = getApplicationContext();
            asot asotVar = crzj.a;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    ((ejhf) crzj.a.i()).N("%s failed to fetch notification by identifier. Reached maximal number of retries %s.", "GunsFetchByIdentifierOperation", 3);
                    csax b2 = csay.a(applicationContext, str, dhqf.a(applicationContext).aL(), egewVar.m).b(38);
                    b2.b = egewVar;
                    b2.b();
                    eghzVar = eghz.a;
                    break;
                }
                try {
                    try {
                        egfa egfaVar = egewVar.c;
                        if (egfaVar == null) {
                            egfaVar = egfa.a;
                        }
                        String str2 = egfaVar.c;
                        eges egesVar = egewVar.d;
                        if (egesVar == null) {
                            egesVar = eges.a;
                        }
                        fecj v = eghv.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        eghv eghvVar = (eghv) v.b;
                        egesVar.getClass();
                        fedh fedhVar = eghvVar.c;
                        if (!fedhVar.c()) {
                            eghvVar.c = fecp.E(fedhVar);
                        }
                        eghvVar.c.add(egesVar);
                        fecj v2 = egfc.a.v();
                        String a2 = crzb.a(applicationContext);
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        egfc egfcVar = (egfc) v2.b;
                        a2.getClass();
                        egfcVar.b |= 2;
                        egfcVar.d = a2;
                        DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
                        int i3 = displayMetrics.densityDpi >= 480 ? 6 : displayMetrics.densityDpi >= 320 ? 4 : displayMetrics.densityDpi >= 240 ? 3 : displayMetrics.densityDpi >= 213 ? 5 : displayMetrics.densityDpi >= 160 ? 2 : 1;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        egfc egfcVar2 = (egfc) v2.b;
                        egfcVar2.c = i3 - 1;
                        egfcVar2.b |= 1;
                        int i4 = Build.VERSION.SDK_INT;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        egfc egfcVar3 = (egfc) v2.b;
                        egfcVar3.b |= 4;
                        egfcVar3.e = i4;
                        float f = applicationContext.getResources().getDisplayMetrics().density;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        egfc egfcVar4 = (egfc) v2.b;
                        egfcVar4.b |= 8;
                        egfcVar4.f = f;
                        String id2 = TimeZone.getDefault().getID();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        egfc egfcVar5 = (egfc) v2.b;
                        id2.getClass();
                        egfcVar5.b |= 16;
                        egfcVar5.g = id2;
                        if (asqh.c()) {
                            asot asotVar2 = crzt.a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = asbo.f(applicationContext).i().iterator();
                            while (it.hasNext()) {
                                NotificationChannel m = abnj$$ExternalSyntheticApiModelOutline0.m(it.next());
                                fecj v3 = egep.a.v();
                                id = m.getId();
                                if (!v3.b.L()) {
                                    v3.U();
                                }
                                egep egepVar = (egep) v3.b;
                                id.getClass();
                                egepVar.b |= 1;
                                egepVar.c = id;
                                importance = m.getImportance();
                                int i5 = importance != 0 ? importance != 1 ? importance != 2 ? importance != 3 ? importance != 4 ? importance != 5 ? 1 : 6 : 4 : 3 : 5 : 7 : 2;
                                if (!v3.b.L()) {
                                    v3.U();
                                }
                                egep egepVar2 = (egep) v3.b;
                                egepVar2.h = i5 - 1;
                                egepVar2.b |= 32;
                                group = m.getGroup();
                                if (!TextUtils.isEmpty(group)) {
                                    group2 = m.getGroup();
                                    if (!v3.b.L()) {
                                        v3.U();
                                    }
                                    egep egepVar3 = (egep) v3.b;
                                    group2.getClass();
                                    egepVar3.b |= 8;
                                    egepVar3.f = group2;
                                }
                                arrayList.add((egep) v3.Q());
                            }
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            egfc egfcVar6 = (egfc) v2.b;
                            fedh fedhVar2 = egfcVar6.h;
                            if (!fedhVar2.c()) {
                                egfcVar6.h = fecp.E(fedhVar2);
                            }
                            feab.E(arrayList, egfcVar6.h);
                        }
                        egfc egfcVar7 = (egfc) v2.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        eghv eghvVar2 = (eghv) v.b;
                        egfcVar7.getClass();
                        eghvVar2.d = egfcVar7;
                        eghvVar2.b |= 1;
                        eghv eghvVar3 = (eghv) v.Q();
                        fgbx fgbxVar = fgbx.a;
                        fecj v4 = fgbxVar.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fgbx fgbxVar2 = (fgbx) v4.b;
                        eghvVar3.getClass();
                        fgbxVar2.d = eghvVar3;
                        fgbxVar2.b |= 2;
                        fgbv a3 = crzv.a(applicationContext);
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fgbx fgbxVar3 = (fgbx) v4.b;
                        a3.getClass();
                        fgbxVar3.c = a3;
                        fgbxVar3.b |= 1;
                        csfm a4 = csfn.a();
                        fgbx fgbxVar4 = (fgbx) v4.Q();
                        fvbo.f(str, "accountName");
                        fvbo.f(fgbxVar4, "gmsGnotsFetchByIdentifierRequest");
                        try {
                            fgcc a5 = csfm.a(csfm.b((fgcc) a4.a.o(bzgc.a, bxvr.b)), str);
                            fttm fttmVar = a5.a;
                            ftxe ftxeVar2 = fgcd.a;
                            if (ftxeVar2 == null) {
                                synchronized (fgcd.class) {
                                    ftxeVar = fgcd.a;
                                    if (ftxeVar == null) {
                                        ftxb a6 = ftxe.a();
                                        a6.c = ftxd.UNARY;
                                        a6.d = ftxe.c("social.boq.notifications.gmscoreapi.GunsGmscoreApiService", "GmsGnotsFetchByIdentifier");
                                        a6.b();
                                        febw febwVar = furo.a;
                                        a6.a = new furn(fgbxVar);
                                        a6.b = new furn(fgby.a);
                                        ftxe a7 = a6.a();
                                        fgcd.a = a7;
                                        ftxeVar = a7;
                                    }
                                }
                                ftxeVar2 = ftxeVar;
                            }
                            csbbVar = new csbf((fgby) fusb.b(fttmVar, ftxeVar2, a5.b, fgbxVar4));
                        } catch (ftyg e) {
                            csbbVar = new csbb(e);
                        }
                        eghzVar = ((fgby) csbbVar.c()).b;
                        if (eghzVar != null) {
                            break;
                        }
                        eghzVar = eghz.a;
                        break;
                    } catch (VolleyError e2) {
                        e = e2;
                        ((ejhf) ((ejhf) crzj.a.j()).s(e)).N("%s failed to fetch notification by identifier. Retry number %s.", "GunsFetchByIdentifierOperation", i2);
                        try {
                            Thread.sleep(500L);
                        } catch (InterruptedException unused) {
                        }
                        i2++;
                    } catch (unx e3) {
                        e = e3;
                        ((ejhf) ((ejhf) crzj.a.j()).s(e)).N("%s failed to fetch notification by identifier. Retry number %s.", "GunsFetchByIdentifierOperation", i2);
                        Thread.sleep(500L);
                        i2++;
                    }
                } catch (ftyg e4) {
                    e = e4;
                    ((ejhf) ((ejhf) crzj.a.j()).s(e)).N("%s failed to fetch notification by identifier. Retry number %s.", "GunsFetchByIdentifierOperation", i2);
                    Thread.sleep(500L);
                    i2++;
                }
                i2++;
            }
            long j = eghzVar.c;
            if (j > 0) {
                intent.putExtra("GunsService.serverTimeUsec", j);
            }
            if (eghzVar.b.size() <= 0) {
                g(intent, egewVar);
                return;
            }
            for (egew egewVar2 : eghzVar.b) {
                if ((egewVar2.b & 8) != 0) {
                    csax c = csay.a(applicationContext, str, e(), egewVar2.m).c(43);
                    c.b = egewVar2;
                    c.d = i;
                    c.b();
                }
                g(intent, egewVar2);
            }
        }
    }

    public final void c(egew egewVar, String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || !crzq.f(egewVar)) {
            return;
        }
        asot asotVar = crzr.a;
        Context applicationContext = getApplicationContext();
        try {
            eges egesVar = egewVar.d;
            if (egesVar == null) {
                egesVar = eges.a;
            }
            String str3 = egesVar.d;
            eges egesVar2 = egewVar.d;
            if (egesVar2 == null) {
                egesVar2 = eges.a;
            }
            fecj v = eghw.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            eghw eghwVar = (eghw) fecpVar;
            egesVar2.getClass();
            eghwVar.c = egesVar2;
            eghwVar.b |= 1;
            if (!fecpVar.L()) {
                v.U();
            }
            fecp fecpVar2 = v.b;
            eghw eghwVar2 = (eghw) fecpVar2;
            eghwVar2.d = i - 1;
            eghwVar2.b |= 4;
            if (str2 != null) {
                if (!fecpVar2.L()) {
                    v.U();
                }
                eghw eghwVar3 = (eghw) v.b;
                eghwVar3.b |= 8;
                eghwVar3.e = str2;
            }
            eghx eghxVar = (eghx) eghy.a.v();
            eghxVar.a(v);
            eghy eghyVar = (eghy) eghxVar.Q();
            egfa egfaVar = egewVar.c;
            if (egfaVar == null) {
                egfaVar = egfa.a;
            }
            String str4 = egfaVar.c;
            crzn.a(applicationContext, str, eghyVar);
        } catch (VolleyError | ftyg | unx e) {
            ((ejhf) ((ejhf) crzr.a.i()).s(e)).x("Failed to update the notification(s) read state.");
            csax b2 = csay.a(applicationContext, str, dhqf.a(applicationContext).aL(), egewVar.m).b(17);
            b2.b = egewVar;
            b2.b();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        getApplicationContext();
        eijr eijrVar = bqqe.a;
        this.d = new bqqa();
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0180 A[Catch: all -> 0x0313, TryCatch #0 {all -> 0x0313, blocks: (B:12:0x000c, B:14:0x0018, B:16:0x001e, B:17:0x002b, B:19:0x0034, B:21:0x0040, B:23:0x0046, B:24:0x0057, B:26:0x005d, B:28:0x0069, B:30:0x0073, B:31:0x0080, B:33:0x0086, B:36:0x0092, B:39:0x0098, B:45:0x009c, B:47:0x00a6, B:48:0x00aa, B:50:0x00b0, B:52:0x00c3, B:54:0x00d1, B:56:0x00eb, B:58:0x00f2, B:60:0x00fe, B:61:0x0103, B:64:0x0110, B:66:0x0116, B:69:0x016b, B:71:0x0171, B:73:0x0180, B:75:0x0186, B:76:0x01b3, B:78:0x01b7, B:80:0x01bd, B:82:0x01c3, B:84:0x01e0, B:85:0x01e7, B:87:0x01f0, B:89:0x01f6, B:92:0x020f, B:94:0x0219, B:95:0x021b, B:97:0x021f, B:98:0x0222, B:100:0x0228, B:101:0x022b, B:103:0x0247, B:105:0x0255, B:106:0x025c, B:108:0x0264, B:110:0x0273, B:111:0x027a, B:113:0x0282, B:116:0x028c, B:118:0x0294, B:120:0x02a3, B:122:0x02a9, B:124:0x02af, B:126:0x02b5, B:127:0x02b9, B:129:0x02bf, B:131:0x02c5, B:132:0x02cc, B:133:0x02e9, B:134:0x018b, B:137:0x0193, B:139:0x0199, B:140:0x011f, B:142:0x0125, B:143:0x0147, B:145:0x014d, B:147:0x0164, B:148:0x0166, B:149:0x0139), top: B:11:0x000c }] */
    @Override // com.google.android.chimera.IntentOperation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onHandleIntent(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.GunsIntentOperation.onHandleIntent(android.content.Intent):void");
    }
}
