package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.dhsu;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EstimationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhsu();
    public final boolean a;
    public final boolean b;

    public EstimationOptions(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EstimationOptions)) {
            return false;
        }
        EstimationOptions estimationOptions = (EstimationOptions) obj;
        return estimationOptions.a == this.a && estimationOptions.b == this.b;
    }

    public final int hashCode() {
        return (this.a ? 1 : 0) + (true != this.b ? 0 : 2);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("shouldEstimateDetails", Boolean.valueOf(this.a), arrayList);
        arwa.b("shouldProvidePlaceHierarchy", Boolean.valueOf(this.b), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
