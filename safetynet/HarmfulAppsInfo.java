package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cxyg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class HarmfulAppsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cxyg();
    public final long a;
    public final HarmfulAppsData[] b;
    public final int c;
    public final boolean d;

    public HarmfulAppsInfo(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.a = j;
        this.b = harmfulAppsDataArr;
        this.d = z;
        this.c = true != z ? -1 : i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.q(parcel, 2, this.a);
        arxc.J(parcel, 3, this.b, i);
        arxc.o(parcel, 4, this.c);
        arxc.e(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
