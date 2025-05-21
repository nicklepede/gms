package com.google.android.gms.nearby.connection.service.analytics.buffers;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asmf;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.cexi;
import defpackage.cfju;
import defpackage.edkl;
import defpackage.fqjy;
import defpackage.fqkd;
import j$.time.Duration;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private edkl a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = edkl.a(getApplicationContext());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "com.google.android.setupwizard.SETUP_WIZARD_FINISHED") && fqkd.E()) {
            getApplicationContext();
            new asmf(1, 9);
            List c = this.a.c("/auth_consent_clearcut_logs/NEARBY_CONNECTIONS");
            if (c == null || c.isEmpty()) {
                return;
            }
            cexi cexiVar = cfju.a;
            cexiVar.a().h("%d buffered logs found", Integer.valueOf(c.size()));
            if (c.size() != 0) {
                Context applicationContext = getApplicationContext();
                int i = CleanBufferedLogsService.a;
                byjl a = byjl.a(applicationContext);
                long ah = fqjy.a.a().ah();
                long ai = fqjy.a.a().ai() + ah;
                bykj bykjVar = new bykj();
                bykjVar.e(Duration.ofMillis(ah).toSeconds(), Duration.ofMillis(ai).toSeconds());
                bykjVar.t("nc_upload_buffered_logs_one_off");
                bykjVar.w(CleanBufferedLogsService.class.getName());
                bykjVar.x(0, 0);
                bykjVar.g(2);
                a.f(bykjVar.b());
                cexiVar.b().h("One off task %s scheduled!", "nc_upload_buffered_logs_one_off");
            }
        }
    }
}
