package com.google.android.gms.common.nativesandbox.isolation;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class IsolatedBoundService extends BoundService {
    private static final ausn a = ausn.b("IsolatedBoundService", auid.NATIVE_SANDBOX);

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        fxxm.f(intent, "intent");
        if (!fxxm.n(intent.getAction(), "com.google.android.gms.common.nativesandbox.isolation.BIND") && !fxxm.n(intent.getAction(), "com.google.android.gms.common.nativesandbox.isolation.BIND_ISOLATED")) {
            ((eluo) a.i()).B("unknown intent action %s", intent.getAction());
            return null;
        }
        Context applicationContext = getApplicationContext();
        fxxm.e(applicationContext, "getApplicationContext(...)");
        return new RemoteLibManager(applicationContext);
    }
}
