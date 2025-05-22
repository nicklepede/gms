package com.google.android.gms.common.appdoctor;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.container.core.AppContextProvider;
import defpackage.atjv;
import defpackage.atkw;
import defpackage.auid;
import defpackage.aurd;
import defpackage.ausn;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqgb;
import defpackage.eqgo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.vqc;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GcmIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AppDoctorGcm", auid.CONTAINER);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.common.appdoctor.ACTION_GCM")) {
            ((eluo) ((eluo) a.i()).ai((char) 3152)).x("Empty or incorrect intent action.");
            return;
        }
        final vqc vqcVar = null;
        byte[] byteArrayExtra = intent.hasExtra("rawData") ? intent.getByteArrayExtra("rawData") : intent.hasExtra("RemotePushedConfigBase64") ? aurd.d(intent.getStringExtra("RemotePushedConfigBase64")) : null;
        if (byteArrayExtra == null) {
            ((eluo) ((eluo) a.i()).ai((char) 3151)).x("Intent didn't contain a RemotePushedConfig extra.");
        } else {
            try {
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgri y = fgri.y(vqc.a, byteArrayExtra, 0, byteArrayExtra.length, fgqp.a);
                fgri.M(y);
                vqcVar = (vqc) y;
            } catch (fgsd e) {
                ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 3150)).x("Failed to decode and parse the RemotePushedConfig payload.");
            }
        }
        if (vqcVar == null) {
            return;
        }
        final atjv a2 = atjv.a();
        atkw atkwVar = a2.c;
        eqgo eqgoVar = a2.b;
        try {
            ((eqcy) eqdl.g(eqdl.g(eqgb.h(atkwVar.b.b(new ekut() { // from class: atko
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    vrb vrbVar = (vrb) obj;
                    int i = atky.a;
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
                    vqc vqcVar2 = vqc.this;
                    vqx vqxVar = vqcVar2.b;
                    if (vqxVar == null) {
                        vqxVar = vqx.a;
                    }
                    atky.d(vqxVar, Integer.valueOf(vqcVar2.c), a3, linkedHashMap2, linkedHashMap3, linkedHashMap4);
                    return atky.c(linkedHashMap2, linkedHashMap4);
                }
            }, eqgoVar)), new eqdv() { // from class: atjf
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return atjv.this.g(this);
                }
            }, eqgoVar), new eqdv() { // from class: atjg
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    return atjv.this.h(this);
                }
            }, eqgoVar)).u();
        } catch (InterruptedException | ExecutionException e2) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e2)).ai((char) 3153)).x("Failed to update the RemotePushedConfig.");
        }
    }
}
