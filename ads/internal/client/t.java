package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.bbmt;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public abstract class t {
    private static final ay a;

    static {
        ay ayVar = null;
        try {
            Object newInstance = s.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (newInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) newInstance;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    ayVar = queryLocalInterface instanceof ay ? (ay) queryLocalInterface : new ay(iBinder);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.h.k("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.h.k("Failed to instantiate ClientApi class.");
        }
        a = ayVar;
    }

    private final Object e() {
        ay ayVar = a;
        if (ayVar == null) {
            com.google.android.gms.ads.internal.util.client.h.k("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return c(ayVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.m("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final Object f() {
        try {
            return b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.m("Cannot invoke remote loader.", e);
            return null;
        }
    }

    protected abstract Object a();

    protected abstract Object b();

    protected abstract Object c(ay ayVar);

    public final Object d(Context context) {
        boolean z;
        boolean z2;
        Object e;
        u.b();
        boolean z3 = false;
        if (com.google.android.gms.ads.internal.util.client.f.m(context)) {
            z = false;
        } else {
            com.google.android.gms.ads.internal.util.client.h.d("Google Play Services is not available.");
            z = true;
        }
        boolean z4 = !(bbmt.a(context, ModuleDescriptor.MODULE_ID) <= com.google.android.gms.ads.internal.util.client.l.a(context));
        com.google.android.gms.ads.internal.config.p.c(context);
        if (((Boolean) com.google.android.gms.ads.internal.flag.j.a.d()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) com.google.android.gms.ads.internal.flag.j.b.d()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            e = e();
            if (e == null && !z2) {
                e = f();
            }
        } else {
            Object f = f();
            if (f == null) {
                if (u.d().nextInt(((Long) com.google.android.gms.ads.internal.flag.s.a.d()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    u.b();
                    com.google.android.gms.ads.internal.util.client.f.o(context, u.c().a, bundle);
                }
            }
            e = f == null ? e() : f;
        }
        return e == null ? a() : e;
    }
}
