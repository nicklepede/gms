package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aazw;
import defpackage.arwm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FinishSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aazw();
    public final int a;
    public final AppDescription b;
    public final String c;
    public AccountAuthenticatorResponse d;
    private final Bundle e;

    public FinishSessionWorkflowRequest(int i, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        arwm.t(bundle, "sessionBundle cannot be null");
        this.e = bundle;
        arwm.t(appDescription, "callingAppDescription cannot be null");
        this.b = appDescription;
        arwm.r(str, "accountType must be provided");
        this.c = str;
        this.d = accountAuthenticatorResponse;
    }

    public final Bundle a() {
        return new Bundle(this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.g(parcel, 2, a(), false);
        arxc.t(parcel, 3, this.b, i, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }
}
