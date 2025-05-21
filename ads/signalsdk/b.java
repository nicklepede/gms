package com.google.android.gms.ads.signalsdk;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends otm implements IInterface {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkCallback");
    }

    public final void a(int i) {
        Parcel fr = fr();
        fr.writeInt(i);
        fu(2, fr);
    }
}
