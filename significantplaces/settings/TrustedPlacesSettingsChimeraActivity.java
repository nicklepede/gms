package com.google.android.gms.significantplaces.settings;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.bp;
import defpackage.dciy;
import defpackage.dcmh;
import defpackage.fvbo;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class TrustedPlacesSettingsChimeraActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = dciy.a;
        dciy.c(this);
        if (bundle == null) {
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, new dcmh());
            bpVar.a();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        fvbo.f(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        int i = dciy.a;
        dciy.b(this);
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        int i = dciy.a;
        dciy.d(this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        int i = dciy.a;
        dciy.e(this);
        super.onStop();
    }
}
