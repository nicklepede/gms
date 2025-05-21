package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dexq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RetrieveInAppPaymentCredentialRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dexq();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.t(parcel, 4, this.c, i, false);
        arxc.i(parcel, 5, this.d, false);
        arxc.e(parcel, 6, this.e);
        arxc.o(parcel, 7, this.f);
        arxc.c(parcel, a);
    }
}
