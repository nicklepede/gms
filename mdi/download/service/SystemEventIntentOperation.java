package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.asqg;
import defpackage.cchm;
import defpackage.dfbl;
import defpackage.dqjp;
import defpackage.fpbw;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SystemEventIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.icing.mdd");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i = dqjp.a;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Iterator<String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                extras.get(it.next());
            }
        }
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action)) && "com.google.android.gms.icing.mdd".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            MddGcmTaskChimeraService.d();
            if (fpbw.f()) {
                aqxd aqxdVar = cchm.a;
                aqxo aqxoVar = new aqxo(this, (int[][][]) null);
                try {
                    arcy arcyVar = new arcy();
                    arcyVar.d = 309;
                    arcyVar.a = new arco() { // from class: ccgz
                        @Override // defpackage.arco
                        public final void d(Object obj, Object obj2) {
                            cchu cchuVar = (cchu) obj;
                            cchk cchkVar = new cchk((dfau) obj2);
                            Context context = cchuVar.r;
                            ((ccgw) cchuVar.H()).h(cchkVar, new ApiMetadata(new ComplianceOptions(-1, -1, 0, true)));
                        }
                    };
                    dfbl.n(aqxoVar.iO(arcyVar.a()));
                } catch (InterruptedException | ExecutionException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    dqjp.b(message);
                }
            }
        }
    }
}
