package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
