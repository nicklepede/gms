package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.azht;
import defpackage.fwac;
import defpackage.otn;
import defpackage.oto;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class am extends otn implements an {
    public aa a;

    public am() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final AdSizeParcel a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final bk b() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final azht c() {
        return null;
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        aa aaVar = null;
        switch (i) {
            case 1:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                int i2 = oto.a;
                parcel2.writeInt(0);
                return true;
            case 4:
                AdRequestParcel adRequestParcel = (AdRequestParcel) oto.a(parcel, AdRequestParcel.CREATOR);
                fq(parcel);
                p(adRequestParcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 5:
                parcel2.writeNoException();
                return true;
            case 6:
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    aaVar = queryLocalInterface instanceof aa ? (aa) queryLocalInterface : new y(readStrongBinder);
                }
                fq(parcel);
                this.a = aaVar;
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface2 instanceof ax) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                return true;
            case 12:
                parcel2.writeNoException();
                oto.f(parcel2, null);
                return true;
            case 13:
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    if (queryLocalInterface3 instanceof com.google.android.gms.ads.internal.purchase.client.a) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    if (queryLocalInterface4 instanceof com.google.android.gms.ads.internal.purchase.client.e) {
                    }
                }
                parcel.readString();
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 16:
            case fwac.q /* 17 */:
            case fwac.A /* 27 */:
            case fwac.B /* 28 */:
            default:
                return false;
            case 18:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 19:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    if (queryLocalInterface5 instanceof com.google.android.gms.ads.internal.customrenderedad.client.a) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.t /* 20 */:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface6 instanceof x) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.u /* 21 */:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface7 instanceof az) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.v /* 22 */:
                oto.h(parcel);
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.w /* 23 */:
                parcel2.writeNoException();
                int i3 = oto.a;
                parcel2.writeInt(0);
                return true;
            case fwac.x /* 24 */:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface8 instanceof com.google.android.gms.ads.internal.reward.client.d) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.y /* 25 */:
                parcel.readString();
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 26:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case fwac.C /* 29 */:
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.D /* 30 */:
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.E /* 31 */:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 32:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case fwac.G /* 33 */:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case fwac.H /* 34 */:
                oto.h(parcel);
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.I /* 35 */:
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case fwac.J /* 36 */:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface9 instanceof ar) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.K /* 37 */:
                Bundle bundle = new Bundle();
                parcel2.writeNoException();
                oto.f(parcel2, bundle);
                return true;
            case fwac.L /* 38 */:
                parcel.readString();
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.M /* 39 */:
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    if (queryLocalInterface10 instanceof com.google.android.gms.ads.internal.appopen.client.a) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 41:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case 42:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    if (queryLocalInterface11 instanceof bg) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 43:
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    if (queryLocalInterface12 instanceof ab) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 44:
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (queryLocalInterface13 instanceof azht) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    if (queryLocalInterface14 instanceof ba) {
                    }
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case 46:
                parcel2.writeNoException();
                int i4 = oto.a;
                parcel2.writeInt(0);
                return true;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void g(aa aaVar) {
        this.a = aaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void p(AdRequestParcel adRequestParcel) {
        com.google.android.gms.ads.internal.util.client.h.f("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.f.a.post(new bu(this));
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void d() {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void e() {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void f() {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void q() {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void h(AdSizeParcel adSizeParcel) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void m(ax axVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void n(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void o(azht azhtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void s(x xVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void t(ba baVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void u(bg bgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.an
    public final void r(AdRequestParcel adRequestParcel, ab abVar) {
    }
}
