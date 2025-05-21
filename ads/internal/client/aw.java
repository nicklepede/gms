package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import defpackage.otn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class aw extends otn implements ax {
    private final com.google.ads.mediation.a a;

    public aw(com.google.ads.mediation.a aVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.a = aVar;
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        fq(parcel);
        this.a.a.q(readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    public aw() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }
}
