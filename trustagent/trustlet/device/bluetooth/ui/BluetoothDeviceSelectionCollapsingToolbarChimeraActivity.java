package com.google.android.gms.trustagent.trustlet.device.bluetooth.ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.gms.R;
import defpackage.aby;
import defpackage.auub;
import defpackage.bp;
import defpackage.dixu;
import defpackage.djbw;
import defpackage.ozo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BluetoothDeviceSelectionCollapsingToolbarChimeraActivity extends dixu implements aby {
    private djbw k;

    @Override // defpackage.dixu
    public final /* synthetic */ ozo a() {
        return new djbw();
    }

    @Override // defpackage.dixu
    public final String f() {
        return "Coffee-BluetoothDeviceSelectionFragment";
    }

    @Override // defpackage.aby
    public final /* synthetic */ void jF(Object obj) {
        g();
    }

    @Override // defpackage.dixu, defpackage.dixt, defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h();
        this.k = new djbw();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.content_frame, this.k);
        bpVar.a();
    }

    @Override // defpackage.dixu, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // defpackage.dixt, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        if (auub.f()) {
            j.intValue();
            setResult(-11);
        }
        super.onStop();
    }
}
