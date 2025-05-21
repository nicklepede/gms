package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ceaq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PaymentGatewayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceaq();
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
        return arwb.b(this.a, paymentGatewayConfig.a) && arwb.b(Integer.valueOf(this.b), Integer.valueOf(paymentGatewayConfig.b)) && arwb.b(this.c, paymentGatewayConfig.c) && arwb.b(this.d, paymentGatewayConfig.d) && arwb.b(this.e, paymentGatewayConfig.e) && arwb.b(this.f, paymentGatewayConfig.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("displayName", this.a, arrayList);
        arwa.b("type", Integer.valueOf(this.b), arrayList);
        arwa.b("paymentGatewayUrl", this.c, arrayList);
        arwa.b("purchaseStatusUrl", this.d, arrayList);
        arwa.b("description", this.e, arrayList);
        arwa.b("title", this.f, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }
}
