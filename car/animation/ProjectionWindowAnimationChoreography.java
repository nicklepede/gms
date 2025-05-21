package com.google.android.gms.car.animation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akui;
import defpackage.arxc;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ProjectionWindowAnimationChoreography extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akui();
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
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.E(parcel, 2, this.b);
        arxc.y(parcel, 3, this.c, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.e(parcel, 5, this.e);
        arxc.e(parcel, 6, this.f);
        arxc.c(parcel, a);
    }
}
