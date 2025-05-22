package com.google.android.gms.userlocation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkew;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UserLocationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkew();
    public final String a;
    public final UserLocationClientIdentifier b;
    public final List c;

    public UserLocationParameters(String str, UserLocationClientIdentifier userLocationClientIdentifier, List list) {
        this.a = str;
        this.b = userLocationClientIdentifier;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.x(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
