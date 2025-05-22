package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import android.os.Looper;
import defpackage.eqgl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class g {
    public int A;
    public int B;
    public long C;
    public boolean b;
    public eqgl d;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public String i;
    public String j;
    public boolean t;
    public boolean u;
    public String v;
    public String w;
    public boolean x;
    public String y;
    public String z;
    public final Object a = new Object();
    public final List c = new ArrayList();
    public com.google.android.gms.ads.internal.appcontent.d e = null;
    public boolean h = true;
    public boolean k = true;
    public String l = "-1";
    public int m = -1;
    public com.google.android.gms.ads.internal.state.a n = new com.google.android.gms.ads.internal.state.a("", 0);
    public long o = 0;
    public long p = 0;
    public int q = -1;
    public int r = 0;
    public Set s = Collections.EMPTY_SET;

    public g() {
        new JSONObject();
        this.t = true;
        this.u = true;
        this.v = null;
        this.w = "";
        this.x = false;
        this.y = "";
        this.z = "{}";
        this.A = -1;
        this.B = -1;
        this.C = 0L;
    }

    public final void a() {
        eqgl eqglVar = this.d;
        if (eqglVar == null || eqglVar.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            int i = c.a;
            com.google.android.gms.ads.internal.util.client.h.m("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            int i2 = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            int i22 = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            int i222 = c.a;
            com.google.android.gms.ads.internal.util.client.h.h("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    public final void b() {
        com.google.android.gms.ads.internal.util.future.e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.e
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                g gVar = g.this;
                if (gVar.b) {
                    gVar.a();
                    synchronized (gVar.a) {
                        z = gVar.t;
                    }
                    if (z) {
                        gVar.a();
                        synchronized (gVar.a) {
                            z2 = gVar.u;
                        }
                        if (z2) {
                            return;
                        }
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.flag.f.b.d()).booleanValue()) {
                        synchronized (gVar.a) {
                            if (Looper.getMainLooper() == null) {
                                return;
                            }
                            if (gVar.e == null) {
                                gVar.e = new com.google.android.gms.ads.internal.appcontent.d();
                            }
                            com.google.android.gms.ads.internal.appcontent.d dVar = gVar.e;
                            synchronized (dVar.b) {
                                if (dVar.a) {
                                    int i = c.a;
                                    com.google.android.gms.ads.internal.util.client.h.d("Content hash thread already started, quitting...");
                                } else {
                                    dVar.a = true;
                                    dVar.start();
                                }
                            }
                            int i2 = c.a;
                            com.google.android.gms.ads.internal.util.client.h.i("start fetching content...");
                        }
                    }
                }
            }
        });
    }
}
