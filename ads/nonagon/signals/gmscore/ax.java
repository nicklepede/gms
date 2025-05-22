package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.os.Build;
import defpackage.eqgl;
import defpackage.eqgo;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ax implements com.google.android.gms.ads.nonagon.signals.e {
    private final eqgo a;

    public ax(eqgo eqgoVar) {
        this.a = eqgoVar;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(52);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        return this.a.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.aw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.config.p.i.g();
                if (str != null && !str.isEmpty() && Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.config.p.j.g()).intValue()) {
                    for (String str2 : str.split(",", -1)) {
                        hashMap.put(str2, com.google.android.gms.ads.internal.util.al.a(str2));
                    }
                }
                return new ay(hashMap);
            }
        });
    }
}
