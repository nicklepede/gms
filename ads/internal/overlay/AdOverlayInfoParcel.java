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
import defpackage.atzr;
import defpackage.bbln;
import defpackage.bblp;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
        bblp bblnVar;
        bblp bblnVar2;
        bblp bblnVar3;
        bblp bblnVar4;
        bblp bblnVar5;
        bblp bblnVar6;
        bblp bblnVar7;
        bblp bblnVar8;
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
        if (((Boolean) p.bY.g()).booleanValue()) {
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
        bblp bblpVar = null;
        if (iBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(iBinder);
        }
        this.c = (com.google.android.gms.ads.internal.client.a) ObjectWrapper.a(bblnVar);
        if (iBinder2 == null) {
            bblnVar2 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar2 = queryLocalInterface2 instanceof bblp ? (bblp) queryLocalInterface2 : new bbln(iBinder2);
        }
        this.d = (g) ObjectWrapper.a(bblnVar2);
        if (iBinder3 == null) {
            bblnVar3 = null;
        } else {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar3 = queryLocalInterface3 instanceof bblp ? (bblp) queryLocalInterface3 : new bbln(iBinder3);
        }
        this.e = (com.google.android.gms.ads.internal.webview.i) ObjectWrapper.a(bblnVar3);
        if (iBinder6 == null) {
            bblnVar4 = null;
        } else {
            IInterface queryLocalInterface4 = iBinder6.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar4 = queryLocalInterface4 instanceof bblp ? (bblp) queryLocalInterface4 : new bbln(iBinder6);
        }
        this.q = (com.google.android.gms.ads.internal.gmsg.a) ObjectWrapper.a(bblnVar4);
        if (iBinder4 == null) {
            bblnVar5 = null;
        } else {
            IInterface queryLocalInterface5 = iBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar5 = queryLocalInterface5 instanceof bblp ? (bblp) queryLocalInterface5 : new bbln(iBinder4);
        }
        this.f = (com.google.android.gms.ads.internal.gmsg.b) ObjectWrapper.a(bblnVar5);
        if (iBinder5 == null) {
            bblnVar6 = null;
        } else {
            IInterface queryLocalInterface6 = iBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar6 = queryLocalInterface6 instanceof bblp ? (bblp) queryLocalInterface6 : new bbln(iBinder5);
        }
        this.j = (i) ObjectWrapper.a(bblnVar6);
        if (iBinder7 == null) {
            bblnVar7 = null;
        } else {
            IInterface queryLocalInterface7 = iBinder7.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar7 = queryLocalInterface7 instanceof bblp ? (bblp) queryLocalInterface7 : new bbln(iBinder7);
        }
        this.y = (com.google.android.gms.ads.nonagon.ad.event.c) ObjectWrapper.a(bblnVar7);
        if (iBinder8 == null) {
            bblnVar8 = null;
        } else {
            IInterface queryLocalInterface8 = iBinder8.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar8 = queryLocalInterface8 instanceof bblp ? (bblp) queryLocalInterface8 : new bbln(iBinder8);
        }
        this.u = (com.google.android.gms.ads.nonagon.ad.event.e) ObjectWrapper.a(bblnVar8);
        if (iBinder9 != null) {
            IInterface queryLocalInterface9 = iBinder9.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblpVar = queryLocalInterface9 instanceof bblp ? (bblp) queryLocalInterface9 : new bbln(iBinder9);
        }
        this.v = (com.google.android.gms.ads.internal.offline.a) ObjectWrapper.a(bblpVar);
    }

    public static final IBinder a(Object obj) {
        if (((Boolean) p.bY.g()).booleanValue()) {
            return null;
        }
        return new ObjectWrapper(obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = atzr.a(parcel);
        atzr.t(parcel, 2, this.b, i, false);
        com.google.android.gms.ads.internal.client.a aVar = this.c;
        atzr.D(parcel, 3, a(aVar));
        g gVar = this.d;
        atzr.D(parcel, 4, a(gVar));
        com.google.android.gms.ads.internal.webview.i iVar = this.e;
        atzr.D(parcel, 5, a(iVar));
        com.google.android.gms.ads.internal.gmsg.b bVar = this.f;
        atzr.D(parcel, 6, a(bVar));
        atzr.v(parcel, 7, this.g, false);
        atzr.e(parcel, 8, this.h);
        atzr.v(parcel, 9, this.i, false);
        i iVar2 = this.j;
        atzr.D(parcel, 10, a(iVar2));
        atzr.o(parcel, 11, this.k);
        atzr.o(parcel, 12, this.l);
        atzr.v(parcel, 13, this.m, false);
        atzr.t(parcel, 14, this.n, i, false);
        atzr.v(parcel, 16, this.o, false);
        atzr.t(parcel, 17, this.p, i, false);
        com.google.android.gms.ads.internal.gmsg.a aVar2 = this.q;
        atzr.D(parcel, 18, a(aVar2));
        atzr.v(parcel, 19, this.r, false);
        atzr.v(parcel, 24, this.s, false);
        atzr.v(parcel, 25, this.t, false);
        com.google.android.gms.ads.nonagon.ad.event.c cVar = this.y;
        atzr.D(parcel, 26, a(cVar));
        com.google.android.gms.ads.nonagon.ad.event.e eVar = this.u;
        atzr.D(parcel, 27, a(eVar));
        com.google.android.gms.ads.internal.offline.a aVar3 = this.v;
        atzr.D(parcel, 28, a(aVar3));
        atzr.e(parcel, 29, this.w);
        long j = this.x;
        atzr.q(parcel, 30, j);
        atzr.c(parcel, a2);
        if (((Boolean) p.bY.g()).booleanValue()) {
            a.put(Long.valueOf(j), new e(aVar, gVar, iVar, aVar2, bVar, iVar2, cVar, eVar, aVar3, com.google.android.gms.ads.internal.util.future.e.b.schedule(new f(j), ((Integer) p.bZ.g()).intValue(), TimeUnit.SECONDS)));
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
