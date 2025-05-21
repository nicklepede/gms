package com.google.android.gms.leveldb;

import defpackage.bqmu;
import defpackage.bqmz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LevelDbTable extends bqmu {
    static {
        bqmz.a();
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

    @Override // defpackage.bqmu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // defpackage.bqmu
    public void closeNativeObject() {
        nativeClose(this.c);
    }

    public byte[] get(byte[] bArr) {
        assertOpen();
        return nativeGet(this.c, bArr);
    }
}
