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
import defpackage.acyw;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.atzs;
import defpackage.auad;
import defpackage.aupz;
import defpackage.bojc;
import defpackage.bojr;
import defpackage.bojs;
import defpackage.boju;
import defpackage.bomx;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.bonq;
import defpackage.booh;
import defpackage.boso;
import defpackage.bp;
import defpackage.caqj;
import defpackage.dezz;
import defpackage.dfab;
import defpackage.dfac;
import defpackage.dfaj;
import defpackage.dfce;
import defpackage.dfcf;
import defpackage.dfdf;
import defpackage.dfea;
import defpackage.dfeq;
import defpackage.dqmr;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekuv;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.ekwb;
import defpackage.ekww;
import defpackage.eles;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.elkk;
import defpackage.enqg;
import defpackage.ensq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.eqgv;
import defpackage.eqhc;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fuwh;
import defpackage.fuwk;
import defpackage.fuwn;
import defpackage.rxx;
import defpackage.wjv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ConsentChimeraActivity extends rxx {
    public static final auad j = dfeq.a("ConsentChimeraActivity");
    private static final elgx x;
    private static final Pattern y;
    private AccountAuthenticatorResponse A;
    private Set B;
    private String C;
    public final eqgo k = eqgv.a(new aupz(2, 9));
    public boju l;
    public CookieManager m;
    public bojs n;
    public bojr o;
    public acyw p;
    public TokenRequest q;
    public int r;
    public TokenResponse s;
    public ConsentResult t;
    public boni u;
    public dfac v;
    dfea w;
    private boolean z;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i(0, bomx.GET_TOKEN);
        elgtVar.i(100, bomx.REAUTH);
        elgtVar.i(200, bomx.CONFIGURE_COOKIES);
        elgtVar.i(201, bomx.BROWSWER_CONSENT);
        elgtVar.i(300, bomx.NATIVE_CONSENT);
        elgtVar.i(400, bomx.RECORD_GRANTS);
        elgtVar.i(500, bomx.HANDLE_DEVICE_MANAGEMENT_ERRORS);
        elgtVar.i(501, bomx.HANDLE_LOCK_SCREEN_ERROR);
        x = elgtVar.b();
        y = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");
    }

    public static void p(Runnable runnable) {
        if (fuwh.a.lK().a()) {
            runnable.run();
        }
    }

    private final void q() {
        if (this.z) {
            p(new Runnable() { // from class: dfbz
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentChimeraActivity.j.m("caller asked to suppress loading interstitial", new Object[0]);
                }
            });
            return;
        }
        if (getSupportFragmentManager().h("loading_interstitial") != null) {
            p(new Runnable() { // from class: dfan
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentChimeraActivity.j.m("fragment with tag=%s already present", "loading_interstitial");
                }
            });
            return;
        }
        p(new Runnable() { // from class: dfca
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("Loading interstital fragmemt with tag=%s", "loading_interstitial");
            }
        });
        dfcf dfcfVar = new dfcf();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.content, dfcfVar, "loading_interstitial");
        bpVar.a();
    }

    public final void a(int i, final String str) {
        p(new Runnable() { // from class: dfas
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
        p(new Runnable() { // from class: dfbr
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("Finishing ConsentChimeraActivity with success", new Object[0]);
            }
        });
        Intent putExtra = new Intent().putExtra("authAccount", this.q.a().name).putExtra("accountType", this.q.a().type).putExtra("authtoken", str);
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.A;
        if (accountAuthenticatorResponse != null) {
            Bundle extras = putExtra.getExtras();
            ekvl.y(extras);
            accountAuthenticatorResponse.onResult(extras);
        }
        setResult(-1, putExtra);
        finish();
    }

    public final /* synthetic */ void l(eqhc eqhcVar, AccountManagerFuture accountManagerFuture) {
        try {
            accountManagerFuture.getResult();
            eqhcVar.q(ekvi.j(0));
        } catch (AuthenticatorException e) {
            p(new Runnable() { // from class: dfbo
                @Override // java.lang.Runnable
                public final void run() {
                    ConsentChimeraActivity.j.n("AuthenticatorException performing reauth", e, new Object[0]);
                }
            });
            a(6, "Authenticator error");
            eqhcVar.q(ektg.a);
        } catch (OperationCanceledException unused) {
            a(4, "Reauth canceled");
            eqhcVar.q(ektg.a);
        } catch (IOException unused2) {
            a(3, "Network error");
            eqhcVar.q(ektg.a);
        }
    }

    public final void m(long j2, int i, boolean z) {
        fgrc v = enqg.a.v();
        bomx bomxVar = (bomx) x.get(Integer.valueOf(i));
        ekvl.y(bomxVar);
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enqg enqgVar = (enqg) fgriVar;
        enqgVar.d = bomxVar.j;
        enqgVar.b |= 2;
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
        this.u.a((ensq) v2.Q());
    }

    public final void n() {
        this.m.removeAllCookies(null);
        this.m.flush();
    }

    public final void o() {
        eqgl f;
        p(new Runnable() { // from class: dfat
            @Override // java.lang.Runnable
            public final void run() {
                ConsentChimeraActivity.j.m("startNextStep() is called, consentStep=%d.", Integer.valueOf(ConsentChimeraActivity.this.r));
            }
        });
        int i = this.r;
        if (i == 0) {
            q();
            f = eqdl.f(this.n.b(0, new ekww() { // from class: dfbg
                @Override // defpackage.ekww
                public final Object lK() {
                    final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    return consentChimeraActivity.k.submit(new Callable() { // from class: dfao
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                            return consentChimeraActivity2.p.c(consentChimeraActivity2.q);
                        }
                    });
                }
            }), new ekut() { // from class: dfbh
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    final TokenResponse tokenResponse = (TokenResponse) obj;
                    consentChimeraActivity.n.d(0);
                    ConsentChimeraActivity.p(new Runnable() { // from class: dfax
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConsentChimeraActivity.j.m("Token response: %s.", TokenResponse.this.a().ak);
                        }
                    });
                    consentChimeraActivity.s = tokenResponse;
                    adau adauVar = adau.CLIENT_LOGIN_DISABLED;
                    int ordinal = tokenResponse.a().ordinal();
                    if (ordinal == 2) {
                        consentChimeraActivity.k(tokenResponse.d);
                        return ektg.a;
                    }
                    if (ordinal == 8) {
                        return ekvi.j(100);
                    }
                    if (ordinal == 4) {
                        consentChimeraActivity.a(3, "Network error");
                        return ektg.a;
                    }
                    if (ordinal == 5) {
                        consentChimeraActivity.a(4, "Service unavailable");
                        return ektg.a;
                    }
                    if (ordinal == 6) {
                        consentChimeraActivity.a(4, "Internal error");
                        return ektg.a;
                    }
                    if (ordinal == 22) {
                        return ekvi.j(300);
                    }
                    if (ordinal == 23) {
                        return ekvi.j(200);
                    }
                    switch (ordinal) {
                        case fywe.D /* 30 */:
                        case fywe.E /* 31 */:
                        case 32:
                        case fywe.G /* 33 */:
                        case fywe.H /* 34 */:
                        case fywe.I /* 35 */:
                        case fywe.J /* 36 */:
                        case fywe.L /* 38 */:
                        case fywe.M /* 39 */:
                            return ekvi.j(500);
                        case fywe.K /* 37 */:
                            return ekvi.j(501);
                        default:
                            consentChimeraActivity.a(4, "Unknown error");
                            return ektg.a;
                    }
                }
            }, this.l);
        } else if (i == 100) {
            Account a = this.q.a();
            if ("com.google.work".equals(a.type) && y.matcher(a.name).matches()) {
                p(new Runnable() { // from class: dfbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentChimeraActivity.j.m("not performing reauth for service account. Unsupported operation", new Object[0]);
                    }
                });
                a(6, "Work service account");
                f = eqgc.i(ektg.a);
            } else {
                f = this.n.b(100, new ekww() { // from class: dfbt
                    @Override // defpackage.ekww
                    public final Object lK() {
                        final eqhc eqhcVar = new eqhc();
                        final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                        bsup.b(consentChimeraActivity).z(consentChimeraActivity.q.a(), consentChimeraActivity.q.a, Bundle.EMPTY, consentChimeraActivity.getContainerActivity(), new AccountManagerCallback() { // from class: dfbn
                            @Override // android.accounts.AccountManagerCallback
                            public final void run(AccountManagerFuture accountManagerFuture) {
                                ConsentChimeraActivity.this.l(eqhcVar, accountManagerFuture);
                            }
                        });
                        return eqhcVar;
                    }
                });
            }
        } else if (i == 300) {
            TokenResponse tokenResponse = this.s;
            ekvl.y(tokenResponse);
            bojr bojrVar = this.o;
            TokenRequest tokenRequest = this.q;
            fuwk.a.lK().b();
            Intent intent = bojc.a;
            String string = tokenRequest.b().getString("KEY_DEVICE_NAME");
            wjv a2 = wjv.a(tokenRequest.b());
            boolean e = true ^ a2.e();
            String d = a2.d();
            Intent className = new Intent().setClassName(this, "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
            className.putExtra("callingPkg", tokenRequest.i.e);
            className.putExtra("callingUid", tokenRequest.i.b);
            className.putExtra("service", tokenRequest.a);
            className.putExtra("acctName", tokenRequest.a().name);
            className.putParcelableArrayListExtra("scopeData", elkk.c(eles.j(tokenResponse.b()).l(new ekut() { // from class: bojb
                @Override // defpackage.ekut
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
                    Intent intent2 = bojc.a;
                    ArrayList b = elkk.b(scopeDetail.a());
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
            f = eqdl.f(bojrVar.b(300, className), new ekut() { // from class: dfaq
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    bojo bojoVar = (bojo) obj;
                    int i2 = bojoVar.a;
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    if (i2 != -1) {
                        consentChimeraActivity.a(4, "");
                        return ektg.a;
                    }
                    Intent intent2 = bojoVar.b;
                    String str = ConsentResult.a;
                    if (intent2.hasExtra(str)) {
                        intent2.setExtrasClassLoader(ConsentResult.class.getClassLoader());
                        consentChimeraActivity.t = (ConsentResult) intent2.getParcelableExtra(str);
                    } else if (intent2.hasExtra("consent")) {
                        String stringExtra = intent2.getStringExtra("consent");
                        ekvl.y(stringExtra);
                        aczm a3 = aczm.a(stringExtra);
                        consentChimeraActivity.t = new ConsentResult(a3 == aczm.GRANTED ? adau.SUCCESS : adau.PERMISSION_DENIED, null, null, a3, consentChimeraActivity.q.p);
                    } else {
                        String stringExtra2 = intent2.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.consent");
                        ekvl.y(stringExtra2);
                        aczm a4 = aczm.a(stringExtra2);
                        consentChimeraActivity.t = new ConsentResult(a4 == aczm.GRANTED ? adau.SUCCESS : adau.PERMISSION_DENIED, intent2.getStringExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.pacl"), (FACLConfig) intent2.getParcelableExtra("com.google.android.gsf.notouch.GrantCredentialsWithAclNoTouchActivity.facl"), a4, consentChimeraActivity.q.p);
                    }
                    return ekvi.j(400);
                }
            }, this.l);
        } else if (i == 400) {
            q();
            if (fuwn.h()) {
                TokenRequest tokenRequest2 = this.q;
                ConsentResult consentResult = this.t;
                ekvl.y(consentResult);
                Bundle bundle = new Bundle();
                bonq.b(bundle, "token_request", tokenRequest2);
                bonq.b(bundle, "consent_result", consentResult);
                dfea dfeaVar = this.w;
                ekvl.y(dfeaVar);
                final RecordConsentByConsentResultRequest recordConsentByConsentResultRequest = new RecordConsentByConsentResultRequest(bundle);
                atfn atfnVar = new atfn();
                atfnVar.a = new atfd() { // from class: dfdv
                    @Override // defpackage.atfd
                    public final void d(Object obj, Object obj2) {
                        ((dfej) ((dfen) obj).H()).e(RecordConsentByConsentResultRequest.this, new dfdy((dhma) obj2));
                    }
                };
                atfnVar.d = 6306;
                final eqgl b = dqmr.b(dfeaVar.ji(atfnVar.a()));
                f = eqdl.f(this.n.b(400, new ekww() { // from class: dfbj
                    @Override // defpackage.ekww
                    public final Object lK() {
                        auad auadVar = ConsentChimeraActivity.j;
                        return eqgl.this;
                    }
                }), new ekut() { // from class: dfbk
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        String str = ((RecordConsentByConsentResultResponse) obj).b;
                        ekvl.y(str);
                        ConsentChimeraActivity.this.k(str);
                        return ektg.a;
                    }
                }, this.l);
            } else {
                f = eqdl.f(this.n.b(400, new ekww() { // from class: dfbl
                    @Override // defpackage.ekww
                    public final Object lK() {
                        final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                        return consentChimeraActivity.k.submit(new Callable() { // from class: dfbp
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                                TokenRequest tokenRequest3 = new TokenRequest(consentChimeraActivity2.q.a(), consentChimeraActivity2.q.a);
                                tokenRequest3.f(consentChimeraActivity2.q.b());
                                tokenRequest3.d(aczm.GRANTED);
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
                                    aczm a3 = consentResult2.a();
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
                }), new ekut() { // from class: dfbm
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ConsentChimeraActivity.this.k(((TokenResponse) obj).d);
                        return ektg.a;
                    }
                }, this.l);
            }
        } else if (i == 200) {
            q();
            f = eqdl.f(this.n.b(200, new ekww() { // from class: dfar
                @Override // defpackage.ekww
                public final Object lK() {
                    final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    return consentChimeraActivity.k.submit(new Callable() { // from class: dfam
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                            consentChimeraActivity2.n();
                            final TokenResponse tokenResponse2 = consentChimeraActivity2.s;
                            ekvl.y(tokenResponse2);
                            ConsentChimeraActivity.p(new Runnable() { // from class: dfay
                                @Override // java.lang.Runnable
                                public final void run() {
                                    auad auadVar = ConsentChimeraActivity.j;
                                    TokenResponse tokenResponse3 = TokenResponse.this;
                                    auadVar.m("Token response: %s, resolutionUrl=%s.", tokenResponse3.a().ak, tokenResponse3.z.d);
                                }
                            });
                            BrowserResolutionCookie[] browserResolutionCookieArr = tokenResponse2.z.e;
                            if (browserResolutionCookieArr == null) {
                                ConsentChimeraActivity.p(new Runnable() { // from class: dfaz
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConsentChimeraActivity.j.m("null browser cookies in tokenResponse.", new Object[0]);
                                    }
                                });
                            } else {
                                for (BrowserResolutionCookie browserResolutionCookie : browserResolutionCookieArr) {
                                    if (TextUtils.isEmpty(browserResolutionCookie.c) || TextUtils.isEmpty(browserResolutionCookie.a) || TextUtils.isEmpty(browserResolutionCookie.b)) {
                                        ConsentChimeraActivity.p(new Runnable() { // from class: dfba
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ConsentChimeraActivity.j.m("Invalid browser resolution cookie.", new Object[0]);
                                            }
                                        });
                                    } else {
                                        final String str = browserResolutionCookie.c;
                                        ekvl.y(str);
                                        String a3 = wjn.a(str, Boolean.valueOf(browserResolutionCookie.f));
                                        String b2 = wjn.b(browserResolutionCookie.a, browserResolutionCookie.b, browserResolutionCookie.c, browserResolutionCookie.d, Boolean.valueOf(browserResolutionCookie.g), Boolean.valueOf(browserResolutionCookie.f), Long.valueOf(browserResolutionCookie.e));
                                        ConsentChimeraActivity.p(new Runnable() { // from class: dfbb
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                ConsentChimeraActivity.j.m("Setting browser resolution cookie for domain: ".concat(str), new Object[0]);
                                            }
                                        });
                                        consentChimeraActivity2.m.setCookie(a3, b2);
                                    }
                                }
                            }
                            if (fmxk.a.lK().e() && tokenResponse2.z.f) {
                                ConsentChimeraActivity.p(new Runnable() { // from class: dfbc
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConsentChimeraActivity.j.m("Skip populating WebLogin cookies", new Object[0]);
                                    }
                                });
                                return elpp.a;
                            }
                            ConsentChimeraActivity.p(new Runnable() { // from class: dfbd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ConsentChimeraActivity.j.m("Setting cookies to resolution url=%s", TokenResponse.this.z.d);
                                }
                            });
                            return new wkt(consentChimeraActivity2).b(consentChimeraActivity2.q.a(), tokenResponse2.z.d);
                        }
                    });
                }
            }), new ekuv(ekvi.j(201)), this.l);
        } else if (i == 201) {
            final dfaj dfajVar = (dfaj) getSupportFragmentManager().h("browser_consent");
            TokenResponse tokenResponse2 = this.s;
            ekvl.y(tokenResponse2);
            if (dfajVar == null) {
                final String str = tokenResponse2.z.d;
                if (fuwn.f()) {
                    str = booh.b(str, getResources());
                }
                p(new Runnable() { // from class: dfbs
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentChimeraActivity.j.m("starting webivew with resolution url=%s", str);
                    }
                });
                Account a3 = this.q.a();
                dfaj dfajVar2 = new dfaj();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("selected_account", a3);
                bundle2.putString("url", str);
                dfajVar2.setArguments(bundle2);
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.z(R.id.content, dfajVar2, "browser_consent");
                bpVar.a();
                dfajVar = dfajVar2;
            } else {
                p(new Runnable() { // from class: dfbu
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConsentChimeraActivity.j.m("fragment with tag=%s already present", "browser_consent");
                    }
                });
            }
            f = eqdl.f(this.n.b(201, new ekww() { // from class: dfbe
                @Override // defpackage.ekww
                public final Object lK() {
                    auad auadVar = ConsentChimeraActivity.j;
                    return dfaj.this.b;
                }
            }), new ekut() { // from class: dfbf
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ekvi ekviVar = (ekvi) obj;
                    boolean h = ekviVar.h();
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    if (h) {
                        consentChimeraActivity.t = new ConsentResult(adau.SUCCESS, aczm.GRANTED, (String) ekviVar.c());
                        return ekvi.j(400);
                    }
                    ConsentChimeraActivity.p(new Runnable() { // from class: dfbq
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConsentChimeraActivity.j.m("In step=%d, No consent received from the webview", 201);
                        }
                    });
                    consentChimeraActivity.a(4, "");
                    return ektg.a;
                }
            }, this.l);
        } else if (i == 500) {
            final Account a4 = this.q.a();
            TokenResponse tokenResponse3 = this.s;
            final String str2 = tokenResponse3 != null ? tokenResponse3.v : "dmStatus";
            f = eqdl.g(eqdl.f(eqgb.h(this.k.submit(new Callable() { // from class: dfav
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(auqx.u(ConsentChimeraActivity.this, a4.name));
                }
            })), new ekut() { // from class: dfaw
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    Bundle bundle3 = Bundle.EMPTY;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    return ekvi.i(atmp.c(ConsentChimeraActivity.this, a4, false, false, bundle3, false, null, true, str2, booleanValue, 1, Bundle.EMPTY, false));
                }
            }, eqex.a), new eqdv() { // from class: dfbv
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    ekvi ekviVar = (ekvi) obj;
                    boolean h = ekviVar.h();
                    final ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    if (h) {
                        return eqdl.f(consentChimeraActivity.o.b(500, (Intent) ekviVar.c()), new ekut() { // from class: dfbw
                            @Override // defpackage.ekut
                            public final Object apply(Object obj2) {
                                ConsentChimeraActivity consentChimeraActivity2 = ConsentChimeraActivity.this;
                                consentChimeraActivity2.n.d(500);
                                int i2 = ((bojo) obj2).a;
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
                                    return ektg.a;
                                }
                                if (fuwh.a.lK().b()) {
                                    consentChimeraActivity2.a(4, "user canceled");
                                    return ektg.a;
                                }
                                return ekvi.j(0);
                            }
                        }, consentChimeraActivity.l);
                    }
                    consentChimeraActivity.a(6, "Device management is not supported");
                    return eqgc.i(ektg.a);
                }
            }, this.l);
        } else {
            if (i != 501) {
                throw new IllegalStateException(String.format("Unknown consent step: %d", Integer.valueOf(i)));
            }
            f = eqdl.f(this.o.b(501, bojc.a(this, this.q.a())), new ekut() { // from class: dfap
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                    consentChimeraActivity.n.d(501);
                    if (((bojo) obj).a == -1) {
                        return ekvi.j(0);
                    }
                    consentChimeraActivity.a(4, "Error setting up the lock screen");
                    return ektg.a;
                }
            }, this.l);
        }
        eqgc.t(f, new dfce(this, System.currentTimeMillis()), this.l);
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        dfaj dfajVar = (dfaj) getSupportFragmentManager().h("browser_consent");
        if (dfajVar != null) {
            WebView webView = dfajVar.c;
            if (webView != null && webView.canGoBack()) {
                dfajVar.c.goBack();
            } else {
                a(4, "");
                super.onBackPressed();
            }
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setTheme(com.google.android.gms.R.style.Identity_Theme_DayNight_NoActionBar_Dialog_MinWidth);
        getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.u = bonh.b(this, null);
        this.m = getPackageManager().hasSystemFeature("android.software.webview") ? CookieManager.getInstance() : new dfdf();
        this.l = new boju(new caqj(Looper.getMainLooper()));
        this.n = bojs.a(this);
        this.o = bojr.a(this);
        this.p = new acyw(this);
        if (bundle != null) {
            this.r = bundle.getInt("consent_step", 0);
            if (bundle.containsKey("token_response")) {
                byte[] byteArray = bundle.getByteArray("token_response");
                ekvl.y(byteArray);
                this.s = (TokenResponse) atzs.a(byteArray, TokenResponse.CREATOR);
            }
            if (bundle.containsKey("consent_result")) {
                this.t = (ConsentResult) bundle.getParcelable("consent_result");
            }
            this.C = bundle.getString("SIGN_IN_PACKAGE_NAME");
            if (bundle.containsKey("SIGN_IN_SCOPE_ARRAY")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("SIGN_IN_SCOPE_ARRAY");
                ekvl.y(parcelableArray);
                this.B = eles.k(parcelableArray).l(new ekut() { // from class: dfbx
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        auad auadVar = ConsentChimeraActivity.j;
                        return (Scope) ((Parcelable) obj);
                    }
                }).p();
            }
            Bundle bundle2 = bundle.getBundle("sign_in_options");
            ekvl.y(bundle2);
            this.v = dfab.a(bundle2).b();
        } else {
            this.r = 0;
            this.s = null;
            this.t = null;
            this.C = getIntent().getStringExtra("SIGN_IN_PACKAGE_NAME");
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("SIGN_IN_SCOPE_ARRAY");
            if (parcelableArrayExtra != null) {
                this.B = eles.k(parcelableArrayExtra).l(new ekut() { // from class: dfby
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        auad auadVar = ConsentChimeraActivity.j;
                        return (Scope) ((Parcelable) obj);
                    }
                }).p();
            }
            Bundle bundleExtra = getIntent().getBundleExtra("sign_in_options");
            dfab a = bundleExtra != null ? dfab.a(bundleExtra) : new dfab();
            dfac b = a.b();
            this.v = b;
            if (b.g == null) {
                a.f = bonp.a();
                dfac b2 = a.b();
                this.v = b2;
                boni boniVar = this.u;
                String str = this.C;
                Set set = this.B;
                boniVar.a(boso.a(str, set != null ? (Scope[]) set.toArray(new Scope[0]) : null, b2));
            }
        }
        bonm.a(this, new ekwb() { // from class: dfau
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                ConsentChimeraActivity consentChimeraActivity = ConsentChimeraActivity.this;
                consentChimeraActivity.u.a(bono.b(4, (bonn) obj, consentChimeraActivity.v.g));
            }
        });
        j.d("Log Session ID: ".concat(String.valueOf(this.v.g)), new Object[0]);
        TokenRequest tokenRequest = (TokenRequest) atzs.b(getIntent(), "token_request", TokenRequest.CREATOR);
        ekvl.y(tokenRequest);
        this.q = tokenRequest;
        this.z = getIntent().getBooleanExtra("suppress_loading_ui", false);
        this.A = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("account_authenticator_response");
        if (fuwn.h()) {
            String str2 = this.C;
            Bundle a2 = this.v.a();
            a2.putString("com.google.android.gms.signin.internal.realClientPackageName", str2);
            this.w = new dfea(this, new dezz(a2));
        }
        o();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing()) {
            n();
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TokenResponse tokenResponse = this.s;
        if (tokenResponse != null) {
            bundle.putByteArray("token_response", atzs.n(tokenResponse));
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
