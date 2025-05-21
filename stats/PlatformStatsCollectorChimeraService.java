package com.google.android.gms.stats;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.a;
import defpackage.apsr;
import defpackage.apta;
import defpackage.aptv;
import defpackage.aptw;
import defpackage.apud;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.asop;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykm;
import defpackage.bylf;
import defpackage.byln;
import defpackage.deqd;
import defpackage.deqk;
import defpackage.deqx;
import defpackage.desa;
import defpackage.desj;
import defpackage.desk;
import defpackage.dess;
import defpackage.desu;
import defpackage.desv;
import defpackage.desw;
import defpackage.desx;
import defpackage.desy;
import defpackage.desz;
import defpackage.deta;
import defpackage.detg;
import defpackage.deth;
import defpackage.deti;
import defpackage.detj;
import defpackage.detv;
import defpackage.detx;
import defpackage.dhqe;
import defpackage.dhqf;
import defpackage.dvnv;
import defpackage.eito;
import defpackage.eits;
import defpackage.ejgq;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fijm;
import defpackage.fski;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PlatformStatsCollectorChimeraService extends GmsTaskChimeraService {
    public static final eits a;
    private static final asot b = asot.b("PlatformStatsCollectorS", asej.STATS);
    private ConcurrentHashMap c;
    private apta d;
    private apud e;

    static {
        eito eitoVar = new eito();
        f(eitoVar, new deqx());
        f(eitoVar, new desu());
        f(eitoVar, new desw());
        f(eitoVar, new desk());
        f(eitoVar, new deta());
        f(eitoVar, new desa());
        f(eitoVar, new desv());
        f(eitoVar, new desz());
        f(eitoVar, new dess());
        f(eitoVar, new deqk());
        f(eitoVar, new desj());
        f(eitoVar, new detg());
        f(eitoVar, new deth());
        f(eitoVar, new deti());
        f(eitoVar, new detj());
        f(eitoVar, new desx());
        f(eitoVar, new desy());
        a = eitoVar.b();
    }

    static ConcurrentHashMap d(Context context) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (String str : detv.a(context).keySet()) {
            if (str.endsWith("_collection_config")) {
                String substring = str.substring(0, str.indexOf("_collection_config"));
                if (!substring.isEmpty()) {
                    dvnv dvnvVar = (dvnv) detv.a(context).get(str);
                    String str2 = (dvnvVar == null || dvnvVar.c != 4) ? "" : (String) dvnvVar.d;
                    if (!str2.isEmpty()) {
                        try {
                            byte[] decode = Base64.decode(str2, 0);
                            fecp y = fecp.y(fijm.b, decode, 0, decode.length, febw.a());
                            fecp.M(y);
                            deqk deqkVar = new deqk(substring, (fijm) y);
                            if (deqkVar.i != 0) {
                                concurrentHashMap.put(substring, deqkVar);
                            }
                        } catch (fedk | IllegalArgumentException e) {
                            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 10898)).x("Fail to de-serialize proto");
                        }
                    }
                }
            }
        }
        return concurrentHashMap;
    }

    public static void e(Context context) {
        if (!detx.a()) {
            if (fski.d()) {
                byjl.a(context).c("com.google.android.gms.stats.PlatformStatsCollectorService");
                return;
            }
            return;
        }
        long nextInt = new Random().nextInt(asop.a(fski.a.a().e()));
        fski fskiVar = fski.a;
        long a2 = asop.a(fskiVar.a().h());
        boolean c = asop.c(fskiVar.a().f());
        int a3 = asop.a(fskiVar.a().g());
        HashMap hashMap = new HashMap();
        hashMap.putAll(a);
        hashMap.putAll(d(context));
        for (deqd deqdVar : hashMap.values()) {
            deqdVar.n();
            if (!fski.d() || deqdVar.g()) {
                long nextInt2 = deqdVar.e().isPresent() ? new Random().nextInt(((Integer) deqdVar.e().get()).intValue()) : nextInt;
                byjl a4 = byjl.a(context);
                bykj bykjVar = new bykj();
                bykjVar.e(nextInt2, nextInt2 + a2);
                bykjVar.j = "com.google.android.gms.stats.PlatformStatsCollectorService";
                bykjVar.y(2, 2);
                bykjVar.x(deqdVar.h() ? 1 : 0, deqdVar.h() ? 1 : 0);
                bykjVar.i(c);
                bykjVar.v(a3);
                bykjVar.p = true;
                String str = deqdVar.c;
                bykjVar.t(str);
                a4.f(bykjVar.b());
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putLong(":recordIntervalSecs", -1L);
                edit.apply();
            } else {
                byjl.a(context).d(deqdVar.c, "com.google.android.gms.stats.PlatformStatsCollectorService");
            }
        }
    }

    private static void f(eito eitoVar, deqd deqdVar) {
        eitoVar.i(deqdVar.c, deqdVar);
    }

    private final void g(deqd deqdVar) {
        boolean z;
        int i;
        long c = deqdVar.c();
        if (c == 0) {
            ejgq i2 = b.i();
            String str = deqdVar.c;
            ((ejhf) ((ejhf) i2).ah((char) 10905)).B("Task scheduled with period of 0 for task: %s", str);
            this.e.d("PeriodicTaskInvalidPeriod".concat(String.valueOf(str))).a(0L, 1L, apud.b);
            this.e.h();
            return;
        }
        long j = (long) (c * 0.1d);
        if (fski.h()) {
            fski fskiVar = fski.a;
            if (asop.c(fskiVar.a().l())) {
                j = asop.a(fskiVar.a().i());
            }
            boolean c2 = asop.c(fskiVar.a().j());
            i = asop.a(fskiVar.a().k());
            z = c2;
        } else {
            z = false;
            i = 1;
        }
        bykm bykmVar = new bykm();
        bykmVar.e(c, j, bylf.a);
        bykmVar.j = "com.google.android.gms.stats.PlatformStatsCollectorService";
        bykmVar.y(2, 2);
        bykmVar.x(deqdVar.h() ? 1 : 0, deqdVar.h() ? 1 : 0);
        bykmVar.i(z);
        bykmVar.v(i);
        bykmVar.p = true;
        String str2 = deqdVar.c;
        bykmVar.t(str2);
        Context a2 = AppContextProvider.a();
        byjl.a(a2).f(bykmVar.b());
        this.e.d("PeriodicTaskScheduledFor".concat(String.valueOf(str2))).a(0L, 1L, apud.b);
        SharedPreferences.Editor edit = a2.getSharedPreferences(str2, 0).edit();
        edit.putLong(":recordIntervalSecs", c);
        edit.putBoolean(":requiresCharging", deqdVar.h());
        edit.apply();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        apud apudVar = this.e;
        String str = bylnVar.a;
        aptv d = apudVar.d("PeriodicOnRunTaskCountFor".concat(str));
        aptw aptwVar = apud.b;
        d.a(0L, 1L, aptwVar);
        eits eitsVar = a;
        deqd deqdVar = (deqd) (eitsVar.containsKey(str) ? eitsVar.get(str) : this.c.get(str));
        if (deqdVar == null) {
            this.e.d("FailedToGetTaskFor".concat(str)).a(0L, 1L, aptwVar);
            this.e.h();
            return 2;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
        long c = deqdVar.c();
        boolean h = deqdVar.h();
        if (c != sharedPreferences.getLong(":recordIntervalSecs", -1L) || h != sharedPreferences.getBoolean(":requiresCharging", true)) {
            g(deqdVar);
        }
        if (!detx.a()) {
            this.e.d("CancellNonDeviceOwnerTasksFor".concat(str)).a(0L, 1L, apud.b);
            this.e.h();
            return 0;
        }
        try {
            if (str.equals("UnifiedDumpsysTask")) {
                SharedPreferences sharedPreferences2 = getSharedPreferences("com.google.android.metrics", 0);
                new HashMap();
                try {
                    for (String str2 : sharedPreferences2.getAll().keySet()) {
                        if (str2 != null && str2.endsWith("_collection_config")) {
                            String substring = str2.substring(0, str2.indexOf("_collection_config"));
                            if (!substring.isEmpty()) {
                                SharedPreferences sharedPreferences3 = getSharedPreferences(substring, 0);
                                SharedPreferences.Editor edit = sharedPreferences3.edit();
                                String string = sharedPreferences2.getString(str2, "");
                                if (string.isEmpty()) {
                                    byjl.a(AppContextProvider.a()).d(substring, "com.google.android.gms.stats.PlatformStatsCollectorService");
                                    edit.putString(":unifiedTaskConfig", string);
                                    edit.apply();
                                    this.c.remove(substring);
                                } else if (!sharedPreferences3.getString(":unifiedTaskConfig", "").equals(string)) {
                                    try {
                                        byte[] decode = Base64.decode(string, 0);
                                        fecp y = fecp.y(fijm.b, decode, 0, decode.length, febw.a());
                                        fecp.M(y);
                                        this.e.d(a.x(substring, "CollectionConfigParseEnablePostV16")).a(0L, 1L, apud.b);
                                        deqk deqkVar = new deqk(substring, (fijm) y);
                                        g(deqkVar);
                                        this.c.put(substring, deqkVar);
                                        edit.putString(":unifiedTaskConfig", string);
                                        edit.apply();
                                    } catch (fedk | IllegalArgumentException e) {
                                        this.e.d("UnifiedTaskConfigDeserializationException".concat(String.valueOf(substring))).a(0L, 1L, apud.b);
                                        ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah((char) 10902)).x("Fail to de-serialize proto");
                                    }
                                }
                            }
                        }
                    }
                } catch (NullPointerException e2) {
                    ((ejhf) ((ejhf) ((ejhf) b.i()).s(e2)).ah((char) 10903)).x("Fail to get shared preferences map");
                }
            } else {
                dhqe dhqeVar = new dhqe();
                aqxd aqxdVar = dhqf.a;
                aqxo aqxoVar = new aqxo(this, dhqeVar);
                List list = apta.n;
                apud apudVar2 = new apud(new apsr(this, "PLATFORM_STATS_COUNTERS").a(), 1024);
                aptv d2 = apudVar2.d("PeriodicSingleTaskCountFor".concat(str));
                aptw aptwVar2 = apud.b;
                d2.a(0L, 1L, aptwVar2);
                if (deqdVar.g()) {
                    detx.d(str, deqdVar, this, aqxoVar);
                } else {
                    apudVar2.d("PeriodicSingleTaskNotEnabledForTag".concat(str)).a(0L, 1L, aptwVar2);
                    apudVar2.h();
                }
            }
            return 0;
        } finally {
            this.e.d("UploadSingleTaskSuccess".concat(str)).a(0L, 1L, apud.b);
            apud apudVar3 = this.e;
            if (apudVar3 != null) {
                apudVar3.h();
            }
            this.d.e(10L, TimeUnit.SECONDS);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        e(getBaseContext());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        List list = apta.n;
        this.d = new apsr(this, "PLATFORM_STATS_COUNTERS").a();
        this.e = new apud(this.d, 1024);
        this.c = d(getBaseContext());
    }
}
