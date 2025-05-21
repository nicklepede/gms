package com.google.android.gms.common.appdoctor;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.container.core.AppContextProvider;
import defpackage.arhg;
import defpackage.arih;
import defpackage.asej;
import defpackage.asnj;
import defpackage.asot;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.ensi;
import defpackage.ensv;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.tuc;
import j$.util.Objects;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GcmIntentOperation extends IntentOperation {
    private static final asot a = asot.b("AppDoctorGcm", asej.CONTAINER);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !Objects.equals(intent.getAction(), "com.google.android.gms.common.appdoctor.ACTION_GCM")) {
            ((ejhf) ((ejhf) a.i()).ah((char) 3148)).x("Empty or incorrect intent action.");
            return;
        }
        final tuc tucVar = null;
        byte[] byteArrayExtra = intent.hasExtra("rawData") ? intent.getByteArrayExtra("rawData") : intent.hasExtra("RemotePushedConfigBase64") ? asnj.d(intent.getStringExtra("RemotePushedConfigBase64")) : null;
        if (byteArrayExtra == null) {
            ((ejhf) ((ejhf) a.i()).ah((char) 3147)).x("Intent didn't contain a RemotePushedConfig extra.");
        } else {
            try {
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                fecp y = fecp.y(tuc.a, byteArrayExtra, 0, byteArrayExtra.length, febw.a);
                fecp.M(y);
                tucVar = (tuc) y;
            } catch (fedk e) {
                ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 3146)).x("Failed to decode and parse the RemotePushedConfig payload.");
            }
        }
        if (tucVar == null) {
            return;
        }
        final arhg a2 = arhg.a();
        arih arihVar = a2.c;
        ensv ensvVar = a2.b;
        try {
            ((enpf) enps.g(enps.g(ensi.h(arihVar.b.b(new eiho() { // from class: arhz
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    tvb tvbVar = (tvb) obj;
                    int i = arij.a;
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
                    tuc tucVar2 = tuc.this;
                    tux tuxVar = tucVar2.b;
                    if (tuxVar == null) {
                        tuxVar = tux.a;
                    }
                    arij.d(tuxVar, Integer.valueOf(tucVar2.c), a3, linkedHashMap2, linkedHashMap3, linkedHashMap4);
                    return arij.c(linkedHashMap2, linkedHashMap4);
                }
            }, ensvVar)), new enqc() { // from class: argq
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return arhg.this.g(this);
                }
            }, ensvVar), new enqc() { // from class: argr
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    return arhg.this.h(this);
                }
            }, ensvVar)).u();
        } catch (InterruptedException | ExecutionException e2) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e2)).ah((char) 3149)).x("Failed to update the RemotePushedConfig.");
        }
    }
}
