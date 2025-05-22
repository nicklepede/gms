package com.google.android.gms.auth.folsom.recovery.wear;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.auth.folsom.recovery.wear.WearKeyReceiverChimeraActivity;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.adht;
import defpackage.adhx;
import defpackage.adij;
import defpackage.adng;
import defpackage.adno;
import defpackage.adnq;
import defpackage.ausn;
import defpackage.bp;
import defpackage.dhkz;
import defpackage.dhlq;
import defpackage.dlwl;
import defpackage.eluo;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.ryb;
import defpackage.ryr;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WearKeyReceiverChimeraActivity extends ryb {
    public static final ausn h = adng.b("WearKeyReceiver");

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            ((eluo) h.j()).x("Intent is null");
            setResult(0);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.auth.folsom.EXTRA_ACCOUNT_NAME");
        String stringExtra2 = intent.getStringExtra("SECURITY_DOMAIN");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            ((eluo) h.j()).P("Invalid param - domain: %s, account %s", stringExtra2, stringExtra);
            setResult(0);
            finish();
            return;
        }
        final adij adijVar = (adij) new jxw(this).a(adij.class);
        if (adijVar.f) {
            ((eluo) adij.a.h()).x("view model already initialized");
        } else {
            adijVar.f = true;
            adijVar.d = stringExtra2;
            adijVar.e = stringExtra;
            adno adnoVar = adnq.b;
            if (adnoVar.a == null) {
                adnoVar.a = dlwl.a(adnq.a);
            }
            adnoVar.a.aU("/auth_folsom/key_retrieval_capability", 0).d(new dhkz() { // from class: adig
                @Override // defpackage.dhkz
                public final Object a(dhlw dhlwVar) {
                    Set b = ((dlvf) dhlwVar.i()).b();
                    boolean isEmpty = b.isEmpty();
                    adij adijVar2 = adij.this;
                    if (isEmpty) {
                        ((eluo) adij.a.j()).x("found 0 nodes with capability");
                        adijVar2.b.l(adhw.GENERIC_ERROR);
                    }
                    Optional findFirst = Collection.EL.stream(((dlvf) dhlwVar.i()).b()).filter(new Predicate() { // from class: adih
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
                            return ((NodeParcelable) obj).d;
                        }
                    }).findFirst();
                    if (!b.isEmpty() && findFirst.isEmpty()) {
                        ((eluo) adij.a.j()).x("not connected");
                        adijVar2.b.l(adhw.NO_CONNECTION_ERROR);
                    }
                    return (dhlw) findFirst.map(new Function() { // from class: adii
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo479andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String str = ((NodeParcelable) obj).a;
                            ausn ausnVar = adij.a;
                            return dhmr.d(str);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElseGet(new Supplier() { // from class: adhz
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            ausn ausnVar = adij.a;
                            return dhmr.c(new IllegalStateException("No nearby nodes with capability"));
                        }
                    });
                }
            }).z(new dhlq() { // from class: adif
                @Override // defpackage.dhlq
                public final void gC(Object obj) {
                    String str = (String) obj;
                    eluo eluoVar = (eluo) adij.a.h();
                    final adij adijVar2 = adij.this;
                    eluoVar.P("Sending retrieval request to %s for %s", str, adijVar2.e);
                    fgrc v = adha.a.v();
                    String str2 = adijVar2.e;
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    str2.getClass();
                    ((adha) fgriVar).b = str2;
                    String str3 = adijVar2.d;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    adha adhaVar = (adha) v.b;
                    str3.getClass();
                    adhaVar.c = str3;
                    dhlw be = adnq.c.a().be(str, "/auth_folsom/key_retrieval_request", ((adha) v.Q()).r());
                    be.z(new dhlq() { // from class: adib
                        @Override // defpackage.dhlq
                        public final void gC(Object obj2) {
                            ((eluo) adij.a.h()).x("Setting timeout after successfully sending msg");
                            Duration ofSeconds = Duration.ofSeconds(30L);
                            ausn ausnVar = adhl.a;
                            final dhma dhmaVar = new dhma();
                            dhlk dhlkVar = new dhlk() { // from class: adhj
                                @Override // defpackage.dhlk
                                public final void hH(dhlw dhlwVar) {
                                    ausn ausnVar2 = adhl.a;
                                    dhma dhmaVar2 = dhma.this;
                                    if (dhlwVar.m()) {
                                        dhmaVar2.c(dhlwVar.i());
                                    } else {
                                        dhmaVar2.d((Exception) Objects.requireNonNull(dhlwVar.h()));
                                    }
                                }
                            };
                            final adij adijVar3 = adij.this;
                            adijVar3.g.a.x(dhlkVar);
                            final dhma dhmaVar2 = new dhma();
                            adhl.b.schedule(new Runnable() { // from class: adhi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ((eluo) adhl.a.h()).x("Setting timeout exception");
                                    dhma.this.b(null);
                                }
                            }, ofSeconds.toSeconds(), TimeUnit.SECONDS);
                            dhmaVar2.a.x(new dhlk() { // from class: adhk
                                @Override // defpackage.dhlk
                                public final void hH(dhlw dhlwVar) {
                                    ausn ausnVar2 = adhl.a;
                                    dhma.this.d(new TimeoutException("Timed out."));
                                }
                            });
                            dhmaVar.a.y(new dhln() { // from class: adid
                                @Override // defpackage.dhln
                                public final void gB(Exception exc) {
                                    ((eluo) ((eluo) adij.a.j()).s(exc)).x("Timed out");
                                    adij.this.b.l(adhw.GENERIC_ERROR);
                                }
                            });
                        }
                    });
                    be.y(new dhln() { // from class: adic
                        @Override // defpackage.dhln
                        public final void gB(Exception exc) {
                            ((eluo) ((eluo) adij.a.j()).s(exc)).x("Failed to send key retrieval request.");
                            adij.this.b.l(adhw.NO_CONNECTION_ERROR);
                        }
                    });
                }
            });
            adijVar.b().bg(adijVar);
        }
        adijVar.c.g(this, new jvs() { // from class: adhs
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                ((eluo) WearKeyReceiverChimeraActivity.h.h()).B("setting result, isSuccess: %s", bool);
                int i = true != bool.booleanValue() ? 0 : -1;
                WearKeyReceiverChimeraActivity wearKeyReceiverChimeraActivity = WearKeyReceiverChimeraActivity.this;
                wearKeyReceiverChimeraActivity.setResult(i);
                wearKeyReceiverChimeraActivity.finish();
            }
        });
        setTheme(R.style.Theme_GoogleMaterial_Dark_NoActionBar);
        ((ryr) this).c.b(this, new adht(this));
        bp bpVar = new bp(gY());
        bpVar.F(android.R.id.content, new adhx());
        bpVar.d();
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        ((eluo) h.j()).x("Previous retrieval session is ongoing, ignoring request");
        super.onNewIntent(intent);
    }
}
