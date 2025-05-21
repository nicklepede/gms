package com.google.android.gms.core.tos;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.chimera.android.Activity;
import defpackage.asej;
import defpackage.asot;
import defpackage.top;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SettingsTosChimeraActivity extends Activity {
    public WebView a;
    private Dialog b;
    private final top c = new top(this);

    static {
        asot.b("SettingsTosActivity", asej.CORE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.core.tos.SettingsTosChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            this.b.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        String url = this.a.getUrl();
        if (!TextUtils.isEmpty(url)) {
            bundle.putString("WEBVIEW_URL", url);
        }
        super.onSaveInstanceState(bundle);
    }
}
