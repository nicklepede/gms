package com.google.android.gms.ads.internal.video.gmsg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b implements Iterable {
    private final List a = new ArrayList();

    public final void a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.video.c cVar = ((a) it.next()).a;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            c cVar2 = ((a) it2.next()).c;
            throw null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
