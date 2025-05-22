package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adob;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class FrpUnlockRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adob();
    public final String a;
    public final Account b;
    public final boolean c;

    public FrpUnlockRequest(String str, Account account, boolean z) {
        this.a = str;
        this.b = account;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
