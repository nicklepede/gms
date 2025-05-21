package com.google.android.gms.cast.settings;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.anlj;
import defpackage.annw;
import defpackage.asng;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastSettingsChimeraCollapsingActivity extends qgg {
    private final annw j = new annw("CastSettingsChimera");

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        getIntent().getStringExtra("FRAGMENT_TYPE");
        annw annwVar = this.j;
        annwVar.n("onCreate CastSettingsChimeraCollapsingActivity with action = %s", action);
        anlj.f();
        Intent intent = new Intent(true != TextUtils.equals(action, "com.google.android.gms.cast.settings.CastSettingsCollapsingDebugAction") ? "com.google.android.gms.cast.settings.CastSettingsAction" : "com.google.android.gms.cast.settings.CastSettingsDebugAction");
        asng.k(intent);
        startActivity(intent);
        finish();
        annwVar.m("end the collapsing settings activity and start the legacy settings activity ");
    }

    @Override // defpackage.qgg, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onNavigateUp() {
        finish();
        return true;
    }
}
