package com.google.android.gms.phenotype.service;

import com.google.android.chimera.BroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.elhz;
import defpackage.eseh;
import defpackage.esei;
import defpackage.esel;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgtj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class FlagOverrideChimeraReceiver extends BroadcastReceiver {
    public static final ausn b = ausn.e(auid.PHENOTYPE);

    public static List a(List list, elhz elhzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            esei eseiVar = (esei) it.next();
            List b2 = b(eseiVar.f, elhzVar);
            List b3 = b(eseiVar.j, elhzVar);
            if (!b2.isEmpty() || !b3.isEmpty()) {
                fgrc fgrcVar = (fgrc) eseiVar.iQ(5, null);
                fgrcVar.X(eseiVar);
                eseh esehVar = (eseh) fgrcVar;
                if (!b2.isEmpty()) {
                    if (!esehVar.b.L()) {
                        esehVar.U();
                    }
                    ((esei) esehVar.b).f = fgtj.a;
                    if (!esehVar.b.L()) {
                        esehVar.U();
                    }
                    esei eseiVar2 = (esei) esehVar.b;
                    eseiVar2.c();
                    fgou.E(b2, eseiVar2.f);
                }
                if (!b3.isEmpty()) {
                    if (!esehVar.b.L()) {
                        esehVar.U();
                    }
                    ((esei) esehVar.b).j = fgtj.a;
                    if (!esehVar.b.L()) {
                        esehVar.U();
                    }
                    esei eseiVar3 = (esei) esehVar.b;
                    eseiVar3.b();
                    fgou.E(b3, eseiVar3.j);
                }
                arrayList.add((esei) esehVar.Q());
            }
        }
        return arrayList;
    }

    private static List b(List list, elhz elhzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            esel eselVar = (esel) it.next();
            if (elhzVar.contains(eselVar.e) || elhzVar.contains(eselVar.f)) {
                arrayList.add(eselVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(11:60|(9:62|(1:(1:(1:(1:(3:32|33|34)(1:31)))(1:48))(1:49))(1:50)|36|37|38|(1:40)(1:44)|41|42|43)|63|(0)(0)|36|37|38|(0)(0)|41|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010f, code lost:
    
        ((defpackage.eluo) com.google.android.gms.phenotype.service.FlagOverrideChimeraReceiver.b.j()).P("Invalid flag value for flag type %s: %s", r13[r10], r4);
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
