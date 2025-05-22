package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgjx;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PaymentGatewayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgjx();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public PaymentGatewayConfig(String str, int i, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PaymentGatewayConfig)) {
            return false;
        }
        PaymentGatewayConfig paymentGatewayConfig = (PaymentGatewayConfig) obj;
        return atyq.b(this.a, paymentGatewayConfig.a) && atyq.b(Integer.valueOf(this.b), Integer.valueOf(paymentGatewayConfig.b)) && atyq.b(this.c, paymentGatewayConfig.c) && atyq.b(this.d, paymentGatewayConfig.d) && atyq.b(this.e, paymentGatewayConfig.e) && atyq.b(this.f, paymentGatewayConfig.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("displayName", this.a, arrayList);
        atyp.b("type", Integer.valueOf(this.b), arrayList);
        atyp.b("paymentGatewayUrl", this.c, arrayList);
        atyp.b("purchaseStatusUrl", this.d, arrayList);
        atyp.b("description", this.e, arrayList);
        atyp.b("title", this.f, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}
