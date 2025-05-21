package com.google.android.gms.payse.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import defpackage.arxc;
import defpackage.ctii;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ExecuteSdkOperationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctii();
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
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}
