package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhiu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RetrieveInAppPaymentCredentialRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dhiu();
    public final String a;
    public final String b;
    final TransactionData c;
    final byte[] d;
    final boolean e;
    final int f;

    public RetrieveInAppPaymentCredentialRequest(String str, String str2, TransactionData transactionData, byte[] bArr, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = transactionData;
        this.d = bArr;
        this.e = z;
        this.f = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.t(parcel, 4, this.c, i, false);
        atzr.i(parcel, 5, this.d, false);
        atzr.e(parcel, 6, this.e);
        atzr.o(parcel, 7, this.f);
        atzr.c(parcel, a);
    }
}
