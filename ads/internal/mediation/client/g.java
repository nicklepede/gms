package com.google.android.gms.ads.internal.mediation.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdErrorParcel;
import defpackage.otm;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class g extends otm implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void a() {
        ft(1, fr());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void b() {
        ft(2, fr());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void c(AdErrorParcel adErrorParcel) {
        Parcel fr = fr();
        oto.e(fr, adErrorParcel);
        ft(23, fr);
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void d() {
        ft(8, fr());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void e() {
        ft(6, fr());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void f() {
        ft(5, fr());
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void g(String str, String str2) {
        Parcel fr = fr();
        fr.writeString(str);
        fr.writeString(str2);
        ft(9, fr);
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.i
    public final void h(com.google.android.gms.ads.internal.formats.client.l lVar, String str) {
        Parcel fr = fr();
        oto.g(fr, lVar);
        fr.writeString(str);
        ft(10, fr);
    }
}
