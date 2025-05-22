package com.google.android.gms.gcm;

import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bkbf;
import defpackage.bkbi;
import defpackage.bkbo;
import defpackage.bkes;
import defpackage.bkfa;
import defpackage.bkjl;
import defpackage.bkls;
import defpackage.bkpu;
import defpackage.bkpv;
import defpackage.cauf;
import defpackage.ekvi;
import defpackage.elgo;
import defpackage.elso;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.fgtj;
import defpackage.frau;
import defpackage.frbt;
import defpackage.gbxc;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class BackgroundTaskService extends GmsTaskChimeraService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (Objects.equals(str, "PersistConnectionInfos")) {
            bkbo.b().j().d();
        } else if (Objects.equals(str, "LogPhenotypeExperimentIds")) {
            bkbo.b().c().b(bkpv.a, null);
        } else if (Objects.equals(str, "affinityUpdateTask")) {
            bkes i = bkbo.b().i();
            if (frau.d()) {
                gbxc d = gbxc.d(frau.a.lK().c());
                bkjl bkjlVar = i.a;
                elso it = ((elgo) bkjlVar.f()).iterator();
                while (it.hasNext()) {
                    bkbi bkbiVar = (bkbi) it.next();
                    frbt.F();
                    bkpu bkpuVar = (bkpu) bkpv.a.v();
                    frbt.F();
                    if (((bkpv) bkpuVar.b).d.size() > 0) {
                        i.c.b((bkpv) bkpuVar.Q(), null);
                    }
                    fgrc fgrcVar = (fgrc) bkbiVar.iQ(5, null);
                    fgrcVar.X(bkbiVar);
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (bkbf bkbfVar : DesugarCollections.unmodifiableList(((bkbi) fgrcVar.b).i)) {
                        if (System.currentTimeMillis() - bkbfVar.c < d.b) {
                            arrayList.add(bkbfVar);
                        } else {
                            z = true;
                        }
                    }
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    ((bkbi) fgrcVar.b).i = fgtj.a;
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    bkbi bkbiVar2 = (bkbi) fgrcVar.b;
                    fgsa fgsaVar = bkbiVar2.i;
                    if (!fgsaVar.c()) {
                        bkbiVar2.i = fgri.E(fgsaVar);
                    }
                    fgou.E(arrayList, bkbiVar2.i);
                    if (z) {
                        bkbi bkbiVar3 = (bkbi) fgrcVar.Q();
                        bkjlVar.i(bkbiVar3);
                        Iterator it2 = i.b.iterator();
                        while (it2.hasNext()) {
                            bkfa bkfaVar = ((bkls) it2.next()).a;
                            ekvi e = bkfa.e(bkbiVar3);
                            if (e.h()) {
                                bkfaVar.k(bkfa.b(bkbiVar3), ((Double) e.c()).doubleValue());
                            } else {
                                bkfaVar.i(bkfa.b(bkbiVar3));
                            }
                        }
                    }
                }
            }
        } else {
            Log.w("GCM", "Unknown task: ".concat(str));
        }
        return 0;
    }
}
