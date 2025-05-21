package com.google.android.gms.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.crzs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Identifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new crzs();
    final int a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public Identifier(int i, String str, String str2, long j, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
