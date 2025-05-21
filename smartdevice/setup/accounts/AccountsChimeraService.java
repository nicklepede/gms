package com.google.android.gms.smartdevice.setup.accounts;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.bxgj;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.byhr;
import defpackage.decq;
import defpackage.denq;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AccountsChimeraService extends Service implements bxhk {
    private static final arxo a = new denq(new String[]{"Setup", "Accounts", "AccountsService"});
    private decq b;
    private Handler c;

    @Override // defpackage.bxhk
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        decq decqVar = this.b;
        arwm.s(decqVar);
        bxgjVar.d(decqVar, null);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        a.j("onBind()", new Object[0]);
        if (!"com.google.android.gms.smartdevice.setup.accounts.AccountsService.START".equals(intent.getAction())) {
            return null;
        }
        if (this.b == null) {
            this.b = new decq(this, this.c);
        }
        return new bxhl(this, 81, ejck.a, 0, this);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.j("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("AccountBootstrapBackground", 10);
        handlerThread.start();
        this.c = new byhr(handlerThread.getLooper());
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.j("onDestroy()", new Object[0]);
        decq decqVar = this.b;
        if (decqVar != null) {
            decqVar.e();
            this.b = null;
        }
        super.onDestroy();
    }
}
