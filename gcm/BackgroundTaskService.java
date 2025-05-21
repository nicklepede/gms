package com.google.android.gms.gcm;

import android.util.Log;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.bhwq;
import defpackage.bhwt;
import defpackage.bhwz;
import defpackage.biad;
import defpackage.bial;
import defpackage.biew;
import defpackage.bihd;
import defpackage.bilf;
import defpackage.bilg;
import defpackage.byln;
import defpackage.eiid;
import defpackage.eitj;
import defpackage.ejfh;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.feeq;
import defpackage.foid;
import defpackage.fojc;
import defpackage.fzai;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class BackgroundTaskService extends GmsTaskChimeraService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (Objects.equals(str, "PersistConnectionInfos")) {
            bhwz.b().j().d();
        } else if (Objects.equals(str, "LogPhenotypeExperimentIds")) {
            bhwz.b().c().b(bilg.a, null);
        } else if (Objects.equals(str, "affinityUpdateTask")) {
            biad i = bhwz.b().i();
            if (foid.d()) {
                fzai d = fzai.d(foid.a.a().c());
                biew biewVar = i.a;
                ejfh it = ((eitj) biewVar.f()).iterator();
                while (it.hasNext()) {
                    bhwt bhwtVar = (bhwt) it.next();
                    fojc.G();
                    bilf bilfVar = (bilf) bilg.a.v();
                    fojc.G();
                    if (((bilg) bilfVar.b).d.size() > 0) {
                        i.c.b((bilg) bilfVar.Q(), null);
                    }
                    fecj fecjVar = (fecj) bhwtVar.iB(5, null);
                    fecjVar.X(bhwtVar);
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (bhwq bhwqVar : DesugarCollections.unmodifiableList(((bhwt) fecjVar.b).i)) {
                        if (System.currentTimeMillis() - bhwqVar.c < d.b) {
                            arrayList.add(bhwqVar);
                        } else {
                            z = true;
                        }
                    }
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    ((bhwt) fecjVar.b).i = feeq.a;
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    bhwt bhwtVar2 = (bhwt) fecjVar.b;
                    fedh fedhVar = bhwtVar2.i;
                    if (!fedhVar.c()) {
                        bhwtVar2.i = fecp.E(fedhVar);
                    }
                    feab.E(arrayList, bhwtVar2.i);
                    if (z) {
                        bhwt bhwtVar3 = (bhwt) fecjVar.Q();
                        biewVar.i(bhwtVar3);
                        Iterator it2 = i.b.iterator();
                        while (it2.hasNext()) {
                            bial bialVar = ((bihd) it2.next()).a;
                            eiid e = bial.e(bhwtVar3);
                            if (e.h()) {
                                bialVar.k(bial.b(bhwtVar3), ((Double) e.c()).doubleValue());
                            } else {
                                bialVar.i(bial.b(bhwtVar3));
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
