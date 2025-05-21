package com.google.android.gms.ads.nonagon.signals.gmscore;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class z implements com.google.android.gms.ads.nonagon.signals.c {
    private final String a;
    private final String b;

    public z(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject b = com.google.android.gms.ads.internal.util.ab.b((JSONObject) obj, "pii");
            b.put("doritos", this.a);
            b.put("doritos_v2", this.b);
        } catch (JSONException unused) {
        }
    }
}
