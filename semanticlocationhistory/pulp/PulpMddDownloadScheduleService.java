package com.google.android.gms.semanticlocationhistory.pulp;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpMddDownloadScheduleService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.ddoh;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fush;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PulpMddDownloadScheduleService extends GmsTaskBoundService {
    private ddoh c;
    private static final ausn b = ausn.b("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY);
    public static final String a = PulpMddDownloadScheduleService.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!fush.Q()) {
            return eqgc.i(2);
        }
        String str = caufVar.a;
        if (!"PulpMddRefreshDownloadTask".equals(str)) {
            ((eluo) ((eluo) b.i()).ai((char) 10567)).B("Unexpected tag: %s.", str);
            return eqgc.i(2);
        }
        Context a2 = AppContextProvider.a();
        if (this.c == null) {
            this.c = ddoh.a(a2);
        }
        return eqdl.g(eqgb.h(this.c.c.e("MDD.WIFI.CHARGING.PERIODIC.TASK")), new eqdv() { // from class: ddod
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                String str2 = PulpMddDownloadScheduleService.a;
                return eqgc.i(0);
            }
        }, eqex.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
    }
}
