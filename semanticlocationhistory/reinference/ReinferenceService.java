package com.google.android.gms.semanticlocationhistory.reinference;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.reinference.ReinferenceService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czlp;
import defpackage.dbbl;
import defpackage.eipl;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fecj;
import defpackage.fefi;
import defpackage.fegu;
import defpackage.fhio;
import defpackage.frxj;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Random;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReinferenceService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.reinference.ReinferenceService";
    private czlk b;

    static {
        asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "ReinferenceService");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!frxj.c()) {
            return 0;
        }
        frxj frxjVar = frxj.a;
        dbbl d = frxjVar.a().d();
        dbbl dbblVar = dbbl.a;
        if (!(dbblVar.equals(d) ? ejck.a : ejck.a).isEmpty()) {
            return 0;
        }
        Context a2 = AppContextProvider.a();
        final Random random = new Random();
        if (this.b == null) {
            this.b = new czlk(new czje());
        }
        if (((eiuu) Collection.EL.stream(czlp.b(a2, this.b)).filter(new Predicate() { // from class: dbek
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
            public final boolean test(Object obj) {
                String str = ReinferenceService.a;
                return random.nextFloat() < ((float) frxj.a.a().a());
            }
        }).collect(eipl.b)).isEmpty()) {
            return 0;
        }
        Instant now = Instant.now();
        fecj v = dbblVar.v();
        fecj v2 = fhio.a.v();
        fefi b = fegu.b(now.minusSeconds(frxjVar.a().c()));
        if (!v2.b.L()) {
            v2.U();
        }
        fhio fhioVar = (fhio) v2.b;
        b.getClass();
        fhioVar.c = b;
        fhioVar.b |= 1;
        fefi b2 = fegu.b(now.minusSeconds(frxj.a.a().b()));
        if (!v2.b.L()) {
            v2.U();
        }
        fhio fhioVar2 = (fhio) v2.b;
        b2.getClass();
        fhioVar2.d = b2;
        fhioVar2.b |= 2;
        if (!v.b.L()) {
            v.U();
        }
        dbbl dbblVar2 = (dbbl) v.b;
        fhio fhioVar3 = (fhio) v2.Q();
        fhioVar3.getClass();
        dbblVar2.c = fhioVar3;
        dbblVar2.b |= 1;
        return 0;
    }
}
