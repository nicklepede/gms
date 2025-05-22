package com.google.android.gms.wearable.consent;

import android.util.Log;
import defpackage.dg;
import defpackage.dmnm;
import defpackage.dmnn;
import defpackage.dmns;
import defpackage.dmnv;
import defpackage.dmqd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PrivacySettingsChimeraActivity extends dmns implements dmnn {
    public dmnn j;

    @Override // defpackage.dmnn
    public final void a(int i) {
        dmnn dmnnVar = this.j;
        if (dmnnVar != null) {
            dmnnVar.a(i);
            return;
        }
        Log.e("wearable.Privacy", "onCloudSyncDisableConfirmed  " + dmnm.a(i) + " dropped: no listener set.");
    }

    @Override // defpackage.rxx
    public final boolean hK() {
        finish();
        return true;
    }

    @Override // defpackage.dmns
    protected final dg k(dmnv dmnvVar) {
        if (Log.isLoggable("wearable.Consents", 3)) {
            Log.d("wearable.Consents", String.format("[PrivacySettingsFragment] newInstance(%b)", Boolean.valueOf(dmnvVar.b)));
        }
        dmqd dmqdVar = new dmqd();
        dmqd.y(dmqdVar, dmnvVar);
        return dmqdVar;
    }

    @Override // defpackage.dmns
    protected final String l() {
        return "privacyFragment";
    }
}
