package com.google.android.gms.fitness.sensors.derived;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.fitness.sensors.derived.SoftStepCounter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ausn;
import defpackage.bijd;
import defpackage.bijf;
import defpackage.bijg;
import defpackage.bijo;
import defpackage.biju;
import defpackage.bire;
import defpackage.birf;
import defpackage.birg;
import defpackage.birh;
import defpackage.birk;
import defpackage.bitn;
import defpackage.bitr;
import defpackage.bits;
import defpackage.bjeo;
import defpackage.bjev;
import defpackage.bzas;
import defpackage.ebkk;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fgrc;
import defpackage.fkhh;
import defpackage.fkho;
import defpackage.fkhq;
import defpackage.fkhs;
import defpackage.fkht;
import defpackage.fkhw;
import defpackage.fknf;
import defpackage.fkng;
import defpackage.fqwf;
import defpackage.kar;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SoftStepCounter extends TracingBroadcastReceiver implements bire {
    private static final ausn e = bjev.a();
    private static final fkhw f = fkhh.aR;
    public final bitr a;
    public final AtomicLong b;
    public final AtomicInteger c;
    public final bzas d;
    private final Handler g;
    private final Context h;
    private final fkht i;
    private final long j;
    private final AtomicReference k;
    private final PendingIntent l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftStepCounter(Context context, Handler handler) {
        super("fitness");
        fqwf fqwfVar = fqwf.a;
        bzas bzasVar = new bzas(fqwfVar.lK().q(), fqwfVar.lK().o(), (int) fqwfVar.lK().p(), (float) fqwfVar.lK().a(), 0.8f);
        this.k = new AtomicReference();
        this.a = new bitr();
        this.b = new AtomicLong(0L);
        this.c = new AtomicInteger(0);
        this.d = bzasVar;
        this.h = context;
        Intent intent = new Intent("com.google.fitness.soft_step_count.ACTION");
        fkho fkhoVar = bijd.a;
        intent.setPackage(fkhoVar.c);
        this.l = PendingIntent.getBroadcast(context, 0, intent, 0);
        int i = bijg.b;
        fkhq fkhqVar = (fkhq) fkht.a.v();
        if (!fkhqVar.b.L()) {
            fkhqVar.U();
        }
        fkht fkhtVar = (fkht) fkhqVar.b;
        fkhtVar.b |= 4;
        fkhtVar.e = "";
        bijf.g(fkhs.DERIVED, fkhqVar);
        bijf.d(f, fkhqVar);
        bijf.b(fkhoVar, fkhqVar);
        bijf.e(bjeo.a(context), fkhqVar);
        bijf.c("soft_step_counter", fkhqVar);
        this.i = bijf.a(fkhqVar);
        this.j = j();
        this.g = handler;
        kar.a(context).c(this, new IntentFilter("com.google.android.location.internal.SAMPLED_SENSOR"));
    }

    public static long j() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final void b(birf birfVar, long j, long j2, long j3) {
        long j4 = this.j;
        if (j < j4) {
            ((eluo) ((eluo) e.i()).ai(4727)).T("Invalid step count emitted. Start time: %d, End time: %d, Now: %d", Long.valueOf(j4), Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        fkng h = bijo.h(this.i, j4, j, TimeUnit.NANOSECONDS, biju.b(this.c.get()));
        fgrc fgrcVar = (fgrc) h.iQ(5, null);
        fgrcVar.X(h);
        fknf fknfVar = (fknf) fgrcVar;
        if (!fknfVar.b.L()) {
            fknfVar.U();
        }
        fkng fkngVar = (fkng) fknfVar.b;
        fkng fkngVar2 = fkng.a;
        fkngVar.b |= 16;
        fkngVar.h = j3;
        if (!fknfVar.b.L()) {
            fknfVar.U();
        }
        fkng fkngVar3 = (fkng) fknfVar.b;
        fkngVar3.b |= 32;
        fkngVar3.i = j2;
        try {
            birfVar.c(elgo.l((fkng) fknfVar.Q()));
        } catch (RemoteException e2) {
            ((eluo) ((eluo) ((eluo) e.j()).s(e2)).ai((char) 4726)).x("Couldn't push event back to listener");
        }
    }

    @Override // defpackage.bire
    public final elgo c(fkhw fkhwVar) {
        if (h(fkhwVar)) {
            return elgo.l(this.i);
        }
        int i = elgo.d;
        return elpg.a;
    }

    @Override // defpackage.bire
    public final /* synthetic */ eqgl d() {
        return eqgf.a;
    }

    @Override // defpackage.bire
    public final eqgl e(birg birgVar) {
        if (g(birgVar.a)) {
            final birf birfVar = birgVar.b;
            AtomicReference atomicReference = this.k;
            if (!bitn.a(atomicReference, null, birfVar)) {
                ((eluo) ((eluo) e.j()).ai((char) 4728)).B("already registered to: %s", atomicReference.get());
            }
            long j = birgVar.c;
            if (birk.c(this.h, null, "fitness...SoftStepCounter", TimeUnit.MICROSECONDS.toMillis(j), TimeUnit.MICROSECONDS.toMillis(birgVar.d), birh.a(birgVar), this.l)) {
                this.g.post(new Runnable() { // from class: bitp
                    @Override // java.lang.Runnable
                    public final void run() {
                        long currentTimeMillis = System.currentTimeMillis();
                        SoftStepCounter.this.b(birfVar, TimeUnit.MILLISECONDS.toNanos(currentTimeMillis), currentTimeMillis, 0L);
                    }
                });
                this.b.set(TimeUnit.MICROSECONDS.toNanos(j));
                return eqgc.i(true);
            }
            ((eluo) ((eluo) e.j()).ai((char) 4730)).x("Unable to register to AR for soft step counter.");
        }
        return eqgc.i(false);
    }

    @Override // defpackage.bire
    public final void f(PrintWriter printWriter, String str) {
        printWriter.append((CharSequence) str).append("SoftStepCounter.Queue").append(":").append((CharSequence) Integer.toString(this.c.get())).append("\n");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            printWriter.append((CharSequence) str).append((CharSequence) ((bits) it.next()).toString()).append("\n");
        }
    }

    @Override // defpackage.bire
    public final boolean g(fkht fkhtVar) {
        return this.i.c.equals(fkhtVar.c);
    }

    @Override // defpackage.bire
    public final boolean h(fkhw fkhwVar) {
        return fkhwVar.c.equals(f.c);
    }

    @Override // defpackage.bire
    public final boolean i(birf birfVar) {
        if (!birk.b(this.h, this.l)) {
            ((eluo) ((eluo) e.j()).ai((char) 4732)).x("Unable to unregister from AR for soft step counter");
            return false;
        }
        if (!bitn.a(this.k, birfVar, null)) {
            return false;
        }
        this.b.set(0L);
        return true;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        final birf birfVar = (birf) this.k.get();
        if (birfVar == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("accelEvents");
        final ebkk ebkkVar = null;
        if (serializableExtra instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) serializableExtra;
            if (!arrayList.isEmpty() && (arrayList.get(0) instanceof ebkk)) {
                ebkkVar = (ebkk) arrayList.get(0);
            }
        }
        if (ebkkVar == null || ebkkVar.c == 0) {
            return;
        }
        bitr bitrVar = this.a;
        Handler handler = this.g;
        final bits bitsVar = (bits) bitrVar.a;
        handler.post(new Runnable() { // from class: bito
            @Override // java.lang.Runnable
            public final void run() {
                ebkk ebkkVar2 = ebkkVar;
                int i = ebkkVar2.c;
                long d = ebkkVar2.d(i - 1);
                bitq bitqVar = new bitq();
                SoftStepCounter softStepCounter = SoftStepCounter.this;
                bzas bzasVar = softStepCounter.d;
                bzasVar.a = bitqVar;
                int i2 = 0;
                long d2 = ebkkVar2.d(0);
                int i3 = 0;
                long j = d2;
                while (i3 < i) {
                    float a = ebkkVar2.a(i3, i2);
                    float a2 = ebkkVar2.a(i3, 1);
                    float a3 = ebkkVar2.a(i3, 2);
                    long d3 = ebkkVar2.d(i3);
                    long max = Math.max(j, d3);
                    bzasVar.a(d3, a, a2, a3);
                    i3++;
                    d2 = d2;
                    j = max;
                    i2 = 0;
                }
                birf birfVar2 = birfVar;
                bits bitsVar2 = bitsVar;
                bits bitsVar3 = new bits(SoftStepCounter.j(), j - d2, bitqVar.a);
                bitr bitrVar2 = softStepCounter.a;
                bitrVar2.a = bitsVar3;
                bitrVar2.b.add(bitsVar3);
                long currentTimeMillis = System.currentTimeMillis();
                if (bitsVar2 != null) {
                    long j2 = softStepCounter.b.get();
                    long j3 = j2 + j2;
                    double a4 = bitsVar2.a() + bitsVar3.a();
                    long j4 = bitsVar3.a - bitsVar3.b;
                    long j5 = j4 - bitsVar2.a;
                    long j6 = j5 > j3 ? j3 : j5;
                    bits bitsVar4 = new bits(j4, j6, (int) ((a4 / 2.0d) * j6));
                    int i4 = bitsVar4.c;
                    if (i4 > 0) {
                        softStepCounter.c.addAndGet(i4);
                        birfVar2 = birfVar2;
                        softStepCounter.b(birfVar2, bitsVar4.a, currentTimeMillis, d);
                    } else {
                        birfVar2 = birfVar2;
                    }
                }
                int i5 = bitsVar3.c;
                if (i5 > 0) {
                    softStepCounter.c.addAndGet(i5);
                    softStepCounter.b(birfVar2, bitsVar3.a, currentTimeMillis, d);
                }
            }
        });
    }
}
