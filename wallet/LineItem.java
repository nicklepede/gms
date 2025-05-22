package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkpf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class LineItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpf();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        atzr.o(parcel, 6, this.e);
        atzr.v(parcel, 7, this.f, false);
        atzr.c(parcel, a);
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
