package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dgvc;
import defpackage.dgvn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DeviceDataUploadOptInFlags extends AbstractSafeParcelable implements dgvn {
    public static final Parcelable.Creator CREATOR = new dgvc();
    public final boolean a;
    public final boolean b;

    public DeviceDataUploadOptInFlags(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.dgvn
    public final boolean b() {
        return this.a;
    }

    @Override // defpackage.dgvn
    public final boolean jU() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 2, z);
        arxc.e(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}
