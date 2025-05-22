package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkqf;
import defpackage.dkqg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WebPaymentDataRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkqg();
    public Cart a;
    public String b;
    public String c;
    public byte[] d;
    public boolean e;
    public Bundle f;

    private WebPaymentDataRequest() {
    }

    public static dkqf a() {
        dkqf dkqfVar = new dkqf(new WebPaymentDataRequest());
        dkqfVar.c(false);
        return dkqfVar;
    }

    public final Boolean b() {
        return Boolean.valueOf(this.e);
    }

    public final byte[] c() {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        return bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, this.a, i, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.v(parcel, 4, this.c, false);
        atzr.g(parcel, 5, this.f, false);
        atzr.i(parcel, 6, this.d, false);
        atzr.e(parcel, 7, this.e);
        atzr.c(parcel, a);
    }

    public WebPaymentDataRequest(Cart cart, String str, String str2, byte[] bArr, boolean z, Bundle bundle) {
        this.a = cart;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = z;
        this.f = bundle;
    }
}
