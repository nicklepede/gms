package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmsb;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AcceptTermsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmsb();
    public final int a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final boolean h;

    public AcceptTermsRequest(int i, List list, String str, String str2, String str3, String str4, List list2, boolean z) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list2;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.E(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.E(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.c(parcel, a);
    }
}
