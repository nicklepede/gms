package com.google.android.gms.trustagent.trustlet.device.bluetooth.ui;

import android.R;
import android.os.Bundle;
import android.view.MenuItem;
import defpackage.aby;
import defpackage.auub;
import defpackage.bp;
import defpackage.dixs;
import defpackage.djbw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BluetoothDeviceSelectionChimeraActivity extends dixs implements aby {
    private djbw l;

    @Override // defpackage.aby
    public final /* synthetic */ void jF(Object obj) {
        this.k = false;
    }

    @Override // defpackage.dixs, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hO().o(true);
        this.l = new djbw();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content, this.l);
        bpVar.a();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // defpackage.dixs, defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        if (auub.f()) {
            j.intValue();
            setResult(-11);
        }
        super.onStop();
    }
}
