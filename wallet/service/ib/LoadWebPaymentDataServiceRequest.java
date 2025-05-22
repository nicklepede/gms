package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.WebPaymentDataRequest;
import defpackage.dljt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoadWebPaymentDataServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dljt();
    public final Bundle a;
    public final WebPaymentDataRequest b;

    public LoadWebPaymentDataServiceRequest(Bundle bundle, WebPaymentDataRequest webPaymentDataRequest) {
        this.a = bundle;
        this.b = webPaymentDataRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public LoadWebPaymentDataServiceRequest(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readBundle(classLoader);
        this.b = (WebPaymentDataRequest) parcel.readParcelable(classLoader);
    }
}
