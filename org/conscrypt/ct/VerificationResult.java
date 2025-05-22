package com.google.android.gms.org.conscrypt.ct;

import com.google.android.gms.org.conscrypt.ct.SignedCertificateTimestamp;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class VerificationResult {
    private final List validSCTs = new ArrayList();
    private final List invalidSCTs = new ArrayList();
    private final EnumMap count = new EnumMap(SignedCertificateTimestamp.Origin.class);

    public void add(VerifiedSCT verifiedSCT) {
        if (verifiedSCT.isValid()) {
            this.validSCTs.add(verifiedSCT);
        } else {
            this.invalidSCTs.add(verifiedSCT);
        }
        SignedCertificateTimestamp.Origin origin = verifiedSCT.getSct().getOrigin();
        Integer num = (Integer) this.count.get(origin);
        if (num == null) {
            this.count.put((EnumMap) origin, (SignedCertificateTimestamp.Origin) 1);
        } else {
            this.count.put((EnumMap) origin, (SignedCertificateTimestamp.Origin) Integer.valueOf(num.intValue() + 1));
        }
    }

    public List getInvalidSCTs() {
        return DesugarCollections.unmodifiableList(this.invalidSCTs);
    }

    public List getValidSCTs() {
        return DesugarCollections.unmodifiableList(this.validSCTs);
    }

    public int numCertSCTs() {
        Integer num = (Integer) this.count.get(SignedCertificateTimestamp.Origin.EMBEDDED);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int numOCSPSCTs() {
        Integer num = (Integer) this.count.get(SignedCertificateTimestamp.Origin.OCSP_RESPONSE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int numTlsSCTs() {
        Integer num = (Integer) this.count.get(SignedCertificateTimestamp.Origin.TLS_EXTENSION);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
