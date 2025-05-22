package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.djgi;
import defpackage.djgt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DeviceDataUploadOptInFlags extends AbstractSafeParcelable implements djgt {
    public static final Parcelable.Creator CREATOR = new djgi();
    public final boolean a;
    public final boolean b;

    public DeviceDataUploadOptInFlags(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.djgt
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.djgt
    public final boolean kj() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 2, z);
        atzr.e(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}
