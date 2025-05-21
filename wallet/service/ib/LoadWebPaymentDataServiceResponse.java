package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import defpackage.diyb;
import defpackage.djdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoadWebPaymentDataServiceResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new diyb();
    public final Bundle a;
    public final WebPaymentData b;
    public final Status c;

    public LoadWebPaymentDataServiceResponse(Bundle bundle, WebPaymentData webPaymentData, Status status) {
        this.a = bundle;
        this.b = webPaymentData;
        this.c = status;
    }

    @Override // defpackage.djdv
    public final boolean a() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public LoadWebPaymentDataServiceResponse(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readBundle(classLoader);
        this.b = (WebPaymentData) parcel.readParcelable(classLoader);
        this.c = (Status) parcel.readParcelable(classLoader);
    }
}
