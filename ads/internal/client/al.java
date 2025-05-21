package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azhr;
import defpackage.azht;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class al extends otm implements an {
    public al(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final AdSizeParcel a() {
        Parcel fs = fs(12, fr());
        AdSizeParcel adSizeParcel = (AdSizeParcel) oto.a(fs, AdSizeParcel.CREATOR);
        fs.recycle();
        return adSizeParcel;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final bk b() {
        bk biVar;
        Parcel fs = fs(26, fr());
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            biVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            biVar = queryLocalInterface instanceof bk ? (bk) queryLocalInterface : new bi(readStrongBinder);
        }
        fs.recycle();
        return biVar;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final azht c() {
        azht azhrVar;
        Parcel fs = fs(1, fr());
        IBinder readStrongBinder = fs.readStrongBinder();
        if (readStrongBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
        }
        fs.recycle();
        return azhrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void d() {
        ft(2, fr());
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void e() {
        ft(5, fr());
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void f() {
        ft(6, fr());
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void g(aa aaVar) {
        Parcel fr = fr();
        oto.g(fr, aaVar);
        ft(7, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void h(AdSizeParcel adSizeParcel) {
        Parcel fr = fr();
        oto.e(fr, adSizeParcel);
        ft(13, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void m(ax axVar) {
        Parcel fr = fr();
        oto.g(fr, axVar);
        ft(8, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void n(boolean z) {
        Parcel fr = fr();
        int i = oto.a;
        fr.writeInt(z ? 1 : 0);
        ft(34, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void o(azht azhtVar) {
        Parcel fr = fr();
        oto.g(fr, azhtVar);
        ft(44, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void p(AdRequestParcel adRequestParcel) {
        Parcel fr = fr();
        oto.e(fr, adRequestParcel);
        Parcel fs = fs(4, fr);
        oto.h(fs);
        fs.recycle();
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void q() {
        Parcel fr = fr();
        int i = oto.a;
        fr.writeInt(0);
        ft(22, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void r(AdRequestParcel adRequestParcel, ab abVar) {
        Parcel fr = fr();
        oto.e(fr, adRequestParcel);
        oto.g(fr, abVar);
        ft(43, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void s(x xVar) {
        Parcel fr = fr();
        oto.g(fr, xVar);
        ft(20, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void t(ba baVar) {
        Parcel fr = fr();
        oto.g(fr, baVar);
        ft(45, fr);
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void u(bg bgVar) {
        Parcel fr = fr();
        oto.g(fr, bgVar);
        ft(42, fr);
    }
}
