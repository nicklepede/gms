package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atzr;
import defpackage.dauo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GetStorageStatsCall$Response extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new dauo();
    public Status a;
    public GetStorageStatsCall$PackageStats[] b;
    public long c;
    public long d;
    public long e;

    public GetStorageStatsCall$Response() {
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.J(parcel, 2, this.b, i);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }

    public GetStorageStatsCall$Response(Status status, GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr, long j, long j2, long j3) {
        this.a = status;
        this.b = getStorageStatsCall$PackageStatsArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
