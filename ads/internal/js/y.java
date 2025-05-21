package com.google.android.gms.ads.internal.js;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class y implements com.google.android.gms.ads.internal.util.promise.c {
    @Override // com.google.android.gms.ads.internal.util.promise.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aj ajVar = (aj) ((ai) obj);
        HashSet hashSet = ajVar.b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            ((com.google.android.gms.ads.internal.gmsg.e) simpleEntry.getValue()).toString();
            ajVar.a.g((String) simpleEntry.getKey(), (com.google.android.gms.ads.internal.gmsg.e) simpleEntry.getValue());
        }
        hashSet.clear();
    }
}
