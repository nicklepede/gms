package com.google.android.gms.semanticlocationhistory.db;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.db.OdlhRemovedAccountsCleanupJob;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.dcvg;
import defpackage.ddoj;
import defpackage.ddor;
import defpackage.ekut;
import defpackage.elgo;
import defpackage.elow;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgf;
import defpackage.eqgl;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OdlhRemovedAccountsCleanupJob extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhRemovedAccountsCleanup");
    public static final String b = OdlhRemovedAccountsCleanupJob.class.getName();
    private dcnm c;
    private ddoj d;
    private dcry e;
    private dbtc f;
    private dbte g;
    private dcvg h;

    private final dcnm h(Context context) {
        if (this.c == null) {
            this.c = dcnp.w(context);
        }
        return this.c;
    }

    private final dcvg j() {
        if (this.h == null) {
            this.h = new dcvg();
        }
        return this.h;
    }

    public final dbtc d() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    public final dcry e() {
        if (this.e == null) {
            this.e = new dcry();
        }
        return this.e;
    }

    public final ddoj f() {
        if (this.d == null) {
            this.d = new ddor();
        }
        return this.d;
    }

    public final eqgl g(elgo elgoVar, final Set set, final Executor executor) {
        if (elgoVar.isEmpty()) {
            return eqgf.a;
        }
        final String str = (String) elgoVar.get(0);
        final elgo subList = elgoVar.subList(1, elgoVar.size());
        if (set.contains(str)) {
            return g(subList, set, executor);
        }
        final dcvg j = j();
        final elow elowVar = elow.a;
        eqgb h = eqgb.h(j.c(str));
        ekut ekutVar = new ekut() { // from class: dcuq
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                eloy eloyVar = (eloy) obj;
                Stream stream = Collection.EL.stream(eloyVar.b().entrySet());
                final elow elowVar2 = elow.this;
                Stream map = stream.filter(new Predicate() { // from class: dcvc
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo478negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((elow) ((Map.Entry) obj2).getKey()).u(elow.this);
                    }
                }).map(new dcvd());
                int i = elgo.d;
                elgo elgoVar2 = (elgo) map.collect(elcq.a);
                int size = elgoVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    eloyVar.e((elow) elgoVar2.get(i2));
                }
                return new ekvj(eloyVar, Integer.valueOf(elgoVar2.size()));
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.g(eqgb.h(eqdl.g(eqdl.f(h, ekutVar, eqexVar), new eqdv() { // from class: dcus
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                final ekvj ekvjVar = (ekvj) obj;
                return eqdl.f(dcvg.this.d(str, (eloy) ekvjVar.a), new ekut() { // from class: dcuv
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        return (Integer) ekvj.this.b;
                    }
                }, eqex.a);
            }
        }, eqexVar)), new eqdv() { // from class: dcor
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                return OdlhRemovedAccountsCleanupJob.this.g(subList, set, executor);
            }
        }, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0287 A[Catch: SQLiteException -> 0x029d, all -> 0x029f, TryCatch #8 {SQLiteException -> 0x029d, blocks: (B:64:0x021c, B:67:0x0239, B:69:0x0249, B:70:0x024c, B:88:0x0261, B:93:0x027f, B:95:0x0287, B:96:0x028a, B:98:0x0273, B:100:0x027b), top: B:63:0x021c }] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.HashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.eqgl iB(defpackage.cauf r24) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.OdlhRemovedAccountsCleanupJob.iB(cauf):eqgl");
    }
}
