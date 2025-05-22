package com.google.android.gms.fido.credentialstore;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdrr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class KeyMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bdrr();
    public final byte[] a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Bitmap e;

    public KeyMetadata(byte[] bArr, String str, String str2, boolean z, Bitmap bitmap) {
        boolean z2 = false;
        if (bArr != null && str != null && str2 != null) {
            z2 = true;
        }
        atzb.c(z2, "Parameters cannot be null");
        this.a = bArr;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.e(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.c(parcel, a);
    }
}
