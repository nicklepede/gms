package com.google.android.gms.org.conscrypt.ct;

import defpackage.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SignedCertificateTimestamp {
    private final byte[] extensions;
    private final byte[] logId;
    private final Origin origin;
    private final DigitallySigned signature;
    private final long timestamp;
    private final Version version;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public enum Origin {
        EMBEDDED,
        TLS_EXTENSION,
        OCSP_RESPONSE
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public enum SignatureType {
        CERTIFICATE_TIMESTAMP(0),
        TREE_HASH(1);

        private final int value;

        SignatureType(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public enum Version {
        V1(0);

        private final int value;

        Version(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    public SignedCertificateTimestamp(Version version, byte[] bArr, long j, byte[] bArr2, DigitallySigned digitallySigned, Origin origin) {
        this.version = version;
        this.logId = bArr;
        this.timestamp = j;
        this.extensions = bArr2;
        this.signature = digitallySigned;
        this.origin = origin;
    }

    public static SignedCertificateTimestamp decode(InputStream inputStream, Origin origin) {
        int readNumber = Serialization.readNumber(inputStream, 1);
        if (readNumber == Version.V1.value()) {
            return new SignedCertificateTimestamp(Version.V1, Serialization.readFixedBytes(inputStream, 32), Serialization.readLong(inputStream, 8), Serialization.readVariableBytes(inputStream, 2), DigitallySigned.decode(inputStream), origin);
        }
        throw new SerializationException(a.j(readNumber, "Unsupported SCT version "));
    }

    public byte[] encodeTBS(CertificateEntry certificateEntry) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeTBS(byteArrayOutputStream, certificateEntry);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] getExtensions() {
        return this.extensions;
    }

    public byte[] getLogID() {
        return this.logId;
    }

    public Origin getOrigin() {
        return this.origin;
    }

    public DigitallySigned getSignature() {
        return this.signature;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public Version getVersion() {
        return this.version;
    }

    public void encodeTBS(OutputStream outputStream, CertificateEntry certificateEntry) {
        Serialization.writeNumber(outputStream, this.version.value(), 1);
        Serialization.writeNumber(outputStream, SignatureType.CERTIFICATE_TIMESTAMP.value(), 1);
        Serialization.writeNumber(outputStream, this.timestamp, 8);
        certificateEntry.encode(outputStream);
        Serialization.writeVariableBytes(outputStream, this.extensions, 2);
    }

    public static SignedCertificateTimestamp decode(byte[] bArr, Origin origin) {
        return decode(new ByteArrayInputStream(bArr), origin);
    }
}
