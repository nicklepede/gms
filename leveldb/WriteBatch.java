package com.google.android.gms.leveldb;

import defpackage.bqmu;
import defpackage.bqmy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WriteBatch extends bqmu {
    private WriteBatch() {
        super(nativeCreate());
    }

    public static WriteBatch create() {
        return LevelDb.a ? new bqmy() : new WriteBatch();
    }

    private static native void nativeBufferedPut(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeClear(long j);

    private static native long nativeCreate();

    private static native void nativeDelete(long j, byte[] bArr);

    private static native void nativeDestroy(long j);

    private static native void nativePut(long j, byte[] bArr, byte[] bArr2);

    public void bufferedPut(byte[] bArr, byte[] bArr2) {
        assertOpen();
        nativeBufferedPut(this.c, bArr, bArr2);
    }

    public void clear() {
        assertOpen();
        nativeClear(this.c);
    }

    @Override // defpackage.bqmu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // defpackage.bqmu
    protected void closeNativeObject() {
        nativeDestroy(this.c);
    }

    public void delete(byte[] bArr) {
        assertOpen();
        nativeDelete(this.c, bArr);
    }

    public void put(byte[] bArr, byte[] bArr2) {
        assertOpen();
        nativePut(this.c, bArr, bArr2);
    }

    public WriteBatch(long j) {
        super(j);
    }
}
