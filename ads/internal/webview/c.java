package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class c implements DialogInterface.OnClickListener {
    final /* synthetic */ JsResult a;

    public c(JsResult jsResult) {
        this.a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.confirm();
    }
}
