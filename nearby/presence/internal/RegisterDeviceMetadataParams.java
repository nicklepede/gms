package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cnbu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class RegisterDeviceMetadataParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnbu();
    public atee a;
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
            if (atyq.b(this.a, registerDeviceMetadataParams.a) && atyq.b(this.b, registerDeviceMetadataParams.b) && Arrays.equals(this.c, registerDeviceMetadataParams.c)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public RegisterDeviceMetadataParams(IBinder iBinder, String str, byte[] bArr) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = atecVar;
        this.b = str;
        this.c = bArr;
    }
}
