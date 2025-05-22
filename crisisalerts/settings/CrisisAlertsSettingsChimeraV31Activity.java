package com.google.android.gms.crisisalerts.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.azjo;
import defpackage.azki;
import defpackage.bp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingsChimeraV31Activity extends azki {
    public azjo j;

    @Override // defpackage.azki, defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        setTheme(R.style.CrisisAlertsAppThemeSILK);
        setContentView(R.layout.crisis_alerts_settings_sdk31);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.settings_fragment_container, this.j);
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
