package com.google.android.gms.location.service;

import android.util.Log;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.eddi;
import defpackage.eddm;
import defpackage.eqcy;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class EAlertSettingChimeraInjectorService extends SettingInjectorService {
    final eddi a;

    public EAlertSettingChimeraInjectorService() {
        super("EAlertSettingInjectorService");
        this.a = eddi.a();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return eddm.d();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        try {
            return getString(true != ((Boolean) ((eqcy) this.a.b()).u()).booleanValue() ? R.string.ealert_summary_text_off : R.string.ealert_summary_text_on);
        } catch (InterruptedException | ExecutionException e) {
            Log.w("EAlertInjectorService", "Error getting optin state from PDS".concat(e.toString()));
            return getString(R.string.ealert_summary_text_off);
        }
    }
}
