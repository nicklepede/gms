package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dbqo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RtslCellInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dbqo();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.e(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
