package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class e extends g {
    public e(String str, Float f, Float f2) {
        super(1, str, f, f2);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.b, ((Float) h()).floatValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(String.valueOf(str))) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(String.valueOf(str)))) : (Float) h();
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.b, ((Float) h()).floatValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(this.b, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void e(SharedPreferences.Editor editor, String str) {
        editor.putFloat(this.b, Float.parseFloat(str));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.b, Float.parseFloat(str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
    }
}
