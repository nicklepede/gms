package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dghj;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class QuickStartSourceEventData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dghj();
    public final int a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;

    public QuickStartSourceEventData(int i, String str, List list, List list2, int i2) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.o(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
