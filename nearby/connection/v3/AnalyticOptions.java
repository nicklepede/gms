package com.google.android.gms.nearby.connection.v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cgce;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class AnalyticOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgce();
    public final long a;

    public AnalyticOptions(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AnalyticOptions) && this.a == ((AnalyticOptions) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    public final String toString() {
        return "AnalyticOptions[flowId=" + this.a + ']';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.c(parcel, a);
    }
}
