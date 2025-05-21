package com.google.android.gms.org.conscrypt.metrics;

import com.google.android.gms.org.conscrypt.ct.LogStore;
import com.google.android.gms.org.conscrypt.ct.PolicyCompliance;
import com.google.android.gms.org.conscrypt.ct.VerificationResult;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public interface StatsLog {
    void countTlsHandshake(boolean z, String str, String str2, long j);

    void reportCTVerificationResult(LogStore logStore, VerificationResult verificationResult, PolicyCompliance policyCompliance, CertificateTransparencyVerificationReason certificateTransparencyVerificationReason);

    void updateCTLogListStatusChanged(LogStore logStore);
}
