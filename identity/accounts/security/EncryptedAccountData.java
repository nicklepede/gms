package com.google.android.gms.identity.accounts.security;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.blzt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class EncryptedAccountData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new blzt();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public EncryptedAccountData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        arwm.c(bArr.length > 0, "Encrypted bytes must not be empty.");
        arwm.c(bArr2.length > 0, "IV bytes must not be empty.");
        arwm.c(bArr3.length > 0, "MAC bytes must not be empty.");
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }
}
