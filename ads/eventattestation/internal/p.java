package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class p extends otm implements IInterface {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IPlayInstallReferrerAttestationTokenCallback");
    }

    public final void a(String str) {
        Parcel fr = fr();
        fr.writeInt(1);
        fr.writeString(str);
        fu(3, fr);
    }
}
