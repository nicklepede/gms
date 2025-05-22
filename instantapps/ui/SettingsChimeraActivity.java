package com.google.android.gms.instantapps.ui;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.frzi;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SettingsChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivity(new Intent().setComponent(new ComponentName(frzi.f(), frzi.e())));
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsActivity", "Exception: ", e);
        }
        finish();
    }
}
