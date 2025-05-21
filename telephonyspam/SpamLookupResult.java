package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfbu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SpamLookupResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dfbu();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public SpamLookupResult(int i, int i2) {
        this.a = 2;
        this.b = 1;
        this.c = 5;
        this.d = i;
        this.e = i2;
        this.f = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.o(parcel, 5, this.e);
        arxc.o(parcel, 6, this.f);
        arxc.c(parcel, a);
    }

    public SpamLookupResult(int i, int i2, int i3, int i4) {
        this.a = 2;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = 0;
    }

    public SpamLookupResult(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }
}
