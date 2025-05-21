package com.google.android.gms.autofill.service.common;

import defpackage.eiid;
import defpackage.eitj;
import defpackage.eixf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
final class AutoValue_AbstractDetectionHistory_DetectionResult extends AbstractDetectionHistory$DetectionResult {
    private final eiid b;
    private final eitj c;

    public AutoValue_AbstractDetectionHistory_DetectionResult(eiid eiidVar, eitj eitjVar) {
        this.b = eiidVar;
        if (eitjVar == null) {
            throw new NullPointerException("Null allFields");
        }
        this.c = eitjVar;
    }

    @Override // com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult
    public final eiid b() {
        return this.b;
    }

    @Override // com.google.android.gms.autofill.service.common.AbstractDetectionHistory$DetectionResult
    public final eitj c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractDetectionHistory$DetectionResult) {
            AbstractDetectionHistory$DetectionResult abstractDetectionHistory$DetectionResult = (AbstractDetectionHistory$DetectionResult) obj;
            if (this.b.equals(abstractDetectionHistory$DetectionResult.b()) && eixf.i(this.c, abstractDetectionHistory$DetectionResult.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eitj eitjVar = this.c;
        return "DetectionResult{focusedForm=" + this.b.toString() + ", allFields=" + eitjVar.toString() + "}";
    }
}
