package com.google.android.gms.backup.common.testingflows;

import android.content.Intent;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import defpackage.ahpw;
import defpackage.ahwd;
import defpackage.aibx;
import defpackage.arxo;
import defpackage.eike;
import defpackage.flov;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class TestingFlowsSettingsResetterIntentOperation extends IntentOperation {
    private static final arxo a = ahwd.a("TestingFlowsSettingsResetterIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        flov.e();
        if (flov.d()) {
            String action = intent.getAction();
            eike.e(action);
            if (!action.equals("android.intent.action.BOOT_COMPLETED")) {
                a.m("Received unexpected intent: %s", action);
                return;
            }
            if (ahpw.a.h(this)) {
                a.h("B&R testing flows are enabled, resetting to disabled", new Object[0]);
                try {
                    Settings.Secure.putInt(getContentResolver(), "backup_enable_testing_flows", 0);
                    aibx.i(this);
                } catch (IllegalArgumentException e) {
                    a.g("Invalid argument for secure setting backup_enable_testing_flows", e, new Object[0]);
                } catch (SecurityException e2) {
                    a.g("Permission denied to write secure setting backup_enable_testing_flows", e2, new Object[0]);
                }
            }
        }
    }
}
