package com.google.android.gms.icing.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.icing.proxy.UpdateIcingCorporaIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.blfp;
import defpackage.blfw;
import defpackage.bltn;
import defpackage.byln;
import defpackage.fpaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IcingGcmTaskChimeraService extends GmsTaskChimeraService {
    private bltn a;
    private blfp b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        blfw.d("%s: Running gcm task %s", "IcingGcmTaskChimeraService", str);
        if (!str.equals("IcingIndexRetrySchedule")) {
            if (!str.equals("UpdateIcingIntentCorpora")) {
                Intent intent = new Intent("com.google.android.gms.icing.GCM_TASK");
                intent.setClassName(this, "com.google.android.gms.icing.service.IndexWorkerService");
                intent.putExtra("tag", str);
                startService(intent);
                return 0;
            }
            Bundle bundle = bylnVar.b;
            if (bundle == null || !bundle.containsKey("EXTRA_LAST_RAW_CONTACT_COUNT") || !bundle.containsKey("EXTRA_ATTEMPT")) {
                return 2;
            }
            new UpdateIcingCorporaIntentOperation().d(bundle.getInt("EXTRA_LAST_RAW_CONTACT_COUNT"), bundle.getInt("EXTRA_ATTEMPT"));
            return 0;
        }
        blfw.a("Retrying indexing of failed corpora.");
        Bundle bundle2 = bylnVar.b;
        if (bundle2 == null || !bundle2.containsKey("delaySeconds")) {
            blfw.s("Retrying indexing of failed corpora failed due to missing delay_seconds.");
            return 2;
        }
        long j = bundle2.getLong("delaySeconds");
        if (j < 0) {
            blfw.s("Retrying indexing of failed corpora failed due to invalid delay.");
            return 2;
        }
        blfp blfpVar = this.b;
        if (blfpVar == null) {
            blfw.s("Retrying indexing of failed corpora failed as indexManager is null.");
            return 2;
        }
        blfpVar.D(j);
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        if (fpaz.j()) {
            bltn c = bltn.c(getApplicationContext());
            this.a = c;
            if (c != null) {
                this.b = c.a();
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.chimera.Service
    public final void onDestroy() {
        bltn bltnVar = this.a;
        if (bltnVar != null) {
            bltnVar.b();
        }
        super.onDestroy();
    }
}
