package com.google.android.gms.ads.cache.policy;

import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
