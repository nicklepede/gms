package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.constellation.checker.PeriodicClientStateChecker;
import defpackage.atpx;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupv;
import defpackage.avbe;
import defpackage.avbg;
import defpackage.avbl;
import defpackage.avdl;
import defpackage.avdz;
import defpackage.avpa;
import defpackage.avpz;
import defpackage.avqe;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.eqju;
import defpackage.fpeg;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PeriodicClientStateChecker extends IntentOperation {
    public static ScheduledFuture a;
    public static final auad b = avqj.a("periodic_client_state_checker");
    public Context c;
    public avbe d;
    private final ScheduledExecutorService e = new aupv(1, 9);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.chimera.IntentOperation
    public final void init(Context context) {
        this.c = context;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.c = getApplicationContext();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        auad auadVar = b;
        auadVar.j("onHandleIntent", new Object[0]);
        fpeg fpegVar = fpeg.a;
        if (!fpegVar.lK().r()) {
            auadVar.h("periodic client state checker is disabled.", new Object[0]);
            return;
        }
        final UUID randomUUID = UUID.randomUUID();
        avpz a2 = avpz.a(this.c);
        this.d = new avbe(a2);
        long c = avdl.b().a(this.c).c();
        long d = c > 0 ? c + (fpegVar.lK().d() * 1000) : System.currentTimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        if (d <= currentTimeMillis) {
            if (avbg.b(avdl.b().a(this.c))) {
                avpa.a(this.c);
                if (!avpa.b(this.c)) {
                    this.d.a(randomUUID, 6, new avqe(eqju.CHECKER_TRIGGERED_NO_NETWORK, false), currentTimeMillis);
                }
                this.d.b(randomUUID, 6, currentTimeMillis);
                ekww ekwwVar = bsxv.a;
                bsxr.a(auio.CONSTELLATION_BACKGROUND_PERIODIC_CLIENT_STATE_CHECKER);
                Runnable runnable = new Runnable() { // from class: avbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        auzl.h();
                        PeriodicClientStateChecker periodicClientStateChecker = PeriodicClientStateChecker.this;
                        Context context = periodicClientStateChecker.c;
                        avbe avbeVar = periodicClientStateChecker.d;
                        auad auadVar2 = PeriodicClientStateChecker.b;
                        int a3 = eqkj.a(6);
                        aupp auppVar = new aupp(new aupq(10));
                        UUID uuid = randomUUID;
                        auzl.e(context, uuid, 3, new avbf(avbeVar, auadVar2, uuid, a3, auppVar, true, currentTimeMillis));
                        synchronized (PeriodicClientStateChecker.class) {
                            PeriodicClientStateChecker.a = null;
                        }
                    }
                };
                if (avbl.c(this.c).f() || !fpegVar.lK().k()) {
                    runnable.run();
                } else {
                    synchronized (PeriodicClientStateChecker.class) {
                        ScheduledFuture scheduledFuture = a;
                        if (scheduledFuture != null && !scheduledFuture.isDone() && !a.isCancelled()) {
                            a.cancel(false);
                        }
                        a = ((aupv) this.e).schedule(runnable, fpegVar.lK().f(), TimeUnit.MILLISECONDS);
                    }
                }
            } else if (fpeg.i()) {
                a2.G(randomUUID, 6, new avqe(eqju.CHECKER_INACTIVE, false));
            }
            atpx atpxVar = ((avdz) avdl.b().a(this.c)).c;
            long currentTimeMillis2 = System.currentTimeMillis();
            SharedPreferences.Editor edit = atpxVar.edit();
            edit.putLong("last_client_state_check_timestamp_millis", currentTimeMillis2);
            edit.apply();
        } else if (fpeg.i()) {
            this.d.a(randomUUID, 6, new avqe(String.format(Locale.US, "nextCheckTime: %d, currentTimeMillis: %d", Long.valueOf(d), Long.valueOf(currentTimeMillis)), eqju.CHECKER_TOO_SOON, false), currentTimeMillis);
        }
        if (fpeg.g()) {
            avbl.c(this.c).h(randomUUID.toString(), "PERIODIC_CLIENT_STATE_TRIGGER");
        }
    }
}
