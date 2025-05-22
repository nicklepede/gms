package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acyz;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GplusInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acyz();
    final int a;
    final boolean b;
    final String c;
    final String d;
    final String e;
    final boolean f;
    final boolean g;
    final String h;
    final String i;
    final String j;

    public GplusInfoResponse() {
        this.a = 1;
        this.b = false;
        this.c = "";
        this.d = "";
        this.e = "";
        this.h = "";
        this.i = "";
        this.f = false;
        this.g = false;
        this.j = "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.e(parcel, 6, this.f);
        atzr.e(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.c(parcel, a);
    }

    public GplusInfoResponse(int i, boolean z, String str, String str2, String str3, boolean z2, boolean z3, String str4, String str5, String str6) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
    }
}
