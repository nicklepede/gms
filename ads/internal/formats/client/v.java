package com.google.android.gms.ads.internal.formats.client;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class v {
    public final com.google.ads.mediation.c a;
    public final com.google.ads.mediation.c b;
    private m c;

    public v(com.google.ads.mediation.c cVar, com.google.ads.mediation.c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    public final synchronized m a(l lVar) {
        m mVar = this.c;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(lVar);
        this.c = mVar2;
        return mVar2;
    }
}
