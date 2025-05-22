package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acxs;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountNameCheckRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acxs();
    final int a;

    @Deprecated
    String b;
    public String c;
    public String d;
    public AppDescription e;
    public CaptchaSolution f;
    public Account g;

    public AccountNameCheckRequest() {
        this.a = 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.t(parcel, 7, this.g, i, false);
        atzr.c(parcel, a);
    }

    public AccountNameCheckRequest(int i, String str, String str2, String str3, AppDescription appDescription, CaptchaSolution captchaSolution, Account account) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = appDescription;
        this.f = captchaSolution;
        if (account != null || TextUtils.isEmpty(str)) {
            this.g = account;
        } else {
            this.g = new Account(str, "com.google");
        }
    }
}
