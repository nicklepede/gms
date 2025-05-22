package com.google.android.gms.ads.cache.io;

import defpackage.buy;
import java.io.File;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g {
    public static final g a = new g();
    public final Object b = new Object();
    public final buy c = new buy();

    public final e a(File file) {
        f fVar;
        File canonicalFile = file.getCanonicalFile();
        synchronized (this.b) {
            buy buyVar = this.c;
            fVar = (f) buyVar.get(canonicalFile);
            if (fVar == null) {
                fVar = new f(this, canonicalFile);
                buyVar.put(canonicalFile, fVar);
            } else {
                synchronized (fVar.h.b) {
                    fVar.g++;
                }
            }
        }
        return fVar;
    }
}
