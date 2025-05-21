package com.google.android.gms.auth.authzen;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.arxo;
import defpackage.deqy;
import defpackage.zse;
import defpackage.zwh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    public static final arxo a = new arxo("GcmReceiverService");

    public GcmReceiverChimeraService() {
        super("AuthZenGcmIntentReceiver");
        setIntentRedelivery(true);
    }

    public static void b(Context context, Intent intent) {
        intent.setClassName(context, "com.google.android.gms.auth.authzen.GcmReceiverService");
        context.startService(intent);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        try {
            try {
            } catch (RuntimeException e) {
                a.g("Error", e, new Object[0]);
            }
            if (intent == null) {
                a.m("Received null intent.", new Object[0]);
                int i = deqy.c;
                return;
            }
            a.j("Handling intent: " + intent.getAction(), new Object[0]);
            new zse(this, new zwh()).a(this, intent);
        } finally {
            deqy.b(intent);
        }
    }
}
