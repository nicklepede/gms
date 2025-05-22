package com.google.android.gms.auth.firstparty.shared;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adah;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adah();
    final int a;
    public boolean b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public final String i;

    public AccountCredentials(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
    }

    public final Account a() {
        if (TextUtils.isEmpty(this.c)) {
            return null;
        }
        return new Account(this.c, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.v(parcel, 7, this.g, false);
        atzr.v(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.c(parcel, a);
    }

    @Deprecated
    public AccountCredentials() {
        this("com.google");
    }

    public AccountCredentials(Account account) {
        this(account.type);
        this.c = account.name;
    }

    public AccountCredentials(String str) {
        this.a = 2;
        atzb.r(str, "Account type can't be empty.");
        this.i = str;
    }
}
