package com.google.android.gms.ads.cache.policy;

import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class j implements com.google.android.gms.ads.internal.js.function.d {
    @Override // com.google.android.gms.ads.internal.js.function.d
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) {
        k kVar = (k) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cache", b.a.b(kVar.c));
        jSONObject.put("environment", i.a.b(kVar.b));
        return jSONObject;
    }
}
