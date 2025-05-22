package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhiv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RetrieveInAppPaymentCredentialResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dhiv();
    public final String a;
    final byte[] b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public RetrieveInAppPaymentCredentialResponse(String str, byte[] bArr, int i, int i2, String str2, String str3) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = str2;
        this.f = str3;
    }

    public final byte[] a() {
        byte[] bArr = this.b;
        return bArr == null ? new byte[0] : bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.i(parcel, 3, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.o(parcel, 5, this.d);
        atzr.v(parcel, 6, this.e, false);
        atzr.v(parcel, 7, this.f, false);
        atzr.c(parcel, a);
    }

    public RetrieveInAppPaymentCredentialResponse(String str, byte[] bArr, int i, int i2, String str2) {
        this(str, bArr, i, i2, str2, null);
    }
}
