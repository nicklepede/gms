package com.google.android.gms.ads.signalsdk;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.enrv;
import defpackage.oto;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class n implements enrv {
    final /* synthetic */ a a;

    public n(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.enrv
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

    @Override // defpackage.enrv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        try {
            a aVar = this.a;
            NetworkRequestResponse networkRequestResponse = new NetworkRequestResponse(str);
            Parcel fr = aVar.fr();
            oto.e(fr, networkRequestResponse);
            aVar.fu(1, fr);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.h("#007 Could not call remote method.", e);
        }
    }
}
