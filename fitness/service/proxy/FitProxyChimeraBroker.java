package com.google.android.gms.fitness.service.proxy;

import android.content.Context;
import android.content.Intent;
import defpackage.arwm;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asot;
import defpackage.bggi;
import defpackage.bgrt;
import defpackage.bgru;
import defpackage.bgrv;
import defpackage.bgrz;
import defpackage.bgtr;
import defpackage.bgts;
import defpackage.bgtt;
import defpackage.bgtu;
import defpackage.bgtv;
import defpackage.bgtw;
import defpackage.bgtx;
import defpackage.bgty;
import defpackage.bgtz;
import defpackage.bhaf;
import defpackage.bxhl;
import defpackage.eiig;
import defpackage.ejhf;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitProxyChimeraBroker extends bgrv {
    public static final asot g = bhaf.a();
    private static final long p = TimeUnit.SECONDS.toNanos(5);
    public volatile bgru h;
    public volatile bgru i;
    public volatile bgru j;
    public volatile bgru k;
    public volatile bgru l;
    public volatile bgru m;
    public volatile bgru n;
    public CountDownLatch o;
    private bgty q;
    private bgty r;
    private bgty s;
    private bgty t;
    private bgty u;
    private bgty v;
    private bgty w;

    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        arwm.k("Deadlock!");
        try {
            if (!this.o.await(p, TimeUnit.NANOSECONDS)) {
                ((ejhf) ((ejhf) g.j()).ah(4804)).x("Proxy connections timed out");
                return null;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            if (this.o.getCount() > 0) {
                ((ejhf) ((ejhf) g.j()).ah((char) 4806)).x("Proxy dependencies not ready yet");
                return null;
            }
        }
        try {
            return new bgtz(this, str, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.f);
        } catch (NullPointerException e) {
            ((ejhf) ((ejhf) ((ejhf) g.j()).s(e)).ah((char) 4805)).x("Failed to connect to Fit proxy broker dependency");
            return null;
        }
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 17, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv
    public final void f(bggi bggiVar, aslw aslwVar, aslv aslvVar, ExecutorService executorService) {
        super.f(bggiVar, aslwVar, aslvVar, executorService);
        this.o = new CountDownLatch(7);
        bgtr bgtrVar = new bgtr(this);
        this.q = bgtrVar;
        eiig.p(bgtrVar.e("com.google.android.gms.fitness.service.recording.FitRecordingBroker"));
        bgts bgtsVar = new bgts(this);
        this.r = bgtsVar;
        eiig.p(bgtsVar.e("com.google.android.gms.fitness.service.sessions.FitSessionsBroker"));
        bgtt bgttVar = new bgtt(this);
        this.s = bgttVar;
        eiig.p(bgttVar.e("com.google.android.gms.fitness.service.history.FitHistoryBroker"));
        bgtu bgtuVar = new bgtu(this);
        this.t = bgtuVar;
        eiig.p(bgtuVar.e("com.google.android.gms.fitness.service.sensors.FitSensorsBroker"));
        bgtv bgtvVar = new bgtv(this);
        this.u = bgtvVar;
        eiig.p(bgtvVar.e("com.google.android.gms.fitness.service.ble.FitBleBroker"));
        bgtw bgtwVar = new bgtw(this);
        this.v = bgtwVar;
        eiig.p(bgtwVar.e("com.google.android.gms.fitness.service.config.FitConfigBroker"));
        bgtx bgtxVar = new bgtx(this);
        this.w = bgtxVar;
        eiig.p(bgtxVar.e("com.google.android.gms.fitness.service.internal.FitInternalBroker"));
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.GoogleFitnessService.START".equals(intent.getAction());
    }

    @Override // defpackage.bgrv, com.google.android.chimera.Service
    public final void onDestroy() {
        bgty bgtyVar = this.q;
        if (bgtyVar != null) {
            bgtyVar.d();
        }
        bgty bgtyVar2 = this.r;
        if (bgtyVar2 != null) {
            bgtyVar2.d();
        }
        bgty bgtyVar3 = this.s;
        if (bgtyVar3 != null) {
            bgtyVar3.d();
        }
        bgty bgtyVar4 = this.t;
        if (bgtyVar4 != null) {
            bgtyVar4.d();
        }
        bgty bgtyVar5 = this.u;
        if (bgtyVar5 != null) {
            bgtyVar5.d();
        }
        bgty bgtyVar6 = this.v;
        if (bgtyVar6 != null) {
            bgtyVar6.d();
        }
        bgty bgtyVar7 = this.w;
        if (bgtyVar7 != null) {
            bgtyVar7.d();
        }
        super.onDestroy();
    }
}
