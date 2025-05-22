package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wkv;
import defpackage.wkz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkv();
    public final boolean a;
    public final boolean b;

    public AppRestrictionState(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static wkz a() {
        wkz wkzVar = new wkz();
        wkzVar.b(false);
        return wkzVar;
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
