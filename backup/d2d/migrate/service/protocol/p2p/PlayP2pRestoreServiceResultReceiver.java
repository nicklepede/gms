package com.google.android.gms.backup.d2d.migrate.service.protocol.p2p;

import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;
import defpackage.ahwd;
import defpackage.aiov;
import defpackage.aiow;
import defpackage.aiox;
import defpackage.aioy;
import defpackage.aipg;
import defpackage.aipk;
import defpackage.byhr;
import defpackage.eiig;
import defpackage.eitj;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.fhqz;
import defpackage.fhra;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PlayP2pRestoreServiceResultReceiver extends ResultReceiver {
    public final aipg a;
    private final ExecutorService b;
    private final List c;
    private final aipk d;

    public PlayP2pRestoreServiceResultReceiver(aipk aipkVar, aipg aipgVar, ExecutorService executorService) {
        super(new byhr(Looper.getMainLooper()));
        this.c = new ArrayList();
        eiig.x(aipkVar);
        this.d = aipkVar;
        this.a = aipgVar;
        eiig.x(executorService);
        this.b = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [aiov] */
    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        if (i == 2) {
            this.d.b(eitj.i(this.c));
            final Bundle bundle2 = new Bundle();
            bundle2.putBoolean("p2pdisconnectservice", true);
            this.b.execute(new Runnable() { // from class: aipi
                @Override // java.lang.Runnable
                public final void run() {
                    PlayP2pRestoreServiceResultReceiver.this.a.b(bundle2);
                }
            });
            return;
        }
        if (i == 1) {
            ahwd ahwdVar = aioy.a;
            String string = bundle.getString("PACKAGE_NAME");
            byte[] byteArray = bundle.getByteArray("PACKAGE_APKS");
            ArrayList arrayList = new ArrayList();
            aiox aioxVar = null;
            if (string == null || byteArray == null) {
                aioy.a.f("No package name or apks found. Returning null", new Object[0]);
            } else {
                try {
                    fecp y = fecp.y(fhra.a, byteArray, 0, byteArray.length, febw.a());
                    fecp.M(y);
                    fhra fhraVar = (fhra) y;
                    if (fhraVar != null) {
                        ahwd ahwdVar2 = aioy.a;
                        ahwdVar2.d("APK details received", new Object[0]);
                        ahwdVar2.d("Package Name:".concat(string), new Object[0]);
                        if ((2 & fhraVar.b) != 0) {
                            fhqz fhqzVar = fhraVar.c;
                            if (fhqzVar == null) {
                                fhqzVar = fhqz.a;
                            }
                            String str = fhqzVar.b;
                            fhqz fhqzVar2 = fhraVar.c;
                            if (fhqzVar2 == null) {
                                fhqzVar2 = fhqz.a;
                            }
                            aiox aioxVar2 = new aiox(str, fhqzVar2.c);
                            ahwdVar2.d("Base apk details: ".concat(aioxVar2.toString()), new Object[0]);
                            if (!fhraVar.d.isEmpty()) {
                                ahwdVar2.d("Split details:", new Object[0]);
                                for (fhqz fhqzVar3 : fhraVar.d) {
                                    aiow aiowVar = new aiow(fhqzVar3.b, fhqzVar3.c);
                                    arrayList.add(aiowVar);
                                    ahwdVar2.d(aiowVar.toString(), new Object[0]);
                                }
                            }
                            aioxVar = aioxVar2;
                        } else {
                            ahwdVar2.f("No base master apk found. Returning null", new Object[0]);
                        }
                    }
                    aioxVar = new aiov(string, aioxVar, eitj.i(arrayList));
                } catch (fedk unused) {
                    aioy.a.f("invalid protocol exception", new Object[0]);
                }
            }
            if (aioxVar != null) {
                this.c.add(aioxVar);
            }
        }
    }
}
