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
import defpackage.arco;
import defpackage.arcy;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asit;
import defpackage.asot;
import defpackage.bxfy;
import defpackage.cwal;
import defpackage.cwhv;
import defpackage.cwhw;
import defpackage.cwhx;
import defpackage.cwhy;
import defpackage.cwhz;
import defpackage.cwia;
import defpackage.cwid;
import defpackage.cwig;
import defpackage.cwih;
import defpackage.cwii;
import defpackage.cwij;
import defpackage.cwik;
import defpackage.cwin;
import defpackage.cwio;
import defpackage.cwiq;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dxbn;
import defpackage.dxbo;
import defpackage.dxhi;
import defpackage.dxhj;
import defpackage.eiho;
import defpackage.eiif;
import defpackage.eike;
import defpackage.eits;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejcg;
import defpackage.ejfg;
import defpackage.ejhf;
import defpackage.epqb;
import defpackage.fecj;
import defpackage.fecl;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.fefi;
import defpackage.fegx;
import defpackage.froa;
import defpackage.frof;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PhenotypeConfigurationUpdateListener extends IntentOperation {
    public static final /* synthetic */ int d = 0;
    private final cwig i;
    private cwhv j;
    private static final asot e = asot.b("PlatformConfigurator", asej.PLATFORM_CONFIGURATOR);
    private static final long f = TimeUnit.MINUTES.toMillis(15);
    static long a = 0;
    static boolean b = false;
    static boolean c = false;
    private static int g = 0;
    private static final cwij h = cwij.b();

    public PhenotypeConfigurationUpdateListener() {
        this.i = froa.i() ? new cwig() : null;
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
        cwij cwijVar = h;
        cwijVar.h();
        try {
            if (eiif.c(str) || eiif.c(str) || !(("com.google.android.gms.settings.platform".equals(str) || "com.google.android.gms.settings.platform.boot".equals(str) || str.startsWith("com.google.android.platform")) && cwijVar.i(cwij.g(str)))) {
                throw new cwii(String.format("No package exists for config package: %s", str));
            }
            cwih a2 = cwijVar.a(cwij.g(str));
            try {
                if (froa.e() && a2.g) {
                    e2 = cwhx.b(this).d(a2);
                } else {
                    cwid b2 = cwhx.b(this);
                    if (a2.e) {
                        synchronized (cwid.b) {
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
                asot asotVar = e;
                ((ejhf) ((ejhf) asotVar.h()).ah(8803)).N("Failed to propagate package %s, retryCount %d", str, i);
                int i2 = i + 1;
                if (i2 >= 5) {
                    ((ejhf) ((ejhf) asotVar.j()).ah(8808)).N("Retried propagating for %s %d times without succeeding. Giving up.", str, i2);
                    return;
                }
                Intent startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigurationUpdateListener.class, "com.google.android.gms.platformconfigurator.RETRY_UPDATE");
                eike.e(startIntent);
                startIntent.putExtra("com.google.android.gms.phenotype.PACKAGE_NAME", str);
                startIntent.putExtra("com.google.android.gms.platformconfigurator.RETRY_COUNT_KEY", i2);
                int i3 = g;
                g = i3 + 1;
                new asit(this).d("com.google.android.gms.platformconfigurator.RETRY_UPDATE", 3, f, PendingIntent.getService(this, i3, startIntent, 134217728), null);
            } catch (cwhy e3) {
                ((ejhf) ((ejhf) ((ejhf) e.j()).s(e3)).ah((char) 8804)).B("Failed to write config for %s. It is banned, not retrying.", str);
            }
        } catch (cwii unused) {
        }
    }

    private final void c() {
        cwig cwigVar;
        cwig cwigVar2;
        eits eitsVar;
        cwij cwijVar = h;
        cwijVar.h();
        eiuu e2 = cwijVar.e();
        if (froa.i() && (cwigVar2 = this.i) != null) {
            try {
                fedh<cwin> fedhVar = ((cwio) cwigVar2.a.a().get()).b;
                HashMap hashMap = new HashMap();
                for (cwin cwinVar : fedhVar) {
                    hashMap.put(cwinVar.c, cwinVar);
                }
                eitsVar = eits.k(hashMap);
            } catch (InterruptedException | ExecutionException e3) {
                ((ejhf) ((ejhf) ((ejhf) e.i()).s(e3)).ah((char) 8807)).x("failed to fetch persisted namespaces, check PersistedNamespaceList ProtoDataStore configuration.");
                eitsVar = ejcg.a;
            }
            if (!eitsVar.isEmpty()) {
                eius eiusVar = new eius();
                ejfg listIterator = e2.listIterator();
                while (listIterator.hasNext()) {
                    cwih cwihVar = (cwih) listIterator.next();
                    String str = cwihVar.a;
                    if (eitsVar.containsKey(str)) {
                        cwin cwinVar2 = (cwin) eitsVar.get(str);
                        if (str.equals(cwinVar2.c) && cwihVar.c.equals(cwinVar2.d) && cwihVar.d == cwinVar2.f) {
                        }
                    }
                    eiusVar.c(cwihVar);
                }
                e2 = eiusVar.g();
            }
        }
        if (cwhx.d(e2, this)) {
            a = SystemClock.elapsedRealtime() + froa.a.a().c();
            if (!froa.i() || (cwigVar = this.i) == null) {
                return;
            }
            final HashMap hashMap2 = new HashMap();
            ejfg listIterator2 = e2.listIterator();
            while (listIterator2.hasNext()) {
                cwih cwihVar2 = (cwih) listIterator2.next();
                String str2 = cwihVar2.a;
                fecj v = cwin.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                cwin cwinVar3 = (cwin) fecpVar;
                cwinVar3.b |= 1;
                cwinVar3.c = str2;
                String str3 = cwihVar2.c;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                cwin cwinVar4 = (cwin) fecpVar2;
                cwinVar4.b |= 2;
                cwinVar4.d = str3;
                long j = cwihVar2.d;
                if (!fecpVar2.L()) {
                    v.U();
                }
                cwin cwinVar5 = (cwin) v.b;
                cwinVar5.b |= 8;
                cwinVar5.f = j;
                fefi l = fegx.l();
                if (!v.b.L()) {
                    v.U();
                }
                cwin cwinVar6 = (cwin) v.b;
                l.getClass();
                cwinVar6.e = l;
                cwinVar6.b |= 4;
                hashMap2.put(str2, (cwin) v.Q());
            }
            try {
                cwigVar.a(new eiho() { // from class: cwic
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eits eitsVar2 = (eits) obj;
                        int i = PhenotypeConfigurationUpdateListener.d;
                        int size = eitsVar2.size();
                        HashMap hashMap3 = hashMap2;
                        eito i2 = eits.i(size + hashMap3.size());
                        i2.m(eitsVar2);
                        i2.m(hashMap3);
                        return i2.g();
                    }
                });
            } catch (InterruptedException | ExecutionException e4) {
                ((ejhf) ((ejhf) ((ejhf) e.i()).s(e4)).ah((char) 8806)).x("failed to persist namespaces, check PersistedNamespaceList ProtoDataStore configuration.");
            }
        }
    }

    private final void d() {
        if (a < SystemClock.elapsedRealtime()) {
            c();
        }
    }

    private final void e() {
        Intent intent = froa.a.a().k() ? new Intent("com.google.android.gms.tron.ALARM").setPackage(getPackageName()) : new Intent("com.google.android.gms.tron.ALARM").setClassName(this, "com.google.android.gms.tron.AlarmReceiver");
        cwal a2 = cwhx.a(this);
        arcy arcyVar = new arcy();
        arcyVar.a = new arco() { // from class: cwad
            public final /* synthetic */ String a = "TRON";

            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = cwal.a;
                ((cwdd) ((cwde) obj).H()).h(new cwcz((dfau) obj2), null, this.a);
            }
        };
        dfaq iO = a2.iO(arcyVar.a());
        try {
            dfbl.o(iO, froa.b(), TimeUnit.MILLISECONDS);
            intent.putExtra("com.google.android.gms.tron.extra.serializedExpTokens", arxd.n((ExperimentTokens) iO.i()));
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
        }
        sendBroadcast(intent);
    }

    private final void f() {
        h.h();
        cwid b2 = cwhx.b(this);
        synchronized (cwid.b) {
            b2.b();
            ejfg listIterator = cwid.c.c().listIterator();
            while (true) {
                boolean z = true;
                while (listIterator.hasNext()) {
                    try {
                        if (b2.f((cwih) listIterator.next()) && z) {
                            break;
                        }
                    } catch (cwhy unused) {
                    }
                    z = false;
                }
            }
        }
    }

    private final void g() {
        h.h();
        cwid b2 = cwhx.b(this);
        synchronized (cwid.b) {
            ejfg listIterator = cwid.c.d().listIterator();
            while (true) {
                boolean z = true;
                while (listIterator.hasNext()) {
                    cwih cwihVar = (cwih) listIterator.next();
                    if (!froa.e()) {
                        if (b2.e(cwihVar) && z) {
                            break;
                        }
                        z = false;
                    } else if (cwihVar.g) {
                        if (b2.d(cwihVar) && z) {
                            break;
                        }
                        z = false;
                    } else {
                        if (b2.e(cwihVar) && z) {
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
            eike.e(startIntent);
            new asit(this).d("com.google.android.gms.platformconfigurator.POST_BOOT", 3, froa.a.a().a(), PendingIntent.getService(this, 0, startIntent, 67108864), null);
        }
        if (c) {
            f();
        }
        b = true;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        if (frof.c()) {
            if (this.j == null) {
                this.j = new cwhv();
            }
            asot asotVar = cwik.a;
            Context a2 = AppContextProvider.a();
            Pattern pattern = dxbo.a;
            dxbn dxbnVar = new dxbn(a2);
            dxbnVar.e("platformconfigurator");
            dxbnVar.f("platform_config_ota_state.pb");
            Uri a3 = dxbnVar.a();
            dxhi a4 = dxhj.a();
            a4.f(a3);
            a4.e(cwiq.a);
            bxfy.a.a(a4.a());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c2;
        if (cwia.b() && (action = intent.getAction()) != null) {
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
                    frof.c();
                    if (frof.a.a().c()) {
                        try {
                            String str = Build.FINGERPRINT;
                            asot asotVar = cwik.a;
                            ((ejhf) ((ejhf) asotVar.h()).ah((char) 8842)).B("Setting runtime properties for all namespaces. Build id %s", str);
                            eiuu e2 = cwik.b.e();
                            fecj v = cwhw.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            cwhw cwhwVar = (cwhw) v.b;
                            str.getClass();
                            cwhwVar.b = 1 | cwhwVar.b;
                            cwhwVar.c = str;
                            cwhw cwhwVar2 = (cwhw) v.Q();
                            fecl feclVar = (fecl) epqb.a.v();
                            feclVar.n(cwhw.d, cwhwVar2);
                            epqb epqbVar = (epqb) feclVar.Q();
                            ejfg listIterator = e2.listIterator();
                            while (listIterator.hasNext()) {
                                cwih cwihVar = (cwih) listIterator.next();
                                if (!cwhx.e(cwihVar.b, epqbVar, this)) {
                                    ((ejhf) ((ejhf) asotVar.j()).ah(8843)).B("Failed to set runtime properties for %s", cwihVar.a);
                                }
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            ((ejhf) ((ejhf) ((ejhf) e.i()).s(e3)).ah((char) 8800)).x("Error setting runtime properties on boot completed");
                        }
                    }
                    if (froa.e()) {
                        cwid b2 = cwhx.b(this);
                        int i = cwhz.a;
                        DeviceConfig.Properties properties = DeviceConfig.getProperties("token_staged", new String[0]);
                        for (String str2 : properties.getKeyset()) {
                            String string = properties.getString(str2, (String) null);
                            try {
                                cwih a2 = cwid.c.a(str2);
                                if (string == null) {
                                    ((ejhf) ((ejhf) cwid.a.j()).ah(8815)).B("failed to commit boot-stable namespace '%s'", str2);
                                } else if (!b2.c(a2.b, string)) {
                                    ((ejhf) ((ejhf) cwid.a.j()).ah(8817)).B("failed to commit boot-stable namespace '%s'", str2);
                                }
                            } catch (cwii unused) {
                                ((ejhf) ((ejhf) cwid.a.j()).ah((char) 8816)).B("did not commit namespace '%s', wasn't in the immediate namespace list", str2);
                            }
                        }
                        ((ejhf) ((ejhf) cwid.a.h()).ah((char) 8814)).x("Committed boot-stable namespaces.");
                        break;
                    }
                    break;
                case 1:
                case 2:
                    d();
                    break;
                case 3:
                    if (froa.a.a().n()) {
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
                    frof.c();
                    break;
                default:
                    intent.getAction();
                    break;
            }
        }
    }
}
