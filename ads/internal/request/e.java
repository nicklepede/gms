package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.flag.r;
import com.google.android.gms.ads.internal.request.NonagonRequestParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.load.service.t;
import com.google.android.gms.ads.nonagon.load.service.v;
import com.google.android.gms.ads.nonagon.load.service.w;
import com.google.android.gms.ads.nonagon.load.service.x;
import com.google.android.gms.ads.nonagon.signals.gmscore.ac;
import com.google.android.gms.ads.nonagon.signals.gmscore.af;
import com.google.android.gms.ads.nonagon.signals.gmscore.ai;
import com.google.android.gms.ads.nonagon.signals.gmscore.aj;
import com.google.android.gms.ads.nonagon.signals.gmscore.ax;
import com.google.android.gms.ads.nonagon.signals.gmscore.y;
import com.google.android.gms.ads.nonagon.util.cache.PoolConfiguration;
import com.google.android.gms.ads.social.GmsDoritosProvider;
import defpackage.autg;
import defpackage.ekut;
import defpackage.elhz;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.flml;
import defpackage.flna;
import defpackage.fmmx;
import defpackage.fmpr;
import defpackage.qmq;
import defpackage.qmr;
import defpackage.uyq;
import defpackage.uys;
import defpackage.uyw;
import defpackage.uzb;
import defpackage.uzg;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e extends qmq implements IInterface {
    private final Context a;
    private final eqgo b;
    private final x c;
    private final ArrayDeque d;
    private final com.google.android.gms.ads.nonagon.util.logging.cui.n e;
    private final uzg f;

    public e() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    private final synchronized com.google.android.gms.ads.nonagon.load.service.n c(String str) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.nonagon.load.service.n nVar = (com.google.android.gms.ads.nonagon.load.service.n) it.next();
            if (nVar.c.equals(str)) {
                it.remove();
                return nVar;
            }
        }
        return null;
    }

    private final synchronized void d() {
        int intValue = ((Long) r.b.d()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.size() >= intValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private static eqgl e(eqgl eqglVar, com.google.android.gms.ads.nonagon.util.concurrent.n nVar, com.google.android.gms.ads.internal.js.function.k kVar, com.google.android.gms.ads.nonagon.util.logging.cui.k kVar2, com.google.android.gms.ads.nonagon.util.logging.cui.b bVar) {
        com.google.android.gms.ads.internal.js.function.o a = kVar.a("AFMA_getAdDictionary", com.google.android.gms.ads.internal.js.function.h.b, new com.google.android.gms.ads.internal.js.function.c() { // from class: com.google.android.gms.ads.nonagon.load.service.h
            @Override // com.google.android.gms.ads.internal.js.function.c
            public final Object a(JSONObject jSONObject) {
                return new com.google.android.gms.ads.internal.request.service.a(jSONObject);
            }
        });
        com.google.android.gms.ads.nonagon.util.logging.cui.j.c(eqglVar, bVar);
        com.google.android.gms.ads.nonagon.util.concurrent.g a2 = nVar.b(com.google.android.gms.ads.nonagon.util.event.a.BUILD_URL, eqglVar).c(a).a();
        if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
            eqgc.t(eqgb.h(a2), new com.google.android.gms.ads.nonagon.util.logging.cui.i(kVar2, bVar), com.google.android.gms.ads.internal.util.future.e.d);
        }
        return a2;
    }

    private static eqgl f(final NonagonRequestParcel nonagonRequestParcel, com.google.android.gms.ads.nonagon.util.concurrent.n nVar, final com.google.android.gms.ads.nonagon.signals.gmscore.f fVar) {
        eqdv eqdvVar = new eqdv() { // from class: com.google.android.gms.ads.nonagon.load.service.b
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                com.google.android.gms.ads.nonagon.signals.gmscore.f fVar2 = com.google.android.gms.ads.nonagon.signals.gmscore.f.this;
                uzg uzgVar = fVar2.A;
                uyq uyqVar = uzgVar.a;
                Context c = uyw.c(uyqVar);
                eqgo b = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
                GmsDoritosProvider c2 = uzgVar.c();
                com.google.android.gms.ads.nonagon.util.concurrent.b.b();
                ai aiVar = fVar2.a;
                com.google.android.gms.ads.nonagon.signals.b bVar = new com.google.android.gms.ads.nonagon.signals.b(new y(c2, aj.c(aiVar)), 0L, (ScheduledExecutorService) uzgVar.j.a());
                com.google.android.gms.ads.nonagon.signals.b bVar2 = new com.google.android.gms.ads.nonagon.signals.b(new af(uzb.b(), (ScheduledExecutorService) uzgVar.j.a(), uyw.c(uyqVar)), ((Long) com.google.android.gms.ads.internal.config.p.ag.g()).longValue(), (ScheduledExecutorService) uzgVar.j.a());
                uzgVar.f();
                return new com.google.android.gms.ads.nonagon.signals.h(c, b, elhz.O(bVar, bVar2, new com.google.android.gms.ads.nonagon.signals.b(new com.google.android.gms.ads.nonagon.signals.gmscore.c(uyw.c(uyqVar), (ScheduledExecutorService) uzgVar.j.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), aiVar.b, aiVar.a(), aiVar.b()), 0L, (ScheduledExecutorService) uzgVar.j.a()), new com.google.android.gms.ads.nonagon.signals.b(new ax(com.google.android.gms.ads.nonagon.util.concurrent.b.b()), 0L, (ScheduledExecutorService) uzgVar.j.a()), new com.google.android.gms.ads.nonagon.signals.gmscore.q(new com.google.android.gms.ads.cache.l(), com.google.android.gms.ads.nonagon.util.concurrent.b.b(), uyw.c(uyqVar)), fVar2.b(), fVar2.a(), (com.google.android.gms.ads.nonagon.signals.e) uzgVar.o.a(), new com.google.android.gms.ads.nonagon.signals.gmscore.m(aj.c(aiVar), uys.c(uyw.c(uyqVar)), com.google.android.gms.ads.internal.c.d(), (ScheduledExecutorService) uzgVar.j.a(), com.google.android.gms.ads.nonagon.util.concurrent.b.b())), (com.google.android.gms.ads.nonagon.util.logging.cui.k) fVar2.b.a(), (com.google.android.gms.ads.nonagon.csi.d) uzgVar.s.a()).a(com.google.android.gms.ads.internal.client.u.b().e((Bundle) obj), nonagonRequestParcel.m);
            }
        };
        return nVar.b(com.google.android.gms.ads.nonagon.util.event.a.GMS_SIGNALS, eqgc.i(nonagonRequestParcel.a)).c(eqdvVar).b(new com.google.android.gms.ads.nonagon.util.concurrent.f() { // from class: com.google.android.gms.ads.nonagon.load.service.c
            @Override // com.google.android.gms.ads.nonagon.util.concurrent.f
            public final Object a(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                jSONObject.toString(2);
                return jSONObject;
            }
        }).a();
    }

    private static final void g(eqgl eqglVar, j jVar, NonagonRequestParcel nonagonRequestParcel) {
        eqgc.t(eqdl.g(eqglVar, new eqdv() { // from class: com.google.android.gms.ads.nonagon.load.service.i
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
                com.google.android.gms.ads.internal.util.future.e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.util.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    autg.h(inputStream2, autoCloseOutputStream);
                                    autoCloseOutputStream.close();
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                } finally {
                                }
                            } finally {
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return eqgc.i(parcelFileDescriptor);
            }
        }, com.google.android.gms.ads.internal.util.future.e.a), new com.google.android.gms.ads.nonagon.load.service.m(nonagonRequestParcel, jVar), com.google.android.gms.ads.internal.util.future.e.d);
    }

    public final synchronized void a(com.google.android.gms.ads.nonagon.load.service.n nVar) {
        d();
        this.d.addLast(nVar);
    }

    @Override // defpackage.qmq
    public final boolean fz(int i, Parcel parcel, Parcel parcel2) {
        j jVar;
        com.google.android.gms.ads.nonagon.util.concurrent.g a;
        Bundle bundle;
        eqgl eqglVar;
        Bundle bundle2;
        final NonagonRequestParcel nonagonRequestParcel;
        eqgl h;
        j jVar2;
        eqgl h2;
        com.google.android.gms.ads.nonagon.load.service.n nVar = null;
        k kVar = null;
        j jVar3 = null;
        j jVar4 = null;
        nVar = null;
        switch (i) {
            case 1:
                fD(parcel);
                parcel2.writeNoException();
                qmr.f(parcel2, null);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof f) {
                    }
                }
                fD(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                final NonagonRequestParcel nonagonRequestParcel2 = (NonagonRequestParcel) qmr.a(parcel, NonagonRequestParcel.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    jVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    jVar = queryLocalInterface2 instanceof j ? (j) queryLocalInterface2 : new j(readStrongBinder2);
                }
                fD(parcel);
                if (((Boolean) com.google.android.gms.ads.internal.config.p.P.g()).booleanValue() && (bundle = nonagonRequestParcel2.m) != null) {
                    String str = com.google.android.gms.ads.nonagon.csi.a.SERVICE_CONNECTED.an;
                    com.google.android.gms.ads.internal.c.j();
                    bundle.putLong(str, System.currentTimeMillis());
                }
                Context context = this.a;
                int callingUid = Binder.getCallingUid();
                com.google.android.gms.ads.internal.js.function.k a2 = com.google.android.gms.ads.internal.c.b().a(context, new VersionInfoParcel(251864004, 251864004), this.e);
                com.google.android.gms.ads.nonagon.signals.gmscore.f b = this.f.b(nonagonRequestParcel2, callingUid);
                com.google.android.gms.ads.internal.js.function.o a3 = a2.a("google.afma.response.normalize", com.google.android.gms.ads.nonagon.load.service.p.a, com.google.android.gms.ads.internal.js.function.h.c);
                if (((Boolean) r.a.d()).booleanValue()) {
                    nVar = c(nonagonRequestParcel2.h);
                } else {
                    String str2 = nonagonRequestParcel2.j;
                    if (str2 != null) {
                        str2.isEmpty();
                    }
                }
                com.google.android.gms.ads.nonagon.util.logging.cui.b a4 = nVar == null ? com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context, 9) : nVar.d;
                com.google.android.gms.ads.nonagon.util.logging.cui.k c = b.c();
                c.c(nonagonRequestParcel2.a.getStringArrayList("ad_types"));
                w wVar = new w(nonagonRequestParcel2.g, c, a4);
                t tVar = new t(context, nonagonRequestParcel2.b.a, callingUid);
                com.google.android.gms.ads.nonagon.util.concurrent.n d = b.d();
                com.google.android.gms.ads.nonagon.util.logging.cui.b a5 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context, 11);
                if (nVar == null) {
                    final eqgl f = f(nonagonRequestParcel2, d, b);
                    final eqgl e = e(f, d, a2, c, a4);
                    final com.google.android.gms.ads.nonagon.util.logging.cui.b a6 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context, 10);
                    final com.google.android.gms.ads.nonagon.util.concurrent.g a7 = d.a(com.google.android.gms.ads.nonagon.util.event.a.HTTP, e, f).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.load.service.d
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Bundle bundle3;
                            com.google.android.gms.ads.internal.request.service.a aVar = (com.google.android.gms.ads.internal.request.service.a) eqgl.this.get();
                            if (((Boolean) com.google.android.gms.ads.internal.config.p.P.g()).booleanValue() && (bundle3 = nonagonRequestParcel2.m) != null) {
                                bundle3.putLong(com.google.android.gms.ads.nonagon.csi.a.GET_AD_DICTIONARY_SDKCORE_START.an, aVar.j);
                                bundle3.putLong(com.google.android.gms.ads.nonagon.csi.a.GET_AD_DICTIONARY_SDKCORE_END.an, aVar.k);
                            }
                            return new v((JSONObject) f.get(), aVar);
                        }
                    }).b(wVar).b(new com.google.android.gms.ads.nonagon.util.concurrent.f() { // from class: com.google.android.gms.ads.nonagon.util.logging.cui.f
                        @Override // com.google.android.gms.ads.nonagon.util.concurrent.f
                        public final Object a(Object obj) {
                            if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
                                b.this.k();
                            }
                            return obj;
                        }
                    }).b(tVar).a();
                    com.google.android.gms.ads.nonagon.util.logging.cui.j.a(a7, c, a6);
                    com.google.android.gms.ads.nonagon.util.logging.cui.j.c(a7, a5);
                    a = d.a(com.google.android.gms.ads.nonagon.util.event.a.PRE_PROCESS, f, e, a7).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.load.service.e
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Bundle bundle3;
                            if (((Boolean) com.google.android.gms.ads.internal.config.p.P.g()).booleanValue() && (bundle3 = NonagonRequestParcel.this.m) != null) {
                                String str3 = com.google.android.gms.ads.nonagon.csi.a.HTTP_RESPONSE_READY.an;
                                com.google.android.gms.ads.internal.c.j();
                                bundle3.putLong(str3, System.currentTimeMillis());
                            }
                            return new p((s) a7.get(), (JSONObject) f.get(), (com.google.android.gms.ads.internal.request.service.a) e.get());
                        }
                    }).c(a3).a();
                } else {
                    v vVar = new v(nVar.b, nVar.a);
                    final com.google.android.gms.ads.nonagon.util.logging.cui.b a8 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context, 10);
                    final com.google.android.gms.ads.nonagon.util.concurrent.g a9 = d.b(com.google.android.gms.ads.nonagon.util.event.a.HTTP, eqgc.i(vVar)).b(wVar).b(new com.google.android.gms.ads.nonagon.util.concurrent.f() { // from class: com.google.android.gms.ads.nonagon.util.logging.cui.f
                        @Override // com.google.android.gms.ads.nonagon.util.concurrent.f
                        public final Object a(Object obj) {
                            if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
                                b.this.k();
                            }
                            return obj;
                        }
                    }).b(tVar).a();
                    com.google.android.gms.ads.nonagon.util.logging.cui.j.a(a9, c, a8);
                    final eqgl i2 = eqgc.i(nVar);
                    com.google.android.gms.ads.nonagon.util.logging.cui.j.c(a9, a5);
                    a = d.a(com.google.android.gms.ads.nonagon.util.event.a.PRE_PROCESS, a9, i2).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.load.service.a
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            s sVar = (s) eqgl.this.get();
                            n nVar2 = (n) ((eqgf) i2).b;
                            return new p(sVar, nVar2.b, nVar2.a);
                        }
                    }).c(a3).a();
                }
                com.google.android.gms.ads.nonagon.util.logging.cui.j.a(a, c, a5);
                g(a, jVar, nonagonRequestParcel2);
                if (((Boolean) com.google.android.gms.ads.internal.flag.n.e.d()).booleanValue()) {
                    final x xVar = this.c;
                    Objects.requireNonNull(xVar);
                    a.hD(new Runnable() { // from class: com.google.android.gms.ads.nonagon.load.service.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            final com.google.android.gms.ads.internal.request.l lVar = x.this.a;
                            synchronized (lVar.a) {
                                if (lVar.c == null) {
                                    lVar.c = lVar.b.getSharedPreferences("google_ads_flags_meta", 0);
                                }
                            }
                            SharedPreferences sharedPreferences = lVar.c;
                            long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
                            com.google.android.gms.ads.internal.c.j();
                            eqgl i3 = System.currentTimeMillis() - j < ((Long) com.google.android.gms.ads.internal.flag.n.d.d()).longValue() ? eqgc.i(null) : eqdl.f(lVar.e.b(com.google.android.gms.ads.internal.request.l.a(lVar.b, lVar.d)), new ekut() { // from class: com.google.android.gms.ads.internal.request.m
                                @Override // defpackage.ekut
                                public final Object apply(Object obj) {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    com.google.android.gms.ads.internal.config.g gVar = com.google.android.gms.ads.internal.config.p.a;
                                    com.google.android.gms.ads.internal.client.w.c();
                                    l lVar2 = l.this;
                                    Context context2 = lVar2.b;
                                    SharedPreferences b2 = com.google.android.gms.ads.internal.config.i.b(context2);
                                    if (b2 == null) {
                                        return null;
                                    }
                                    SharedPreferences.Editor edit = b2.edit();
                                    com.google.android.gms.ads.internal.client.w.a();
                                    for (com.google.android.gms.ads.internal.config.g gVar2 : com.google.android.gms.ads.internal.client.w.a().a) {
                                        if (gVar2.a == 1) {
                                            gVar2.d(edit, gVar2.a(jSONObject));
                                        }
                                    }
                                    if (jSONObject != null) {
                                        edit.putString("flag_configuration", jSONObject.toString());
                                    } else {
                                        com.google.android.gms.ads.internal.util.client.h.f("Flag Json is null.");
                                    }
                                    com.google.android.gms.ads.internal.client.w.c();
                                    com.google.android.gms.ads.internal.config.i.a(context2, edit);
                                    SharedPreferences sharedPreferences2 = lVar2.c;
                                    if (sharedPreferences2 == null) {
                                        return null;
                                    }
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    com.google.android.gms.ads.internal.c.j();
                                    edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                                    return null;
                                }
                            }, com.google.android.gms.ads.internal.util.future.e.d);
                            if (((Boolean) com.google.android.gms.ads.internal.config.p.ba.g()).booleanValue()) {
                                eqgc.t(i3, new com.google.android.gms.ads.internal.util.future.g(), com.google.android.gms.ads.internal.util.future.e.d);
                            } else {
                                com.google.android.gms.ads.internal.util.future.h.a(i3, "persistFlags");
                            }
                        }
                    }, this.b);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                final NonagonRequestParcel nonagonRequestParcel3 = (NonagonRequestParcel) qmr.a(parcel, NonagonRequestParcel.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    jVar4 = queryLocalInterface3 instanceof j ? (j) queryLocalInterface3 : new j(readStrongBinder3);
                }
                fD(parcel);
                if (((Boolean) com.google.android.gms.ads.internal.config.p.P.g()).booleanValue() && (bundle2 = nonagonRequestParcel3.m) != null) {
                    String str3 = com.google.android.gms.ads.nonagon.csi.a.SERVICE_CONNECTED.an;
                    com.google.android.gms.ads.internal.c.j();
                    bundle2.putLong(str3, System.currentTimeMillis());
                }
                Context context2 = this.a;
                int callingUid2 = Binder.getCallingUid();
                com.google.android.gms.ads.internal.js.function.k a10 = com.google.android.gms.ads.internal.c.b().a(context2, new VersionInfoParcel(251864004, 251864004), this.e);
                if (((Boolean) com.google.android.gms.ads.internal.flag.v.a.d()).booleanValue()) {
                    com.google.android.gms.ads.nonagon.signals.gmscore.f b2 = this.f.b(nonagonRequestParcel3, callingUid2);
                    uzg uzgVar = b2.A;
                    Context c2 = uyw.c(uzgVar.a);
                    uzgVar.c();
                    uzgVar.d();
                    Object a11 = uzgVar.o.a();
                    com.google.android.gms.ads.nonagon.signals.gmscore.i a12 = b2.a();
                    ac b3 = b2.b();
                    flml b4 = flna.b(b2.f);
                    flml b5 = flna.b(b2.g);
                    flml b6 = flna.b(b2.i);
                    flml b7 = flna.b(b2.j);
                    flml b8 = flna.b(b2.k);
                    flml b9 = flna.b(b2.o);
                    flml b10 = flna.b(b2.p);
                    eqgo b11 = com.google.android.gms.ads.nonagon.util.concurrent.b.b();
                    com.google.android.gms.ads.nonagon.util.logging.cui.k kVar2 = (com.google.android.gms.ads.nonagon.util.logging.cui.k) b2.b.a();
                    com.google.android.gms.ads.nonagon.csi.d dVar = (com.google.android.gms.ads.nonagon.csi.d) uzgVar.s.a();
                    HashSet hashSet = new HashSet();
                    hashSet.add((com.google.android.gms.ads.nonagon.signals.gmscore.v) a11);
                    hashSet.add(a12);
                    hashSet.add(b3);
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.aJ.g()).booleanValue()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b4.a());
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.aK.g()).booleanValue()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b5.a());
                    }
                    if (!fmmx.a.lK().o() && ((Boolean) com.google.android.gms.ads.internal.config.p.aL.g()).booleanValue()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b6.a());
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.aO.g()).booleanValue()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b7.a());
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.aP.g()).booleanValue()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b8.a());
                    }
                    if (fmpr.e()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b9.a());
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.config.p.aa.g()).booleanValue()) {
                        hashSet.add((com.google.android.gms.ads.nonagon.signals.e) b10.a());
                    }
                    final com.google.android.gms.ads.nonagon.signals.h hVar = new com.google.android.gms.ads.nonagon.signals.h(c2, b11, hashSet, kVar2, dVar);
                    com.google.android.gms.ads.internal.js.function.o a13 = a10.a("google.afma.request.getSignals", com.google.android.gms.ads.internal.js.function.h.b, com.google.android.gms.ads.internal.js.function.h.c);
                    final com.google.android.gms.ads.nonagon.util.logging.cui.b a14 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context2, 22);
                    com.google.android.gms.ads.nonagon.util.concurrent.n d2 = b2.d();
                    com.google.android.gms.ads.nonagon.util.event.a aVar = com.google.android.gms.ads.nonagon.util.event.a.GET_SIGNALS;
                    Bundle bundle3 = nonagonRequestParcel3.a;
                    com.google.android.gms.ads.nonagon.util.concurrent.m c3 = d2.b(aVar, eqgc.i(bundle3)).b(new com.google.android.gms.ads.nonagon.util.concurrent.f() { // from class: com.google.android.gms.ads.nonagon.util.logging.cui.f
                        @Override // com.google.android.gms.ads.nonagon.util.concurrent.f
                        public final Object a(Object obj) {
                            if (((Boolean) com.google.android.gms.ads.internal.flag.h.c.d()).booleanValue()) {
                                b.this.k();
                            }
                            return obj;
                        }
                    }).c(new eqdv() { // from class: com.google.android.gms.ads.nonagon.load.service.j
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            return com.google.android.gms.ads.nonagon.signals.h.this.a(com.google.android.gms.ads.internal.client.u.b().e((Bundle) obj), nonagonRequestParcel3.m);
                        }
                    });
                    com.google.android.gms.ads.nonagon.util.concurrent.g a15 = c3.a.b(com.google.android.gms.ads.nonagon.util.event.a.JS_SIGNALS, c3.a()).c(a13).a();
                    com.google.android.gms.ads.nonagon.util.logging.cui.k c4 = b2.c();
                    c4.c(bundle3.getStringArrayList("ad_types"));
                    c4.d(bundle3.getBundle("extras"));
                    com.google.android.gms.ads.nonagon.util.logging.cui.j.b(a15, c4, a14, true);
                    if (((Boolean) com.google.android.gms.ads.internal.flag.n.f.d()).booleanValue()) {
                        final x xVar2 = this.c;
                        Objects.requireNonNull(xVar2);
                        a15.hD(new Runnable() { // from class: com.google.android.gms.ads.nonagon.load.service.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                final com.google.android.gms.ads.internal.request.l lVar = x.this.a;
                                synchronized (lVar.a) {
                                    if (lVar.c == null) {
                                        lVar.c = lVar.b.getSharedPreferences("google_ads_flags_meta", 0);
                                    }
                                }
                                SharedPreferences sharedPreferences = lVar.c;
                                long j = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
                                com.google.android.gms.ads.internal.c.j();
                                eqgl i3 = System.currentTimeMillis() - j < ((Long) com.google.android.gms.ads.internal.flag.n.d.d()).longValue() ? eqgc.i(null) : eqdl.f(lVar.e.b(com.google.android.gms.ads.internal.request.l.a(lVar.b, lVar.d)), new ekut() { // from class: com.google.android.gms.ads.internal.request.m
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj) {
                                        JSONObject jSONObject = (JSONObject) obj;
                                        com.google.android.gms.ads.internal.config.g gVar = com.google.android.gms.ads.internal.config.p.a;
                                        com.google.android.gms.ads.internal.client.w.c();
                                        l lVar2 = l.this;
                                        Context context22 = lVar2.b;
                                        SharedPreferences b22 = com.google.android.gms.ads.internal.config.i.b(context22);
                                        if (b22 == null) {
                                            return null;
                                        }
                                        SharedPreferences.Editor edit = b22.edit();
                                        com.google.android.gms.ads.internal.client.w.a();
                                        for (com.google.android.gms.ads.internal.config.g gVar2 : com.google.android.gms.ads.internal.client.w.a().a) {
                                            if (gVar2.a == 1) {
                                                gVar2.d(edit, gVar2.a(jSONObject));
                                            }
                                        }
                                        if (jSONObject != null) {
                                            edit.putString("flag_configuration", jSONObject.toString());
                                        } else {
                                            com.google.android.gms.ads.internal.util.client.h.f("Flag Json is null.");
                                        }
                                        com.google.android.gms.ads.internal.client.w.c();
                                        com.google.android.gms.ads.internal.config.i.a(context22, edit);
                                        SharedPreferences sharedPreferences2 = lVar2.c;
                                        if (sharedPreferences2 == null) {
                                            return null;
                                        }
                                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                        com.google.android.gms.ads.internal.c.j();
                                        edit2.putLong("js_last_update", System.currentTimeMillis()).apply();
                                        return null;
                                    }
                                }, com.google.android.gms.ads.internal.util.future.e.d);
                                if (((Boolean) com.google.android.gms.ads.internal.config.p.ba.g()).booleanValue()) {
                                    eqgc.t(i3, new com.google.android.gms.ads.internal.util.future.g(), com.google.android.gms.ads.internal.util.future.e.d);
                                } else {
                                    com.google.android.gms.ads.internal.util.future.h.a(i3, "persistFlags");
                                }
                            }
                        }, this.b);
                    }
                    eqglVar = a15;
                } else {
                    eqglVar = eqgc.h(new Exception("Signal collection disabled."));
                }
                g(eqglVar, jVar4, nonagonRequestParcel3);
                parcel2.writeNoException();
                return true;
            case 6:
                NonagonRequestParcel nonagonRequestParcel4 = (NonagonRequestParcel) qmr.a(parcel, NonagonRequestParcel.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    jVar3 = queryLocalInterface4 instanceof j ? (j) queryLocalInterface4 : new j(readStrongBinder4);
                }
                fD(parcel);
                int callingUid3 = Binder.getCallingUid();
                if (((Boolean) r.a.d()).booleanValue()) {
                    PoolConfiguration poolConfiguration = nonagonRequestParcel4.i;
                    if (poolConfiguration != null) {
                        if (poolConfiguration.b == 0 || poolConfiguration.c == 0) {
                            nonagonRequestParcel = nonagonRequestParcel4;
                            h = eqgc.h(new Exception("Caching is disabled."));
                        } else {
                            Context context3 = this.a;
                            com.google.android.gms.ads.internal.js.function.k a16 = com.google.android.gms.ads.internal.c.b().a(context3, new VersionInfoParcel(251864004, 251864004), this.e);
                            com.google.android.gms.ads.nonagon.signals.gmscore.f b12 = this.f.b(nonagonRequestParcel4, callingUid3);
                            com.google.android.gms.ads.nonagon.util.concurrent.n d3 = b12.d();
                            final eqgl f2 = f(nonagonRequestParcel4, d3, b12);
                            com.google.android.gms.ads.nonagon.util.logging.cui.k c5 = b12.c();
                            final com.google.android.gms.ads.nonagon.util.logging.cui.b a17 = com.google.android.gms.ads.nonagon.util.logging.cui.a.a(context3, 9);
                            final eqgl e2 = e(f2, d3, a16, c5, a17);
                            nonagonRequestParcel = nonagonRequestParcel4;
                            h = d3.a(com.google.android.gms.ads.nonagon.util.event.a.GET_URL_AND_CACHE_KEY, f2, e2).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.load.service.f
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    eqgl eqglVar2 = e2;
                                    String str4 = ((com.google.android.gms.ads.internal.request.service.a) eqglVar2.get()).i;
                                    com.google.android.gms.ads.internal.request.e.this.a(new n((com.google.android.gms.ads.internal.request.service.a) eqglVar2.get(), (JSONObject) f2.get(), nonagonRequestParcel.h, a17));
                                    return new ByteArrayInputStream(str4.getBytes(StandardCharsets.UTF_8));
                                }
                            }).a();
                        }
                        g(h, jVar3, nonagonRequestParcel);
                        parcel2.writeNoException();
                        return true;
                    }
                    h = eqgc.h(new Exception("Pool configuration missing from request."));
                } else {
                    h = eqgc.h(new Exception("Split request is disabled."));
                }
                nonagonRequestParcel = nonagonRequestParcel4;
                g(h, jVar3, nonagonRequestParcel);
                parcel2.writeNoException();
                return true;
            case 7:
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 == null) {
                    jVar2 = null;
                } else {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    jVar2 = queryLocalInterface5 instanceof j ? (j) queryLocalInterface5 : new j(readStrongBinder5);
                }
                fD(parcel);
                if (((Boolean) r.a.d()).booleanValue()) {
                    h2 = c(readString) == null ? eqgc.h(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(readString)))) : eqgc.i(new com.google.android.gms.ads.nonagon.load.service.l());
                } else {
                    h2 = eqgc.h(new Exception("Split request is disabled."));
                }
                g(h2, jVar2, null);
                parcel2.writeNoException();
                return true;
            case 8:
                DecagonRequestParcel decagonRequestParcel = (DecagonRequestParcel) qmr.a(parcel, DecagonRequestParcel.CREATOR);
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    kVar = queryLocalInterface6 instanceof k ? (k) queryLocalInterface6 : new k(readStrongBinder6);
                }
                fD(parcel);
                if (((Boolean) com.google.android.gms.ads.internal.flag.w.a.d()).booleanValue()) {
                    eqgc.t(this.f.d().b(decagonRequestParcel.a), new com.google.android.gms.ads.nonagon.load.service.k(kVar, decagonRequestParcel), com.google.android.gms.ads.internal.util.future.e.d);
                } else {
                    try {
                        kVar.a("", decagonRequestParcel);
                    } catch (RemoteException unused) {
                    }
                }
                parcel2.writeNoException();
                return true;
        }
    }

    public e(Context context, eqgo eqgoVar, uzg uzgVar, x xVar, ArrayDeque arrayDeque, com.google.android.gms.ads.nonagon.util.logging.cui.n nVar) {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
        com.google.android.gms.ads.internal.config.p.c(context);
        this.a = context;
        this.b = eqgoVar;
        this.c = xVar;
        this.f = uzgVar;
        this.d = arrayDeque;
        this.e = nVar;
    }
}
