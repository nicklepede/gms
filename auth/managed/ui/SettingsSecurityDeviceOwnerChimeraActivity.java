package com.google.android.gms.auth.managed.ui;

import android.content.Intent;
import android.os.Bundle;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SettingsSecurityDeviceOwnerChimeraActivity extends qfn {
    public static final Intent h = new Intent("com.google.android.apps.work.clouddpc.ACTION_DO_STATUS_UI").setPackage("com.google.android.apps.work.clouddpc");

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            setResult(i2, intent);
            finish();
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivityForResult(h, 1);
    }
}
