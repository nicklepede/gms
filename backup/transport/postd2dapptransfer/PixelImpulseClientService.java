package com.google.android.gms.backup.transport.postd2dapptransfer;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.backup.transport.postd2dapptransfer.PixelImpulseClientService;
import defpackage.ajwt;
import defpackage.amkx;
import defpackage.amlm;
import defpackage.auad;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.qzr;
import defpackage.ral;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PixelImpulseClientService extends BoundService {
    private static final auad a = ajwt.a("PixelImpulseClientService");

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        a.j("PixelImpulseClientService onBind", new Object[0]);
        auad auadVar = amkx.a;
        final ral ralVar = new ral(this, amkx.b);
        final amlm amlmVar = new amlm();
        return new qzr(ralVar, new fxwd() { // from class: amkt
            @Override // defpackage.fxwd
            public final Object a() {
                final PixelImpulseClientService pixelImpulseClientService = PixelImpulseClientService.this;
                final amlm amlmVar2 = amlmVar;
                final ral ralVar2 = ralVar;
                amkx.b(new Runnable() { // from class: amks
                    @Override // java.lang.Runnable
                    public final void run() {
                        amlp f = amlp.f(PixelImpulseClientService.this);
                        amkx.c(f, amlmVar2);
                        amkx.e(f.b(), ralVar2);
                    }
                }, "Failed to refresh app data cleanup listener configurations on server start", amlmVar2);
                return fxrq.a;
            }
        }, new fxwo() { // from class: amkq
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                final rap rapVar = (rap) obj;
                final ral ralVar2 = ralVar;
                final PixelImpulseClientService pixelImpulseClientService = PixelImpulseClientService.this;
                final amlm amlmVar2 = amlmVar;
                amkx.b(new Runnable() { // from class: amkr
                    @Override // java.lang.Runnable
                    public final void run() {
                        amkx.d(rapVar, amlp.f(PixelImpulseClientService.this), ralVar2, amlmVar2);
                    }
                }, "Failed to handle PixelStateChangeEvents", amlmVar2);
                return fxrq.a;
            }
        });
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        a.j("PixelImpulseClientService onCreate", new Object[0]);
    }
}
