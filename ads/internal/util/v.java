package com.google.android.gms.ads.internal.util;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class v implements Response.ErrorListener {
    final /* synthetic */ String a;
    final /* synthetic */ x b;

    public v(String str, x xVar) {
        this.a = str;
        this.b = xVar;
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        String str = "Failed to load URL: " + this.a + "\n" + volleyError.toString();
        int i = c.a;
        com.google.android.gms.ads.internal.util.client.h.k(str);
        this.b.onResponse(null);
    }
}
