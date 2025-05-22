package com.google.android.gms.org.conscrypt;

import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
final class BufferUtils {
    private BufferUtils() {
    }

    static void checkNotNull(ByteBuffer[] byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null buffer in array");
            }
        }
    }

    static void consume(ByteBuffer[] byteBufferArr, int i) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            int min = Math.min(byteBuffer.remaining(), i);
            if (min > 0) {
                byteBuffer.position(byteBuffer.position() + min);
                i -= min;
                if (i == 0) {
                    break;
                }
            }
        }
        if (i > 0) {
            throw new IllegalArgumentException("toConsume > data size");
        }
    }

    static ByteBuffer copyNoConsume(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer, int i) {
        Preconditions.checkArgument(byteBuffer.remaining() >= i, "Destination buffer too small");
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            int remaining = byteBuffer2.remaining();
            if (remaining > 0) {
                int position = byteBuffer2.position();
                if (remaining <= i) {
                    byteBuffer.put(byteBuffer2);
                    i -= remaining;
                } else {
                    int limit = byteBuffer2.limit();
                    byteBuffer2.limit(byteBuffer2.position() + i);
                    byteBuffer.put(byteBuffer2);
                    byteBuffer2.limit(limit);
                    i = 0;
                }
                byteBuffer2.position(position);
                if (i == 0) {
                    break;
                }
            }
        }
        byteBuffer.flip();
        return byteBuffer;
    }

    static ByteBuffer getBufferLargerThan(ByteBuffer[] byteBufferArr, int i) {
        int length = byteBufferArr.length;
        int i2 = 0;
        while (i2 < length) {
            ByteBuffer byteBuffer = byteBufferArr[i2];
            int remaining = byteBuffer.remaining();
            if (remaining > 0) {
                if (remaining < i) {
                    do {
                        i2++;
                        if (i2 < length) {
                        }
                    } while (byteBufferArr[i2].remaining() <= 0);
                    return null;
                }
                return byteBuffer;
            }
            i2++;
        }
        return null;
    }

    static long remaining(ByteBuffer[] byteBufferArr) {
        long j = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            j += byteBuffer.remaining();
        }
        return j;
    }
}
