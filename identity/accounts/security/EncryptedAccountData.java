package com.google.android.gms.identity.accounts.security;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bogl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class EncryptedAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bogl();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public EncryptedAccountData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        atzb.c(bArr.length > 0, "Encrypted bytes must not be empty.");
        atzb.c(bArr2.length > 0, "IV bytes must not be empty.");
        atzb.c(bArr3.length > 0, "MAC bytes must not be empty.");
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }
}
