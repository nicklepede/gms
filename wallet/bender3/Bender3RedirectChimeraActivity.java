package com.google.android.gms.wallet.bender3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R;
import defpackage.ajt;
import defpackage.eduu;
import defpackage.eduw;
import defpackage.edwf;
import defpackage.efof;
import defpackage.eiig;
import defpackage.fsxm;
import defpackage.fsxs;
import defpackage.fvbo;
import defpackage.fyuu;
import defpackage.fyuv;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class Bender3RedirectChimeraActivity extends qet {
    boolean j = false;
    eduw k;

    public static Intent a(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) Bender3RedirectChimeraActivity.class);
        intent2.setAction("com.google.android.wallet.bender3.intent.action.FINISH_REDIRECT");
        intent2.setClassName(context, "com.google.android.gms.wallet.bender3.Bender3RedirectProxyActivity");
        intent2.putExtra("finishIntent", intent);
        intent2.addFlags(67108864);
        return intent2;
    }

    private final void k(String str, boolean z) {
        eduw eduwVar = new eduw(this, str, z);
        this.k = eduwVar;
        Context context = eduwVar.a;
        eduwVar.b = fyuu.a(context);
        eduwVar.f = new fyuv(eduwVar);
        if (ajt.b(context, eduwVar.b, eduwVar.f)) {
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
            fvbo.f(str, "url");
            if (!URLUtil.isNetworkUrl(str)) {
                throw new eduu(4);
            }
            if (TextUtils.isEmpty(fyuu.a(this))) {
                throw new eduu(10);
            }
            k(str, z);
        } catch (eduu e) {
            setResult(0, new Intent().putExtra("errorCode", e.a));
            finish();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        if (fsxs.g()) {
            setTheme(R.style.Theme_Wallet_Blank);
        }
        super.onCreate(bundle);
        if (fsxs.g()) {
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
        boolean d = fsxm.d();
        if (!fsxm.a.a().c()) {
            l(stringExtra, true, d);
            return;
        }
        eiig.x(stringExtra);
        if (efof.a(this, stringExtra)) {
            return;
        }
        l(stringExtra, false, d);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        eduw eduwVar = this.k;
        if (eduwVar != null) {
            edwf.a();
            if (fsxm.c()) {
                eduwVar.c = false;
            }
            eduwVar.d = null;
            eduwVar.e = null;
            fyuv fyuvVar = eduwVar.f;
            if (fyuvVar != null) {
                eduwVar.a.unbindService(fyuvVar);
                eduwVar.f = null;
            }
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setResult(-1, (Intent) intent.getParcelableExtra("finishIntent"));
        finish();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        this.j = false;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        if (this.j) {
            return;
        }
        setResult(-1);
        finish();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("redirectStarted", this.j);
    }
}
