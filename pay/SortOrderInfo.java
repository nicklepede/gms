package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctej;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SortOrderInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctej();
    public int a;
    public SortItem[] b;

    private SortOrderInfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortOrderInfo) {
            SortOrderInfo sortOrderInfo = (SortOrderInfo) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(sortOrderInfo.a)) && Arrays.equals(this.b, sortOrderInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.J(parcel, 2, this.b, i);
        arxc.c(parcel, a);
    }

    public SortOrderInfo(int i, SortItem[] sortItemArr) {
        this.a = i;
        this.b = sortItemArr;
    }
}
