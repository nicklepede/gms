package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbpj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ActivityStatistics extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbpj();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.j(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
