package com.google.android.gms.nearby.connection.service.analytics.buffers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aupz;
import defpackage.casd;
import defpackage.catb;
import defpackage.chet;
import defpackage.chrg;
import defpackage.efxh;
import defpackage.ftdq;
import defpackage.ftdv;
import j$.time.Duration;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private efxh a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = efxh.a(getApplicationContext());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "com.google.android.setupwizard.SETUP_WIZARD_FINISHED") && ftdv.I()) {
            getApplicationContext();
            new aupz(1, 9);
            List c = this.a.c("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
            if (c == null || c.isEmpty()) {
                return;
            }
            chet chetVar = chrg.a;
            chetVar.a().h("%d buffered logs found", Integer.valueOf(c.size()));
            if (c.size() != 0) {
                Context applicationContext = getApplicationContext();
                int i = CleanBufferedLogsService.a;
                casd a = casd.a(applicationContext);
                ftdq ftdqVar = ftdq.a;
                long ah = ftdqVar.lK().ah();
                long ai = ftdqVar.lK().ai() + ah;
                catb catbVar = new catb();
                catbVar.e(Duration.ofMillis(ah).toSeconds(), Duration.ofMillis(ai).toSeconds());
                catbVar.t("nc_upload_buffered_logs_one_off");
                catbVar.w(CleanBufferedLogsService.class.getName());
                catbVar.x(0, 0);
                catbVar.g(2);
                a.f(catbVar.b());
                chetVar.b().h("One off task %s scheduled!", "nc_upload_buffered_logs_one_off");
            }
        }
    }
}
