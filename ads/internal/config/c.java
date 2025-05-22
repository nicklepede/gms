package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class c extends g {
    public c(String str, Integer num, Integer num2) {
        super(1, str, num, num2);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.b, ((Integer) h()).intValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(String.valueOf(str))) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(String.valueOf(str)))) : (Integer) h();
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.b, ((Integer) h()).intValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.b, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void e(SharedPreferences.Editor editor, String str) {
        editor.putInt(this.b, Integer.parseInt(str));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.b, Integer.parseInt(str, 10));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
    }
}
