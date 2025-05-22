package com.google.android.gms.backup.common.testingflows;

import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajwt;
import defpackage.akcn;
import defpackage.auad;
import defpackage.cauf;
import defpackage.eqgc;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class TestingFlowsSettingsResetterChimeraService extends GmsTaskBoundService {
    private static final auad a = ajwt.a("TestingFlowsSettingsResetterChimeraService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        try {
            Settings.Secure.putInt(getContentResolver(), "backup_enable_testing_flows", 0);
            akcn.k(this);
            return eqgc.i(0);
        } catch (IllegalArgumentException e) {
            a.g("Invalid argument for secure setting backup_enable_testing_flows", e, new Object[0]);
            return eqgc.i(2);
        } catch (SecurityException e2) {
            a.g("Permission denied to write secure setting backup_enable_testing_flows", e2, new Object[0]);
            return eqgc.i(2);
        }
    }
}
