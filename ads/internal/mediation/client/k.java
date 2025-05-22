package com.google.android.gms.ads.internal.mediation.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.client.bk;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.fywe;
import defpackage.qmq;
import defpackage.qmr;
import defpackage.uzk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class k extends qmq implements IInterface {
    private final com.google.android.gms.ads.mediation.n a;

    public k() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        bblp bblnVar;
        bblp bblnVar2;
        bblp bblnVar3;
        com.google.android.gms.ads.internal.formats.client.c cVar = null;
        bblp bblpVar = null;
        bblp bblpVar2 = null;
        switch (i) {
            case 2:
                String str = this.a.a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List<com.google.android.gms.ads.formats.c> list = this.a.b;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (com.google.android.gms.ads.formats.c cVar2 : list) {
                        arrayList.add(new com.google.android.gms.ads.internal.formats.client.c(cVar2.d(), cVar2.e(), cVar2.a(), cVar2.c(), cVar2.b()));
                    }
                }
                parcel2.writeNoException();
                parcel2.writeList(arrayList);
                return true;
            case 4:
                String str2 = this.a.c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                com.google.android.gms.ads.formats.c cVar3 = this.a.d;
                if (cVar3 != null) {
                    com.google.android.gms.ads.internal.formats.client.e eVar = (com.google.android.gms.ads.internal.formats.client.e) cVar3;
                    cVar = new com.google.android.gms.ads.internal.formats.client.c(eVar.a, eVar.b, eVar.c, eVar.d, eVar.e);
                }
                parcel2.writeNoException();
                qmr.g(parcel2, cVar);
                return true;
            case 6:
                String str3 = this.a.e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.a.f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                Double d = this.a.g;
                double doubleValue = d != null ? d.doubleValue() : -1.0d;
                parcel2.writeNoException();
                parcel2.writeDouble(doubleValue);
                return true;
            case 9:
                String str5 = this.a.h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.a.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                uzk uzkVar = this.a.j;
                bk a = uzkVar != null ? uzkVar.a() : null;
                parcel2.writeNoException();
                qmr.g(parcel2, a);
                return true;
            case 12:
                parcel2.writeNoException();
                qmr.g(parcel2, null);
                return true;
            case 13:
                parcel2.writeNoException();
                qmr.g(parcel2, null);
                return true;
            case 14:
                parcel2.writeNoException();
                qmr.g(parcel2, null);
                return true;
            case 15:
                Object obj = this.a.k;
                ObjectWrapper objectWrapper = obj != null ? new ObjectWrapper(obj) : null;
                parcel2.writeNoException();
                qmr.g(parcel2, objectWrapper);
                return true;
            case 16:
                Bundle bundle = this.a.l;
                parcel2.writeNoException();
                qmr.f(parcel2, bundle);
                return true;
            case fywe.q /* 17 */:
                boolean z = this.a.m;
                parcel2.writeNoException();
                int i2 = qmr.a;
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 18:
                boolean z2 = this.a.n;
                parcel2.writeNoException();
                int i3 = qmr.a;
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 19:
                parcel2.writeNoException();
                return true;
            case fywe.t /* 20 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bblpVar2 = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(readStrongBinder);
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case fywe.u /* 21 */:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    bblnVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bblnVar = queryLocalInterface2 instanceof bblp ? (bblp) queryLocalInterface2 : new bbln(readStrongBinder2);
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    bblnVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bblnVar2 = queryLocalInterface3 instanceof bblp ? (bblp) queryLocalInterface3 : new bbln(readStrongBinder3);
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    bblnVar3 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bblnVar3 = queryLocalInterface4 instanceof bblp ? (bblp) queryLocalInterface4 : new bbln(readStrongBinder4);
                }
                fD(parcel);
                View view = (View) ObjectWrapper.a(bblnVar);
                boolean z3 = view instanceof com.google.android.gms.ads.formats.i;
                com.google.android.gms.ads.mediation.n nVar = this.a;
                if (z3) {
                    com.google.android.gms.ads.formats.h hVar = nVar.o;
                    throw null;
                }
                if (((com.google.android.gms.ads.formats.f) com.google.android.gms.ads.formats.f.a.get(view)) == null) {
                    parcel2.writeNoException();
                    return true;
                }
                com.google.android.gms.ads.formats.h hVar2 = nVar.o;
                throw null;
            case fywe.v /* 22 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    bblpVar = queryLocalInterface5 instanceof bblp ? (bblp) queryLocalInterface5 : new bbln(readStrongBinder5);
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case fywe.w /* 23 */:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case fywe.x /* 24 */:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case fywe.y /* 25 */:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            default:
                return false;
        }
    }

    public k(com.google.android.gms.ads.mediation.n nVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.a = nVar;
    }
}
