package com.google.android.gms.ads.internal.mediation.client;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a extends d {
    @Override // com.google.android.gms.ads.internal.mediation.client.e
    public final boolean a(String str) {
        try {
            return com.google.android.gms.ads.mediation.a.class.isAssignableFrom(Class.forName(str, false, a.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.h.k(defpackage.a.a(str, "Could not load custom event implementation class as Adapter: ", ", assuming old custom event implementation."));
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.e
    public final boolean c(String str) {
        try {
            return com.google.android.gms.ads.mediation.customevent.a.class.isAssignableFrom(Class.forName(str, false, a.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.h.k(defpackage.a.a(str, "Could not load custom event implementation class: ", ", trying Adapter implementation class."));
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.e
    public final f d(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, a.class.getClassLoader());
                if (com.google.android.gms.ads.mediation.c.class.isAssignableFrom(cls)) {
                    return new f((com.google.android.gms.ads.mediation.c) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (com.google.android.gms.ads.mediation.a.class.isAssignableFrom(cls)) {
                    return new f((com.google.android.gms.ads.mediation.a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                com.google.android.gms.ads.internal.util.client.h.k(defpackage.a.a(str, "Could not instantiate mediation adapter: ", " (not a valid adapter)."));
                throw new RemoteException();
            } catch (Throwable unused) {
                com.google.android.gms.ads.internal.util.client.h.d("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new f(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new f(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.h.m(defpackage.a.a(str, "Could not instantiate mediation adapter: ", ". "), th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.ads.internal.mediation.client.e
    public final com.google.android.gms.ads.internal.mediation.client.rtb.f e(String str) {
        return new com.google.android.gms.ads.internal.mediation.client.rtb.f((com.google.android.gms.ads.mediation.rtb.a) Class.forName(str, false, com.google.android.gms.ads.internal.mediation.client.rtb.h.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }
}
