package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.cache.p;
import com.google.android.gms.ads.internal.request.service.f;
import com.google.android.gms.ads.internal.scionintegration.d;
import com.google.android.gms.ads.internal.state.e;
import com.google.android.gms.ads.internal.util.ac;
import com.google.android.gms.ads.internal.util.ak;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.internal.util.n;
import com.google.android.gms.ads.internal.util.o;
import com.google.android.gms.ads.internal.webview.q;
import defpackage.aurp;
import defpackage.aurt;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c {
    public static final c a = new c();
    public final com.google.android.gms.ads.internal.overlay.a b;
    public final com.google.android.gms.ads.internal.overlay.c c;
    public final q d;
    public final com.google.android.gms.ads.internal.cache.a e;
    public final com.google.android.gms.ads.internal.customtabs.c f;
    public final f g;
    public final com.google.android.gms.ads.internal.util.net.a h;
    public final p i;
    public final com.google.android.gms.ads.internal.util.weaklisteners.a j;
    private final m k;
    private final com.google.android.gms.ads.internal.util.p l;
    private final com.google.android.gms.ads.internal.appcontent.c m;
    private final e n;
    private final aurp o;
    private final com.google.android.gms.ads.internal.csi.c p;
    private final com.google.android.gms.ads.internal.js.function.b q;
    private final ac r;
    private final com.google.android.gms.ads.internal.mediation.c s;
    private final d t;
    private final com.google.android.gms.ads.internal.video.gmsg.b u;

    protected c() {
        com.google.android.gms.ads.internal.overlay.a aVar = new com.google.android.gms.ads.internal.overlay.a();
        com.google.android.gms.ads.internal.overlay.c cVar = new com.google.android.gms.ads.internal.overlay.c();
        m mVar = new m();
        q qVar = new q();
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        int i = Build.VERSION.SDK_INT;
        com.google.android.gms.ads.internal.util.p oVar = i >= 30 ? new o() : i >= 28 ? new n() : i >= 26 ? new n() : i >= 24 ? new n() : new n();
        com.google.android.gms.ads.internal.appcontent.c cVar2 = new com.google.android.gms.ads.internal.appcontent.c();
        e eVar = new e();
        com.google.android.gms.ads.internal.cache.a aVar2 = new com.google.android.gms.ads.internal.cache.a();
        aurt aurtVar = aurt.a;
        com.google.android.gms.ads.internal.csi.c cVar3 = new com.google.android.gms.ads.internal.csi.c();
        com.google.android.gms.ads.internal.customtabs.c cVar4 = new com.google.android.gms.ads.internal.customtabs.c();
        f fVar = new f();
        com.google.android.gms.ads.internal.util.net.a aVar3 = new com.google.android.gms.ads.internal.util.net.a();
        com.google.android.gms.ads.internal.js.function.b bVar = new com.google.android.gms.ads.internal.js.function.b();
        ac acVar = new ac();
        com.google.android.gms.ads.internal.mediation.c cVar5 = new com.google.android.gms.ads.internal.mediation.c();
        new ConcurrentHashMap();
        new AtomicInteger(0);
        p pVar = new p();
        d dVar = new d();
        new ak();
        com.google.android.gms.ads.internal.video.gmsg.b bVar2 = new com.google.android.gms.ads.internal.video.gmsg.b();
        com.google.android.gms.ads.internal.util.weaklisteners.a aVar4 = new com.google.android.gms.ads.internal.util.weaklisteners.a();
        this.b = aVar;
        this.c = cVar;
        this.k = mVar;
        this.d = qVar;
        this.l = oVar;
        this.m = cVar2;
        this.n = eVar;
        this.e = aVar2;
        this.o = aurtVar;
        this.p = cVar3;
        this.f = cVar4;
        this.g = fVar;
        this.h = aVar3;
        this.q = bVar;
        this.r = acVar;
        this.s = cVar5;
        this.i = pVar;
        this.t = dVar;
        this.u = bVar2;
        this.j = aVar4;
    }

    public static com.google.android.gms.ads.internal.appcontent.c a() {
        return a.m;
    }

    public static com.google.android.gms.ads.internal.js.function.b b() {
        return a.q;
    }

    public static d c() {
        return a.t;
    }

    public static e d() {
        return a.n;
    }

    public static m e() {
        return a.k;
    }

    public static com.google.android.gms.ads.internal.util.p f() {
        return a.l;
    }

    public static ac g() {
        return a.r;
    }

    public static com.google.android.gms.ads.internal.video.gmsg.b h() {
        return a.u;
    }

    public static void i() {
        com.google.android.gms.ads.internal.csi.c cVar = a.p;
    }

    public static void j() {
        aurp aurpVar = a.o;
    }

    public static void k() {
        com.google.android.gms.ads.internal.mediation.c cVar = a.s;
    }
}
