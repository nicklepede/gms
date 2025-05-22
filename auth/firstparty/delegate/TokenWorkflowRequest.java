package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adac;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TokenWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new adac();
    public String a;

    @Deprecated
    public String b;
    final Bundle c;
    FACLConfig d;
    public PACLConfig e;
    public boolean f;
    public AppDescription g;
    public Account h;
    public AccountAuthenticatorResponse i;
    public boolean j;

    public TokenWorkflowRequest() {
        this.j = true;
        this.c = new Bundle();
    }

    public final Bundle a() {
        return new Bundle(this.c);
    }

    public final void b(Account account) {
        this.b = account == null ? null : account.name;
        this.h = account;
    }

    public final void c() {
        this.d = null;
    }

    public final void d(Bundle bundle) {
        Bundle bundle2 = this.c;
        bundle2.clear();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.g(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.e(parcel, 7, this.f);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.t(parcel, 10, this.i, i, false);
        atzr.e(parcel, 11, this.j);
        atzr.c(parcel, a);
    }

    public TokenWorkflowRequest(String str, String str2, Bundle bundle, FACLConfig fACLConfig, PACLConfig pACLConfig, boolean z, AppDescription appDescription, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z2) {
        this.j = true;
        this.a = str;
        this.b = str2;
        this.c = bundle;
        this.d = fACLConfig;
        this.e = pACLConfig;
        this.f = z;
        this.g = appDescription;
        if (account != null || TextUtils.isEmpty(str2)) {
            this.h = account;
        } else {
            this.h = new Account(str2, "com.google");
        }
        this.i = accountAuthenticatorResponse;
        this.j = z2;
    }
}
