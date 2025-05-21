package com.google.android.gms.thunderbird;

import android.content.Intent;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.chimera.Service;
import defpackage.asmf;
import defpackage.asrk;
import defpackage.dfzl;
import defpackage.dfzq;
import defpackage.dfzr;
import defpackage.dfzu;
import defpackage.dgba;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.fsnb;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmergencyPersistentChimeraService extends Service implements dfzl {
    private Executor a;
    private dfzq b;
    private dgba c;

    private final void b() {
        eiig.q(Looper.myLooper() == Looper.getMainLooper(), "checkServiceLifecycle: Looper.myLooper() != Looper.getMainLooper()");
        if (this.b.l()) {
            if (this.c == null) {
                ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11246)).x("starting outgoing sms listener");
                dgba dgbaVar = new dgba(this, this.a, this);
                this.c = dgbaVar;
                dgbaVar.a();
                return;
            }
            return;
        }
        dgba dgbaVar2 = this.c;
        if (dgbaVar2 != null) {
            dgbaVar2.b();
            this.c = null;
            ((ejhf) ((ejhf) dfzr.a.h()).ah((char) 11245)).x("stopping outgoing sms listener");
        }
    }

    @Override // defpackage.dfzl
    public final void a() {
        b();
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        asmf asmfVar = new asmf(1, 9);
        if (this.a == null) {
            this.a = asmfVar;
        }
        dfzq b = dfzq.b(this);
        this.b = b;
        b.j(this, new asrk(Looper.getMainLooper()));
        if (fsnb.J()) {
            dfzu.d().g(this, "EmergencyPersistentChimeraService#onCreate");
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.b.k(this);
        dgba dgbaVar = this.c;
        if (dgbaVar != null) {
            dgbaVar.b();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        b();
        return 1;
    }
}
