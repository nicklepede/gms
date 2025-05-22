package com.google.android.gms.platformconfigurator;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.DeviceConfig;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.platformconfigurator.AppContextProvider;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.platformconfigurator.PhenotypeConfigurationUpdateListener;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atzs;
import defpackage.auid;
import defpackage.aumn;
import defpackage.ausn;
import defpackage.bzoo;
import defpackage.cyki;
import defpackage.cyrs;
import defpackage.cyrt;
import defpackage.cyru;
import defpackage.cyrv;
import defpackage.cyrw;
import defpackage.cyrx;
import defpackage.cysa;
import defpackage.cysd;
import defpackage.cyse;
import defpackage.cysf;
import defpackage.cysg;
import defpackage.cysh;
import defpackage.cysk;
import defpackage.cysl;
import defpackage.cysn;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dznn;
import defpackage.dzno;
import defpackage.dzti;
import defpackage.dztj;
import defpackage.ekut;
import defpackage.ekvk;
import defpackage.ekxj;
import defpackage.elgx;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elpl;
import defpackage.elsn;
import defpackage.eluo;
import defpackage.esea;
import defpackage.fgrc;
import defpackage.fgre;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgub;
import defpackage.fgvq;
import defpackage.fuib;
import defpackage.fuig;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PhenotypeConfigurationUpdateListener extends IntentOperation {
    public static final /* synthetic */ int d = 0;
    private final cysd i;
    private cyrs j;
    private static final ausn e = ausn.b("PlatformConfigurator", auid.PLATFORM_CONFIGURATOR);
    private static final long f = TimeUnit.MINUTES.toMillis(15);
    static long a = 0;
    static boolean b = false;
    static boolean c = false;
    private static int g = 0;
    private static final cysg h = cysg.b();

    public PhenotypeConfigurationUpdateListener() {
        this.i = fuib.i() ? new cysd() : null;
    }

    private final void a(Intent intent) {
        d();
        if (!b) {
            h();
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            b(stringExtra, 0);
        }
    }

    private final void b(String str, int i) {
        boolean e2;
        cysg cysgVar = h;
        cysgVar.h();
        try {
            if (ekvk.c(str) || ekvk.c(str) || !(("com.google.android.gms.settings.platform".equals(str) || "com.google.android.gms.settings.platform.boot".equals(str) || str.startsWith("com.google.android.platform")) && cysgVar.i(cysg.g(str)))) {
                throw new cysf(String.format("No package exists for config package: %s", str));
            }
            cyse a2 = cysgVar.a(cysg.g(str));
            try {
                if (fuib.e() && a2.g) {
                    e2 = cyru.b(this).d(a2);
                } else {
                    cysa b2 = cyru.b(this);
                    if (a2.e) {
                        synchronized (cysa.b) {
                            b2.b();
                            e2 = b2.f(a2);
                        }
                    } else {
                        e2 = b2.e(a2);
                    }
                }
                if (e2) {
                    return;
                }
                ausn ausnVar = e;
                ((eluo) ((eluo) ausnVar.h()).ai(8801)).N("Failed to propagate package %s, retryCount %d", str, i);
                int i2 = i + 1;
                if (i2 >= 5) {
                    ((eluo) ((eluo) ausnVar.j()).ai(8806)).N("Retried propagating for %s %d times without succeeding. Giving up.", str, i2);
                    return;
                }
                Intent startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
                ekxj.e(startIntent);
                startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
                startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i2);
                int i3 = g;
                g = i3 + 1;
                new aumn(this).d("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, f, PendingIntent.getService(this, i3, startIntent, 134217728), null);
            } catch (cyrv e3) {
                ((eluo) ((eluo) ((eluo) e.j()).s(e3)).ai((char) 8802)).B("Failed to write config for %s. It is banned, not retrying.", str);
            }
        } catch (cysf unused) {
        }
    }

    private final void c() {
        cysd cysdVar;
        cysd cysdVar2;
        elgx elgxVar;
        cysg cysgVar = h;
        cysgVar.h();
        elhz e2 = cysgVar.e();
        if (fuib.i() && (cysdVar2 = this.i) != null) {
            try {
                fgsa<cysk> fgsaVar = ((cysl) cysdVar2.a.a().get()).b;
                HashMap hashMap = new HashMap();
                for (cysk cyskVar : fgsaVar) {
                    hashMap.put(cyskVar.c, cyskVar);
                }
                elgxVar = elgx.k(hashMap);
            } catch (InterruptedException | ExecutionException e3) {
                ((eluo) ((eluo) ((eluo) e.i()).s(e3)).ai((char) 8805)).x("failed to fetch persisted namespaces, check PersistedNamespaceList ProtoDataStore configuration.");
                elgxVar = elpl.a;
            }
            if (!elgxVar.isEmpty()) {
                elhx elhxVar = new elhx();
                elsn listIterator = e2.listIterator();
                while (listIterator.hasNext()) {
                    cyse cyseVar = (cyse) listIterator.next();
                    String str = cyseVar.a;
                    if (elgxVar.containsKey(str)) {
                        cysk cyskVar2 = (cysk) elgxVar.get(str);
                        if (str.equals(cyskVar2.c) && cyseVar.c.equals(cyskVar2.d) && cyseVar.d == cyskVar2.f) {
                        }
                    }
                    elhxVar.c(cyseVar);
                }
                e2 = elhxVar.g();
            }
        }
        if (cyru.d(e2, this)) {
            a = SystemClock.elapsedRealtime() + fuib.a.lK().c();
            if (!fuib.i() || (cysdVar = this.i) == null) {
                return;
            }
            final HashMap hashMap2 = new HashMap();
            elsn listIterator2 = e2.listIterator();
            while (listIterator2.hasNext()) {
                cyse cyseVar2 = (cyse) listIterator2.next();
                String str2 = cyseVar2.a;
                fgrc v = cysk.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                cysk cyskVar3 = (cysk) fgriVar;
                cyskVar3.b |= 1;
                cyskVar3.c = str2;
                String str3 = cyseVar2.c;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                cysk cyskVar4 = (cysk) fgriVar2;
                cyskVar4.b |= 2;
                cyskVar4.d = str3;
                long j = cyseVar2.d;
                if (!fgriVar2.L()) {
                    v.U();
                }
                cysk cyskVar5 = (cysk) v.b;
                cyskVar5.b |= 8;
                cyskVar5.f = j;
                fgub l = fgvq.l();
                if (!v.b.L()) {
                    v.U();
                }
                cysk cyskVar6 = (cysk) v.b;
                l.getClass();
                cyskVar6.e = l;
                cyskVar6.b |= 4;
                hashMap2.put(str2, (cysk) v.Q());
            }
            try {
                cysdVar.a(new ekut() { // from class: cyrz
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        elgx elgxVar2 = (elgx) obj;
                        int i = PhenotypeConfigurationUpdateListener.d;
                        int size = elgxVar2.size();
                        HashMap hashMap3 = hashMap2;
                        elgt i2 = elgx.i(size + hashMap3.size());
                        i2.m(elgxVar2);
                        i2.m(hashMap3);
                        return i2.g();
                    }
                });
            } catch (InterruptedException | ExecutionException e4) {
                ((eluo) ((eluo) ((eluo) e.i()).s(e4)).ai((char) 8804)).x("failed to persist namespaces, check PersistedNamespaceList ProtoDataStore configuration.");
            }
        }
    }

    private final void d() {
        if (a < SystemClock.elapsedRealtime()) {
            c();
        }
    }

    private final void e() {
        Intent intent = fuib.a.lK().k() ? new Intent("com.google.android.gms.tron.ALARM").setPackage(getPackageName()) : new Intent("com.google.android.gms.tron.ALARM").setClassName(this, "com.google.android.gms.tron.AlarmReceiver");
        cyki a2 = cyru.a(this);
        atfn atfnVar = new atfn();
        atfnVar.a = new atfd() { // from class: cyka
            public final /* synthetic */ String a = "TRON";

            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = cyki.a;
                ((cyna) ((cynb) obj).H()).h(new cymw((dhma) obj2), null, this.a);
            }
        };
        dhlw jd = a2.jd(atfnVar.a());
        try {
            dhmr.o(jd, fuib.b(), TimeUnit.MILLISECONDS);
            intent.putExtra("com.google.android.gms.tron.extra.serializedExpTokens", atzs.n((ExperimentTokens) jd.i()));
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
        sendBroadcast(intent);
    }

    private final void f() {
        h.h();
        cysa b2 = cyru.b(this);
        synchronized (cysa.b) {
            b2.b();
            elsn listIterator = cysa.c.c().listIterator();
            while (true) {
                boolean z = true;
                while (listIterator.hasNext()) {
                    try {
                        if (b2.f((cyse) listIterator.next()) && z) {
                            break;
                        }
                    } catch (cyrv unused) {
                    }
                    z = false;
                }
            }
        }
    }

    private final void g() {
        h.h();
        cysa b2 = cyru.b(this);
        synchronized (cysa.b) {
            elsn listIterator = cysa.c.d().listIterator();
            while (true) {
                boolean z = true;
                while (listIterator.hasNext()) {
                    cyse cyseVar = (cyse) listIterator.next();
                    if (!fuib.e()) {
                        if (b2.e(cyseVar) && z) {
                            break;
                        }
                        z = false;
                    } else if (cyseVar.g) {
                        if (b2.d(cyseVar) && z) {
                            break;
                        }
                        z = false;
                    } else {
                        if (b2.e(cyseVar) && z) {
                            break;
                        }
                        z = false;
                    }
                }
            }
        }
    }

    private final void h() {
        e();
        if (c) {
            g();
        } else {
            Intent startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.POST_BOOT");
            ekxj.e(startIntent);
            new aumn(this).d("com.google.android.gms.platformconfigurator.POST_BOOT", 3, fuib.a.lK().a(), PendingIntent.getService(this, 0, startIntent, 67108864), null);
        }
        if (c) {
            f();
        }
        b = true;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (fuig.c()) {
            if (this.j == null) {
                this.j = new cyrs();
            }
            ausn ausnVar = cysh.a;
            Context a2 = AppContextProvider.a();
            Pattern pattern = dzno.a;
            dznn dznnVar = new dznn(a2);
            dznnVar.e("platformconfigurator");
            dznnVar.f("platform_config_ota_state.pb");
            Uri a3 = dznnVar.a();
            dzti a4 = dztj.a();
            a4.f(a3);
            a4.e(cysn.a);
            bzoo.a.a(a4.a());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c2;
        if (cyrx.b() && (action = intent.getAction()) != null) {
            switch (action.hashCode()) {
                case -1150396109:
                    if (action.equals("com.google.android.gms.platformconfigurator.POST_BOOT")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -544318258:
                    if (action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 438946629:
                    if (action.equals("com.google.android.gms.chimera.container.CONTAINER_UPDATED")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 665673924:
                    if (action.equals("com.google.android.gms.update.STATUS_CHANGED")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 798292259:
                    if (action.equals("android.intent.action.BOOT_COMPLETED")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 832939294:
                    if (action.equals("com.google.android.gms.platformconfigurator.RETRY_UPDATE")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2019499159:
                    if (action.equals("com.google.android.gms.phenotype.UPDATE")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2069809336:
                    if (action.equals(IntentOperation.ACTION_NEW_MODULE)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    h();
                    fuig.c();
                    if (fuig.a.lK().c()) {
                        try {
                            String str = Build.FINGERPRINT;
                            ausn ausnVar = cysh.a;
                            ((eluo) ((eluo) ausnVar.h()).ai((char) 8840)).B("Setting runtime properties for all namespaces. Build id %s", str);
                            elhz e2 = cysh.b.e();
                            fgrc v = cyrt.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            cyrt cyrtVar = (cyrt) v.b;
                            str.getClass();
                            cyrtVar.b = 1 | cyrtVar.b;
                            cyrtVar.c = str;
                            cyrt cyrtVar2 = (cyrt) v.Q();
                            fgre fgreVar = (fgre) esea.a.v();
                            fgreVar.n(cyrt.d, cyrtVar2);
                            esea eseaVar = (esea) fgreVar.Q();
                            elsn listIterator = e2.listIterator();
                            while (listIterator.hasNext()) {
                                cyse cyseVar = (cyse) listIterator.next();
                                if (!cyru.e(cyseVar.b, eseaVar, this)) {
                                    ((eluo) ((eluo) ausnVar.j()).ai(8841)).B("Failed to set runtime properties for %s", cyseVar.a);
                                }
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            ((eluo) ((eluo) ((eluo) e.i()).s(e3)).ai((char) 8798)).x("Error setting runtime properties on boot completed");
                        }
                    }
                    if (fuib.e()) {
                        cysa b2 = cyru.b(this);
                        int i = cyrw.a;
                        DeviceConfig.Properties properties = DeviceConfig.getProperties("token_staged", new String[0]);
                        for (String str2 : properties.getKeyset()) {
                            String string = properties.getString(str2, (String) null);
                            try {
                                cyse a2 = cysa.c.a(str2);
                                if (string == null) {
                                    ((eluo) ((eluo) cysa.a.j()).ai(8813)).B("failed to commit boot-stable namespace '%s'", str2);
                                } else if (!b2.c(a2.b, string)) {
                                    ((eluo) ((eluo) cysa.a.j()).ai(8815)).B("failed to commit boot-stable namespace '%s'", str2);
                                }
                            } catch (cysf unused) {
                                ((eluo) ((eluo) cysa.a.j()).ai((char) 8814)).B("did not commit namespace '%s', wasn't in the immediate namespace list", str2);
                            }
                        }
                        ((eluo) ((eluo) cysa.a.h()).ai((char) 8812)).x("Committed boot-stable namespaces.");
                        break;
                    }
                    break;
                case 1:
                case 2:
                    d();
                    break;
                case 3:
                    if (fuib.a.lK().n()) {
                        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                        if (stringExtra != null) {
                            if (stringExtra.equals("com.google.android.gms.platformconfigurator") || stringExtra.startsWith("com.google.android.platform")) {
                                a(intent);
                                break;
                            }
                        }
                    } else {
                        a(intent);
                        break;
                    }
                    break;
                case 4:
                    if ("com.google.android.gms.platformconfigurator".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
                        c();
                        break;
                    }
                    break;
                case 5:
                    String stringExtra2 = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                    int intExtra = intent.getIntExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", -1);
                    if (stringExtra2 != null && intExtra != -1) {
                        b(stringExtra2, intExtra);
                        break;
                    }
                    break;
                case 6:
                    d();
                    f();
                    g();
                    c = true;
                    break;
                case 7:
                    fuig.c();
                    break;
                default:
                    intent.getAction();
                    break;
            }
        }
    }
}
