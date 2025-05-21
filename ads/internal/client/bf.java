package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bf {
    private final String a;

    public bf(be beVar) {
        String str;
        try {
            Parcel fs = beVar.fs(1, beVar.fr());
            str = fs.readString();
            fs.recycle();
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
