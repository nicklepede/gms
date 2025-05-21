package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arxc;
import defpackage.cykq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetStorageStatsCall$Response extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new cykq();
    public Status a;
    public GetStorageStatsCall$PackageStats[] b;
    public long c;
    public long d;
    public long e;

    public GetStorageStatsCall$Response() {
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.J(parcel, 2, this.b, i);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }

    public GetStorageStatsCall$Response(Status status, GetStorageStatsCall$PackageStats[] getStorageStatsCall$PackageStatsArr, long j, long j2, long j3) {
        this.a = status;
        this.b = getStorageStatsCall$PackageStatsArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
