package com.google.android.gms.growth.featuredrops.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bmob;
import defpackage.bnei;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fhjm;
import defpackage.frpg;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FeatureDropsChimeraActivity extends bmob {
    public static final String p = bnei.b(FeatureDropsChimeraActivity.class);
    private static final ausn A = ausn.b("FeatureDrops", auid.GROWTH_FEATUREDROPS);

    static {
        fgrc v = fhjm.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ((fhjm) v.b).b = 1;
    }

    private final boolean E() {
        if (!frpg.a.lK().f()) {
            return false;
        }
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("should_skip_server_query", false);
        }
        ((eluo) ((eluo) A.j()).ai((char) 5088)).x("Empty intent.");
        return false;
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(final Bundle bundle) {
        if (v()) {
            super.onCreate(bundle);
            if (u(bundle)) {
                if (!E()) {
                    this.l.execute(new Runnable() { // from class: bmod
                        @Override // java.lang.Runnable
                        public final void run() {
                            final FeatureDropsChimeraActivity featureDropsChimeraActivity = FeatureDropsChimeraActivity.this;
                            final bmot bmotVar = featureDropsChimeraActivity.k;
                            final String o = featureDropsChimeraActivity.o();
                            final String p2 = featureDropsChimeraActivity.p();
                            final String q = featureDropsChimeraActivity.q();
                            final Integer valueOf = Integer.valueOf(featureDropsChimeraActivity.w);
                            fxxm.f(o, "accountName");
                            Integer num = (Integer) bmotVar.d("flexagonApiClient.getFeatureDropsFlow", new fxwd() { // from class: bmoo
                                @Override // defpackage.fxwd
                                public final Object a() {
                                    bmor bmorVar = new bmor(o, null, q, p2, valueOf, 2);
                                    fhjw fhjwVar = fhjw.a;
                                    fgrc v = fhjwVar.v();
                                    fxxm.f(v, "builder");
                                    bmot bmotVar2 = bmot.this;
                                    fhkb b = bmotVar2.b();
                                    fxxm.f(b, "value");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    ((fhjw) v.b).e = b.a();
                                    List unmodifiableList = DesugarCollections.unmodifiableList(((fhjw) v.b).d);
                                    fxxm.e(unmodifiableList, "getInstalledAppsPackagesList(...)");
                                    new fgvc(unmodifiableList);
                                    Context context = bmotVar2.b;
                                    ArrayList arrayList = new ArrayList();
                                    for (String str : frpg.a.lK().c().b) {
                                        if (aura.U(context, str)) {
                                            arrayList.add(str);
                                        }
                                    }
                                    elgo i = elgo.i(arrayList);
                                    fxxm.e(i, "getAllInstalledAppsInDrop(...)");
                                    fxxm.f(i, "values");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fhjw fhjwVar2 = (fhjw) v.b;
                                    fgsa fgsaVar = fhjwVar2.d;
                                    if (!fgsaVar.c()) {
                                        fhjwVar2.d = fgri.E(fgsaVar);
                                    }
                                    fgou.E(i, fhjwVar2.d);
                                    String str2 = bmorVar.d;
                                    if (str2 != null) {
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        ((fhjw) v.b).f = str2;
                                    }
                                    String str3 = bmorVar.c;
                                    if (str3 != null) {
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        ((fhjw) v.b).g = str3;
                                    }
                                    Integer num2 = bmorVar.e;
                                    int i2 = 2;
                                    if (num2 != null) {
                                        int intValue = num2.intValue();
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        fhjw fhjwVar3 = (fhjw) v.b;
                                        fhjwVar3.b |= 2;
                                        fhjwVar3.h = intValue;
                                    }
                                    fhjs a = bmotVar2.a();
                                    fxxm.f(a, "value");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    bmqk bmqkVar = bmotVar2.c;
                                    fhjw fhjwVar4 = (fhjw) v.b;
                                    a.getClass();
                                    fhjwVar4.c = a;
                                    fhjwVar4.b |= 1;
                                    fgri Q = v.Q();
                                    fxxm.e(Q, "build(...)");
                                    fhjw fhjwVar5 = (fhjw) Q;
                                    String str4 = bmorVar.a;
                                    fxxm.f(fhjwVar5, "request");
                                    fxxm.f(str4, "accountName");
                                    bmqm bmqmVar = new bmqm(bmqkVar.a, cbot.a, cabt.b);
                                    atwh a2 = bmqk.a(str4);
                                    if (bmqm.b == null) {
                                        fwtb fwtbVar = fwtb.UNARY;
                                        fgqp fgqpVar = fxnm.a;
                                        bmqm.b = new fwtc(fwtbVar, "google.internal.googlegrowth.flexagon.v1.FlexagonApi/GetFeatureDropsFlow", new fxnl(fhjwVar), new fxnl(fhjx.a), false);
                                    }
                                    final fhjx fhjxVar = (fhjx) bmqmVar.e.f(bmqm.b, a2, fhjwVar5, bmqm.a, TimeUnit.MILLISECONDS, bmqmVar.f);
                                    fxxm.c(fhjxVar);
                                    try {
                                        dzwm dzwmVar = bmotVar2.f;
                                        final fxwo fxwoVar = new fxwo() { // from class: bmop
                                            @Override // defpackage.fxwo
                                            public final Object a(Object obj) {
                                                fhka fhkaVar = (fhka) obj;
                                                ausn ausnVar = bmot.a;
                                                fgrc fgrcVar = (fgrc) fhkaVar.iQ(5, null);
                                                fgrcVar.X(fhkaVar);
                                                boolean z = fhjx.this.c;
                                                if (!fgrcVar.b.L()) {
                                                    fgrcVar.U();
                                                }
                                                fhka fhkaVar2 = (fhka) fgrcVar.b;
                                                fhka fhkaVar3 = fhka.a;
                                                fhkaVar2.b = z;
                                                return (fhka) fgrcVar.Q();
                                            }
                                        };
                                        ((eqcy) dzwmVar.b(new ekut() { // from class: bmoq
                                            @Override // defpackage.ekut
                                            public final Object apply(Object obj) {
                                                ausn ausnVar = bmot.a;
                                                return fxwo.this.a(obj);
                                            }
                                        }, eqex.a)).u();
                                    } catch (InterruptedException e) {
                                        ((eluo) ((eluo) bmot.a.j()).s(e)).x("failed setting is_locale_unsupported in protostore.");
                                    } catch (ExecutionException e2) {
                                        ((eluo) ((eluo) bmot.a.j()).s(e2)).x("failed setting is_locale_unsupported in protostore.");
                                    }
                                    fhjv fhjvVar = fhjxVar.b;
                                    if (fhjvVar == null) {
                                        fhjvVar = fhjv.a;
                                    }
                                    if (fhjvVar.b.isEmpty()) {
                                        ((eluo) bmot.a.i()).x("Empty backend response");
                                    } else {
                                        fhjv fhjvVar2 = fhjxVar.b;
                                        if (fhjvVar2 == null) {
                                            fhjvVar2 = fhjv.a;
                                        }
                                        bmrh bmrhVar = bmotVar2.e;
                                        fgsa fgsaVar2 = fhjvVar2.b;
                                        bmrhVar.a(fgsaVar2);
                                        bmotVar2.d.a(fgsaVar2);
                                        i2 = 0;
                                    }
                                    return Integer.valueOf(i2);
                                }
                            });
                            final int intValue = num != null ? num.intValue() : 2;
                            final Bundle bundle2 = bundle;
                            featureDropsChimeraActivity.runOnUiThread(new Runnable() { // from class: bmoc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    FeatureDropsChimeraActivity.this.s(intValue, bundle2);
                                }
                            });
                        }
                    });
                } else {
                    Toast.makeText(this, "skipping server query", 0).show();
                    s(0, bundle);
                }
            }
        }
    }

    @Override // defpackage.bmwg
    protected final boolean w() {
        return E();
    }
}
