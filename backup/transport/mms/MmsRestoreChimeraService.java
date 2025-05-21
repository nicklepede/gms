package com.google.android.gms.backup.transport.mms;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.R;
import defpackage.ahpv;
import defpackage.ahtk;
import defpackage.ahtw;
import defpackage.ahuf;
import defpackage.ahuq;
import defpackage.ahus;
import defpackage.ahuz;
import defpackage.ahwd;
import defpackage.aibm;
import defpackage.aieb;
import defpackage.aiee;
import defpackage.aiei;
import defpackage.aiyt;
import defpackage.akic;
import defpackage.akid;
import defpackage.anxo;
import defpackage.aslt;
import defpackage.asmf;
import defpackage.flmm;
import defpackage.flmr;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class MmsRestoreChimeraService extends aslt {
    public static final ahwd a = new ahwd("MmsRestoreService");
    public aiee b;
    public final Executor c = new asmf(1, 9);

    public final ahus a() {
        return flmr.c() ? new ahtw(this) : flmm.E() ? new ahuf(this) : new ahuq(this);
    }

    @Override // defpackage.aslt
    protected final void b(Intent intent) {
        if (this.b == null) {
            this.b = new aiee(this);
        }
        aibm aibmVar = new aibm(this, getPackageManager());
        aiei aieiVar = new aiei(this);
        akid akidVar = new akid(this, this.b, new ahpv(this), a(), new ahuz(this), flmm.F() ? new ahtk(this) : null, ModuleManager.get(this), aibmVar, aieiVar);
        Notification.Builder progress = aieb.a(this).setContentTitle(getResources().getString(R.string.mms_restore_foreground_notification_title)).setProgress(0, 0, true);
        progress.setSmallIcon(anxo.a(this, R.drawable.g1_notification_logo_24));
        startForeground(9901, progress.build());
        try {
            akidVar.c();
        } catch (akic e) {
            a.n("Error restoring MMS", e, new Object[0]);
        }
    }

    @Override // defpackage.aslt, com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (flmm.Q()) {
            return new aiyt(this);
        }
        return null;
    }
}
