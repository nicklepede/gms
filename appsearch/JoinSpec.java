package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vzp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class JoinSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vzp();
    public final String a;
    public final SearchSpec b;
    public final String c;
    public final int d;
    public final int e;

    public JoinSpec(String str, SearchSpec searchSpec, String str2, int i, int i2) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = (SearchSpec) Objects.requireNonNull(searchSpec);
        this.c = (String) Objects.requireNonNull(str2);
        this.d = i;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
