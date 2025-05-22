package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PSSParameters extends AlgorithmParametersSpi {
    private PSSParameterSpec spec = PSSParameterSpec.DEFAULT;

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        Throwable th;
        long j;
        long j2;
        long j3;
        long j4;
        long j5 = 0;
        try {
            j = NativeCrypto.asn1_write_init();
        } catch (IOException e) {
            e = e;
            j2 = 0;
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
        try {
            j2 = NativeCrypto.asn1_write_sequence(j);
            try {
                OAEPParameters.writeHashAndMgfHash(j2, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                if (this.spec.getSaltLength() != 20) {
                    try {
                        j5 = NativeCrypto.asn1_write_tag(j2, 2);
                        NativeCrypto.asn1_write_uint64(j5, this.spec.getSaltLength());
                        NativeCrypto.asn1_write_flush(j2);
                        NativeCrypto.asn1_write_free(j5);
                    } catch (Throwable th3) {
                        NativeCrypto.asn1_write_flush(j2);
                        NativeCrypto.asn1_write_free(j5);
                        throw th3;
                    }
                }
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
                NativeCrypto.asn1_write_free(j2);
                NativeCrypto.asn1_write_free(j);
                return asn1_write_finish;
            } catch (IOException e2) {
                j4 = j;
                e = e2;
                j5 = j4;
                try {
                    NativeCrypto.asn1_write_cleanup(j5);
                    throw e;
                } catch (Throwable th4) {
                    j3 = j2;
                    th = th4;
                    j = j5;
                    j5 = j3;
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j);
                    throw th;
                }
            } catch (Throwable th5) {
                j3 = j2;
                th = th5;
                j5 = j3;
                NativeCrypto.asn1_write_free(j5);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
        } catch (IOException e3) {
            j4 = j;
            e = e3;
            j2 = 0;
        } catch (Throwable th6) {
            th = th6;
            NativeCrypto.asn1_write_free(j5);
            NativeCrypto.asn1_write_free(j);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null || cls != PSSParameterSpec.class) {
            throw new InvalidParameterSpecException("Unsupported class: ".concat(String.valueOf(String.valueOf(cls))));
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
            throw new InvalidParameterSpecException("Only PSSParameterSpec is supported");
        }
        this.spec = (PSSParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt PSS AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        Throwable th;
        long j;
        long asn1_read_sequence;
        long asn1_read_tagged;
        int asn1_read_uint64;
        long j2 = 0;
        try {
            j = NativeCrypto.asn1_read_init(bArr);
            try {
                asn1_read_sequence = NativeCrypto.asn1_read_sequence(j);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            j = 0;
        }
        try {
            String readHash = OAEPParameters.readHash(asn1_read_sequence);
            String readMgfHash = OAEPParameters.readMgfHash(asn1_read_sequence);
            if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                try {
                    asn1_read_tagged = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                } catch (Throwable th4) {
                    th = th4;
                }
                try {
                    asn1_read_uint64 = (int) NativeCrypto.asn1_read_uint64(asn1_read_tagged);
                    NativeCrypto.asn1_read_free(asn1_read_tagged);
                } catch (Throwable th5) {
                    th = th5;
                    j2 = asn1_read_tagged;
                    throw th;
                }
            } else {
                asn1_read_uint64 = 20;
            }
            int i = asn1_read_uint64;
            if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 3)) {
                try {
                    j2 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                    int asn1_read_uint642 = (int) NativeCrypto.asn1_read_uint64(j2);
                    NativeCrypto.asn1_read_free(j2);
                    if (asn1_read_uint642 != 1) {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                } finally {
                    NativeCrypto.asn1_read_free(j2);
                }
            }
            if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j)) {
                this.spec = new PSSParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), i, 1);
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j);
                return;
            }
            throw new IOException("Error reading ASN.1 encoding");
        } catch (Throwable th6) {
            th = th6;
            j2 = asn1_read_sequence;
            NativeCrypto.asn1_read_free(j2);
            NativeCrypto.asn1_read_free(j);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: ".concat(str));
        }
        return engineGetEncoded();
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) {
        if (str != null && !str.equals("ASN.1") && !str.equals("X.509")) {
            throw new IOException("Unsupported format: ".concat(str));
        }
        engineInit(bArr);
    }
}
