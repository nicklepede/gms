package com.google.android.gms.ads.internal.csi;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes2.dex */
public final class k {
    public final List a = new LinkedList();
    public final Map b;
    public final Object c;

    public k(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.b = linkedHashMap;
        this.c = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str);
    }

    public static final h a() {
        com.google.android.gms.ads.internal.c.j();
        return new h(SystemClock.elapsedRealtime());
    }
}
