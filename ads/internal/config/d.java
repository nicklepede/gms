package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class d extends g {
    public d(String str, Long l, Long l2) {
        super(1, str, l, l2);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.b, ((Long) h()).longValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(String.valueOf(str))) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(String.valueOf(str)))) : (Long) h();
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.b, ((Long) h()).longValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.b, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void e(SharedPreferences.Editor editor, String str) {
        editor.putLong(this.b, Long.parseLong(str));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.b, Long.parseLong(str, 10));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
    }
}
