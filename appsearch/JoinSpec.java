package com.google.android.gms.appsearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.udq;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class JoinSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new udq();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
