package com.google.android.gms.ads.internal.js.function;

import com.google.android.gms.ads.internal.js.ab;
import com.google.android.gms.ads.internal.js.ai;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class l implements com.google.android.gms.ads.internal.util.promise.c {
    final /* synthetic */ ab a;
    final /* synthetic */ Object b;
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i c;
    final /* synthetic */ o d;

    public l(o oVar, ab abVar, Object obj, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = abVar;
        this.b = obj;
        this.c = iVar;
        this.d = oVar;
    }

    @Override // com.google.android.gms.ads.internal.util.promise.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        o oVar = this.d;
        ab abVar = this.a;
        ai aiVar = (ai) obj;
        Object obj2 = this.b;
        com.google.android.gms.ads.internal.util.future.i iVar = this.c;
        try {
            com.google.android.gms.ads.internal.c.e();
            String uuid = UUID.randomUUID().toString();
            com.google.android.gms.ads.internal.gmsg.f fVar = com.google.android.gms.ads.internal.gmsg.d.b;
            n nVar = new n(oVar, abVar, iVar);
            synchronized (fVar.a) {
                fVar.b.put(uuid, nVar);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", oVar.b.b(obj2));
            aiVar.e(oVar.c, jSONObject);
        } catch (Exception e) {
            try {
                iVar.c(e);
                int i = com.google.android.gms.ads.internal.util.c.a;
                com.google.android.gms.ads.internal.util.client.h.h("Unable to invokeJavascript", e);
            } finally {
                abVar.a();
            }
        }
    }
}
