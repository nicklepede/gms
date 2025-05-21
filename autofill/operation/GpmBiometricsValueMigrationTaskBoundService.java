package com.google.android.gms.autofill.operation;

import com.google.android.gms.autofill.operation.GpmBiometricsValueMigrationTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aery;
import defpackage.aerz;
import defpackage.asej;
import defpackage.asot;
import defpackage.auxa;
import defpackage.auxg;
import defpackage.byln;
import defpackage.eiho;
import defpackage.eipl;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fnha;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GpmBiometricsValueMigrationTaskBoundService extends GmsTaskBoundService {
    public static final asot a = asot.b("GpmMigrationTaskBoundService", asej.AUTOFILL);
    public auxa b;
    private aerz c;

    public GpmBiometricsValueMigrationTaskBoundService() {
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        String str = bylnVar.a;
        if (!Objects.equals(str, "GpmMigrationTaskTag")) {
            ((ejhf) ((ejhf) a.j()).ah((char) 1030)).B("Unknown tag: %s, do not run GPM migration.", str);
            return ensj.i(2);
        }
        if (fnha.c()) {
            return ensj.i(0);
        }
        if (this.c == null) {
            this.c = aery.a(this);
        }
        if (this.b == null) {
            this.b = new auxg(this);
        }
        Stream map = Collection.EL.stream(this.c.v().values()).map(new Function() { // from class: afjv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                asot asotVar = GpmBiometricsValueMigrationTaskBoundService.a;
                return ((agjr) obj).c.a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = eitj.d;
        ensi h = ensi.h(ensj.o((Iterable) map.collect(eipl.a)));
        enqc enqcVar = new enqc() { // from class: afjw
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                List list = (List) obj;
                boolean z = false;
                if (list != null && Collection.EL.stream(list).filter(new Predicate() { // from class: afjt
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
                        return Objects.nonNull((aggw) obj2);
                    }
                }).anyMatch(new Predicate() { // from class: afju
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
                        return ((aggw) obj2).f;
                    }
                })) {
                    z = true;
                }
                return ensi.h(doci.b(GpmBiometricsValueMigrationTaskBoundService.this.b.d(z))).i(1L, TimeUnit.SECONDS, Executors.newScheduledThreadPool(1));
            }
        };
        enre enreVar = enre.a;
        return enox.f(enps.f(enps.g(h, enqcVar, enreVar), new eiho() { // from class: afjx
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = GpmBiometricsValueMigrationTaskBoundService.a;
                return 0;
            }
        }, enreVar), TimeoutException.class, new eiho() { // from class: afjy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                ((ejhf) ((ejhf) ((ejhf) GpmBiometricsValueMigrationTaskBoundService.a.j()).s((TimeoutException) obj)).ah(1029)).x("Copying credential biometrics setting to GPM failed.");
                return 2;
            }
        }, enreVar);
    }

    GpmBiometricsValueMigrationTaskBoundService(aerz aerzVar, auxa auxaVar) {
        this.c = aerzVar;
        this.b = auxaVar;
    }
}
