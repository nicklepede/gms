package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
