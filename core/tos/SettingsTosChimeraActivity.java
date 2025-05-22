package com.google.android.gms.core.tos;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.chimera.android.Activity;
import defpackage.auid;
import defpackage.ausn;
import defpackage.vkp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SettingsTosChimeraActivity extends Activity {
    public WebView a;
    private Dialog b;
    private final vkp c = new vkp(this);

    static {
        ausn.b("SettingsTosActivity", auid.CORE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        Dialog dialog = this.b;
        if (dialog != null && dialog.isShowing()) {
            this.b.dismiss();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        String url = this.a.getUrl();
        if (!TextUtils.isEmpty(url)) {
            bundle.putString("WEBVIEW_URL", url);
        }
        super.onSaveInstanceState(bundle);
    }
}
