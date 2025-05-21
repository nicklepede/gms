package com.google.android.gms.wearable.consent;

import android.util.Log;
import defpackage.dg;
import defpackage.dkbt;
import defpackage.dkbu;
import defpackage.dkbz;
import defpackage.dkcc;
import defpackage.dkek;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PrivacySettingsChimeraActivity extends dkbz implements dkbu {
    public dkbu j;

    @Override // defpackage.dkbu
    public final void a(int i) {
        dkbu dkbuVar = this.j;
        if (dkbuVar != null) {
            dkbuVar.a(i);
            return;
        }
        Log.e("wearable.Privacy", "onCloudSyncDisableConfirmed  " + dkbt.a(i) + " dropped: no listener set.");
    }

    @Override // defpackage.qet
    public final boolean hu() {
        finish();
        return true;
    }

    @Override // defpackage.dkbz
    protected final dg k(dkcc dkccVar) {
        if (Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", String.format("[PrivacySettingsFragment] newInstance(%b)", Boolean.valueOf(dkccVar.b)));
        }
        dkek dkekVar = new dkek();
        dkek.y(dkekVar, dkccVar);
        return dkekVar;
    }

    @Override // defpackage.dkbz
    protected final String l() {
        return "privacyFragment";
    }
}
