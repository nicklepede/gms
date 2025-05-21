package com.google.android.gms.ads.internal.config;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class f extends g {
    public f(String str, String str2, String str3) {
        super(1, str, str2, str3);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(this.b, (String) h());
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle) {
        String str = this.b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(String.valueOf(str))) ? bundle.getString("com.google.android.gms.ads.flag.".concat(String.valueOf(str))) : (String) h();
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.b, (String) h());
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final /* bridge */ /* synthetic */ void d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.b, (String) obj);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void e(SharedPreferences.Editor editor, String str) {
        editor.putString(this.b, str);
    }

    @Override // com.google.android.gms.ads.internal.config.g
    public final void f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put(this.b, str);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
        }
    }
}
