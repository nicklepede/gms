package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class aw extends qmq implements ax {
    private final com.google.ads.mediation.a a;

    public aw(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.a = aVar;
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        fD(parcel);
        this.a.a.q(readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    public aw() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }
}
