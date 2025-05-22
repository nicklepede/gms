package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bnmh;
import defpackage.bnmo;
import defpackage.boaf;
import defpackage.cauf;
import defpackage.frug;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IcingGcmTaskChimeraService extends GmsTaskChimeraService {
    private boaf a;
    private bnmh b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        bnmo.d("%s: Running gcm task %s", "IcingGcmTaskChimeraService", str);
        if (!str.equals("IcingIndexRetrySchedule")) {
            if (!str.equals("UpdateIcingIntentCorpora")) {
                Intent intent = new Intent("com.google.android.gms.icing.GCM_TASK");
                intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
                intent.putExtra("tag", str);
                startService(intent);
                return 0;
            }
            Bundle bundle = caufVar.b;
            if (bundle == null || !bundle.containsKey("EXTRA_LAST_RAW_CONTACT_COUNT") || !bundle.containsKey("EXTRA_ATTEMPT")) {
                return 2;
            }
            new UpdateIcingCorporaIntentOperation().d(bundle.getInt("EXTRA_LAST_RAW_CONTACT_COUNT"), bundle.getInt("EXTRA_ATTEMPT"));
            return 0;
        }
        bnmo.a("Retrying indexing of failed corpora.");
        Bundle bundle2 = caufVar.b;
        if (bundle2 == null || !bundle2.containsKey("delaySeconds")) {
            bnmo.s("Retrying indexing of failed corpora failed due to missing delay_seconds.");
            return 2;
        }
        long j = bundle2.getLong("delaySeconds");
        if (j < 0) {
            bnmo.s("Retrying indexing of failed corpora failed due to invalid delay.");
            return 2;
        }
        bnmh bnmhVar = this.b;
        if (bnmhVar == null) {
            bnmo.s("Retrying indexing of failed corpora failed as indexManager is null.");
            return 2;
        }
        bnmhVar.D(j);
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (frug.j()) {
            boaf c = boaf.c(getApplicationContext());
            this.a = c;
            if (c != null) {
                this.b = c.a();
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        boaf boafVar = this.a;
        if (boafVar != null) {
            boafVar.b();
        }
        super.onDestroy();
    }
}
