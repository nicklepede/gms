package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import defpackage.atzr;
import defpackage.dghk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class QuickStartTargetEventData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dghk();
    public final int a;
    public final String b;
    public final VerificationInfo c;
    public final int d;
    public final boolean e;
    public final ArrayList f;
    public final int g;
    public final String h;
    public final boolean i;
    public final List j;
    public final int k;

    public QuickStartTargetEventData(int i, String str, VerificationInfo verificationInfo, int i2, boolean z, ArrayList arrayList, int i3, String str2, boolean z2, List list, int i4) {
        this.a = i;
        this.b = str;
        this.c = verificationInfo;
        this.d = i2;
        this.e = z;
        this.f = arrayList;
        this.g = i3;
        this.h = str2;
        this.i = z2;
        this.j = list;
        this.k = i4;
    }

    public static QuickStartTargetEventData a(int i) {
        return new QuickStartTargetEventData(15, null, null, 0, false, null, 0, null, false, null, i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.o(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.y(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.v(parcel, 8, this.h, false);
        atzr.e(parcel, 9, this.i);
        atzr.y(parcel, 10, this.j, false);
        atzr.o(parcel, 11, this.k);
        atzr.c(parcel, a);
    }
}
