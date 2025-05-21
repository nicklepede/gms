package com.google.android.gms.ads.nonagon.csi;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c {
    public final Map a = new ConcurrentHashMap();
    public final /* synthetic */ d b;

    public c(d dVar) {
        this.b = dVar;
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.a.put(str, str2);
    }
}
