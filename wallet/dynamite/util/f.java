package com.google.android.gms.wallet.dynamite.util;

import android.content.Context;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class f {
    public final RequestQueue a;
    public final com.google.android.gms.wallet.dynamite.logging.a b;
    public ImageLoader c;

    public f(Context context, com.google.android.gms.wallet.dynamite.logging.a aVar) {
        this.a = Volley.newRequestQueue(context);
        this.b = aVar;
    }
}
