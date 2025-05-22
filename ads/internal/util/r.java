package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.android.volley.Network;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import defpackage.btco;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class r extends BasicNetwork {
    private final Context a;

    public r(Context context, BaseHttpStack baseHttpStack) {
        super(baseHttpStack);
        this.a = context;
    }

    public static RequestQueue a(Context context, Network network) {
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new File(btco.a.b(context.getCacheDir(), "admob_volley")), 20971520), network);
        requestQueue.start();
        return requestQueue;
    }

    public static boolean b(String str) {
        return Pattern.matches((String) com.google.android.gms.ads.internal.config.p.at.g(), str);
    }

    @Override // com.android.volley.toolbox.BasicNetwork, com.android.volley.Network
    public final NetworkResponse performRequest(Request request) {
        if (request.shouldCache() && request.getMethod() == 0 && b(request.getUrl())) {
            Context context = this.a;
            com.google.android.gms.ads.internal.client.u.b();
            if (com.google.android.gms.ads.internal.util.client.f.m(context)) {
                NetworkResponse performRequest = new com.google.android.gms.ads.internal.httpcache.n(context).performRequest(request);
                if (performRequest != null) {
                    request.getUrl();
                    return performRequest;
                }
                request.getUrl();
            }
        }
        return super.performRequest(request);
    }
}
