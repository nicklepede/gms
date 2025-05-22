package com.google.android.gms.wallet.bender3;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ekvl;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Bender3FinishRedirectChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_FINISH_REDIRECT_INTENT")) {
            Intent intent = (Intent) getIntent().getParcelableExtra("com.google.android.gms.wallet.firstparty.EXTRA_FINISH_REDIRECT_INTENT");
            ekvl.y(intent);
            startActivity(Bender3RedirectChimeraActivity.a(this, intent));
        } else {
            startActivity(Bender3RedirectChimeraActivity.a(this, getIntent()));
        }
        finish();
    }
}
