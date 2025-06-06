package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.adad;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateCredentialsWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new adad();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.g(parcel, 4, this.d, false);
        atzr.t(parcel, 5, this.e, i, false);
        atzr.t(parcel, 6, this.f, i, false);
        atzr.c(parcel, a);
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
