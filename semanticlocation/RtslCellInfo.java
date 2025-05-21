package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.czgq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RtslCellInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new czgq();
    public final int a;
    public final boolean b;
    public final int c;
    public final long d;
    public final String e;

    public RtslCellInfo(int i, boolean z, int i2, long j, String str) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = j;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.e(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
