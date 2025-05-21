package com.google.android.gms.auth.api.phone.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.eiif;
import defpackage.zlt;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SmsRetrieverEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zlt();
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
            if (arwb.b(Integer.valueOf(this.a), Integer.valueOf(smsRetrieverEvent.a)) && arwb.b(this.b, smsRetrieverEvent.b) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(smsRetrieverEvent.c)) && arwb.b(Integer.valueOf(this.d), Integer.valueOf(smsRetrieverEvent.d)) && arwb.b(this.e, smsRetrieverEvent.e) && arwb.b(this.f, smsRetrieverEvent.f) && arwb.b(Integer.valueOf(this.g), Integer.valueOf(smsRetrieverEvent.g)) && arwb.b(Integer.valueOf(this.h), Integer.valueOf(smsRetrieverEvent.h)) && arwb.b(Integer.valueOf(this.i), Integer.valueOf(smsRetrieverEvent.i)) && arwb.b(Integer.valueOf(this.j), Integer.valueOf(smsRetrieverEvent.j)) && arwb.b(Boolean.valueOf(this.k), Boolean.valueOf(smsRetrieverEvent.k)) && arwb.b(this.l, smsRetrieverEvent.l) && arwb.b(Integer.valueOf(this.m), Integer.valueOf(smsRetrieverEvent.m)) && arwb.b(Integer.valueOf(this.n), Integer.valueOf(smsRetrieverEvent.n))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), eiif.b(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), eiif.b(this.e), eiif.b(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j), Boolean.valueOf(this.k), this.l, Integer.valueOf(this.m), Integer.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.o(parcel, 8, this.h);
        arxc.o(parcel, 9, this.i);
        arxc.o(parcel, 10, this.j);
        arxc.e(parcel, 11, this.k);
        arxc.v(parcel, 12, this.l, false);
        arxc.o(parcel, 13, this.m);
        arxc.o(parcel, 65535, this.n);
        arxc.c(parcel, a);
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
