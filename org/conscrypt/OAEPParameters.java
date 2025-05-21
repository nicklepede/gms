package com.google.android.gms.org.conscrypt;

import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OAEPParameters extends AlgorithmParametersSpi {
    private static final String MGF1_OID = "1.2.840.113549.1.1.8";
    private static final Map NAME_TO_OID;
    private static final Map OID_TO_NAME;
    private static final String PSPECIFIED_OID = "1.2.840.113549.1.1.9";
    private OAEPParameterSpec spec = OAEPParameterSpec.DEFAULT;

    static {
        HashMap hashMap = new HashMap();
        OID_TO_NAME = hashMap;
        NAME_TO_OID = new HashMap();
        hashMap.put("1.3.14.3.2.26", "SHA-1");
        hashMap.put("2.16.840.1.101.3.4.2.4", "SHA-224");
        hashMap.put("2.16.840.1.101.3.4.2.1", "SHA-256");
        hashMap.put("2.16.840.1.101.3.4.2.2", "SHA-384");
        hashMap.put("2.16.840.1.101.3.4.2.3", "SHA-512");
        for (Map.Entry entry : hashMap.entrySet()) {
            NAME_TO_OID.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    private static String getHashName(long j) {
        long j2;
        try {
            j2 = NativeCrypto.asn1_read_sequence(j);
        } catch (Throwable th) {
            th = th;
            j2 = 0;
        }
        try {
            String asn1_read_oid = NativeCrypto.asn1_read_oid(j2);
            if (!NativeCrypto.asn1_read_is_empty(j2)) {
                NativeCrypto.asn1_read_null(j2);
            }
            if (NativeCrypto.asn1_read_is_empty(j2)) {
                Map map = OID_TO_NAME;
                if (map.containsKey(asn1_read_oid)) {
                    String str = (String) map.get(asn1_read_oid);
                    NativeCrypto.asn1_read_free(j2);
                    return str;
                }
            }
            throw new IOException("Error reading ASN.1 encoding");
        } catch (Throwable th2) {
            th = th2;
            NativeCrypto.asn1_read_free(j2);
            throw th;
        }
    }

    static String readHash(long j) {
        long j2;
        if (!NativeCrypto.asn1_read_next_tag_is(j, 0)) {
            return "SHA-1";
        }
        try {
            j2 = NativeCrypto.asn1_read_tagged(j);
        } catch (Throwable th) {
            th = th;
            j2 = 0;
        }
        try {
            String hashName = getHashName(j2);
            NativeCrypto.asn1_read_free(j2);
            return hashName;
        } catch (Throwable th2) {
            th = th2;
            NativeCrypto.asn1_read_free(j2);
            throw th;
        }
    }

    static String readMgfHash(long j) {
        long j2;
        if (!NativeCrypto.asn1_read_next_tag_is(j, 1)) {
            return "SHA-1";
        }
        try {
            j2 = NativeCrypto.asn1_read_tagged(j);
        } catch (Throwable th) {
            th = th;
            j2 = 0;
        }
        try {
            long asn1_read_sequence = NativeCrypto.asn1_read_sequence(j2);
            if (!NativeCrypto.asn1_read_oid(asn1_read_sequence).equals(MGF1_OID)) {
                throw new IOException("Error reading ASN.1 encoding");
            }
            String hashName = getHashName(asn1_read_sequence);
            if (!NativeCrypto.asn1_read_is_empty(asn1_read_sequence)) {
                throw new IOException("Error reading ASN.1 encoding");
            }
            NativeCrypto.asn1_read_free(asn1_read_sequence);
            NativeCrypto.asn1_read_free(j2);
            return hashName;
        } catch (Throwable th2) {
            th = th2;
            NativeCrypto.asn1_read_free(0L);
            NativeCrypto.asn1_read_free(j2);
            throw th;
        }
    }

    private static long writeAlgorithmIdentifier(long j, String str) {
        long j2;
        try {
            j2 = NativeCrypto.asn1_write_sequence(j);
            try {
                NativeCrypto.asn1_write_oid(j2, str);
                return j2;
            } catch (IOException e) {
                e = e;
                NativeCrypto.asn1_write_free(j2);
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            j2 = 0;
        }
    }

    static void writeHashAndMgfHash(long j, String str, MGF1ParameterSpec mGF1ParameterSpec) {
        long j2;
        long j3;
        long j4;
        long writeAlgorithmIdentifier;
        long j5 = 0;
        if (!str.equals("SHA-1")) {
            try {
                j4 = NativeCrypto.asn1_write_tag(j, 0);
                try {
                    writeAlgorithmIdentifier = writeAlgorithmIdentifier(j4, (String) NAME_TO_OID.get(str));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                j4 = 0;
            }
            try {
                NativeCrypto.asn1_write_null(writeAlgorithmIdentifier);
                NativeCrypto.asn1_write_flush(j);
                NativeCrypto.asn1_write_free(writeAlgorithmIdentifier);
                NativeCrypto.asn1_write_free(j4);
            } catch (Throwable th3) {
                th = th3;
                j5 = writeAlgorithmIdentifier;
                NativeCrypto.asn1_write_flush(j);
                NativeCrypto.asn1_write_free(j5);
                NativeCrypto.asn1_write_free(j4);
                throw th;
            }
        }
        if (mGF1ParameterSpec.getDigestAlgorithm().equals("SHA-1")) {
            return;
        }
        try {
            j2 = NativeCrypto.asn1_write_tag(j, 1);
            try {
                j3 = writeAlgorithmIdentifier(j2, MGF1_OID);
                try {
                    j5 = writeAlgorithmIdentifier(j3, (String) NAME_TO_OID.get(mGF1ParameterSpec.getDigestAlgorithm()));
                    NativeCrypto.asn1_write_null(j5);
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j3);
                    NativeCrypto.asn1_write_free(j2);
                } catch (Throwable th4) {
                    th = th4;
                    NativeCrypto.asn1_write_flush(j);
                    NativeCrypto.asn1_write_free(j5);
                    NativeCrypto.asn1_write_free(j3);
                    NativeCrypto.asn1_write_free(j2);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                j3 = 0;
            }
        } catch (Throwable th6) {
            th = th6;
            j2 = 0;
            j3 = 0;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        Throwable th;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6 = 0;
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
                writeHashAndMgfHash(j2, this.spec.getDigestAlgorithm(), (MGF1ParameterSpec) this.spec.getMGFParameters());
                PSource.PSpecified pSpecified = (PSource.PSpecified) this.spec.getPSource();
                if (pSpecified.getValue().length != 0) {
                    try {
                        j5 = NativeCrypto.asn1_write_tag(j2, 2);
                    } catch (Throwable th3) {
                        th = th3;
                        j5 = 0;
                    }
                    try {
                        j6 = writeAlgorithmIdentifier(j5, PSPECIFIED_OID);
                        NativeCrypto.asn1_write_octetstring(j6, pSpecified.getValue());
                        NativeCrypto.asn1_write_flush(j2);
                        NativeCrypto.asn1_write_free(j6);
                        NativeCrypto.asn1_write_free(j5);
                    } catch (Throwable th4) {
                        th = th4;
                        NativeCrypto.asn1_write_flush(j2);
                        NativeCrypto.asn1_write_free(j6);
                        NativeCrypto.asn1_write_free(j5);
                        throw th;
                    }
                }
                byte[] asn1_write_finish = NativeCrypto.asn1_write_finish(j);
                NativeCrypto.asn1_write_free(j2);
                NativeCrypto.asn1_write_free(j);
                return asn1_write_finish;
            } catch (IOException e2) {
                j4 = j;
                e = e2;
                j6 = j4;
                try {
                    NativeCrypto.asn1_write_cleanup(j6);
                    throw e;
                } catch (Throwable th5) {
                    j3 = j2;
                    th = th5;
                    j = j6;
                    j6 = j3;
                    NativeCrypto.asn1_write_free(j6);
                    NativeCrypto.asn1_write_free(j);
                    throw th;
                }
            } catch (Throwable th6) {
                j3 = j2;
                th = th6;
                j6 = j3;
                NativeCrypto.asn1_write_free(j6);
                NativeCrypto.asn1_write_free(j);
                throw th;
            }
        } catch (IOException e3) {
            j4 = j;
            e = e3;
            j2 = 0;
        } catch (Throwable th7) {
            th = th7;
            NativeCrypto.asn1_write_free(j6);
            NativeCrypto.asn1_write_free(j);
            throw th;
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null || cls != OAEPParameterSpec.class) {
            throw new InvalidParameterSpecException("Unsupported class: ".concat(String.valueOf(String.valueOf(cls))));
        }
        return this.spec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            throw new InvalidParameterSpecException("Only OAEPParameterSpec is supported");
        }
        this.spec = (OAEPParameterSpec) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "Conscrypt OAEP AlgorithmParameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) {
        long j;
        long asn1_read_sequence;
        long j2;
        long j3 = 0;
        try {
            j = NativeCrypto.asn1_read_init(bArr);
            try {
                asn1_read_sequence = NativeCrypto.asn1_read_sequence(j);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            j = 0;
        }
        try {
            PSource.PSpecified pSpecified = PSource.PSpecified.DEFAULT;
            String readHash = readHash(asn1_read_sequence);
            String readMgfHash = readMgfHash(asn1_read_sequence);
            if (NativeCrypto.asn1_read_next_tag_is(asn1_read_sequence, 2)) {
                try {
                    j2 = NativeCrypto.asn1_read_tagged(asn1_read_sequence);
                } catch (Throwable th3) {
                    th = th3;
                    j2 = 0;
                }
                try {
                    long asn1_read_sequence2 = NativeCrypto.asn1_read_sequence(j2);
                    if (NativeCrypto.asn1_read_oid(asn1_read_sequence2).equals(PSPECIFIED_OID)) {
                        pSpecified = new PSource.PSpecified(NativeCrypto.asn1_read_octetstring(asn1_read_sequence2));
                        if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence2)) {
                            NativeCrypto.asn1_read_free(asn1_read_sequence2);
                            NativeCrypto.asn1_read_free(j2);
                        } else {
                            throw new IOException("Error reading ASN.1 encoding");
                        }
                    } else {
                        throw new IOException("Error reading ASN.1 encoding");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    NativeCrypto.asn1_read_free(0L);
                    NativeCrypto.asn1_read_free(j2);
                    throw th;
                }
            }
            if (NativeCrypto.asn1_read_is_empty(asn1_read_sequence) && NativeCrypto.asn1_read_is_empty(j)) {
                this.spec = new OAEPParameterSpec(readHash, "MGF1", new MGF1ParameterSpec(readMgfHash), pSpecified);
                NativeCrypto.asn1_read_free(asn1_read_sequence);
                NativeCrypto.asn1_read_free(j);
                return;
            }
            throw new IOException("Error reading ASN.1 encoding");
        } catch (Throwable th5) {
            th = th5;
            j3 = asn1_read_sequence;
            NativeCrypto.asn1_read_free(j3);
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
