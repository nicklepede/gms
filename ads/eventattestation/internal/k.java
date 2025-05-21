package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class k extends otm implements IInterface {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IClickAttestationTokenCallback");
    }

    public final void a(int i, String str) {
        Parcel fr = fr();
        fr.writeInt(i);
        fr.writeString(str);
        fu(3, fr);
    }
}
