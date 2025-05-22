package com.google.android.gms.wearable.service;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.dncf;
import defpackage.dndc;
import defpackage.dnde;
import defpackage.dnhn;
import defpackage.dnho;
import defpackage.dnii;
import defpackage.dnjl;
import defpackage.dnql;
import defpackage.domq;
import defpackage.done;
import defpackage.doos;
import defpackage.doov;
import defpackage.douk;
import defpackage.douo;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fwda;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WearableControlChimeraService extends TracingIntentService {
    public WearableControlChimeraService() {
        super("Wear_ControlService");
    }

    private final void b() {
        Log.d("Wear_ControlService", "startWearableServices");
        startService(new Intent().setClassName(this, "com.google.android.gms.wearable.service.WearableService"));
    }

    private static final void c(final String str) {
        final dnql e;
        if (domq.b() != null) {
            domq.b().f(str);
        }
        if (done.c() != null) {
            done.c().h(str);
        }
        if (dnde.m() != null) {
            dnde m = dnde.m();
            douk.e("CapabilityService", "handlePackageAdded(%s)", douo.a(str));
            dncf k = m.k(str);
            if (k != null) {
                m.w(k);
            }
        }
        fwda.d();
        if (!fwda.c() || (e = doov.e()) == null) {
            return;
        }
        eqgc.l(new Runnable() { // from class: dnpy
            @Override // java.lang.Runnable
            public final void run() {
                Lock lock;
                dnql dnqlVar = dnql.this;
                Lock lock2 = dnqlVar.m;
                lock2.lock();
                String str2 = str;
                try {
                    try {
                    } catch (PackageManager.NameNotFoundException e2) {
                        douk.c("AppCatalogService", e2, "handlePackageAdded - Could not construct AppKey. No name found.", new Object[0]);
                        lock = dnqlVar.m;
                    } catch (IllegalArgumentException e3) {
                        douk.c("AppCatalogService", e3, "handlePackageAdded - Could not construct AppKey. Illegal arguments.", new Object[0]);
                        lock = dnqlVar.m;
                    }
                    if (dnqlVar.l.get() && dnqlVar.f) {
                        dncf a = dnch.a(dnqlVar.b, str2);
                        dnps dnpsVar = dnqlVar.j;
                        String str3 = dnqlVar.g;
                        dnpsVar.e.lock();
                        try {
                            Set d = dnpsVar.d(str3);
                            if (d.add(a)) {
                                dnpsVar.f(str3, d);
                            }
                            dnpsVar.e.unlock();
                            dnqlVar.a(a.x(str2, "Local package added: "), "handlePackageAdded");
                            dnqlVar.d();
                            lock = dnqlVar.m;
                            lock.unlock();
                            return;
                        } catch (Throwable th) {
                            dnpsVar.e.unlock();
                            throw th;
                        }
                    }
                    lock2.unlock();
                } catch (Throwable th2) {
                    dnqlVar.m.unlock();
                    throw th2;
                }
            }
        }, e.k).hD(new Runnable() { // from class: dnpz
            @Override // java.lang.Runnable
            public final void run() {
                int i = dnql.n;
                douk.e("AppCatalogService", "handlePackageAdded - packageName: %s", str);
            }
        }, eqex.a);
    }

    private static final void d(final String str) {
        final dnql e;
        if (dnde.m() != null) {
            dnde.m().x(str);
        }
        if (dnii.m() != null) {
            dnii.m().H(str);
        }
        if (done.c() != null) {
            done c = done.c();
            ConcurrentHashMap concurrentHashMap = c.i;
            Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dncf dncfVar = (dncf) it.next();
                if (str.equals(dncfVar.c)) {
                    Iterator it2 = c.k.values().iterator();
                    while (it2.hasNext()) {
                        ((Map) it2.next()).remove(dncfVar);
                    }
                    concurrentHashMap.remove(dncfVar);
                    c.i();
                    c.k();
                }
            }
        }
        if (domq.b() != null) {
            domq b = domq.b();
            if (b.d.contains(str)) {
                b.g(str, b.f);
            }
        }
        fwda.d();
        if (!fwda.c() || (e = doov.e()) == null) {
            return;
        }
        eqgc.l(new Runnable() { // from class: dnqh
            @Override // java.lang.Runnable
            public final void run() {
                final String str2;
                final dnql dnqlVar = dnql.this;
                Lock lock = dnqlVar.m;
                lock.lock();
                try {
                    if (dnqlVar.l.get() && dnqlVar.f) {
                        final dnps dnpsVar = dnqlVar.j;
                        final String str3 = dnqlVar.g;
                        dnpsVar.e.lock();
                        try {
                            Set d = dnpsVar.d(str3);
                            Optional empty = Optional.empty();
                            Iterator it3 = d.iterator();
                            while (true) {
                                boolean hasNext = it3.hasNext();
                                str2 = str;
                                if (!hasNext) {
                                    break;
                                }
                                dncf dncfVar2 = (dncf) it3.next();
                                if (dncfVar2.b.equals(str2)) {
                                    empty = Optional.of(dncfVar2);
                                    break;
                                }
                            }
                            empty.ifPresent(new Consumer() { // from class: dnpr
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void u(Object obj) {
                                    dnps dnpsVar2 = dnps.this;
                                    dncf dncfVar3 = (dncf) obj;
                                    dnpsVar2.e.lock();
                                    String str4 = str3;
                                    try {
                                        Set d2 = dnpsVar2.d(str4);
                                        if (d2.remove(dncfVar3)) {
                                            dnpsVar2.f(str4, d2);
                                        }
                                    } finally {
                                        dnpsVar2.e.unlock();
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            dnpsVar.e.unlock();
                            empty.ifPresent(new Consumer() { // from class: dnqb
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void u(Object obj) {
                                    dnql dnqlVar2 = dnql.this;
                                    dnqlVar2.a("Local package removed: ".concat(String.valueOf(str2)), "handlePackageRemoved");
                                    dnqlVar2.d();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return;
                        } catch (Throwable th) {
                            dnpsVar.e.unlock();
                            throw th;
                        }
                    }
                    lock.unlock();
                } finally {
                    dnqlVar.m.unlock();
                }
            }
        }, e.k).hD(new Runnable() { // from class: dnqi
            @Override // java.lang.Runnable
            public final void run() {
                int i = dnql.n;
                douk.e("AppCatalogService", "handlePackageRemoved - packageName: %s", str);
            }
        }, eqex.a);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        String action = intent.getAction();
        String schemeSpecificPart = intent.getData() != null ? intent.getData().getSchemeSpecificPart() : null;
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_STARTUP")) {
            b();
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_ADDED")) {
            b();
            c(schemeSpecificPart);
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_WEARABLE_APP_PACKAGE_REMOVED")) {
            d(schemeSpecificPart);
            doos.a(getApplicationContext(), false);
            Log.d("Wear_ControlService", "stopWearableServices");
            stopService(new Intent().setClassName(this, "com.google.android.gms.wearable.service.WearableService"));
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_PACKAGE_ADDED")) {
            c(schemeSpecificPart);
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_PACKAGE_CHANGED")) {
            if (domq.b() != null) {
                domq.b().f(schemeSpecificPart);
            }
            if (done.c() != null) {
                done.c().h(schemeSpecificPart);
            }
            if (dnde.m() != null) {
                dnde m = dnde.m();
                douk.e("CapabilityService", "handlePackageChanged(%s)", douo.a(schemeSpecificPart));
                dncf k = m.k(schemeSpecificPart);
                if (k != null) {
                    m.w(k);
                    return;
                }
                return;
            }
            return;
        }
        if (!Objects.equals(action, "com.google.android.gms.wearable.ACTION_PACKAGE_DATA_CLEARED")) {
            if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_PACKAGE_REMOVED")) {
                d(schemeSpecificPart);
                return;
            } else {
                Log.w("Wear_ControlService", "started with invalid action: ".concat(String.valueOf(action)));
                return;
            }
        }
        if (dnde.m() != null) {
            dnde m2 = dnde.m();
            if (m2.e.h(schemeSpecificPart)) {
                douk.e("CapabilityService", "handlePackageDataCleared(%s) with home app package name, skipping...", douo.a(schemeSpecificPart));
            } else {
                douk.e("CapabilityService", "handleAppDataCleared(%s)", douo.a(schemeSpecificPart));
                dncf k2 = m2.k(schemeSpecificPart);
                if (k2 != null) {
                    douk.e("CapabilityService", "handleAppDataCleared(%s)", k2);
                    dnjl a = m2.h.a(k2.b);
                    try {
                        HashSet hashSet = new HashSet();
                        Cursor d = m2.d(k2, m2.j.a().a);
                        try {
                            d.moveToFirst();
                            while (!d.isAfterLast()) {
                                dnhn f = dnho.f(d);
                                String s = dnde.s(f);
                                if (dnde.l(f.b) == dndc.DYNAMIC) {
                                    hashSet.add(s);
                                }
                            }
                            if (d != null) {
                                d.close();
                            }
                            String str = m2.j.a().a;
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                m2.C(k2, str, (String) it.next());
                            }
                            a.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            a.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        }
        if (dnii.m() != null) {
            dnii.m().H(schemeSpecificPart);
        }
    }
}
