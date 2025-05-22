package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ablt;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ekvk;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SmsRetrieverEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ablt();
    public int a;
    public String b;
    public int c;
    public int d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public String l;
    public int m;
    public int n;

    public SmsRetrieverEvent() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmsRetrieverEvent) {
            SmsRetrieverEvent smsRetrieverEvent = (SmsRetrieverEvent) obj;
            if (atyq.b(Integer.valueOf(this.a), Integer.valueOf(smsRetrieverEvent.a)) && atyq.b(this.b, smsRetrieverEvent.b) && atyq.b(Integer.valueOf(this.c), Integer.valueOf(smsRetrieverEvent.c)) && atyq.b(Integer.valueOf(this.d), Integer.valueOf(smsRetrieverEvent.d)) && atyq.b(this.e, smsRetrieverEvent.e) && atyq.b(this.f, smsRetrieverEvent.f) && atyq.b(Integer.valueOf(this.g), Integer.valueOf(smsRetrieverEvent.g)) && atyq.b(Integer.valueOf(this.h), Integer.valueOf(smsRetrieverEvent.h)) && atyq.b(Integer.valueOf(this.i), Integer.valueOf(smsRetrieverEvent.i)) && atyq.b(Integer.valueOf(this.j), Integer.valueOf(smsRetrieverEvent.j)) && atyq.b(Boolean.valueOf(this.k), Boolean.valueOf(smsRetrieverEvent.k)) && atyq.b(this.l, smsRetrieverEvent.l) && atyq.b(Integer.valueOf(this.m), Integer.valueOf(smsRetrieverEvent.m)) && atyq.b(Integer.valueOf(this.n), Integer.valueOf(smsRetrieverEvent.n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), ekvk.b(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), ekvk.b(this.e), ekvk.b(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Boolean.valueOf(this.k), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.o(parcel, 8, this.h);
        atzr.o(parcel, 9, this.i);
        atzr.o(parcel, 10, this.j);
        atzr.e(parcel, 11, this.k);
        atzr.v(parcel, 12, this.l, false);
        atzr.o(parcel, 13, this.m);
        atzr.o(parcel, 65535, this.n);
        atzr.c(parcel, a);
    }

    public SmsRetrieverEvent(int i, String str, int i2, int i3, String str2, String str3, int i4, int i5, int i6, int i7, boolean z, String str4, int i8, int i9) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = str2;
        this.f = str3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = z;
        this.l = str4;
        this.m = i8;
        this.n = i9;
    }
}
