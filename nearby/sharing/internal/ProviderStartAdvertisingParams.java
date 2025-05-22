package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfz;
import defpackage.cpgb;
import defpackage.cpji;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ProviderStartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpji();
    public String a;
    public cpgb b;

    public ProviderStartAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderStartAdvertisingParams) {
            ProviderStartAdvertisingParams providerStartAdvertisingParams = (ProviderStartAdvertisingParams) obj;
            if (atyq.b(this.a, providerStartAdvertisingParams.a) && atyq.b(this.b, providerStartAdvertisingParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.c(parcel, a);
    }

    public ProviderStartAdvertisingParams(String str, IBinder iBinder) {
        cpgb cpfzVar;
        if (iBinder == null) {
            cpfzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cpfzVar = queryLocalInterface instanceof cpgb ? (cpgb) queryLocalInterface : new cpfz(iBinder);
        }
        this.a = str;
        this.b = cpfzVar;
    }
}
