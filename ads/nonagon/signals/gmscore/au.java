package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class au implements com.google.android.gms.ads.nonagon.signals.c {
    private final String a;

    public au(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            String str = this.a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.google.android.gms.ads.internal.util.ab.b((JSONObject) obj, "pii").put("adsid", str);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.m("Failed putting trustless token.", e);
        }
    }
}
