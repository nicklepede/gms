package com.google.android.gms.ads.internal.mediation.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.client.bk;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azhr;
import defpackage.azht;
import defpackage.fwac;
import defpackage.otn;
import defpackage.oto;
import defpackage.tdk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class k extends otn implements IInterface {
    private final com.google.android.gms.ads.mediation.n a;

    public k() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // defpackage.otn
    public final boolean fm(int i, Parcel parcel, Parcel parcel2) {
        azht azhrVar;
        azht azhrVar2;
        azht azhrVar3;
        com.google.android.gms.ads.internal.formats.client.c cVar = null;
        azht azhtVar = null;
        azht azhtVar2 = null;
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
                oto.g(parcel2, cVar);
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
                tdk tdkVar = this.a.j;
                bk a = tdkVar != null ? tdkVar.a() : null;
                parcel2.writeNoException();
                oto.g(parcel2, a);
                return true;
            case 12:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case 13:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case 14:
                parcel2.writeNoException();
                oto.g(parcel2, null);
                return true;
            case 15:
                Object obj = this.a.k;
                ObjectWrapper objectWrapper = obj != null ? new ObjectWrapper(obj) : null;
                parcel2.writeNoException();
                oto.g(parcel2, objectWrapper);
                return true;
            case 16:
                Bundle bundle = this.a.l;
                parcel2.writeNoException();
                oto.f(parcel2, bundle);
                return true;
            case fwac.q /* 17 */:
                boolean z = this.a.m;
                parcel2.writeNoException();
                int i2 = oto.a;
                parcel2.writeInt(z ? 1 : 0);
                return true;
            case 18:
                boolean z2 = this.a.n;
                parcel2.writeNoException();
                int i3 = oto.a;
                parcel2.writeInt(z2 ? 1 : 0);
                return true;
            case 19:
                parcel2.writeNoException();
                return true;
            case fwac.t /* 20 */:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    azhtVar2 = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(readStrongBinder);
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.u /* 21 */:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    azhrVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    azhrVar = queryLocalInterface2 instanceof azht ? (azht) queryLocalInterface2 : new azhr(readStrongBinder2);
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    azhrVar2 = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    azhrVar2 = queryLocalInterface3 instanceof azht ? (azht) queryLocalInterface3 : new azhr(readStrongBinder3);
                }
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 == null) {
                    azhrVar3 = null;
                } else {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    azhrVar3 = queryLocalInterface4 instanceof azht ? (azht) queryLocalInterface4 : new azhr(readStrongBinder4);
                }
                fq(parcel);
                View view = (View) ObjectWrapper.a(azhrVar);
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
            case fwac.v /* 22 */:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    azhtVar = queryLocalInterface5 instanceof azht ? (azht) queryLocalInterface5 : new azhr(readStrongBinder5);
                }
                fq(parcel);
                parcel2.writeNoException();
                return true;
            case fwac.w /* 23 */:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case fwac.x /* 24 */:
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case fwac.y /* 25 */:
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
