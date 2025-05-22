package com.google.android.gms.semanticlocationhistory.federated.regionfetcher;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddMaintenanceService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.ddgu;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fusa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RegionMddMaintenanceService extends GmsTaskBoundService {
    public final dbtc b = new dbtc();
    private ddgu d;
    private static final ausn c = ausn.b("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY);
    public static final String a = RegionMddMaintenanceService.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        dbtc dbtcVar = this.b;
        dbtcVar.e("RegionMddMaintenanceInvocation");
        if (!fusa.d()) {
            this.b.e("RegionMddMaintenanceFailureServiceDisabled");
            return eqgc.i(2);
        }
        String str = caufVar.a;
        if (!str.equals("RegionMddMaintenanceTask")) {
            ((eluo) ((eluo) c.i()).ai((char) 10451)).B("Unexpected tag: %s.", str);
            dbtcVar.e("RegionMddMaintenanceFailureTagInvalid");
            return eqgc.i(2);
        }
        if (this.d == null) {
            this.d = ddgu.a(getApplicationContext());
        }
        ddgu ddguVar = this.d;
        try {
            eqgl g = eqdl.g(eqgb.h(ddguVar.c.g()), new eqdv() { // from class: ddgv
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    RegionMddMaintenanceService.this.b.e("RegionMddMaintenanceSuccess");
                    return eqgc.i(0);
                }
            }, eqex.a);
            if (ddguVar != null) {
                ddguVar.close();
            }
            return g;
        } catch (Throwable th) {
            if (ddguVar != null) {
                try {
                    ddguVar.close();
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
