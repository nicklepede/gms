package com.google.android.gms.common.appdoctor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.container.core.AppContextProvider;
import defpackage.arhg;
import defpackage.arih;
import defpackage.asqg;
import defpackage.eiho;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AppDoctorConfigChangedIntentOperation extends IntentOperation {
    static final String a = asqg.f("com.google.android.gms.appdoctor");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent.getAction() != null && a.equals(intent.getAction()) && "com.google.android.gms.appdoctor".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            int i = AppDoctorChimeraProvider.a;
            if (getPackageManager().getComponentEnabledSetting(new ComponentName(getPackageName(), "com.google.android.gms.common.appdoctor.AppDoctorProvider")) != 1) {
                Log.i("AppDoctorConfigChanged", "Enabling ContentProvider.");
                AppDoctorChimeraProvider.a(this);
            }
            Log.i("AppDoctorConfigChanged", "Refreshing configuration on flag commit.");
            try {
                final arhg a2 = arhg.a();
                arih arihVar = a2.c;
                ensv ensvVar = a2.b;
                ((enpf) enps.g(enps.g(ensi.h(arihVar.b.b(new eiho() { // from class: arhw
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        tvb tvbVar = (tvb) obj;
                        int i2 = arij.a;
                        Context a3 = AppContextProvider.a();
                        fvbo.f(a3, "context");
                        fvbo.f(tvbVar, "storage");
                        fedh fedhVar = tvbVar.b;
                        fvbo.e(fedhVar, "getFixProposalList(...)");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fvdc.e(fuxd.a(fuwt.o(fedhVar, 10)), 16));
                        for (Object obj2 : fedhVar) {
                            tuv tuvVar = ((tva) obj2).d;
                            if (tuvVar == null) {
                                tuvVar = tuv.a;
                            }
                            linkedHashMap.put(tuvVar.e, obj2);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            tva tvaVar = (tva) entry.getValue();
                            fvbo.c(tvaVar);
                            if (!arij.a(tvaVar)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (tuu tuuVar : fkbe.a.a().a().c) {
                            fvbo.c(tuuVar);
                            arij.b(tuuVar, null, a3, linkedHashMap2, linkedHashMap3, linkedHashMap4);
                        }
                        return arij.c(linkedHashMap2, linkedHashMap4);
                    }
                }, ensvVar)), new enqc() { // from class: argo
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        return arhg.this.g(this);
                    }
                }, ensvVar), new enqc() { // from class: argp
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        return arhg.this.h(this);
                    }
                }, ensvVar)).u();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("AppDoctorConfigChanged", "Failed to update config.", e);
            }
        }
    }
}
