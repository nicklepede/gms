package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class bg extends otn implements IInterface {
    public bg() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            fq(parcel);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            int i2 = oto.a;
            parcel2.writeInt(1);
        }
        return true;
    }
}
