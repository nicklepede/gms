package com.google.android.gms.semanticlocationhistory.db;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.db.OdlhRemovedAccountsCleanupJob;
import defpackage.asej;
import defpackage.asot;
import defpackage.czje;
import defpackage.czjg;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.daky;
import defpackage.dbeb;
import defpackage.dbej;
import defpackage.eiho;
import defpackage.eitj;
import defpackage.ejbr;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensm;
import defpackage.enss;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OdlhRemovedAccountsCleanupJob extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhRemovedAccountsCleanup");
    public static final String b = OdlhRemovedAccountsCleanupJob.class.getName();
    private dade c;
    private dbeb d;
    private dahq e;
    private czje f;
    private czjg g;
    private daky h;

    private final dade h(Context context) {
        if (this.c == null) {
            this.c = dadh.w(context);
        }
        return this.c;
    }

    private final daky j() {
        if (this.h == null) {
            this.h = new daky();
        }
        return this.h;
    }

    public final czje d() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    public final dahq e() {
        if (this.e == null) {
            this.e = new dahq();
        }
        return this.e;
    }

    public final dbeb f() {
        if (this.d == null) {
            this.d = new dbej();
        }
        return this.d;
    }

    public final enss g(eitj eitjVar, final Set set, final Executor executor) {
        if (eitjVar.isEmpty()) {
            return ensm.a;
        }
        final String str = (String) eitjVar.get(0);
        final eitj subList = eitjVar.subList(1, eitjVar.size());
        if (set.contains(str)) {
            return g(subList, set, executor);
        }
        final daky j = j();
        final ejbr ejbrVar = ejbr.a;
        ensi h = ensi.h(j.c(str));
        eiho eihoVar = new eiho() { // from class: daki
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ejbt ejbtVar = (ejbt) obj;
                Stream stream = Collection.EL.stream(ejbtVar.b().entrySet());
                final ejbr ejbrVar2 = ejbr.this;
                Stream map = stream.filter(new Predicate() { // from class: daku
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo463negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    @Override // java.util.function.Predicate
                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((ejbr) ((Map.Entry) obj2).getKey()).u(ejbr.this);
                    }
                }).map(new dakv());
                int i = eitj.d;
                eitj eitjVar2 = (eitj) map.collect(eipl.a);
                int size = eitjVar2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ejbtVar.e((ejbr) eitjVar2.get(i2));
                }
                return new eiie(ejbtVar, Integer.valueOf(eitjVar2.size()));
            }
        };
        enre enreVar = enre.a;
        return enps.g(ensi.h(enps.g(enps.f(h, eihoVar, enreVar), new enqc() { // from class: dakk
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                final eiie eiieVar = (eiie) obj;
                return enps.f(daky.this.d(str, (ejbt) eiieVar.a), new eiho() { // from class: dakn
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        return (Integer) eiie.this.b;
                    }
                }, enre.a);
            }
        }, enreVar)), new enqc() { // from class: daej
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                return OdlhRemovedAccountsCleanupJob.this.g(subList, set, executor);
            }
        }, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0287 A[Catch: SQLiteException -> 0x029d, all -> 0x029f, TryCatch #9 {SQLiteException -> 0x029d, blocks: (B:64:0x021c, B:67:0x0239, B:69:0x0249, B:70:0x024c, B:88:0x0261, B:93:0x027f, B:95:0x0287, B:96:0x028a, B:98:0x0273, B:100:0x027b), top: B:63:0x021c }] */
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
    public final defpackage.enss im(defpackage.byln r24) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.semanticlocationhistory.db.OdlhRemovedAccountsCleanupJob.im(byln):enss");
    }
}
