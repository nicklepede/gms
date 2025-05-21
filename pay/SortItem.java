package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctei;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SortItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctei();
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
            if (arwb.b(this.a, sortItem.a) && arwb.b(Long.valueOf(this.b), Long.valueOf(sortItem.b)) && arwb.b(this.c, sortItem.c)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public SortItem(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }
}
