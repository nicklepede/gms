package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ctcu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class GridConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctcu();
    public int a;
    public boolean b;

    private GridConfig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GridConfig) {
            GridConfig gridConfig = (GridConfig) obj;
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(gridConfig.a)) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(gridConfig.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public GridConfig(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
