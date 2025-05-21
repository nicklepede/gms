package com.google.android.gms.ads.nonagon.signals.gmscore;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class r implements com.google.android.gms.ads.nonagon.signals.c {
    private final JSONObject a;

    public r(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.a);
        } catch (JSONException unused) {
        }
    }
}
