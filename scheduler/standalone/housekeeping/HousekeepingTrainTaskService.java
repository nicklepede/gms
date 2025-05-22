package com.google.android.gms.scheduler.standalone.housekeeping;

import android.content.Context;
import com.google.android.gms.chimera.modules.scheduler.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.scheduler.standalone.housekeeping.HousekeepingTrainTaskService;
import defpackage.auid;
import defpackage.aupz;
import defpackage.aurp;
import defpackage.aurt;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cave;
import defpackage.dall;
import defpackage.dalw;
import defpackage.darc;
import defpackage.darq;
import defpackage.dars;
import defpackage.darx;
import defpackage.dhmr;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fpum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class HousekeepingTrainTaskService extends GmsTaskBoundService {
    private static final long c = 300000;
    public final darc b;
    private final aurp e;
    public static final ausn a = ausn.b("HKTTrainService", auid.SCHEDULER);
    private static final cave d = new cave(new ekww() { // from class: darj
        @Override // defpackage.ekww
        public final Object lK() {
            return fptq.j();
        }
    });

    public HousekeepingTrainTaskService() {
        ausn ausnVar = darc.a;
        this.b = dall.b().c;
        this.e = aurt.a;
    }

    private static final int e(Context context) {
        return ((Boolean) darx.a(context).a.e(false)).booleanValue() ? 1 : 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(final cauf caufVar) {
        darc darcVar = this.b;
        if (darcVar == null) {
            ((eluo) ((eluo) a.j()).ai((char) 9466)).x("HousekeepingScheduler is null. Not running any tasks");
            return 2;
        }
        dars b = dars.b(caufVar);
        fpum fpumVar = fpum.a;
        if (fpumVar.lK().x()) {
            if (b.c) {
                if (this.e.a() >= b.h) {
                    darcVar.h(caufVar);
                    return 0;
                }
            }
        } else if (!b.c) {
            if (this.e.a() >= b.h) {
                darcVar.h(caufVar);
                return 0;
            }
        }
        boolean z = true;
        if (fpumVar.lK().q()) {
            try {
                aupz aupzVar = new aupz(Math.min((int) (e(AppContextProvider.a()) == 1 ? fpumVar.lK().f() : fpumVar.lK().e()), 8), 10);
                List<dalw> c2 = darcVar.c(caufVar);
                final ArrayList arrayList = new ArrayList();
                final darq a2 = darcVar.d.a(caufVar.a);
                for (final dalw dalwVar : c2) {
                    arrayList.add(aupzVar.submit(new Callable() { // from class: darh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(HousekeepingTrainTaskService.this.d(caufVar, dalwVar, a2));
                        }
                    }));
                }
                return ((Integer) ((eqcy) eqgc.a(arrayList).a(new Callable() { // from class: dari
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        HousekeepingTrainTaskService housekeepingTrainTaskService = HousekeepingTrainTaskService.this;
                        if (housekeepingTrainTaskService.b == null) {
                            ((eluo) ((eluo) HousekeepingTrainTaskService.a.j()).ai((char) 9463)).x("HousekeepingScheduler is null. Not reporting any results");
                            return 2;
                        }
                        Iterator it = arrayList.iterator();
                        long j = Long.MAX_VALUE;
                        while (it.hasNext()) {
                            try {
                                j = Math.min(j, ((Long) eqgc.r((eqgl) it.next())).longValue());
                            } catch (ExecutionException e) {
                                ((eluo) ((eluo) ((eluo) HousekeepingTrainTaskService.a.j()).s(e)).ai((char) 9462)).x("Failed to fetch execution results");
                            }
                        }
                        cauf caufVar2 = caufVar;
                        if (j != Long.MAX_VALUE) {
                            housekeepingTrainTaskService.b.i(caufVar2, j);
                        } else {
                            housekeepingTrainTaskService.b.j(caufVar2);
                        }
                        return 0;
                    }
                }, eqex.a)).u()).intValue();
            } catch (InterruptedException | ExecutionException unused) {
                return 0;
            }
        }
        darc darcVar2 = this.b;
        Iterator it = darcVar2.c(caufVar).iterator();
        long j = Long.MAX_VALUE;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = z2;
                break;
            }
            dalw dalwVar2 = (dalw) it.next();
            fpum fpumVar2 = fpum.a;
            if (fpumVar2.lK().A() && i >= fpumVar2.lK().h()) {
                j = Math.min(j, this.e.b());
                break;
            }
            long j2 = dalwVar2.d;
            if (j2 > this.e.b()) {
                j = Math.min(j, j2);
                z2 = true;
            } else {
                try {
                    dhmr.n(darcVar2.b(caufVar, dalwVar2));
                    i++;
                } catch (InterruptedException unused2) {
                    ((eluo) ((eluo) a.h()).ai((char) 9464)).B("Unable to get a result for %s due to InterruptedException. Probably due to timeout", dalwVar2);
                    this.b.h(caufVar);
                    return 0;
                } catch (ExecutionException e) {
                    ((eluo) ((eluo) a.j()).ai(9465)).P("Unable to get a result for %s due to %s", dalwVar2, e.getMessage());
                    this.b.i(caufVar, c);
                    return 2;
                }
            }
        }
        if (z) {
            this.b.i(caufVar, j - this.e.b());
        } else {
            this.b.j(caufVar);
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
    public final long d(defpackage.cauf r9, defpackage.dalw r10, defpackage.darq r11) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.scheduler.standalone.housekeeping.HousekeepingTrainTaskService.d(cauf, dalw, darq):long");
    }

    HousekeepingTrainTaskService(darc darcVar, aurp aurpVar) {
        this.b = darcVar;
        this.e = aurpVar;
    }
}
