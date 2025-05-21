package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.axlo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class Contents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new axlo();
    final ParcelFileDescriptor a;
    final int b;
    final int c;
    final DriveId d;
    final boolean e;
    final String f;

    public Contents(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, DriveId driveId, boolean z, String str) {
        this.a = parcelFileDescriptor;
        this.b = i;
        this.c = i2;
        this.d = driveId;
        this.e = z;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.o(parcel, 3, this.b);
        arxc.o(parcel, 4, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.e(parcel, 7, this.e);
        arxc.v(parcel, 8, this.f, false);
        arxc.c(parcel, a);
    }
}
