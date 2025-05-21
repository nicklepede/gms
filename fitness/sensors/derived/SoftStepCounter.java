package com.google.android.gms.fitness.sensors.derived;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.fitness.sensors.derived.SoftStepCounter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asot;
import defpackage.bgen;
import defpackage.bgep;
import defpackage.bgeq;
import defpackage.bgey;
import defpackage.bgfe;
import defpackage.bgmo;
import defpackage.bgmp;
import defpackage.bgmq;
import defpackage.bgmr;
import defpackage.bgmu;
import defpackage.bgox;
import defpackage.bgpb;
import defpackage.bgpc;
import defpackage.bgzy;
import defpackage.bhaf;
import defpackage.bwsc;
import defpackage.dyxz;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.fecj;
import defpackage.fhrk;
import defpackage.fhrt;
import defpackage.fhrv;
import defpackage.fhrw;
import defpackage.fhrz;
import defpackage.fhxi;
import defpackage.fhxj;
import defpackage.fodw;
import defpackage.juc;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SoftStepCounter extends TracingBroadcastReceiver implements bgmo {
    private static final asot e = bhaf.a();
    private static final fhrz f = fhrk.aR;
    public final bgpb a;
    public final AtomicLong b;
    public final AtomicInteger c;
    public final bwsc d;
    private final Handler g;
    private final Context h;
    private final fhrw i;
    private final long j;
    private final AtomicReference k;
    private final PendingIntent l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftStepCounter(Context context, Handler handler) {
        super("fitness");
        long q = fodw.a.a().q();
        fodw fodwVar = fodw.a;
        bwsc bwscVar = new bwsc(q, fodwVar.a().o(), (int) fodwVar.a().p(), (float) fodwVar.a().a(), 0.8f);
        this.k = new AtomicReference();
        this.a = new bgpb();
        this.b = new AtomicLong(0L);
        this.c = new AtomicInteger(0);
        this.d = bwscVar;
        this.h = context;
        Intent intent = new Intent("com.google.fitness.soft_step_count.ACTION");
        intent.setPackage(bgen.a.c);
        this.l = PendingIntent.getBroadcast(context, 0, intent, 0);
        int i = bgeq.b;
        fhrt fhrtVar = (fhrt) fhrw.a.v();
        if (!fhrtVar.b.L()) {
            fhrtVar.U();
        }
        fhrw fhrwVar = (fhrw) fhrtVar.b;
        fhrwVar.b |= 4;
        fhrwVar.e = "";
        bgep.g(fhrv.DERIVED, fhrtVar);
        bgep.d(f, fhrtVar);
        bgep.b(bgen.a, fhrtVar);
        bgep.e(bgzy.a(context), fhrtVar);
        bgep.c("soft_step_counter", fhrtVar);
        this.i = bgep.a(fhrtVar);
        this.j = j();
        this.g = handler;
        juc.a(context).c(this, new IntentFilter("com.google.android.location.internal.SAMPLED_SENSOR"));
    }

    public static long j() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final void b(bgmp bgmpVar, long j, long j2, long j3) {
        long j4 = this.j;
        if (j < j4) {
            ((ejhf) ((ejhf) e.i()).ah(4717)).T("Invalid step count emitted. Start time: %d, End time: %d, Now: %d", Long.valueOf(j4), Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        fhxj h = bgey.h(this.i, j4, j, TimeUnit.NANOSECONDS, bgfe.b(this.c.get()));
        fecj fecjVar = (fecj) h.iB(5, null);
        fecjVar.X(h);
        fhxi fhxiVar = (fhxi) fecjVar;
        if (!fhxiVar.b.L()) {
            fhxiVar.U();
        }
        fhxj fhxjVar = (fhxj) fhxiVar.b;
        fhxj fhxjVar2 = fhxj.a;
        fhxjVar.b |= 16;
        fhxjVar.h = j3;
        if (!fhxiVar.b.L()) {
            fhxiVar.U();
        }
        fhxj fhxjVar3 = (fhxj) fhxiVar.b;
        fhxjVar3.b |= 32;
        fhxjVar3.i = j2;
        try {
            bgmpVar.c(eitj.l((fhxj) fhxiVar.Q()));
        } catch (RemoteException e2) {
            ((ejhf) ((ejhf) ((ejhf) e.j()).s(e2)).ah((char) 4716)).x("Couldn't push event back to listener");
        }
    }

    @Override // defpackage.bgmo
    public final eitj c(fhrz fhrzVar) {
        if (h(fhrzVar)) {
            return eitj.l(this.i);
        }
        int i = eitj.d;
        return ejcb.a;
    }

    @Override // defpackage.bgmo
    public final /* synthetic */ enss d() {
        return ensm.a;
    }

    @Override // defpackage.bgmo
    public final enss e(bgmq bgmqVar) {
        if (g(bgmqVar.a)) {
            final bgmp bgmpVar = bgmqVar.b;
            AtomicReference atomicReference = this.k;
            if (!bgox.a(atomicReference, null, bgmpVar)) {
                ((ejhf) ((ejhf) e.j()).ah((char) 4718)).B("already registered to: %s", atomicReference.get());
            }
            long j = bgmqVar.c;
            if (bgmu.c(this.h, null, "fitness...SoftStepCounter", TimeUnit.MICROSECONDS.toMillis(j), TimeUnit.MICROSECONDS.toMillis(bgmqVar.d), bgmr.a(bgmqVar), this.l)) {
                this.g.post(new Runnable() { // from class: bgoz
                    @Override // java.lang.Runnable
                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        SoftStepCounter.this.b(bgmpVar, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis), currentTimeMillis, 0L);
                    }
                });
                this.b.set(TimeUnit.MICROSECONDS.toNanos(j));
                return ensj.i(true);
            }
            ((ejhf) ((ejhf) e.j()).ah((char) 4720)).x("Unable to register to AR for soft step counter.");
        }
        return ensj.i(false);
    }

    @Override // defpackage.bgmo
    public final void f(PrintWriter printWriter, String str) {
        printWriter.append((CharSequence) str).append("SoftStepCounter.Queue").append(":").append((CharSequence) Integer.toString(this.c.get())).append("\n");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            printWriter.append((CharSequence) str).append((CharSequence) ((bgpc) it.next()).toString()).append("\n");
        }
    }

    @Override // defpackage.bgmo
    public final boolean g(fhrw fhrwVar) {
        return this.i.c.equals(fhrwVar.c);
    }

    @Override // defpackage.bgmo
    public final boolean h(fhrz fhrzVar) {
        return fhrzVar.c.equals(f.c);
    }

    @Override // defpackage.bgmo
    public final boolean i(bgmp bgmpVar) {
        if (!bgmu.b(this.h, this.l)) {
            ((ejhf) ((ejhf) e.j()).ah((char) 4722)).x("Unable to unregister from AR for soft step counter");
            return false;
        }
        if (!bgox.a(this.k, bgmpVar, null)) {
            return false;
        }
        this.b.set(0L);
        return true;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        final bgmp bgmpVar = (bgmp) this.k.get();
        if (bgmpVar == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("accelEvents");
        final dyxz dyxzVar = null;
        if (serializableExtra instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) serializableExtra;
            if (!arrayList.isEmpty() && (arrayList.get(0) instanceof dyxz)) {
                dyxzVar = (dyxz) arrayList.get(0);
            }
        }
        if (dyxzVar == null || dyxzVar.c == 0) {
            return;
        }
        bgpb bgpbVar = this.a;
        Handler handler = this.g;
        final bgpc bgpcVar = (bgpc) bgpbVar.a;
        handler.post(new Runnable() { // from class: bgoy
            @Override // java.lang.Runnable
            public final void run() {
                dyxz dyxzVar2 = dyxzVar;
                int i = dyxzVar2.c;
                long d = dyxzVar2.d(i - 1);
                bgpa bgpaVar = new bgpa();
                SoftStepCounter softStepCounter = SoftStepCounter.this;
                bwsc bwscVar = softStepCounter.d;
                bwscVar.a = bgpaVar;
                int i2 = 0;
                long d2 = dyxzVar2.d(0);
                int i3 = 0;
                long j = d2;
                while (i3 < i) {
                    float a = dyxzVar2.a(i3, i2);
                    float a2 = dyxzVar2.a(i3, 1);
                    float a3 = dyxzVar2.a(i3, 2);
                    long d3 = dyxzVar2.d(i3);
                    long max = Math.max(j, d3);
                    bwscVar.a(d3, a, a2, a3);
                    i3++;
                    d2 = d2;
                    j = max;
                    i2 = 0;
                }
                bgmp bgmpVar2 = bgmpVar;
                bgpc bgpcVar2 = bgpcVar;
                bgpc bgpcVar3 = new bgpc(SoftStepCounter.j(), j - d2, bgpaVar.a);
                bgpb bgpbVar2 = softStepCounter.a;
                bgpbVar2.a = bgpcVar3;
                bgpbVar2.b.add(bgpcVar3);
                long currentTimeMillis = System.currentTimeMillis();
                if (bgpcVar2 != null) {
                    long j2 = softStepCounter.b.get();
                    long j3 = j2 + j2;
                    double a4 = bgpcVar2.a() + bgpcVar3.a();
                    long j4 = bgpcVar3.a - bgpcVar3.b;
                    long j5 = j4 - bgpcVar2.a;
                    long j6 = j5 > j3 ? j3 : j5;
                    bgpc bgpcVar4 = new bgpc(j4, j6, (int) ((a4 / 2.0d) * j6));
                    int i4 = bgpcVar4.c;
                    if (i4 > 0) {
                        softStepCounter.c.addAndGet(i4);
                        bgmpVar2 = bgmpVar2;
                        softStepCounter.b(bgmpVar2, bgpcVar4.a, currentTimeMillis, d);
                    } else {
                        bgmpVar2 = bgmpVar2;
                    }
                }
                int i5 = bgpcVar3.c;
                if (i5 > 0) {
                    softStepCounter.c.addAndGet(i5);
                    softStepCounter.b(bgmpVar2, bgpcVar3.a, currentTimeMillis, d);
                }
            }
        });
    }
}
