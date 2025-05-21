package com.google.android.gms.scheduler.standalone.housekeeping;

import android.content.Context;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.scheduler.standalone.housekeeping.HousekeepingTrainTaskService;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asnv;
import defpackage.asnz;
import defpackage.asot;
import defpackage.byln;
import defpackage.bymm;
import defpackage.cybn;
import defpackage.cyby;
import defpackage.cyhe;
import defpackage.cyhs;
import defpackage.cyhu;
import defpackage.cyhz;
import defpackage.dfbl;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fncn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class HousekeepingTrainTaskService extends GmsTaskBoundService {
    private static final long c = 300000;
    public final cyhe b;
    private final asnv e;
    public static final asot a = asot.b("HKTTrainService", asej.SCHEDULER);
    private static final bymm d = new bymm(new eijr() { // from class: cyhl
        @Override // defpackage.eijr
        public final Object a() {
            return fnbr.j();
        }
    });

    public HousekeepingTrainTaskService() {
        asot asotVar = cyhe.a;
        this.b = cybn.b().c;
        this.e = asnz.a;
    }

    private static final int e(Context context) {
        return ((Boolean) cyhz.a(context).a.e(false)).booleanValue() ? 1 : 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(final byln bylnVar) {
        cyhe cyheVar = this.b;
        if (cyheVar == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 9464)).x("HousekeepingScheduler is null. Not running any tasks");
            return 2;
        }
        cyhu b = cyhu.b(bylnVar);
        fncn fncnVar = fncn.a;
        if (fncnVar.a().x()) {
            if (b.c) {
                if (this.e.a() >= b.h) {
                    cyheVar.h(bylnVar);
                    return 0;
                }
            }
        } else if (!b.c) {
            if (this.e.a() >= b.h) {
                cyheVar.h(bylnVar);
                return 0;
            }
        }
        boolean z = true;
        if (fncn.a.a().q()) {
            try {
                asmf asmfVar = new asmf(Math.min((int) (e(AppContextProvider.a()) == 1 ? fncnVar.a().f() : fncnVar.a().e()), 8), 10);
                List<cyby> c2 = cyheVar.c(bylnVar);
                final ArrayList arrayList = new ArrayList();
                final cyhs a2 = cyheVar.d.a(bylnVar.a);
                for (final cyby cybyVar : c2) {
                    arrayList.add(asmfVar.submit(new Callable() { // from class: cyhj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(HousekeepingTrainTaskService.this.d(bylnVar, cybyVar, a2));
                        }
                    }));
                }
                return ((Integer) ((enpf) ensj.a(arrayList).a(new Callable() { // from class: cyhk
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        HousekeepingTrainTaskService housekeepingTrainTaskService = HousekeepingTrainTaskService.this;
                        if (housekeepingTrainTaskService.b == null) {
                            ((ejhf) ((ejhf) HousekeepingTrainTaskService.a.j()).ah((char) 9461)).x("HousekeepingScheduler is null. Not reporting any results");
                            return 2;
                        }
                        Iterator it = arrayList.iterator();
                        long j = Long.MAX_VALUE;
                        while (it.hasNext()) {
                            try {
                                j = Math.min(j, ((Long) ensj.r((enss) it.next())).longValue());
                            } catch (ExecutionException e) {
                                ((ejhf) ((ejhf) ((ejhf) HousekeepingTrainTaskService.a.j()).s(e)).ah((char) 9460)).x("Failed to fetch execution results");
                            }
                        }
                        byln bylnVar2 = bylnVar;
                        if (j != Long.MAX_VALUE) {
                            housekeepingTrainTaskService.b.i(bylnVar2, j);
                        } else {
                            housekeepingTrainTaskService.b.j(bylnVar2);
                        }
                        return 0;
                    }
                }, enre.a)).u()).intValue();
            } catch (InterruptedException | ExecutionException unused) {
                return 0;
            }
        }
        cyhe cyheVar2 = this.b;
        Iterator it = cyheVar2.c(bylnVar).iterator();
        long j = Long.MAX_VALUE;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            cyby cybyVar2 = (cyby) it.next();
            fncn fncnVar2 = fncn.a;
            if (fncnVar2.a().A() && i >= fncnVar2.a().h()) {
                j = Math.min(j, this.e.b());
                break;
            }
            long j2 = cybyVar2.d;
            if (j2 > this.e.b()) {
                j = Math.min(j, j2);
                z2 = true;
            } else {
                try {
                    dfbl.n(cyheVar2.b(bylnVar, cybyVar2));
                    i++;
                } catch (InterruptedException unused2) {
                    ((ejhf) ((ejhf) a.h()).ah((char) 9462)).B("Unable to get a result for %s due to InterruptedException. Probably due to timeout", cybyVar2);
                    this.b.h(bylnVar);
                    return 0;
                } catch (ExecutionException e) {
                    ((ejhf) ((ejhf) a.j()).ah(9463)).P("Unable to get a result for %s due to %s", cybyVar2, e.getMessage());
                    this.b.i(bylnVar, c);
                    return 2;
                }
            }
        }
        if (z) {
            this.b.i(bylnVar, j - this.e.b());
        } else {
            this.b.j(bylnVar);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r3.hasCapability(11) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (r3.isActiveNetworkMetered() == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(defpackage.byln r9, defpackage.cyby r10, defpackage.cyhs r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.scheduler.standalone.housekeeping.HousekeepingTrainTaskService.d(byln, cyby, cyhs):long");
    }

    HousekeepingTrainTaskService(cyhe cyheVar, asnv asnvVar) {
        this.b = cyheVar;
        this.e = asnvVar;
    }
}
