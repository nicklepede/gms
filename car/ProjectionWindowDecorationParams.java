package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amvq;
import defpackage.atzr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ProjectionWindowDecorationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amvq();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;

    public ProjectionWindowDecorationParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionWindowDecorationParams)) {
            return false;
        }
        ProjectionWindowDecorationParams projectionWindowDecorationParams = (ProjectionWindowDecorationParams) obj;
        return this.a == projectionWindowDecorationParams.a && this.b == projectionWindowDecorationParams.b && this.c == projectionWindowDecorationParams.c && this.d == projectionWindowDecorationParams.d && this.e == projectionWindowDecorationParams.e && this.f == projectionWindowDecorationParams.f && this.g == projectionWindowDecorationParams.g && this.h == projectionWindowDecorationParams.h && this.i == projectionWindowDecorationParams.i;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), Boolean.valueOf(this.i));
    }

    public final String toString() {
        return "ProjectionWindowDecorationParams{outlineLeft=" + this.a + ", outlineTop=" + this.b + ", outlineRight=" + this.c + ", outlineBottom=" + this.d + ", corners=" + this.e + ", cornerRadius=" + this.f + ", antiAliasingType=" + this.g + ", showOutlinesOnlyWhenInset=" + this.h + ", showRoundedCornersOnlyWhenInset=" + this.i + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.o(parcel, 6, this.f);
        atzr.o(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.e(parcel, 9, this.i);
        atzr.c(parcel, a);
    }
}
