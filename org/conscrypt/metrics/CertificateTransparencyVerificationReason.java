package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
