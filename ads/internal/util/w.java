package com.google.android.gms.ads.internal.util;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class w extends StringRequest {
    final /* synthetic */ byte[] b;
    final /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i, String str, Response.Listener listener, Response.ErrorListener errorListener, byte[] bArr, Map map) {
        super(i, str, listener, errorListener);
        this.b = bArr;
        this.c = map;
    }

    @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        deliverResponse((String) obj);
    }

    @Override // com.android.volley.Request
    public final byte[] getBody() {
        byte[] bArr = this.b;
        return bArr == null ? super.getBody() : bArr;
    }

    @Override // com.android.volley.Request
    public final Map getHeaders() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.StringRequest
    public final void deliverResponse(String str) {
        com.google.android.gms.ads.internal.util.client.g.a();
        super.deliverResponse(str);
    }
}
