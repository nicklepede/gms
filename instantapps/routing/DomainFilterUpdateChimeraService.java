package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.a;
import defpackage.auid;
import defpackage.auqz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bqmc;
import defpackage.bqme;
import defpackage.bqmv;
import defpackage.bqrd;
import defpackage.bqrg;
import defpackage.bqrz;
import defpackage.bqsd;
import defpackage.bqsk;
import defpackage.bqsn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.cauf;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.flap;
import defpackage.fpvd;
import defpackage.frys;
import defpackage.frzf;
import defpackage.frzi;
import defpackage.fsad;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DomainFilterUpdateChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int f = 0;
    private static final ausn h = ausn.b("DomainFilterUpdateChimeraService", auid.INSTANT_APPS);
    bqrd a;
    bqsn b;
    bqsk c;
    bqsd d;
    bqme e;
    private Executor i;

    public static String d(int i) {
        return frzf.c() ? "instantapps.DomainFilterUpdateService.oneOff" : a.j(i, "instantapps.DomainFilterUpdateService.oneOff");
    }

    public static void e() {
        if (auub.c()) {
            cate cateVar = new cate();
            cateVar.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            cateVar.t("instantapps.DomainFilterUpdateService");
            cateVar.a = frzi.b() / 1000;
            cateVar.x(0, 0);
            cateVar.y(0, 1);
            cateVar.p = true;
            long b = frzi.b() / 1000;
            if (fpvd.e()) {
                cateVar.j(cata.a(b));
            } else {
                cateVar.a = b;
            }
            casd.a(AppContextProvider.a()).f(cateVar.b());
        }
        if (auub.c()) {
            cate cateVar2 = new cate();
            cateVar2.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            cateVar2.t("instantapps.DomainFilterUpdateService.frequentChargingUnmetered");
            cateVar2.y(1, 1);
            cateVar2.x(1, 1);
            cateVar2.p = true;
            long f2 = frzi.a.lK().f() / 1000;
            if (fpvd.e()) {
                cateVar2.j(cata.a(f2));
            } else {
                cateVar2.a = f2;
            }
            casd.a(AppContextProvider.a()).f(cateVar2.b());
        }
        frzi frziVar = frzi.a;
        if (frziVar.lK().C()) {
            casd a = casd.a(AppContextProvider.a());
            cate cateVar3 = new cate();
            cateVar3.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            cateVar3.t("instantapps.DomainFilterUpdateService.fullSync");
            cateVar3.a = frziVar.lK().h();
            cateVar3.x(0, 0);
            cateVar3.y(0, 1);
            cateVar3.p = true;
            a.f(cateVar3.b());
        }
    }

    private final int f(flap flapVar) {
        return frzi.a.lK().x() ? this.a.d(flapVar) : this.a.c(flapVar);
    }

    private static final int g(int i, String str, bqmc bqmcVar, String str2) {
        if (i == 1) {
            bqmcVar.b("DomainFilterUpdateService.OK".concat(str2));
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                bqmcVar.b("DomainFilterUpdateService.NonRetriable".concat(str2));
                return 0;
            }
            if (i == 4) {
                bqmcVar.b("DomainFilterUpdateService.Throttled".concat(str2));
                return 0;
            }
            ((eluo) ((eluo) h.i()).ai((char) 5270)).z("Unexpected DomainFilterUpdateStatus: %d", i);
            bqmcVar.b("DomainFilterUpdateService.Failure".concat(str2));
            return 2;
        }
        frys frysVar = frys.a;
        if (frysVar.lK().c() || (frysVar.lK().d() && Objects.equals(str, "instantapps.DomainFilterUpdateService.frequentChargingUnmetered"))) {
            ((eluo) ((eluo) h.j()).ai((char) 5272)).x("Will not retry");
            bqmcVar.b("DomainFilterUpdateService.WillNotReschedule".concat(str2));
            return 2;
        }
        ((eluo) ((eluo) h.j()).ai((char) 5271)).x("Retry later");
        bqmcVar.b("DomainFilterUpdateService.Reschedule".concat(str2));
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c;
        flap flapVar;
        ekvi j;
        bqmc b = this.e.b();
        int i = 0;
        if (!this.c.a()) {
            b.b("DomainFilterUpdateService.SwitchKilled");
            return 0;
        }
        String str = caufVar.a;
        if (str.startsWith("instantapps.ScheduleGetIntentFilters")) {
            if (this.b.a() != 0) {
                return g(fsad.c() ? this.a.b() : 1, "instantapps.ScheduleGetIntentFilters", b, ".IntentFilter");
            }
            b.b("DomainFilterUpdateService.OptedOut.IntentFilter");
            return 0;
        }
        bqsd bqsdVar = this.d;
        bqsdVar.b(bqsdVar.d.b(), bqsdVar.c.a(), false);
        if (this.b.a() == 0 && !frzf.e()) {
            b.b("DomainFilterUpdateService.OptedOut");
            return 0;
        }
        String str2 = true != str.startsWith("instantapps.DomainFilterUpdateService.oneOff") ? str : "instantapps.DomainFilterUpdateService.oneOff";
        switch (str2.hashCode()) {
            case -1766957981:
                if (str2.equals("instantapps.DomainFilterUpdateService.fullSync")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1487110658:
                if (str2.equals("instantapps.DomainFilterUpdateService.oneOff")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1825138455:
                if (str2.equals("instantapps.DomainFilterUpdateService.frequentChargingUnmetered")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1825649461:
                if (str2.equals("instantapps.DomainFilterUpdateService")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (frzf.c()) {
                j = ektg.a;
            } else {
                String substring = str.substring(44);
                if (substring.isEmpty()) {
                    j = ektg.a;
                } else {
                    try {
                        switch (Integer.parseInt(substring)) {
                            case 0:
                                flapVar = flap.UNKNOWN_REQUEST_TYPE;
                                break;
                            case 1:
                                flapVar = flap.ONE_OFF_SYNC;
                                break;
                            case 2:
                                flapVar = flap.DAILY_SYNC;
                                break;
                            case 3:
                                flapVar = flap.FREQUENT_SYNC;
                                break;
                            case 4:
                                flapVar = flap.ONE_OFF_FULL_DOMAIN_FILTER_SYNC;
                                break;
                            case 5:
                                flapVar = flap.PERIODIC_FULL_DOMAIN_FILTER_SYNC;
                                break;
                            case 6:
                                flapVar = flap.ONE_OFF_SYNC_CHARGING_UNMETERED;
                                break;
                            case 7:
                                flapVar = flap.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER;
                                break;
                            case 8:
                                flapVar = flap.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN;
                                break;
                            case 9:
                                flapVar = flap.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA;
                                break;
                            case 10:
                                flapVar = flap.ONE_OFF_SYNC_AT_ACCOUNT_CHANGE;
                                break;
                            case 11:
                                flapVar = flap.ONE_OFF_SYNC_AT_BOOT_COMPLETE;
                                break;
                            case 12:
                                flapVar = flap.ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE;
                                break;
                            default:
                                flapVar = null;
                                break;
                        }
                        if (flapVar == null) {
                            ((eluo) ((eluo) h.i()).ai(5269)).B("ONE_OFF task tag with invalid request type number is used. tag: %s", str);
                            throw new IllegalStateException(String.format("ONE_OFF task tag with invalid request type number is used. tag: %s", str));
                        }
                        j = ekvi.j(flapVar);
                    } catch (NumberFormatException e) {
                        ((eluo) ((eluo) ((eluo) h.i()).s(e)).ai((char) 5268)).B("Invalid number format is used to tag ONE_OFF task. tag: %s", str);
                        throw new IllegalStateException(String.format("Invalid number format is used to tag ONE_OFF task. tag: %s", str));
                    }
                }
            }
            i = !j.h() ? f(flap.ONE_OFF_SYNC) : f((flap) j.c());
        } else if (c == 1) {
            i = f(flap.FREQUENT_SYNC);
        } else if (c == 2) {
            i = f(flap.PERIODIC_FULL_DOMAIN_FILTER_SYNC);
        } else if (c != 3) {
            auqz auqzVar = aura.a;
            ((eluo) ((eluo) h.i()).ai((char) 5267)).B("Unexpected DomainFilterUpdateStatus task tag: %s", str);
        } else {
            i = this.a.d(flap.DAILY_SYNC);
        }
        return g(i, str, b, "");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        e();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        bqmv a = bqmv.a(getApplicationContext());
        this.a = a.g;
        this.b = a.d;
        this.c = a.r;
        this.d = a.s;
        this.i = a.a;
        this.e = a.k;
        int i = bqrz.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER")) {
            super.onStartCommand(intent, i, i2);
            return 2;
        }
        this.i.execute(new bqrg(this, intent));
        return 2;
    }
}
