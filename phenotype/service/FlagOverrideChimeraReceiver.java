package com.google.android.gms.phenotype.service;

import com.google.android.chimera.BroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.eiuu;
import defpackage.epqi;
import defpackage.epqj;
import defpackage.epqm;
import defpackage.feab;
import defpackage.fecj;
import defpackage.feeq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class FlagOverrideChimeraReceiver extends BroadcastReceiver {
    public static final asot b = asot.e(asej.PHENOTYPE);

    public static List a(List list, eiuu eiuuVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            epqj epqjVar = (epqj) it.next();
            List b2 = b(epqjVar.f, eiuuVar);
            List b3 = b(epqjVar.j, eiuuVar);
            if (!b2.isEmpty() || !b3.isEmpty()) {
                fecj fecjVar = (fecj) epqjVar.iB(5, null);
                fecjVar.X(epqjVar);
                epqi epqiVar = (epqi) fecjVar;
                if (!b2.isEmpty()) {
                    if (!epqiVar.b.L()) {
                        epqiVar.U();
                    }
                    ((epqj) epqiVar.b).f = feeq.a;
                    if (!epqiVar.b.L()) {
                        epqiVar.U();
                    }
                    epqj epqjVar2 = (epqj) epqiVar.b;
                    epqjVar2.c();
                    feab.E(b2, epqjVar2.f);
                }
                if (!b3.isEmpty()) {
                    if (!epqiVar.b.L()) {
                        epqiVar.U();
                    }
                    ((epqj) epqiVar.b).j = feeq.a;
                    if (!epqiVar.b.L()) {
                        epqiVar.U();
                    }
                    epqj epqjVar3 = (epqj) epqiVar.b;
                    epqjVar3.b();
                    feab.E(b3, epqjVar3.j);
                }
                arrayList.add((epqj) epqiVar.Q());
            }
        }
        return arrayList;
    }

    private static List b(List list, eiuu eiuuVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            epqm epqmVar = (epqm) it.next();
            if (eiuuVar.contains(epqmVar.e) || eiuuVar.contains(epqmVar.f)) {
                arrayList.add(epqmVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:60|(9:62|(1:(1:(1:(1:(3:32|33|34)(1:31)))(1:48))(1:49))(1:50)|36|37|38|(1:40)(1:44)|41|42|43)|63|(0)(0)|36|37|38|(0)(0)|41|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        ((defpackage.ejhf) com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver.b.j()).P("Invalid flag value for flag type %s: %s", r13[r10], r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    @Override // com.google.android.chimera.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(final android.content.Context r19, final android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
