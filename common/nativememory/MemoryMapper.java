package com.google.android.gms.common.nativememory;

import android.content.Context;
import defpackage.asot;
import defpackage.asow;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class MemoryMapper {
    private static final asot a = asot.a("MemoryMapper");
    private static boolean b = false;

    private MemoryMapper() {
    }

    public static boolean a(Context context) {
        synchronized (MemoryMapper.class) {
            if (b) {
                return true;
            }
            boolean g = asow.g(context, "gmscore");
            b = g;
            if (!g) {
                ((ejhf) ((ejhf) a.j()).ah(3204)).x("Failed to load native library");
            }
            return b;
        }
    }

    public static native long nativeMapAnonymous(int i);

    public static native long nativeMapFile(String str, int i);

    public static native int nativeReadMemory(long j, int i);
}
