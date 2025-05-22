package com.google.android.gms.auth.cryptauth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acqi;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PlainText extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acqi();
    final int a;
    public final byte[] b;
    public final byte[] c;
    public final Account d;

    public PlainText(int i, byte[] bArr, byte[] bArr2, Account account) {
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
        this.d = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public PlainText(byte[] bArr, byte[] bArr2, Account account) {
        this(1, bArr, bArr2, account);
    }
}
