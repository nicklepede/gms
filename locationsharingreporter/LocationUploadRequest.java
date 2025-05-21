package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.catt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationUploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new catt();
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.e(parcel, 7, this.g);
        arxc.e(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        arxc.v(parcel, 10, this.j, false);
        arxc.q(parcel, 11, this.k);
        arxc.c(parcel, a);
    }
}
