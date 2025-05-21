package com.google.android.gms.instantapps.routing;

import android.content.Intent;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.a;
import defpackage.asej;
import defpackage.asnf;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqh;
import defpackage.boem;
import defpackage.boeo;
import defpackage.boff;
import defpackage.bojn;
import defpackage.bojq;
import defpackage.bokj;
import defpackage.bokn;
import defpackage.boku;
import defpackage.bokx;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byln;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.fiks;
import defpackage.fnde;
import defpackage.fpfh;
import defpackage.fpfu;
import defpackage.fpfx;
import defpackage.fpgs;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DomainFilterUpdateChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int f = 0;
    private static final asot h = asot.b("DomainFilterUpdateChimeraService", asej.INSTANT_APPS);
    bojn a;
    bokx b;
    boku c;
    bokn d;
    boeo e;
    private Executor i;

    public static String d(int i) {
        return fpfu.c() ? "instantapps.DomainFilterUpdateService.oneOff" : a.j(i, "instantapps.DomainFilterUpdateService.oneOff");
    }

    public static void e() {
        if (asqh.c()) {
            bykm bykmVar = new bykm();
            bykmVar.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            bykmVar.t("instantapps.DomainFilterUpdateService");
            bykmVar.a = fpfx.b() / 1000;
            bykmVar.x(0, 0);
            bykmVar.y(0, 1);
            bykmVar.p = true;
            long b = fpfx.b() / 1000;
            if (fnde.e()) {
                bykmVar.j(byki.a(b));
            } else {
                bykmVar.a = b;
            }
            byjl.a(AppContextProvider.a()).f(bykmVar.b());
        }
        if (asqh.c()) {
            bykm bykmVar2 = new bykm();
            bykmVar2.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            bykmVar2.t("instantapps.DomainFilterUpdateService.frequentChargingUnmetered");
            bykmVar2.y(1, 1);
            bykmVar2.x(1, 1);
            bykmVar2.p = true;
            long f2 = fpfx.a.a().f() / 1000;
            if (fnde.e()) {
                bykmVar2.j(byki.a(f2));
            } else {
                bykmVar2.a = f2;
            }
            byjl.a(AppContextProvider.a()).f(bykmVar2.b());
        }
        if (fpfx.a.a().C()) {
            byjl a = byjl.a(AppContextProvider.a());
            bykm bykmVar3 = new bykm();
            bykmVar3.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            bykmVar3.t("instantapps.DomainFilterUpdateService.fullSync");
            bykmVar3.a = fpfx.a.a().h();
            bykmVar3.x(0, 0);
            bykmVar3.y(0, 1);
            bykmVar3.p = true;
            a.f(bykmVar3.b());
        }
    }

    private final int f(fiks fiksVar) {
        return fpfx.a.a().x() ? this.a.d(fiksVar) : this.a.c(fiksVar);
    }

    private static final int g(int i, String str, boem boemVar, String str2) {
        if (i == 1) {
            boemVar.b("DomainFilterUpdateService.OK".concat(str2));
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                boemVar.b("DomainFilterUpdateService.NonRetriable".concat(str2));
                return 0;
            }
            if (i == 4) {
                boemVar.b("DomainFilterUpdateService.Throttled".concat(str2));
                return 0;
            }
            ((ejhf) ((ejhf) h.i()).ah((char) 5257)).z("Unexpected DomainFilterUpdateStatus: %d", i);
            boemVar.b("DomainFilterUpdateService.Failure".concat(str2));
            return 2;
        }
        if (fpfh.a.a().c() || (fpfh.a.a().d() && Objects.equals(str, "instantapps.DomainFilterUpdateService.frequentChargingUnmetered"))) {
            ((ejhf) ((ejhf) h.j()).ah((char) 5259)).x("Will not retry");
            boemVar.b("DomainFilterUpdateService.WillNotReschedule".concat(str2));
            return 2;
        }
        ((ejhf) ((ejhf) h.j()).ah((char) 5258)).x("Retry later");
        boemVar.b("DomainFilterUpdateService.Reschedule".concat(str2));
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c;
        fiks fiksVar;
        eiid j;
        boem b = this.e.b();
        int i = 0;
        if (!this.c.a()) {
            b.b("DomainFilterUpdateService.SwitchKilled");
            return 0;
        }
        String str = bylnVar.a;
        if (str.startsWith("instantapps.ScheduleGetIntentFilters")) {
            if (this.b.a() != 0) {
                return g(fpgs.c() ? this.a.b() : 1, "instantapps.ScheduleGetIntentFilters", b, ".IntentFilter");
            }
            b.b("DomainFilterUpdateService.OptedOut.IntentFilter");
            return 0;
        }
        bokn boknVar = this.d;
        boknVar.b(boknVar.d.b(), boknVar.c.a(), false);
        if (this.b.a() == 0 && !fpfu.e()) {
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
            if (fpfu.c()) {
                j = eigb.a;
            } else {
                String substring = str.substring(44);
                if (substring.isEmpty()) {
                    j = eigb.a;
                } else {
                    try {
                        switch (Integer.parseInt(substring)) {
                            case 0:
                                fiksVar = fiks.UNKNOWN_REQUEST_TYPE;
                                break;
                            case 1:
                                fiksVar = fiks.ONE_OFF_SYNC;
                                break;
                            case 2:
                                fiksVar = fiks.DAILY_SYNC;
                                break;
                            case 3:
                                fiksVar = fiks.FREQUENT_SYNC;
                                break;
                            case 4:
                                fiksVar = fiks.ONE_OFF_FULL_DOMAIN_FILTER_SYNC;
                                break;
                            case 5:
                                fiksVar = fiks.PERIODIC_FULL_DOMAIN_FILTER_SYNC;
                                break;
                            case 6:
                                fiksVar = fiks.ONE_OFF_SYNC_CHARGING_UNMETERED;
                                break;
                            case 7:
                                fiksVar = fiks.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER;
                                break;
                            case 8:
                                fiksVar = fiks.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN;
                                break;
                            case 9:
                                fiksVar = fiks.ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA;
                                break;
                            case 10:
                                fiksVar = fiks.ONE_OFF_SYNC_AT_ACCOUNT_CHANGE;
                                break;
                            case 11:
                                fiksVar = fiks.ONE_OFF_SYNC_AT_BOOT_COMPLETE;
                                break;
                            case 12:
                                fiksVar = fiks.ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE;
                                break;
                            default:
                                fiksVar = null;
                                break;
                        }
                        if (fiksVar == null) {
                            ((ejhf) ((ejhf) h.i()).ah(5256)).B("ONE_OFF task tag with invalid request type number is used. tag: %s", str);
                            throw new IllegalStateException(String.format("ONE_OFF task tag with invalid request type number is used. tag: %s", str));
                        }
                        j = eiid.j(fiksVar);
                    } catch (NumberFormatException e) {
                        ((ejhf) ((ejhf) ((ejhf) h.i()).s(e)).ah((char) 5255)).B("Invalid number format is used to tag ONE_OFF task. tag: %s", str);
                        throw new IllegalStateException(String.format("Invalid number format is used to tag ONE_OFF task. tag: %s", str));
                    }
                }
            }
            i = !j.h() ? f(fiks.ONE_OFF_SYNC) : f((fiks) j.c());
        } else if (c == 1) {
            i = f(fiks.FREQUENT_SYNC);
        } else if (c == 2) {
            i = f(fiks.PERIODIC_FULL_DOMAIN_FILTER_SYNC);
        } else if (c != 3) {
            asnf asnfVar = asng.a;
            ((ejhf) ((ejhf) h.i()).ah((char) 5254)).B("Unexpected DomainFilterUpdateStatus task tag: %s", str);
        } else {
            i = this.a.d(fiks.DAILY_SYNC);
        }
        return g(i, str, b, "");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        e();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        boff a = boff.a(getApplicationContext());
        this.a = a.g;
        this.b = a.d;
        this.c = a.r;
        this.d = a.s;
        this.i = a.a;
        this.e = a.k;
        int i = bokj.a;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.instantapps.ACTION_UPDATE_DOMAIN_FILTER")) {
            super.onStartCommand(intent, i, i2);
            return 2;
        }
        this.i.execute(new bojq(this, intent));
        return 2;
    }
}
