package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cyko;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetStorageStatsCall$PackageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cyko();
    public String a;
    public long b;
    public boolean c;
    public long d;

    public GetStorageStatsCall$PackageStats() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.q(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public GetStorageStatsCall$PackageStats(String str, long j, boolean z, long j2) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = j2;
    }
}
