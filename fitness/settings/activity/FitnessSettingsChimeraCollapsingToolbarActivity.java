package com.google.android.gms.fitness.settings.activity;

import android.content.Intent;
import android.os.Bundle;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitnessSettingsChimeraCollapsingToolbarActivity extends qgg {
    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.fitness.settings.FitnessSettingsActivity"));
        finish();
    }
}
