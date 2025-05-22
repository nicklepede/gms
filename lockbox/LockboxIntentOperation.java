package com.google.android.gms.lockbox;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.atad;
import defpackage.auid;
import defpackage.aumn;
import defpackage.aupz;
import defpackage.aurp;
import defpackage.ausn;
import defpackage.cdry;
import defpackage.cdrz;
import defpackage.cdsb;
import defpackage.cdse;
import defpackage.cdsf;
import defpackage.dkbk;
import defpackage.dkbl;
import defpackage.eqgo;
import defpackage.fsrt;
import defpackage.fssg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LockboxIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("LockboxIntentOp", auid.LOCKBOX);
    public cdrz b;
    final eqgo c = new aupz(1, 10);
    public atad d;
    private aumn e;

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
        this.b = new cdrz(this);
        this.e = new aumn(this);
        aszs aszsVar = cdsb.a;
        dkbk dkbkVar = new dkbk();
        aszs aszsVar2 = dkbl.a;
        this.d = new atad(this, dkbkVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        cdrz cdrzVar = this.b;
        aurp aurpVar = cdrzVar.c;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = cdrz.a;
        if (j < 0 || elapsedRealtime - j > fssg.a.lK().a()) {
            cdrz.a = elapsedRealtime;
            if (cdrzVar.a()) {
                new cdry(cdrzVar.b).h("");
            }
        }
        try {
            cdsf cdsfVar = new cdsf(this);
            if (fsrt.a.lK().c()) {
                return;
            }
            LockboxIntentOperation lockboxIntentOperation = cdsfVar.a;
            lockboxIntentOperation.d.aI("LB_AS").q(lockboxIntentOperation.c, new cdse(cdsfVar));
        } catch (IllegalStateException unused) {
        }
    }
}
