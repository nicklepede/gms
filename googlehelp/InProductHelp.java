package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bipf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipf();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 6, this.f);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }
}
