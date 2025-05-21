package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.asxb;
import defpackage.asxd;
import defpackage.asxg;
import defpackage.aszi;
import defpackage.atlw;
import defpackage.atmg;
import defpackage.enur;
import defpackage.enwd;
import defpackage.fecj;
import defpackage.fmml;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SimStateChecker extends IntentOperation {
    public static final arxo a = atmg.a("sim_state_checker");
    public static ScheduledFuture b = null;
    public Context d;
    public UUID e;
    public asxb f;
    private atlw i;
    public long c = 0;
    private final Runnable g = new asxg(this);
    private final ScheduledExecutorService h = new asmb(1, 9);

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
        if (!fmml.h() && !fmml.a.a().x()) {
            a.h("sim state checker is disabled.", new Object[0]);
            return;
        }
        arxo arxoVar = a;
        arxoVar.h("Handling intent ".concat(String.valueOf(String.valueOf(intent))), new Object[0]);
        if (!intent.getAction().equals("android.intent.action.SIM_STATE_CHANGED")) {
            arxoVar.m("Unexpected intent.", new Object[0]);
            return;
        }
        this.i = atlw.a(this.d);
        this.f = new asxb(this.i);
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
            arxoVar.m("Extra not found in intent.", new Object[0]);
        }
        asxb asxbVar = this.f;
        String uuid = this.e.toString();
        enwd enwdVar = enwd.SIM_STATE_CHANGED;
        fecj v = enur.a.v();
        if (!v.b.L()) {
            v.U();
        }
        atlw atlwVar = asxbVar.a;
        enur enurVar = (enur) v.b;
        enurVar.e = i - 2;
        enurVar.b = 4 | enurVar.b;
        atlwVar.n(atlw.O(uuid, enwdVar, v));
        if (fmml.h() && asxd.b(aszi.b().a(this.d))) {
            arxoVar.j("fire attempt", new Object[0]);
            synchronized (SimStateChecker.class) {
                ScheduledFuture scheduledFuture = b;
                if (scheduledFuture != null && !scheduledFuture.isDone() && !b.isCancelled()) {
                    arxoVar.j("cancel attempt", new Object[0]);
                    b.cancel(false);
                }
                b = ((asmb) this.h).schedule(this.g, fmml.a.a().e(), TimeUnit.MILLISECONDS);
            }
        }
    }
}
