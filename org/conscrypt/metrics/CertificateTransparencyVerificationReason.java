package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public enum CertificateTransparencyVerificationReason {
    UNKNOWN(0),
    APP_OPT_IN(3),
    DOMAIN_OPT_IN(4);

    final int id;

    CertificateTransparencyVerificationReason(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }
}
