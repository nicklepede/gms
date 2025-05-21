package com.google.android.gms.org.conscrypt;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: com.google.android.gms.org.conscrypt.AllocatedBuffer.1
            @Override // com.google.android.gms.org.conscrypt.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // com.google.android.gms.org.conscrypt.AllocatedBuffer
            public AllocatedBuffer release() {
                return this;
            }
        };
    }

    public abstract ByteBuffer nioBuffer();

    public abstract AllocatedBuffer release();

    @Deprecated
    public AllocatedBuffer retain() {
        return this;
    }
}
