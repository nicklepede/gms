package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.uok;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new uok();
    public final Account a;
    public final String[] b;
    public Bundle c;

    public HasCapabilitiesRequest(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.b = strArr;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, account, i, false);
        arxc.w(parcel, 2, this.b, false);
        arxc.g(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public HasCapabilitiesRequest(Account account, String[] strArr) {
        this(account, strArr, null);
    }
}
