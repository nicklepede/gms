package com.google.android.gms.ads.internal.js.function;

import android.content.Context;
import com.google.android.gms.ads.internal.js.ah;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.u;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class k {
    static final u a = new i();
    static final u b = new j();
    private final ah c;

    public k(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.nonagon.util.logging.cui.n nVar) {
        this.c = new ah(context, versionInfoParcel, str, a, b, nVar);
    }

    public final o a(String str, d dVar, c cVar) {
        return new o(this.c, str, dVar, cVar);
    }
}
