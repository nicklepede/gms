package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dieu;
import defpackage.diev;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new diev();
    public Cart a;
    public String b;
    public String c;
    public byte[] d;
    public Bundle e;

    private WebPaymentDataRequest() {
    }

    public static dieu a() {
        return new dieu(new WebPaymentDataRequest());
    }

    public final byte[] b() {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.v(parcel, 4, this.c, false);
        arxc.g(parcel, 5, this.e, false);
        arxc.i(parcel, 6, this.d, false);
        arxc.c(parcel, a);
    }

    public WebPaymentDataRequest(Cart cart, String str, String str2, byte[] bArr, Bundle bundle) {
        this.a = cart;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = bundle;
    }
}
