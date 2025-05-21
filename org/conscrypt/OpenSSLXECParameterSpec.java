package com.google.android.gms.org.conscrypt;

import java.security.spec.AlgorithmParameterSpec;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
class OpenSSLXECParameterSpec implements AlgorithmParameterSpec {
    public static final String X25519 = "1.3.101.110";
    private final String oid;

    public OpenSSLXECParameterSpec(String str) {
        this.oid = str;
    }

    public String getOid() {
        return this.oid;
    }
}
