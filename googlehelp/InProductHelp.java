package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bktu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bktu();
    public GoogleHelp a;
    public String b;
    public String c;
    public int d;
    public String e;
    public int f;
    public final String g;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    public final void a() {
        this.f = 0;
    }

    public final void b() {
        this.d = 0;
    }

    public final void c(String str) {
        this.a.D = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 6, this.f);
        atzr.v(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }
}
