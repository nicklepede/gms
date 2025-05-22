package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avad;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhoneNumberVerification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avad();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.g(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.q(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
