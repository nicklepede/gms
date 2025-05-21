package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnw;
import defpackage.cafp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        asnw.j(userDataType, userDataType2, userDataType3);
        CREATOR = new cafp();
    }

    public UserDataType(String str, int i) {
        arwm.q(str);
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
        int a2 = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.e);
        arxc.c(parcel, a2);
    }
}
