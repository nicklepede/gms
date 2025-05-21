package com.google.android.gms.auth.firstparty.shared;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abah;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountCredentials extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abah();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.v(parcel, 7, this.g, false);
        arxc.v(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.c(parcel, a);
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
        arwm.r(str, "Account type can't be empty.");
        this.i = str;
    }
}
