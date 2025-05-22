package com.google.android.gms.payse.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.payse.SecureElementStoredValue;
import com.google.android.gms.payse.TransactionInfo;
import defpackage.atyp;
import defpackage.atzr;
import defpackage.cvrp;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ExecuteSdkOperationResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cvrp();
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
        atyp.b("storedValue", this.b, arrayList);
        atyp.b("errorCode", this.c, arrayList);
        atyp.b("errorMessage", this.d, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}
