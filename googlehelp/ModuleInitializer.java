package com.google.android.gms.googlehelp;

import android.content.Intent;
import com.google.android.gms.chimera.modules.googlehelp.AppContextProvider;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;
import com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewChimeraActivity;
import defpackage.apzs;
import defpackage.aura;
import defpackage.bkzz;
import defpackage.frlx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends apzs {
    static final void e(String str) {
        aura.M(str, 1);
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        AppContextProvider.a();
        if (bkzz.a(frlx.a.lK().a())) {
            e("com.google.android.gms.googlehelp.helpactivities.HelpActivity");
        }
        e("com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService");
        e(GoogleHelpRenderingApiWebViewChimeraActivity.j);
        e(GoogleHelpSupportWebViewChimeraActivity.j);
        e("com.google.android.gms.googlehelp.GcmBroadcastReceiver");
        e("com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
    }
}
