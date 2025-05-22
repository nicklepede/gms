package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.os.Binder;
import android.text.TextUtils;
import defpackage.eqgl;
import defpackage.eqgo;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ac implements com.google.android.gms.ads.nonagon.signals.e {
    final eqgo a;
    final List b;
    final com.google.android.gms.ads.config.e c;

    public ac(com.google.android.gms.ads.config.e eVar, eqgo eqgoVar, List list) {
        this.c = eVar;
        this.a = eqgoVar;
        this.b = list;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(49);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final eqgl b() {
        return this.a.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.ab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList arrayList;
                com.google.android.gms.ads.internal.client.u.b();
                ac acVar = ac.this;
                boolean m = com.google.android.gms.ads.internal.util.client.f.m(acVar.c.a);
                com.google.android.gms.ads.internal.config.g gVar = com.google.android.gms.ads.internal.config.p.a;
                if (m) {
                    com.google.android.gms.ads.internal.config.h a = com.google.android.gms.ads.internal.client.w.a();
                    arrayList = new ArrayList();
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        Iterator it = a.c.iterator();
                        while (it.hasNext()) {
                            String str = (String) ((com.google.android.gms.ads.internal.config.g) it.next()).g();
                            if (!TextUtils.isEmpty(str)) {
                                arrayList.add(str);
                            }
                        }
                        arrayList.addAll(com.google.android.gms.ads.internal.config.q.a());
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } else {
                    arrayList = null;
                }
                List list = acVar.b;
                ArrayList arrayList2 = new ArrayList(arrayList.size() + list.size());
                arrayList2.addAll(arrayList);
                arrayList2.addAll(list);
                return new ad(DesugarCollections.unmodifiableList(arrayList2));
            }
        });
    }
}
