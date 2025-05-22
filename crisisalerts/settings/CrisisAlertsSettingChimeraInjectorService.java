package com.google.android.gms.crisisalerts.settings;

import com.google.android.gms.R;
import defpackage.azhg;
import defpackage.azkd;
import defpackage.azkx;
import defpackage.azlh;
import defpackage.eqcy;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingChimeraInjectorService extends azkd {
    public azkx a;
    public azlh b;

    static {
        azhg.a("SetInj");
    }

    public CrisisAlertsSettingChimeraInjectorService() {
        super("EAlertSettingInjectorService");
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return this.b.b();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        try {
            return getString(true != ((Boolean) ((eqcy) this.a.b()).v(500L, TimeUnit.MILLISECONDS)).booleanValue() ? R.string.common_off : R.string.common_on);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return getString(R.string.common_off);
        }
    }
}
