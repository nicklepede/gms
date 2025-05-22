package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GCMParameters extends AlgorithmParametersSpi {
    private static final int DEFAULT_TLEN = 96;
    private byte[] iv;
    private int tLen;

    public GCMParameters() {
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        long j;
        long j2;
        long j3 = 0;
        try {
            j = NativeCrypto.asn1_write_init();
        } catch (IOException e) {
            e = e;
            j2 = 0;
        } catch (Throwable th) {
            th = th;
            j = 0;
        }
        try {
            j3 = NativeCrypto.asn1_write_sequence(j);
            NativeCrypto.asn1_write_octetstring(j3, this.iv);
            if (this.tLen != 96) {
                NativeCrypto.asn1_write_uint64(j3, r4 / 8);
            }
            byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
            NativeCrypto.asn1_write_free(j3);
            NativeCrypto.asn1_write_free(j);
            return asn1_write_finish;
        } catch (IOException e2) {
            e = e2;
            j2 = j3;
            j3 = j;
            try {
                NativeCrypto.asn1_write_cleanup(j3);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                long j4 = j2;
                j = j3;
                j3 = j4;
                NativeCrypto.asn1_write_free(j3);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            NativeCrypto.asn1_write_free(j3);
            NativeCrypto.asn1_write_free(j);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null || !cls.getName().equals("javax.crypto.spec.GCMParameterSpec")) {
            throw new InvalidParameterSpecException("Unsupported class: ".concat(String.valueOf(String.valueOf(cls))));
        }
        return (AlgorithmParameterSpec) cls.cast(Platform.toGCMParameterSpec(this.tLen, this.iv));
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        GCMParameters fromGCMParameterSpec = Platform.fromGCMParameterSpec(algorithmParameterSpec);
        if (fromGCMParameterSpec == null) {
            throw new InvalidParameterSpecException("Only GCMParameterSpec is supported");
        }
        this.tLen = fromGCMParameterSpec.tLen;
        this.iv = fromGCMParameterSpec.iv;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt GCM AlgorithmParameters";
    }

    public byte[] getIV() {
        return this.iv;
    }

    public int getTLen() {
        return this.tLen;
    }

    public GCMParameters(int i, byte[] bArr) {
        this.tLen = i;
        this.iv = bArr;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        long j;
        try {
            j = NativeCrypto.asn1_read_init(bArr);
        } catch (Throwable th) {
            th = th;
            j = 0;
        }
        try {
            long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j);
            byte[] asn1_read_octetstring = NativeCrypto.asn1_read_octetstring(asn1_read_sequence);
            int asn1_read_uint64 = !NativeCrypto.asn1_read_is_empty(asn1_read_sequence) ? ((int) NativeCrypto.asn1_read_uint64(asn1_read_sequence)) * 8 : 96;
            if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j)) {
                this.iv = asn1_read_octetstring;
                this.tLen = asn1_read_uint64;
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j);
                return;
            }
            throw new IOException("Error reading ASN.1 encoding");
        } catch (Throwable th2) {
            th = th2;
            NativeCrypto.asn1_read_free(0L);
            NativeCrypto.asn1_read_free(j);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: ".concat(str));
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (str != null && !str.equals("ASN.1")) {
            throw new IOException("Unsupported format: ".concat(str));
        }
        engineInit(bArr);
    }
}
