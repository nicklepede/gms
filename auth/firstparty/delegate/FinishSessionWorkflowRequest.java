package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aczw;
import defpackage.atzb;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FinishSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aczw();
    public final int a;
    public final AppDescription b;
    public final String c;
    public AccountAuthenticatorResponse d;
    private final Bundle e;

    public FinishSessionWorkflowRequest(int i, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse) {
        this.a = i;
        atzb.t(bundle, "sessionBundle cannot be null");
        this.e = bundle;
        atzb.t(appDescription, "callingAppDescription cannot be null");
        this.b = appDescription;
        atzb.r(str, "accountType must be provided");
        this.c = str;
        this.d = accountAuthenticatorResponse;
    }

    public final Bundle a() {
        return new Bundle(this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.g(parcel, 2, a(), false);
        atzr.t(parcel, 3, this.b, i, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.c(parcel, a);
    }
}
