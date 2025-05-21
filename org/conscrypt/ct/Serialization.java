package com.google.android.gms.org.conscrypt.ct;

import defpackage.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Serialization {
    private static final int DER_LENGTH_LONG_FORM_FLAG = 128;
    private static final int DER_TAG_MASK = 63;
    private static final int DER_TAG_OCTET_STRING = 4;

    private Serialization() {
    }

    public static byte readByte(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read != -1) {
                return (byte) read;
            }
            throw new SerializationException("Premature end of input, could not read byte.");
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public static byte[] readDEROctetString(InputStream inputStream) {
        int readByte = readByte(inputStream) & 63;
        if (readByte != 4) {
            throw new SerializationException(a.j(readByte, "Wrong DER tag, expected OCTET STRING, got "));
        }
        int readNumber = readNumber(inputStream, 1);
        if ((readNumber & 128) != 0) {
            readNumber = readNumber(inputStream, readNumber & (-129));
        }
        return readFixedBytes(inputStream, readNumber);
    }

    public static byte[] readFixedBytes(InputStream inputStream, int i) {
        try {
            if (i < 0) {
                throw new SerializationException(a.j(i, "Negative length: "));
            }
            byte[] bArr = new byte[i];
            int read = inputStream.read(bArr);
            if (read >= i) {
                return bArr;
            }
            throw new SerializationException(a.t(read, i, "Premature end of input, expected ", " bytes, only read "));
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public static byte[][] readList(InputStream inputStream, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readVariableBytes(inputStream, i));
        while (byteArrayInputStream.available() > 0) {
            try {
                arrayList.add(readVariableBytes(byteArrayInputStream, i2));
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }

    public static long readLong(InputStream inputStream, int i) {
        if (i > 8 || i < 0) {
            throw new IllegalArgumentException(a.j(i, "Invalid width: "));
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (readByte(inputStream) & 255);
        }
        return j;
    }

    public static int readNumber(InputStream inputStream, int i) {
        if (i > 4 || i < 0) {
            throw new SerializationException(a.j(i, "Invalid width: "));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 8) | (readByte(inputStream) & 255);
        }
        return i2;
    }

    public static byte[] readVariableBytes(InputStream inputStream, int i) {
        return readFixedBytes(inputStream, readNumber(inputStream, i));
    }

    public static void writeFixedBytes(OutputStream outputStream, byte[] bArr) {
        try {
            outputStream.write(bArr);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public static void writeNumber(OutputStream outputStream, long j, int i) {
        if (i < 0) {
            throw new SerializationException(a.j(i, "Negative width: "));
        }
        if (i < 8 && j >= (1 << (i * 8))) {
            throw new SerializationException("Number too large, " + j + " does not fit in " + i + " bytes");
        }
        while (i > 0) {
            i--;
            if (i * 8 < 64) {
                try {
                    outputStream.write((byte) ((j >> ((int) r0)) & 255));
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            } else {
                outputStream.write(0);
            }
        }
    }

    public static void writeVariableBytes(OutputStream outputStream, byte[] bArr, int i) {
        writeNumber(outputStream, bArr.length, i);
        writeFixedBytes(outputStream, bArr);
    }

    public static byte[] readDEROctetString(byte[] bArr) {
        return readDEROctetString(new ByteArrayInputStream(bArr));
    }

    public static byte[][] readList(byte[] bArr, int i, int i2) {
        return readList(new ByteArrayInputStream(bArr), i, i2);
    }
}
