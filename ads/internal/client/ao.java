package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ao extends otm implements aq {
    public ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    @Override // com.google.android.gms.ads.internal.client.aq
    public final IBinder newAdManager(azht azhtVar, AdSizeParcel adSizeParcel, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        oto.e(fr, adSizeParcel);
        fr.writeString(str);
        oto.g(fr, eVar);
        fr.writeInt(i);
        Parcel fs = fs(1, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.ads.internal.client.aq
    public final IBinder newAdManagerByType(azht azhtVar, AdSizeParcel adSizeParcel, String str, com.google.android.gms.ads.internal.mediation.client.e eVar, int i, int i2) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        oto.e(fr, adSizeParcel);
        fr.writeString(str);
        oto.g(fr, eVar);
        fr.writeInt(i);
        fr.writeInt(i2);
        Parcel fs = fs(2, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }
}
