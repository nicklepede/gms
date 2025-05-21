package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ad extends otn implements ae {
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

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            fq(parcel);
            c();
            parcel2.writeNoException();
        } else if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i == 3) {
            parcel2.writeNoException();
            int i2 = oto.a;
            parcel2.writeInt(0);
        } else if (i == 4) {
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else {
            if (i != 5) {
                return false;
            }
            parcel.readInt();
            fq(parcel);
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
