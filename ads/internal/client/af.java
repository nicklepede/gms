package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class af extends otm implements ah {
    public af(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final ae a() {
        ae acVar;
        Parcel fs = fs(1, fr());
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            acVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            acVar = queryLocalInterface instanceof ae ? (ae) queryLocalInterface : new ac(readStrongBinder);
        }
        fs.recycle();
        return acVar;
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void b(aa aaVar) {
        Parcel fr = fr();
        oto.g(fr, aaVar);
        ft(2, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void c(NativeAdOptionsParcel nativeAdOptionsParcel) {
        Parcel fr = fr();
        oto.e(fr, nativeAdOptionsParcel);
        ft(6, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void d(String str, com.google.android.gms.ads.internal.formats.client.q qVar, com.google.android.gms.ads.internal.formats.client.p pVar) {
        Parcel fr = fr();
        fr.writeString(str);
        oto.g(fr, qVar);
        oto.g(fr, pVar);
        ft(5, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void e(com.google.android.gms.ads.internal.formats.client.s sVar) {
        Parcel fr = fr();
        oto.g(fr, sVar);
        ft(10, fr);
    }
}
