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
import defpackage.apsr;
import defpackage.apta;
import defpackage.aptf;
import defpackage.arxo;
import defpackage.asng;
import defpackage.bmda;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bmlv;
import defpackage.brrr;
import defpackage.eiif;
import defpackage.eiig;
import defpackage.eiiw;
import defpackage.eijj;
import defpackage.eijr;
import defpackage.eipl;
import defpackage.eiuu;
import defpackage.ejya;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.enre;
import defpackage.ensj;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fsbf;
import defpackage.fsbr;
import defpackage.fscd;
import defpackage.qet;
import defpackage.zox;
import defpackage.zqn;
import defpackage.zqp;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SignInChimeraActivity extends qet {
    public GoogleSignInOptions j;
    public String k;
    public bmgq l;
    public Intent m;
    public String n;
    private final arxo o = new arxo("Auth.Api.SignIn", "Activity", "SignInChimeraActivity");
    private bmda p;
    private apta q;

    public final void a(int i, Intent intent) {
        if (intent == null) {
            setResult(i);
        } else {
            setResult(i, intent);
        }
        finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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
        bmgq bmgqVar = this.l;
        if (googleSignInAccount != null && googleSignInAccount.a() != null) {
            Account a = googleSignInAccount.a();
            eiig.x(a);
            bmgqVar = bmgp.b(this, a.name);
        }
        fecj v = elfd.a.v();
        String str = this.n;
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v.U();
        }
        elfd elfdVar2 = (elfd) v.b;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        fecj v2 = elfb.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfb elfbVar = (elfb) fecpVar2;
        elfbVar.b |= 1;
        elfbVar.c = i;
        int i2 = status.i;
        if (!fecpVar2.L()) {
            v2.U();
        }
        fecp fecpVar3 = v2.b;
        elfb elfbVar2 = (elfb) fecpVar3;
        elfbVar2.b |= 2;
        elfbVar2.d = i2;
        if (!fecpVar3.L()) {
            v2.U();
        }
        elfb elfbVar3 = (elfb) v2.b;
        elfbVar3.f = 101;
        elfbVar3.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        elfd elfdVar3 = (elfd) v.b;
        elfb elfbVar4 = (elfb) v2.Q();
        elfbVar4.getClass();
        elfdVar3.s = elfbVar4;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v.Q());
    }

    public final void m(int i) {
        if (fsbf.c()) {
            ejya c = zqp.c(this.k, 3, Integer.valueOf(i), this.j);
            if (fscd.e()) {
                brrr.v().f(c);
            } else {
                this.q.i(c).d();
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Identity_Theme_NoUIActivity);
        aptf aptfVar = new aptf() { // from class: zqi
            @Override // defpackage.aptf
            public final apth a() {
                return apth.a((int) fksl.b(), fiek.LOGGER_OVERRIDE_PROVIDER);
            }
        };
        List list = apta.n;
        apsr apsrVar = new apsr(this, "ANDROID_AUTH");
        apsrVar.g = aptfVar;
        this.q = apsrVar.a();
        this.l = bmgp.b(this, null);
        if (bundle != null) {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) bundle.getParcelable("sign_in_options");
            eiig.x(googleSignInOptions);
            this.j = googleSignInOptions;
            String string = bundle.getString("consumer_package_name");
            eiig.x(string);
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
            String q = asng.q(this);
            if (q == null || !q.equals(signInConfiguration.a)) {
                this.o.f("Calling package [%s] does not match configuration.", eiif.b(q));
                a(0, null);
                return;
            }
            this.k = q;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.b;
            String str = googleSignInOptions2.q;
            if (str == null) {
                this.n = bmgx.a();
                zox zoxVar = new zox(googleSignInOptions2);
                zoxVar.b = this.n;
                GoogleSignInOptions a = zoxVar.a();
                this.j = a;
                Scope[] c = a.c();
                GoogleSignInOptions googleSignInOptions3 = this.j;
                this.l.a(bmlv.b(this.k, c, googleSignInOptions3.q, googleSignInOptions3.k, googleSignInOptions3.m, googleSignInOptions3.l));
            } else {
                this.j = googleSignInOptions2;
                this.n = str;
            }
            this.o.d("Log Session ID: ".concat(String.valueOf(this.n)), new Object[0]);
            if (fsbr.i()) {
                final eiuu F = eiuu.F(eijj.e(',').i().d().l(fsbr.c()));
                Stream map = Collection.EL.stream(eiuu.G(googleSignInOptions2.a())).map(new Function() { // from class: zqj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo464andThen(Function function) {
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
                eiuu eiuuVar = (eiuu) map.filter(new Predicate() { // from class: zqk
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
                        return eiuu.this.contains((String) obj);
                    }
                }).collect(eipl.b);
                if (!eiuuVar.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator<E> it = eiuuVar.iterator();
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
        bmgu.a(this, new eiiw() { // from class: zql
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                signInChimeraActivity.l.a(bmgw.b(102, (bmgv) obj, signInChimeraActivity.n));
            }
        });
        bmda a2 = bmda.a(this);
        this.p = a2;
        ensj.t(a2.c(1, new eijr() { // from class: zqm
            @Override // defpackage.eijr
            public final Object a() {
                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                return new zqv(signInChimeraActivity.getApplicationContext(), signInChimeraActivity.j, signInChimeraActivity.k, eiid.j(signInChimeraActivity)).a();
            }
        }), new zqn(this), enre.a);
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("sign_in_options", this.j);
        bundle.putString("consumer_package_name", this.k);
    }
}
