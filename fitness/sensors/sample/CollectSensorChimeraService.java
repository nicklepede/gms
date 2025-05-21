package com.google.android.gms.fitness.sensors.sample;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import defpackage.arfh;
import defpackage.asmb;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.asot;
import defpackage.bgap;
import defpackage.bgmo;
import defpackage.bgmq;
import defpackage.bgop;
import defpackage.bgqo;
import defpackage.bgqw;
import defpackage.bgqz;
import defpackage.bgra;
import defpackage.bgrb;
import defpackage.bgrd;
import defpackage.bgre;
import defpackage.bhaf;
import defpackage.deqr;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eike;
import defpackage.eivv;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.entj;
import defpackage.fodm;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CollectSensorChimeraService extends arfh {
    public static final asot b = bhaf.a();
    public final asnv c;
    public final ScheduledExecutorService d;
    private bgre e;
    private bgra f;

    public CollectSensorChimeraService() {
        this(asnz.a, new asmb(1, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [enss] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [eitj, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    @Override // defpackage.aslt
    protected final void b(final Intent intent) {
        int intExtra;
        bgmq a;
        bgqw bgqwVar;
        boolean z;
        eiid eiidVar;
        boolean z2;
        enss i;
        enss enssVar;
        ?? r0;
        bgqz bgqzVar;
        int intExtra2 = intent.getIntExtra("delay_trigger_seq_no", -1);
        if (intExtra2 != -1) {
            bgra bgraVar = this.f;
            synchronized (bgra.a) {
                bgqzVar = (bgqz) bgra.b.remove(Integer.valueOf(intExtra2));
            }
            if (bgqzVar == null) {
                return;
            }
            bgraVar.c.submit(bgqzVar.a).isDone();
            return;
        }
        intent.getIntExtra("request_id", -1);
        bgre bgreVar = this.e;
        bgrb j = bgrb.j(intent.getLongExtra("adapter_id", -1L));
        if (j == null || (a = j.a((intExtra = intent.getIntExtra("request_id", -1)))) == null) {
            z = false;
            bgqwVar = null;
        } else {
            z = false;
            bgqwVar = new bgqw(j, a, intExtra, intent.getIntExtra("max_sample_points", 10), intent.getIntExtra("max_sample_secs", 20), intent.getBooleanExtra("allow_in_doze", false));
        }
        if (bgqwVar != null) {
            bgmo bgmoVar = bgqwVar.a.a;
            if (bgmoVar instanceof bgop) {
                Sensor a2 = ((bgop) bgmoVar).a(bgqwVar.b.a);
                if (a2 != null) {
                    ?? r02 = bgreVar.a;
                    int i2 = ((ejcb) r02).c;
                    ?? r12 = z;
                    while (true) {
                        if (r12 >= i2) {
                            eiidVar = eigb.a;
                            break;
                        }
                        bgrd bgrdVar = (bgrd) r02.get(r12);
                        r12++;
                        if (bgrdVar.c(a2)) {
                            eiidVar = eiid.j(bgrdVar.a(bgqwVar));
                            break;
                        }
                    }
                } else {
                    eiidVar = eigb.a;
                }
            } else {
                eiidVar = eigb.a;
            }
        } else {
            eiidVar = eigb.a;
        }
        if (eiidVar.h()) {
            r0 = eiidVar.c();
        } else {
            long longExtra = intent.getLongExtra("adapter_id", -1L);
            final bgrb j2 = bgrb.j(longExtra);
            if (j2 == null) {
                ((ejhf) b.j()).A("CollectSensorChimeraService did not find adapter %d", longExtra);
                enssVar = ensj.i(Boolean.valueOf(z));
            } else {
                eike.e(j2);
                final int intExtra3 = intent.getIntExtra("request_id", -1);
                final bgmq a3 = j2.a(intExtra3);
                if (a3 == null) {
                    ((ejhf) b.j()).z("CollectSensorChimeraService did not find request %d", intExtra3);
                    enssVar = ensj.i(Boolean.valueOf(z));
                } else {
                    eike.e(a3);
                    final SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                    Sensor sensor = fodm.c() ? (Sensor) eivv.o(sensorManager.getSensorList(34), null) : null;
                    if (!intent.getBooleanExtra("disable_off_body", true)) {
                        i = ensj.i(true);
                    } else if (bgap.c(this)) {
                        i = ensj.i(Boolean.valueOf(z));
                    } else {
                        if (sensor != null) {
                            final entj entjVar = new entj();
                            z2 = z;
                            if (sensorManager.registerListener(new TracingSensorEventListener(this) { // from class: com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService.1
                                @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
                                public final void a(SensorEvent sensorEvent) {
                                    sensorManager.unregisterListener(this);
                                    boolean z3 = sensorEvent.values[0] != 0.0f;
                                    if (!z3) {
                                        asot asotVar = CollectSensorChimeraService.b;
                                    }
                                    entjVar.q(Boolean.valueOf(z3));
                                }

                                @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
                                public final void b(Sensor sensor2) {
                                }
                            }, sensor, z2 ? 1 : 0)) {
                                i = ensi.h(entjVar).i(10L, TimeUnit.SECONDS, this.d);
                            } else {
                                ((ejhf) b.j()).x("Failed to register LLOB listener.");
                            }
                        } else {
                            z2 = z;
                        }
                        i = bgap.b(this) ? ensj.i(Boolean.valueOf(z2)) : ensj.i(true);
                    }
                    eiho eihoVar = new eiho() { // from class: bgqp
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            ((ejhf) ((ejhf) CollectSensorChimeraService.b.i()).s((Exception) obj)).x("Error occurred");
                            return false;
                        }
                    };
                    enre enreVar = enre.a;
                    enss f = enox.f(i, Exception.class, eihoVar, enreVar);
                    final Sensor sensor2 = sensor;
                    enssVar = enps.g(f, new enqc() { // from class: bgqq
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            bgrb bgrbVar = j2;
                            int i3 = intExtra3;
                            boolean z3 = false;
                            if (!booleanValue) {
                                bgrbVar.k(i3, false);
                                return ensj.i(false);
                            }
                            Intent intent2 = intent;
                            if (intent2.getBooleanExtra("allow_in_doze", false) && sensor2 != null) {
                                z3 = true;
                            }
                            boolean z4 = z3;
                            bgmq bgmqVar = a3;
                            CollectSensorChimeraService collectSensorChimeraService = CollectSensorChimeraService.this;
                            bgmq a4 = bgrf.a(bgmqVar);
                            int intExtra4 = intent2.getIntExtra("max_sample_secs", 20);
                            int intExtra5 = intent2.getIntExtra("max_sample_points", 10);
                            entj entjVar2 = new entj();
                            ensj.t(bgrbVar.a.e(a4.a(new bgqv(a4.b, intExtra5, intExtra4, bgrbVar, collectSensorChimeraService.d, i3, z4, entjVar2))), new bgqu(a4, bgrbVar, i3, entjVar2), enre.a);
                            return entjVar2;
                        }
                    }, enreVar);
                }
            }
            boolean isDone = enssVar.isDone();
            r0 = enssVar;
            if (!isDone) {
                int intExtra4 = intent.getIntExtra("max_sample_secs", 20);
                this.a.c(TimeUnit.SECONDS.toMillis(intExtra4 + intExtra4 + 10));
                final deqr deqrVar = this.a;
                Objects.requireNonNull(deqrVar);
                enssVar.hn(new Runnable() { // from class: bgqt
                    @Override // java.lang.Runnable
                    public final void run() {
                        deqr.this.g();
                    }
                }, enre.a);
                r0 = enssVar;
            }
        }
        r0.hn(new Runnable() { // from class: bgqs
            @Override // java.lang.Runnable
            public final void run() {
                asot asotVar = CollectSensorChimeraService.b;
            }
        }, enre.a);
    }

    @Override // defpackage.arfh, defpackage.aslt, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ScheduledExecutorService scheduledExecutorService = this.d;
        bgra bgraVar = new bgra(scheduledExecutorService);
        this.f = bgraVar;
        bgraVar.d = new bgqo(this);
        this.e = new bgre(this, this.f, scheduledExecutorService);
    }

    public CollectSensorChimeraService(asnv asnvVar, ScheduledExecutorService scheduledExecutorService) {
        super("CollectSensorChimeraService", "FITNESS");
        this.c = asnvVar;
        this.d = scheduledExecutorService;
    }
}
