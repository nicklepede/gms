package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaxu;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountRemovalRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaxu();
    final int a;

    @Deprecated
    String b;
    public Account c;

    public AccountRemovalRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
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
