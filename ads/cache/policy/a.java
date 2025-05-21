package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.s;
import defpackage.bry;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class a implements com.google.android.gms.ads.internal.js.function.e {
    public static final b c(JSONObject jSONObject) {
        bry bryVar = new bry();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            g gVar = new g(next);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(next);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(gVar.a(jSONArray.getJSONObject(i)));
            }
            bryVar.put(next, arrayList);
        }
        return new b(bryVar);
    }

    @Override // com.google.android.gms.ads.internal.js.function.c
    public final /* bridge */ /* synthetic */ Object a(JSONObject jSONObject) {
        return c(jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.js.function.d
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) {
        b bVar = (b) obj;
        JSONObject jSONObject = new JSONObject();
        for (String str : bVar.b()) {
            g gVar = new g(str);
            JSONArray jSONArray = new JSONArray();
            Iterator it = bVar.a(str).iterator();
            while (it.hasNext()) {
                jSONArray.put(gVar.b((s) it.next()));
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }
}
