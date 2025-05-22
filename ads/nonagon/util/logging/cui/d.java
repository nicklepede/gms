package com.google.android.gms.ads.nonagon.util.logging.cui;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.ekwo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class d implements b {
    public final int m;
    private final Context p;
    public long a = 0;
    public long b = -1;
    public boolean c = false;
    public int n = 2;
    public int o = 2;
    public int d = 0;
    public final String e = "";
    public final String f = "";
    public String g = "";
    public String h = "";
    public o i = o.SCAR_REQUEST_TYPE_UNSPECIFIED;
    public String j = "";
    public String k = "";
    public String l = "";
    private boolean q = false;
    private boolean r = false;

    public d(Context context, int i) {
        this.p = context;
        this.m = i;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final synchronized boolean a() {
        return this.r;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final boolean b() {
        return !TextUtils.isEmpty(this.g);
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    public final synchronized e c() {
        if (this.q) {
            return null;
        }
        this.q = true;
        if (!this.r) {
            k();
        }
        if (this.b < 0) {
            l();
        }
        return new e(this);
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final synchronized void h() {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bo.g()).booleanValue()) {
            this.l = "Failed loading new engine";
        }
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final synchronized void d() {
        this.g = null;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final synchronized void e() {
        this.h = null;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final synchronized void f(o oVar) {
        this.i = oVar;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final synchronized void i(boolean z) {
        this.c = z;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final synchronized void j(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.config.p.bo.g()).booleanValue()) {
            this.k = com.google.android.gms.ads.internal.report.d.d(th);
            this.j = (String) ekwo.e('\n').l(com.google.android.gms.ads.internal.report.d.c(th)).iterator().next();
        }
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final synchronized void k() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.p f = com.google.android.gms.ads.internal.c.f();
        Context context = this.p;
        this.d = f.c(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.o = i;
        com.google.android.gms.ads.internal.c.j();
        this.a = SystemClock.elapsedRealtime();
        this.r = true;
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final synchronized void l() {
        com.google.android.gms.ads.internal.c.j();
        this.b = SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.ads.nonagon.util.logging.cui.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final synchronized void g(int i) {
        this.n = i;
    }
}
