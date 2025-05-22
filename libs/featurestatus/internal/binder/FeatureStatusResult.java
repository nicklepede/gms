package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.btbo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class FeatureStatusResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btbo();
    public final FeatureOptInState a;
    public final ErrorDetails b;

    public FeatureStatusResult(FeatureOptInState featureOptInState, ErrorDetails errorDetails) {
        this.a = featureOptInState;
        this.b = errorDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureStatusResult)) {
            return false;
        }
        FeatureStatusResult featureStatusResult = (FeatureStatusResult) obj;
        return fxxm.n(this.a, featureStatusResult.a) && fxxm.n(this.b, featureStatusResult.b);
    }

    public final int hashCode() {
        FeatureOptInState featureOptInState = this.a;
        int hashCode = featureOptInState == null ? 0 : featureOptInState.hashCode();
        ErrorDetails errorDetails = this.b;
        return (hashCode * 31) + (errorDetails != null ? errorDetails.hashCode() : 0);
    }

    public final String toString() {
        return "FeatureStatusResult(state=" + this.a + ", details=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        FeatureOptInState featureOptInState = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, featureOptInState, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}
