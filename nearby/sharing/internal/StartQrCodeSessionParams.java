package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cmww;
import defpackage.cmwy;
import defpackage.cnby;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class StartQrCodeSessionParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cnby();
    public cmwy a;
    public byte[] b;

    public StartQrCodeSessionParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartQrCodeSessionParams) {
            StartQrCodeSessionParams startQrCodeSessionParams = (StartQrCodeSessionParams) obj;
            if (arwb.b(this.a, startQrCodeSessionParams.a) && this.b == startQrCodeSessionParams.b) {
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
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }

    public StartQrCodeSessionParams(IBinder iBinder, byte[] bArr) {
        cmwy cmwwVar;
        if (iBinder == null) {
            cmwwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IQrCodeMetadataResultListener");
            cmwwVar = queryLocalInterface instanceof cmwy ? (cmwy) queryLocalInterface : new cmww(iBinder);
        }
        this.a = cmwwVar;
        this.b = bArr;
    }
}
