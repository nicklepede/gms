package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjeh;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UpdateAdvertisingOptionsParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjeh();
    public cjbp a;
    public String b;
    public com.google.android.gms.nearby.connection.v3.AdvertisingOptions c;
    public byte[] d;
    public String e;

    private UpdateAdvertisingOptionsParamsV3() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateAdvertisingOptionsParamsV3) {
            UpdateAdvertisingOptionsParamsV3 updateAdvertisingOptionsParamsV3 = (UpdateAdvertisingOptionsParamsV3) obj;
            if (arwb.b(this.a, updateAdvertisingOptionsParamsV3.a) && arwb.b(this.b, updateAdvertisingOptionsParamsV3.b) && arwb.b(this.c, updateAdvertisingOptionsParamsV3.c) && Arrays.equals(this.d, updateAdvertisingOptionsParamsV3.d) && arwb.b(this.e, updateAdvertisingOptionsParamsV3.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public UpdateAdvertisingOptionsParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.AdvertisingOptions advertisingOptions, byte[] bArr, String str2) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = str;
        this.c = advertisingOptions;
        this.d = bArr;
        this.e = str2;
    }
}
