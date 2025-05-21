package com.google.android.gms.ads.internal.util;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class y implements Response.ErrorListener {
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i a;

    public y(com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = iVar;
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        this.a.c(volleyError);
    }
}
