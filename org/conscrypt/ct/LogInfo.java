package com.google.android.gms.org.conscrypt.ct;

import com.google.android.gms.org.conscrypt.ct.VerifiedSCT;
import j$.util.Objects;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LogInfo {
    public static final int STATE_PENDING = 1;
    public static final int STATE_QUALIFIED = 2;
    public static final int STATE_READONLY = 4;
    public static final int STATE_REJECTED = 6;
    public static final int STATE_RETIRED = 5;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_USABLE = 3;
    private final String description;
    private final byte[] logId;
    private final String operator;
    private final PublicKey publicKey;
    private final int state;
    private final long stateTimestamp;
    private final String url;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Builder {
        private String description;
        private byte[] logId;
        private String operator;
        private PublicKey publicKey;
        private int state;
        private long stateTimestamp;
        private String url;

        public LogInfo build() {
            return new LogInfo(this);
        }

        public Builder setDescription(String str) {
            Objects.requireNonNull(str);
            this.description = str;
            return this;
        }

        public Builder setOperator(String str) {
            Objects.requireNonNull(str);
            this.operator = str;
            return this;
        }

        public Builder setPublicKey(PublicKey publicKey) {
            Objects.requireNonNull(publicKey);
            this.publicKey = publicKey;
            try {
                this.logId = MessageDigest.getInstance("SHA-256").digest(publicKey.getEncoded());
                return this;
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder setState(int i, long j) {
            if (i < 0 || i > 6) {
                throw new IllegalArgumentException("invalid state value");
            }
            this.state = i;
            this.stateTimestamp = j;
            return this;
        }

        public Builder setUrl(String str) {
            Objects.requireNonNull(str);
            this.url = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogInfo)) {
            return false;
        }
        LogInfo logInfo = (LogInfo) obj;
        return this.state == logInfo.state && this.description.equals(logInfo.description) && this.url.equals(logInfo.url) && this.operator.equals(logInfo.operator) && this.stateTimestamp == logInfo.stateTimestamp && Arrays.equals(this.logId, logInfo.logId);
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getID() {
        return this.logId;
    }

    public String getOperator() {
        return this.operator;
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public int getState() {
        return this.state;
    }

    public int getStateAt(long j) {
        if (j >= this.stateTimestamp) {
            return this.state;
        }
        return 0;
    }

    public long getStateTimestamp() {
        return this.stateTimestamp;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.logId)), this.description, this.url, Integer.valueOf(this.state), Long.valueOf(this.stateTimestamp), this.operator);
    }

    public VerifiedSCT.Status verifySingleSCT(SignedCertificateTimestamp signedCertificateTimestamp, CertificateEntry certificateEntry) {
        if (!Arrays.equals(signedCertificateTimestamp.getLogID(), getID())) {
            return VerifiedSCT.Status.UNKNOWN_LOG;
        }
        try {
            byte[] encodeTBS = signedCertificateTimestamp.encodeTBS(certificateEntry);
            try {
                Signature signature = Signature.getInstance(signedCertificateTimestamp.getSignature().getAlgorithm());
                try {
                    signature.initVerify(this.publicKey);
                    try {
                        signature.update(encodeTBS);
                        return !signature.verify(signedCertificateTimestamp.getSignature().getSignature()) ? VerifiedSCT.Status.INVALID_SIGNATURE : VerifiedSCT.Status.VALID;
                    } catch (SignatureException e) {
                        throw new RuntimeException(e);
                    }
                } catch (InvalidKeyException unused) {
                    return VerifiedSCT.Status.INVALID_SCT;
                }
            } catch (NoSuchAlgorithmException unused2) {
                return VerifiedSCT.Status.INVALID_SCT;
            }
        } catch (SerializationException unused3) {
            return VerifiedSCT.Status.INVALID_SCT;
        }
    }

    private LogInfo(Builder builder) {
        Objects.requireNonNull(builder.logId);
        Objects.requireNonNull(builder.publicKey);
        Objects.requireNonNull(builder.url);
        Objects.requireNonNull(builder.operator);
        this.logId = builder.logId;
        this.publicKey = builder.publicKey;
        this.state = builder.state;
        this.stateTimestamp = builder.stateTimestamp;
        this.description = builder.description;
        this.url = builder.url;
        this.operator = builder.operator;
    }
}
