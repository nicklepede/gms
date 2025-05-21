package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmxr;
import defpackage.cmxt;
import defpackage.cnba;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ProviderStartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnba();
    public String a;
    public cmxt b;

    public ProviderStartAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProviderStartAdvertisingParams) {
            ProviderStartAdvertisingParams providerStartAdvertisingParams = (ProviderStartAdvertisingParams) obj;
            if (arwb.b(this.a, providerStartAdvertisingParams.a) && arwb.b(this.b, providerStartAdvertisingParams.b)) {
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.c(parcel, a);
    }

    public ProviderStartAdvertisingParams(String str, IBinder iBinder) {
        cmxt cmxrVar;
        if (iBinder == null) {
            cmxrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.ITransferUpdateCallback");
            cmxrVar = queryLocalInterface instanceof cmxt ? (cmxt) queryLocalInterface : new cmxr(iBinder);
        }
        this.a = str;
        this.b = cmxrVar;
    }
}
