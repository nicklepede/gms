package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ai extends otm implements ak {
    public ai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    @Override // com.google.android.gms.ads.internal.client.ak
    public final IBinder newAdLoaderBuilder(azht azhtVar, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        fr.writeString(str);
        oto.g(fr, eVar);
        fr.writeInt(i);
        Parcel fs = fs(1, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }
}
