package com.google.android.gms.signin.activity;

import android.R;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.firstparty.dataservice.ConsentResult;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.FACLData;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.activity.ConsentChimeraActivity;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import defpackage.aayw;
import defpackage.arco;
import defpackage.arcy;
import defpackage.arxd;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.bmck;
import defpackage.bmcz;
import defpackage.bmda;
import defpackage.bmdc;
import defpackage.bmgf;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bmgy;
import defpackage.bmhp;
import defpackage.bmlv;
import defpackage.bp;
import defpackage.byhr;
import defpackage.dcou;
import defpackage.dcow;
import defpackage.dcox;
import defpackage.dcpe;
import defpackage.dcqz;
import defpackage.dcra;
import defpackage.dcsa;
import defpackage.dcsv;
import defpackage.dctl;
import defpackage.doci;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eihq;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eiiw;
import defpackage.eijr;
import defpackage.eirn;
import defpackage.eito;
import defpackage.eits;
import defpackage.eixf;
import defpackage.elct;
import defpackage.elfd;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.ensv;
import defpackage.entc;
import defpackage.entj;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fsbl;
import defpackage.fsbo;
import defpackage.fsbr;
import defpackage.qet;
import defpackage.unw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ConsentChimeraActivity extends qet {
    public static final arxo j = dctl.a("ConsentChimeraActivity");
    private static final eits x;
    private static final Pattern y;
    private AccountAuthenticatorResponse A;
    private Set B;
    private String C;
    public final ensv k = entc.a(new asmf(2, 9));
    public bmdc l;
    public CookieManager m;
    public bmda n;
    public bmcz o;
    public aayw p;
    public TokenRequest q;
    public int r;
    public TokenResponse s;
    public ConsentResult t;
    public bmgq u;
    public dcox v;
    dcsv w;
    private boolean z;

    static {
        eito eitoVar = new eito();
        eitoVar.i(0, bmgf.GET_TOKEN);
        eitoVar.i(100, bmgf.REAUTH);
        eitoVar.i(200, bmgf.CONFIGURE_COOKIES);
        eitoVar.i(201, bmgf.BROWSWER_CONSENT);
        eitoVar.i(300, bmgf.NATIVE_CONSENT);
        eitoVar.i(400, bmgf.RECORD_GRANTS);
        eitoVar.i(500, bmgf.HANDLE_DEVICE_MANAGEMENT_ERRORS);
        eitoVar.i(501, bmgf.HANDLE_LOCK_SCREEN_ERROR);
        x = eitoVar.b();
        y = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
    }

    public static void p(Runnable runnable) {
        if (fsbl.a.a().a()) {
            runnable.run();
        }
    }

    private final void q() {
        if (this.z) {
            p(new Runnable() { // from class: dcqu
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentChimeraActivity.j.m("caller asked to suppress loading interstitial", new Object[0]);
                }
            });
            return;
        }
        if (getSupportFragmentManager().h("loading_interstitial") != null) {
            p(new Runnable() { // from class: dcpi
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentChimeraActivity.j.m("fragment with tag=%s already present", "loading_interstitial");
                }
            });
            return;
        }
        p(new Runnable() { // from class: dcqv
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("Loading interstital fragmemt with tag=%s", "loading_interstitial");
            }
        });
        dcra dcraVar = new dcra();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.content, dcraVar, "loading_interstitial");
        bpVar.a();
    }

    public final void a(int i, final String str) {
        p(new Runnable() { // from class: dcpn
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("Finishing ConsentChimeraActivity with errorMessage=%s", str);
            }
        });
        Intent putExtra = new Intent().putExtra("errorCode", i).putExtra("errorMessage", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.A;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(i, str);
        }
        setResult(0, putExtra);
        finish();
    }

    public final void k(String str) {
        p(new Runnable() { // from class: dcqm
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("Finishing ConsentChimeraActivity with success", new Object[0]);
            }
        });
        Intent putExtra = new Intent().putExtra("authAccount", this.q.a().name).putExtra("accountType", this.q.a().type).putExtra("authtoken", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.A;
        if (accountAuthenticatorResponse != null) {
            Bundle extras = putExtra.getExtras();
            eiig.x(extras);
            accountAuthenticatorResponse.onResult(extras);
        }
        setResult(-1, putExtra);
        finish();
    }

    public final /* synthetic */ void l(entj entjVar, AccountManagerFuture accountManagerFuture) {
        try {
            accountManagerFuture.getResult();
            entjVar.q(eiid.j(0));
        } catch (AuthenticatorException e) {
            p(new Runnable() { // from class: dcqj
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentChimeraActivity.j.n("AuthenticatorException performing reauth", e, new Object[0]);
                }
            });
            a(6, "Authenticator error");
            entjVar.q(eigb.a);
        } catch (OperationCanceledException unused) {
            a(4, "Reauth canceled");
            entjVar.q(eigb.a);
        } catch (IOException unused2) {
            a(3, "Network error");
            entjVar.q(eigb.a);
        }
    }

    public final void m(long j2, int i, boolean z) {
        fecj v = elct.a.v();
        bmgf bmgfVar = (bmgf) x.get(Integer.valueOf(i));
        eiig.x(bmgfVar);
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elct elctVar = (elct) fecpVar;
        elctVar.d = bmgfVar.j;
        elctVar.b |= 2;
        if (!fecpVar.L()) {
            v.U();
        }
        elct elctVar2 = (elct) v.b;
        elctVar2.b |= 4096;
        elctVar2.o = z;
        long currentTimeMillis = System.currentTimeMillis() - j2;
        if (!v.b.L()) {
            v.U();
        }
        elct elctVar3 = (elct) v.b;
        elctVar3.b |= 2048;
        elctVar3.n = currentTimeMillis;
        elct elctVar4 = (elct) v.Q();
        fecj v2 = elfd.a.v();
        String str = this.v.g;
        if (str != null) {
            if (!v2.b.L()) {
                v2.U();
            }
            elfd elfdVar = (elfd) v2.b;
            elfdVar.b |= 2;
            elfdVar.e = str;
        }
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfd elfdVar2 = (elfd) fecpVar2;
        elfdVar2.d = 5;
        elfdVar2.b |= 1;
        if (!fecpVar2.L()) {
            v2.U();
        }
        elfd elfdVar3 = (elfd) v2.b;
        elctVar4.getClass();
        elfdVar3.i = elctVar4;
        elfdVar3.b |= 32;
        this.u.a((elfd) v2.Q());
    }

    public final void n() {
        this.m.removeAllCookies(null);
        this.m.flush();
    }

    public final void o() {
        enss f;
        p(new Runnable() { // from class: dcpo
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("startNextStep() is called, consentStep=%d.", Integer.valueOf(ConsentChimeraActivity.this.r));
            }
        });
        int i = this.r;
        if (i == 0) {
            q();
            f = enps.f(this.n.b(0, new eijr() { // from class: dcqb
                @Override // defpackage.eijr
                public final Object a() {
                    final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    return consentChimeraActivity.k.submit(new Callable() { // from class: dcpj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                            return consentChimeraActivity2.p.c(consentChimeraActivity2.q);
                        }
                    });
                }
            }), new eiho() { // from class: dcqc
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    final TokenResponse tokenResponse = (TokenResponse) obj;
                    consentChimeraActivity.n.d(0);
                    ConsentChimeraActivity.p(new Runnable() { // from class: dcps
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConsentChimeraActivity.j.m("Token response: %s.", TokenResponse.this.a().ak);
                        }
                    });
                    consentChimeraActivity.s = tokenResponse;
                    abau abauVar = abau.CLIENT_LOGIN_DISABLED;
                    int ordinal = tokenResponse.a().ordinal();
                    if (ordinal == 2) {
                        consentChimeraActivity.k(tokenResponse.d);
                        return eigb.a;
                    }
                    if (ordinal == 8) {
                        return eiid.j(100);
                    }
                    if (ordinal == 4) {
                        consentChimeraActivity.a(3, "Network error");
                        return eigb.a;
                    }
                    if (ordinal == 5) {
                        consentChimeraActivity.a(4, "Service unavailable");
                        return eigb.a;
                    }
                    if (ordinal == 6) {
                        consentChimeraActivity.a(4, "Internal error");
                        return eigb.a;
                    }
                    if (ordinal == 22) {
                        return eiid.j(300);
                    }
                    if (ordinal == 23) {
                        return eiid.j(200);
                    }
                    switch (ordinal) {
                        case fwac.D /* 30 */:
                        case fwac.E /* 31 */:
                        case 32:
                        case fwac.G /* 33 */:
                        case fwac.H /* 34 */:
                        case fwac.I /* 35 */:
                        case fwac.J /* 36 */:
                        case fwac.L /* 38 */:
                        case fwac.M /* 39 */:
                            return eiid.j(500);
                        case fwac.K /* 37 */:
                            return eiid.j(501);
                        default:
                            consentChimeraActivity.a(4, "Unknown error");
                            return eigb.a;
                    }
                }
            }, this.l);
        } else if (i == 100) {
            Account a = this.q.a();
            if ("com.google.work".equals(a.type) && y.matcher(a.name).matches()) {
                p(new Runnable() { // from class: dcqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentChimeraActivity.j.m("not performing reauth for service account. Unsupported operation", new Object[0]);
                    }
                });
                a(6, "Work service account");
                f = ensj.i(eigb.a);
            } else {
                f = this.n.b(100, new eijr() { // from class: dcqo
                    @Override // defpackage.eijr
                    public final Object a() {
                        final entj entjVar = new entj();
                        final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                        bqna.b(consentChimeraActivity).z(consentChimeraActivity.q.a(), consentChimeraActivity.q.a, Bundle.EMPTY, consentChimeraActivity.getContainerActivity(), new AccountManagerCallback() { // from class: dcqi
                            @Override // android.accounts.AccountManagerCallback
                            public final void run(AccountManagerFuture accountManagerFuture) {
                                ConsentChimeraActivity.this.l(entjVar, accountManagerFuture);
                            }
                        });
                        return entjVar;
                    }
                });
            }
        } else if (i == 300) {
            TokenResponse tokenResponse = this.s;
            eiig.x(tokenResponse);
            bmcz bmczVar = this.o;
            TokenRequest tokenRequest = this.q;
            fsbo.a.a().b();
            Intent intent = bmck.a;
            String string = tokenRequest.b().getString("KEY_DEVICE_NAME");
            unw a2 = unw.a(tokenRequest.b());
            boolean e = true ^ a2.e();
            String d = a2.d();
            Intent className = new Intent().setClassName(this, "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
            className.putExtra("callingPkg", tokenRequest.i.e);
            className.putExtra("callingUid", tokenRequest.i.b);
            className.putExtra("service", tokenRequest.a);
            className.putExtra("acctName", tokenRequest.a().name);
            className.putParcelableArrayListExtra("scopeData", eixf.c(eirn.j(tokenResponse.b()).l(new eiho() { // from class: bmcj
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    String str;
                    String str2;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    String str3;
                    boolean z7;
                    boolean z8;
                    boolean z9;
                    boolean z10;
                    boolean z11;
                    ScopeDetail scopeDetail = (ScopeDetail) obj;
                    Intent intent2 = bmck.a;
                    ArrayList b = eixf.b(scopeDetail.a());
                    FACLData fACLData = scopeDetail.h;
                    if (fACLData != null) {
                        FACLConfig fACLConfig = fACLData.b;
                        if (fACLConfig != null) {
                            z7 = fACLConfig.d;
                            z8 = fACLConfig.b;
                            z9 = fACLConfig.f;
                            z10 = fACLConfig.e;
                            z11 = fACLConfig.g;
                            str3 = fACLConfig.c;
                        } else {
                            str3 = null;
                            z7 = false;
                            z8 = false;
                            z9 = false;
                            z10 = false;
                            z11 = false;
                        }
                        str2 = fACLData.c;
                        z = fACLData.d;
                        z6 = z7;
                        z5 = z8;
                        z4 = z9;
                        z3 = z10;
                        z2 = z11;
                        str = str3;
                    } else {
                        str = null;
                        str2 = null;
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        z6 = false;
                    }
                    String str4 = scopeDetail.b;
                    String str5 = scopeDetail.c;
                    String str6 = scopeDetail.d;
                    boolean z12 = false;
                    String str7 = scopeDetail.e;
                    if (fACLData != null) {
                        z12 = true;
                    }
                    return new ScopeData(str4, str5, str6, str7, z12, str, str2, z, z2, z3, z4, z5, z6, b, scopeDetail.f);
                }
            }).iterator()));
            className.putExtra("GrantCredentialsWithAclChimeraActivity.hasTitle", tokenResponse.r);
            className.putExtra("GrantCredentialsWithAclChimeraActivity.title", tokenResponse.s);
            className.putExtra("GrantCredentialsWithAclChimeraActivity.consentCookieWrapper", tokenResponse.y);
            if (string != null) {
                className.putExtra("KEY_DEVICE_NAME", string);
            }
            className.putExtra("GrantCredentialsWithAclChimeraActivity.isRemoteApp", e);
            className.putExtra("GrantCredentialsWithAclChimeraActivity.remoteAppLabel", d);
            f = enps.f(bmczVar.b(300, className), new eiho() { // from class: dcpl
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    bmcw bmcwVar = (bmcw) obj;
                    int i2 = bmcwVar.a;
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    if (i2 != -1) {
                        consentChimeraActivity.a(4, "");
                        return eigb.a;
                    }
                    Intent intent2 = bmcwVar.b;
                    if (intent2.hasExtra(ConsentResult.a)) {
                        intent2.setExtrasClassLoader(ConsentResult.class.getClassLoader());
                        consentChimeraActivity.t = (ConsentResult) intent2.getParcelableExtra(ConsentResult.a);
                    } else if (intent2.hasExtra("consent")) {
                        String stringExtra = intent2.getStringExtra("consent");
                        eiig.x(stringExtra);
                        aazm a3 = aazm.a(stringExtra);
                        consentChimeraActivity.t = new ConsentResult(a3 == aazm.GRANTED ? abau.SUCCESS : abau.PERMISSION_DENIED, null, null, a3, consentChimeraActivity.q.p);
                    } else {
                        String stringExtra2 = intent2.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.consent");
                        eiig.x(stringExtra2);
                        aazm a4 = aazm.a(stringExtra2);
                        consentChimeraActivity.t = new ConsentResult(a4 == aazm.GRANTED ? abau.SUCCESS : abau.PERMISSION_DENIED, intent2.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.pacl"), (FACLConfig) intent2.getParcelableExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.facl"), a4, consentChimeraActivity.q.p);
                    }
                    return eiid.j(400);
                }
            }, this.l);
        } else if (i == 400) {
            q();
            if (fsbr.h()) {
                TokenRequest tokenRequest2 = this.q;
                ConsentResult consentResult = this.t;
                eiig.x(consentResult);
                Bundle bundle = new Bundle();
                bmgy.b(bundle, "token_request", tokenRequest2);
                bmgy.b(bundle, "consent_result", consentResult);
                dcsv dcsvVar = this.w;
                eiig.x(dcsvVar);
                final RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = new RecordConsentByConsentResultRequest(bundle);
                arcy arcyVar = new arcy();
                arcyVar.a = new arco() { // from class: dcsq
                    @Override // defpackage.arco
                    public final void d(Object obj, Object obj2) {
                        ((dcte) ((dcti) obj).H()).e(RecordConsentByConsentResultRequest.this, new dcst((dfau) obj2));
                    }
                };
                arcyVar.d = 6306;
                final enss b = doci.b(dcsvVar.iT(arcyVar.a()));
                f = enps.f(this.n.b(400, new eijr() { // from class: dcqe
                    @Override // defpackage.eijr
                    public final Object a() {
                        arxo arxoVar = ConsentChimeraActivity.j;
                        return enss.this;
                    }
                }), new eiho() { // from class: dcqf
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        String str = ((RecordConsentByConsentResultResponse) obj).b;
                        eiig.x(str);
                        ConsentChimeraActivity.this.k(str);
                        return eigb.a;
                    }
                }, this.l);
            } else {
                f = enps.f(this.n.b(400, new eijr() { // from class: dcqg
                    @Override // defpackage.eijr
                    public final Object a() {
                        final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                        return consentChimeraActivity.k.submit(new Callable() { // from class: dcqk
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                                TokenRequest tokenRequest3 = new TokenRequest(consentChimeraActivity2.q.a(), consentChimeraActivity2.q.a);
                                tokenRequest3.f(consentChimeraActivity2.q.b());
                                tokenRequest3.d(aazm.GRANTED);
                                tokenRequest3.i = consentChimeraActivity2.q.i;
                                ConsentResult consentResult2 = consentChimeraActivity2.t;
                                if (consentResult2 != null) {
                                    FACLConfig fACLConfig = consentResult2.e;
                                    if (fACLConfig != null) {
                                        tokenRequest3.d = fACLConfig;
                                    }
                                    PACLConfig pACLConfig = tokenRequest3.e;
                                    String str = consentResult2.d;
                                    if (str != null) {
                                        tokenRequest3.e = new PACLConfig(pACLConfig != null ? pACLConfig.b : null, str);
                                    }
                                    aazm a3 = consentResult2.a();
                                    if (a3 != null) {
                                        tokenRequest3.d(a3);
                                    }
                                    String str2 = consentResult2.g;
                                    if (!TextUtils.isEmpty(str2)) {
                                        tokenRequest3.p = str2;
                                    }
                                    String str3 = consentResult2.h;
                                    if (!TextUtils.isEmpty(str3)) {
                                        tokenRequest3.q = str3;
                                    }
                                }
                                return consentChimeraActivity2.p.c(tokenRequest3);
                            }
                        });
                    }
                }), new eiho() { // from class: dcqh
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        ConsentChimeraActivity.this.k(((TokenResponse) obj).d);
                        return eigb.a;
                    }
                }, this.l);
            }
        } else if (i == 200) {
            q();
            f = enps.f(this.n.b(200, new eijr() { // from class: dcpm
                @Override // defpackage.eijr
                public final Object a() {
                    final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    return consentChimeraActivity.k.submit(new Callable() { // from class: dcph
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                            consentChimeraActivity2.n();
                            final TokenResponse tokenResponse2 = consentChimeraActivity2.s;
                            eiig.x(tokenResponse2);
                            ConsentChimeraActivity.p(new Runnable() { // from class: dcpt
                                @Override // java.lang.Runnable
                                public final void run() {
                                    arxo arxoVar = ConsentChimeraActivity.j;
                                    TokenResponse tokenResponse3 = TokenResponse.this;
                                    arxoVar.m("Token response: %s, resolutionUrl=%s.", tokenResponse3.a().ak, tokenResponse3.z.d);
                                }
                            });
                            BrowserResolutionCookie[] browserResolutionCookieArr = tokenResponse2.z.e;
                            if (browserResolutionCookieArr == null) {
                                ConsentChimeraActivity.p(new Runnable() { // from class: dcpu
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConsentChimeraActivity.j.m("null browser cookies in tokenResponse.", new Object[0]);
                                    }
                                });
                            } else {
                                for (BrowserResolutionCookie browserResolutionCookie : browserResolutionCookieArr) {
                                    if (TextUtils.isEmpty(browserResolutionCookie.c) || TextUtils.isEmpty(browserResolutionCookie.a) || TextUtils.isEmpty(browserResolutionCookie.b)) {
                                        ConsentChimeraActivity.p(new Runnable() { // from class: dcpv
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ConsentChimeraActivity.j.m("Invalid browser resolution cookie.", new Object[0]);
                                            }
                                        });
                                    } else {
                                        final String str = browserResolutionCookie.c;
                                        eiig.x(str);
                                        String a3 = uno.a(str, Boolean.valueOf(browserResolutionCookie.f));
                                        String b2 = uno.b(browserResolutionCookie.a, browserResolutionCookie.b, browserResolutionCookie.c, browserResolutionCookie.d, Boolean.valueOf(browserResolutionCookie.g), Boolean.valueOf(browserResolutionCookie.f), Long.valueOf(browserResolutionCookie.e));
                                        ConsentChimeraActivity.p(new Runnable() { // from class: dcpw
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ConsentChimeraActivity.j.m("Setting browser resolution cookie for domain: ".concat(str), new Object[0]);
                                            }
                                        });
                                        consentChimeraActivity2.m.setCookie(a3, b2);
                                    }
                                }
                            }
                            if (fkgv.a.a().e() && tokenResponse2.z.f) {
                                ConsentChimeraActivity.p(new Runnable() { // from class: dcpx
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConsentChimeraActivity.j.m("Skip populating WebLogin cookies", new Object[0]);
                                    }
                                });
                                return ejck.a;
                            }
                            ConsentChimeraActivity.p(new Runnable() { // from class: dcpy
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ConsentChimeraActivity.j.m("Setting cookies to resolution url=%s", TokenResponse.this.z.d);
                                }
                            });
                            return new uou(consentChimeraActivity2).b(consentChimeraActivity2.q.a(), tokenResponse2.z.d);
                        }
                    });
                }
            }), new eihq(eiid.j(201)), this.l);
        } else if (i == 201) {
            final dcpe dcpeVar = (dcpe) getSupportFragmentManager().h("browser_consent");
            TokenResponse tokenResponse2 = this.s;
            eiig.x(tokenResponse2);
            if (dcpeVar == null) {
                final String str = tokenResponse2.z.d;
                if (fsbr.f()) {
                    str = bmhp.b(str, getResources());
                }
                p(new Runnable() { // from class: dcqn
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentChimeraActivity.j.m("starting webivew with resolution url=%s", str);
                    }
                });
                Account a3 = this.q.a();
                dcpe dcpeVar2 = new dcpe();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("selected_account", a3);
                bundle2.putString("url", str);
                dcpeVar2.setArguments(bundle2);
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.z(R.id.content, dcpeVar2, "browser_consent");
                bpVar.a();
                dcpeVar = dcpeVar2;
            } else {
                p(new Runnable() { // from class: dcqp
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentChimeraActivity.j.m("fragment with tag=%s already present", "browser_consent");
                    }
                });
            }
            f = enps.f(this.n.b(201, new eijr() { // from class: dcpz
                @Override // defpackage.eijr
                public final Object a() {
                    arxo arxoVar = ConsentChimeraActivity.j;
                    return dcpe.this.b;
                }
            }), new eiho() { // from class: dcqa
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    eiid eiidVar = (eiid) obj;
                    boolean h = eiidVar.h();
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    if (h) {
                        consentChimeraActivity.t = new ConsentResult(abau.SUCCESS, aazm.GRANTED, (String) eiidVar.c());
                        return eiid.j(400);
                    }
                    ConsentChimeraActivity.p(new Runnable() { // from class: dcql
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConsentChimeraActivity.j.m("In step=%d, No consent received from the webview", 201);
                        }
                    });
                    consentChimeraActivity.a(4, "");
                    return eigb.a;
                }
            }, this.l);
        } else if (i == 500) {
            final Account a4 = this.q.a();
            TokenResponse tokenResponse3 = this.s;
            final String str2 = tokenResponse3 != null ? tokenResponse3.v : "dmStatus";
            f = enps.g(enps.f(ensi.h(this.k.submit(new Callable() { // from class: dcpq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(asnd.u(ConsentChimeraActivity.this, a4.name));
                }
            })), new eiho() { // from class: dcpr
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    Bundle bundle3 = Bundle.EMPTY;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    return eiid.i(arka.c(ConsentChimeraActivity.this, a4, false, false, bundle3, false, null, true, str2, booleanValue, 1, Bundle.EMPTY, false));
                }
            }, enre.a), new enqc() { // from class: dcqq
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    eiid eiidVar = (eiid) obj;
                    boolean h = eiidVar.h();
                    final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    if (h) {
                        return enps.f(consentChimeraActivity.o.b(500, (Intent) eiidVar.c()), new eiho() { // from class: dcqr
                            @Override // defpackage.eiho
                            public final Object apply(Object obj2) {
                                ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                                consentChimeraActivity2.n.d(500);
                                int i2 = ((bmcw) obj2).a;
                                if (i2 != 0) {
                                    switch (i2) {
                                        case 2:
                                        case 7:
                                        case 8:
                                            consentChimeraActivity2.a(5, "Unexpected server error");
                                            break;
                                        case 3:
                                            consentChimeraActivity2.a(3, "Network error");
                                            break;
                                        case 4:
                                            consentChimeraActivity2.a(3, "App installation failure");
                                            break;
                                        case 5:
                                        case 9:
                                            consentChimeraActivity2.a(6, "Device management not supported");
                                            break;
                                        case 6:
                                        case 10:
                                            consentChimeraActivity2.a(4, "User canceled");
                                            break;
                                    }
                                    return eigb.a;
                                }
                                if (fsbl.a.a().b()) {
                                    consentChimeraActivity2.a(4, "user canceled");
                                    return eigb.a;
                                }
                                return eiid.j(0);
                            }
                        }, consentChimeraActivity.l);
                    }
                    consentChimeraActivity.a(6, "Device management is not supported");
                    return ensj.i(eigb.a);
                }
            }, this.l);
        } else {
            if (i != 501) {
                throw new IllegalStateException(String.format("Unknown consent step: %d", Integer.valueOf(i)));
            }
            f = enps.f(this.o.b(501, bmck.a(this, this.q.a())), new eiho() { // from class: dcpk
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    consentChimeraActivity.n.d(501);
                    if (((bmcw) obj).a == -1) {
                        return eiid.j(0);
                    }
                    consentChimeraActivity.a(4, "Error setting up the lock screen");
                    return eigb.a;
                }
            }, this.l);
        }
        ensj.t(f, new dcqz(this, System.currentTimeMillis()), this.l);
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        dcpe dcpeVar = (dcpe) getSupportFragmentManager().h("browser_consent");
        if (dcpeVar != null) {
            WebView webView = dcpeVar.c;
            if (webView != null && webView.canGoBack()) {
                dcpeVar.c.goBack();
            } else {
                a(4, "");
                super.onBackPressed();
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(com.google.android.gms.R.style.Identity_Theme_DayNight_NoActionBar_Dialog_MinWidth);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.u = bmgp.b(this, null);
        this.m = getPackageManager().hasSystemFeature("android.software.webview") ? CookieManager.getInstance() : new dcsa();
        this.l = new bmdc(new byhr(Looper.getMainLooper()));
        this.n = bmda.a(this);
        this.o = bmcz.a(this);
        this.p = new aayw(this);
        if (bundle != null) {
            this.r = bundle.getInt("consent_step", 0);
            if (bundle.containsKey("token_response")) {
                byte[] byteArray = bundle.getByteArray("token_response");
                eiig.x(byteArray);
                this.s = (TokenResponse) arxd.a(byteArray, TokenResponse.CREATOR);
            }
            if (bundle.containsKey("consent_result")) {
                this.t = (ConsentResult) bundle.getParcelable("consent_result");
            }
            this.C = bundle.getString("SIGN_IN_PACKAGE_NAME");
            if (bundle.containsKey("SIGN_IN_SCOPE_ARRAY")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
                eiig.x(parcelableArray);
                this.B = eirn.k(parcelableArray).l(new eiho() { // from class: dcqs
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        arxo arxoVar = ConsentChimeraActivity.j;
                        return (Scope) ((Parcelable) obj);
                    }
                }).p();
            }
            Bundle bundle2 = bundle.getBundle("sign_in_options");
            eiig.x(bundle2);
            this.v = dcow.a(bundle2).b();
        } else {
            this.r = 0;
            this.s = null;
            this.t = null;
            this.C = getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME");
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("SIGN_IN_SCOPE_ARRAY");
            if (parcelableArrayExtra != null) {
                this.B = eirn.k(parcelableArrayExtra).l(new eiho() { // from class: dcqt
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        arxo arxoVar = ConsentChimeraActivity.j;
                        return (Scope) ((Parcelable) obj);
                    }
                }).p();
            }
            Bundle bundleExtra = getIntent().getBundleExtra("sign_in_options");
            dcow a = bundleExtra != null ? dcow.a(bundleExtra) : new dcow();
            dcox b = a.b();
            this.v = b;
            if (b.g == null) {
                a.f = bmgx.a();
                dcox b2 = a.b();
                this.v = b2;
                bmgq bmgqVar = this.u;
                String str = this.C;
                Set set = this.B;
                bmgqVar.a(bmlv.a(str, set != null ? (Scope[]) set.toArray(new Scope[0]) : null, b2));
            }
        }
        bmgu.a(this, new eiiw() { // from class: dcpp
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                consentChimeraActivity.u.a(bmgw.b(4, (bmgv) obj, consentChimeraActivity.v.g));
            }
        });
        j.d("Log Session ID: ".concat(String.valueOf(this.v.g)), new Object[0]);
        TokenRequest tokenRequest = (TokenRequest) arxd.b(getIntent(), "token_request", TokenRequest.CREATOR);
        eiig.x(tokenRequest);
        this.q = tokenRequest;
        this.z = getIntent().getBooleanExtra("suppress_loading_ui", false);
        this.A = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("account_authenticator_response");
        if (fsbr.h()) {
            String str2 = this.C;
            Bundle a2 = this.v.a();
            a2.putString("com.google.android.gms.signin.internal.realClientPackageName", str2);
            this.w = new dcsv(this, new dcou(a2));
        }
        o();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            n();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TokenResponse tokenResponse = this.s;
        if (tokenResponse != null) {
            bundle.putByteArray("token_response", arxd.n(tokenResponse));
        }
        bundle.putInt("consent_step", this.r);
        ConsentResult consentResult = this.t;
        if (consentResult != null) {
            bundle.putParcelable("consent_result", consentResult);
        }
        Set set = this.B;
        if (set != null) {
            bundle.putParcelableArray("SIGN_IN_SCOPE_ARRAY", (Parcelable[]) set.toArray(new Scope[0]));
        }
        bundle.putBundle("sign_in_options", this.v.a());
    }
}
