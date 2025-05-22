package com.google.android.gms.thunderbird.settings;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.auub;
import defpackage.dikv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdChimeraSettingInjectorService extends SettingInjectorService {
    private dikv a;

    public ThunderbirdChimeraSettingInjectorService() {
        super("ThunderbirdSettingsInjectorService");
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = dikv.b(this);
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return true;
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        if (auub.f()) {
            return this.a.l() ? getString(R.string.thunderbird_summary_text_on) : getString(R.string.thunderbird_summary_text_off);
        }
        return null;
    }
}
