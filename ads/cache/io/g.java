package com.google.android.gms.ads.cache.io;

import defpackage.bul;
import java.io.File;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g {
    public static final g a = new g();
    public final Object b = new Object();
    public final bul c = new bul();

    public final e a(File file) {
        f fVar;
        File canonicalFile = file.getCanonicalFile();
        synchronized (this.b) {
            bul bulVar = this.c;
            fVar = (f) bulVar.get(canonicalFile);
            if (fVar == null) {
                fVar = new f(this, canonicalFile);
                bulVar.put(canonicalFile, fVar);
            } else {
                synchronized (fVar.h.b) {
                    fVar.g++;
                }
            }
        }
        return fVar;
    }
}
