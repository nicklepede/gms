package com.google.android.gms.org.conscrypt.ct;

import java.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public interface Policy {
    PolicyCompliance doesResultConformToPolicy(VerificationResult verificationResult, X509Certificate x509Certificate);

    boolean isLogStoreCompliant(LogStore logStore);
}
