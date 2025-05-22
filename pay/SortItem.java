package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cvnn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SortItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvnn();
    public String a;
    public long b;
    public String c;

    private SortItem() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SortItem) {
            SortItem sortItem = (SortItem) obj;
            if (atyq.b(this.a, sortItem.a) && atyq.b(Long.valueOf(this.b), Long.valueOf(sortItem.b)) && atyq.b(this.c, sortItem.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.q(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public SortItem(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }
}
