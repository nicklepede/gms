package com.google.android.gms.auth.account.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.chimera.Service;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asng;
import defpackage.bxgj;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.ejck;
import defpackage.vah;
import defpackage.vbz;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WorkAccountChimeraService extends Service implements bxhk {
    private vah a;
    private vbz b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ChimeraReceiver extends BroadcastReceiver {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Log.i("Auth", String.format(Locale.US, "[WorkAccount] update authenticator enabled for intent: ".concat(String.valueOf(intent.getAction())), new Object[0]));
            Intent intent2 = new Intent("com.google.android.gms.auth.account.ACTION_UPDATE_WORK_AUTHENTICATOR");
            intent2.setClassName(context, "com.google.android.gms.auth.account.service.WorkAccountService");
            context.startService(intent2);
        }
    }

    @Override // defpackage.bxhk
    public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (!asng.X(this) && (str == null || !this.a.e(str))) {
            throw new SecurityException("Can't manage work accounts: ".concat(String.valueOf(str)));
        }
        bxgjVar.d(this.b, null);
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
            return new bxhl(this, 120, ejck.a, 3, this);
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new vbz(this, new LifecycleSynchronizer(this));
        this.a = (vah) vah.a.b();
    }
}
