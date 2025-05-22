package com.google.android.gms.autofill.operation;

import com.google.android.gms.autofill.operation.GpmBiometricsValueMigrationTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.agsl;
import defpackage.agsm;
import defpackage.auid;
import defpackage.ausn;
import defpackage.axaz;
import defpackage.axbf;
import defpackage.cauf;
import defpackage.ekut;
import defpackage.elcq;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fpza;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GpmBiometricsValueMigrationTaskBoundService extends GmsTaskBoundService {
    public static final ausn a = ausn.b("GpmMigrationTaskBoundService", auid.AUTOFILL);
    public axaz b;
    private agsm c;

    public GpmBiometricsValueMigrationTaskBoundService() {
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        String str = caufVar.a;
        if (!Objects.equals(str, "GpmMigrationTaskTag")) {
            ((eluo) ((eluo) a.j()).ai((char) 1024)).B("Unknown tag: %s, do not run GPM migration.", str);
            return eqgc.i(2);
        }
        if (fpza.c()) {
            return eqgc.i(0);
        }
        if (this.c == null) {
            this.c = agsl.a(this);
        }
        if (this.b == null) {
            this.b = new axbf(this);
        }
        Stream map = Collection.EL.stream(this.c.v().values()).map(new Function() { // from class: ahkh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ausn ausnVar = GpmBiometricsValueMigrationTaskBoundService.a;
                return ((aikh) obj).c.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = elgo.d;
        eqgb h = eqgb.h(eqgc.o((Iterable) map.collect(elcq.a)));
        eqdv eqdvVar = new eqdv() { // from class: ahki
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                List list = (List) obj;
                boolean z = false;
                if (list != null && Collection.EL.stream(list).filter(new Predicate() { // from class: ahkf
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
                        return Objects.nonNull((aihm) obj2);
                    }
                }).anyMatch(new Predicate() { // from class: ahkg
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
                        return ((aihm) obj2).f;
                    }
                })) {
                    z = true;
                }
                return eqgb.h(dqmr.b(GpmBiometricsValueMigrationTaskBoundService.this.b.d(z))).i(1L, TimeUnit.SECONDS, Executors.newScheduledThreadPool(1));
            }
        };
        eqex eqexVar = eqex.a;
        return eqcq.f(eqdl.f(eqdl.g(h, eqdvVar, eqexVar), new ekut() { // from class: ahkj
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = GpmBiometricsValueMigrationTaskBoundService.a;
                return 0;
            }
        }, eqexVar), TimeoutException.class, new ekut() { // from class: ahkk
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ((eluo) ((eluo) ((eluo) GpmBiometricsValueMigrationTaskBoundService.a.j()).s((TimeoutException) obj)).ai(1023)).x("Copying credential biometrics setting to GPM failed.");
                return 2;
            }
        }, eqexVar);
    }

    GpmBiometricsValueMigrationTaskBoundService(agsm agsmVar, axaz axazVar) {
        this.c = agsmVar;
        this.b = axazVar;
    }
}
