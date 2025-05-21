package com.google.android.gms.location.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.camb;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationAccuracyNonwearableChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.location_settings_location_accuracy_activity_title);
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, new camb());
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
