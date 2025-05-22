package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class p extends qmp implements IInterface {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IPlayInstallReferrerAttestationTokenCallback");
    }

    public final void a(String str) {
        Parcel fE = fE();
        fE.writeInt(1);
        fE.writeString(str);
        fH(3, fE);
    }
}
