package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkpb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkpb();
    public String a;
    public String b;
    public int c;

    public InstrumentInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        int i2 = this.c;
        atzr.o(parcel, 4, (i2 == 1 || i2 == 2 || i2 == 3) ? i2 : 0);
        atzr.c(parcel, a);
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
