package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class bf {
    private final String a;

    public bf(be beVar) {
        String str;
        try {
            Parcel fF = beVar.fF(1, beVar.fE());
            str = fF.readString();
            fF.recycle();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
            str = null;
        }
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
