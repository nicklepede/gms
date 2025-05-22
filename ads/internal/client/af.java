package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class af extends qmp implements ah {
    public af(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final ae a() {
        ae acVar;
        Parcel fF = fF(1, fE());
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            acVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            acVar = queryLocalInterface instanceof ae ? (ae) queryLocalInterface : new ac(readStrongBinder);
        }
        fF.recycle();
        return acVar;
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void b(aa aaVar) {
        Parcel fE = fE();
        qmr.g(fE, aaVar);
        fG(2, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void c(NativeAdOptionsParcel nativeAdOptionsParcel) {
        Parcel fE = fE();
        qmr.e(fE, nativeAdOptionsParcel);
        fG(6, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void d(String str, com.google.android.gms.ads.internal.formats.client.q qVar, com.google.android.gms.ads.internal.formats.client.p pVar) {
        Parcel fE = fE();
        fE.writeString(str);
        qmr.g(fE, qVar);
        qmr.g(fE, pVar);
        fG(5, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void e(com.google.android.gms.ads.internal.formats.client.s sVar) {
        Parcel fE = fE();
        qmr.g(fE, sVar);
        fG(10, fE);
    }
}
