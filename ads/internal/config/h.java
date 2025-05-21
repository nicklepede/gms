package com.google.android.gms.ads.internal.config;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class h {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();

    public final List a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str = (String) ((g) it.next()).g();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        q.b(arrayList2, new com.google.android.gms.ads.internal.flag.a("gad:dynamite_module:experiment_id", "", 4));
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.a);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.b);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.c);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.d);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.e);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.u);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.f);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.m);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.n);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.o);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.p);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.q);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.r);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.s);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.t);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.g);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.h);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.i);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.j);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.k);
        q.b(arrayList2, com.google.android.gms.ads.internal.flag.l.l);
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
