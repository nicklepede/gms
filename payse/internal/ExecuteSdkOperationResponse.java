package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.TransactionInfo;
import defpackage.arwa;
import defpackage.arxc;
import defpackage.ctij;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ExecuteSdkOperationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctij();
    final TransactionInfo a;
    public final SecureElementStoredValue b;
    public final String c;
    public final String d;

    public ExecuteSdkOperationResponse(TransactionInfo transactionInfo, SecureElementStoredValue secureElementStoredValue, String str, String str2) {
        this.a = transactionInfo;
        this.b = secureElementStoredValue;
        this.c = str;
        this.d = str2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("storedValue", this.b, arrayList);
        arwa.b("errorCode", this.c, arrayList);
        arwa.b("errorMessage", this.d, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}
