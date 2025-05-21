package com.google.android.gms.ads.nonagon.load.service;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import com.google.android.gms.ads.internal.util.ExceptionParcel;
import defpackage.enrv;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class m implements enrv {
    final /* synthetic */ NonagonRequestParcel a;
    final /* synthetic */ com.google.android.gms.ads.internal.request.j b;

    public m(NonagonRequestParcel nonagonRequestParcel, com.google.android.gms.ads.internal.request.j jVar) {
        this.a = nonagonRequestParcel;
        this.b = jVar;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        try {
            com.google.android.gms.ads.internal.request.j jVar = this.b;
            ExceptionParcel a = ExceptionParcel.a(th);
            Parcel fr = jVar.fr();
            oto.e(fr, a);
            jVar.ft(2, fr);
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.enrv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.config.p.P.g()).booleanValue()) {
                com.google.android.gms.ads.internal.request.j jVar = this.b;
                Parcel fr = jVar.fr();
                oto.e(fr, parcelFileDescriptor);
                jVar.ft(1, fr);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.config.p.Q.g()).booleanValue() && (bundle = this.a.m) != null) {
                String str = com.google.android.gms.ads.nonagon.csi.a.BINDER_CALL_START.N;
                com.google.android.gms.ads.internal.c.j();
                bundle.putLong(str, System.currentTimeMillis());
            }
            com.google.android.gms.ads.internal.request.j jVar2 = this.b;
            NonagonRequestParcel nonagonRequestParcel = this.a;
            Parcel fr2 = jVar2.fr();
            oto.e(fr2, parcelFileDescriptor);
            oto.e(fr2, nonagonRequestParcel);
            jVar2.ft(3, fr2);
        } catch (RemoteException unused) {
        }
    }
}
