package com.google.android.gms.ads.internal.reward.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.mediation.client.e;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a extends otm implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
    }

    @Override // com.google.android.gms.ads.internal.reward.client.c
    public final IBinder newRewardedVideoAd(azht azhtVar, e eVar, int i) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        oto.g(fr, eVar);
        fr.writeInt(i);
        Parcel fs = fs(1, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }
}
