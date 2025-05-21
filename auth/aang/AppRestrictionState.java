package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uow;
import defpackage.upa;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uow();
    public final boolean a;
    public final boolean b;

    public AppRestrictionState(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static upa a() {
        upa upaVar = new upa();
        upaVar.b(false);
        return upaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppRestrictionState)) {
            return false;
        }
        AppRestrictionState appRestrictionState = (AppRestrictionState) obj;
        return this.a == appRestrictionState.a && this.b == appRestrictionState.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
