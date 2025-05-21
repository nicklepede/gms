package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.bi;
import com.google.android.gms.ads.internal.client.bk;
import defpackage.otm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class t extends otm implements IInterface {
    public t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final bk a() {
        bk biVar;
        Parcel fs = fs(11, fr());
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            biVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            biVar = queryLocalInterface instanceof bk ? (bk) queryLocalInterface : new bi(readStrongBinder);
        }
        fs.recycle();
        return biVar;
    }

    public final a b() {
        a aVar;
        Parcel fs = fs(14, fr());
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder);
        }
        fs.recycle();
        return aVar;
    }
}
