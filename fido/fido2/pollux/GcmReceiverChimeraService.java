package com.google.android.gms.fido.fido2.pollux;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.bcnj;
import defpackage.ejtk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private static final bcnj a = new bcnj("GcmReceiverService");

    public GcmReceiverChimeraService() {
        super("GcmReceiverService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        a.h("GCM message received, triggering caBLE scan...", new Object[0]);
        Intent intent2 = new Intent().setAction("com.google.android.gms.fido.CABLE_AUTHENTICATOR").setPackage(getPackageName());
        String stringExtra = intent.getStringExtra("client_eid");
        if (stringExtra != null) {
            try {
                intent2.putExtra("client_eid", ejtk.d.p(stringExtra));
            } catch (IllegalArgumentException e) {
                a.n("Failed to decode base64 client eid from GCM message", e, new Object[0]);
            }
        }
        sendBroadcast(intent2);
    }

    GcmReceiverChimeraService(Context context) {
        this();
        attachBaseContext(context);
    }
}
