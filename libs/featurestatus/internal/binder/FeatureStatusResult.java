package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bqtx;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class FeatureStatusResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqtx();
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
        return fvbo.n(this.a, featureStatusResult.a) && fvbo.n(this.b, featureStatusResult.b);
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
        fvbo.f(parcel, "dest");
        FeatureOptInState featureOptInState = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, featureOptInState, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
