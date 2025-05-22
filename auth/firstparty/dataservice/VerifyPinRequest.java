package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczr;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class VerifyPinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aczr();
    final int a;

    @Deprecated
    public final String b;
    public final String c;
    public final Account d;
    public final String e;
    public final Bundle f;

    public VerifyPinRequest(int i, String str, String str2, Account account, String str3, Bundle bundle) {
        this.a = i;
        this.c = str2;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
        this.b = this.d.name;
        this.e = str3;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.g(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}
