package com.google.android.gms.ads.nonagon.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.m;
import defpackage.ekvk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class f extends i {
    private final com.google.android.gms.ads.nonagon.util.logging.csi.a g;

    public f(Executor executor, m mVar, com.google.android.gms.ads.nonagon.util.logging.csi.a aVar, com.google.android.gms.ads.nonagon.util.logging.csi.c cVar, Context context) {
        super(executor, mVar, cVar, context);
        com.google.android.gms.ads.internal.util.g gVar;
        com.google.android.gms.ads.internal.state.a aVar2;
        this.g = aVar;
        Map map = this.a;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.c.e();
        map.put("device", com.google.android.gms.ads.internal.util.m.o());
        map.put("app", aVar.b);
        com.google.android.gms.ads.internal.c.e();
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.m.r(aVar.a) ? "0" : "1");
        List b = p.b();
        if (((Boolean) p.aS.g()).booleanValue()) {
            com.google.android.gms.ads.internal.state.e d = com.google.android.gms.ads.internal.c.d();
            synchronized (d.a) {
                gVar = d.b;
            }
            gVar.a();
            synchronized (gVar.a) {
                if (((Boolean) p.bN.g()).booleanValue() && gVar.n.a()) {
                    Iterator it = gVar.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                aVar2 = gVar.n;
            }
            b.addAll(aVar2.c);
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", aVar.c);
        if (((Boolean) p.bI.g()).booleanValue()) {
            com.google.android.gms.ads.internal.c.e();
            map.put("is_bstar", "0");
        }
        if (((Boolean) p.br.g()).booleanValue() && ((Boolean) p.V.g()).booleanValue()) {
            com.google.android.gms.ads.internal.c.d();
            map.put("plugin", ekvk.b(null));
        }
    }
}
