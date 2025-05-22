package com.google.android.gms.fitness.settings.activity;

import android.content.Intent;
import android.os.Bundle;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitnessSettingsChimeraCollapsingToolbarActivity extends rzk {
    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.fitness.settings.FitnessSettingsActivity"));
        finish();
    }
}
