package com.google.android.gms.nearby.sharing.migration;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.platform.ComposeView;
import defpackage.cqqo;
import defpackage.ftga;
import defpackage.ftgf;
import defpackage.fvp;
import defpackage.iwv;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class MigrationNoticeChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ftga.be() || TextUtils.isEmpty(ftgf.d())) {
            finish();
            return;
        }
        iwv.a(getWindow(), false);
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(314281940, true, new cqqo(this)));
        setContentView(composeView);
    }
}
