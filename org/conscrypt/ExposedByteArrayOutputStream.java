package com.google.android.gms.org.conscrypt;

import java.io.ByteArrayOutputStream;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {
    public ExposedByteArrayOutputStream() {
    }

    public byte[] array() {
        return this.buf;
    }

    public ExposedByteArrayOutputStream(int i) {
        super(i);
    }
}
