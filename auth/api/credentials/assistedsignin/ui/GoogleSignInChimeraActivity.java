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
import defpackage.aaup;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.boiy;
import defpackage.bolg;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.booa;
import defpackage.dqnr;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekwb;
import defpackage.enqp;
import defpackage.enqr;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.itn;
import defpackage.itt;
import defpackage.jad;
import defpackage.jaj;
import defpackage.jao;
import defpackage.jap;
import defpackage.jbj;
import defpackage.jdt;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.xqa;
import defpackage.xqq;
import defpackage.xtz;
import defpackage.xua;
import defpackage.yes;
import defpackage.yeu;
import defpackage.ygq;
import defpackage.ypq;
import defpackage.yut;
import defpackage.zsi;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleSignInChimeraActivity extends rxx {
    private static final ausn o = zsi.b("GoogleSignInChimeraActivity");
    public xua j;
    public boni k;
    public String l;
    public itt m;
    public aca n;
    private aaup p;
    private CallingAppInfoCompat q;

    public final void a(xqq xqqVar) {
        jad dqnrVar;
        Account account;
        xqqVar.f(o);
        int i = 0;
        r3 = false;
        boolean z = false;
        if (this.q == null) {
            setResult(xqqVar.a(), xqqVar.b());
            xua xuaVar = this.j;
            if (xuaVar != null && xuaVar.w) {
                z = true;
            }
            boni boniVar = this.k;
            if (xuaVar != null && (account = xuaVar.q) != null) {
                boniVar = bonh.b(this, account.name);
            }
            fgrc v = ensq.a.v();
            String str = this.l;
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            ensq ensqVar = (ensq) fgriVar;
            str.getClass();
            ensqVar.b = 2 | ensqVar.b;
            ensqVar.e = str;
            if (!fgriVar.L()) {
                v.U();
            }
            ensq ensqVar2 = (ensq) v.b;
            ensqVar2.d = 17;
            ensqVar2.b = 1 | ensqVar2.b;
            fgrc l = xqqVar.l();
            if (!l.b.L()) {
                l.U();
            }
            enso ensoVar = (enso) l.b;
            enso ensoVar2 = enso.a;
            ensoVar.b |= 512;
            ensoVar.k = z;
            if (!l.b.L()) {
                l.U();
            }
            enso ensoVar3 = (enso) l.b;
            ensoVar3.f = 204;
            ensoVar3.b |= 8;
            if (!v.b.L()) {
                v.U();
            }
            ensq ensqVar3 = (ensq) v.b;
            enso ensoVar4 = (enso) l.Q();
            ensoVar4.getClass();
            ensqVar3.s = ensoVar4;
            ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            boniVar.a((ensq) v.Q());
        } else {
            ekvi ekviVar = xqqVar.c;
            if (ekviVar.h()) {
                ((Integer) ekviVar.c()).intValue();
            } else {
                i = -1;
            }
            Intent intent = new Intent();
            if (xqqVar.g()) {
                SignInCredential signInCredential = (SignInCredential) xqqVar.a;
                String str2 = signInCredential.f;
                if (str2 != null) {
                    String str3 = signInCredential.a;
                    Bundle bundle = new Bundle();
                    bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
                    bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
                    dqnrVar = new jao(str2, bundle);
                } else {
                    PublicKeyCredential publicKeyCredential = signInCredential.i;
                    if (publicKeyCredential != null) {
                        dqnrVar = new jap(publicKeyCredential.d().toString());
                    } else {
                        String str4 = signInCredential.g;
                        if (str4 == null) {
                            throw new IllegalArgumentException("Invalid SignInCredential.");
                        }
                        dqnrVar = new dqnr(signInCredential.a, str4, signInCredential.b, signInCredential.d, signInCredential.c, signInCredential.e, signInCredential.h);
                    }
                }
                jaj jajVar = new jaj(dqnrVar);
                jdt.d(intent, jajVar);
            } else {
                bolg bolgVar = xqqVar.b;
                jbj jbjVar = bolgVar == null ? null : (jbj) ypq.a.a(bolgVar);
                jdt.c(intent, jbjVar);
            }
            setResult(i, intent);
            fgrc v2 = enqp.a.v();
            if (!v2.b.L()) {
                v2.U();
            }
            enqp enqpVar = (enqp) v2.b;
            enqpVar.c = 2;
            enqpVar.b |= 1;
            yut.a(v2, this.q);
            yut.b(v2, xqqVar.b);
            fgrc v3 = enqr.a.v();
            if (!v3.b.L()) {
                v3.U();
            }
            fgri fgriVar2 = v3.b;
            enqr enqrVar = (enqr) fgriVar2;
            enqrVar.c = 4;
            enqrVar.b |= 1;
            xua xuaVar2 = this.j;
            if (xuaVar2 != null) {
                boolean z2 = xuaVar2.w;
                if (!fgriVar2.L()) {
                    v3.U();
                }
                enqr enqrVar2 = (enqr) v3.b;
                enqrVar2.b |= 2;
                enqrVar2.d = z2;
            }
            if (!v2.b.L()) {
                v2.U();
            }
            enqp enqpVar2 = (enqp) v2.b;
            enqr enqrVar3 = (enqr) v3.Q();
            enqrVar3.getClass();
            enqpVar2.l = enqrVar3;
            enqpVar2.b |= 4096;
            boni boniVar2 = this.k;
            fgrc v4 = ensq.a.v();
            String str5 = this.l;
            if (!v4.b.L()) {
                v4.U();
            }
            fgri fgriVar3 = v4.b;
            ensq ensqVar4 = (ensq) fgriVar3;
            str5.getClass();
            ensqVar4.b = 2 | ensqVar4.b;
            ensqVar4.e = str5;
            if (!fgriVar3.L()) {
                v4.U();
            }
            fgri fgriVar4 = v4.b;
            ensq ensqVar5 = (ensq) fgriVar4;
            ensqVar5.d = 26;
            ensqVar5.b = 1 | ensqVar5.b;
            if (!fgriVar4.L()) {
                v4.U();
            }
            ensq ensqVar6 = (ensq) v4.b;
            enqp enqpVar3 = (enqp) v2.Q();
            enqpVar3.getClass();
            ensqVar6.A = enqpVar3;
            ensqVar6.b |= 33554432;
            boniVar2.a((ensq) v4.Q());
        }
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.k = bonh.a(this, null);
        Intent intent = getIntent();
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) atzs.b(intent, "get_sign_in_intent_request", GetSignInIntentRequest.CREATOR);
        if (getSignInIntentRequest == null) {
            this.l = bonp.a();
            a((xqq) new yeu(ektg.a).c(28453, ygq.a("getSignInIntentRequest")));
            return;
        }
        yes.a(this, getSignInIntentRequest.f);
        super.onCreate(bundle);
        this.l = getSignInIntentRequest.c;
        bonm.a(this, new ekwb() { // from class: xpm
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                GoogleSignInChimeraActivity googleSignInChimeraActivity = GoogleSignInChimeraActivity.this;
                googleSignInChimeraActivity.k.a(bono.b(205, (bonn) obj, googleSignInChimeraActivity.l));
            }
        });
        this.q = (CallingAppInfoCompat) atzs.b(intent, "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        this.n = registerForActivityResult(new acq(), new aby() { // from class: xpn
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                Intent intent2 = activityResult.b;
                xua xuaVar = GoogleSignInChimeraActivity.this.j;
                try {
                    xuaVar.y = FullScreenConsentChimeraActivity.a(i, intent2);
                    xuaVar.w = true;
                    xuaVar.l.f(boqb.RECORD_CONSENT_GRANT);
                } catch (bolg e) {
                    xuaVar.l.j(e);
                }
            }
        });
        CallingAppInfoCompat callingAppInfoCompat = this.q;
        String q = callingAppInfoCompat == null ? aura.q(this) : callingAppInfoCompat.a;
        if (q == null) {
            a((xqq) new yeu(ektg.a).c(28442, "Cannot get calling package name."));
            return;
        }
        ekvi a = boiy.a(getApplicationContext(), q);
        if (!a.h()) {
            a((xqq) new yeu(ektg.a).c(28442, "Cannot get app name and icon."));
            return;
        }
        xua xuaVar = (xua) new jxw(this, new xtz(getApplication(), q, getSignInIntentRequest, (CharSequence) ((itn) a.c()).a, (Bitmap) ((itn) a.c()).b, getIntent().getStringExtra("caller_verification_token_id"))).a(xua.class);
        this.j = xuaVar;
        xuaVar.i.g(this, new jvs() { // from class: xpo
            @Override // defpackage.jvs
            public final void a(Object obj) {
                GoogleSignInChimeraActivity googleSignInChimeraActivity = GoogleSignInChimeraActivity.this;
                Object a2 = googleSignInChimeraActivity.m.a();
                bp bpVar = new bp(googleSignInChimeraActivity.getSupportFragmentManager());
                bpVar.v((dg) a2, "reauth_account");
                bpVar.d();
                ((aauo) a2).y();
            }
        });
        this.j.j.g(this, new jvs() { // from class: xpp
            @Override // defpackage.jvs
            public final void a(Object obj) {
                GoogleSignInChimeraActivity.this.a((xqq) obj);
            }
        });
        this.j.k.g(this, new jvs() { // from class: xpq
            @Override // defpackage.jvs
            public final void a(Object obj) {
                GoogleSignInChimeraActivity.this.n.b((Intent) obj);
            }
        });
        this.m = new itt() { // from class: xpr
            @Override // defpackage.itt
            public final Object a() {
                GoogleSignInChimeraActivity googleSignInChimeraActivity = GoogleSignInChimeraActivity.this;
                xua xuaVar2 = googleSignInChimeraActivity.j;
                return aauo.x(xuaVar2.q, 6, xuaVar2.a, googleSignInChimeraActivity.l);
            }
        };
        aaup aaupVar = (aaup) new jxw(this).a(aaup.class);
        this.p = aaupVar;
        booa booaVar = aaupVar.a;
        final xua xuaVar2 = this.j;
        Objects.requireNonNull(xuaVar2);
        booaVar.g(this, new jvs() { // from class: xps
            @Override // defpackage.jvs
            public final void a(Object obj) {
                int i = ((Status) obj).i;
                xua xuaVar3 = xua.this;
                if (i == 0) {
                    xuaVar3.l.f(boqb.FETCH_SELECTED_ACCOUNT_DETAILS);
                } else {
                    xuaVar3.l.k(16, "Account reauth failed.");
                }
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("GoogleSignInDialogFragment") == null) {
            new xqa().show(supportFragmentManager, "GoogleSignInDialogFragment");
        }
    }
}
