package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class a implements DialogInterface.OnCancelListener {
    final /* synthetic */ JsResult a;

    public a(JsResult jsResult) {
        this.a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.cancel();
    }
}
