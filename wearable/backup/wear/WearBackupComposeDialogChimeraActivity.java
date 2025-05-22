package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.auad;
import defpackage.dlxc;
import defpackage.dmhh;
import defpackage.fvp;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WearBackupComposeDialogChimeraActivity extends ryt {
    private static final auad j = new dlxc("WearBackupComposeDialog");

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.j("onCreate", new Object[0]);
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(1284899153, true, new dmhh(this)));
        setContentView(composeView);
    }
}
