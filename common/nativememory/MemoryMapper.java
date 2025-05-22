package com.google.android.gms.common.nativememory;

import android.content.Context;
import defpackage.ausn;
import defpackage.ausq;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class MemoryMapper {
    private static final ausn a = ausn.a("MemoryMapper");
    private static boolean b = false;

    private MemoryMapper() {
    }

    public static boolean a(Context context) {
        synchronized (MemoryMapper.class) {
            if (b) {
                return true;
            }
            boolean g = ausq.g(context, "gmscore");
            b = g;
            if (!g) {
                ((eluo) ((eluo) a.j()).ai(3208)).x("Failed to load native library");
            }
            return b;
        }
    }

    public static native long nativeMapAnonymous(int i);

    public static native long nativeMapFile(String str, int i);

    public static native int nativeReadMemory(long j, int i);
}
