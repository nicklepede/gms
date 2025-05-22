package com.google.android.gms.autofill.service.common;

import defpackage.ekvi;
import defpackage.elgo;
import defpackage.elkk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
final class AutoValue_AbstractDetectionHistory_DetectionResult extends AbstractDetectionHistory$DetectionResult {
    private final ekvi b;
    private final elgo c;

    public AutoValue_AbstractDetectionHistory_DetectionResult(ekvi ekviVar, elgo elgoVar) {
        this.b = ekviVar;
        if (elgoVar == null) {
            throw new NullPointerException("Null allFields");
        }
        this.c = elgoVar;
    }

    @Override // com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult
    public final ekvi b() {
        return this.b;
    }

    @Override // com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult
    public final elgo c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractDetectionHistory$DetectionResult) {
            AbstractDetectionHistory$DetectionResult abstractDetectionHistory$DetectionResult = (AbstractDetectionHistory$DetectionResult) obj;
            if (this.b.equals(abstractDetectionHistory$DetectionResult.b()) && elkk.i(this.c, abstractDetectionHistory$DetectionResult.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        elgo elgoVar = this.c;
        return "DetectionResult{focusedForm=" + this.b.toString() + ", allFields=" + elgoVar.toString() + "}";
    }
}
