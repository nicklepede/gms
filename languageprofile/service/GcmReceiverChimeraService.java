package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import android.util.Base64;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.bqed;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.erxo;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
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
            eiid eiidVar = eigb.a;
            if (stringExtra2 != null) {
                try {
                    byte[] decode = Base64.decode(stringExtra2, 0);
                    erxo erxoVar = erxo.a;
                    int length = decode.length;
                    febw febwVar = febw.a;
                    feep feepVar = feep.a;
                    fecp y = fecp.y(erxoVar, decode, 0, length, febw.a);
                    fecp.M(y);
                    eiidVar = eiid.i((erxo) y);
                } catch (fedk unused) {
                }
            }
            if (eiidVar.h()) {
                bqed.a().m(stringExtra, (erxo) eiidVar.c());
            } else {
                bqed.a().j(stringExtra);
            }
        }
    }
}
