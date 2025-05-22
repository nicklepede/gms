package com.google.android.gms.common.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.WebView;
import com.google.android.chimera.android.Activity;
import defpackage.asze;
import defpackage.aszf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AllowlistWebViewChimeraActivity extends Activity {
    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        asze aszeVar = new asze();
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            str = data == null ? "" : data.toString();
        } else {
            str = null;
        }
        if (str != null && !aszeVar.a(str)) {
            setResult(0);
            finish();
            return;
        }
        WebView webView = new WebView(this);
        setContentView(webView);
        Intent intent2 = getIntent();
        Uri data2 = intent2 != null ? intent2.getData() : null;
        if (data2 != null) {
            webView.loadUrl(data2.toString());
        }
        webView.setWebViewClient(new aszf());
        setResult(-1);
    }
}
