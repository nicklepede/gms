package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import com.google.android.gms.ads.internal.js.function.k;
import com.google.android.gms.ads.internal.js.function.o;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.util.logging.cui.n;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class h {
    public final o a;

    public h(Context context, n nVar) {
        k a = com.google.android.gms.ads.internal.c.b().a(context, new VersionInfoParcel(251864004, 251864004), nVar);
        com.google.android.gms.ads.internal.js.function.e eVar = com.google.android.gms.ads.internal.js.function.h.b;
        a.a("google.afma.request.getAdDictionary", eVar, eVar);
        this.a = com.google.android.gms.ads.internal.c.b().a(context, new VersionInfoParcel(251864004, 251864004), nVar).a("google.afma.sdkConstants.getSdkConstants", eVar, eVar);
    }
}
