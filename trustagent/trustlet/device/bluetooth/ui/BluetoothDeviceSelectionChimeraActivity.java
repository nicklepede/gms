package com.google.android.gms.trustagent.trustlet.device.bluetooth.ui;

import android.R;
import android.os.Bundle;
import android.view.MenuItem;
import defpackage.abt;
import defpackage.asqh;
import defpackage.bp;
import defpackage.dgmn;
import defpackage.dgqr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BluetoothDeviceSelectionChimeraActivity extends dgmn implements abt {
    private dgqr l;

    @Override // defpackage.abt
    public final /* synthetic */ void jq(Object obj) {
        this.k = false;
    }

    @Override // defpackage.dgmn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hy().o(true);
        this.l = new dgqr();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content, this.l);
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // defpackage.dgmn, defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        if (asqh.f()) {
            j.intValue();
            setResult(-11);
        }
        super.onStop();
    }
}
