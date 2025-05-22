package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cdcj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationUploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdcj();
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final LocationCollectionReason f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final String j;
    public final long k;

    public LocationUploadRequest(long j, int i, long j2, long j3, long j4, LocationCollectionReason locationCollectionReason, boolean z, boolean z2, String str, String str2, long j5) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = locationCollectionReason;
        this.g = z;
        this.h = z2;
        this.i = str;
        this.j = str2;
        this.k = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.e(parcel, 7, this.g);
        atzr.e(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        atzr.v(parcel, 10, this.j, false);
        atzr.q(parcel, 11, this.k);
        atzr.c(parcel, a);
    }
}
