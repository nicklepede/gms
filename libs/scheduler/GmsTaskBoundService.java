package com.google.android.gms.libs.scheduler;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.apzb;
import defpackage.casn;
import defpackage.cauf;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.eqgl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class GmsTaskBoundService extends BoundService implements GmsTaskServiceInterface {
    final ekww i = ekxd.a(new ekww() { // from class: cars
        @Override // defpackage.ekww
        public final Object lK() {
            return new casn(GmsTaskBoundService.this);
        }
    });

    public int a(cauf caufVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.chimera.BoundService, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        if (apzb.a() >= 110) {
            setWantIntentExtras(false);
        }
        super.attachBaseContext(context);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final boolean hI(String str) {
        return str.endsWith(".ACTION_TASK_READY");
    }

    public eqgl iB(cauf caufVar) {
        return ((casn) this.i.lK()).b(caufVar);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        return ((casn) this.i.lK()).a(intent);
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public void onCreate() {
        ((casn) this.i.lK()).f();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public void onDestroy() {
        ((casn) this.i.lK()).i();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        ((casn) this.i.lK()).h(intent);
        return false;
    }

    @Deprecated
    public void gf() {
    }
}
