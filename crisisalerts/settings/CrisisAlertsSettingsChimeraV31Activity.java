package com.google.android.gms.crisisalerts.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.axfo;
import defpackage.axgi;
import defpackage.bp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsSettingsChimeraV31Activity extends axgi {
    public axfo j;

    @Override // defpackage.axgi, defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addSystemFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        setTheme(R.style.CrisisAlertsAppThemeSILK);
        setContentView(R.layout.crisis_alerts_settings_sdk31);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.settings_fragment_container, this.j);
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
