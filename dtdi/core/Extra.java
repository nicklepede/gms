package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagt;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class Extra extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagt();
    public final String a;
    public final int b;
    public final String c;
    public final Boolean d;
    public final Integer e;
    public final byte[] f;
    public final Long g;

    public Extra(String str, int i, String str2, Boolean bool, Integer num, byte[] bArr, Long l) {
        fxxm.f(str, "key");
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
        fxxm.f(parcel, "dest");
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.z(parcel, 4, this.d);
        atzr.F(parcel, 5, this.e);
        atzr.i(parcel, 6, this.f, false);
        atzr.I(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
