package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvno;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SortOrderInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvno();
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
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(sortOrderInfo.a)) && Arrays.equals(this.b, sortOrderInfo.b)) {
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.J(parcel, 2, this.b, i);
        atzr.c(parcel, a);
    }

    public SortOrderInfo(int i, SortItem[] sortItemArr) {
        this.a = i;
        this.b = sortItemArr;
    }
}
