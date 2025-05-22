package com.google.android.gms.thunderbird;

import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import defpackage.aupz;
import defpackage.auve;
import defpackage.dikq;
import defpackage.dikv;
import defpackage.dikw;
import defpackage.dikz;
import defpackage.dimf;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fvik;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EmergencyPersistentChimeraService extends Service implements dikq {
    private Executor a;
    private dikv b;
    private dimf c;

    private final void b() {
        ekvl.r(Looper.myLooper() == Looper.getMainLooper(), "checkServiceLifecycle: Looper.myLooper() != Looper.getMainLooper()");
        if (this.b.l()) {
            if (this.c == null) {
                ((eluo) ((eluo) dikw.a.h()).ai((char) 11249)).x("starting outgoing sms listener");
                dimf dimfVar = new dimf(this, this.a, this);
                this.c = dimfVar;
                dimfVar.a();
                return;
            }
            return;
        }
        dimf dimfVar2 = this.c;
        if (dimfVar2 != null) {
            dimfVar2.b();
            this.c = null;
            ((eluo) ((eluo) dikw.a.h()).ai((char) 11248)).x("stopping outgoing sms listener");
        }
    }

    @Override // defpackage.dikq
    public final void a() {
        b();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        aupz aupzVar = new aupz(1, 9);
        if (this.a == null) {
            this.a = aupzVar;
        }
        dikv b = dikv.b(this);
        this.b = b;
        b.j(this, new auve(Looper.getMainLooper()));
        if (fvik.J()) {
            dikz.d().g(this, "EmergencyPersistentChimeraService#onCreate");
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.b.k(this);
        dimf dimfVar = this.c;
        if (dimfVar != null) {
            dimfVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        b();
        return 1;
    }
}
