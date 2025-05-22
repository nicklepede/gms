package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cpfe;
import defpackage.cpfg;
import defpackage.cpkg;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StartQrCodeSessionParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cpkg();
    public cpfg a;
    public byte[] b;

    public StartQrCodeSessionParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartQrCodeSessionParams) {
            StartQrCodeSessionParams startQrCodeSessionParams = (StartQrCodeSessionParams) obj;
            if (atyq.b(this.a, startQrCodeSessionParams.a) && this.b == startQrCodeSessionParams.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.i(parcel, 2, this.b, false);
        atzr.c(parcel, a);
    }

    public StartQrCodeSessionParams(IBinder iBinder, byte[] bArr) {
        cpfg cpfeVar;
        if (iBinder == null) {
            cpfeVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IQrCodeMetadataResultListener");
            cpfeVar = queryLocalInterface instanceof cpfg ? (cpfg) queryLocalInterface : new cpfe(iBinder);
        }
        this.a = cpfeVar;
        this.b = bArr;
    }
}
