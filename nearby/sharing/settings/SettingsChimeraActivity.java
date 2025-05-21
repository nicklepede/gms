package com.google.android.gms.nearby.sharing.settings;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.cmdb;
import defpackage.cmep;
import defpackage.cohy;
import defpackage.cohz;
import defpackage.cqxt;
import defpackage.cqzd;
import defpackage.fuy;
import defpackage.fvbo;
import defpackage.ivf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SettingsChimeraActivity extends cqxt {
    public cmdb f;

    @Override // defpackage.cqxt, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cmep.b(this);
        Intent intent = getIntent();
        fvbo.e(intent, "getIntent(...)");
        Intent a = cohz.a(this, intent, cohy.e);
        if (a != null) {
            startActivity(a);
            finish();
            return;
        }
        this.f = cmdb.f(this);
        ivf.a(getWindow(), false);
        Bundle extras = getIntent().getExtras();
        boolean z = extras != null ? extras.getBoolean("is_from_onboarding", false) : false;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fuy(209133547, true, new cqzd(z, this)));
        setContentView(composeView);
    }
}
