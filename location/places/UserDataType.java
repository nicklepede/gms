package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurq;
import defpackage.ccog;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UserDataType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final UserDataType a;
    public static final UserDataType b;
    public static final UserDataType c;
    final String d;
    final int e;

    static {
        UserDataType userDataType = new UserDataType("test_type", 1);
        a = userDataType;
        UserDataType userDataType2 = new UserDataType("labeled_place", 6);
        b = userDataType2;
        UserDataType userDataType3 = new UserDataType("here_content", 7);
        c = userDataType3;
        aurq.j(userDataType, userDataType2, userDataType3);
        CREATOR = new ccog();
    }

    public UserDataType(String str, int i) {
        atzb.q(str);
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserDataType)) {
            return false;
        }
        UserDataType userDataType = (UserDataType) obj;
        return this.d.equals(userDataType.d) && this.e == userDataType.e;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.d;
        int a2 = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.e);
        atzr.c(parcel, a2);
    }
}
