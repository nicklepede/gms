package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class j extends qmp implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IAnningUserDataDeletionAttestationTokenCallback");
    }

    public final void a(int i, String str) {
        Parcel fE = fE();
        fE.writeInt(i);
        fE.writeString(str);
        fH(3, fE);
    }

    public final void b(AnningUserDataDeletionAttestationTokenParcel anningUserDataDeletionAttestationTokenParcel) {
        Parcel fE = fE();
        qmr.e(fE, anningUserDataDeletionAttestationTokenParcel);
        fH(2, fE);
    }
}
