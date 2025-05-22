package com.google.android.gms.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.ccur;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationAccuracyNonwearableChimeraActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.location_settings_location_accuracy_activity_title);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, new ccur());
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
