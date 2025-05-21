package com.google.android.gms.semanticlocationhistory.pulp;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.pulp.PulpMddMaintenanceService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.dbdz;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frxn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PulpMddMaintenanceService extends GmsTaskBoundService {
    private dbdz c;
    private static final asot b = asot.b("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY);
    public static final String a = PulpMddMaintenanceService.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!frxn.Q()) {
            return ensj.i(2);
        }
        String str = bylnVar.a;
        if (!"PulpMddMaintenanceTask".equals(str)) {
            ((ejhf) ((ejhf) b.i()).ah((char) 10569)).B("Unexpected tag: %s.", str);
            return ensj.i(2);
        }
        Context a2 = AppContextProvider.a();
        if (this.c == null) {
            this.c = dbdz.a(a2);
        }
        return enps.g(ensi.h(this.c.c.g()), new enqc() { // from class: dbea
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                String str2 = PulpMddMaintenanceService.a;
                return ensj.i(0);
            }
        }, enre.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
    }
}
