package com.google.android.gms.car.animation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amvu;
import defpackage.atzr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ProjectionWindowAnimationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amvu();
    public final int a;
    public final boolean b;
    public final ProjectionWindowAnimationChoreography c;
    public final int d;

    public ProjectionWindowAnimationParams(int i, boolean z, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography, int i2) {
        this.a = i;
        this.b = z;
        this.c = projectionWindowAnimationChoreography;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionWindowAnimationParams)) {
            return false;
        }
        ProjectionWindowAnimationParams projectionWindowAnimationParams = (ProjectionWindowAnimationParams) obj;
        return this.a == projectionWindowAnimationParams.a && this.b == projectionWindowAnimationParams.b && this.d == projectionWindowAnimationParams.d && Objects.equals(this.c, projectionWindowAnimationParams.c);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b), this.c, Integer.valueOf(this.d));
    }

    public final String toString() {
        return "ProjectionWindowAnimationParams{animationResId=" + this.a + ", useRevealForTranslation=" + this.b + ", choreography=" + String.valueOf(this.c) + ", startOffset=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
