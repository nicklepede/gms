package com.google.android.gms.mdi.download.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.auua;
import defpackage.ceqg;
import defpackage.dhmr;
import defpackage.dstx;
import defpackage.frvd;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SystemEventIntentOperation extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.icing.mdd");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i = dstx.a;
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
            if (frvd.f()) {
                aszs aszsVar = ceqg.a;
                atad atadVar = new atad(this, (int[][][]) null);
                try {
                    atfn atfnVar = new atfn();
                    atfnVar.d = 309;
                    atfnVar.a = new atfd() { // from class: cept
                        @Override // defpackage.atfd
                        public final void d(Object obj, Object obj2) {
                            ceqo ceqoVar = (ceqo) obj;
                            ((cepq) ceqoVar.H()).h(new ceqe((dhma) obj2), bsxa.a(ceqoVar.r));
                        }
                    };
                    dhmr.n(atadVar.jd(atfnVar.a()));
                } catch (InterruptedException | ExecutionException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "null";
                    }
                    dstx.b(message);
                }
            }
        }
    }
}
