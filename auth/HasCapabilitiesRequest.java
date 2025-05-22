package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.wkj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class HasCapabilitiesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new wkj();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, account, i, false);
        atzr.w(parcel, 2, this.b, false);
        atzr.g(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public HasCapabilitiesRequest(Account account, String[] strArr) {
        this(account, strArr, null);
    }
}
