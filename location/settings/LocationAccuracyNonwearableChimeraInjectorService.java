package com.google.android.gms.location.settings;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.asqh;
import defpackage.bwth;
import defpackage.camc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationAccuracyNonwearableChimeraInjectorService extends SettingInjectorService {
    public LocationAccuracyNonwearableChimeraInjectorService() {
        super("LocationAccuracySettingsInjectorService");
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return camc.a() && !bwth.o(this);
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        if (!asqh.f()) {
            return "";
        }
        String string = getString(true != bwth.r(this) ? R.string.location_accuracy_summary_text_off : R.string.location_accuracy_summary_text_on);
        fvbo.c(string);
        return string;
    }
}
