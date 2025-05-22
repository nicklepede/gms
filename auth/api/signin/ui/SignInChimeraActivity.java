package com.google.android.gms.auth.api.signin.ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.ui.SignInChimeraActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abox;
import defpackage.abqn;
import defpackage.abqp;
import defpackage.arvi;
import defpackage.arvr;
import defpackage.arvw;
import defpackage.auad;
import defpackage.aura;
import defpackage.bojs;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.boso;
import defpackage.btzm;
import defpackage.ekvk;
import defpackage.ekvl;
import defpackage.ekwb;
import defpackage.ekwo;
import defpackage.ekww;
import defpackage.elcq;
import defpackage.elhz;
import defpackage.emll;
import defpackage.enso;
import defpackage.ensq;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fuwb;
import defpackage.fuwn;
import defpackage.fuwz;
import defpackage.rxx;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SignInChimeraActivity extends rxx {
    public GoogleSignInOptions j;
    public String k;
    public boni l;
    public Intent m;
    public String n;
    private final auad o = new auad("Auth.Api.SignIn", "Activity", "SignInChimeraActivity");
    private bojs p;
    private arvr q;

    public final void a(int i, Intent intent) {
        if (intent == null) {
            setResult(i);
        } else {
            setResult(i, intent);
        }
        finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        if (this.m == null) {
            Intent intent = new Intent();
            intent.putExtra("errorCode", Status.f.i);
            setResult(0, intent);
            this.o.h("User exited the activity.", new Object[0]);
        }
        super.finish();
    }

    public final void k(Status status) {
        Intent intent = new Intent();
        this.m = intent;
        int i = status.i;
        intent.putExtra("errorCode", i);
        a(0, this.m);
        m(i);
        l(0, status, null);
    }

    public final void l(int i, Status status, GoogleSignInAccount googleSignInAccount) {
        boni boniVar = this.l;
        if (googleSignInAccount != null && googleSignInAccount.a() != null) {
            Account a = googleSignInAccount.a();
            ekvl.y(a);
            boniVar = bonh.b(this, a.name);
        }
        fgrc v = ensq.a.v();
        String str = this.n;
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v.U();
        }
        ensq ensqVar2 = (ensq) v.b;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        fgrc v2 = enso.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        enso ensoVar = (enso) fgriVar2;
        ensoVar.b |= 1;
        ensoVar.c = i;
        int i2 = status.i;
        if (!fgriVar2.L()) {
            v2.U();
        }
        fgri fgriVar3 = v2.b;
        enso ensoVar2 = (enso) fgriVar3;
        ensoVar2.b |= 2;
        ensoVar2.d = i2;
        if (!fgriVar3.L()) {
            v2.U();
        }
        enso ensoVar3 = (enso) v2.b;
        ensoVar3.f = 101;
        ensoVar3.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        ensq ensqVar3 = (ensq) v.b;
        enso ensoVar4 = (enso) v2.Q();
        ensoVar4.getClass();
        ensqVar3.s = ensoVar4;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v.Q());
    }

    public final void m(int i) {
        if (fuwb.c()) {
            emll c = abqp.c(this.k, 3, Integer.valueOf(i), this.j);
            if (fuwz.e()) {
                btzm.v().f(c);
            } else {
                this.q.i(c).d();
            }
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Identity_Theme_NoUIActivity);
        arvw arvwVar = new arvw() { // from class: abqi
            @Override // defpackage.arvw
            public final arvy a() {
                return arvy.a((int) fnjk.b(), fkuh.LOGGER_OVERRIDE_PROVIDER);
            }
        };
        List list = arvr.n;
        arvi arviVar = new arvi(this, "ANDROID_AUTH");
        arviVar.g = arvwVar;
        this.q = arviVar.a();
        this.l = bonh.b(this, null);
        if (bundle != null) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) bundle.getParcelable("sign_in_options");
            ekvl.y(googleSignInOptions);
            this.j = googleSignInOptions;
            String string = bundle.getString("consumer_package_name");
            ekvl.y(string);
            this.k = string;
            this.n = this.j.q;
        } else {
            if (!"com.google.android.gms.auth.GOOGLE_SIGN_IN".equals(getIntent().getAction())) {
                this.o.f("Unknown action sent to SignInActivity", new Object[0]);
                a(0, null);
                return;
            }
            SignInConfiguration signInConfiguration = (SignInConfiguration) getIntent().getParcelableExtra("config");
            if (signInConfiguration == null) {
                this.o.f("Activity started with invalid configuration.", new Object[0]);
                a(0, null);
                return;
            }
            String q = aura.q(this);
            if (q == null || !q.equals(signInConfiguration.a)) {
                this.o.f("Calling package [%s] does not match configuration.", ekvk.b(q));
                a(0, null);
                return;
            }
            this.k = q;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.b;
            String str = googleSignInOptions2.q;
            if (str == null) {
                this.n = bonp.a();
                abox aboxVar = new abox(googleSignInOptions2);
                aboxVar.b = this.n;
                GoogleSignInOptions a = aboxVar.a();
                this.j = a;
                Scope[] c = a.c();
                GoogleSignInOptions googleSignInOptions3 = this.j;
                this.l.a(boso.b(this.k, c, googleSignInOptions3.q, googleSignInOptions3.k, googleSignInOptions3.m, googleSignInOptions3.l));
            } else {
                this.j = googleSignInOptions2;
                this.n = str;
            }
            this.o.d("Log Session ID: ".concat(String.valueOf(this.n)), new Object[0]);
            if (fuwn.i()) {
                final elhz F = elhz.F(ekwo.e(',').i().d().l(fuwn.c()));
                Stream map = Collection.EL.stream(elhz.G(googleSignInOptions2.a())).map(new Function() { // from class: abqj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo479andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((Scope) obj).b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Objects.requireNonNull(F);
                elhz elhzVar = (elhz) map.filter(new Predicate() { // from class: abqk
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
                        return elhz.this.contains((String) obj);
                    }
                }).collect(elcq.b);
                if (!elhzVar.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<E> it = elhzVar.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ", ");
                            }
                        }
                    }
                    k(new Status(10, String.format("The following scope(s) are not supported: %s.", sb.toString())));
                    return;
                }
            }
        }
        bonm.a(this, new ekwb() { // from class: abql
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                signInChimeraActivity.l.a(bono.b(102, (bonn) obj, signInChimeraActivity.n));
            }
        });
        bojs a2 = bojs.a(this);
        this.p = a2;
        eqgc.t(a2.c(1, new ekww() { // from class: abqm
            @Override // defpackage.ekww
            public final Object lK() {
                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                return new abqv(signInChimeraActivity.getApplicationContext(), signInChimeraActivity.j, signInChimeraActivity.k, ekvi.j(signInChimeraActivity)).a();
            }
        }), new abqn(this), eqex.a);
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("sign_in_options", this.j);
        bundle.putString("consumer_package_name", this.k);
    }
}
