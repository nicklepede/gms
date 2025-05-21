package com.google.android.gms.ads.internal.util;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class z extends Request {
    private final com.google.android.gms.ads.internal.util.future.i b;
    private final Map c;

    public z(String str, Map map, com.google.android.gms.ads.internal.util.future.i iVar) {
        super(0, str, new y(iVar));
        this.c = map;
        this.b = iVar;
        new com.google.android.gms.ads.internal.util.client.g();
        com.google.android.gms.ads.internal.util.client.g.a();
    }

    @Override // com.android.volley.Request
    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        NetworkResponse networkResponse = (NetworkResponse) obj;
        Map map = networkResponse.headers;
        int i = networkResponse.statusCode;
        com.google.android.gms.ads.internal.util.client.g.a();
        byte[] bArr = networkResponse.data;
        com.google.android.gms.ads.internal.util.client.g.a();
        this.b.a(networkResponse);
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        Map map = this.c;
        return map == null ? super.getHeaders() : map;
    }

    @Override // com.android.volley.Request
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        return Response.success(networkResponse, HttpHeaderParser.parseCacheHeaders(networkResponse));
    }
}
