package com.google.android.gms.location.service;

import android.util.Log;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.eaqr;
import defpackage.eara;
import defpackage.enpf;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ArwEAlertSettingChimeraInjectorService extends SettingInjectorService {
    final eaqr a;

    public ArwEAlertSettingChimeraInjectorService() {
        super("ArwEAlertSettingInjectorService");
        this.a = eaqr.a();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return eara.b();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        if (!eara.b()) {
            return getString(R.string.arw_summary_text_off);
        }
        eaqr eaqrVar = this.a;
        if (eaqrVar == null) {
            return getString(R.string.arw_summary_text_off);
        }
        try {
            return getString(true != ((Boolean) ((enpf) eaqrVar.b()).u()).booleanValue() ? R.string.arw_summary_text_off : R.string.arw_summary_text_on);
        } catch (InterruptedException | ExecutionException e) {
            Log.w("EAlertInjectorService", "Error getting optin state from PDS".concat(e.toString()));
            return getString(R.string.arw_summary_text_off);
        }
    }
}
