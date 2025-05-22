package com.google.android.gms.semanticlocationhistory.reinference;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.reinference.ReinferenceService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbvl;
import defpackage.ddlt;
import defpackage.elcq;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fgrc;
import defpackage.fgub;
import defpackage.fgvn;
import defpackage.fjyl;
import defpackage.fusd;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Random;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ReinferenceService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.reinference.ReinferenceService";
    private dbvg b;

    static {
        ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "ReinferenceService");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fusd.c()) {
            return 0;
        }
        fusd fusdVar = fusd.a;
        ddlt d = fusdVar.lK().d();
        ddlt ddltVar = ddlt.a;
        if (!(ddltVar.equals(d) ? elpp.a : elpp.a).isEmpty()) {
            return 0;
        }
        Context a2 = AppContextProvider.a();
        final Random random = new Random();
        if (this.b == null) {
            this.b = new dbvg(new dbtc());
        }
        if (((elhz) Collection.EL.stream(dbvl.b(a2, this.b)).filter(new Predicate() { // from class: ddos
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
            public final boolean test(Object obj) {
                String str = ReinferenceService.a;
                return random.nextFloat() < ((float) fusd.a.lK().a());
            }
        }).collect(elcq.b)).isEmpty()) {
            return 0;
        }
        Instant now = Instant.now();
        fgrc v = ddltVar.v();
        fgrc v2 = fjyl.a.v();
        fgub b = fgvn.b(now.minusSeconds(fusdVar.lK().c()));
        if (!v2.b.L()) {
            v2.U();
        }
        fjyl fjylVar = (fjyl) v2.b;
        b.getClass();
        fjylVar.c = b;
        fjylVar.b |= 1;
        fgub b2 = fgvn.b(now.minusSeconds(fusdVar.lK().b()));
        if (!v2.b.L()) {
            v2.U();
        }
        fjyl fjylVar2 = (fjyl) v2.b;
        b2.getClass();
        fjylVar2.d = b2;
        fjylVar2.b |= 2;
        if (!v.b.L()) {
            v.U();
        }
        ddlt ddltVar2 = (ddlt) v.b;
        fjyl fjylVar3 = (fjyl) v2.Q();
        fjylVar3.getClass();
        ddltVar2.c = fjylVar3;
        ddltVar2.b |= 1;
        return 0;
    }
}
