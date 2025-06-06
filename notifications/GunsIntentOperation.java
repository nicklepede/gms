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
import defpackage.abnm$$ExternalSyntheticApiModelOutline0;
import defpackage.aued;
import defpackage.auid;
import defpackage.aumn;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.caej;
import defpackage.cbot;
import defpackage.cuig;
import defpackage.cuio;
import defpackage.cuir;
import defpackage.cuis;
import defpackage.cuiv;
import defpackage.cuiw;
import defpackage.cuiy;
import defpackage.cuiz;
import defpackage.cuja;
import defpackage.cukc;
import defpackage.cukd;
import defpackage.cukg;
import defpackage.cukj;
import defpackage.cukk;
import defpackage.cuor;
import defpackage.cuos;
import defpackage.dhlw;
import defpackage.dhpk;
import defpackage.dkbl;
import defpackage.eirs;
import defpackage.eirv;
import defpackage.eirz;
import defpackage.eisd;
import defpackage.eisf;
import defpackage.eish;
import defpackage.eiuy;
import defpackage.eiuz;
import defpackage.eiva;
import defpackage.eivb;
import defpackage.eivc;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.fgou;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fiqt;
import defpackage.fiqv;
import defpackage.fiqw;
import defpackage.fira;
import defpackage.firb;
import defpackage.fthh;
import defpackage.fthi;
import defpackage.fwpk;
import defpackage.fwsz;
import defpackage.fwtb;
import defpackage.fwtc;
import defpackage.fwue;
import defpackage.fxnl;
import defpackage.fxnm;
import defpackage.fxnz;
import defpackage.fxxm;
import defpackage.wjw;
import defpackage.wjx;
import defpackage.wkg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GunsIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("GunsIntentOperation", auid.GUNS);
    private static final long b = TimeUnit.SECONDS.toMicros(10);
    private dhlw c;
    private bsxr d;

    public static String a(eirz eirzVar) {
        if (cuiv.f(eirzVar) && cuiv.g(eirzVar)) {
            eirv eirvVar = eirzVar.d;
            if (eirvVar == null) {
                eirvVar = eirv.a;
            }
            String str = eirvVar.d;
            eisd eisdVar = eirzVar.c;
            if (eisdVar == null) {
                eisdVar = eisd.a;
            }
            return str + ":" + eisdVar.c;
        }
        if (!cuiv.g(eirzVar)) {
            eirv eirvVar2 = eirzVar.d;
            if (eirvVar2 == null) {
                eirvVar2 = eirv.a;
            }
            return eirvVar2.g;
        }
        eirv eirvVar3 = eirzVar.d;
        if (eirvVar3 == null) {
            eirvVar3 = eirv.a;
        }
        String str2 = eirvVar3.g;
        eisd eisdVar2 = eirzVar.c;
        if (eisdVar2 == null) {
            eisdVar2 = eisd.a;
        }
        return str2 + ":" + eisdVar2.c;
    }

    private final PendingIntent d(eirz eirzVar, Intent intent) {
        return PendingIntent.getBroadcast(this, a(eirzVar).hashCode(), cuir.b(this, intent, 6, true, "com.google.android.gms.notifications.intents.EXPIRE_NOTIFICATION", null), 134217728);
    }

    private final dhlw e() {
        if (this.c == null) {
            this.c = dkbl.a(getApplicationContext()).aK();
        }
        return this.c;
    }

    private final String f(eirz eirzVar) {
        eisd eisdVar = eirzVar.c;
        if (eisdVar == null) {
            eisdVar = eisd.a;
        }
        String str = eisdVar.c;
        Context applicationContext = getApplicationContext();
        try {
            for (Account account : auqx.h(applicationContext, applicationContext.getPackageName())) {
                String str2 = account.name;
                String str3 = wjx.a;
                if (str.equals(wkg.e(applicationContext, str2))) {
                    return account.name;
                }
            }
            return null;
        } catch (IOException | wjw e) {
            ((eluo) ((eluo) a.j()).s(e)).B("Failed to get account ID for OID: %s.", str);
            return null;
        }
    }

    private final void g(Intent intent, eirz eirzVar) {
        Context applicationContext = getApplicationContext();
        Intent className = new Intent().setClassName(applicationContext, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        className.setAction("com.google.android.gms.notifications.intents.SHOW_NOTIFICATION");
        className.putExtras(intent);
        className.putExtra("GunsService.refetch", false);
        className.putExtra("gms.gnots.payload", cuiv.d(eirzVar));
        applicationContext.sendOrderedBroadcast(className, null);
    }

    private final void h(elgo elgoVar) {
        int size = elgoVar.size();
        for (int i = 0; i < size; i++) {
            eirz eirzVar = (eirz) elgoVar.get(i);
            if ((eirzVar.b & 8) != 0) {
                fgrc w = eirz.a.w(eirzVar);
                eish eishVar = eirzVar.f;
                if (eishVar == null) {
                    eishVar = eish.a;
                }
                fgrc w2 = eish.a.w(eishVar);
                if (!w2.b.L()) {
                    w2.U();
                }
                fgri fgriVar = w2.b;
                eish eishVar2 = (eish) fgriVar;
                eishVar2.b |= 2048;
                eishVar2.n = false;
                if (!fgriVar.L()) {
                    w2.U();
                }
                eish eishVar3 = (eish) w2.b;
                eishVar3.b |= 4096;
                eishVar3.o = false;
                if (!w.b.L()) {
                    w.U();
                }
                eirz eirzVar2 = (eirz) w.b;
                eish eishVar4 = (eish) w2.Q();
                eishVar4.getClass();
                eirzVar2.f = eishVar4;
                eirzVar2.b |= 8;
                eirzVar = (eirz) w.Q();
            }
            Intent intent = new Intent();
            intent.putExtra("GunsService.refetch", false);
            intent.putExtra("GunsService.loadedFromDb", true);
            g(intent, eirzVar);
        }
    }

    private final void i(eirz eirzVar) {
        if (fthh.f()) {
            aued.f(this).o(a(eirzVar), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, dhpk.NOTIFICATIONS_MODULE);
        } else {
            aued.f(this).n(a(eirzVar), ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
        }
        if (fthi.a.lK().a()) {
            new aumn(this).a(d(eirzVar, new Intent()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r1.equals(r4.d.toLowerCase()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x071d, code lost:
    
        if (r5 > 0) goto L414;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(android.content.Intent r35, defpackage.eirz r36, java.lang.String r37) {
        /*
            Method dump skipped, instructions count: 2108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.notifications.GunsIntentOperation.j(android.content.Intent, eirz, java.lang.String):void");
    }

    private final boolean k() {
        getApplicationContext();
        getApplicationContext();
        getApplicationContext();
        return !fthh.a.lK().p();
    }

    private final boolean l(eirz eirzVar) {
        boolean c = k() ? cuiz.c(this, a(eirzVar)) : false;
        i(eirzVar);
        return c;
    }

    private final void m(int i, eirz eirzVar, String str) {
        cukc b2 = cukd.a(getApplicationContext(), str, e(), eirzVar.m).b(i);
        b2.b = eirzVar;
        b2.b();
    }

    public final void b(Intent intent, eirz eirzVar, String str, int i) {
        eivc eivcVar;
        cukj cukgVar;
        fwtc fwtcVar;
        String id;
        int importance;
        String group;
        String group2;
        if (!TextUtils.isEmpty(str) && cuiv.f(eirzVar) && cuiv.g(eirzVar)) {
            Context applicationContext = getApplicationContext();
            ausn ausnVar = cuio.a;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    ((eluo) cuio.a.i()).N("%s failed to fetch notification by identifier. Reached maximal number of retries %s.", "GunsFetchByIdentifierOperation", 3);
                    cukc b2 = cukd.a(applicationContext, str, dkbl.a(applicationContext).aK(), eirzVar.m).b(38);
                    b2.b = eirzVar;
                    b2.b();
                    eivcVar = eivc.a;
                    break;
                }
                try {
                    try {
                        eisd eisdVar = eirzVar.c;
                        if (eisdVar == null) {
                            eisdVar = eisd.a;
                        }
                        String str2 = eisdVar.c;
                        eirv eirvVar = eirzVar.d;
                        if (eirvVar == null) {
                            eirvVar = eirv.a;
                        }
                        fgrc v = eiuy.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        eiuy eiuyVar = (eiuy) v.b;
                        eirvVar.getClass();
                        fgsa fgsaVar = eiuyVar.c;
                        if (!fgsaVar.c()) {
                            eiuyVar.c = fgri.E(fgsaVar);
                        }
                        eiuyVar.c.add(eirvVar);
                        fgrc v2 = eisf.a.v();
                        String a2 = cuig.a(applicationContext);
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eisf eisfVar = (eisf) v2.b;
                        a2.getClass();
                        eisfVar.b |= 2;
                        eisfVar.d = a2;
                        DisplayMetrics displayMetrics = applicationContext.getResources().getDisplayMetrics();
                        int i3 = displayMetrics.densityDpi >= 480 ? 6 : displayMetrics.densityDpi >= 320 ? 4 : displayMetrics.densityDpi >= 240 ? 3 : displayMetrics.densityDpi >= 213 ? 5 : displayMetrics.densityDpi >= 160 ? 2 : 1;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eisf eisfVar2 = (eisf) v2.b;
                        eisfVar2.c = i3 - 1;
                        eisfVar2.b |= 1;
                        int i4 = Build.VERSION.SDK_INT;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eisf eisfVar3 = (eisf) v2.b;
                        eisfVar3.b |= 4;
                        eisfVar3.e = i4;
                        float f = applicationContext.getResources().getDisplayMetrics().density;
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eisf eisfVar4 = (eisf) v2.b;
                        eisfVar4.b |= 8;
                        eisfVar4.f = f;
                        String id2 = TimeZone.getDefault().getID();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        eisf eisfVar5 = (eisf) v2.b;
                        id2.getClass();
                        eisfVar5.b |= 16;
                        eisfVar5.g = id2;
                        if (auub.c()) {
                            ausn ausnVar2 = cuiy.a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = aued.f(applicationContext).i().iterator();
                            while (it.hasNext()) {
                                NotificationChannel m = abnm$$ExternalSyntheticApiModelOutline0.m(it.next());
                                fgrc v3 = eirs.a.v();
                                id = m.getId();
                                if (!v3.b.L()) {
                                    v3.U();
                                }
                                eirs eirsVar = (eirs) v3.b;
                                id.getClass();
                                eirsVar.b |= 1;
                                eirsVar.c = id;
                                importance = m.getImportance();
                                int i5 = importance != 0 ? importance != 1 ? importance != 2 ? importance != 3 ? importance != 4 ? importance != 5 ? 1 : 6 : 4 : 3 : 5 : 7 : 2;
                                if (!v3.b.L()) {
                                    v3.U();
                                }
                                eirs eirsVar2 = (eirs) v3.b;
                                eirsVar2.h = i5 - 1;
                                eirsVar2.b |= 32;
                                group = m.getGroup();
                                if (!TextUtils.isEmpty(group)) {
                                    group2 = m.getGroup();
                                    if (!v3.b.L()) {
                                        v3.U();
                                    }
                                    eirs eirsVar3 = (eirs) v3.b;
                                    group2.getClass();
                                    eirsVar3.b |= 8;
                                    eirsVar3.f = group2;
                                }
                                arrayList.add((eirs) v3.Q());
                            }
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            eisf eisfVar6 = (eisf) v2.b;
                            fgsa fgsaVar2 = eisfVar6.h;
                            if (!fgsaVar2.c()) {
                                eisfVar6.h = fgri.E(fgsaVar2);
                            }
                            fgou.E(arrayList, eisfVar6.h);
                        }
                        eisf eisfVar7 = (eisf) v2.Q();
                        if (!v.b.L()) {
                            v.U();
                        }
                        eiuy eiuyVar2 = (eiuy) v.b;
                        eisfVar7.getClass();
                        eiuyVar2.d = eisfVar7;
                        eiuyVar2.b |= 1;
                        eiuy eiuyVar3 = (eiuy) v.Q();
                        fiqv fiqvVar = fiqv.a;
                        fgrc v4 = fiqvVar.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fiqv fiqvVar2 = (fiqv) v4.b;
                        eiuyVar3.getClass();
                        fiqvVar2.d = eiuyVar3;
                        fiqvVar2.b |= 2;
                        fiqt a3 = cuja.a(applicationContext);
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        fiqv fiqvVar3 = (fiqv) v4.b;
                        a3.getClass();
                        fiqvVar3.c = a3;
                        fiqvVar3.b |= 1;
                        cuor a4 = cuos.a();
                        fiqv fiqvVar4 = (fiqv) v4.Q();
                        fxxm.f(str, "accountName");
                        fxxm.f(fiqvVar4, "gmsGnotsFetchByIdentifierRequest");
                        try {
                            fira a5 = cuor.a(cuor.b((fira) a4.a.o(cbot.a, caej.b)), str);
                            fwpk fwpkVar = a5.a;
                            fwtc fwtcVar2 = firb.a;
                            if (fwtcVar2 == null) {
                                synchronized (firb.class) {
                                    fwtcVar = firb.a;
                                    if (fwtcVar == null) {
                                        fwsz a6 = fwtc.a();
                                        a6.c = fwtb.UNARY;
                                        a6.d = fwtc.c("social.boq.notifications.gmscoreapi.GunsGmscoreApiService", "GmsGnotsFetchByIdentifier");
                                        a6.b();
                                        fgqp fgqpVar = fxnm.a;
                                        a6.a = new fxnl(fiqvVar);
                                        a6.b = new fxnl(fiqw.a);
                                        fwtc a7 = a6.a();
                                        firb.a = a7;
                                        fwtcVar = a7;
                                    }
                                }
                                fwtcVar2 = fwtcVar;
                            }
                            cukgVar = new cukk((fiqw) fxnz.b(fwpkVar, fwtcVar2, a5.b, fiqvVar4));
                        } catch (fwue e) {
                            cukgVar = new cukg(e);
                        }
                        eivcVar = ((fiqw) cukgVar.c()).b;
                        if (eivcVar != null) {
                            break;
                        }
                        eivcVar = eivc.a;
                        break;
                    } catch (VolleyError e2) {
                        e = e2;
                        ((eluo) ((eluo) cuio.a.j()).s(e)).N("%s failed to fetch notification by identifier. Retry number %s.", "GunsFetchByIdentifierOperation", i2);
                        try {
                            Thread.sleep(500L);
                        } catch (InterruptedException unused) {
                        }
                        i2++;
                    } catch (wjw e3) {
                        e = e3;
                        ((eluo) ((eluo) cuio.a.j()).s(e)).N("%s failed to fetch notification by identifier. Retry number %s.", "GunsFetchByIdentifierOperation", i2);
                        Thread.sleep(500L);
                        i2++;
                    }
                } catch (fwue e4) {
                    e = e4;
                    ((eluo) ((eluo) cuio.a.j()).s(e)).N("%s failed to fetch notification by identifier. Retry number %s.", "GunsFetchByIdentifierOperation", i2);
                    Thread.sleep(500L);
                    i2++;
                }
                i2++;
            }
            long j = eivcVar.c;
            if (j > 0) {
                intent.putExtra("GunsService.serverTimeUsec", j);
            }
            if (eivcVar.b.size() <= 0) {
                g(intent, eirzVar);
                return;
            }
            for (eirz eirzVar2 : eivcVar.b) {
                if ((eirzVar2.b & 8) != 0) {
                    cukc c = cukd.a(applicationContext, str, e(), eirzVar2.m).c(43);
                    c.b = eirzVar2;
                    c.d = i;
                    c.b();
                }
                g(intent, eirzVar2);
            }
        }
    }

    public final void c(eirz eirzVar, String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || !cuiv.f(eirzVar)) {
            return;
        }
        ausn ausnVar = cuiw.a;
        Context applicationContext = getApplicationContext();
        try {
            eirv eirvVar = eirzVar.d;
            if (eirvVar == null) {
                eirvVar = eirv.a;
            }
            String str3 = eirvVar.d;
            eirv eirvVar2 = eirzVar.d;
            if (eirvVar2 == null) {
                eirvVar2 = eirv.a;
            }
            fgrc v = eiuz.a.v();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            eiuz eiuzVar = (eiuz) fgriVar;
            eirvVar2.getClass();
            eiuzVar.c = eirvVar2;
            eiuzVar.b |= 1;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            eiuz eiuzVar2 = (eiuz) fgriVar2;
            eiuzVar2.d = i - 1;
            eiuzVar2.b |= 4;
            if (str2 != null) {
                if (!fgriVar2.L()) {
                    v.U();
                }
                eiuz eiuzVar3 = (eiuz) v.b;
                eiuzVar3.b |= 8;
                eiuzVar3.e = str2;
            }
            eiva eivaVar = (eiva) eivb.a.v();
            eivaVar.a(v);
            eivb eivbVar = (eivb) eivaVar.Q();
            eisd eisdVar = eirzVar.c;
            if (eisdVar == null) {
                eisdVar = eisd.a;
            }
            String str4 = eisdVar.c;
            cuis.a(applicationContext, str, eivbVar);
        } catch (VolleyError | fwue | wjw e) {
            ((eluo) ((eluo) cuiw.a.i()).s(e)).x("Failed to update the notification(s) read state.");
            cukc b2 = cukd.a(applicationContext, str, dkbl.a(applicationContext).aK(), eirzVar.m).b(17);
            b2.b = eirzVar;
            b2.b();
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        getApplicationContext();
        ekww ekwwVar = bsxv.a;
        this.d = new bsxr();
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
