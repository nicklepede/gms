package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazu;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountRemovalAllowedWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazu();
    public final AccountAuthenticatorResponse a;
    public final Account b;
    public final boolean c;

    public AccountRemovalAllowedWorkflowRequest(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, boolean z) {
        arwm.t(account, "account cannot be null");
        this.b = account;
        arwm.t(accountAuthenticatorResponse, "amResponse cannot be null");
        this.a = accountAuthenticatorResponse;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
