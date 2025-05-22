package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements Callable {
    final /* synthetic */ Context a;
    final /* synthetic */ f b;

    public d(f fVar, Context context) {
        this.a = context;
        this.b = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        c a;
        WeakHashMap weakHashMap = this.b.a;
        Context context = this.a;
        e eVar = (e) weakHashMap.get(context);
        if (eVar != null) {
            long longValue = eVar.a + ((Long) com.google.android.gms.ads.internal.flag.d.a.d()).longValue();
            com.google.android.gms.ads.internal.c.j();
            if (longValue >= System.currentTimeMillis()) {
                a = new b(context, eVar.b).a();
                weakHashMap.put(context, new e(a));
                return a;
            }
        }
        a = new b(context).a();
        weakHashMap.put(context, new e(a));
        return a;
    }
}
