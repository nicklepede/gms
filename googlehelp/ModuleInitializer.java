package com.google.android.gms.googlehelp;

import android.content.Intent;
import com.google.android.gms.chimera.modules.googlehelp.AppContextProvider;
import com.google.android.gms.googlehelp.webview.GoogleHelpRenderingApiWebViewChimeraActivity;
import com.google.android.gms.googlehelp.webview.GoogleHelpSupportWebViewChimeraActivity;
import defpackage.anya;
import defpackage.asng;
import defpackage.bivk;
import defpackage.fote;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ModuleInitializer extends anya {
    static final void e(String str) {
        asng.M(str, 1);
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        AppContextProvider.a();
        if (bivk.a(fote.a.a().a())) {
            e("com.google.android.gms.googlehelp.helpactivities.HelpActivity");
        }
        e("com.google.android.gms.googlehelp.gcm.InvalidateGcmTokenGcmTaskService");
        e(GoogleHelpRenderingApiWebViewChimeraActivity.j);
        e(GoogleHelpSupportWebViewChimeraActivity.j);
        e("com.google.android.gms.googlehelp.GcmBroadcastReceiver");
        e("com.google.android.gms.googlehelp.helpactivities.OpenHelpRtcActivity");
    }
}
