package com.google.android.gms.growth.featuredrops.googlesettings.features.cards;

import android.accounts.Account;
import defpackage.auid;
import defpackage.auiq;
import defpackage.aury;
import defpackage.ausn;
import defpackage.auub;
import defpackage.bmou;
import defpackage.bmoy;
import defpackage.bmpa;
import defpackage.bmpb;
import defpackage.bszg;
import defpackage.bszh;
import defpackage.btca;
import defpackage.btcc;
import defpackage.btce;
import defpackage.cbjl;
import defpackage.eluo;
import defpackage.fgpr;
import defpackage.fgpx;
import defpackage.fgpy;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fgtq;
import defpackage.fguf;
import defpackage.frpg;
import defpackage.fxxm;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FeatureDropsContextualCardIntentOperation extends btce {
    public static final ausn a = ausn.b("FeatureDrops", auid.GROWTH_FEATUREDROPS);
    public bmpa b;

    public FeatureDropsContextualCardIntentOperation() {
        super(auiq.DEFAULT_GROWTH);
    }

    @Override // defpackage.btce
    public final btca a(btcc btccVar) {
        if (!auub.e() || aury.i(this)) {
            return btca.e;
        }
        Account account = btccVar.a;
        if (account == null) {
            ((eluo) a.j()).x("Cannot create contextual card: no active account.");
            return btca.e;
        }
        bmpb.b().a().a(this);
        bmpa bmpaVar = this.b;
        cbjl cbjlVar = null;
        if (bmpaVar == null) {
            fxxm.j("cardFetcherFactory");
            bmpaVar = null;
        }
        String str = account.name;
        fxxm.e(str, "name");
        bszh bszhVar = btccVar.b;
        if (bszhVar != null) {
            int i = bszhVar.b;
            if (((i == 2 ? (bszg) bszhVar.c : bszg.a).b & 1 & (i == 2 ? 1 : 0)) != 0) {
                try {
                    fgpr fgprVar = (bszhVar.b == 2 ? (bszg) bszhVar.c : bszg.a).c;
                    fgqp fgqpVar = fgqp.a;
                    fgti fgtiVar = fgti.a;
                    fgqp fgqpVar2 = fgqp.a;
                    cbjl cbjlVar2 = cbjl.a;
                    fgpx k = fgprVar.k();
                    fgri x = cbjlVar2.x();
                    try {
                        try {
                            try {
                                fgtq b = fgti.a.b(x);
                                b.l(x, fgpy.p(k), fgqpVar2);
                                b.g(x);
                                try {
                                    k.z(0);
                                    fgri.M(x);
                                    cbjlVar = (cbjl) x;
                                } catch (fgsd e) {
                                    throw e;
                                }
                            } catch (fguf e2) {
                                throw e2.a();
                            } catch (RuntimeException e3) {
                                if (e3.getCause() instanceof fgsd) {
                                    throw ((fgsd) e3.getCause());
                                }
                                throw e3;
                            }
                        } catch (fgsd e4) {
                            if (e4.a) {
                                throw new fgsd(e4);
                            }
                            throw e4;
                        }
                    } catch (IOException e5) {
                        if (e5.getCause() instanceof fgsd) {
                            throw ((fgsd) e5.getCause());
                        }
                        throw new fgsd(e5);
                    }
                } catch (fgsd e6) {
                    ((eluo) ((eluo) a.j()).s(e6)).x("Failed to deserialize UTM parameters.");
                }
            }
        }
        return new bmoy(((bmou) bmpaVar.a.a).a(), str, cbjlVar);
    }

    @Override // defpackage.btbb
    protected final boolean b() {
        return !frpg.a.lK().m();
    }
}
