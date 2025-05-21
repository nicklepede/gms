package com.google.android.gms.tflite.examplestore;

import android.util.Log;
import defpackage.bqeq;
import defpackage.bqik;
import defpackage.dfew;
import defpackage.dffk;
import defpackage.dffm;
import defpackage.dffn;
import defpackage.esvf;
import defpackage.feag;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TfLiteExampleStoreService extends bqeq {
    @Override // defpackage.bqeq
    public final void a(String str, byte[] bArr, byte[] bArr2, bqik bqikVar, esvf esvfVar) {
        dffn dffnVar = dffn.a;
        try {
            fecp y = fecp.y(feag.a, bArr2, 0, bArr2.length, febw.a());
            fecp.M(y);
            feag feagVar = (feag) y;
            try {
                if (!feagVar.equals(feag.a) && !feagVar.b.equals("type.googleapis.com/google.android.gms.tflite.ResumptionPoint")) {
                    throw new fedk(String.format("Incorrect type url: %s, expected: %s", feagVar.b, "type.googleapis.com/google.android.gms.tflite.ResumptionPoint"));
                }
                feay feayVar = feagVar.c;
                febw a = febw.a();
                dffm dffmVar = dffm.a;
                febe k = feayVar.k();
                fecp x = dffmVar.x();
                try {
                    try {
                        try {
                            feex b = feep.a.b(x);
                            b.l(x, febf.p(k), a);
                            b.g(x);
                            try {
                                k.z(0);
                                fecp.M(x);
                                dffm dffmVar2 = (dffm) x;
                                if (dffmVar2.c < 0) {
                                    throw new fedk("Last consumed timestamp less than zero");
                                }
                                dffk a2 = dffk.a();
                                bqikVar.b(new dfew(a2.b, str, dffmVar2, a2.c));
                            } catch (fedk e) {
                                throw e;
                            }
                        } catch (fedk e2) {
                            if (!e2.a) {
                                throw e2;
                            }
                            throw new fedk(e2);
                        } catch (fefm e3) {
                            throw e3.a();
                        }
                    } catch (RuntimeException e4) {
                        if (!(e4.getCause() instanceof fedk)) {
                            throw e4;
                        }
                        throw ((fedk) e4.getCause());
                    }
                } catch (IOException e5) {
                    if (!(e5.getCause() instanceof fedk)) {
                        throw new fedk(e5);
                    }
                    throw ((fedk) e5.getCause());
                }
            } catch (fedk e6) {
                Log.e("TfLiteExampleStoreSvc", "Parsing of ResumptionPoint failed.");
                bqikVar.a(10, e6.getMessage());
            }
        } catch (fedk unused) {
            Log.e("TfLiteExampleStoreSvc", "Error parsing Any proto from resumptionPoint");
            bqikVar.a(10, "Error parsing Any proto from resumptionPoint");
        }
    }
}
