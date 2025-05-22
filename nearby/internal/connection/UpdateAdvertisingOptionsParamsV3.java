package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmm;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UpdateAdvertisingOptionsParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmm();
    public clju a;
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
            if (atyq.b(this.a, updateAdvertisingOptionsParamsV3.a) && atyq.b(this.b, updateAdvertisingOptionsParamsV3.b) && atyq.b(this.c, updateAdvertisingOptionsParamsV3.c) && Arrays.equals(this.d, updateAdvertisingOptionsParamsV3.d) && atyq.b(this.e, updateAdvertisingOptionsParamsV3.e)) {
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
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public UpdateAdvertisingOptionsParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.AdvertisingOptions advertisingOptions, byte[] bArr, String str2) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = advertisingOptions;
        this.d = bArr;
        this.e = str2;
    }
}
