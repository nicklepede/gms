package com.google.android.gms.auth.account.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aura;
import defpackage.bzoz;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.elpp;
import defpackage.wwh;
import defpackage.wxz;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WorkAccountChimeraService extends Service implements bzqa {
    private wwh a;
    private wxz b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ChimeraReceiver extends BroadcastReceiver {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Log.i("Auth", String.format(Locale.US, "[WorkAccount] update authenticator enabled for intent: ".concat(String.valueOf(intent.getAction())), new Object[0]));
            Intent intent2 = new Intent("com.google.android.gms.auth.account.ACTION_UPDATE_WORK_AUTHENTICATOR");
            intent2.setClassName(context, "com.google.android.gms.auth.account.service.WorkAccountService");
            context.startService(intent2);
        }
    }

    @Override // defpackage.bzqa
    public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (!aura.X(this) && (str == null || !this.a.e(str))) {
            throw new SecurityException("Can't manage work accounts: ".concat(String.valueOf(str)));
        }
        bzozVar.d(this.b, null);
    }

    @Override // com.google.android.chimera.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (intent.getAction() == null) {
                return null;
            }
            return new bzqb(this, 120, elpp.a, 3, this);
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new wxz(this, new LifecycleSynchronizer(this));
        this.a = (wwh) wwh.a.b();
    }
}
