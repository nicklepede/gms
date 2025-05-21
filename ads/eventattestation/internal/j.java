package com.google.android.gms.ads.eventattestation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class j extends otm implements IInterface {
    public j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.eventattestation.internal.IAnningUserDataDeletionAttestationTokenCallback");
    }

    public final void a(int i, String str) {
        Parcel fr = fr();
        fr.writeInt(i);
        fr.writeString(str);
        fu(3, fr);
    }

    public final void b(AnningUserDataDeletionAttestationTokenParcel anningUserDataDeletionAttestationTokenParcel) {
        Parcel fr = fr();
        oto.e(fr, anningUserDataDeletionAttestationTokenParcel);
        fu(2, fr);
    }
}
