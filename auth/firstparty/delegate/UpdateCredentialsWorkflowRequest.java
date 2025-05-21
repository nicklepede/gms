package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abad;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UpdateCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abad();
    final int a;

    @Deprecated
    String b;
    public AppDescription c;
    final Bundle d;
    public Account e;
    public AccountAuthenticatorResponse f;

    public UpdateCredentialsWorkflowRequest() {
        this.a = 3;
        this.d = new Bundle();
    }

    public final Bundle a() {
        return new Bundle(this.d);
    }

    public final void b(Account account) {
        this.b = account == null ? null : account.name;
        this.e = account;
    }

    public final void c(Bundle bundle) {
        Bundle bundle2 = this.d;
        bundle2.clear();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.g(parcel, 4, this.d, false);
        arxc.t(parcel, 5, this.e, i, false);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public UpdateCredentialsWorkflowRequest(int i, String str, AppDescription appDescription, Bundle bundle, Account account, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        this.b = str;
        this.c = appDescription;
        this.d = bundle;
        if (account != null || TextUtils.isEmpty(str)) {
            this.e = account;
        } else {
            this.e = new Account(str, "com.google");
        }
        this.f = accountAuthenticatorResponse;
    }
}
