package com.google.android.gms.ads.nonagon.load.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import defpackage.eqfo;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m implements eqfo {
    final /* synthetic */ NonagonRequestParcel a;
    final /* synthetic */ com.google.android.gms.ads.internal.request.j b;

    public m(NonagonRequestParcel nonagonRequestParcel, com.google.android.gms.ads.internal.request.j jVar) {
        this.a = nonagonRequestParcel;
        this.b = jVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        try {
            com.google.android.gms.ads.internal.request.j jVar = this.b;
            ExceptionParcel a = ExceptionParcel.a(th);
            Parcel fE = jVar.fE();
            qmr.e(fE, a);
            jVar.fG(2, fE);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.config.p.P.g()).booleanValue()) {
                com.google.android.gms.ads.internal.request.j jVar = this.b;
                Parcel fE = jVar.fE();
                qmr.e(fE, parcelFileDescriptor);
                jVar.fG(1, fE);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.config.p.Q.g()).booleanValue() && (bundle = this.a.m) != null) {
                String str = com.google.android.gms.ads.nonagon.csi.a.BINDER_CALL_START.an;
                com.google.android.gms.ads.internal.c.j();
                bundle.putLong(str, System.currentTimeMillis());
            }
            com.google.android.gms.ads.internal.request.j jVar2 = this.b;
            NonagonRequestParcel nonagonRequestParcel = this.a;
            Parcel fE2 = jVar2.fE();
            qmr.e(fE2, parcelFileDescriptor);
            qmr.e(fE2, nonagonRequestParcel);
            jVar2.fG(3, fE2);
        } catch (RemoteException unused) {
        }
    }
}
