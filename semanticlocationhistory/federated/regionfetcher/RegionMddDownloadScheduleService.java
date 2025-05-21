package com.google.android.gms.semanticlocationhistory.federated.regionfetcher;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddDownloadScheduleService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.dawm;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enqr;
import defpackage.enqt;
import defpackage.enqx;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frxg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RegionMddDownloadScheduleService extends GmsTaskBoundService {
    public final czje b;
    private dawm d;
    private final czlk e;
    private static final asot c = asot.b("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY);
    public static final String a = RegionMddDownloadScheduleService.class.getName();

    public RegionMddDownloadScheduleService() {
        czje czjeVar = new czje();
        this.b = czjeVar;
        this.e = new czlk(czjeVar);
    }

    public final dawm d(Context context) {
        if (frxg.d()) {
            return dawm.a(context);
        }
        if (this.d == null) {
            this.d = dawm.a(context);
        }
        return this.d;
    }

    public final enss e(dawm dawmVar, boolean z) {
        return enps.g(ensi.h(dawmVar.c.e(true != z ? "MDD.WIFI.CHARGING.PERIODIC.TASK" : "MDD.CELLULAR.CHARGING.PERIODIC.TASK")), new enqc() { // from class: dawi
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                RegionMddDownloadScheduleService.this.b.e("RegionMddDownloadScheduleSuccess");
                return ensj.i(0);
            }
        }, enre.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(final byln bylnVar) {
        czje czjeVar = this.b;
        czjeVar.e("RegionMddDownloadScheduleInvocation");
        if (!frxg.e()) {
            this.b.e("RegionMddDownloadScheduleFailureServiceDisabled");
            return ensj.i(2);
        }
        String str = bylnVar.a;
        if (!str.equals("RegionMddRefreshDownloadTask")) {
            czjeVar.e("RegionMddDownloadScheduleFailureTagInvalid");
            ((ejhf) ((ejhf) c.i()).ah((char) 10434)).B("Unexpected tag: %s.", str);
            return ensj.i(2);
        }
        czlk czlkVar = this.e;
        final Context a2 = AppContextProvider.a();
        if (czlp.b(a2, czlkVar).isEmpty()) {
            czjeVar.e("RegionMddDownloadScheduleFailureAccountLocationDisabled");
            ((ejhf) ((ejhf) c.h()).ah((char) 10433)).x("Account-level location setting is turned off.");
            return ensj.i(2);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) a2.getSystemService("connectivity");
        eiig.x(connectivityManager);
        final boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (frxg.d()) {
            enqt enqtVar = new enqt() { // from class: dawj
                @Override // defpackage.enqt
                public final Object a(enqv enqvVar) {
                    dawm d = RegionMddDownloadScheduleService.this.d(a2);
                    enqvVar.a(d, enre.a);
                    return d;
                }
            };
            enre enreVar = enre.a;
            return enqx.b(enqtVar, enreVar).d(new enqr() { // from class: dawk
                @Override // defpackage.enqr
                public final enqx a(enqv enqvVar, Object obj) {
                    return new enqx(RegionMddDownloadScheduleService.this.e((dawm) obj, isActiveNetworkMetered));
                }
            }, enreVar).i();
        }
        dawm d = d(a2);
        try {
            enss e = e(d, isActiveNetworkMetered);
            if (d != null) {
                d.close();
            }
            return e;
        } catch (Throwable th) {
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
    }
}
