package com.google.android.gms.ads.identifier.service;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.eventattestation.internal.AdvertisingIdParcel;
import com.google.android.gms.common.api.Status;
import defpackage.bxgi;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e extends bxgi {
    private final int a;
    private final com.google.android.gms.ads.eventattestation.internal.i b;

    public e(int i, com.google.android.gms.ads.eventattestation.internal.i iVar) {
        super(216, "FetchAdvertisingId");
        this.a = i;
        this.b = iVar;
    }

    @Override // defpackage.bxgi
    public final void f(Context context) {
        com.google.android.gms.ads.identifier.settings.b c = com.google.android.gms.ads.identifier.settings.b.c(context);
        int i = this.a;
        AdvertisingIdParcel advertisingIdParcel = new AdvertisingIdParcel(c.f(i), c.o(i));
        com.google.android.gms.ads.eventattestation.internal.i iVar = this.b;
        Parcel fr = iVar.fr();
        oto.e(fr, advertisingIdParcel);
        iVar.fu(2, fr);
    }

    @Override // defpackage.bxgi
    public final void j(Status status) {
        com.google.android.gms.ads.eventattestation.internal.i iVar = this.b;
        Parcel fr = iVar.fr();
        fr.writeInt(1);
        fr.writeString(status.j);
        iVar.fu(3, fr);
    }
}
