package com.google.android.gms.ads.signalsdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.eqfo;
import defpackage.qmr;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class m implements eqfo {
    final /* synthetic */ b a;

    public m(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        int i;
        if (th instanceof TimeoutException) {
            i = 4;
        } else {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("signal sdk error", th);
            i = 5;
        }
        try {
            this.a.a(i);
        } catch (RemoteException e) {
            int i3 = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        try {
            b bVar = this.a;
            Parcel fE = bVar.fE();
            qmr.e(fE, bundle);
            bVar.fH(1, fE);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("#007 Could not call remote method.", e);
        }
    }
}
