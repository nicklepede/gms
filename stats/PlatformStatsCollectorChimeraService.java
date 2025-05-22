package com.google.android.gms.stats;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.a;
import defpackage.arvi;
import defpackage.arvr;
import defpackage.arwm;
import defpackage.arwn;
import defpackage.arwu;
import defpackage.aszs;
import defpackage.atad;
import defpackage.auid;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.cate;
import defpackage.catx;
import defpackage.cauf;
import defpackage.dhbg;
import defpackage.dhbn;
import defpackage.dhca;
import defpackage.dhdd;
import defpackage.dhdm;
import defpackage.dhdn;
import defpackage.dhdv;
import defpackage.dhdx;
import defpackage.dhdy;
import defpackage.dhdz;
import defpackage.dhea;
import defpackage.dheb;
import defpackage.dhec;
import defpackage.dhed;
import defpackage.dhej;
import defpackage.dhek;
import defpackage.dhel;
import defpackage.dhem;
import defpackage.dhey;
import defpackage.dhfa;
import defpackage.dkbk;
import defpackage.dkbl;
import defpackage.dxyv;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.eltz;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fkzj;
import defpackage.fvfg;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PlatformStatsCollectorChimeraService extends GmsTaskChimeraService {
    public static final elgx a;
    private static final ausn b = ausn.b("PlatformStatsCollectorS", auid.STATS);
    private ConcurrentHashMap c;
    private arvr d;
    private arwu e;

    static {
        elgt elgtVar = new elgt();
        f(elgtVar, new dhca());
        f(elgtVar, new dhdx());
        f(elgtVar, new dhdz());
        f(elgtVar, new dhdn());
        f(elgtVar, new dhed());
        f(elgtVar, new dhdd());
        f(elgtVar, new dhdy());
        f(elgtVar, new dhec());
        f(elgtVar, new dhdv());
        f(elgtVar, new dhbn());
        f(elgtVar, new dhdm());
        f(elgtVar, new dhej());
        f(elgtVar, new dhek());
        f(elgtVar, new dhel());
        f(elgtVar, new dhem());
        f(elgtVar, new dhea());
        f(elgtVar, new dheb());
        a = elgtVar.b();
    }

    static ConcurrentHashMap d(Context context) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (String str : dhey.a(context).keySet()) {
            if (str.endsWith("_collection_config")) {
                String substring = str.substring(0, str.indexOf("_collection_config"));
                if (!substring.isEmpty()) {
                    dxyv dxyvVar = (dxyv) dhey.a(context).get(str);
                    String str2 = (dxyvVar == null || dxyvVar.c != 4) ? "" : (String) dxyvVar.d;
                    if (!str2.isEmpty()) {
                        try {
                            byte[] decode = Base64.decode(str2, 0);
                            fgri y = fgri.y(fkzj.b, decode, 0, decode.length, fgqp.a());
                            fgri.M(y);
                            dhbn dhbnVar = new dhbn(substring, (fkzj) y);
                            if (dhbnVar.i != 0) {
                                concurrentHashMap.put(substring, dhbnVar);
                            }
                        } catch (fgsd | IllegalArgumentException e) {
                            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 10901)).x("Fail to de-serialize proto");
                        }
                    }
                }
            }
        }
        return concurrentHashMap;
    }

    public static void e(Context context) {
        if (!dhfa.a()) {
            if (fvfg.d()) {
                casd.a(context).c("com.google.android.gms.stats.PlatformStatsCollectorService");
                return;
            }
            return;
        }
        Random random = new Random();
        fvfg fvfgVar = fvfg.a;
        long nextInt = random.nextInt(ausj.a(fvfgVar.lK().e()));
        long a2 = ausj.a(fvfgVar.lK().h());
        boolean c = ausj.c(fvfgVar.lK().f());
        int a3 = ausj.a(fvfgVar.lK().g());
        HashMap hashMap = new HashMap();
        hashMap.putAll(a);
        hashMap.putAll(d(context));
        for (dhbg dhbgVar : hashMap.values()) {
            dhbgVar.n();
            if (!fvfg.d() || dhbgVar.g()) {
                long nextInt2 = dhbgVar.e().isPresent() ? new Random().nextInt(((Integer) dhbgVar.e().get()).intValue()) : nextInt;
                casd a4 = casd.a(context);
                catb catbVar = new catb();
                catbVar.e(nextInt2, nextInt2 + a2);
                catbVar.j = "com.google.android.gms.stats.PlatformStatsCollectorService";
                catbVar.y(2, 2);
                catbVar.x(dhbgVar.h() ? 1 : 0, dhbgVar.h() ? 1 : 0);
                catbVar.i(c);
                catbVar.v(a3);
                catbVar.p = true;
                String str = dhbgVar.c;
                catbVar.t(str);
                a4.f(catbVar.b());
                SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
                edit.putLong(":recordIntervalSecs", -1L);
                edit.apply();
            } else {
                casd.a(context).d(dhbgVar.c, "com.google.android.gms.stats.PlatformStatsCollectorService");
            }
        }
    }

    private static void f(elgt elgtVar, dhbg dhbgVar) {
        elgtVar.i(dhbgVar.c, dhbgVar);
    }

    private final void g(dhbg dhbgVar) {
        boolean z;
        int i;
        long c = dhbgVar.c();
        if (c == 0) {
            eltz i2 = b.i();
            String str = dhbgVar.c;
            ((eluo) ((eluo) i2).ai((char) 10908)).B("Task scheduled with period of 0 for task: %s", str);
            this.e.d("PeriodicTaskInvalidPeriod".concat(String.valueOf(str))).a(0L, 1L, arwu.b);
            this.e.h();
            return;
        }
        long j = (long) (c * 0.1d);
        if (fvfg.h()) {
            fvfg fvfgVar = fvfg.a;
            if (ausj.c(fvfgVar.lK().l())) {
                j = ausj.a(fvfgVar.lK().i());
            }
            boolean c2 = ausj.c(fvfgVar.lK().j());
            i = ausj.a(fvfgVar.lK().k());
            z = c2;
        } else {
            z = false;
            i = 1;
        }
        cate cateVar = new cate();
        cateVar.e(c, j, catx.a);
        cateVar.j = "com.google.android.gms.stats.PlatformStatsCollectorService";
        cateVar.y(2, 2);
        cateVar.x(dhbgVar.h() ? 1 : 0, dhbgVar.h() ? 1 : 0);
        cateVar.i(z);
        cateVar.v(i);
        cateVar.p = true;
        String str2 = dhbgVar.c;
        cateVar.t(str2);
        Context a2 = AppContextProvider.a();
        casd.a(a2).f(cateVar.b());
        this.e.d("PeriodicTaskScheduledFor".concat(String.valueOf(str2))).a(0L, 1L, arwu.b);
        SharedPreferences.Editor edit = a2.getSharedPreferences(str2, 0).edit();
        edit.putLong(":recordIntervalSecs", c);
        edit.putBoolean(":requiresCharging", dhbgVar.h());
        edit.apply();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        arwu arwuVar = this.e;
        String str = caufVar.a;
        arwm d = arwuVar.d("PeriodicOnRunTaskCountFor".concat(str));
        arwn arwnVar = arwu.b;
        d.a(0L, 1L, arwnVar);
        elgx elgxVar = a;
        dhbg dhbgVar = (dhbg) (elgxVar.containsKey(str) ? elgxVar.get(str) : this.c.get(str));
        if (dhbgVar == null) {
            this.e.d("FailedToGetTaskFor".concat(str)).a(0L, 1L, arwnVar);
            this.e.h();
            return 2;
        }
        SharedPreferences sharedPreferences = getSharedPreferences(str, 0);
        long c = dhbgVar.c();
        boolean h = dhbgVar.h();
        if (c != sharedPreferences.getLong(":recordIntervalSecs", -1L) || h != sharedPreferences.getBoolean(":requiresCharging", true)) {
            g(dhbgVar);
        }
        if (!dhfa.a()) {
            this.e.d("CancellNonDeviceOwnerTasksFor".concat(str)).a(0L, 1L, arwu.b);
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
                                    casd.a(AppContextProvider.a()).d(substring, "com.google.android.gms.stats.PlatformStatsCollectorService");
                                    edit.putString(":unifiedTaskConfig", string);
                                    edit.apply();
                                    this.c.remove(substring);
                                } else if (!sharedPreferences3.getString(":unifiedTaskConfig", "").equals(string)) {
                                    try {
                                        byte[] decode = Base64.decode(string, 0);
                                        fgri y = fgri.y(fkzj.b, decode, 0, decode.length, fgqp.a());
                                        fgri.M(y);
                                        this.e.d(a.x(substring, "CollectionConfigParseEnablePostV16")).a(0L, 1L, arwu.b);
                                        dhbn dhbnVar = new dhbn(substring, (fkzj) y);
                                        g(dhbnVar);
                                        this.c.put(substring, dhbnVar);
                                        edit.putString(":unifiedTaskConfig", string);
                                        edit.apply();
                                    } catch (fgsd | IllegalArgumentException e) {
                                        this.e.d("UnifiedTaskConfigDeserializationException".concat(String.valueOf(substring))).a(0L, 1L, arwu.b);
                                        ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai((char) 10905)).x("Fail to de-serialize proto");
                                    }
                                }
                            }
                        }
                    }
                } catch (NullPointerException e2) {
                    ((eluo) ((eluo) ((eluo) b.i()).s(e2)).ai((char) 10906)).x("Fail to get shared preferences map");
                }
            } else {
                dkbk dkbkVar = new dkbk();
                aszs aszsVar = dkbl.a;
                atad atadVar = new atad(this, dkbkVar);
                List list = arvr.n;
                arwu arwuVar2 = new arwu(new arvi(this, "PLATFORM_STATS_COUNTERS").a(), 1024);
                arwm d2 = arwuVar2.d("PeriodicSingleTaskCountFor".concat(str));
                arwn arwnVar2 = arwu.b;
                d2.a(0L, 1L, arwnVar2);
                if (dhbgVar.g()) {
                    dhfa.d(str, dhbgVar, this, atadVar);
                } else {
                    arwuVar2.d("PeriodicSingleTaskNotEnabledForTag".concat(str)).a(0L, 1L, arwnVar2);
                    arwuVar2.h();
                }
            }
            return 0;
        } finally {
            this.e.d("UploadSingleTaskSuccess".concat(str)).a(0L, 1L, arwu.b);
            arwu arwuVar3 = this.e;
            if (arwuVar3 != null) {
                arwuVar3.h();
            }
            this.d.e(10L, TimeUnit.SECONDS);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        e(getBaseContext());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        List list = arvr.n;
        this.d = new arvi(this, "PLATFORM_STATS_COUNTERS").a();
        this.e = new arwu(this.d, 1024);
        this.c = d(getBaseContext());
    }
}
