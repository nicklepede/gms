package com.google.android.gms.instantapps.ui;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.fpfx;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SettingsChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivity(new Intent().setComponent(new ComponentName(fpfx.f(), fpfx.e())));
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsActivity", "Exception: ", e);
        }
        finish();
    }
}
