package com.google.android.gms.ads.internal.mediation.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import defpackage.qmp;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g extends qmp implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void a() {
        fG(1, fE());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void b() {
        fG(2, fE());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void c(AdErrorParcel adErrorParcel) {
        Parcel fE = fE();
        qmr.e(fE, adErrorParcel);
        fG(23, fE);
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void d() {
        fG(8, fE());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void e() {
        fG(6, fE());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void f() {
        fG(5, fE());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void g(String str, String str2) {
        Parcel fE = fE();
        fE.writeString(str);
        fE.writeString(str2);
        fG(9, fE);
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void h(com.google.android.gms.ads.internal.formats.client.l lVar, String str) {
        Parcel fE = fE();
        qmr.g(fE, lVar);
        fE.writeString(str);
        fG(10, fE);
    }
}
