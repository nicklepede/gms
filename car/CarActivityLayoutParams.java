package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amow;
import defpackage.atzr;
import defpackage.elgo;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarActivityLayoutParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amow();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Rect f;
    public final ProjectionWindowDecorationParams g;
    public final ProjectionWindowAnimationParams h;
    public final ProjectionWindowAnimationParams i;
    private final List j;

    public CarActivityLayoutParams(int i, int i2, int i3, int i4, int i5, Rect rect, List list, ProjectionWindowDecorationParams projectionWindowDecorationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams, ProjectionWindowAnimationParams projectionWindowAnimationParams2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = rect;
        this.j = list;
        this.g = projectionWindowDecorationParams;
        this.h = projectionWindowAnimationParams;
        this.i = projectionWindowAnimationParams2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarActivityLayoutParams)) {
            return false;
        }
        CarActivityLayoutParams carActivityLayoutParams = (CarActivityLayoutParams) obj;
        return this.a == carActivityLayoutParams.a && this.b == carActivityLayoutParams.b && this.c == carActivityLayoutParams.c && this.d == carActivityLayoutParams.d && this.e == carActivityLayoutParams.e && Objects.equals(this.f, carActivityLayoutParams.f) && Objects.equals(this.j, carActivityLayoutParams.j) && Objects.equals(this.g, carActivityLayoutParams.g) && Objects.equals(this.h, carActivityLayoutParams.h) && Objects.equals(this.i, carActivityLayoutParams.i);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.j, this.g, this.h, this.i);
    }

    public final String toString() {
        ProjectionWindowAnimationParams projectionWindowAnimationParams = this.i;
        ProjectionWindowAnimationParams projectionWindowAnimationParams2 = this.h;
        ProjectionWindowDecorationParams projectionWindowDecorationParams = this.g;
        List list = this.j;
        return "CarActivityLayoutParams{width=" + this.a + ", height=" + this.b + ", leftMargin=" + this.c + ", topMargin=" + this.d + ", z=" + this.e + ", initialInsets=" + String.valueOf(this.f) + ", regionsCastingInsets=" + String.valueOf(list) + ", decoration=" + String.valueOf(projectionWindowDecorationParams) + ", enterFromEmptyAnimation=" + String.valueOf(projectionWindowAnimationParams2) + ", exitToEmptyAnimation=" + String.valueOf(projectionWindowAnimationParams) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.y(parcel, 7, elgo.i(this.j), false);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.c(parcel, a);
    }
}
