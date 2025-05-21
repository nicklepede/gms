package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.constellation.checker.PeriodicClientStateChecker;
import defpackage.arni;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmb;
import defpackage.asxb;
import defpackage.asxd;
import defpackage.asxi;
import defpackage.aszi;
import defpackage.aszw;
import defpackage.atkx;
import defpackage.atlw;
import defpackage.atmb;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.enwb;
import defpackage.fmml;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PeriodicClientStateChecker extends IntentOperation {
    public static ScheduledFuture a;
    public static final arxo b = atmg.a("periodic_client_state_checker");
    public Context c;
    public asxb d;
    private final ScheduledExecutorService e = new asmb(1, 9);

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
        arxo arxoVar = b;
        arxoVar.j("onHandleIntent", new Object[0]);
        fmml fmmlVar = fmml.a;
        if (!fmmlVar.a().r()) {
            arxoVar.h("periodic client state checker is disabled.", new Object[0]);
            return;
        }
        final UUID randomUUID = UUID.randomUUID();
        atlw a2 = atlw.a(this.c);
        this.d = new asxb(a2);
        long c = aszi.b().a(this.c).c();
        long d = c > 0 ? c + (fmmlVar.a().d() * 1000) : System.currentTimeMillis();
        final long currentTimeMillis = System.currentTimeMillis();
        if (d <= currentTimeMillis) {
            if (asxd.b(aszi.b().a(this.c))) {
                atkx.a(this.c);
                if (!atkx.b(this.c)) {
                    this.d.a(randomUUID, 6, new atmb(enwb.CHECKER_TRIGGERED_NO_NETWORK, false), currentTimeMillis);
                }
                this.d.b(randomUUID, 6, currentTimeMillis);
                eijr eijrVar = bqqe.a;
                bqqa.a(aseu.CONSTELLATION_BACKGROUND_PERIODIC_CLIENT_STATE_CHECKER);
                Runnable runnable = new Runnable() { // from class: asxe
                    @Override // java.lang.Runnable
                    public final void run() {
                        asvp.h();
                        PeriodicClientStateChecker periodicClientStateChecker = PeriodicClientStateChecker.this;
                        Context context = periodicClientStateChecker.c;
                        asxb asxbVar = periodicClientStateChecker.d;
                        arxo arxoVar2 = PeriodicClientStateChecker.b;
                        int a3 = enwq.a(6);
                        aslv aslvVar = new aslv(new aslw(10));
                        UUID uuid = randomUUID;
                        asvp.e(context, uuid, 3, new asxc(asxbVar, arxoVar2, uuid, a3, aslvVar, true, currentTimeMillis));
                        synchronized (PeriodicClientStateChecker.class) {
                            PeriodicClientStateChecker.a = null;
                        }
                    }
                };
                if (!asxi.c(this.c).f()) {
                    fmml fmmlVar2 = fmml.a;
                    if (fmmlVar2.a().k()) {
                        synchronized (PeriodicClientStateChecker.class) {
                            ScheduledFuture scheduledFuture = a;
                            if (scheduledFuture != null && !scheduledFuture.isDone() && !a.isCancelled()) {
                                a.cancel(false);
                            }
                            a = ((asmb) this.e).schedule(runnable, fmmlVar2.a().f(), TimeUnit.MILLISECONDS);
                        }
                    }
                }
                runnable.run();
            } else if (fmml.i()) {
                a2.G(randomUUID, 6, new atmb(enwb.CHECKER_INACTIVE, false));
            }
            arni arniVar = ((aszw) aszi.b().a(this.c)).c;
            long currentTimeMillis2 = System.currentTimeMillis();
            SharedPreferences.Editor edit = arniVar.edit();
            edit.putLong("last_client_state_check_timestamp_millis", currentTimeMillis2);
            edit.apply();
        } else if (fmml.i()) {
            this.d.a(randomUUID, 6, new atmb(String.format(Locale.US, "nextCheckTime: %d, currentTimeMillis: %d", Long.valueOf(d), Long.valueOf(currentTimeMillis)), enwb.CHECKER_TOO_SOON, false), currentTimeMillis);
        }
        if (fmml.g()) {
            asxi.c(this.c).h(randomUUID.toString(), "PERIODIC_CLIENT_STATE_TRIGGER");
        }
    }
}
