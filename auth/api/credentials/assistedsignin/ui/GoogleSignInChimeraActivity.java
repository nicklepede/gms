package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.auth.api.credentials.assistedsignin.ui.GoogleSignInChimeraActivity;
import com.google.android.gms.auth.api.credentials.fullscreenconsent.ui.FullScreenConsentChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.arxd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bmcg;
import defpackage.bmeo;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bmhi;
import defpackage.dodi;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiiw;
import defpackage.eldc;
import defpackage.elde;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.irx;
import defpackage.isd;
import defpackage.iyn;
import defpackage.iyt;
import defpackage.iyy;
import defpackage.iyz;
import defpackage.izt;
import defpackage.jcd;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.vty;
import defpackage.vuo;
import defpackage.vxt;
import defpackage.vxu;
import defpackage.wim;
import defpackage.wio;
import defpackage.wkg;
import defpackage.wtc;
import defpackage.wxz;
import defpackage.xul;
import defpackage.yuz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleSignInChimeraActivity extends qet {
    private static final asot o = xul.b("GoogleSignInChimeraActivity");
    public vxu j;
    public bmgq k;
    public String l;
    public isd m;
    public abv n;
    private yuz p;
    private CallingAppInfoCompat q;

    public final void a(vuo vuoVar) {
        iyn dodiVar;
        Account account;
        vuoVar.f(o);
        int i = 0;
        r3 = false;
        boolean z = false;
        if (this.q == null) {
            setResult(vuoVar.a(), vuoVar.b());
            vxu vxuVar = this.j;
            if (vxuVar != null && vxuVar.v) {
                z = true;
            }
            bmgq bmgqVar = this.k;
            if (vxuVar != null && (account = vxuVar.p) != null) {
                bmgqVar = bmgp.b(this, account.name);
            }
            fecj v = elfd.a.v();
            String str = this.l;
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            elfd elfdVar = (elfd) fecpVar;
            str.getClass();
            elfdVar.b = 2 | elfdVar.b;
            elfdVar.e = str;
            if (!fecpVar.L()) {
                v.U();
            }
            elfd elfdVar2 = (elfd) v.b;
            elfdVar2.d = 17;
            elfdVar2.b = 1 | elfdVar2.b;
            fecj k = vuoVar.k();
            if (!k.b.L()) {
                k.U();
            }
            elfb elfbVar = (elfb) k.b;
            elfb elfbVar2 = elfb.a;
            elfbVar.b |= 512;
            elfbVar.k = z;
            if (!k.b.L()) {
                k.U();
            }
            elfb elfbVar3 = (elfb) k.b;
            elfbVar3.f = 204;
            elfbVar3.b |= 8;
            if (!v.b.L()) {
                v.U();
            }
            elfd elfdVar3 = (elfd) v.b;
            elfb elfbVar4 = (elfb) k.Q();
            elfbVar4.getClass();
            elfdVar3.s = elfbVar4;
            elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            bmgqVar.a((elfd) v.Q());
        } else {
            eiid eiidVar = vuoVar.c;
            if (eiidVar.h()) {
                ((Integer) eiidVar.c()).intValue();
            } else {
                i = -1;
            }
            Intent intent = new Intent();
            if (vuoVar.g()) {
                SignInCredential signInCredential = (SignInCredential) vuoVar.a;
                String str2 = signInCredential.f;
                if (str2 != null) {
                    String str3 = signInCredential.a;
                    Bundle bundle = new Bundle();
                    bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
                    bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
                    dodiVar = new iyy(str2, bundle);
                } else {
                    PublicKeyCredential publicKeyCredential = signInCredential.i;
                    if (publicKeyCredential != null) {
                        dodiVar = new iyz(publicKeyCredential.d().toString());
                    } else {
                        String str4 = signInCredential.g;
                        if (str4 == null) {
                            throw new IllegalArgumentException("Invalid SignInCredential.");
                        }
                        dodiVar = new dodi(signInCredential.a, str4, signInCredential.b, signInCredential.d, signInCredential.c, signInCredential.e, signInCredential.h);
                    }
                }
                iyt iytVar = new iyt(dodiVar);
                jcd.d(intent, iytVar);
            } else {
                bmeo bmeoVar = vuoVar.b;
                izt iztVar = bmeoVar == null ? null : (izt) wtc.a.a(bmeoVar);
                jcd.c(intent, iztVar);
            }
            setResult(i, intent);
            fecj v2 = eldc.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            eldc eldcVar = (eldc) v2.b;
            eldcVar.c = 2;
            eldcVar.b |= 1;
            wxz.a(v2, this.q);
            wxz.b(v2, vuoVar.b);
            fecj v3 = elde.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fecp fecpVar2 = v3.b;
            elde eldeVar = (elde) fecpVar2;
            eldeVar.c = 4;
            eldeVar.b |= 1;
            vxu vxuVar2 = this.j;
            if (vxuVar2 != null) {
                boolean z2 = vxuVar2.v;
                if (!fecpVar2.L()) {
                    v3.U();
                }
                elde eldeVar2 = (elde) v3.b;
                eldeVar2.b |= 2;
                eldeVar2.d = z2;
            }
            if (!v2.b.L()) {
                v2.U();
            }
            eldc eldcVar2 = (eldc) v2.b;
            elde eldeVar3 = (elde) v3.Q();
            eldeVar3.getClass();
            eldcVar2.l = eldeVar3;
            eldcVar2.b |= 4096;
            bmgq bmgqVar2 = this.k;
            fecj v4 = elfd.a.v();
            String str5 = this.l;
            if (!v4.b.L()) {
                v4.U();
            }
            fecp fecpVar3 = v4.b;
            elfd elfdVar4 = (elfd) fecpVar3;
            str5.getClass();
            elfdVar4.b = 2 | elfdVar4.b;
            elfdVar4.e = str5;
            if (!fecpVar3.L()) {
                v4.U();
            }
            fecp fecpVar4 = v4.b;
            elfd elfdVar5 = (elfd) fecpVar4;
            elfdVar5.d = 26;
            elfdVar5.b = 1 | elfdVar5.b;
            if (!fecpVar4.L()) {
                v4.U();
            }
            elfd elfdVar6 = (elfd) v4.b;
            eldc eldcVar3 = (eldc) v2.Q();
            eldcVar3.getClass();
            elfdVar6.A = eldcVar3;
            elfdVar6.b |= 33554432;
            bmgqVar2.a((elfd) v4.Q());
        }
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.k = bmgp.a(this, null);
        Intent intent = getIntent();
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) arxd.b(intent, "get_sign_in_intent_request", GetSignInIntentRequest.CREATOR);
        if (getSignInIntentRequest == null) {
            this.l = bmgx.a();
            a((vuo) new wio(eigb.a).c(28453, wkg.a("getSignInIntentRequest")));
            return;
        }
        wim.a(this, getSignInIntentRequest.f);
        super.onCreate(bundle);
        this.l = getSignInIntentRequest.c;
        bmgu.a(this, new eiiw() { // from class: vtk
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                GoogleSignInChimeraActivity googleSignInChimeraActivity = GoogleSignInChimeraActivity.this;
                googleSignInChimeraActivity.k.a(bmgw.b(205, (bmgv) obj, googleSignInChimeraActivity.l));
            }
        });
        this.q = (CallingAppInfoCompat) arxd.b(intent, "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        this.n = registerForActivityResult(new acl(), new abt() { // from class: vtl
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                Intent intent2 = activityResult.b;
                vxu vxuVar = GoogleSignInChimeraActivity.this.j;
                try {
                    vxuVar.x = FullScreenConsentChimeraActivity.a(i, intent2);
                    vxuVar.v = true;
                    vxuVar.k.f(bmji.RECORD_CONSENT_GRANT);
                } catch (bmeo e) {
                    vxuVar.k.j(e);
                }
            }
        });
        CallingAppInfoCompat callingAppInfoCompat = this.q;
        String q = callingAppInfoCompat == null ? asng.q(this) : callingAppInfoCompat.a;
        if (q == null) {
            a((vuo) new wio(eigb.a).c(28442, "Cannot get calling package name."));
            return;
        }
        eiid a = bmcg.a(getApplicationContext(), q);
        if (!a.h()) {
            a((vuo) new wio(eigb.a).c(28442, "Cannot get app name and icon."));
            return;
        }
        vxu vxuVar = (vxu) new jrh(this, new vxt(getApplication(), q, getSignInIntentRequest, (CharSequence) ((irx) a.c()).a, (Bitmap) ((irx) a.c()).b)).a(vxu.class);
        this.j = vxuVar;
        vxuVar.h.g(this, new jpd() { // from class: vtm
            @Override // defpackage.jpd
            public final void a(Object obj) {
                GoogleSignInChimeraActivity googleSignInChimeraActivity = GoogleSignInChimeraActivity.this;
                Object a2 = googleSignInChimeraActivity.m.a();
                bp bpVar = new bp(googleSignInChimeraActivity.getSupportFragmentManager());
                bpVar.v((dg) a2, "reauth_account");
                bpVar.d();
                ((yuy) a2).y();
            }
        });
        this.j.i.g(this, new jpd() { // from class: vtn
            @Override // defpackage.jpd
            public final void a(Object obj) {
                GoogleSignInChimeraActivity.this.a((vuo) obj);
            }
        });
        this.j.j.g(this, new jpd() { // from class: vto
            @Override // defpackage.jpd
            public final void a(Object obj) {
                GoogleSignInChimeraActivity.this.n.b((Intent) obj);
            }
        });
        this.m = new isd() { // from class: vtp
            @Override // defpackage.isd
            public final Object a() {
                GoogleSignInChimeraActivity googleSignInChimeraActivity = GoogleSignInChimeraActivity.this;
                vxu vxuVar2 = googleSignInChimeraActivity.j;
                return yuy.x(vxuVar2.p, 6, vxuVar2.a, googleSignInChimeraActivity.l);
            }
        };
        yuz yuzVar = (yuz) new jrh(this).a(yuz.class);
        this.p = yuzVar;
        bmhi bmhiVar = yuzVar.a;
        final vxu vxuVar2 = this.j;
        Objects.requireNonNull(vxuVar2);
        bmhiVar.g(this, new jpd() { // from class: vtq
            @Override // defpackage.jpd
            public final void a(Object obj) {
                int i = ((Status) obj).i;
                vxu vxuVar3 = vxu.this;
                if (i == 0) {
                    vxuVar3.k.f(bmji.FETCH_SELECTED_ACCOUNT_DETAILS);
                } else {
                    vxuVar3.k.k(16, "Account reauth failed.");
                }
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("GoogleSignInDialogFragment") == null) {
            new vty().show(supportFragmentManager, "GoogleSignInDialogFragment");
        }
    }
}
