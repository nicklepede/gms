package com.google.android.gms.common.appdoctor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.container.core.AppContextProvider;
import defpackage.atjv;
import defpackage.atkw;
import defpackage.auua;
import defpackage.ekut;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AppDoctorConfigChangedIntentOperation extends IntentOperation {
    static final String a = auua.f("com.google.android.gms.appdoctor");

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
                final atjv a2 = atjv.a();
                atkw atkwVar = a2.c;
                eqgo eqgoVar = a2.b;
                ((eqcy) eqdl.g(eqdl.g(eqgb.h(atkwVar.b.b(new ekut() { // from class: atkl
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        vrb vrbVar = (vrb) obj;
                        int i2 = atky.a;
                        Context a3 = AppContextProvider.a();
                        fxxm.f(a3, "context");
                        fxxm.f(vrbVar, "storage");
                        fgsa fgsaVar = vrbVar.b;
                        fxxm.e(fgsaVar, "getFixProposalList(...)");
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fxza.e(fxtb.a(fxsr.o(fgsaVar, 10)), 16));
                        for (Object obj2 : fgsaVar) {
                            vqv vqvVar = ((vra) obj2).d;
                            if (vqvVar == null) {
                                vqvVar = vqv.a;
                            }
                            linkedHashMap.put(vqvVar.e, obj2);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            vra vraVar = (vra) entry.getValue();
                            fxxm.c(vraVar);
                            if (!atky.a(vraVar)) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        for (vqu vquVar : fmrm.a.lK().a().c) {
                            fxxm.c(vquVar);
                            atky.b(vquVar, null, a3, linkedHashMap2, linkedHashMap3, linkedHashMap4);
                        }
                        return atky.c(linkedHashMap2, linkedHashMap4);
                    }
                }, eqgoVar)), new eqdv() { // from class: atjd
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        return atjv.this.g(this);
                    }
                }, eqgoVar), new eqdv() { // from class: atje
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        return atjv.this.h(this);
                    }
                }, eqgoVar)).u();
            } catch (InterruptedException | ExecutionException e) {
                Log.e("AppDoctorConfigChanged", "Failed to update config.", e);
            }
        }
    }
}
