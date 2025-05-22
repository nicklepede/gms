package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dcmw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LookupParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dcmw();
    public final int a;
    public final String b;
    public final TimeRangeFilter c;
    public final boolean d;
    public final Integer e;
    public final Integer f;
    public final Long g;

    public LookupParameters(int i, String str, TimeRangeFilter timeRangeFilter, boolean z, Integer num, Integer num2, Long l) {
        this.a = i;
        this.b = str;
        this.c = timeRangeFilter;
        this.d = z;
        this.e = num;
        this.f = num2;
        this.g = l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.e(parcel, 4, this.d);
        atzr.F(parcel, 5, this.e);
        atzr.F(parcel, 6, this.f);
        atzr.I(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
