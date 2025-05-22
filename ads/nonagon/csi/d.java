package com.google.android.gms.ads.nonagon.csi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d {
    public final f a;
    public final Executor b;
    public final Map c;

    public d(f fVar, Executor executor) {
        this.a = fVar;
        this.c = new HashMap(fVar.a);
        this.b = executor;
    }
}
