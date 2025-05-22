package com.google.android.gms.org.conscrypt.ct;

import com.google.android.gms.org.conscrypt.Platform;
import com.google.android.gms.org.conscrypt.ct.LogStore;
import com.google.android.gms.org.conscrypt.metrics.CertificateTransparencyVerificationReason;
import com.google.android.gms.org.conscrypt.metrics.StatsLog;
import j$.util.Objects;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CertificateTransparency {
    private LogStore logStore;
    private Policy policy;
    private StatsLog statsLog;
    private Verifier verifier;

    public CertificateTransparency(LogStore logStore, Policy policy, Verifier verifier, StatsLog statsLog) {
        Objects.requireNonNull(logStore);
        Objects.requireNonNull(policy);
        Objects.requireNonNull(verifier);
        Objects.requireNonNull(statsLog);
        this.logStore = logStore;
        this.policy = policy;
        this.verifier = verifier;
        this.statsLog = statsLog;
    }

    public void checkCT(List list, byte[] bArr, byte[] bArr2, String str) {
        if (this.logStore.getState() != LogStore.State.COMPLIANT) {
            this.statsLog.reportCTVerificationResult(this.logStore, null, null, reasonCTVerificationRequired(str));
            return;
        }
        VerificationResult verifySignedCertificateTimestamps = this.verifier.verifySignedCertificateTimestamps(list, bArr2, bArr);
        PolicyCompliance doesResultConformToPolicy = this.policy.doesResultConformToPolicy(verifySignedCertificateTimestamps, (X509Certificate) list.get(0));
        this.statsLog.reportCTVerificationResult(this.logStore, verifySignedCertificateTimestamps, doesResultConformToPolicy, reasonCTVerificationRequired(str));
        if (doesResultConformToPolicy != PolicyCompliance.COMPLY) {
            throw new CertificateException("Certificate chain does not conform to required transparency policy: ".concat(String.valueOf(doesResultConformToPolicy.name())));
        }
    }

    public boolean isCTVerificationRequired(String str) {
        return Platform.isCTVerificationRequired(str);
    }

    public CertificateTransparencyVerificationReason reasonCTVerificationRequired(String str) {
        return Platform.reasonCTVerificationRequired(str);
    }
}
