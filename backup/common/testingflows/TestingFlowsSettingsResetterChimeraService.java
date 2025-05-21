package com.google.android.gms.backup.common.testingflows;

import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahwd;
import defpackage.aibx;
import defpackage.arxo;
import defpackage.byln;
import defpackage.ensj;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class TestingFlowsSettingsResetterChimeraService extends GmsTaskBoundService {
    private static final arxo a = ahwd.a("TestingFlowsSettingsResetterChimeraService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        try {
            Settings.Secure.putInt(getContentResolver(), "backup_enable_testing_flows", 0);
            aibx.i(this);
            return ensj.i(0);
        } catch (IllegalArgumentException e) {
            a.g("Invalid argument for secure setting backup_enable_testing_flows", e, new Object[0]);
            return ensj.i(2);
        } catch (SecurityException e2) {
            a.g("Permission denied to write secure setting backup_enable_testing_flows", e2, new Object[0]);
            return ensj.i(2);
        }
    }
}
