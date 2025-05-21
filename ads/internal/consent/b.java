package com.google.android.gms.ads.internal.consent;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bxhc;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends otn implements IInterface, bxhc {
    public b() {
        super("com.google.android.gms.ads.internal.consent.IConsentSdkService");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        a aVar;
        if (i != 3) {
            return false;
        }
        parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.consent.IConsentCallback");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder);
        }
        fq(parcel);
        Parcel fr = aVar.fr();
        fr.writeInt(4);
        aVar.fu(3, fr);
        return true;
    }
}
