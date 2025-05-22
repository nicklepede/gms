package com.google.android.gms.payse.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import defpackage.atzr;
import defpackage.cvro;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExecuteSdkOperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvro();
    public final Account a;
    public final int b;
    public final SecureElementStoredValue c;
    public final String d;
    final long e;

    public ExecuteSdkOperationRequest(Account account, int i, SecureElementStoredValue secureElementStoredValue, String str, long j) {
        this.b = i;
        this.c = secureElementStoredValue;
        this.a = account;
        this.d = str;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}
