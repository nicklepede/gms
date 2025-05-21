package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czfl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ActivityStatistics extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czfl();
    public final int a;
    public final double b;
    public final long c;

    public ActivityStatistics(int i, double d, long j) {
        this.a = i;
        this.b = d;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.j(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
