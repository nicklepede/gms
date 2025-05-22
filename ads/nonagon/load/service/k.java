package com.google.android.gms.ads.nonagon.load.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.DecagonRequestParcel;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import defpackage.eqfo;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class k implements eqfo {
    final /* synthetic */ DecagonRequestParcel a;
    final /* synthetic */ com.google.android.gms.ads.internal.request.k b;

    public k(com.google.android.gms.ads.internal.request.k kVar, DecagonRequestParcel decagonRequestParcel) {
        this.b = kVar;
        this.a = decagonRequestParcel;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        try {
            com.google.android.gms.ads.internal.request.k kVar = this.b;
            ExceptionParcel a = ExceptionParcel.a(th);
            Parcel fE = kVar.fE();
            qmr.e(fE, a);
            kVar.fG(2, fE);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        try {
            this.b.a((String) obj, this.a);
        } catch (RemoteException unused) {
        }
    }
}
