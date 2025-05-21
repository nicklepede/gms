package com.google.android.gms.ads.internal.state;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.config.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a {
    public String a;
    public long b;
    private JSONObject g;
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final Map f = new HashMap();
    public final List c = new ArrayList();

    public a(String str, long j) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.a = str;
        this.b = j;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.g = new JSONObject(str);
            if (((Boolean) p.bL.g()).booleanValue() && a()) {
                return;
            }
            if (this.g.optInt("status", -1) != 1) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.k("App settings could not be fetched successfully.");
                return;
            }
            this.g.optString("app_id");
            JSONArray optJSONArray2 = this.g.optJSONArray("ad_unit_id_settings");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject = optJSONArray2.getJSONObject(i2);
                    String optString = jSONObject.optString("format");
                    String optString2 = jSONObject.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                        if ("interstitial".equalsIgnoreCase(optString)) {
                            this.e.add(optString2);
                        } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                            this.f.put(optString2, new com.google.android.gms.ads.internal.mediation.b(optJSONObject3));
                        }
                    }
                }
            }
            JSONArray optJSONArray3 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    this.d.add(optJSONArray3.optString(i3));
                }
            }
            if (((Boolean) p.aR.g()).booleanValue() && (optJSONObject2 = this.g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                    this.c.add(optJSONArray.get(i4).toString());
                }
            }
            if (!((Boolean) p.aP.g()).booleanValue() || (optJSONObject = this.g.optJSONObject("common_settings")) == null) {
                return;
            }
            optJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.m("Exception occurred while processing app setting json", e);
            com.google.android.gms.ads.internal.c.d().d(e, "AppSettings.parseAppSettingsJson");
        }
    }

    public final boolean a() {
        if (TextUtils.isEmpty(this.a) || this.g == null) {
            return false;
        }
        long longValue = ((Long) p.bO.g()).longValue();
        if (((Boolean) p.bN.g()).booleanValue() && !TextUtils.isEmpty(this.a)) {
            longValue = this.g.optLong("cache_ttl_sec", ((Long) p.bO.g()).longValue());
        }
        com.google.android.gms.ads.internal.c.j();
        long currentTimeMillis = System.currentTimeMillis();
        if (longValue < 0) {
            return false;
        }
        if (this.b <= currentTimeMillis && TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis - this.b) <= longValue) {
            return false;
        }
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.a = "";
        this.g = null;
        this.c.clear();
        return true;
    }
}
