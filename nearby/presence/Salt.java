package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cmsx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class Salt extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmsx();
    private final byte[] a;

    public Salt(byte[] bArr) {
        atzb.c(bArr.length == 2, "the salt length is 2");
        this.a = bArr;
    }

    public final byte[] a() {
        return (byte[]) this.a.clone();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, a(), false);
        atzr.c(parcel, a);
    }
}
