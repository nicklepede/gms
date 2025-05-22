package com.google.android.gms.auth.authzen;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.abse;
import defpackage.abwh;
import defpackage.auad;
import defpackage.dhcb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    public static final auad a = new auad("GcmReceiverService");

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
                int i = dhcb.c;
                return;
            }
            a.j("Handling intent: " + intent.getAction(), new Object[0]);
            new abse(this, new abwh()).a(this, intent);
        } finally {
            dhcb.b(intent);
        }
    }
}
