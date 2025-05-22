package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.js.function.n;
import com.google.android.gms.ads.internal.util.client.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f implements e {
    public final Object a = new Object();
    public final Map b = new HashMap();

    @Override // com.google.android.gms.ads.internal.gmsg.e
    public final void a(Object obj, Map map) {
        String str = (String) map.get("id");
        String str2 = (String) map.get("fail");
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        String concat = TextUtils.isEmpty(str4) ? "" : "\n".concat(String.valueOf(str4));
        synchronized (this.a) {
            n nVar = (n) this.b.remove(str);
            if (nVar == null) {
                String x = defpackage.a.x(str, "Received result for unexpected method invocation: ");
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.k(x);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                nVar.a(str3 + concat);
                return;
            }
            if (str5 == null) {
                nVar.b(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.c.a()) {
                    jSONObject.toString(2);
                }
                nVar.b(jSONObject);
            } catch (JSONException e) {
                nVar.a(e.getMessage());
            }
        }
    }
}
