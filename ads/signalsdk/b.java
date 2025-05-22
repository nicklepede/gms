package com.google.android.gms.ads.signalsdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class b extends qmp implements IInterface {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    public final void a(int i) {
        Parcel fE = fE();
        fE.writeInt(i);
        fH(2, fE);
    }
}
