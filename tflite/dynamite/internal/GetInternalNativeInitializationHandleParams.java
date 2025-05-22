package com.google.android.gms.tflite.dynamite.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dhpr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetInternalNativeInitializationHandleParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhpr();
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
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, customerInfo, i, false);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
