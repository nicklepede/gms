package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acxu;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountRemovalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acxu();
    final int a;

    @Deprecated
    String b;
    public Account c;

    public AccountRemovalRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }

    public AccountRemovalRequest(int i, String str, Account account) {
        this.a = i;
        this.b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.c = account;
        } else {
            this.c = new Account(str, "com.google");
        }
    }
}
