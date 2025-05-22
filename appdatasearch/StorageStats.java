package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.vor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class StorageStats extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vor();
    public final RegisteredPackageInfo[] a;
    public final long b;
    public final long c;
    public final long d;

    public StorageStats(RegisteredPackageInfo[] registeredPackageInfoArr, long j, long j2, long j3) {
        this.a = registeredPackageInfoArr;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.J(parcel, 1, this.a, i);
        atzr.q(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}
