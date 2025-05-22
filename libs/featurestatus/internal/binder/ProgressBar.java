package com.google.android.gms.libs.featurestatus.internal.binder;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.btbv;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ProgressBar extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btbv();
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
        return Double.compare(this.a, progressBar.a) == 0 && fxxm.n(this.b, progressBar.b);
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
        fxxm.f(parcel, "dest");
        double d = this.a;
        int a = atzr.a(parcel);
        atzr.j(parcel, 1, d);
        atzr.v(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }
}
