package com.google.android.gms.thunderbird.settings;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.asqh;
import defpackage.dfzq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdChimeraSettingInjectorService extends SettingInjectorService {
    private dfzq a;

    public ThunderbirdChimeraSettingInjectorService() {
        super("ThunderbirdSettingsInjectorService");
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        this.a = dfzq.b(this);
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return true;
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        if (asqh.f()) {
            return this.a.l() ? getString(R.string.thunderbird_summary_text_on) : getString(R.string.thunderbird_summary_text_off);
        }
        return null;
    }
}
