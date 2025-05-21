package com.google.android.gms.wearable.backup.wear;

import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.arxo;
import defpackage.djlj;
import defpackage.djvo;
import defpackage.fuy;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WearBackupComposeDialogChimeraActivity extends qfp {
    private static final arxo j = new djlj("WearBackupComposeDialog");

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j.j("onCreate", new Object[0]);
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(1284899153, true, new djvo(this)));
        setContentView(composeView);
    }
}
