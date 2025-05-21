package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.text.TextUtils;
import defpackage.dmoj;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class d implements com.google.android.gms.ads.nonagon.signals.c {
    private final com.google.android.gms.ads.identifier.c a;
    private final String b;
    private final dmoj c;

    public d(com.google.android.gms.ads.identifier.c cVar, String str, dmoj dmojVar) {
        this.a = cVar;
        this.b = str;
        this.c = dmojVar;
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
                    dmoj dmojVar = this.c;
                    String str2 = dmojVar.a;
                    if (str2 != null) {
                        long j = dmojVar.b;
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
