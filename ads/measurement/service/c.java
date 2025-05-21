package com.google.android.gms.ads.measurement.service;

import android.os.Bundle;
import android.os.Parcel;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public abstract class c extends otn implements d {
    public c() {
        super("com.google.android.gms.ads.measurement.service.IGmpConversionTrackingService");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) oto.a(parcel, Bundle.CREATOR);
        fq(parcel);
        a(bundle);
        parcel2.writeNoException();
        return true;
    }
}
