package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.daid;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class HarmfulAppsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new daid();
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 2, this.a);
        atzr.J(parcel, 3, this.b, i);
        atzr.o(parcel, 4, this.c);
        atzr.e(parcel, 5, this.d);
        atzr.c(parcel, a);
    }
}
