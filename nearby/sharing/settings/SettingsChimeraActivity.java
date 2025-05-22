package com.google.android.gms.nearby.sharing.settings;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import defpackage.colj;
import defpackage.comx;
import defpackage.cqqt;
import defpackage.cqqu;
import defpackage.ctgx;
import defpackage.ctih;
import defpackage.fvp;
import defpackage.fxxm;
import defpackage.iwv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SettingsChimeraActivity extends ctgx {
    public colj f;

    @Override // defpackage.ctgx, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        comx.b(this);
        Intent intent = getIntent();
        fxxm.e(intent, "getIntent(...)");
        Intent a = cqqu.a(this, intent, cqqt.e);
        if (a != null) {
            startActivity(a);
            finish();
            return;
        }
        this.f = colj.f(this);
        iwv.a(getWindow(), false);
        Bundle extras = getIntent().getExtras();
        boolean z = extras != null ? extras.getBoolean("is_from_onboarding", false) : false;
        ComposeView composeView = new ComposeView(this, null, 0, 6, null);
        composeView.a(new fvp(209133547, true, new ctih(z, this)));
        setContentView(composeView);
    }
}
