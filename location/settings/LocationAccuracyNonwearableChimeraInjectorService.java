package com.google.android.gms.location.settings;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.auub;
import defpackage.bzbx;
import defpackage.ccus;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationAccuracyNonwearableChimeraInjectorService extends SettingInjectorService {
    public LocationAccuracyNonwearableChimeraInjectorService() {
        super("LocationAccuracySettingsInjectorService");
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return ccus.a() && !bzbx.o(this);
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        if (!auub.f()) {
            return "";
        }
        String string = getString(true != bzbx.s(this) ? R.string.location_accuracy_summary_text_off : R.string.location_accuracy_summary_text_on);
        fxxm.c(string);
        return string;
    }
}
