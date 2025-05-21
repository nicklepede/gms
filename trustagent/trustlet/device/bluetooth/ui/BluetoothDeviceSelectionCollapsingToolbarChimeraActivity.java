package com.google.android.gms.trustagent.trustlet.device.bluetooth.ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.abt;
import defpackage.asqh;
import defpackage.bp;
import defpackage.dgmp;
import defpackage.dgqr;
import defpackage.ngn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BluetoothDeviceSelectionCollapsingToolbarChimeraActivity extends dgmp implements abt {
    private dgqr k;

    @Override // defpackage.dgmp
    public final /* synthetic */ ngn a() {
        return new dgqr();
    }

    @Override // defpackage.dgmp
    public final String c() {
        return "Coffee-BluetoothDeviceSelectionFragment";
    }

    @Override // defpackage.abt
    public final /* synthetic */ void jq(Object obj) {
        f();
    }

    @Override // defpackage.dgmp, defpackage.dgmo, defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g();
        this.k = new dgqr();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, this.k);
        bpVar.a();
    }

    @Override // defpackage.dgmp, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // defpackage.dgmo, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        if (asqh.f()) {
            j.intValue();
            setResult(-11);
        }
        super.onStop();
    }
}
