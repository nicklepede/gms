package com.google.android.gms.tflite.examplestore;

import android.util.Log;
import defpackage.bsmg;
import defpackage.bspz;
import defpackage.dhqc;
import defpackage.dhqq;
import defpackage.dhqs;
import defpackage.dhqt;
import defpackage.evkv;
import defpackage.fgoz;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TfLiteExampleStoreService extends bsmg {
    @Override // defpackage.bsmg
    public final void a(String str, byte[] bArr, byte[] bArr2, bspz bspzVar, evkv evkvVar) {
        dhqt dhqtVar = dhqt.a;
        try {
            fgri y = fgri.y(fgoz.a, bArr2, 0, bArr2.length, fgqp.a());
            fgri.M(y);
            fgoz fgozVar = (fgoz) y;
            try {
                if (!fgozVar.equals(fgoz.a) && !fgozVar.b.equals("type.googleapis.com/google.android.gms.tflite.ResumptionPoint")) {
                    throw new fgsd(String.format("Incorrect type url: %s, expected: %s", fgozVar.b, "type.googleapis.com/google.android.gms.tflite.ResumptionPoint"));
                }
                fgpr fgprVar = fgozVar.c;
                fgqp a = fgqp.a();
                dhqs dhqsVar = dhqs.a;
                fgpx k = fgprVar.k();
                fgri x = dhqsVar.x();
                try {
                    try {
                        try {
                            fgtq b = fgti.a.b(x);
                            b.l(x, fgpy.p(k), a);
                            b.g(x);
                            try {
                                k.z(0);
                                fgri.M(x);
                                dhqs dhqsVar2 = (dhqs) x;
                                if (dhqsVar2.c < 0) {
                                    throw new fgsd("Last consumed timestamp less than zero");
                                }
                                dhqq a2 = dhqq.a();
                                bspzVar.b(new dhqc(a2.b, str, dhqsVar2, a2.c));
                            } catch (fgsd e) {
                                throw e;
                            }
                        } catch (fgsd e2) {
                            if (!e2.a) {
                                throw e2;
                            }
                            throw new fgsd(e2);
                        } catch (fguf e3) {
                            throw e3.a();
                        }
                    } catch (RuntimeException e4) {
                        if (!(e4.getCause() instanceof fgsd)) {
                            throw e4;
                        }
                        throw ((fgsd) e4.getCause());
                    }
                } catch (IOException e5) {
                    if (!(e5.getCause() instanceof fgsd)) {
                        throw new fgsd(e5);
                    }
                    throw ((fgsd) e5.getCause());
                }
            } catch (fgsd e6) {
                Log.e("TfLiteExampleStoreSvc", "Parsing of ResumptionPoint failed.");
                bspzVar.a(10, e6.getMessage());
            }
        } catch (fgsd unused) {
            Log.e("TfLiteExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
            bspzVar.a(10, "Error parsing Any proto from resumptionPoint");
        }
    }
}
