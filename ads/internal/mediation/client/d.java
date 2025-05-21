package com.google.android.gms.ads.internal.mediation.client;

import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class d extends otn implements e {
    public d() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            String readString = parcel.readString();
            fq(parcel);
            f d = d(readString);
            parcel2.writeNoException();
            oto.g(parcel2, d);
        } else if (i == 2) {
            String readString2 = parcel.readString();
            fq(parcel);
            boolean c = c(readString2);
            parcel2.writeNoException();
            int i2 = oto.a;
            parcel2.writeInt(c ? 1 : 0);
        } else if (i == 3) {
            String readString3 = parcel.readString();
            fq(parcel);
            com.google.android.gms.ads.internal.mediation.client.rtb.f e = e(readString3);
            parcel2.writeNoException();
            oto.g(parcel2, e);
        } else {
            if (i != 4) {
                return false;
            }
            String readString4 = parcel.readString();
            fq(parcel);
            boolean a = a(readString4);
            parcel2.writeNoException();
            int i3 = oto.a;
            parcel2.writeInt(a ? 1 : 0);
        }
        return true;
    }
}
