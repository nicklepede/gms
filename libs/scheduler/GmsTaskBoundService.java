package com.google.android.gms.libs.scheduler;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.anxj;
import defpackage.byjv;
import defpackage.byln;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.enss;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public abstract class GmsTaskBoundService extends BoundService implements GmsTaskServiceInterface {
    final eijr i = eijy.a(new eijr() { // from class: byja
        @Override // defpackage.eijr
        public final Object a() {
            return new byjv(GmsTaskBoundService.this);
        }
    });

    public int a(byln bylnVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.BoundService, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        if (anxj.a() >= 110) {
            setWantIntentExtras(false);
        }
        super.attachBaseContext(context);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final boolean hs(String str) {
        return str.endsWith(".ACTION_TASK_READY");
    }

    public enss im(byln bylnVar) {
        return ((byjv) this.i.a()).b(bylnVar);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        return ((byjv) this.i.a()).a(intent);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public void onCreate() {
        ((byjv) this.i.a()).f();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public void onDestroy() {
        ((byjv) this.i.a()).i();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        ((byjv) this.i.a()).h(intent);
        return false;
    }

    @Deprecated
    public void fR() {
    }
}
