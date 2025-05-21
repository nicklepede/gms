package com.google.android.gms.chromesync.tasks;

import com.google.android.gms.chromesync.tasks.UpdateAffiliationsTaskBoundService;
import defpackage.apen;
import defpackage.apoa;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fuuq;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.unx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class UpdateAffiliationsTaskBoundService extends Pommel_UpdateAffiliationsTaskBoundService {
    private static final asot b = asot.b("UpdateAffiliationsTaskBoundService", asej.CHROME_SYNC);
    public fuuq a;
    private final fuuw c = new fuvg(new fvaf() { // from class: apqx
        @Override // defpackage.fvaf
        public final Object a() {
            fuuq fuuqVar = UpdateAffiliationsTaskBoundService.this.a;
            if (fuuqVar == null) {
                fvbo.j("accountAffiliationsUpdaterFactory");
                fuuqVar = null;
            }
            return fuuqVar.a();
        }
    });

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (bylnVar.a.equals("PasswordManagerPeriodicUpdateAffiliationsTaskTag")) {
            try {
                ((apoa) this.c.a()).b();
                ((ejhf) b.h()).x("Updating affiliation from scheduled task scheduled successfully.");
                return 0;
            } catch (apen e) {
                ((ejhf) ((ejhf) b.j()).s(e)).x("Exception thrown while updating affiliation from scheduled task.");
            } catch (unx e2) {
                ((ejhf) ((ejhf) b.j()).s(e2)).x("Authentication exception thrown while updating affiliation from scheduled task.");
            }
        }
        return 2;
    }
}
