package com.google.android.gms.wallet.dynamite.util;

import android.util.Log;
import defpackage.elhz;
import defpackage.elqn;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class o {
    public static final /* synthetic */ int a = 0;
    private static final String b = "o";
    private static final elhz c = elhz.K("CRYPTOGRAM_3DS", "PAN_ONLY");
    private static final elhz d = new elqn("CARD");

    private o() {
    }

    public static boolean a(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!d.contains(jSONObject.getString("type"))) {
                    Log.e(b, "Invalid payment method type.");
                    return false;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("parameters");
                if (jSONObject2 == null) {
                    Log.e(b, "parameters must be setup for type CARD");
                    return false;
                }
                JSONArray jSONArray2 = jSONObject2.getJSONArray("allowedCardNetworks");
                if (jSONArray2 != null && jSONArray2.length() != 0) {
                    JSONArray jSONArray3 = jSONObject2.getJSONArray("allowedAuthMethods");
                    if (jSONArray3 != null && jSONArray3.length() != 0) {
                        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                            if (c.contains(jSONArray3.getString(i2))) {
                            }
                        }
                    }
                    Log.e(b, "allowedAuthMethods must be setup in parameters for type \"CARD\" and must contain \"CRYPTOGRAM_3DS\" and/or \"PAN_ONLY\"");
                    return false;
                }
                Log.e(b, "allowedCardNetworks must be setup in parameters for type CARD");
                return false;
            }
            return true;
        } catch (JSONException unused) {
            Log.e(b, "allowedPaymentMethods is not in valid JSON format.");
            return false;
        }
    }
}
