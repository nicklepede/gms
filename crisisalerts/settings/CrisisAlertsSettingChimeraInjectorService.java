package com.google.android.gms.crisisalerts.settings;

import com.google.android.gms.R;
import defpackage.axdg;
import defpackage.axgd;
import defpackage.axgx;
import defpackage.axhh;
import defpackage.enpf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingChimeraInjectorService extends axgd {
    public axgx a;
    public axhh b;

    static {
        axdg.a("SetInj");
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
            return getString(true != ((Boolean) ((enpf) this.a.b()).v(500L, TimeUnit.MILLISECONDS)).booleanValue() ? R.string.common_off : R.string.common_on);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return getString(R.string.common_off);
        }
    }
}
