package com.google.android.gms.fitness.service.proxy;

import android.content.Context;
import android.content.Intent;
import defpackage.atzb;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.ausn;
import defpackage.biky;
import defpackage.biwj;
import defpackage.biwk;
import defpackage.biwl;
import defpackage.biwp;
import defpackage.biyh;
import defpackage.biyi;
import defpackage.biyj;
import defpackage.biyk;
import defpackage.biyl;
import defpackage.biym;
import defpackage.biyn;
import defpackage.biyo;
import defpackage.biyp;
import defpackage.bjev;
import defpackage.bzqb;
import defpackage.ekvl;
import defpackage.eluo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitProxyChimeraBroker extends biwl {
    public static final ausn g = bjev.a();
    private static final long p = TimeUnit.SECONDS.toNanos(5);
    public volatile biwk h;
    public volatile biwk i;
    public volatile biwk j;
    public volatile biwk k;
    public volatile biwk l;
    public volatile biwk m;
    public volatile biwk n;
    public CountDownLatch o;
    private biyo q;
    private biyo r;
    private biyo s;
    private biyo t;
    private biyo u;
    private biyo v;
    private biyo w;

    @Override // defpackage.biwl
    public final /* bridge */ /* synthetic */ biwj b(String str) {
        atzb.k("Deadlock!");
        try {
            if (!this.o.await(p, TimeUnit.NANOSECONDS)) {
                ((eluo) ((eluo) g.j()).ai(4814)).x("Proxy connections timed out");
                return null;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            if (this.o.getCount() > 0) {
                ((eluo) ((eluo) g.j()).ai((char) 4816)).x("Proxy dependencies not ready yet");
                return null;
            }
        }
        try {
            return new biyp(this, str, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f);
        } catch (NullPointerException e) {
            ((eluo) ((eluo) ((eluo) g.j()).s(e)).ai((char) 4815)).x("Failed to connect to Fit proxy broker dependency");
            return null;
        }
    }

    @Override // defpackage.biwl
    protected final bzqb c(Context context, biwp biwpVar) {
        return new bzqb(context, 17, d(), 3, biwpVar);
    }

    @Override // defpackage.biwl
    public final void f(biky bikyVar, aupq aupqVar, aupp auppVar, ExecutorService executorService) {
        super.f(bikyVar, aupqVar, auppVar, executorService);
        this.o = new CountDownLatch(7);
        biyh biyhVar = new biyh(this);
        this.q = biyhVar;
        ekvl.q(biyhVar.e("com.google.android.gms.fitness.service.recording.FitRecordingBroker"));
        biyi biyiVar = new biyi(this);
        this.r = biyiVar;
        ekvl.q(biyiVar.e("com.google.android.gms.fitness.service.sessions.FitSessionsBroker"));
        biyj biyjVar = new biyj(this);
        this.s = biyjVar;
        ekvl.q(biyjVar.e("com.google.android.gms.fitness.service.history.FitHistoryBroker"));
        biyk biykVar = new biyk(this);
        this.t = biykVar;
        ekvl.q(biykVar.e("com.google.android.gms.fitness.service.sensors.FitSensorsBroker"));
        biyl biylVar = new biyl(this);
        this.u = biylVar;
        ekvl.q(biylVar.e("com.google.android.gms.fitness.service.ble.FitBleBroker"));
        biym biymVar = new biym(this);
        this.v = biymVar;
        ekvl.q(biymVar.e("com.google.android.gms.fitness.service.config.FitConfigBroker"));
        biyn biynVar = new biyn(this);
        this.w = biynVar;
        ekvl.q(biynVar.e("com.google.android.gms.fitness.service.internal.FitInternalBroker"));
    }

    @Override // defpackage.biwl
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.GoogleFitnessService.START".equals(intent.getAction());
    }

    @Override // defpackage.biwl, com.google.android.chimera.Service
    public final void onDestroy() {
        biyo biyoVar = this.q;
        if (biyoVar != null) {
            biyoVar.d();
        }
        biyo biyoVar2 = this.r;
        if (biyoVar2 != null) {
            biyoVar2.d();
        }
        biyo biyoVar3 = this.s;
        if (biyoVar3 != null) {
            biyoVar3.d();
        }
        biyo biyoVar4 = this.t;
        if (biyoVar4 != null) {
            biyoVar4.d();
        }
        biyo biyoVar5 = this.u;
        if (biyoVar5 != null) {
            biyoVar5.d();
        }
        biyo biyoVar6 = this.v;
        if (biyoVar6 != null) {
            biyoVar6.d();
        }
        biyo biyoVar7 = this.w;
        if (biyoVar7 != null) {
            biyoVar7.d();
        }
        super.onDestroy();
    }
}
