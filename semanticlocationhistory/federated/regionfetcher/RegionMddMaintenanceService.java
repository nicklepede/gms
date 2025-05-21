package com.google.android.gms.semanticlocationhistory.federated.regionfetcher;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.federated.regionfetcher.RegionMddMaintenanceService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.dawm;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.frxg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RegionMddMaintenanceService extends GmsTaskBoundService {
    public final czje b = new czje();
    private dawm d;
    private static final asot c = asot.b("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY);
    public static final String a = RegionMddMaintenanceService.class.getName();

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        czje czjeVar = this.b;
        czjeVar.e("RegionMddMaintenanceInvocation");
        if (!frxg.e()) {
            this.b.e("RegionMddMaintenanceFailureServiceDisabled");
            return ensj.i(2);
        }
        String str = bylnVar.a;
        if (!str.equals("RegionMddMaintenanceTask")) {
            ((ejhf) ((ejhf) c.i()).ah((char) 10445)).B("Unexpected tag: %s.", str);
            czjeVar.e("RegionMddMaintenanceFailureTagInvalid");
            return ensj.i(2);
        }
        if (this.d == null) {
            this.d = dawm.a(getApplicationContext());
        }
        dawm dawmVar = this.d;
        try {
            enss g = enps.g(ensi.h(dawmVar.c.g()), new enqc() { // from class: dawn
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    RegionMddMaintenanceService.this.b.e("RegionMddMaintenanceSuccess");
                    return ensj.i(0);
                }
            }, enre.a);
            if (dawmVar != null) {
                dawmVar.close();
            }
            return g;
        } catch (Throwable th) {
            if (dawmVar != null) {
                try {
                    dawmVar.close();
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
