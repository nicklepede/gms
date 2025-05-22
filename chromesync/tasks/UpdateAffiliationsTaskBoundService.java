package com.google.android.gms.chromesync.tasks;

import com.google.android.gms.chromesync.tasks.UpdateAffiliationsTaskBoundService;
import defpackage.arhe;
import defpackage.arqr;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fxqo;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.wjw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class UpdateAffiliationsTaskBoundService extends Pommel_UpdateAffiliationsTaskBoundService {
    private static final ausn b = ausn.b("UpdateAffiliationsTaskBoundService", auid.CHROME_SYNC);
    public fxqo a;
    private final fxqu c = new fxre(new fxwd() { // from class: arto
        @Override // defpackage.fxwd
        public final Object a() {
            fxqo fxqoVar = UpdateAffiliationsTaskBoundService.this.a;
            if (fxqoVar == null) {
                fxxm.j("accountAffiliationsUpdaterFactory");
                fxqoVar = null;
            }
            return fxqoVar.a();
        }
    });

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (caufVar.a.equals("PasswordManagerPeriodicUpdateAffiliationsTaskTag")) {
            try {
                ((arqr) this.c.a()).b();
                ((eluo) b.h()).x("Updating affiliation from scheduled task scheduled successfully.");
                return 0;
            } catch (arhe e) {
                ((eluo) ((eluo) b.j()).s(e)).x("Exception thrown while updating affiliation from scheduled task.");
            } catch (wjw e2) {
                ((eluo) ((eluo) b.j()).s(e2)).x("Authentication exception thrown while updating affiliation from scheduled task.");
            }
        }
        return 2;
    }
}
