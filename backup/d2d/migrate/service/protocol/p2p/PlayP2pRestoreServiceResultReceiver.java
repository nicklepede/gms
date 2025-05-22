package com.google.android.gms.backup.d2d.migrate.service.protocol.p2p;

import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.backup.d2d.migrate.service.protocol.p2p.PlayP2pRestoreServiceResultReceiver;
import defpackage.ajwt;
import defpackage.akpl;
import defpackage.akpm;
import defpackage.akpn;
import defpackage.akpo;
import defpackage.akpw;
import defpackage.akqa;
import defpackage.caqj;
import defpackage.ekvl;
import defpackage.elgo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fkgw;
import defpackage.fkgx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PlayP2pRestoreServiceResultReceiver extends ResultReceiver {
    public final akpw a;
    private final ExecutorService b;
    private final List c;
    private final akqa d;

    public PlayP2pRestoreServiceResultReceiver(akqa akqaVar, akpw akpwVar, ExecutorService executorService) {
        super(new caqj(Looper.getMainLooper()));
        this.c = new ArrayList();
        ekvl.y(akqaVar);
        this.d = akqaVar;
        this.a = akpwVar;
        ekvl.y(executorService);
        this.b = executorService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [akpl] */
    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        if (i == 2) {
            this.d.b(elgo.i(this.c));
            final Bundle bundle2 = new Bundle();
            bundle2.putBoolean("p2pdisconnectservice", true);
            this.b.execute(new Runnable() { // from class: akpy
                @Override // java.lang.Runnable
                public final void run() {
                    PlayP2pRestoreServiceResultReceiver.this.a.b(bundle2);
                }
            });
            return;
        }
        if (i == 1) {
            ajwt ajwtVar = akpo.a;
            String string = bundle.getString("PACKAGE_NAME");
            byte[] byteArray = bundle.getByteArray("PACKAGE_APKS");
            ArrayList arrayList = new ArrayList();
            akpn akpnVar = null;
            if (string == null || byteArray == null) {
                akpo.a.f("No package name or apks found. Returning null", new Object[0]);
            } else {
                try {
                    fgri y = fgri.y(fkgx.a, byteArray, 0, byteArray.length, fgqp.a());
                    fgri.M(y);
                    fkgx fkgxVar = (fkgx) y;
                    if (fkgxVar != null) {
                        ajwt ajwtVar2 = akpo.a;
                        ajwtVar2.d("APK details received", new Object[0]);
                        ajwtVar2.d("Package Name:".concat(string), new Object[0]);
                        if ((2 & fkgxVar.b) != 0) {
                            fkgw fkgwVar = fkgxVar.c;
                            if (fkgwVar == null) {
                                fkgwVar = fkgw.a;
                            }
                            String str = fkgwVar.b;
                            fkgw fkgwVar2 = fkgxVar.c;
                            if (fkgwVar2 == null) {
                                fkgwVar2 = fkgw.a;
                            }
                            akpn akpnVar2 = new akpn(str, fkgwVar2.c);
                            ajwtVar2.d("Base apk details: ".concat(akpnVar2.toString()), new Object[0]);
                            if (!fkgxVar.d.isEmpty()) {
                                ajwtVar2.d("Split details:", new Object[0]);
                                for (fkgw fkgwVar3 : fkgxVar.d) {
                                    akpm akpmVar = new akpm(fkgwVar3.b, fkgwVar3.c);
                                    arrayList.add(akpmVar);
                                    ajwtVar2.d(akpmVar.toString(), new Object[0]);
                                }
                            }
                            akpnVar = akpnVar2;
                        } else {
                            ajwtVar2.f("No base master apk found. Returning null", new Object[0]);
                        }
                    }
                    akpnVar = new akpl(string, akpnVar, elgo.i(arrayList));
                } catch (fgsd unused) {
                    akpo.a.f("invalid protocol exception", new Object[0]);
                }
            }
            if (akpnVar != null) {
                this.c.add(akpnVar);
            }
        }
    }
}
