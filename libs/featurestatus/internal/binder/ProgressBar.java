package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bque;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ProgressBar extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bque();
    public final double a;
    public final String b;

    public ProgressBar(double d, String str) {
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBar)) {
            return false;
        }
        ProgressBar progressBar = (ProgressBar) obj;
        return Double.compare(this.a, progressBar.a) == 0 && fvbo.n(this.b, progressBar.b);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long j = doubleToLongBits ^ (doubleToLongBits >>> 32);
        String str = this.b;
        return (((int) j) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProgressBar(percent=" + this.a + ", label=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        double d = this.a;
        int a = arxc.a(parcel);
        arxc.j(parcel, 1, d);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
