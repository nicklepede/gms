package com.google.android.gms.semanticlocationhistory.federated.regionfetcher;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddDownloadScheduleService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.ddgu;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqek;
import defpackage.eqem;
import defpackage.eqeq;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fusa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RegionMddDownloadScheduleService extends GmsTaskBoundService {
    public final dbtc b;
    private ddgu d;
    private final dbvg e;
    private static final ausn c = ausn.b("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY);
    public static final String a = RegionMddDownloadScheduleService.class.getName();

    public RegionMddDownloadScheduleService() {
        dbtc dbtcVar = new dbtc();
        this.b = dbtcVar;
        this.e = new dbvg(dbtcVar);
    }

    public final ddgu d(Context context) {
        if (fusa.c()) {
            return ddgu.a(context);
        }
        if (this.d == null) {
            this.d = ddgu.a(context);
        }
        return this.d;
    }

    public final eqgl e(ddgu ddguVar, boolean z) {
        return eqdl.g(eqgb.h(ddguVar.c.e(true != z ? "MDD.WIFI.CHARGING.PERIODIC.TASK" : "MDD.CELLULAR.CHARGING.PERIODIC.TASK")), new eqdv() { // from class: ddgq
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                RegionMddDownloadScheduleService.this.b.e("RegionMddDownloadScheduleSuccess");
                return eqgc.i(0);
            }
        }, eqex.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(final cauf caufVar) {
        dbtc dbtcVar = this.b;
        dbtcVar.e("RegionMddDownloadScheduleInvocation");
        if (!fusa.d()) {
            this.b.e("RegionMddDownloadScheduleFailureServiceDisabled");
            return eqgc.i(2);
        }
        String str = caufVar.a;
        if (!str.equals("RegionMddRefreshDownloadTask")) {
            dbtcVar.e("RegionMddDownloadScheduleFailureTagInvalid");
            ((eluo) ((eluo) c.i()).ai((char) 10440)).B("Unexpected tag: %s.", str);
            return eqgc.i(2);
        }
        dbvg dbvgVar = this.e;
        final Context a2 = AppContextProvider.a();
        if (dbvl.b(a2, dbvgVar).isEmpty()) {
            dbtcVar.e("RegionMddDownloadScheduleFailureAccountLocationDisabled");
            ((eluo) ((eluo) c.h()).ai((char) 10439)).x("Account-level location setting is turned off.");
            return eqgc.i(2);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) a2.getSystemService("connectivity");
        ekvl.y(connectivityManager);
        final boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        if (fusa.c()) {
            eqem eqemVar = new eqem() { // from class: ddgr
                @Override // defpackage.eqem
                public final Object a(eqeo eqeoVar) {
                    ddgu d = RegionMddDownloadScheduleService.this.d(a2);
                    eqeoVar.a(d, eqex.a);
                    return d;
                }
            };
            eqex eqexVar = eqex.a;
            return eqeq.b(eqemVar, eqexVar).d(new eqek() { // from class: ddgs
                @Override // defpackage.eqek
                public final eqeq a(eqeo eqeoVar, Object obj) {
                    return new eqeq(RegionMddDownloadScheduleService.this.e((ddgu) obj, isActiveNetworkMetered));
                }
            }, eqexVar).i();
        }
        ddgu d = d(a2);
        try {
            eqgl e = e(d, isActiveNetworkMetered);
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
    public final void gf() {
    }
}
