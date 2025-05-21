package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfel;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetInternalNativeInitializationHandleParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfel();
    public final CustomerInfo a;
    public final boolean b;
    public final boolean c;

    public GetInternalNativeInitializationHandleParams(CustomerInfo customerInfo, boolean z, boolean z2) {
        this.a = customerInfo;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CustomerInfo customerInfo = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, customerInfo, i, false);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}
