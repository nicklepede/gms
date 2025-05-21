package com.google.android.gms.wallet.redirect;

import android.content.Intent;
import android.net.Uri;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import defpackage.efld;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FinishAndroidAppRedirectChimeraActivity extends efld {
    @Override // defpackage.efld
    protected final Intent a(Uri uri) {
        int i = StartAndroidAppRedirectChimeraActivity.a;
        Intent g = StartAndroidAppRedirectActivity.g(this, uri);
        g.setClassName(this, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
        return g;
    }
}
