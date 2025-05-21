package com.google.android.gms.growth.featuredrops.googlesettings.features.cards;

import android.accounts.Account;
import defpackage.asej;
import defpackage.asew;
import defpackage.asoe;
import defpackage.asot;
import defpackage.asqh;
import defpackage.bkie;
import defpackage.bkii;
import defpackage.bkik;
import defpackage.bkil;
import defpackage.bqrp;
import defpackage.bqrq;
import defpackage.bquj;
import defpackage.bqul;
import defpackage.bqun;
import defpackage.bzau;
import defpackage.ejhf;
import defpackage.feay;
import defpackage.febe;
import defpackage.febf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.feex;
import defpackage.fefm;
import defpackage.fowd;
import defpackage.fvbo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FeatureDropsContextualCardIntentOperation extends bqun {
    public static final asot a = asot.b("FeatureDrops", asej.GROWTH_FEATUREDROPS);
    public bkik b;

    public FeatureDropsContextualCardIntentOperation() {
        super(asew.DEFAULT_GROWTH);
    }

    @Override // defpackage.bqun
    public final bquj a(bqul bqulVar) {
        if (!asqh.e() || asoe.i(this)) {
            return bquj.e;
        }
        Account account = bqulVar.a;
        if (account == null) {
            ((ejhf) a.j()).x("Cannot create contextual card: no active account.");
            return bquj.e;
        }
        bkil.b().a().a(this);
        bkik bkikVar = this.b;
        bzau bzauVar = null;
        if (bkikVar == null) {
            fvbo.j("cardFetcherFactory");
            bkikVar = null;
        }
        String str = account.name;
        fvbo.e(str, "name");
        bqrq bqrqVar = bqulVar.b;
        if (bqrqVar != null) {
            int i = bqrqVar.b;
            if (((i == 2 ? (bqrp) bqrqVar.c : bqrp.a).b & 1 & (i == 2 ? 1 : 0)) != 0) {
                try {
                    feay feayVar = (bqrqVar.b == 2 ? (bqrp) bqrqVar.c : bqrp.a).c;
                    febw febwVar = febw.a;
                    feep feepVar = feep.a;
                    febw febwVar2 = febw.a;
                    bzau bzauVar2 = bzau.a;
                    febe k = feayVar.k();
                    fecp x = bzauVar2.x();
                    try {
                        try {
                            feex b = feep.a.b(x);
                            b.l(x, febf.p(k), febwVar2);
                            b.g(x);
                            try {
                                k.z(0);
                                fecp.M(x);
                                bzauVar = (bzau) x;
                            } catch (fedk e) {
                                throw e;
                            }
                        } catch (fefm e2) {
                            throw e2.a();
                        } catch (IOException e3) {
                            if (e3.getCause() instanceof fedk) {
                                throw ((fedk) e3.getCause());
                            }
                            throw new fedk(e3);
                        }
                    } catch (fedk e4) {
                        if (e4.a) {
                            throw new fedk(e4);
                        }
                        throw e4;
                    } catch (RuntimeException e5) {
                        if (e5.getCause() instanceof fedk) {
                            throw ((fedk) e5.getCause());
                        }
                        throw e5;
                    }
                } catch (fedk e6) {
                    ((ejhf) ((ejhf) a.j()).s(e6)).x("Failed to deserialize UTM parameters.");
                }
            }
        }
        return new bkii(((bkie) bkikVar.a.a).a(), str, bzauVar);
    }

    @Override // defpackage.bqtk
    protected final boolean b() {
        return !fowd.a.a().k();
    }
}
