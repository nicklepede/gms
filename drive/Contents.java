package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.azpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class Contents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new azpo();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.o(parcel, 3, this.b);
        atzr.o(parcel, 4, this.c);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.e(parcel, 7, this.e);
        atzr.v(parcel, 8, this.f, false);
        atzr.c(parcel, a);
    }
}
