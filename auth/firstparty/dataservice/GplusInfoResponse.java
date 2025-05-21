package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aayz;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GplusInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aayz();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.e(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.c(parcel, a);
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
