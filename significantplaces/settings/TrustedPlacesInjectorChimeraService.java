package com.google.android.gms.significantplaces.settings;

import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TrustedPlacesInjectorChimeraService extends SettingInjectorService {
    public TrustedPlacesInjectorChimeraService() {
        super("TrustedPlacesInjectorService");
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return true;
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        String string = getString(R.string.significant_places_trusted_places_summary);
        fvbo.e(string, "getString(...)");
        return string;
    }
}
