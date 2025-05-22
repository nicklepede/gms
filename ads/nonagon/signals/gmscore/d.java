package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import defpackage.dozx;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements com.google.android.gms.ads.nonagon.signals.c {
    private final com.google.android.gms.ads.identifier.c a;
    private final String b;
    private final dozx c;

    public d(com.google.android.gms.ads.identifier.c cVar, String str, dozx dozxVar) {
        this.a = cVar;
        this.b = str;
        this.c = dozxVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        try {
            JSONObject b = com.google.android.gms.ads.internal.util.ab.b((JSONObject) obj, "pii");
            com.google.android.gms.ads.identifier.c cVar = this.a;
            if (cVar != null) {
                String str = cVar.a;
                if (!TextUtils.isEmpty(str)) {
                    b.put("rdid", str);
                    b.put("is_lat", cVar.b);
                    b.put("idtype", "adid");
                    dozx dozxVar = this.c;
                    String str2 = dozxVar.a;
                    if (str2 != null) {
                        long j = dozxVar.b;
                        if (j > 0) {
                            b.put("paidv1_id_android_3p", str2);
                            b.put("paidv1_creation_time_android_3p", j);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            String str3 = this.b;
            if (str3 != null) {
                b.put("pdid", str3);
                b.put("pdidtype", "ssaid");
            }
        } catch (JSONException unused) {
        }
    }
}
