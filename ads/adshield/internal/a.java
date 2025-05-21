package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.Parcel;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a extends otm implements c {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public final IBinder newAdShieldClient(String str, azht azhtVar) {
        Parcel fr = fr();
        fr.writeString(str);
        oto.g(fr, azhtVar);
        Parcel fs = fs(1, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public final IBinder newAdShieldClientWithoutAdvertisingId(String str, azht azhtVar) {
        Parcel fr = fr();
        fr.writeString(str);
        oto.g(fr, azhtVar);
        Parcel fs = fs(2, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public final IBinder newUnifiedAdShieldClient(azht azhtVar, azht azhtVar2, byte[] bArr) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        oto.g(fr, azhtVar2);
        fr.writeByteArray(bArr);
        Parcel fs = fs(3, fr);
        IBinder readStrongBinder = fs.readStrongBinder();
        fs.recycle();
        return readStrongBinder;
    }
}
