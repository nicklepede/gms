package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;
import defpackage.uyo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ba extends qmq implements IInterface {
    private final uyo a;

    public ba(uyo uyoVar) {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
        this.a = uyoVar;
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            AdErrorParcel adErrorParcel = (AdErrorParcel) qmr.a(parcel, AdErrorParcel.CREATOR);
            fD(parcel);
            if (this.a != null) {
                adErrorParcel.a();
            }
        } else if (i == 2) {
            uyo uyoVar = this.a;
            if (uyoVar != null) {
                uyoVar.a.o();
            }
        } else if (i == 3) {
            uyo uyoVar2 = this.a;
            if (uyoVar2 != null) {
                uyoVar2.a.e();
            }
        } else if (i != 4 && i != 5) {
            return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public ba() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }
}
