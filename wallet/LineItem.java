package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didu();
    String a;
    String b;
    String c;
    String d;
    final int e;
    String f;

    LineItem() {
        this.e = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.v(parcel, 5, this.d, false);
        arxc.o(parcel, 6, this.e);
        arxc.v(parcel, 7, this.f, false);
        arxc.c(parcel, a);
    }

    public LineItem(String str, String str2, String str3, String str4, int i, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
    }
}
