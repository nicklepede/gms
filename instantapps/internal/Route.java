package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bqny;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class Route extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqny();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public Route(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        atzb.q(str);
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.o(parcel, 3, this.b);
        atzr.v(parcel, 4, this.c, false);
        atzr.v(parcel, 5, this.d, false);
        String str2 = this.e;
        atzr.v(parcel, 6, str2, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.v(parcel, 8, this.g, false);
        atzr.v(parcel, 9, str2, false);
        atzr.c(parcel, a);
    }
}
