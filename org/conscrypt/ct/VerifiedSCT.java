package com.google.android.gms.org.conscrypt.ct;

import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class VerifiedSCT {
    private final LogInfo logInfo;
    private final SignedCertificateTimestamp sct;
    private final Status status;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Builder {
        private LogInfo logInfo;
        private SignedCertificateTimestamp sct;
        private Status status;

        public Builder(SignedCertificateTimestamp signedCertificateTimestamp) {
            this.sct = signedCertificateTimestamp;
        }

        public VerifiedSCT build() {
            return new VerifiedSCT(this);
        }

        public Builder setLogInfo(LogInfo logInfo) {
            Objects.requireNonNull(logInfo);
            this.logInfo = logInfo;
            return this;
        }

        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT
    }

    public LogInfo getLogInfo() {
        return this.logInfo;
    }

    public SignedCertificateTimestamp getSct() {
        return this.sct;
    }

    public Status getStatus() {
        return this.status;
    }

    public boolean isValid() {
        return this.status == Status.VALID;
    }

    private VerifiedSCT(Builder builder) {
        Objects.requireNonNull(builder.sct);
        Objects.requireNonNull(builder.status);
        if (builder.status == Status.VALID) {
            Objects.requireNonNull(builder.logInfo);
        }
        this.sct = builder.sct;
        this.status = builder.status;
        this.logInfo = builder.logInfo;
    }
}
