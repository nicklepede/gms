package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class c extends qmq implements d {
    public c() {
        super("com.google.android.gms.ads.measurement.service.IGmpConversionTrackingService");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) qmr.a(parcel, Bundle.CREATOR);
        fD(parcel);
        a(bundle);
        parcel2.writeNoException();
        return true;
    }
}
