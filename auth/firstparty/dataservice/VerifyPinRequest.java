package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazr;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class VerifyPinRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazr();
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
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.g(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
