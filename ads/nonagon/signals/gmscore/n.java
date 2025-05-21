package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class n implements com.google.android.gms.ads.nonagon.signals.c {
    final String a;
    final int b;

    public n(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i;
        String str = this.a;
        if (TextUtils.isEmpty(str) || (i = this.b) == -1) {
            return;
        }
        try {
            JSONObject b = com.google.android.gms.ads.internal.util.ab.b((JSONObject) obj, "pii");
            b.put("pvid", str);
            b.put("pvid_s", i);
        } catch (JSONException unused) {
        }
    }
}
