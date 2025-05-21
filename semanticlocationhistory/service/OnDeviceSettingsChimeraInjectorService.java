package com.google.android.gms.semanticlocationhistory.service;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OnDeviceSettingsChimeraInjectorService extends SettingInjectorService {
    public OnDeviceSettingsChimeraInjectorService() {
        super("OnDeviceSettingsInjectorService");
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return true;
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        return getString(R.string.timeline_settings_subtext);
    }
}
