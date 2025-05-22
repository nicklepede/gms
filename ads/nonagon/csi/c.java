package com.google.android.gms.ads.nonagon.csi;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
