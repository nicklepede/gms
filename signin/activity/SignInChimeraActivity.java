package com.google.android.gms.signin.activity;

import android.accounts.Account;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Base64;
import com.android.volley.toolbox.ImageRequest;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import defpackage.asvl;
import defpackage.asvm;
import defpackage.asvo;
import defpackage.aszt;
import defpackage.atae;
import defpackage.atag;
import defpackage.atah;
import defpackage.auad;
import defpackage.aupz;
import defpackage.aura;
import defpackage.auvc;
import defpackage.bohk;
import defpackage.bojr;
import defpackage.bojs;
import defpackage.boju;
import defpackage.bomz;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.boso;
import defpackage.caqj;
import defpackage.dezz;
import defpackage.dfaa;
import defpackage.dfab;
import defpackage.dfac;
import defpackage.dfde;
import defpackage.dfea;
import defpackage.dfeq;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvh;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.ekvm;
import defpackage.ekvw;
import defpackage.ekwb;
import defpackage.ekwo;
import defpackage.ekww;
import defpackage.eles;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.elhz;
import defpackage.enqg;
import defpackage.ensq;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.eqgv;
import defpackage.eqhc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fuwn;
import defpackage.fuwq;
import defpackage.fuww;
import defpackage.fuxg;
import defpackage.rxx;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignInChimeraActivity extends rxx {
    public static final auad j = dfeq.a("SignInChimeraActivity");
    private static final elgx x;
    private static final elhz y;
    private bojs A;
    private bojr B;
    public final eqgo k = eqgv.a(new aupz(1, 9));
    public int l;
    public String m;
    public boolean n;
    public Account o;
    public Set p;
    public String q;
    public String r;
    public Intent s;
    public atah t;
    public boni u;
    public dfac v;
    public dfea w;
    private boju z;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i(1, bomz.FETCH_TOS_AND_PP);
        elgtVar.i(2, bomz.CHOOSE_ACCOUNT);
        elgtVar.i(3, bomz.RECORD_ACCOUNT_CHIP_CONSENT);
        elgtVar.i(4, bomz.PRE_CONSENT);
        elgtVar.i(5, bomz.CONSENT);
        elgtVar.i(6, bomz.SAVE_SELECTED_ACCOUNT);
        x = elgtVar.b();
        y = elhz.O(dfaa.a, dfaa.b, new Scope("https://www.googleapis.com/auth/plus.me"), new Scope("https://www.googleapis.com/auth/userinfo.profile"), new Scope("https://www.googleapis.com/auth/userinfo.email"), new Scope("openid"), new Scope[0]);
    }

    private final void m(Bundle bundle) {
        this.l = bundle.containsKey("start_step") ? bundle.getInt("start_step") : 1;
        this.o = (Account) bundle.getParcelable("picked_account");
        Parcelable[] parcelableArray = bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
        if (parcelableArray != null) {
            this.p = eles.k(parcelableArray).l(new ekut() { // from class: dfcz
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    auad auadVar = SignInChimeraActivity.j;
                    return (Scope) ((Parcelable) obj);
                }
            }).p();
        }
        this.q = bundle.getString("terms_of_service_url");
        this.r = bundle.getString("privacy_policy_url");
        this.s = (Intent) bundle.getParcelable("consent_intent");
        Bundle bundle2 = bundle.getBundle("sign_in_options");
        this.v = (bundle2 != null ? dfab.a(bundle2) : new dfab()).b();
    }

    public final void a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    public final void k(long j2, int i, boolean z) {
        fgrc v = enqg.a.v();
        bomz bomzVar = (bomz) x.get(Integer.valueOf(i));
        ekvl.y(bomzVar);
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enqg enqgVar = (enqg) fgriVar;
        enqgVar.c = bomzVar.i;
        enqgVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        enqg enqgVar2 = (enqg) v.b;
        enqgVar2.b |= 4096;
        enqgVar2.o = z;
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (!v.b.L()) {
            v.U();
        }
        enqg enqgVar3 = (enqg) v.b;
        enqgVar3.b |= 2048;
        enqgVar3.n = currentTimeMillis;
        enqg enqgVar4 = (enqg) v.Q();
        fgrc v2 = ensq.a.v();
        String str = this.v.g;
        if (str != null) {
            if (!v2.b.L()) {
                v2.U();
            }
            ensq ensqVar = (ensq) v2.b;
            ensqVar.b |= 2;
            ensqVar.e = str;
        }
        boni boniVar = this.u;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 5;
        ensqVar2.b |= 1;
        if (!fgriVar2.L()) {
            v2.U();
        }
        ensq ensqVar3 = (ensq) v2.b;
        enqgVar4.getClass();
        ensqVar3.i = enqgVar4;
        ensqVar3.b |= 32;
        boniVar.a((ensq) v2.Q());
    }

    public final void l() {
        Intent c;
        eqgl eqglVar;
        j.j("startNextStep() is called, signInStep=%d.", Integer.valueOf(this.l));
        int i = this.l;
        switch (i) {
            case 1:
                final String l = auvc.l();
                if (!eles.j(ekwo.e(',').d().i().l(fuww.a.lK().b())).s(new ekvm() { // from class: dfco
                    @Override // defpackage.ekvm
                    public final boolean a(Object obj) {
                        auad auadVar = SignInChimeraActivity.j;
                        return l.equalsIgnoreCase((String) obj);
                    }
                })) {
                    eqglVar = eqcq.f(this.A.b(1, new ekww() { // from class: dfcm
                        @Override // defpackage.ekww
                        public final Object lK() {
                            final SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            return signInChimeraActivity.k.submit(new Callable() { // from class: dfcu
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    SignInChimeraActivity signInChimeraActivity2 = SignInChimeraActivity.this;
                                    try {
                                        Context baseContext = signInChimeraActivity2.getBaseContext();
                                        fuww fuwwVar = fuww.a;
                                        auki aukiVar = new auki(baseContext, fuwwVar.lK().c(), (int) fuwwVar.lK().a(), -1, 25857);
                                        aukiVar.h("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
                                        aukiVar.h("X-Android-Package", baseContext.getPackageName());
                                        aukiVar.h("X-Android-Cert", aura.m(baseContext, baseContext.getPackageName()));
                                        dfeb dfebVar = new dfeb(aukiVar);
                                        String str = signInChimeraActivity2.m;
                                        ekvl.y(str);
                                        byte[] ab = aura.ab(signInChimeraActivity2.getBaseContext(), str);
                                        ekvl.y(ab);
                                        fgrc v = fhex.a.v();
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        ((fhex) v.b).c = str;
                                        String encodeToString = Base64.encodeToString(ab, 2);
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        fhex fhexVar = (fhex) v.b;
                                        encodeToString.getClass();
                                        fhexVar.b = encodeToString;
                                        fhex fhexVar2 = (fhex) v.Q();
                                        fhfd fhfdVar = fhfd.a;
                                        fgrc v2 = fhfdVar.v();
                                        fgrc v3 = fhez.a.v();
                                        if (!v3.b.L()) {
                                            v3.U();
                                        }
                                        fhez fhezVar = (fhez) v3.b;
                                        fhexVar2.getClass();
                                        fhezVar.c = fhexVar2;
                                        fhezVar.b = 3;
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        fhfd fhfdVar2 = (fhfd) v2.b;
                                        fhez fhezVar2 = (fhez) v3.Q();
                                        fhezVar2.getClass();
                                        fhfdVar2.c = fhezVar2;
                                        fhfdVar2.b |= 1;
                                        fhfd fhfdVar3 = (fhfd) v2.Q();
                                        dfeb dfebVar2 = new dfeb(dfebVar, cbot.a, cahq.b);
                                        if (dfeb.a == null) {
                                            fwtb fwtbVar = fwtb.UNARY;
                                            fgqp fgqpVar = fxnm.a;
                                            dfeb.a = new fwtc(fwtbVar, "google.identity.clientauthconfig.v1.ClientAuthConfig/GetDisplayBrand", new fxnl(fhfdVar), new fxnl(fhfe.a), false);
                                        }
                                        fhfe fhfeVar = (fhfe) dfebVar2.b.e(dfeb.a, fhfdVar3, 10000L, TimeUnit.MILLISECONDS, dfebVar2.c);
                                        if (fhfeVar == null) {
                                            throw new IOException("No Brand found for the calling package.");
                                        }
                                        if ((fhfeVar.b & 1) != 0) {
                                            fhfb fhfbVar = fhfeVar.c;
                                            if (fhfbVar == null) {
                                                fhfbVar = fhfb.a;
                                            }
                                            signInChimeraActivity2.q = ekvk.a(fhfbVar.c);
                                            signInChimeraActivity2.r = ekvk.a(fhfbVar.b);
                                        }
                                        return ekvi.j(2);
                                    } catch (fwuc e) {
                                        throw new IOException(e);
                                    }
                                }
                            });
                        }
                    }), IOException.class, new ekut() { // from class: dfcn
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            IOException iOException = (IOException) obj;
                            if (fuww.a.lK().e()) {
                                SignInChimeraActivity.j.h("Couldn't fetch app's branding information, but continuing without it.", new Object[0]);
                                return ekvi.j(2);
                            }
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            SignInChimeraActivity.j.g("Errors encountered when trying to fetch app's branding information", iOException, new Object[0]);
                            signInChimeraActivity.a(0, null);
                            return ektg.a;
                        }
                    }, this.z);
                    break;
                } else {
                    final eqhc eqhcVar = new eqhc();
                    new AlertDialog.Builder(this).setCancelable(true).setTitle(R.string.signin_not_supported_dialog_title).setMessage(R.string.signin_not_supported_dialog_message).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: dfcq
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            auad auadVar = SignInChimeraActivity.j;
                            dialogInterface.cancel();
                        }
                    }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: dfcs
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            Intent intent = new Intent();
                            intent.putExtra("<<ResolutionFailureErrorDetail>>", 17);
                            SignInChimeraActivity.this.a(0, intent);
                            eqhcVar.q(ektg.a);
                        }
                    }).create().show();
                    eqglVar = eqhcVar;
                    break;
                }
            case 2:
                boolean booleanExtra = getIntent().getBooleanExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", false);
                boolean a = fuxg.a.lK().a();
                int i2 = ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS;
                if (a) {
                    asvl asvlVar = new asvl();
                    asvlVar.c(Arrays.asList("com.google"));
                    asvlVar.d();
                    asvlVar.d = booleanExtra;
                    asvlVar.e();
                    asvlVar.g = getIntent().getStringExtra("hosted_domain");
                    asvlVar.e = this.m;
                    if (true == fuwn.f()) {
                        i2 = 1001;
                    }
                    asvlVar.f = i2;
                    String str = this.r;
                    String str2 = this.q;
                    asvm asvmVar = new asvm();
                    asvmVar.b = str;
                    asvmVar.a = str2;
                    asvlVar.h = asvmVar;
                    c = asvo.a(asvlVar.a());
                } else {
                    c = asvo.c(null, null, new String[]{"com.google"}, true, booleanExtra, 0, 2, getIntent().getStringExtra("hosted_domain"), true);
                    c.putExtra("realClientPackage", this.m);
                    Bundle bundle = new Bundle(Bundle.EMPTY);
                    ((Integer) ((ekvw) ekvi.j(Integer.valueOf(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS))).a).intValue();
                    bundle.putInt("theme", ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS);
                    ekvi i3 = ekvi.i(this.r);
                    ekvi i4 = ekvi.i(this.q);
                    bundle.putBoolean("should_show_consent", true);
                    bundle.putString("privacy_policy_url", (String) i3.f());
                    bundle.putString("terms_of_service_url", (String) i4.f());
                    c.putExtra("first_party_options_bundle", new bohk(bundle).a);
                }
                eqglVar = eqdl.f(this.B.b(2, c), new ekut() { // from class: dfdd
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        Intent intent;
                        SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                        bojo bojoVar = (bojo) obj;
                        if (!signInChimeraActivity.getIntent().getBooleanExtra("complete_sign_in_process", false) || bojoVar.a != -1 || (intent = bojoVar.b) == null) {
                            signInChimeraActivity.a(bojoVar.a, signInChimeraActivity.n ? bojoVar.b : null);
                            return ektg.a;
                        }
                        String stringExtra = intent.getStringExtra("authAccount");
                        ekvl.y(stringExtra);
                        String stringExtra2 = intent.getStringExtra("accountType");
                        ekvl.y(stringExtra2);
                        signInChimeraActivity.o = new Account(stringExtra, stringExtra2);
                        return ekvi.j(3);
                    }
                }, this.z);
                break;
            case 3:
                if (!y.containsAll(this.p)) {
                    eqglVar = eqgc.i(ekvi.j(4));
                    break;
                } else {
                    Account account = this.o;
                    ekvl.y(account);
                    final RecordConsentRequest recordConsentRequest = new RecordConsentRequest(1, account, (Scope[]) this.p.toArray(new Scope[0]), getIntent().getStringExtra("service_client_id"));
                    if (!fuwq.c()) {
                        eqglVar = eqdl.f(this.A.b(3, new ekww() { // from class: dfcx
                            @Override // defpackage.ekww
                            public final Object lK() {
                                atah atahVar = SignInChimeraActivity.this.t;
                                return boke.b(atahVar.d(new dfdn(atahVar, recordConsentRequest)));
                            }
                        }), new ekut() { // from class: dfcy
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                auad auadVar = SignInChimeraActivity.j;
                                if (!((Status) obj).e()) {
                                    SignInChimeraActivity.j.m("Failed to record the consent.", new Object[0]);
                                }
                                return ekvi.j(4);
                            }
                        }, this.z);
                        break;
                    } else {
                        eqglVar = eqdl.f(eqcq.f(this.A.b(3, new ekww() { // from class: dfcg
                            @Override // defpackage.ekww
                            public final Object lK() {
                                dfea dfeaVar = SignInChimeraActivity.this.w;
                                atfn atfnVar = new atfn();
                                final RecordConsentRequest recordConsentRequest2 = recordConsentRequest;
                                atfnVar.a = new atfd() { // from class: dfds
                                    @Override // defpackage.atfd
                                    public final void d(Object obj, Object obj2) {
                                        ((dfej) ((dfen) obj).H()).d(RecordConsentRequest.this, new dfdx((dhma) obj2));
                                    }
                                };
                                atfnVar.d = 6305;
                                return dqmr.b(dfeaVar.ji(atfnVar.a()));
                            }
                        }), aszt.class, new ekut() { // from class: dfcr
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                SignInChimeraActivity.j.m("Failed to record the consent.", new Object[0]);
                                return null;
                            }
                        }, this.z), new ekut() { // from class: dfcw
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                auad auadVar = SignInChimeraActivity.j;
                                return ekvi.j(4);
                            }
                        }, this.z);
                        break;
                    }
                }
            case 4:
                if (this.s == null) {
                    eqglVar = eqdl.f(fuwq.c() ? this.A.b(4, new ekww() { // from class: dfda
                        @Override // defpackage.ekww
                        public final Object lK() {
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            dfea dfeaVar = signInChimeraActivity.w;
                            Account account2 = signInChimeraActivity.o;
                            ekvl.y(account2);
                            final AuthAccountRequest authAccountRequest = new AuthAccountRequest(account2, signInChimeraActivity.p);
                            atfn atfnVar = new atfn();
                            atfnVar.a = new atfd() { // from class: dfdt
                                @Override // defpackage.atfd
                                public final void d(Object obj, Object obj2) {
                                    ((dfej) ((dfen) obj).H()).a(AuthAccountRequest.this, new dfdz((dhma) obj2));
                                }
                            };
                            atfnVar.d = 6307;
                            return dqmr.b(dfeaVar.jd(atfnVar.a()));
                        }
                    }) : this.A.b(4, new ekww() { // from class: dfdb
                        @Override // defpackage.ekww
                        public final Object lK() {
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            atah atahVar = signInChimeraActivity.t;
                            Account account2 = signInChimeraActivity.o;
                            ekvl.y(account2);
                            return boke.b(atahVar.d(new dfdp(atahVar, new AuthAccountRequest(account2, signInChimeraActivity.p))));
                        }
                    }), new ekut() { // from class: dfdc
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            AuthAccountResult authAccountResult = (AuthAccountResult) obj;
                            if (authAccountResult.a().e()) {
                                return ekvi.j(6);
                            }
                            SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                            Intent intent = authAccountResult.c;
                            if (intent != null) {
                                signInChimeraActivity.s = intent;
                                return ekvi.j(5);
                            }
                            Intent intent2 = new Intent();
                            intent2.putExtra("<<ResolutionFailureErrorDetail>>", authAccountResult.b);
                            signInChimeraActivity.a(0, intent2);
                            return ektg.a;
                        }
                    }, this.z);
                    break;
                } else {
                    eqglVar = eqgc.i(ekvi.j(5));
                    break;
                }
            case 5:
                Intent intent = this.s;
                if (intent != null) {
                    intent.setExtrasClassLoader(Scope.class.getClassLoader());
                }
                bojr bojrVar = this.B;
                Intent intent2 = this.s;
                ekvl.y(intent2);
                eqglVar = eqdl.f(bojrVar.b(5, intent2), new ekut() { // from class: dfcp
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        bojo bojoVar = (bojo) obj;
                        int i5 = bojoVar.a;
                        if (i5 == -1) {
                            return ekvi.j(6);
                        }
                        SignInChimeraActivity.this.a(i5, bojoVar.b);
                        return ektg.a;
                    }
                }, this.z);
                break;
            case 6:
                final int intExtra = getIntent().getIntExtra("com.google.android.gms.signin.extraSessionId", -1);
                if (intExtra != -1) {
                    if (!fuwq.c()) {
                        eqglVar = eqdl.f(this.A.b(6, new ekww() { // from class: dfck
                            @Override // defpackage.ekww
                            public final Object lK() {
                                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                                atah atahVar = signInChimeraActivity.t;
                                Account account2 = signInChimeraActivity.o;
                                ekvl.y(account2);
                                return boke.b(atahVar.d(new dfdl(atahVar, intExtra, account2)));
                            }
                        }), new ekut() { // from class: dfcl
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                if (!((Status) obj).e()) {
                                    SignInChimeraActivity.j.m("Saving selected account failed. User probably need to re-select.", new Object[0]);
                                }
                                SignInChimeraActivity.this.a(-1, null);
                                return ektg.a;
                            }
                        }, this.z);
                        break;
                    } else {
                        eqglVar = eqdl.f(eqcq.f(this.A.b(6, new ekww() { // from class: dfch
                            @Override // defpackage.ekww
                            public final Object lK() {
                                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                                dfea dfeaVar = signInChimeraActivity.w;
                                final Account account2 = signInChimeraActivity.o;
                                ekvl.y(account2);
                                atfn atfnVar = new atfn();
                                final int i5 = intExtra;
                                atfnVar.a = new atfd() { // from class: dfdu
                                    @Override // defpackage.atfd
                                    public final void d(Object obj, Object obj2) {
                                        ((dfej) ((dfen) obj).H()).g(i5, account2, new dfdw((dhma) obj2));
                                    }
                                };
                                atfnVar.d = 6303;
                                return dqmr.b(dfeaVar.ji(atfnVar.a()));
                            }
                        }), aszt.class, new ekut() { // from class: dfci
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                SignInChimeraActivity.j.m("Saving selected account failed. User probably needs to re-select.", new Object[0]);
                                return null;
                            }
                        }, this.z), new ekut() { // from class: dfcj
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                SignInChimeraActivity.this.a(-1, null);
                                return ektg.a;
                            }
                        }, this.z);
                        break;
                    }
                } else {
                    a(-1, null);
                    eqglVar = eqgc.i(ektg.a);
                    break;
                }
            default:
                throw new IllegalStateException(String.format("Unknown sign-in step: %d", Integer.valueOf(i)));
        }
        eqgc.t(eqglVar, new dfde(this, System.currentTimeMillis()), this.z);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(R.style.Identity_Theme_NoUIActivity);
        this.u = bonh.b(this, null);
        if (bundle != null) {
            this.m = bundle.getString("SIGN_IN_PACKAGE_NAME");
            this.n = bundle.getBoolean("launched_by_gmscore");
            m(bundle);
        } else {
            String q = aura.q(this);
            this.m = q;
            boolean equalsIgnoreCase = "com.google.android.gms".equalsIgnoreCase(q);
            this.n = equalsIgnoreCase;
            if (equalsIgnoreCase) {
                this.m = (String) ekvh.c(getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME"), this.m);
            }
            Bundle extras = getIntent().getExtras();
            ekvl.y(extras);
            m(extras);
            dfac dfacVar = this.v;
            if (dfacVar.g == null) {
                dfab dfabVar = new dfab();
                dfabVar.a = dfacVar.b;
                dfabVar.b = dfacVar.c;
                dfabVar.c = dfacVar.d;
                dfabVar.d = dfacVar.e;
                dfabVar.e = dfacVar.f;
                dfabVar.f = null;
                dfabVar.g = dfacVar.h;
                dfabVar.h = dfacVar.i;
                dfabVar.i = dfacVar.j;
                dfabVar.f = bonp.a();
                dfac b = dfabVar.b();
                this.v = b;
                this.u.a(boso.a(this.m, (Scope[]) this.p.toArray(new Scope[0]), b));
            }
        }
        bonm.a(this, new ekwb() { // from class: dfct
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                SignInChimeraActivity signInChimeraActivity = SignInChimeraActivity.this;
                signInChimeraActivity.u.a(bono.b(2, (bonn) obj, signInChimeraActivity.v.g));
            }
        });
        j.d("Log Session ID: ".concat(String.valueOf(this.v.g)), new Object[0]);
        this.z = new boju(new caqj(Looper.getMainLooper()));
        if (fuwq.c() && this.w == null) {
            String str = this.m;
            Bundle a = this.v.a();
            a.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
            this.w = new dfea(this, new dezz(a));
        } else {
            String str2 = this.m;
            dfac dfacVar2 = this.v;
            atae ataeVar = new atae(this);
            ataeVar.h(this, 0, new atag() { // from class: dfcv
                @Override // defpackage.ateu
                public final void onConnectionFailed(ConnectionResult connectionResult) {
                    SignInChimeraActivity.this.a(0, null);
                }
            });
            ataeVar.d(dfaa.d, new dezz(dfacVar2.a()));
            ataeVar.c = str2;
            this.t = ataeVar.a();
        }
        this.A = bojs.a(this);
        this.B = bojr.a(this);
        l();
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("start_step", this.l);
        bundle.putParcelable("picked_account", this.o);
        bundle.putString("SIGN_IN_PACKAGE_NAME", this.m);
        bundle.putBoolean("launched_by_gmscore", this.n);
        bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) this.p.toArray(new Scope[0]));
        bundle.putString("terms_of_service_url", this.q);
        bundle.putString("privacy_policy_url", this.r);
        bundle.putParcelable("consent_intent", this.s);
        bundle.putBundle("sign_in_options", this.v.a());
    }
}
