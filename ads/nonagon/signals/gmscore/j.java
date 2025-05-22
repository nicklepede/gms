package com.google.android.gms.ads.nonagon.signals.gmscore;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class j implements com.google.android.gms.ads.nonagon.signals.c {
    private final String a;

    public j(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.a);
        } catch (JSONException unused) {
        }
    }
}
