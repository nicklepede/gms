package com.google.android.gms.org.conscrypt.metrics;

import com.google.android.gms.org.conscrypt.ct.LogStore;
import com.google.android.gms.org.conscrypt.ct.PolicyCompliance;
import com.google.android.gms.org.conscrypt.ct.VerificationResult;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public interface StatsLog {
    void countServiceUsage(int i, int i2, int i3, int i4);

    void countTlsHandshake(boolean z, String str, String str2, long j);

    void reportCTVerificationResult(LogStore logStore, VerificationResult verificationResult, PolicyCompliance policyCompliance, CertificateTransparencyVerificationReason certificateTransparencyVerificationReason);

    void updateCTLogListStatusChanged(LogStore logStore);
}
