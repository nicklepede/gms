package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class al extends qmp implements an {
    public al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final AdSizeParcel a() {
        Parcel fF = fF(12, fE());
        AdSizeParcel adSizeParcel = (AdSizeParcel) qmr.a(fF, AdSizeParcel.CREATOR);
        fF.recycle();
        return adSizeParcel;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final bk b() {
        bk biVar;
        Parcel fF = fF(26, fE());
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            biVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            biVar = queryLocalInterface instanceof bk ? (bk) queryLocalInterface : new bi(readStrongBinder);
        }
        fF.recycle();
        return biVar;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final bblp c() {
        bblp bblnVar;
        Parcel fF = fF(1, fE());
        IBinder readStrongBinder = fF.readStrongBinder();
        if (readStrongBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
        }
        fF.recycle();
        return bblnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void d() {
        fG(2, fE());
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void e() {
        fG(5, fE());
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void f() {
        fG(6, fE());
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void g(aa aaVar) {
        Parcel fE = fE();
        qmr.g(fE, aaVar);
        fG(7, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void h(AdSizeParcel adSizeParcel) {
        Parcel fE = fE();
        qmr.e(fE, adSizeParcel);
        fG(13, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void m(ax axVar) {
        Parcel fE = fE();
        qmr.g(fE, axVar);
        fG(8, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void n(boolean z) {
        Parcel fE = fE();
        int i = qmr.a;
        fE.writeInt(z ? 1 : 0);
        fG(34, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void o(bblp bblpVar) {
        Parcel fE = fE();
        qmr.g(fE, bblpVar);
        fG(44, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void p(AdRequestParcel adRequestParcel) {
        Parcel fE = fE();
        qmr.e(fE, adRequestParcel);
        Parcel fF = fF(4, fE);
        qmr.h(fF);
        fF.recycle();
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void q() {
        Parcel fE = fE();
        int i = qmr.a;
        fE.writeInt(0);
        fG(22, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void r(AdRequestParcel adRequestParcel, ab abVar) {
        Parcel fE = fE();
        qmr.e(fE, adRequestParcel);
        qmr.g(fE, abVar);
        fG(43, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void s(x xVar) {
        Parcel fE = fE();
        qmr.g(fE, xVar);
        fG(20, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void t(ba baVar) {
        Parcel fE = fE();
        qmr.g(fE, baVar);
        fG(45, fE);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void u(bg bgVar) {
        Parcel fE = fE();
        qmr.g(fE, bgVar);
        fG(42, fE);
    }
}
