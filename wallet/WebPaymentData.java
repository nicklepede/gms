package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.dkqd;
import defpackage.dkqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class WebPaymentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dkqe();
    public String a;
    public Bundle b;

    private WebPaymentData() {
    }

    public static dkqd a() {
        return new dkqd(new WebPaymentData());
    }

    public static WebPaymentData b(Intent intent) {
        return (WebPaymentData) atzs.b(intent, "com.google.android.gms.wallet.WebPaymentData", CREATOR);
    }

    public static void c(Intent intent, WebPaymentData webPaymentData) {
        atzs.l(webPaymentData, intent, "com.google.android.gms.wallet.WebPaymentData");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, this.a, false);
        atzr.g(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}
