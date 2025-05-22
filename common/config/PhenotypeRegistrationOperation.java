package com.google.android.gms.common.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import defpackage.aszs;
import defpackage.atpt;
import defpackage.auid;
import defpackage.aurc;
import defpackage.ausn;
import defpackage.bjka;
import defpackage.buy;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.dhmr;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgti;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhenotypeRegistrationOperation extends IntentOperation {
    private static final ausn b = ausn.b("PhenotypeRegOp", auid.CORE);
    private static final String[] c = {"com.google.android.chimera.MODULE_CONFIGURATION_CHANGED", "com.google.android.gms.phenotype.DAILY_CHECKIN", "android.intent.action.BOOT_COMPLETED"};
    cyki a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aszs aszsVar = cyjh.a;
        this.a = new cyki(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        if (intent == null || !aurc.e(c, intent.getAction())) {
            ((eluo) b.i()).x("Invalid intent");
            return;
        }
        try {
            Collection allModulesWithMetadata = ModuleManager.get(this).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto");
            buy buyVar = new buy();
            Iterator it = allModulesWithMetadata.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                try {
                    byte[] byteArray = moduleInfo.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto");
                    if (byteArray == null) {
                        ((eluo) b.i()).B("Failed to read metadata for %s", moduleInfo.moduleId);
                    } else {
                        bjka bjkaVar = bjka.a;
                        int length = byteArray.length;
                        fgqp fgqpVar = fgqp.a;
                        fgti fgtiVar = fgti.a;
                        fgri y = fgri.y(bjkaVar, byteArray, 0, length, fgqp.a);
                        fgri.M(y);
                        for (RegistrationInfo registrationInfo : atpt.c(this, (bjka) y, moduleInfo.moduleVersion)) {
                            String str = registrationInfo.c;
                            if (buyVar.containsKey(str)) {
                                "com.google.android.gms".equals(str);
                            } else {
                                buyVar.put(str, registrationInfo);
                                String str2 = moduleInfo.moduleId;
                            }
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    ((eluo) b.i()).P("Failed to build phenotype registration for %s:%s", moduleInfo.moduleId, e.getMessage());
                } catch (RuntimeException e2) {
                    e = e2;
                    ((eluo) b.i()).P("Failed to build phenotype registration for %s:%s", moduleInfo.moduleId, e.getMessage());
                }
            }
            if (!buyVar.containsKey("com.google.android.gms") && getPackageName().equals("com.google.android.gms")) {
                ((eluo) b.i()).x("Core gms application properties were not set in phenotype registration.");
            }
            ArrayList arrayList = new ArrayList(buyVar.d);
            for (i = 0; i < buyVar.d; i++) {
                arrayList.add((RegistrationInfo) buyVar.i(i));
            }
            try {
                dhmr.n(this.a.i((RegistrationInfo[]) arrayList.toArray(new RegistrationInfo[arrayList.size()])));
            } catch (InterruptedException e3) {
                ((eluo) ((eluo) b.j()).s(e3)).x("Phenotype bulk registration failed");
            } catch (ExecutionException e4) {
                ((eluo) ((eluo) b.i()).s(e4)).x("Phenotype bulk registration failed");
            }
        } catch (InvalidConfigException e5) {
            ((eluo) ((eluo) b.i()).s(e5)).x("Failed to load module configuration");
        }
    }
}
