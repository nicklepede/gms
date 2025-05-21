package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ddwe;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class QuickStartSourceEventData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddwe();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.o(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
