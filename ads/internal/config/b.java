package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class b extends g {
    public b(int i, String str, Boolean bool, Boolean bool2) {
        super(i, str, bool, bool2);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.b, ((Boolean) h()).booleanValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(String.valueOf(str))) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(String.valueOf(str)))) : (Boolean) h();
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.b, ((Boolean) h()).booleanValue()));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.b, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void e(SharedPreferences.Editor editor, String str) {
        editor.putBoolean(this.b, Boolean.parseBoolean(str));
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.b, Boolean.parseBoolean(str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
    }
}
