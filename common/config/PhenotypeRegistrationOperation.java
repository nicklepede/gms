package com.google.android.gms.common.config;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.phenotype.RegistrationInfo;
import defpackage.aqxd;
import defpackage.arne;
import defpackage.asej;
import defpackage.asni;
import defpackage.asot;
import defpackage.bhfk;
import defpackage.bul;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.feep;
import defpackage.fnaf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhenotypeRegistrationOperation extends IntentOperation {
    private static final asot b = asot.b("PhenotypeRegOp", asej.CORE);
    private static final String[] c = {"com.google.android.chimera.MODULE_CONFIGURATION_CHANGED", "com.google.android.gms.phenotype.DAILY_CHECKIN", "android.intent.action.BOOT_COMPLETED"};
    cwal a;

    final void a(List list) {
        dfaq i = this.a.i((RegistrationInfo[]) list.toArray(new RegistrationInfo[list.size()]));
        try {
            if (fnaf.a.a().l()) {
                dfbl.n(i);
            } else {
                dfbl.o(i, 10000L, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException e) {
            e = e;
            ((ejhf) ((ejhf) b.j()).s(e)).x("Phenotype bulk registration failed");
        } catch (ExecutionException e2) {
            ((ejhf) ((ejhf) b.i()).s(e2)).x("Phenotype bulk registration failed");
        } catch (TimeoutException e3) {
            e = e3;
            ((ejhf) ((ejhf) b.j()).s(e)).x("Phenotype bulk registration failed");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aqxd aqxdVar = cvzk.a;
        this.a = new cwal(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        if (intent == null || !asni.e(c, intent.getAction())) {
            ((ejhf) b.i()).x("Invalid intent");
            return;
        }
        try {
            Collection allModulesWithMetadata = ModuleManager.get(this).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto");
            bul bulVar = new bul();
            Iterator it = allModulesWithMetadata.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                try {
                    byte[] byteArray = moduleInfo.getMetadata(this).getByteArray("com.google.android.gms.phenotype.registration.proto");
                    if (byteArray == null) {
                        ((ejhf) b.i()).B("Failed to read metadata for %s", moduleInfo.moduleId);
                    } else {
                        bhfk bhfkVar = bhfk.a;
                        int length = byteArray.length;
                        febw febwVar = febw.a;
                        feep feepVar = feep.a;
                        fecp y = fecp.y(bhfkVar, byteArray, 0, length, febw.a);
                        fecp.M(y);
                        for (RegistrationInfo registrationInfo : arne.c(this, (bhfk) y, moduleInfo.moduleVersion)) {
                            String str = registrationInfo.c;
                            if (bulVar.containsKey(str)) {
                                "com.google.android.gms".equals(str);
                            } else {
                                bulVar.put(str, registrationInfo);
                                String str2 = moduleInfo.moduleId;
                            }
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    ((ejhf) b.i()).P("Failed to build phenotype registration for %s:%s", moduleInfo.moduleId, e.getMessage());
                } catch (RuntimeException e2) {
                    e = e2;
                    ((ejhf) b.i()).P("Failed to build phenotype registration for %s:%s", moduleInfo.moduleId, e.getMessage());
                }
            }
            if (!bulVar.containsKey("com.google.android.gms") && getPackageName().equals("com.google.android.gms")) {
                ((ejhf) b.i()).x("Core gms application properties were not set in phenotype registration.");
            }
            ArrayList arrayList = new ArrayList(bulVar.d);
            for (i = 0; i < bulVar.d; i++) {
                arrayList.add((RegistrationInfo) bulVar.i(i));
            }
            a(arrayList);
        } catch (InvalidConfigException e3) {
            ((ejhf) ((ejhf) b.i()).s(e3)).x("Failed to load module configuration");
        }
    }
}
