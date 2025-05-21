package com.google.android.gms.lockbox;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.asit;
import defpackage.asmf;
import defpackage.asnv;
import defpackage.asot;
import defpackage.cbjg;
import defpackage.cbjh;
import defpackage.cbjj;
import defpackage.cbjm;
import defpackage.cbjn;
import defpackage.dhqe;
import defpackage.dhqf;
import defpackage.ensv;
import defpackage.fpxy;
import defpackage.fpyl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LockboxIntentOperation extends IntentOperation {
    public static final asot a = asot.b("LockboxIntentOp", asej.LOCKBOX);
    public cbjh b;
    final ensv c = new asmf(1, 10);
    public aqxo d;
    private asit e;

    public static void b(Context context) {
        Intent startIntent = IntentOperation.getStartIntent(context, LockboxIntentOperation.class, "com.google.android.gms.lockbox.CHECK_OPT_IN");
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }

    public final void a(long j) {
        this.e.d("LockboxIntentOp", 3, SystemClock.elapsedRealtime() + j, IntentOperation.getPendingIntent(this, LockboxIntentOperation.class, new Intent("com.google.android.gms.lockbox.CHECK_OPT_IN"), 0, 0), "com.google.android.gms");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = new cbjh(this);
        this.e = new asit(this);
        aqxd aqxdVar = cbjj.a;
        dhqe dhqeVar = new dhqe();
        aqxd aqxdVar2 = dhqf.a;
        this.d = new aqxo(this, dhqeVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cbjh cbjhVar = this.b;
        asnv asnvVar = cbjhVar.c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = cbjh.a;
        if (j < 0 || elapsedRealtime - j > fpyl.a.a().a()) {
            cbjh.a = elapsedRealtime;
            if (cbjhVar.a()) {
                new cbjg(cbjhVar.b).h("");
            }
        }
        try {
            cbjn cbjnVar = new cbjn(this);
            if (fpxy.a.a().c()) {
                return;
            }
            LockboxIntentOperation lockboxIntentOperation = cbjnVar.a;
            lockboxIntentOperation.d.aJ("LB_AS").q(lockboxIntentOperation.c, new cbjm(cbjnVar));
        } catch (IllegalStateException unused) {
        }
    }
}
