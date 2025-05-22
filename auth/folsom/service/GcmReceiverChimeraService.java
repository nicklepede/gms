package com.google.android.gms.auth.folsom.service;

import android.content.Intent;
import com.google.android.gms.auth.folsom.service.GcmReceiverChimeraService;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.adbt;
import defpackage.adbu;
import defpackage.adnb;
import defpackage.adng;
import defpackage.auad;
import defpackage.aupz;
import defpackage.eqgo;
import defpackage.fnpo;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    public static final /* synthetic */ int b = 0;
    private static final auad c = adng.a("GcmReceiverChimeraService");
    public final adbt a;
    private final eqgo d;

    public GcmReceiverChimeraService() {
        this(new adbt(UUID.randomUUID().toString()));
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        if (intent == null) {
            c.d("Null intent. Ignore.", new Object[0]);
            return;
        }
        if (!adnb.b) {
            c.m("Gcm ping received on device with build < P. Ignore.", new Object[0]);
        } else if (!fnpo.c()) {
            c.m("The RecoverableKeyStoreGms module is not enabled.", new Object[0]);
        } else {
            adbu.a.c(this);
            this.d.execute(new Runnable() { // from class: adik
                @Override // java.lang.Runnable
                public final void run() {
                    GcmReceiverChimeraService gcmReceiverChimeraService = GcmReceiverChimeraService.this;
                    gcmReceiverChimeraService.a.b(gcmReceiverChimeraService.getApplicationContext(), true, 7);
                }
            });
        }
    }

    public GcmReceiverChimeraService(adbt adbtVar) {
        super("GcmReceiverService");
        this.d = new aupz(1, 10);
        setIntentRedelivery(true);
        this.a = adbtVar;
    }
}
