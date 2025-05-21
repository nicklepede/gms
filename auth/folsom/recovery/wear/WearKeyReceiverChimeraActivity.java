package com.google.android.gms.auth.folsom.recovery.wear;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.folsom.recovery.wear.WearKeyReceiverChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.abht;
import defpackage.abhx;
import defpackage.abij;
import defpackage.abng;
import defpackage.abno;
import defpackage.abnq;
import defpackage.asot;
import defpackage.bp;
import defpackage.dezt;
import defpackage.dfak;
import defpackage.djks;
import defpackage.ejhf;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qex;
import defpackage.qfn;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WearKeyReceiverChimeraActivity extends qex {
    public static final asot h = abng.b("WearKeyReceiver");

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            ((ejhf) h.j()).x("Intent is null");
            setResult(0);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
        String stringExtra2 = intent.getStringExtra("SECURITY_DOMAIN");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            ((ejhf) h.j()).P("Invalid param - domain: %s, account %s", stringExtra2, stringExtra);
            setResult(0);
            finish();
            return;
        }
        final abij abijVar = (abij) new jrh(this).a(abij.class);
        if (abijVar.f) {
            ((ejhf) abij.a.h()).x("view model already initialized");
        } else {
            abijVar.f = true;
            abijVar.d = stringExtra2;
            abijVar.e = stringExtra;
            abno abnoVar = abnq.b;
            if (abnoVar.a == null) {
                abnoVar.a = djks.a(abnq.a);
            }
            abnoVar.a.aV("/auth_folsom/key_retrieval_capability", 0).d(new dezt() { // from class: abig
                @Override // defpackage.dezt
                public final Object a(dfaq dfaqVar) {
                    Set b = ((djjm) dfaqVar.i()).b();
                    boolean isEmpty = b.isEmpty();
                    abij abijVar2 = abij.this;
                    if (isEmpty) {
                        ((ejhf) abij.a.j()).x("found 0 nodes with capability");
                        abijVar2.b.l(abhw.GENERIC_ERROR);
                    }
                    Optional findFirst = Collection.EL.stream(((djjm) dfaqVar.i()).b()).filter(new Predicate() { // from class: abih
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
                            return ((NodeParcelable) obj).d;
                        }
                    }).findFirst();
                    if (!b.isEmpty() && findFirst.isEmpty()) {
                        ((ejhf) abij.a.j()).x("not connected");
                        abijVar2.b.l(abhw.NO_CONNECTION_ERROR);
                    }
                    return (dfaq) findFirst.map(new Function() { // from class: abii
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo464andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String str = ((NodeParcelable) obj).a;
                            asot asotVar = abij.a;
                            return dfbl.d(str);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElseGet(new Supplier() { // from class: abhz
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            asot asotVar = abij.a;
                            return dfbl.c(new IllegalStateException("No nearby nodes with capability"));
                        }
                    });
                }
            }).z(new dfak() { // from class: abif
                @Override // defpackage.dfak
                public final void gn(Object obj) {
                    String str = (String) obj;
                    ejhf ejhfVar = (ejhf) abij.a.h();
                    final abij abijVar2 = abij.this;
                    ejhfVar.P("Sending retrieval request to %s for %s", str, abijVar2.e);
                    fecj v = abha.a.v();
                    String str2 = abijVar2.e;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    str2.getClass();
                    ((abha) fecpVar).b = str2;
                    String str3 = abijVar2.d;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    abha abhaVar = (abha) v.b;
                    str3.getClass();
                    abhaVar.c = str3;
                    dfaq bf = abnq.c.a().bf(str, "/auth_folsom/key_retrieval_request", ((abha) v.Q()).r());
                    bf.z(new dfak() { // from class: abib
                        @Override // defpackage.dfak
                        public final void gn(Object obj2) {
                            ((ejhf) abij.a.h()).x("Setting timeout after successfully sending msg");
                            Duration ofSeconds = Duration.ofSeconds(30L);
                            asot asotVar = abhl.a;
                            final dfau dfauVar = new dfau();
                            dfae dfaeVar = new dfae() { // from class: abhj
                                @Override // defpackage.dfae
                                public final void hr(dfaq dfaqVar) {
                                    asot asotVar2 = abhl.a;
                                    dfau dfauVar2 = dfau.this;
                                    if (dfaqVar.m()) {
                                        dfauVar2.c(dfaqVar.i());
                                    } else {
                                        dfauVar2.d((Exception) Objects.requireNonNull(dfaqVar.h()));
                                    }
                                }
                            };
                            final abij abijVar3 = abij.this;
                            abijVar3.g.a.x(dfaeVar);
                            final dfau dfauVar2 = new dfau();
                            abhl.b.schedule(new Runnable() { // from class: abhi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((ejhf) abhl.a.h()).x("Setting timeout exception");
                                    dfau.this.b(null);
                                }
                            }, ofSeconds.toSeconds(), TimeUnit.SECONDS);
                            dfauVar2.a.x(new dfae() { // from class: abhk
                                @Override // defpackage.dfae
                                public final void hr(dfaq dfaqVar) {
                                    asot asotVar2 = abhl.a;
                                    dfau.this.d(new TimeoutException("Timed out."));
                                }
                            });
                            dfauVar.a.y(new dfah() { // from class: abid
                                @Override // defpackage.dfah
                                public final void gm(Exception exc) {
                                    ((ejhf) ((ejhf) abij.a.j()).s(exc)).x("Timed out");
                                    abij.this.b.l(abhw.GENERIC_ERROR);
                                }
                            });
                        }
                    });
                    bf.y(new dfah() { // from class: abic
                        @Override // defpackage.dfah
                        public final void gm(Exception exc) {
                            ((ejhf) ((ejhf) abij.a.j()).s(exc)).x("Failed to send key retrieval request.");
                            abij.this.b.l(abhw.NO_CONNECTION_ERROR);
                        }
                    });
                }
            });
            abijVar.b().bh(abijVar);
        }
        abijVar.c.g(this, new jpd() { // from class: abhs
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                ((ejhf) WearKeyReceiverChimeraActivity.h.h()).B("setting result, isSuccess: %s", bool);
                int i = true != bool.booleanValue() ? 0 : -1;
                WearKeyReceiverChimeraActivity wearKeyReceiverChimeraActivity = WearKeyReceiverChimeraActivity.this;
                wearKeyReceiverChimeraActivity.setResult(i);
                wearKeyReceiverChimeraActivity.finish();
            }
        });
        setTheme(R.style.Theme_GoogleMaterial_Dark_NoActionBar);
        ((qfn) this).c.b(this, new abht(this));
        bp bpVar = new bp(gI());
        bpVar.F(android.R.id.content, new abhx());
        bpVar.d();
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        ((ejhf) h.j()).x("Previous retrieval session is ongoing, ignoring request");
        super.onNewIntent(intent);
    }
}
