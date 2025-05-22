package com.google.android.gms.auth.managed.ui;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SettingsSecurityDeviceOwnerChimeraActivity extends ryr {
    public static final Intent h = new Intent("com.google.android.apps.work.clouddpc.ACTION_DO_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult(h, 1);
    }
}
