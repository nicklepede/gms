package com.google.android.gms.wallet.bender3;

import android.content.Intent;
import android.os.Bundle;
import defpackage.eiig;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class Bender3FinishRedirectChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra("com.google.android.gms.wallet.firstparty.EXTRA_FINISH_REDIRECT_INTENT")) {
            Intent intent = (Intent) getIntent().getParcelableExtra("com.google.android.gms.wallet.firstparty.EXTRA_FINISH_REDIRECT_INTENT");
            eiig.x(intent);
            startActivity(Bender3RedirectChimeraActivity.a(this, intent));
        } else {
            startActivity(Bender3RedirectChimeraActivity.a(this, getIntent()));
        }
        finish();
    }
}
