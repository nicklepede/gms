package com.google.android.gms.ads.internal.mediation;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b {
    public b(JSONObject jSONObject) {
        if (com.google.android.gms.ads.internal.util.c.p(2)) {
            jSONObject.toString(2);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                a aVar = new a(jSONArray.getJSONObject(i2));
                "banner".equalsIgnoreCase(aVar.b);
                arrayList.add(aVar);
                if (i < 0) {
                    Iterator it = aVar.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i = i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        DesugarCollections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.c.k();
            c.a(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.c.k();
            c.a(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.c.k();
            c.a(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.c.k();
            c.a(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.c.k();
            c.a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            JSONArray optJSONArray = optJSONObject.optJSONArray("rewards");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                optJSONArray.getJSONObject(0).optString("rb_type");
                optJSONArray.getJSONObject(0).optInt("rb_amount");
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
