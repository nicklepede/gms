package com.google.android.gms.nearby.sharing.migration;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.compose.ui.platform.ComposeView;
import defpackage.coht;
import defpackage.fqmf;
import defpackage.fqmk;
import defpackage.fuy;
import defpackage.ivf;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class MigrationNoticeChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fqmf.bd() || TextUtils.isEmpty(fqmk.d())) {
            finish();
            return;
        }
        ivf.a(getWindow(), false);
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(314281940, true, new coht(this)));
        setContentView(composeView);
    }
}
