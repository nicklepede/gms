package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.bi;
import com.google.android.gms.ads.internal.client.bk;
import defpackage.qmp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class t extends qmp implements IInterface {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final bk a() {
        bk biVar;
        Parcel fF = fF(11, fE());
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            biVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            biVar = queryLocalInterface instanceof bk ? (bk) queryLocalInterface : new bi(readStrongBinder);
        }
        fF.recycle();
        return biVar;
    }

    public final a b() {
        a aVar;
        Parcel fF = fF(14, fE());
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder);
        }
        fF.recycle();
        return aVar;
    }
}
