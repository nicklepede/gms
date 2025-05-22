package com.google.android.gms.backup.common.testingflows;

import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import defpackage.ajqm;
import defpackage.ajwt;
import defpackage.akcn;
import defpackage.auad;
import defpackage.ekxj;
import defpackage.fogf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class TestingFlowsSettingsResetterIntentOperation extends IntentOperation {
    private static final auad a = ajwt.a("TestingFlowsSettingsResetterIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fogf.e();
        if (fogf.d()) {
            String action = intent.getAction();
            ekxj.e(action);
            if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                a.m("Received unexpected intent: %s", action);
                return;
            }
            if (ajqm.a.h(this)) {
                a.h("B&R testing flows are enabled, resetting to disabled", new Object[0]);
                try {
                    Settings.Secure.putInt(getContentResolver(), "backup_enable_testing_flows", 0);
                    akcn.k(this);
                } catch (IllegalArgumentException e) {
                    a.g("Invalid argument for secure setting backup_enable_testing_flows", e, new Object[0]);
                } catch (SecurityException e2) {
                    a.g("Permission denied to write secure setting backup_enable_testing_flows", e2, new Object[0]);
                }
            }
        }
    }
}
