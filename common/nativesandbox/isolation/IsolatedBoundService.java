package com.google.android.gms.common.nativesandbox.isolation;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class IsolatedBoundService extends BoundService {
    private static final asot a = asot.b("IsolatedBoundService", asej.NATIVE_SANDBOX);

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        fvbo.f(intent, "intent");
        if (!fvbo.n(intent.getAction(), "com.google.android.gms.common.nativesandbox.isolation.BIND") && !fvbo.n(intent.getAction(), "com.google.android.gms.common.nativesandbox.isolation.BIND_ISOLATED")) {
            ((ejhf) a.i()).B("unknown intent action %s", intent.getAction());
            return null;
        }
        Context applicationContext = getApplicationContext();
        fvbo.e(applicationContext, "getApplicationContext(...)");
        return new RemoteLibManager(applicationContext);
    }
}
