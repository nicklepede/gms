package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import defpackage.qmq;
import defpackage.qmr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ag extends qmq implements ah {
    public aa a;

    public ag() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final ae a() {
        return new ad(this);
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void b(aa aaVar) {
        this.a = aaVar;
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        aa yVar;
        switch (i) {
            case 1:
                ad adVar = new ad(this);
                parcel2.writeNoException();
                qmr.g(parcel2, adVar);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    yVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    yVar = queryLocalInterface instanceof aa ? (aa) queryLocalInterface : new y(readStrongBinder);
                }
                fD(parcel);
                this.a = yVar;
                parcel2.writeNoException();
                return true;
            case 3:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if (queryLocalInterface2 instanceof com.google.android.gms.ads.internal.formats.client.n) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if (queryLocalInterface3 instanceof com.google.android.gms.ads.internal.formats.client.o) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    if (queryLocalInterface4 instanceof com.google.android.gms.ads.internal.formats.client.q) {
                    }
                }
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if (queryLocalInterface5 instanceof com.google.android.gms.ads.internal.formats.client.p) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (queryLocalInterface6 instanceof az) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
                    if (queryLocalInterface7 instanceof com.google.android.gms.ads.internal.formats.client.r) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 9:
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 10:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if (queryLocalInterface8 instanceof com.google.android.gms.ads.internal.formats.client.s) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
                    if (queryLocalInterface9 instanceof com.google.android.gms.ads.internal.instream.client.a) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 15:
                fD(parcel);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void c(NativeAdOptionsParcel nativeAdOptionsParcel) {
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void e(com.google.android.gms.ads.internal.formats.client.s sVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.ah
    public final void d(String str, com.google.android.gms.ads.internal.formats.client.q qVar, com.google.android.gms.ads.internal.formats.client.p pVar) {
    }
}
