package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbsx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ReadDeviceLevelSettingsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbsx();
    public final byte[] a;

    public ReadDeviceLevelSettingsResult(byte[] bArr) {
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
