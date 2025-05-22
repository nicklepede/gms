package com.google.android.gms.smartdevice.setup.accounts;

import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atzb;
import defpackage.auad;
import defpackage.bzoz;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.caqj;
import defpackage.dgnt;
import defpackage.dgyt;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AccountsChimeraService extends Service implements bzqa {
    private static final auad a = new dgyt(new String[]{"Setup", "Accounts", "AccountsService"});
    private dgnt b;
    private Handler c;

    @Override // defpackage.bzqa
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        dgnt dgntVar = this.b;
        atzb.s(dgntVar);
        bzozVar.d(dgntVar, null);
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        a.j("onBind()", new Object[0]);
        if (!"com.google.android.gms.smartdevice.setup.accounts.AccountsService.START".equals(intent.getAction())) {
            return null;
        }
        if (this.b == null) {
            this.b = new dgnt(this, this.c);
        }
        return new bzqb(this, 81, elpp.a, 0, this);
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        a.j("onCreate()", new Object[0]);
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("AccountBootstrapBackground", 10);
        handlerThread.start();
        this.c = new caqj(handlerThread.getLooper());
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a.j("onDestroy()", new Object[0]);
        dgnt dgntVar = this.b;
        if (dgntVar != null) {
            dgntVar.e();
            this.b = null;
        }
        super.onDestroy();
    }
}
