package com.google.android.gms.cast.settings;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.apmy;
import defpackage.appp;
import defpackage.aura;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastSettingsChimeraCollapsingActivity extends rzk {
    private final appp j = new appp("CastSettingsChimera");

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        getIntent().getStringExtra("FRAGMENT_TYPE");
        appp apppVar = this.j;
        apppVar.n("onCreate CastSettingsChimeraCollapsingActivity with action = %s", action);
        apmy.f();
        Intent intent = new Intent(true != TextUtils.equals(action, "com.google.android.gms.cast.settings.CastSettingsCollapsingDebugAction") ? "com.google.android.gms.cast.settings.CastSettingsAction" : "com.google.android.gms.cast.settings.CastSettingsDebugAction");
        aura.k(intent);
        startActivity(intent);
        finish();
        apppVar.m("end the collapsing settings activity and start the legacy settings activity ");
    }

    @Override // defpackage.rzk, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onNavigateUp() {
        finish();
        return true;
    }
}
