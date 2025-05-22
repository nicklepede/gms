package com.google.android.gms.ads.nonagon.load.service;

import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class o implements com.google.android.gms.ads.internal.js.function.d {
    @Override // com.google.android.gms.ads.internal.js.function.d
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) {
        p pVar = (p) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bq.g()).booleanValue()) {
            com.google.android.gms.ads.internal.request.service.a aVar = pVar.d;
            jSONObject2.put("ad_request_url", aVar.f);
            jSONObject2.put("ad_request_post_body", aVar.c);
        }
        com.google.android.gms.ads.internal.request.service.a aVar2 = pVar.d;
        jSONObject2.put("base_url", aVar2.b);
        jSONObject2.put("signals", pVar.c);
        s sVar = pVar.b;
        jSONObject3.put("body", sVar.c);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.u.b().f(sVar.b));
        jSONObject3.put("response_code", sVar.a);
        jSONObject3.put("latency", sVar.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", aVar2.h);
        return jSONObject;
    }
}
