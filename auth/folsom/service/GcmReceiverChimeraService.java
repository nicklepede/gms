package com.google.android.gms.auth.folsom.service;

import android.content.Intent;
import com.google.android.gms.auth.folsom.service.GcmReceiverChimeraService;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.abbt;
import defpackage.abbu;
import defpackage.abnb;
import defpackage.abng;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.ensv;
import defpackage.fkyh;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    public static final /* synthetic */ int b = 0;
    private static final arxo c = abng.a("GcmReceiverChimeraService");
    public final abbt a;
    private final ensv d;

    public GcmReceiverChimeraService() {
        this(new abbt(UUID.randomUUID().toString()));
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        if (intent == null) {
            c.d("Null intent. Ignore.", new Object[0]);
            return;
        }
        if (!abnb.b) {
            c.m("Gcm ping received on device with build < P. Ignore.", new Object[0]);
        } else if (!fkyh.c()) {
            c.m("The RecoverableKeyStoreGms module is not enabled.", new Object[0]);
        } else {
            abbu.a.c(this);
            this.d.execute(new Runnable() { // from class: abik
                @Override // java.lang.Runnable
                public final void run() {
                    GcmReceiverChimeraService gcmReceiverChimeraService = GcmReceiverChimeraService.this;
                    gcmReceiverChimeraService.a.b(gcmReceiverChimeraService.getApplicationContext(), true, 7);
                }
            });
        }
    }

    public GcmReceiverChimeraService(abbt abbtVar) {
        super("GcmReceiverService");
        this.d = new asmf(1, 10);
        setIntentRedelivery(true);
        this.a = abbtVar;
    }
}
