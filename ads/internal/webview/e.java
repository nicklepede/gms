package com.google.android.gms.ads.internal.webview;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class e implements DialogInterface.OnClickListener {
    final /* synthetic */ JsPromptResult a;

    public e(JsPromptResult jsPromptResult) {
        this.a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.cancel();
    }
}
