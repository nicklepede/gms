package com.google.android.gms.constellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.avaf;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SimCapability extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avaf();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final List e;

    public SimCapability(int i, String str, int i2, String str2, List list) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.y(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
