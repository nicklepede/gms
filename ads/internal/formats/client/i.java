package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class i extends otm implements k {
    public i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.google.android.gms.ads.internal.formats.client.k
    public final IBinder newNativeAdViewHolderDelegate(azht azhtVar, azht azhtVar2, azht azhtVar3) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        oto.g(fr, azhtVar2);
        oto.g(fr, azhtVar3);
        Parcel fs = fs(1, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }
}
