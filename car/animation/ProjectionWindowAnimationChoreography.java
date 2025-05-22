package com.google.android.gms.car.animation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amvt;
import defpackage.atzr;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ProjectionWindowAnimationChoreography extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new amvt();
    final List a;
    final List b;
    final List c;
    final List d;
    public final boolean e;
    public final boolean f;

    public ProjectionWindowAnimationChoreography(List list, List list2, List list3, List list4, boolean z, boolean z2) {
        this.b = list2;
        this.a = list;
        this.c = list3;
        this.d = list4;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionWindowAnimationChoreography)) {
            return false;
        }
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = (ProjectionWindowAnimationChoreography) obj;
        return this.b.equals(projectionWindowAnimationChoreography.b) && this.a.equals(projectionWindowAnimationChoreography.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        List list3 = this.a;
        return "ProjectionWindowAnimationChoreography{actionsToChoreograph=" + String.valueOf(this.b) + ", regionsToChoreograph=" + String.valueOf(list3) + ", regionsWithCustomAnimations=" + String.valueOf(list2) + ", customAnimations=" + String.valueOf(list) + ", castInsetsBeforeAnimations=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.E(parcel, 2, this.b);
        atzr.y(parcel, 3, this.c, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.e(parcel, 5, this.e);
        atzr.e(parcel, 6, this.f);
        atzr.c(parcel, a);
    }
}
