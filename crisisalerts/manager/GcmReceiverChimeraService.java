package com.google.android.gms.crisisalerts.manager;

import android.content.Intent;
import android.os.Bundle;
import defpackage.azhg;
import defpackage.azig;
import defpackage.azix;
import defpackage.bkcq;
import defpackage.eddy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fhoz;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmReceiverChimeraService extends azix {
    private static final eddy b;
    public azig a;

    static {
        azhg.a("Gcm");
        b = new eddy(50, new Supplier() { // from class: azip
            @Override // java.util.function.Supplier
            public final Object get() {
                return Boolean.valueOf(fpzr.f());
            }
        });
    }

    public GcmReceiverChimeraService() {
        super("CrisisAlerts");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        try {
            eddy eddyVar = b;
            eddyVar.d(1);
            if (intent == null) {
                eddyVar.d(2);
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    eddyVar.d(4);
                } else {
                    byte[] byteArray = extras.getByteArray("rawData");
                    if (byteArray == null) {
                        eddyVar.d(5);
                    } else {
                        try {
                            fgri y = fgri.y(fhoz.a, byteArray, 0, byteArray.length, fgqp.a());
                            fgri.M(y);
                            eddyVar.d(6);
                            if (this.a.b((fhoz) y)) {
                                eddyVar.d(6);
                            } else {
                                eddyVar.d(3);
                            }
                        } catch (fgsd unused) {
                            b.d(7);
                        }
                    }
                }
            }
        } finally {
            bkcq.b(intent);
        }
    }
}
