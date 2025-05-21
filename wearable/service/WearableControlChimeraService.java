package com.google.android.gms.wearable.service;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.util.Log;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.dkqm;
import defpackage.dkrj;
import defpackage.dkrl;
import defpackage.dkvu;
import defpackage.dkvv;
import defpackage.dkwp;
import defpackage.dkxs;
import defpackage.dler;
import defpackage.dmbe;
import defpackage.dmbs;
import defpackage.dmdg;
import defpackage.dmdj;
import defpackage.dmiw;
import defpackage.dmja;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fthl;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        final dler e;
        if (dmbe.b() != null) {
            dmbe.b().f(str);
        }
        if (dmbs.c() != null) {
            dmbs.c().h(str);
        }
        if (dkrl.m() != null) {
            dkrl m = dkrl.m();
            dmiw.e("CapabilityService", "handlePackageAdded(%s)", dmja.a(str));
            dkqm k = m.k(str);
            if (k != null) {
                m.w(k);
            }
        }
        fthl.d();
        if (!fthl.c() || (e = dmdj.e()) == null) {
            return;
        }
        ensj.l(new Runnable() { // from class: dlee
            @Override // java.lang.Runnable
            public final void run() {
                Lock lock;
                dler dlerVar = dler.this;
                Lock lock2 = dlerVar.m;
                lock2.lock();
                String str2 = str;
                try {
                    try {
                    } catch (PackageManager.NameNotFoundException e2) {
                        dmiw.c("AppCatalogService", e2, "handlePackageAdded - Could not construct AppKey. No name found.", new Object[0]);
                        lock = dlerVar.m;
                    } catch (IllegalArgumentException e3) {
                        dmiw.c("AppCatalogService", e3, "handlePackageAdded - Could not construct AppKey. Illegal arguments.", new Object[0]);
                        lock = dlerVar.m;
                    }
                    if (dlerVar.l.get() && dlerVar.f) {
                        dkqm a = dkqo.a(dlerVar.b, str2);
                        dldy dldyVar = dlerVar.j;
                        String str3 = dlerVar.g;
                        dldyVar.e.lock();
                        try {
                            Set d = dldyVar.d(str3);
                            if (d.add(a)) {
                                dldyVar.f(str3, d);
                            }
                            dldyVar.e.unlock();
                            dlerVar.a(a.x(str2, "Local package added: "), "handlePackageAdded");
                            dlerVar.d();
                            lock = dlerVar.m;
                            lock.unlock();
                            return;
                        } catch (Throwable th) {
                            dldyVar.e.unlock();
                            throw th;
                        }
                    }
                    lock2.unlock();
                } catch (Throwable th2) {
                    dlerVar.m.unlock();
                    throw th2;
                }
            }
        }, e.k).hn(new Runnable() { // from class: dlef
            @Override // java.lang.Runnable
            public final void run() {
                int i = dler.n;
                dmiw.e("AppCatalogService", "handlePackageAdded - packageName: %s", str);
            }
        }, enre.a);
    }

    private static final void d(final String str) {
        final dler e;
        if (dkrl.m() != null) {
            dkrl.m().x(str);
        }
        if (dkwp.m() != null) {
            dkwp.m().H(str);
        }
        if (dmbs.c() != null) {
            dmbs c = dmbs.c();
            ConcurrentHashMap concurrentHashMap = c.i;
            Iterator it = concurrentHashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dkqm dkqmVar = (dkqm) it.next();
                if (str.equals(dkqmVar.c)) {
                    Iterator it2 = c.k.values().iterator();
                    while (it2.hasNext()) {
                        ((Map) it2.next()).remove(dkqmVar);
                    }
                    concurrentHashMap.remove(dkqmVar);
                    c.i();
                    c.k();
                }
            }
        }
        if (dmbe.b() != null) {
            dmbe b = dmbe.b();
            if (b.d.contains(str)) {
                b.g(str, b.f);
            }
        }
        fthl.d();
        if (!fthl.c() || (e = dmdj.e()) == null) {
            return;
        }
        ensj.l(new Runnable() { // from class: dlen
            @Override // java.lang.Runnable
            public final void run() {
                final String str2;
                final dler dlerVar = dler.this;
                Lock lock = dlerVar.m;
                lock.lock();
                try {
                    if (dlerVar.l.get() && dlerVar.f) {
                        final dldy dldyVar = dlerVar.j;
                        final String str3 = dlerVar.g;
                        dldyVar.e.lock();
                        try {
                            Set d = dldyVar.d(str3);
                            Optional empty = Optional.empty();
                            Iterator it3 = d.iterator();
                            while (true) {
                                boolean hasNext = it3.hasNext();
                                str2 = str;
                                if (!hasNext) {
                                    break;
                                }
                                dkqm dkqmVar2 = (dkqm) it3.next();
                                if (dkqmVar2.b.equals(str2)) {
                                    empty = Optional.of(dkqmVar2);
                                    break;
                                }
                            }
                            empty.ifPresent(new Consumer() { // from class: dldx
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void q(Object obj) {
                                    dldy dldyVar2 = dldy.this;
                                    dkqm dkqmVar3 = (dkqm) obj;
                                    dldyVar2.e.lock();
                                    String str4 = str3;
                                    try {
                                        Set d2 = dldyVar2.d(str4);
                                        if (d2.remove(dkqmVar3)) {
                                            dldyVar2.f(str4, d2);
                                        }
                                    } finally {
                                        dldyVar2.e.unlock();
                                    }
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            dldyVar.e.unlock();
                            empty.ifPresent(new Consumer() { // from class: dleh
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void q(Object obj) {
                                    dler dlerVar2 = dler.this;
                                    dlerVar2.a("Local package removed: ".concat(String.valueOf(str2)), "handlePackageRemoved");
                                    dlerVar2.d();
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return;
                        } catch (Throwable th) {
                            dldyVar.e.unlock();
                            throw th;
                        }
                    }
                    lock.unlock();
                } finally {
                    dlerVar.m.unlock();
                }
            }
        }, e.k).hn(new Runnable() { // from class: dleo
            @Override // java.lang.Runnable
            public final void run() {
                int i = dler.n;
                dmiw.e("AppCatalogService", "handlePackageRemoved - packageName: %s", str);
            }
        }, enre.a);
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
            dmdg.a(getApplicationContext(), false);
            Log.d("Wear_ControlService", "stopWearableServices");
            stopService(new Intent().setClassName(this, "com.google.android.gms.wearable.service.WearableService"));
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_PACKAGE_ADDED")) {
            c(schemeSpecificPart);
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.wearable.ACTION_PACKAGE_CHANGED")) {
            if (dmbe.b() != null) {
                dmbe.b().f(schemeSpecificPart);
            }
            if (dmbs.c() != null) {
                dmbs.c().h(schemeSpecificPart);
            }
            if (dkrl.m() != null) {
                dkrl m = dkrl.m();
                dmiw.e("CapabilityService", "handlePackageChanged(%s)", dmja.a(schemeSpecificPart));
                dkqm k = m.k(schemeSpecificPart);
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
        if (dkrl.m() != null) {
            dkrl m2 = dkrl.m();
            if (m2.e.h(schemeSpecificPart)) {
                dmiw.e("CapabilityService", "handlePackageDataCleared(%s) with home app package name, skipping...", dmja.a(schemeSpecificPart));
            } else {
                dmiw.e("CapabilityService", "handleAppDataCleared(%s)", dmja.a(schemeSpecificPart));
                dkqm k2 = m2.k(schemeSpecificPart);
                if (k2 != null) {
                    dmiw.e("CapabilityService", "handleAppDataCleared(%s)", k2);
                    dkxs a = m2.h.a(k2.b);
                    try {
                        HashSet hashSet = new HashSet();
                        Cursor d = m2.d(k2, m2.j.a().a);
                        try {
                            d.moveToFirst();
                            while (!d.isAfterLast()) {
                                dkvu f = dkvv.f(d);
                                String q = dkrl.q(f);
                                if (dkrl.l(f.b) == dkrj.DYNAMIC) {
                                    hashSet.add(q);
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
        if (dkwp.m() != null) {
            dkwp.m().H(schemeSpecificPart);
        }
    }
}
