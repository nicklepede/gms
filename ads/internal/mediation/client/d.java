package com.google.android.gms.ads.internal.mediation.client;

import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class d extends qmq implements e {
    public d() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            fD(parcel);
            f d = d(readString);
            parcel2.writeNoException();
            qmr.g(parcel2, d);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            fD(parcel);
            boolean c = c(readString2);
            parcel2.writeNoException();
            int i2 = qmr.a;
            parcel2.writeInt(c ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            fD(parcel);
            com.google.android.gms.ads.internal.mediation.client.rtb.f e = e(readString3);
            parcel2.writeNoException();
            qmr.g(parcel2, e);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            fD(parcel);
            boolean a = a(readString4);
            parcel2.writeNoException();
            int i3 = qmr.a;
            parcel2.writeInt(a ? 1 : 0);
        }
        return true;
    }
}
