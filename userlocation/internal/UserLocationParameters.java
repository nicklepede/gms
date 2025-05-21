package com.google.android.gms.userlocation.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dhto;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UserLocationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhto();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.x(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
