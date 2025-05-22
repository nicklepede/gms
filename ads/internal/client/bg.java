package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class bg extends qmq implements IInterface {
    public bg() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            fD(parcel);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            int i2 = qmr.a;
            parcel2.writeInt(1);
        }
        return true;
    }
}
