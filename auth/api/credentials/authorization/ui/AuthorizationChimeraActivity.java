package com.google.android.gms.auth.api.credentials.authorization.ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemProperties;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.authorization.ui.AuthorizationChimeraActivity;
import com.google.android.gms.auth.api.credentials.fullscreenconsent.ui.FullScreenConsentChimeraActivity;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleRequest;
import com.google.android.gms.auth.api.identity.VerifyWithGoogleResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.arxd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bmbm;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bmhi;
import defpackage.eiiw;
import defpackage.eijr;
import defpackage.eits;
import defpackage.eldy;
import defpackage.elen;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.feab;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedh;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wet;
import defpackage.wfp;
import defpackage.wfq;
import defpackage.wfs;
import defpackage.wft;
import defpackage.wio;
import defpackage.wiq;
import defpackage.wkg;
import defpackage.xul;
import defpackage.yuz;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthorizationChimeraActivity extends qet {
    private static final asot p = xul.a("AuthorizationChimeraActivity");
    public bmgq j;
    public String k;
    public String l;
    public eijr m;
    public wft n;
    public abv o;
    private AuthorizationRequest q;
    private VerifyWithGoogleRequest r;
    private wio s;
    private yuz t;
    private bmbm u;

    public final void a(wiq wiqVar) {
        Account account;
        wiqVar.f(p);
        setResult(wiqVar.a(), wiqVar.b());
        fecj k = wiqVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 207;
        elfbVar.b |= 8;
        if (wiqVar.g()) {
            SafeParcelable safeParcelable = (SafeParcelable) wiqVar.a;
            if (safeParcelable instanceof AuthorizationResult) {
                fecj v = eldy.a.v();
                List list = ((AuthorizationResult) safeParcelable).d;
                if (!v.b.L()) {
                    v.U();
                }
                eldy eldyVar = (eldy) v.b;
                fedh fedhVar = eldyVar.c;
                if (!fedhVar.c()) {
                    eldyVar.c = fecp.E(fedhVar);
                }
                feab.E(list, eldyVar.c);
                if (!k.b.L()) {
                    k.U();
                }
                elfb elfbVar3 = (elfb) k.b;
                eldy eldyVar2 = (eldy) v.Q();
                eldyVar2.getClass();
                elfbVar3.h = eldyVar2;
                elfbVar3.b |= 32;
            } else if (safeParcelable instanceof VerifyWithGoogleResult) {
                fecj v2 = elen.a.v();
                List list2 = ((VerifyWithGoogleResult) safeParcelable).c;
                if (!v2.b.L()) {
                    v2.U();
                }
                elen elenVar = (elen) v2.b;
                fedh fedhVar2 = elenVar.c;
                if (!fedhVar2.c()) {
                    elenVar.c = fecp.E(fedhVar2);
                }
                feab.E(list2, elenVar.c);
                if (!k.b.L()) {
                    k.U();
                }
                elfb elfbVar4 = (elfb) k.b;
                elen elenVar2 = (elen) v2.Q();
                elenVar2.getClass();
                elfbVar4.l = elenVar2;
                elfbVar4.b |= 2048;
            }
        }
        bmgq bmgqVar = this.j;
        wft wftVar = this.n;
        if (wftVar != null && (account = wftVar.I) != null) {
            bmgqVar = bmgp.a(this, account.name);
        }
        fecj v3 = elfd.a.v();
        String str = this.k;
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar = v3.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v3.U();
        }
        fecp fecpVar2 = v3.b;
        elfd elfdVar2 = (elfd) fecpVar2;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        if (!fecpVar2.L()) {
            v3.U();
        }
        elfd elfdVar3 = (elfd) v3.b;
        elfb elfbVar5 = (elfb) k.Q();
        elfbVar5.getClass();
        elfdVar3.s = elfbVar5;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v3.Q());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        hC().q(-1);
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        this.j = bmgp.a(this, null);
        this.q = (AuthorizationRequest) arxd.b(getIntent(), "authorization_request", AuthorizationRequest.CREATOR);
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) arxd.b(getIntent(), "verify_with_google_request", VerifyWithGoogleRequest.CREATOR);
        this.r = verifyWithGoogleRequest;
        this.s = verifyWithGoogleRequest != null ? wfs.c() : wfp.c();
        if (this.q == null && this.r == null) {
            this.k = bmgx.a();
            a(this.s.c(28453, wkg.a("AuthorizationRequest and VerifyWithGoogleRequest")));
            return;
        }
        this.k = getIntent().getStringExtra("session_id");
        bmgu.a(this, new eiiw() { // from class: wen
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                authorizationChimeraActivity.j.a(bmgw.b(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS, (bmgv) obj, authorizationChimeraActivity.k));
            }
        });
        String q = asng.q(this);
        if (q == null) {
            a(this.s.c(28442, "Cannot get calling package name."));
            return;
        }
        this.l = q;
        this.m = new eijr() { // from class: weo
            @Override // defpackage.eijr
            public final Object a() {
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                wft wftVar = authorizationChimeraActivity.n;
                return yuy.x(wftVar.I, 7, authorizationChimeraActivity.l, wftVar.s);
            }
        };
        this.o = registerForActivityResult(new acl(), new abt() { // from class: wep
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                Intent intent = activityResult.b;
                wft wftVar = AuthorizationChimeraActivity.this.n;
                try {
                    wftVar.e(eiid.j(FullScreenConsentChimeraActivity.a(i, intent)));
                } catch (bmeo e) {
                    ((ejhf) ((ejhf) ((ejhf) wft.a.j()).s(e)).ah((char) 713)).x("Failed to parse consent result");
                    wftVar.v.j(e);
                }
            }
        });
        wft wftVar = (wft) new jrh(this, new wfq(this.q, this.r, this.l)).a(wft.class);
        this.n = wftVar;
        wftVar.d.g(this, new jpd() { // from class: wei
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                if (authorizationChimeraActivity.getSupportFragmentManager().h("reauth_account") == null) {
                    Object a = authorizationChimeraActivity.m.a();
                    bp bpVar = new bp(authorizationChimeraActivity.getSupportFragmentManager());
                    bpVar.v((dg) a, "reauth_account");
                    bpVar.d();
                    ((yuy) a).y();
                }
            }
        });
        this.n.h.g(this, new jpd() { // from class: wej
            @Override // defpackage.jpd
            public final void a(Object obj) {
                String format = String.format(fkrs.a.a().a(), SystemProperties.get("gms.auth.sw_domain", "google.com").replace(".", "\\."));
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                String str = authorizationChimeraActivity.k;
                wft wftVar2 = authorizationChimeraActivity.n;
                authorizationChimeraActivity.o.b(whx.a(str, wftVar2.I, wftVar2.H, format, true));
            }
        });
        this.n.h(1);
        this.n.c.g(this, new jpd() { // from class: wek
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthorizationChimeraActivity.this.a((wir) obj);
            }
        });
        jrh jrhVar = new jrh(this);
        yuz yuzVar = (yuz) jrhVar.a(yuz.class);
        this.t = yuzVar;
        bmhi bmhiVar = yuzVar.a;
        final wft wftVar2 = this.n;
        Objects.requireNonNull(wftVar2);
        bmhiVar.g(this, new jpd() { // from class: wel
            @Override // defpackage.jpd
            public final void a(Object obj) {
                Status status = (Status) obj;
                int i = status.i;
                wft wftVar3 = wft.this;
                if (i == 0) {
                    wftVar3.v.f(bmja.AUTH_ACCOUNT);
                } else {
                    wftVar3.v.k(i, status.j);
                }
            }
        });
        bmbm bmbmVar = (bmbm) jrhVar.a(bmbm.class);
        this.u = bmbmVar;
        bmbmVar.b.g(this, new jpd() { // from class: wem
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthorizationChimeraActivity.this.n.h(2);
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("dialog") == null) {
            String str = this.l;
            eits eitsVar = wet.ag;
            Bundle bundle2 = new Bundle();
            bundle2.putString("calling_package", str);
            wet wetVar = new wet();
            wetVar.setArguments(bundle2);
            wetVar.show(supportFragmentManager, "dialog");
        }
    }
}
