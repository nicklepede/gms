package com.google.android.gms.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajls;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ParcelableDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajls();
    public final byte[] a;

    public ParcelableDevice(byte[] bArr) {
        atzb.s(bArr);
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.c(parcel, a);
    }
}
