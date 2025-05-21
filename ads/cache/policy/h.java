package com.google.android.gms.ads.cache.policy;

import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class h implements com.google.android.gms.ads.internal.js.function.d {
    @Override // com.google.android.gms.ads.internal.js.function.d
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) {
        i iVar = (i) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk_version", iVar.b);
        jSONObject.put("disk_total_bytes", iVar.c);
        jSONObject.put("disk_used_bytes", iVar.d);
        jSONObject.put("os_version", iVar.e);
        jSONObject.put("device_model", iVar.f);
        return jSONObject;
    }
}
