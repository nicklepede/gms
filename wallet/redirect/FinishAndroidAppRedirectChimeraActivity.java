package com.google.android.gms.wallet.redirect;

import android.content.Intent;
import android.net.Uri;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import defpackage.ehyg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FinishAndroidAppRedirectChimeraActivity extends ehyg {
    @Override // defpackage.ehyg
    protected final Intent a(Uri uri) {
        int i = StartAndroidAppRedirectChimeraActivity.a;
        Intent g = StartAndroidAppRedirectActivity.g(this, uri);
        g.setClassName(this, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
        return g;
    }
}
