package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.bslt;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eunb;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GcmReceiverChimeraService extends TracingIntentService {
    public GcmReceiverChimeraService() {
        super("GcmReceiverChimeraService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        if (intent.hasExtra("account_name")) {
            String stringExtra = intent.getStringExtra("account_name");
            String stringExtra2 = intent.getStringExtra("ulp");
            if (stringExtra == null) {
                return;
            }
            ekvi ekviVar = ektg.a;
            if (stringExtra2 != null) {
                try {
                    byte[] decode = Base64.decode(stringExtra2, 0);
                    eunb eunbVar = eunb.a;
                    int length = decode.length;
                    fgqp fgqpVar = fgqp.a;
                    fgti fgtiVar = fgti.a;
                    fgri y = fgri.y(eunbVar, decode, 0, length, fgqp.a);
                    fgri.M(y);
                    ekviVar = ekvi.i((eunb) y);
                } catch (fgsd unused) {
                }
            }
            if (ekviVar.h()) {
                bslt.a().m(stringExtra, (eunb) ekviVar.c());
            } else {
                bslt.a().j(stringExtra);
            }
        }
    }
}
