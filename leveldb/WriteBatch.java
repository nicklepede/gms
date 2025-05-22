package com.google.android.gms.leveldb;

import defpackage.bsuj;
import defpackage.bsun;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class WriteBatch extends bsuj {
    private WriteBatch() {
        super(nativeCreate());
    }

    public static WriteBatch create() {
        return LevelDb.a ? new bsun() : new WriteBatch();
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

    @Override // defpackage.bsuj, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // defpackage.bsuj
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
