package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.internal.AdvertisingIdParcel;
import com.google.android.gms.common.api.Status;
import defpackage.bzoy;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e extends bzoy {
    private final int a;
    private final com.google.android.gms.ads.eventattestation.internal.i b;

    public e(int i, com.google.android.gms.ads.eventattestation.internal.i iVar) {
        super(216, "FetchAdvertisingId");
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.bzoy
    public final void f(Context context) {
        com.google.android.gms.ads.identifier.settings.b c = com.google.android.gms.ads.identifier.settings.b.c(context);
        int i = this.a;
        AdvertisingIdParcel advertisingIdParcel = new AdvertisingIdParcel(c.f(i), c.o(i));
        com.google.android.gms.ads.eventattestation.internal.i iVar = this.b;
        Parcel fE = iVar.fE();
        qmr.e(fE, advertisingIdParcel);
        iVar.fH(2, fE);
    }

    @Override // defpackage.bzoy
    public final void j(Status status) {
        com.google.android.gms.ads.eventattestation.internal.i iVar = this.b;
        Parcel fE = iVar.fE();
        fE.writeInt(1);
        fE.writeString(status.j);
        iVar.fH(3, fE);
    }
}
