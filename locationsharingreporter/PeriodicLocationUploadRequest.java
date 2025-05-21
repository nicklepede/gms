package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.catx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PeriodicLocationUploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new catx();
    public final LocationCollectionReason a;
    public final LocationShare b;
    public final int c;
    public final long d;

    @Deprecated
    public final boolean e;
    public final String f;
    public final boolean g;

    public PeriodicLocationUploadRequest(LocationCollectionReason locationCollectionReason, LocationShare locationShare, int i, long j, boolean z, String str, boolean z2) {
        this.a = locationCollectionReason;
        this.b = locationShare;
        this.c = i;
        this.d = j;
        this.e = z;
        this.f = str;
        this.g = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LocationCollectionReason locationCollectionReason = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, locationCollectionReason, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.o(parcel, 3, this.c);
        arxc.q(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.v(parcel, 6, this.f, false);
        arxc.e(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
