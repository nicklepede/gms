package com.google.android.gms.ads.nonagon.load.service;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class w implements com.google.android.gms.ads.nonagon.util.concurrent.f {
    private static final Pattern a = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String b;
    private final com.google.android.gms.ads.nonagon.util.logging.cui.b c;
    private final com.google.android.gms.ads.nonagon.util.logging.cui.k d;

    public w(String str, com.google.android.gms.ads.nonagon.util.logging.cui.k kVar, com.google.android.gms.ads.nonagon.util.logging.cui.b bVar) {
        this.b = str;
        this.d = kVar;
        this.c = bVar;
    }

    @Override // com.google.android.gms.ads.nonagon.util.concurrent.f
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        com.google.android.gms.ads.nonagon.load.a aVar;
        JSONObject optJSONObject;
        String str;
        v vVar = (v) obj;
        JSONObject jSONObject = vVar.a;
        int optInt = jSONObject.optInt("http_timeout_millis", 60000);
        com.google.android.gms.ads.internal.request.service.a aVar2 = vVar.b;
        int i = aVar2.g;
        String str2 = "";
        if (i != -2) {
            if (i == 1) {
                List list = aVar2.a;
                if (list != null) {
                    str2 = TextUtils.join(", ", list);
                    int i2 = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.f(str2);
                }
                aVar = new com.google.android.gms.ads.nonagon.load.a(2, "Error building request URL: ".concat(String.valueOf(str2)));
            } else {
                aVar = new com.google.android.gms.ads.nonagon.load.a(1);
            }
            com.google.android.gms.ads.nonagon.util.logging.cui.k kVar = this.d;
            com.google.android.gms.ads.nonagon.util.logging.cui.b bVar = this.c;
            bVar.j(aVar);
            bVar.i(false);
            kVar.b(bVar);
            throw aVar;
        }
        HashMap hashMap = new HashMap();
        if (aVar2.e) {
            String str3 = this.b;
            if (!TextUtils.isEmpty(str3)) {
                if (((Boolean) com.google.android.gms.ads.internal.config.p.H.g()).booleanValue()) {
                    if (TextUtils.isEmpty(str3)) {
                        str = "";
                    } else {
                        Matcher matcher = a.matcher(str3);
                        str = "";
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("Cookie", str);
                    }
                } else {
                    hashMap.put("Cookie", str3);
                }
            }
        }
        if (aVar2.d && jSONObject != null && (optJSONObject = jSONObject.optJSONObject("pii")) != null) {
            if (!TextUtils.isEmpty(optJSONObject.optString("doritos", ""))) {
                hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", ""));
            }
            if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", ""))) {
                hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", ""));
            }
        }
        if (aVar2 != null) {
            String str4 = aVar2.c;
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
        }
        com.google.android.gms.ads.nonagon.util.logging.cui.k kVar2 = this.d;
        com.google.android.gms.ads.nonagon.util.logging.cui.b bVar2 = this.c;
        bVar2.i(true);
        kVar2.b(bVar2);
        return new r(aVar2.f, optInt, hashMap, str2.getBytes(StandardCharsets.UTF_8), "");
    }
}
