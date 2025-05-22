package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.aupv;
import defpackage.avbe;
import defpackage.avbg;
import defpackage.avbj;
import defpackage.avdl;
import defpackage.avpz;
import defpackage.avqj;
import defpackage.eqik;
import defpackage.eqjw;
import defpackage.fgrc;
import defpackage.fpeg;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SimStateChecker extends IntentOperation {
    public static final auad a = avqj.a("sim_state_checker");
    public static ScheduledFuture b = null;
    public Context d;
    public UUID e;
    public avbe f;
    private avpz i;
    public long c = 0;
    private final Runnable g = new avbj(this);
    private final ScheduledExecutorService h = new aupv(1, 9);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.chimera.IntentOperation
    public final void init(Context context) {
        this.d = context;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.d = getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (!fpeg.h() && !fpeg.a.lK().x()) {
            a.h("sim state checker is disabled.", new Object[0]);
            return;
        }
        auad auadVar = a;
        auadVar.h("Handling intent ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        if (!intent.getAction().equals("android.intent.action.SIM_STATE_CHANGED")) {
            auadVar.m("Unexpected intent.", new Object[0]);
            return;
        }
        this.i = avpz.a(this.d);
        this.f = new avbe(this.i);
        this.e = UUID.randomUUID();
        this.c = System.currentTimeMillis();
        int i = 2;
        if (intent.hasExtra("ss")) {
            String stringExtra = intent.getStringExtra("ss");
            switch (stringExtra.hashCode()) {
                case -2044123382:
                    if (stringExtra.equals("LOCKED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1097519099:
                    if (stringExtra.equals("loaded")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2251386:
                    if (stringExtra.equals("IMSI")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 77848963:
                    if (stringExtra.equals("READY")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1924388665:
                    if (stringExtra.equals("ABSENT")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                i = 3;
            } else if (c == 1) {
                i = 5;
            } else if (c == 2) {
                i = 7;
            } else if (c == 3) {
                i = 4;
            } else if (c == 4) {
                i = 6;
            }
        } else {
            auadVar.m("Extra not found in intent.", new Object[0]);
        }
        avbe avbeVar = this.f;
        String uuid = this.e.toString();
        eqjw eqjwVar = eqjw.SIM_STATE_CHANGED;
        fgrc v = eqik.a.v();
        if (!v.b.L()) {
            v.U();
        }
        avpz avpzVar = avbeVar.a;
        eqik eqikVar = (eqik) v.b;
        eqikVar.e = i - 2;
        eqikVar.b = 4 | eqikVar.b;
        avpzVar.n(avpz.O(uuid, eqjwVar, v));
        if (fpeg.h() && avbg.b(avdl.b().a(this.d))) {
            auadVar.j("fire attempt", new Object[0]);
            synchronized (SimStateChecker.class) {
                ScheduledFuture scheduledFuture = b;
                if (scheduledFuture != null && !scheduledFuture.isDone() && !b.isCancelled()) {
                    auadVar.j("cancel attempt", new Object[0]);
                    b.cancel(false);
                }
                b = ((aupv) this.h).schedule(this.g, fpeg.a.lK().e(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
