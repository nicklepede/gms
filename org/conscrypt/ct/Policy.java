package com.google.android.gms.org.conscrypt.ct;

import java.security.cert.X509Certificate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public interface Policy {
    PolicyCompliance doesResultConformToPolicy(VerificationResult verificationResult, X509Certificate x509Certificate);

    boolean isLogStoreCompliant(LogStore logStore);
}
