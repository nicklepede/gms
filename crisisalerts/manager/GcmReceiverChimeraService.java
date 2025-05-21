package com.google.android.gms.crisisalerts.manager;

import android.content.Intent;
import android.os.Bundle;
import defpackage.axdg;
import defpackage.axeg;
import defpackage.axex;
import defpackage.bhyb;
import defpackage.earl;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.ffab;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends axex {
    private static final earl b;
    public axeg a;

    static {
        axdg.a("Gcm");
        b = new earl(50, new Supplier() { // from class: axep
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(fnhq.f());
            }
        });
    }

    public GcmReceiverChimeraService() {
        super("CrisisAlerts");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        try {
            earl earlVar = b;
            earlVar.d(1);
            if (intent == null) {
                earlVar.d(2);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    earlVar.d(4);
                } else {
                    byte[] byteArray = extras.getByteArray("rawData");
                    if (byteArray == null) {
                        earlVar.d(5);
                    } else {
                        try {
                            fecp y = fecp.y(ffab.a, byteArray, 0, byteArray.length, febw.a());
                            fecp.M(y);
                            earlVar.d(6);
                            if (this.a.b((ffab) y)) {
                                earlVar.d(6);
                            } else {
                                earlVar.d(3);
                            }
                        } catch (fedk unused) {
                            b.d(7);
                        }
                    }
                }
            }
        } finally {
            bhyb.b(intent);
        }
    }
}
