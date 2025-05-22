package com.google.android.gms.leveldb;

import defpackage.bsuj;
import defpackage.bsuo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LevelDbTable extends bsuj {
    static {
        bsuo.a();
    }

    private LevelDbTable(long j) {
        super(j);
    }

    private static native void nativeClose(long j);

    private static native byte[] nativeGet(long j, byte[] bArr);

    private static native long nativeOpen(String str);

    public static LevelDbTable open(String str) {
        if (str != null) {
            return new LevelDbTable(nativeOpen(str));
        }
        throw new NullPointerException("Parameter \"tablePath\" was not set.");
    }

    @Override // defpackage.bsuj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // defpackage.bsuj
    public void closeNativeObject() {
        nativeClose(this.c);
    }

    public byte[] get(byte[] bArr) {
        assertOpen();
        return nativeGet(this.c, bArr);
    }
}
