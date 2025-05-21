package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didq();
    public String a;
    public String b;
    public int c;

    public InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        int i2 = this.c;
        arxc.o(parcel, 4, (i2 == 1 || i2 == 2 || i2 == 3) ? i2 : 0);
        arxc.c(parcel, a);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
