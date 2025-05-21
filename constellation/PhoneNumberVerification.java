package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aswe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhoneNumberVerification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aswe();
    public final String a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final Bundle f;
    public final int g;
    public final long h;

    public PhoneNumberVerification(String str, long j, int i, int i2, String str2, Bundle bundle, int i3, long j2) {
        this.a = str;
        this.b = j;
        this.f = bundle;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.g = i3;
        this.h = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.g(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.q(parcel, 8, this.h);
        arxc.c(parcel, a);
    }
}
