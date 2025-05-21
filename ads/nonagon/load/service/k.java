package com.google.android.gms.ads.nonagon.load.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.DecagonRequestParcel;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import defpackage.enrv;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class k implements enrv {
    final /* synthetic */ DecagonRequestParcel a;
    final /* synthetic */ com.google.android.gms.ads.internal.request.k b;

    public k(com.google.android.gms.ads.internal.request.k kVar, DecagonRequestParcel decagonRequestParcel) {
        this.b = kVar;
        this.a = decagonRequestParcel;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        try {
            com.google.android.gms.ads.internal.request.k kVar = this.b;
            ExceptionParcel a = ExceptionParcel.a(th);
            Parcel fr = kVar.fr();
            oto.e(fr, a);
            kVar.ft(2, fr);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.enrv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.b.a((String) obj, this.a);
        } catch (RemoteException unused) {
        }
    }
}
