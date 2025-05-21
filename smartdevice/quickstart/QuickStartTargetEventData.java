package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import defpackage.arxc;
import defpackage.ddwf;
import defpackage.ddwg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class QuickStartTargetEventData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ddwg();
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
        return ddwf.a(15, null, null, 0, false, null, 0, null, false, null, i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.o(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.y(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.v(parcel, 8, this.h, false);
        arxc.e(parcel, 9, this.i);
        arxc.y(parcel, 10, this.j, false);
        arxc.o(parcel, 11, this.k);
        arxc.c(parcel, a);
    }
}
