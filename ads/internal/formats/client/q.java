package com.google.android.gms.ads.internal.formats.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.qmq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class q extends qmq implements IInterface {
    final /* synthetic */ v a;

    public q() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        l lVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            lVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new l(readStrongBinder);
        }
        fD(parcel);
        v vVar = this.a;
        vVar.a.b.m(vVar.a(lVar));
        parcel2.writeNoException();
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(v vVar) {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        this.a = vVar;
    }
}
