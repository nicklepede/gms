package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ac extends otm implements ae {
    public ac(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.ae
    public final void a(AdRequestParcel adRequestParcel) {
        Parcel fr = fr();
        oto.e(fr, adRequestParcel);
        ft(1, fr);
    }
}
