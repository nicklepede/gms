package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bqtt;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ContextualCardResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqtt();
    public final ContextualCard a;
    public final ErrorDetails b;

    public ContextualCardResult(ContextualCard contextualCard, ErrorDetails errorDetails) {
        this.a = contextualCard;
        this.b = errorDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextualCardResult)) {
            return false;
        }
        ContextualCardResult contextualCardResult = (ContextualCardResult) obj;
        return fvbo.n(this.a, contextualCardResult.a) && fvbo.n(this.b, contextualCardResult.b);
    }

    public final int hashCode() {
        ContextualCard contextualCard = this.a;
        int hashCode = contextualCard == null ? 0 : contextualCard.hashCode();
        ErrorDetails errorDetails = this.b;
        return (hashCode * 31) + (errorDetails != null ? errorDetails.hashCode() : 0);
    }

    public final String toString() {
        return "ContextualCardResult(card=" + this.a + ", details=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        ContextualCard contextualCard = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, contextualCard, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}
