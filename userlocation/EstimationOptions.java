package com.google.android.gms.userlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.dkec;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EstimationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkec();
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
        atyp.b("shouldEstimateDetails", Boolean.valueOf(this.a), arrayList);
        atyp.b("shouldProvidePlaceHierarchy", Boolean.valueOf(this.b), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
