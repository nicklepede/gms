package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cktp;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class RegisterDeviceMetadataParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cktp();
    public arbp a;
    public String b;
    public byte[] c;

    private RegisterDeviceMetadataParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RegisterDeviceMetadataParams) {
            RegisterDeviceMetadataParams registerDeviceMetadataParams = (RegisterDeviceMetadataParams) obj;
            if (arwb.b(this.a, registerDeviceMetadataParams.a) && arwb.b(this.b, registerDeviceMetadataParams.b) && Arrays.equals(this.c, registerDeviceMetadataParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.c(parcel, a);
    }

    public RegisterDeviceMetadataParams(IBinder iBinder, String str, byte[] bArr) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = arbnVar;
        this.b = str;
        this.c = bArr;
    }
}
