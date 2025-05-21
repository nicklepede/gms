package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.dies;
import defpackage.diet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class WebPaymentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new diet();
    public String a;
    public Bundle b;

    private WebPaymentData() {
    }

    public static dies a() {
        return new dies(new WebPaymentData());
    }

    public static WebPaymentData b(Intent intent) {
        return (WebPaymentData) arxd.b(intent, "com.google.android.gms.wallet.WebPaymentData", CREATOR);
    }

    public static void c(Intent intent, WebPaymentData webPaymentData) {
        arxd.l(webPaymentData, intent, "com.google.android.gms.wallet.WebPaymentData");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.g(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }
}
