package com.google.android.gms.location.service;

import android.util.Log;
import com.google.android.chimera.SettingInjectorService;
import com.google.android.gms.R;
import defpackage.eaqw;
import defpackage.eara;
import defpackage.enpf;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class EAlertSettingChimeraInjectorService extends SettingInjectorService {
    final eaqw a;

    public EAlertSettingChimeraInjectorService() {
        super("EAlertSettingInjectorService");
        this.a = eaqw.a();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final boolean onGetEnabled() {
        return eara.d();
    }

    @Override // com.google.android.chimera.SettingInjectorService
    public final String onGetSummary() {
        try {
            return getString(true != ((Boolean) ((enpf) this.a.b()).u()).booleanValue() ? R.string.ealert_summary_text_off : R.string.ealert_summary_text_on);
        } catch (InterruptedException | ExecutionException e) {
            Log.w("EAlertInjectorService", "Error getting optin state from PDS".concat(e.toString()));
            return getString(R.string.ealert_summary_text_off);
        }
    }
}
