package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmuu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FastPairAccountKeyParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmuu();
    private final byte[] a;

    public FastPairAccountKeyParcelable(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, (byte[]) bArr.clone(), false);
        atzr.c(parcel, a);
    }
}
