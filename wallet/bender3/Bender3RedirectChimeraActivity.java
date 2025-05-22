package com.google.android.gms.wallet.bender3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R;
import defpackage.akc;
import defpackage.eghv;
import defpackage.eghx;
import defpackage.egjg;
import defpackage.eibi;
import defpackage.ekvl;
import defpackage.fvtg;
import defpackage.fvtm;
import defpackage.fxxm;
import defpackage.gbro;
import defpackage.gbrp;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Bender3RedirectChimeraActivity extends rxx {
    boolean j = false;
    eghx k;

    public static Intent a(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) Bender3RedirectChimeraActivity.class);
        intent2.setAction("com.google.android.wallet.bender3.intent.action.FINISH_REDIRECT");
        intent2.setClassName(context, "com.google.android.gms.wallet.bender3.Bender3RedirectProxyActivity");
        intent2.putExtra("finishIntent", intent);
        intent2.addFlags(67108864);
        return intent2;
    }

    private final void k(String str, boolean z) {
        eghx eghxVar = new eghx(this, str, z);
        this.k = eghxVar;
        Context context = eghxVar.a;
        eghxVar.b = gbro.a(context);
        eghxVar.f = new gbrp(eghxVar);
        if (akc.b(context, eghxVar.b, eghxVar.f)) {
            return;
        }
        setResult(0);
        finish();
    }

    private final void l(String str, boolean z, boolean z2) {
        if (!z2) {
            k(str, z);
            return;
        }
        try {
            fxxm.f(str, "url");
            if (!URLUtil.isNetworkUrl(str)) {
                throw new eghv(4);
            }
            if (TextUtils.isEmpty(gbro.a(this))) {
                throw new eghv(10);
            }
            k(str, z);
        } catch (eghv e) {
            setResult(0, new Intent().putExtra("errorCode", e.a));
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        if (fvtm.g()) {
            setTheme(R.style.Theme_Wallet_Blank);
        }
        super.onCreate(bundle);
        if (fvtm.g()) {
            setTitle("");
        }
        if (bundle == null) {
            this.j = true;
        } else {
            boolean z = bundle.getBoolean("redirectStarted");
            this.j = z;
            if (!z) {
                return;
            }
        }
        if (!getIntent().hasExtra("initialUrl")) {
            if (getIntent().hasExtra("launchingIntent")) {
                startActivity((Intent) getIntent().getParcelableExtra("launchingIntent"));
                return;
            }
            return;
        }
        String stringExtra = getIntent().getStringExtra("initialUrl");
        boolean d = fvtg.d();
        if (!fvtg.a.lK().c()) {
            l(stringExtra, true, d);
            return;
        }
        ekvl.y(stringExtra);
        if (eibi.a(this, stringExtra)) {
            return;
        }
        l(stringExtra, false, d);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        eghx eghxVar = this.k;
        if (eghxVar != null) {
            egjg.a();
            if (fvtg.c()) {
                eghxVar.c = false;
            }
            eghxVar.d = null;
            eghxVar.e = null;
            gbrp gbrpVar = eghxVar.f;
            if (gbrpVar != null) {
                eghxVar.a.unbindService(gbrpVar);
                eghxVar.f = null;
            }
        }
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setResult(-1, (Intent) intent.getParcelableExtra("finishIntent"));
        finish();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        this.j = false;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (this.j) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("redirectStarted", this.j);
    }
}
