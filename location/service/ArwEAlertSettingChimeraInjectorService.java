package com.google.android.gms.location.service;

import android.util.Log;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.eddd;
import defpackage.eddm;
import defpackage.eqcy;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ArwEAlertSettingChimeraInjectorService extends SettingInjectorService {
    final eddd a;

    public ArwEAlertSettingChimeraInjectorService() {
        super("ArwEAlertSettingInjectorService");
        this.a = eddd.a();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return eddm.b();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        if (!eddm.b()) {
            return getString(R.string.arw_summary_text_off);
        }
        eddd edddVar = this.a;
        if (edddVar == null) {
            return getString(R.string.arw_summary_text_off);
        }
        try {
            return getString(true != ((Boolean) ((eqcy) edddVar.b()).u()).booleanValue() ? R.string.arw_summary_text_off : R.string.arw_summary_text_on);
        } catch (InterruptedException | ExecutionException e) {
            Log.w("EAlertInjectorService", "Error getting optin state from PDS".concat(e.toString()));
            return getString(R.string.arw_summary_text_off);
        }
    }
}
