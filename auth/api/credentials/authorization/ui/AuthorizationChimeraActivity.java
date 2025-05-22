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
import defpackage.aaup;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.boie;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.booa;
import defpackage.ekwb;
import defpackage.ekww;
import defpackage.elgx;
import defpackage.enrl;
import defpackage.ensa;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgou;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsa;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yaz;
import defpackage.ybv;
import defpackage.ybw;
import defpackage.yby;
import defpackage.ybz;
import defpackage.yeu;
import defpackage.yew;
import defpackage.ygq;
import defpackage.zsi;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthorizationChimeraActivity extends rxx {
    private static final ausn p = zsi.a("AuthorizationChimeraActivity");
    public boni j;
    public String k;
    public String l;
    public ekww m;
    public ybz n;
    public aca o;
    private AuthorizationRequest q;
    private VerifyWithGoogleRequest r;
    private yeu s;
    private aaup t;
    private boie u;

    public final void a(yew yewVar) {
        Account account;
        yewVar.f(p);
        setResult(yewVar.a(), yewVar.b());
        fgrc l = yewVar.l();
        if (!l.b.L()) {
            l.U();
        }
        enso ensoVar = (enso) l.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 207;
        ensoVar.b |= 8;
        if (yewVar.g()) {
            SafeParcelable safeParcelable = (SafeParcelable) yewVar.a;
            if (safeParcelable instanceof AuthorizationResult) {
                fgrc v = enrl.a.v();
                List list = ((AuthorizationResult) safeParcelable).d;
                if (!v.b.L()) {
                    v.U();
                }
                enrl enrlVar = (enrl) v.b;
                fgsa fgsaVar = enrlVar.c;
                if (!fgsaVar.c()) {
                    enrlVar.c = fgri.E(fgsaVar);
                }
                fgou.E(list, enrlVar.c);
                if (!l.b.L()) {
                    l.U();
                }
                enso ensoVar3 = (enso) l.b;
                enrl enrlVar2 = (enrl) v.Q();
                enrlVar2.getClass();
                ensoVar3.h = enrlVar2;
                ensoVar3.b |= 32;
            } else if (safeParcelable instanceof VerifyWithGoogleResult) {
                fgrc v2 = ensa.a.v();
                List list2 = ((VerifyWithGoogleResult) safeParcelable).c;
                if (!v2.b.L()) {
                    v2.U();
                }
                ensa ensaVar = (ensa) v2.b;
                fgsa fgsaVar2 = ensaVar.c;
                if (!fgsaVar2.c()) {
                    ensaVar.c = fgri.E(fgsaVar2);
                }
                fgou.E(list2, ensaVar.c);
                if (!l.b.L()) {
                    l.U();
                }
                enso ensoVar4 = (enso) l.b;
                ensa ensaVar2 = (ensa) v2.Q();
                ensaVar2.getClass();
                ensoVar4.l = ensaVar2;
                ensoVar4.b |= 2048;
            }
        }
        boni boniVar = this.j;
        ybz ybzVar = this.n;
        if (ybzVar != null && (account = ybzVar.I) != null) {
            boniVar = bonh.a(this, account.name);
        }
        fgrc v3 = ensq.a.v();
        String str = this.k;
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar = v3.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v3.U();
        }
        fgri fgriVar2 = v3.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        if (!fgriVar2.L()) {
            v3.U();
        }
        ensq ensqVar3 = (ensq) v3.b;
        enso ensoVar5 = (enso) l.Q();
        ensoVar5.getClass();
        ensqVar3.s = ensoVar5;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v3.Q());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        hS().q(-1);
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        this.j = bonh.a(this, null);
        this.q = (AuthorizationRequest) atzs.b(getIntent(), "authorization_request", AuthorizationRequest.CREATOR);
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) atzs.b(getIntent(), "verify_with_google_request", VerifyWithGoogleRequest.CREATOR);
        this.r = verifyWithGoogleRequest;
        this.s = verifyWithGoogleRequest != null ? yby.c() : ybv.c();
        if (this.q == null && this.r == null) {
            this.k = bonp.a();
            a(this.s.c(28453, ygq.a("AuthorizationRequest and VerifyWithGoogleRequest")));
            return;
        }
        this.k = getIntent().getStringExtra("session_id");
        bonm.a(this, new ekwb() { // from class: yat
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                authorizationChimeraActivity.j.a(bono.b(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS, (bonn) obj, authorizationChimeraActivity.k));
            }
        });
        String q = aura.q(this);
        if (q == null) {
            a(this.s.c(28442, "Cannot get calling package name."));
            return;
        }
        this.l = q;
        this.m = new ekww() { // from class: yau
            @Override // defpackage.ekww
            public final Object lK() {
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                ybz ybzVar = authorizationChimeraActivity.n;
                return aauo.x(ybzVar.I, 7, authorizationChimeraActivity.l, ybzVar.s);
            }
        };
        this.o = registerForActivityResult(new acq(), new aby() { // from class: yav
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                Intent intent = activityResult.b;
                ybz ybzVar = AuthorizationChimeraActivity.this.n;
                try {
                    ybzVar.e(ekvi.j(FullScreenConsentChimeraActivity.a(i, intent)));
                } catch (bolg e) {
                    ((eluo) ((eluo) ((eluo) ybz.a.j()).s(e)).ai((char) 713)).x("Failed to parse consent result");
                    ybzVar.v.j(e);
                }
            }
        });
        ybz ybzVar = (ybz) new jxw(this, new ybw(this.q, this.r, this.l)).a(ybz.class);
        this.n = ybzVar;
        ybzVar.d.g(this, new jvs() { // from class: yao
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                if (authorizationChimeraActivity.getSupportFragmentManager().h("reauth_account") == null) {
                    Object lK = authorizationChimeraActivity.m.lK();
                    bp bpVar = new bp(authorizationChimeraActivity.getSupportFragmentManager());
                    bpVar.v((dg) lK, "reauth_account");
                    bpVar.d();
                    ((aauo) lK).y();
                }
            }
        });
        this.n.h.g(this, new jvs() { // from class: yap
            @Override // defpackage.jvs
            public final void a(Object obj) {
                String format = String.format(fnir.a.lK().a(), SystemProperties.get("gms.auth.sw_domain", "google.com").replace(".", "\\."));
                AuthorizationChimeraActivity authorizationChimeraActivity = AuthorizationChimeraActivity.this;
                String str = authorizationChimeraActivity.k;
                ybz ybzVar2 = authorizationChimeraActivity.n;
                authorizationChimeraActivity.o.b(yed.a(str, ybzVar2.I, ybzVar2.H, format, true));
            }
        });
        this.n.h(1);
        this.n.c.g(this, new jvs() { // from class: yaq
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthorizationChimeraActivity.this.a((yex) obj);
            }
        });
        jxw jxwVar = new jxw(this);
        aaup aaupVar = (aaup) jxwVar.a(aaup.class);
        this.t = aaupVar;
        booa booaVar = aaupVar.a;
        final ybz ybzVar2 = this.n;
        Objects.requireNonNull(ybzVar2);
        booaVar.g(this, new jvs() { // from class: yar
            @Override // defpackage.jvs
            public final void a(Object obj) {
                Status status = (Status) obj;
                int i = status.i;
                ybz ybzVar3 = ybz.this;
                if (i == 0) {
                    ybzVar3.v.f(bops.AUTH_ACCOUNT);
                } else {
                    ybzVar3.v.k(i, status.j);
                }
            }
        });
        boie boieVar = (boie) jxwVar.a(boie.class);
        this.u = boieVar;
        boieVar.b.g(this, new jvs() { // from class: yas
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AuthorizationChimeraActivity.this.n.h(2);
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("dialog") == null) {
            String str = this.l;
            elgx elgxVar = yaz.ag;
            Bundle bundle2 = new Bundle();
            bundle2.putString("calling_package", str);
            yaz yazVar = new yaz();
            yazVar.setArguments(bundle2);
            yazVar.show(supportFragmentManager, "dialog");
        }
    }
}
