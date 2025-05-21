package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ayct;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class Extra extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayct();
    public final String a;
    public final int b;
    public final String c;
    public final Boolean d;
    public final Integer e;
    public final byte[] f;
    public final Long g;

    public Extra(String str, int i, String str2, Boolean bool, Integer num, byte[] bArr, Long l) {
        fvbo.f(str, "key");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = bool;
        this.e = num;
        this.f = bArr;
        this.g = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.z(parcel, 4, this.d);
        arxc.F(parcel, 5, this.e);
        arxc.i(parcel, 6, this.f, false);
        arxc.I(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
