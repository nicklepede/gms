package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import defpackage.dlju;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoadWebPaymentDataServiceResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dlju();
    public final Bundle a;
    public final WebPaymentData b;
    public final Status c;

    public LoadWebPaymentDataServiceResponse(Bundle bundle, WebPaymentData webPaymentData, Status status) {
        this.a = bundle;
        this.b = webPaymentData;
        this.c = status;
    }

    @Override // defpackage.dlpo
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
