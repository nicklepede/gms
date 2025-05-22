package com.google.android.gms.fitness.sensors.sample;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener;
import defpackage.athw;
import defpackage.aupv;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.ausn;
import defpackage.biff;
import defpackage.bire;
import defpackage.birg;
import defpackage.bitf;
import defpackage.bive;
import defpackage.bivm;
import defpackage.bivp;
import defpackage.bivq;
import defpackage.bivr;
import defpackage.bivt;
import defpackage.bivu;
import defpackage.bjev;
import defpackage.dhbu;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekxj;
import defpackage.elja;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqhc;
import defpackage.fqvv;
import j$.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class CollectSensorChimeraService extends athw {
    public static final ausn b = bjev.a();
    public final aurp c;
    public final ScheduledExecutorService d;
    private bivu e;
    private bivq f;

    public CollectSensorChimeraService() {
        this(aurt.a, new aupv(1, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [eqgl] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [elgo, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    @Override // defpackage.aupn
    protected final void b(final Intent intent) {
        int intExtra;
        birg a;
        bivm bivmVar;
        boolean z;
        ekvi ekviVar;
        boolean z2;
        eqgl i;
        eqgl eqglVar;
        ?? r0;
        bivp bivpVar;
        int intExtra2 = intent.getIntExtra("delay_trigger_seq_no", -1);
        if (intExtra2 != -1) {
            bivq bivqVar = this.f;
            synchronized (bivq.a) {
                bivpVar = (bivp) bivq.b.remove(Integer.valueOf(intExtra2));
            }
            if (bivpVar == null) {
                return;
            }
            bivqVar.c.submit(bivpVar.a).isDone();
            return;
        }
        intent.getIntExtra("request_id", -1);
        bivu bivuVar = this.e;
        bivr j = bivr.j(intent.getLongExtra("adapter_id", -1L));
        if (j == null || (a = j.a((intExtra = intent.getIntExtra("request_id", -1)))) == null) {
            z = false;
            bivmVar = null;
        } else {
            z = false;
            bivmVar = new bivm(j, a, intExtra, intent.getIntExtra("max_sample_points", 10), intent.getIntExtra("max_sample_secs", 20), intent.getBooleanExtra("allow_in_doze", false));
        }
        if (bivmVar != null) {
            bire bireVar = bivmVar.a.a;
            if (bireVar instanceof bitf) {
                Sensor a2 = ((bitf) bireVar).a(bivmVar.b.a);
                if (a2 != null) {
                    ?? r02 = bivuVar.a;
                    int i2 = ((elpg) r02).c;
                    ?? r12 = z;
                    while (true) {
                        if (r12 >= i2) {
                            ekviVar = ektg.a;
                            break;
                        }
                        bivt bivtVar = (bivt) r02.get(r12);
                        r12++;
                        if (bivtVar.c(a2)) {
                            ekviVar = ekvi.j(bivtVar.a(bivmVar));
                            break;
                        }
                    }
                } else {
                    ekviVar = ektg.a;
                }
            } else {
                ekviVar = ektg.a;
            }
        } else {
            ekviVar = ektg.a;
        }
        if (ekviVar.h()) {
            r0 = ekviVar.c();
        } else {
            long longExtra = intent.getLongExtra("adapter_id", -1L);
            final bivr j2 = bivr.j(longExtra);
            if (j2 == null) {
                ((eluo) b.j()).A("CollectSensorChimeraService did not find adapter %d", longExtra);
                eqglVar = eqgc.i(Boolean.valueOf(z));
            } else {
                ekxj.e(j2);
                final int intExtra3 = intent.getIntExtra("request_id", -1);
                final birg a3 = j2.a(intExtra3);
                if (a3 == null) {
                    ((eluo) b.j()).z("CollectSensorChimeraService did not find request %d", intExtra3);
                    eqglVar = eqgc.i(Boolean.valueOf(z));
                } else {
                    ekxj.e(a3);
                    final SensorManager sensorManager = (SensorManager) getSystemService("sensor");
                    Sensor sensor = fqvv.c() ? (Sensor) elja.o(sensorManager.getSensorList(34), null) : null;
                    if (!intent.getBooleanExtra("disable_off_body", true)) {
                        i = eqgc.i(true);
                    } else if (biff.c(this)) {
                        i = eqgc.i(Boolean.valueOf(z));
                    } else {
                        if (sensor != null) {
                            final eqhc eqhcVar = new eqhc();
                            z2 = z;
                            if (sensorManager.registerListener(new TracingSensorEventListener(this) { // from class: com.google.android.gms.fitness.sensors.sample.CollectSensorChimeraService.1
                                @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
                                public final void a(SensorEvent sensorEvent) {
                                    sensorManager.unregisterListener(this);
                                    boolean z3 = sensorEvent.values[0] != 0.0f;
                                    if (!z3) {
                                        ausn ausnVar = CollectSensorChimeraService.b;
                                    }
                                    eqhcVar.q(Boolean.valueOf(z3));
                                }

                                @Override // com.google.android.gms.libs.punchclock.tracing.TracingSensorEventListener
                                public final void b(Sensor sensor2) {
                                }
                            }, sensor, z2 ? 1 : 0)) {
                                i = eqgb.h(eqhcVar).i(10L, TimeUnit.SECONDS, this.d);
                            } else {
                                ((eluo) b.j()).x("Failed to register LLOB listener.");
                            }
                        } else {
                            z2 = z;
                        }
                        i = biff.b(this) ? eqgc.i(Boolean.valueOf(z2)) : eqgc.i(true);
                    }
                    ekut ekutVar = new ekut() { // from class: bivf
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ((eluo) ((eluo) CollectSensorChimeraService.b.i()).s((Exception) obj)).x("Error occurred");
                            return false;
                        }
                    };
                    eqex eqexVar = eqex.a;
                    eqgl f = eqcq.f(i, Exception.class, ekutVar, eqexVar);
                    final Sensor sensor2 = sensor;
                    eqglVar = eqdl.g(f, new eqdv() { // from class: bivg
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            bivr bivrVar = j2;
                            int i3 = intExtra3;
                            boolean z3 = false;
                            if (!booleanValue) {
                                bivrVar.k(i3, false);
                                return eqgc.i(false);
                            }
                            Intent intent2 = intent;
                            if (intent2.getBooleanExtra("allow_in_doze", false) && sensor2 != null) {
                                z3 = true;
                            }
                            boolean z4 = z3;
                            birg birgVar = a3;
                            CollectSensorChimeraService collectSensorChimeraService = CollectSensorChimeraService.this;
                            birg a4 = bivv.a(birgVar);
                            int intExtra4 = intent2.getIntExtra("max_sample_secs", 20);
                            int intExtra5 = intent2.getIntExtra("max_sample_points", 10);
                            eqhc eqhcVar2 = new eqhc();
                            eqgc.t(bivrVar.a.e(a4.a(new bivl(a4.b, intExtra5, intExtra4, bivrVar, collectSensorChimeraService.d, i3, z4, eqhcVar2))), new bivk(a4, bivrVar, i3, eqhcVar2), eqex.a);
                            return eqhcVar2;
                        }
                    }, eqexVar);
                }
            }
            boolean isDone = eqglVar.isDone();
            r0 = eqglVar;
            if (!isDone) {
                int intExtra4 = intent.getIntExtra("max_sample_secs", 20);
                this.a.c(TimeUnit.SECONDS.toMillis(intExtra4 + intExtra4 + 10));
                final dhbu dhbuVar = this.a;
                Objects.requireNonNull(dhbuVar);
                eqglVar.hD(new Runnable() { // from class: bivj
                    @Override // java.lang.Runnable
                    public final void run() {
                        dhbu.this.g();
                    }
                }, eqex.a);
                r0 = eqglVar;
            }
        }
        r0.hD(new Runnable() { // from class: bivi
            @Override // java.lang.Runnable
            public final void run() {
                ausn ausnVar = CollectSensorChimeraService.b;
            }
        }, eqex.a);
    }

    @Override // defpackage.athw, defpackage.aupn, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ScheduledExecutorService scheduledExecutorService = this.d;
        bivq bivqVar = new bivq(scheduledExecutorService);
        this.f = bivqVar;
        bivqVar.d = new bive(this);
        this.e = new bivu(this, this.f, scheduledExecutorService);
    }

    public CollectSensorChimeraService(aurp aurpVar, ScheduledExecutorService scheduledExecutorService) {
        super("CollectSensorChimeraService", "FITNESS");
        this.c = aurpVar;
        this.d = scheduledExecutorService;
    }
}
