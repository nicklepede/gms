package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.daco;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class LookupParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new daco();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.e(parcel, 4, this.d);
        arxc.F(parcel, 5, this.e);
        arxc.F(parcel, 6, this.f);
        arxc.I(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
