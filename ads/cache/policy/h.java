package com.google.android.gms.ads.cache.policy;

import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
