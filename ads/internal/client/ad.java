package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ad extends qmq implements ae {
    final /* synthetic */ ag a;

    public ad() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.ae
    public final void a(AdRequestParcel adRequestParcel) {
        c();
    }

    public final void c() {
        com.google.android.gms.ads.internal.util.client.h.f("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.f.a.post(new bt(this));
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            fD(parcel);
            c();
            parcel2.writeNoException();
        } else if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i == 3) {
            parcel2.writeNoException();
            int i2 = qmr.a;
            parcel2.writeInt(0);
        } else if (i == 4) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else {
            if (i != 5) {
                return false;
            }
            parcel.readInt();
            fD(parcel);
            c();
            parcel2.writeNoException();
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ag agVar) {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
        this.a = agVar;
    }
}
