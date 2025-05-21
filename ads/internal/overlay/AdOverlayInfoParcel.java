package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public final AdLauncherIntentInfoParcel b;
    public final com.google.android.gms.ads.internal.client.a c;
    public final g d;
    public final com.google.android.gms.ads.internal.webview.i e;
    public final com.google.android.gms.ads.internal.gmsg.b f;
    public final String g;
    public final boolean h;
    public final String i;
    public final i j;
    public final int k;
    public final int l;
    public final String m;
    public final VersionInfoParcel n;
    public final String o;
    public final InterstitialAdParameterParcel p;
    public final com.google.android.gms.ads.internal.gmsg.a q;
    public final String r;
    public final String s;
    public final String t;
    public final com.google.android.gms.ads.nonagon.ad.event.e u;
    public final com.google.android.gms.ads.internal.offline.a v;
    public final boolean w;
    public final long x;
    public final com.google.android.gms.ads.nonagon.ad.event.c y;
    public static final Parcelable.Creator CREATOR = new d();
    private static final AtomicLong z = new AtomicLong(0);
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z2, String str2, IBinder iBinder5, int i, int i2, String str3, VersionInfoParcel versionInfoParcel, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z3, long j) {
        azht azhrVar;
        azht azhrVar2;
        azht azhrVar3;
        azht azhrVar4;
        azht azhrVar5;
        azht azhrVar6;
        azht azhrVar7;
        azht azhrVar8;
        this.b = adLauncherIntentInfoParcel;
        this.g = str;
        this.h = z2;
        this.i = str2;
        this.k = i;
        this.l = i2;
        this.m = str3;
        this.n = versionInfoParcel;
        this.o = str4;
        this.p = interstitialAdParameterParcel;
        this.r = str5;
        this.s = str6;
        this.t = str7;
        this.w = z3;
        this.x = j;
        if (((Boolean) p.bX.g()).booleanValue()) {
            e eVar = (e) a.remove(Long.valueOf(j));
            if (eVar == null) {
                throw new NullPointerException("AdOverlayObjects is null");
            }
            this.c = eVar.a;
            this.d = eVar.b;
            this.e = eVar.c;
            this.q = eVar.d;
            this.f = eVar.e;
            this.y = eVar.j;
            this.u = eVar.g;
            this.v = eVar.h;
            this.j = eVar.f;
            eVar.i.cancel(false);
            return;
        }
        azht azhtVar = null;
        if (iBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder);
        }
        this.c = (com.google.android.gms.ads.internal.client.a) ObjectWrapper.a(azhrVar);
        if (iBinder2 == null) {
            azhrVar2 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar2 = queryLocalInterface2 instanceof azht ? (azht) queryLocalInterface2 : new azhr(iBinder2);
        }
        this.d = (g) ObjectWrapper.a(azhrVar2);
        if (iBinder3 == null) {
            azhrVar3 = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar3 = queryLocalInterface3 instanceof azht ? (azht) queryLocalInterface3 : new azhr(iBinder3);
        }
        this.e = (com.google.android.gms.ads.internal.webview.i) ObjectWrapper.a(azhrVar3);
        if (iBinder6 == null) {
            azhrVar4 = null;
        } else {
            IInterface queryLocalInterface4 = iBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar4 = queryLocalInterface4 instanceof azht ? (azht) queryLocalInterface4 : new azhr(iBinder6);
        }
        this.q = (com.google.android.gms.ads.internal.gmsg.a) ObjectWrapper.a(azhrVar4);
        if (iBinder4 == null) {
            azhrVar5 = null;
        } else {
            IInterface queryLocalInterface5 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar5 = queryLocalInterface5 instanceof azht ? (azht) queryLocalInterface5 : new azhr(iBinder4);
        }
        this.f = (com.google.android.gms.ads.internal.gmsg.b) ObjectWrapper.a(azhrVar5);
        if (iBinder5 == null) {
            azhrVar6 = null;
        } else {
            IInterface queryLocalInterface6 = iBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar6 = queryLocalInterface6 instanceof azht ? (azht) queryLocalInterface6 : new azhr(iBinder5);
        }
        this.j = (i) ObjectWrapper.a(azhrVar6);
        if (iBinder7 == null) {
            azhrVar7 = null;
        } else {
            IInterface queryLocalInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar7 = queryLocalInterface7 instanceof azht ? (azht) queryLocalInterface7 : new azhr(iBinder7);
        }
        this.y = (com.google.android.gms.ads.nonagon.ad.event.c) ObjectWrapper.a(azhrVar7);
        if (iBinder8 == null) {
            azhrVar8 = null;
        } else {
            IInterface queryLocalInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar8 = queryLocalInterface8 instanceof azht ? (azht) queryLocalInterface8 : new azhr(iBinder8);
        }
        this.u = (com.google.android.gms.ads.nonagon.ad.event.e) ObjectWrapper.a(azhrVar8);
        if (iBinder9 != null) {
            IInterface queryLocalInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhtVar = queryLocalInterface9 instanceof azht ? (azht) queryLocalInterface9 : new azhr(iBinder9);
        }
        this.v = (com.google.android.gms.ads.internal.offline.a) ObjectWrapper.a(azhtVar);
    }

    public static final IBinder a(Object obj) {
        if (((Boolean) p.bX.g()).booleanValue()) {
            return null;
        }
        return new ObjectWrapper(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = arxc.a(parcel);
        arxc.t(parcel, 2, this.b, i, false);
        com.google.android.gms.ads.internal.client.a aVar = this.c;
        arxc.D(parcel, 3, a(aVar));
        g gVar = this.d;
        arxc.D(parcel, 4, a(gVar));
        com.google.android.gms.ads.internal.webview.i iVar = this.e;
        arxc.D(parcel, 5, a(iVar));
        com.google.android.gms.ads.internal.gmsg.b bVar = this.f;
        arxc.D(parcel, 6, a(bVar));
        arxc.v(parcel, 7, this.g, false);
        arxc.e(parcel, 8, this.h);
        arxc.v(parcel, 9, this.i, false);
        i iVar2 = this.j;
        arxc.D(parcel, 10, a(iVar2));
        arxc.o(parcel, 11, this.k);
        arxc.o(parcel, 12, this.l);
        arxc.v(parcel, 13, this.m, false);
        arxc.t(parcel, 14, this.n, i, false);
        arxc.v(parcel, 16, this.o, false);
        arxc.t(parcel, 17, this.p, i, false);
        com.google.android.gms.ads.internal.gmsg.a aVar2 = this.q;
        arxc.D(parcel, 18, a(aVar2));
        arxc.v(parcel, 19, this.r, false);
        arxc.v(parcel, 24, this.s, false);
        arxc.v(parcel, 25, this.t, false);
        com.google.android.gms.ads.nonagon.ad.event.c cVar = this.y;
        arxc.D(parcel, 26, a(cVar));
        com.google.android.gms.ads.nonagon.ad.event.e eVar = this.u;
        arxc.D(parcel, 27, a(eVar));
        com.google.android.gms.ads.internal.offline.a aVar3 = this.v;
        arxc.D(parcel, 28, a(aVar3));
        arxc.e(parcel, 29, this.w);
        long j = this.x;
        arxc.q(parcel, 30, j);
        arxc.c(parcel, a2);
        if (((Boolean) p.bX.g()).booleanValue()) {
            a.put(Long.valueOf(j), new e(aVar, gVar, iVar, aVar2, bVar, iVar2, cVar, eVar, aVar3, com.google.android.gms.ads.internal.util.future.e.b.schedule(new f(j), ((Integer) p.bY.g()).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.webview.i iVar, String str) {
        this.b = adLauncherIntentInfoParcel;
        this.c = null;
        this.d = null;
        this.e = iVar;
        this.q = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = -1;
        this.l = 4;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = null;
        this.p = null;
        this.r = str;
        this.s = null;
        this.t = null;
        this.y = null;
        this.u = null;
        this.v = null;
        this.w = false;
        this.x = z.getAndIncrement();
    }
}
