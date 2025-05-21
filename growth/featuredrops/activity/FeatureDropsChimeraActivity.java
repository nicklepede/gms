package com.google.android.gms.growth.featuredrops.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity;
import defpackage.asej;
import defpackage.asot;
import defpackage.bkhl;
import defpackage.bkxr;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.feur;
import defpackage.fowd;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FeatureDropsChimeraActivity extends bkhl {
    public static final String p = bkxr.b(FeatureDropsChimeraActivity.class);
    private static final asot z = asot.b("FeatureDrops", asej.GROWTH_FEATUREDROPS);

    static {
        fecj v = feur.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ((feur) v.b).b = 1;
    }

    private final boolean E() {
        if (!fowd.a.a().f()) {
            return false;
        }
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("should_skip_server_query", false);
        }
        ((ejhf) ((ejhf) z.j()).ah((char) 5075)).x("Empty intent.");
        return false;
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(final Bundle bundle) {
        if (v()) {
            super.onCreate(bundle);
            if (u(bundle)) {
                if (!E()) {
                    this.l.execute(new Runnable() { // from class: bkhn
                        @Override // java.lang.Runnable
                        public final void run() {
                            final FeatureDropsChimeraActivity featureDropsChimeraActivity = FeatureDropsChimeraActivity.this;
                            final bkid bkidVar = featureDropsChimeraActivity.k;
                            final String o = featureDropsChimeraActivity.o();
                            final String p2 = featureDropsChimeraActivity.p();
                            final String q = featureDropsChimeraActivity.q();
                            final Integer valueOf = Integer.valueOf(featureDropsChimeraActivity.w);
                            fvbo.f(o, "accountName");
                            Integer num = (Integer) bkidVar.d("flexagonApiClient.getFeatureDropsFlow", new fvaf() { // from class: bkhy
                                @Override // defpackage.fvaf
                                public final Object a() {
                                    bkib bkibVar = new bkib(o, null, q, p2, valueOf, 2);
                                    fecj v = fevb.a.v();
                                    fvbo.f(v, "builder");
                                    bkid bkidVar2 = bkid.this;
                                    fevg b = bkidVar2.b();
                                    fvbo.f(b, "value");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    ((fevb) v.b).e = b.a();
                                    List unmodifiableList = DesugarCollections.unmodifiableList(((fevb) v.b).d);
                                    fvbo.e(unmodifiableList, "getInstalledAppsPackagesList(...)");
                                    new fegj(unmodifiableList);
                                    Context context = bkidVar2.b;
                                    ArrayList arrayList = new ArrayList();
                                    for (String str : fowd.a.a().c().b) {
                                        if (asng.U(context, str)) {
                                            arrayList.add(str);
                                        }
                                    }
                                    eitj i = eitj.i(arrayList);
                                    fvbo.e(i, "getAllInstalledAppsInDrop(...)");
                                    fvbo.f(i, "values");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fevb fevbVar = (fevb) v.b;
                                    fedh fedhVar = fevbVar.d;
                                    if (!fedhVar.c()) {
                                        fevbVar.d = fecp.E(fedhVar);
                                    }
                                    feab.E(i, fevbVar.d);
                                    String str2 = bkibVar.d;
                                    if (str2 != null) {
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        ((fevb) v.b).f = str2;
                                    }
                                    String str3 = bkibVar.c;
                                    if (str3 != null) {
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        ((fevb) v.b).g = str3;
                                    }
                                    Integer num2 = bkibVar.e;
                                    int i2 = 2;
                                    if (num2 != null) {
                                        int intValue = num2.intValue();
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        fevb fevbVar2 = (fevb) v.b;
                                        fevbVar2.b |= 2;
                                        fevbVar2.h = intValue;
                                    }
                                    feux a = bkidVar2.a();
                                    fvbo.f(a, "value");
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    bkju bkjuVar = bkidVar2.c;
                                    fevb fevbVar3 = (fevb) v.b;
                                    a.getClass();
                                    fevbVar3.c = a;
                                    fevbVar3.b |= 1;
                                    fecp Q = v.Q();
                                    fvbo.e(Q, "build(...)");
                                    fevb fevbVar4 = (fevb) Q;
                                    String str4 = bkibVar.a;
                                    fvbo.f(fevbVar4, "request");
                                    fvbo.f(str4, "accountName");
                                    bkjw bkjwVar = new bkjw(bkjuVar.a, bzgc.a, bxtb.b);
                                    arts a2 = bkju.a(str4);
                                    if (bkjw.b == null) {
                                        ftxd ftxdVar = ftxd.UNARY;
                                        fevb fevbVar5 = fevb.a;
                                        febw febwVar = furo.a;
                                        bkjw.b = new ftxe(ftxdVar, "google.internal.googlegrowth.flexagon.v1.FlexagonApi/GetFeatureDropsFlow", new furn(fevbVar5), new furn(fevc.a), false);
                                    }
                                    final fevc fevcVar = (fevc) bkjwVar.e.f(bkjw.b, a2, fevbVar4, bkjw.a, TimeUnit.MILLISECONDS, bkjwVar.f);
                                    fvbo.c(fevcVar);
                                    try {
                                        dxkm dxkmVar = bkidVar2.f;
                                        final fvaq fvaqVar = new fvaq() { // from class: bkhz
                                            @Override // defpackage.fvaq
                                            public final Object a(Object obj) {
                                                fevf fevfVar = (fevf) obj;
                                                asot asotVar = bkid.a;
                                                fecj fecjVar = (fecj) fevfVar.iB(5, null);
                                                fecjVar.X(fevfVar);
                                                boolean z2 = fevc.this.c;
                                                if (!fecjVar.b.L()) {
                                                    fecjVar.U();
                                                }
                                                fevf fevfVar2 = (fevf) fecjVar.b;
                                                fevf fevfVar3 = fevf.a;
                                                fevfVar2.b = z2;
                                                return (fevf) fecjVar.Q();
                                            }
                                        };
                                        ((enpf) dxkmVar.b(new eiho() { // from class: bkia
                                            @Override // defpackage.eiho
                                            public final Object apply(Object obj) {
                                                asot asotVar = bkid.a;
                                                return fvaq.this.a(obj);
                                            }
                                        }, enre.a)).u();
                                    } catch (InterruptedException e) {
                                        ((ejhf) ((ejhf) bkid.a.j()).s(e)).x("failed setting is_locale_unsupported in protostore.");
                                    } catch (ExecutionException e2) {
                                        ((ejhf) ((ejhf) bkid.a.j()).s(e2)).x("failed setting is_locale_unsupported in protostore.");
                                    }
                                    feva fevaVar = fevcVar.b;
                                    if (fevaVar == null) {
                                        fevaVar = feva.a;
                                    }
                                    if (fevaVar.b.isEmpty()) {
                                        ((ejhf) bkid.a.i()).x("Empty backend response");
                                    } else {
                                        feva fevaVar2 = fevcVar.b;
                                        if (fevaVar2 == null) {
                                            fevaVar2 = feva.a;
                                        }
                                        bkkr bkkrVar = bkidVar2.e;
                                        fedh fedhVar2 = fevaVar2.b;
                                        bkkrVar.a(fedhVar2);
                                        bkidVar2.d.a(fedhVar2);
                                        i2 = 0;
                                    }
                                    return Integer.valueOf(i2);
                                }
                            });
                            final int intValue = num != null ? num.intValue() : 2;
                            final Bundle bundle2 = bundle;
                            featureDropsChimeraActivity.runOnUiThread(new Runnable() { // from class: bkhm
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

    @Override // defpackage.bkpp
    protected final boolean w() {
        return E();
    }
}
