package com.google.android.gms.ads.cache.policy;

import com.google.android.gms.ads.cache.o;
import com.google.android.gms.ads.cache.p;
import com.google.android.gms.ads.cache.q;
import com.google.android.gms.ads.cache.r;
import com.google.android.gms.ads.cache.s;
import defpackage.fecj;
import defpackage.fecp;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class g implements com.google.android.gms.ads.internal.js.function.e {
    private final String a;

    public g(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.ads.internal.js.function.d
    public final /* bridge */ /* synthetic */ JSONObject b(Object obj) {
        s sVar = (s) obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filename", sVar.g);
        JSONObject jSONObject2 = new JSONObject();
        com.google.android.gms.ads.cache.m mVar = sVar.d;
        if (mVar == null) {
            mVar = com.google.android.gms.ads.cache.m.a;
        }
        jSONObject2.put("namespace", mVar.c);
        com.google.android.gms.ads.cache.m mVar2 = sVar.d;
        if (mVar2 == null) {
            mVar2 = com.google.android.gms.ads.cache.m.a;
        }
        jSONObject2.put("id", mVar2.d);
        com.google.android.gms.ads.cache.m mVar3 = sVar.d;
        if (mVar3 == null) {
            mVar3 = com.google.android.gms.ads.cache.m.a;
        }
        jSONObject2.put("itag", mVar3.e);
        jSONObject.put("key", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        r rVar = sVar.e;
        if (rVar == null) {
            rVar = r.a;
        }
        jSONObject3.put("url", rVar.c);
        r rVar2 = sVar.e;
        if (rVar2 == null) {
            rVar2 = r.a;
        }
        jSONObject3.put("expiration_time", rVar2.d);
        jSONObject.put("source", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        q qVar = sVar.f;
        if (qVar == null) {
            qVar = q.a;
        }
        jSONObject4.put("last_access_time", qVar.d);
        q qVar2 = sVar.f;
        if (qVar2 == null) {
            qVar2 = q.a;
        }
        jSONObject4.put("creation_time", qVar2.e);
        q qVar3 = sVar.f;
        if (qVar3 == null) {
            qVar3 = q.a;
        }
        jSONObject4.put("bytes_on_disk", qVar3.f);
        q qVar4 = sVar.f;
        if (qVar4 == null) {
            qVar4 = q.a;
        }
        jSONObject4.put("download_attempts", qVar4.h);
        q qVar5 = sVar.f;
        if (qVar5 == null) {
            qVar5 = q.a;
        }
        jSONObject4.put("download_complete", qVar5.g);
        q qVar6 = sVar.f;
        if (qVar6 == null) {
            qVar6 = q.a;
        }
        int a = o.a(qVar6.j);
        if (a == 0) {
            a = 1;
        }
        jSONObject4.put("additional_video_csi_feature_status", a - 1);
        q qVar7 = sVar.f;
        if (qVar7 == null) {
            qVar7 = q.a;
        }
        jSONObject4.put("content_length", qVar7.i);
        JSONObject jSONObject5 = new JSONObject();
        q qVar8 = sVar.f;
        if (qVar8 == null) {
            qVar8 = q.a;
        }
        for (p pVar : qVar8.c) {
            jSONObject5.put(pVar.c, pVar.d);
        }
        jSONObject4.put("tags", jSONObject5);
        jSONObject.put("meta_data", jSONObject4);
        return jSONObject;
    }

    @Override // com.google.android.gms.ads.internal.js.function.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final s a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("key");
        JSONObject jSONObject3 = jSONObject.getJSONObject("meta_data");
        JSONObject jSONObject4 = jSONObject.getJSONObject("source");
        JSONObject optJSONObject = jSONObject3.optJSONObject("tags");
        fecj v = q.a.v();
        long optLong = jSONObject3.optLong("last_access_time", 0L);
        if (!v.b.L()) {
            v.U();
        }
        q qVar = (q) v.b;
        qVar.b |= 1;
        qVar.d = optLong;
        long optLong2 = jSONObject3.optLong("creation_time", 0L);
        if (!v.b.L()) {
            v.U();
        }
        q qVar2 = (q) v.b;
        qVar2.b |= 2;
        qVar2.e = optLong2;
        long optLong3 = jSONObject3.optLong("bytes_on_disk", 0L);
        if (!v.b.L()) {
            v.U();
        }
        q qVar3 = (q) v.b;
        qVar3.b |= 4;
        qVar3.f = optLong3;
        int optInt = jSONObject3.optInt("download_attempts", 0);
        if (!v.b.L()) {
            v.U();
        }
        q qVar4 = (q) v.b;
        qVar4.b |= 16;
        qVar4.h = optInt;
        boolean optBoolean = jSONObject3.optBoolean("download_complete", false);
        if (!v.b.L()) {
            v.U();
        }
        q qVar5 = (q) v.b;
        qVar5.b |= 8;
        qVar5.g = optBoolean;
        int a = o.a(jSONObject3.optInt("additional_video_csi_feature_status", 0));
        if (!v.b.L()) {
            v.U();
        }
        q qVar6 = (q) v.b;
        int i = a - 1;
        if (a == 0) {
            throw null;
        }
        qVar6.j = i;
        qVar6.b |= 64;
        long optLong4 = jSONObject3.optLong("content_length", -1L);
        if (!v.b.L()) {
            v.U();
        }
        q qVar7 = (q) v.b;
        qVar7.b |= 32;
        qVar7.i = optLong4;
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next, null);
                if (optString != null) {
                    fecj v2 = p.a.v();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fecp fecpVar = v2.b;
                    p pVar = (p) fecpVar;
                    next.getClass();
                    pVar.b |= 1;
                    pVar.c = next;
                    if (!fecpVar.L()) {
                        v2.U();
                    }
                    p pVar2 = (p) v2.b;
                    pVar2.b |= 2;
                    pVar2.d = optString;
                    v.bP(v2);
                }
            }
        }
        fecj v3 = s.a.v();
        String str = this.a;
        if (!v3.b.L()) {
            v3.U();
        }
        s sVar = (s) v3.b;
        str.getClass();
        sVar.b |= 1;
        sVar.c = str;
        String string = jSONObject.getString("filename");
        if (!v3.b.L()) {
            v3.U();
        }
        s sVar2 = (s) v3.b;
        string.getClass();
        sVar2.b |= 16;
        sVar2.g = string;
        fecj v4 = com.google.android.gms.ads.cache.m.a.v();
        String string2 = jSONObject2.getString("id");
        if (!v4.b.L()) {
            v4.U();
        }
        com.google.android.gms.ads.cache.m mVar = (com.google.android.gms.ads.cache.m) v4.b;
        string2.getClass();
        mVar.b |= 2;
        mVar.d = string2;
        String string3 = jSONObject2.getString("namespace");
        if (!v4.b.L()) {
            v4.U();
        }
        com.google.android.gms.ads.cache.m mVar2 = (com.google.android.gms.ads.cache.m) v4.b;
        string3.getClass();
        mVar2.b |= 1;
        mVar2.c = string3;
        String string4 = jSONObject2.getString("itag");
        if (!v4.b.L()) {
            v4.U();
        }
        com.google.android.gms.ads.cache.m mVar3 = (com.google.android.gms.ads.cache.m) v4.b;
        string4.getClass();
        mVar3.b |= 4;
        mVar3.e = string4;
        if (!v3.b.L()) {
            v3.U();
        }
        s sVar3 = (s) v3.b;
        com.google.android.gms.ads.cache.m mVar4 = (com.google.android.gms.ads.cache.m) v4.Q();
        mVar4.getClass();
        sVar3.d = mVar4;
        sVar3.b |= 2;
        fecj v5 = r.a.v();
        String optString2 = jSONObject4.optString("url");
        if (!v5.b.L()) {
            v5.U();
        }
        r rVar = (r) v5.b;
        optString2.getClass();
        rVar.b |= 1;
        rVar.c = optString2;
        long optLong5 = jSONObject4.optLong("expiration_time", 0L);
        if (!v5.b.L()) {
            v5.U();
        }
        r rVar2 = (r) v5.b;
        rVar2.b |= 2;
        rVar2.d = optLong5;
        if (!v3.b.L()) {
            v3.U();
        }
        s sVar4 = (s) v3.b;
        r rVar3 = (r) v5.Q();
        rVar3.getClass();
        sVar4.e = rVar3;
        sVar4.b |= 4;
        if (!v3.b.L()) {
            v3.U();
        }
        s sVar5 = (s) v3.b;
        q qVar8 = (q) v.Q();
        qVar8.getClass();
        sVar5.f = qVar8;
        sVar5.b |= 8;
        return (s) v3.Q();
    }
}
