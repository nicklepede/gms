package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.assistedsignin.ui.AssistedSignInChimeraActivity;
import com.google.android.gms.auth.api.credentials.fullscreenconsent.ui.FullScreenConsentChimeraActivity;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.auth.api.identity.GetCredentialUserSelection;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aby;
import defpackage.aca;
import defpackage.acq;
import defpackage.acr;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.boiy;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.edxt;
import defpackage.ektg;
import defpackage.ekvh;
import defpackage.ekvi;
import defpackage.ekwb;
import defpackage.elgo;
import defpackage.enrj;
import defpackage.enrs;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.itk;
import defpackage.itn;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.xmj;
import defpackage.xpl;
import defpackage.xqq;
import defpackage.xsv;
import defpackage.xsw;
import defpackage.yes;
import defpackage.yeu;
import defpackage.ygq;
import defpackage.yuv;
import defpackage.zsi;
import defpackage.zsj;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AssistedSignInChimeraActivity extends rxx {
    private static final ausn p = zsi.a("AssistedSignInChimeraActivity");
    public xsw j;
    public boni k;
    public String l;
    public aca m;
    public aca n;
    public aca o;
    private CredentialRequest q;
    private CallingAppInfoCompat r;
    private GetCredentialUserSelection s;

    private final void k(String str) {
        a((xqq) new yeu(ektg.a).c(28453, str));
    }

    public final void a(xqq xqqVar) {
        Intent intent;
        String str;
        Account account;
        CredentialRequest credentialRequest = this.q;
        if (credentialRequest == null) {
            intent = xqqVar.b();
        } else {
            Intent intent2 = new Intent();
            Object obj = xqqVar.a;
            if (obj != null) {
                SignInCredential signInCredential = (SignInCredential) obj;
                final xmj xmjVar = new xmj(signInCredential.a);
                String str2 = signInCredential.f;
                if (TextUtils.isEmpty(str2)) {
                    xmjVar.e = "https://accounts.google.com";
                    if (credentialRequest.f) {
                        String str3 = signInCredential.b;
                        Objects.requireNonNull(xmjVar);
                        xqq.c(str3, new itk() { // from class: xql
                            @Override // defpackage.itk
                            public final void a(Object obj2) {
                                xmj.this.a = (String) obj2;
                            }
                        });
                        String str4 = signInCredential.d;
                        Objects.requireNonNull(xmjVar);
                        xqq.c(str4, new itk() { // from class: xqm
                            @Override // defpackage.itk
                            public final void a(Object obj2) {
                                xmj.this.g = (String) obj2;
                            }
                        });
                        String str5 = signInCredential.c;
                        Objects.requireNonNull(xmjVar);
                        xqq.c(str5, new itk() { // from class: xqn
                            @Override // defpackage.itk
                            public final void a(Object obj2) {
                                xmj.this.f = (String) obj2;
                            }
                        });
                        Uri uri = signInCredential.e;
                        Objects.requireNonNull(xmjVar);
                        xqq.c(uri, new itk() { // from class: xqo
                            @Override // defpackage.itk
                            public final void a(Object obj2) {
                                xmj.this.b = (Uri) obj2;
                            }
                        });
                        String str6 = signInCredential.g;
                        if (str6 != null) {
                            xmjVar.c = elgo.l(new IdToken("https://accounts.google.com", str6));
                        }
                    }
                } else {
                    xmjVar.d = str2;
                }
                intent2.putExtra("com.google.android.gms.credentials.Credential", xmjVar.a());
            }
            intent = intent2;
        }
        int a = xqqVar.a();
        fgrc l = xqqVar.l();
        if (!l.b.L()) {
            l.U();
        }
        enso ensoVar = (enso) l.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 203;
        ensoVar.b |= 8;
        xsw xswVar = this.j;
        String str7 = null;
        enrs c = null;
        if (xswVar != null) {
            FidoCredentialDetails fidoCredentialDetails = xswVar.P;
            if (fidoCredentialDetails != null) {
                str = fidoCredentialDetails.a;
            } else {
                InternalSignInCredentialWrapper internalSignInCredentialWrapper = xswVar.O;
                str = (internalSignInCredentialWrapper == null || (account = internalSignInCredentialWrapper.f) == null) ? null : account.name;
            }
            xsw xswVar2 = this.j;
            fgrc v = enrj.a.v();
            int size = xswVar2.F.size();
            if (!v.b.L()) {
                v.U();
            }
            fgri fgriVar = v.b;
            enrj enrjVar = (enrj) fgriVar;
            enrjVar.b |= 2;
            enrjVar.d = size;
            boolean z = xswVar2.S;
            if (!fgriVar.L()) {
                v.U();
            }
            fgri fgriVar2 = v.b;
            enrj enrjVar2 = (enrj) fgriVar2;
            enrjVar2.b |= 4;
            enrjVar2.e = z;
            boolean z2 = xswVar2.T;
            if (!fgriVar2.L()) {
                v.U();
            }
            fgri fgriVar3 = v.b;
            enrj enrjVar3 = (enrj) fgriVar3;
            enrjVar3.b |= 8;
            enrjVar3.f = z2;
            boolean z3 = xswVar2.V;
            if (!fgriVar3.L()) {
                v.U();
            }
            enrj enrjVar4 = (enrj) v.b;
            enrjVar4.b |= 16;
            enrjVar4.g = z3;
            boolean w = xswVar2.w();
            if (!v.b.L()) {
                v.U();
            }
            enrj enrjVar5 = (enrj) v.b;
            enrjVar5.b |= 32;
            enrjVar5.h = w;
            xqq xqqVar2 = (xqq) xswVar2.n.ii();
            if (xqqVar2 != null && xqqVar2.a != null) {
                if (xswVar2.Y) {
                    c = zsj.a();
                } else if (xswVar2.P != null) {
                    c = zsj.b();
                } else {
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = xswVar2.O;
                    if (internalSignInCredentialWrapper2 != null) {
                        c = zsj.c(internalSignInCredentialWrapper2);
                    }
                }
                if (c != null) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    enrj enrjVar6 = (enrj) v.b;
                    enrjVar6.c = c;
                    enrjVar6.b |= 1;
                }
            }
            if (!l.b.L()) {
                l.U();
            }
            enso ensoVar3 = (enso) l.b;
            enrj enrjVar7 = (enrj) v.Q();
            enrjVar7.getClass();
            ensoVar3.g = enrjVar7;
            ensoVar3.b |= 16;
            boolean z4 = xswVar2.W;
            if (!l.b.L()) {
                l.U();
            }
            enso ensoVar4 = (enso) l.b;
            ensoVar4.b |= 512;
            ensoVar4.k = z4;
            str7 = str;
        }
        if (str7 != null) {
            this.k = bonh.a(this, str7);
        }
        boni boniVar = this.k;
        fgrc v2 = ensq.a.v();
        String str8 = this.l;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar4 = v2.b;
        ensq ensqVar = (ensq) fgriVar4;
        str8.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str8;
        if (!fgriVar4.L()) {
            v2.U();
        }
        fgri fgriVar5 = v2.b;
        ensq ensqVar2 = (ensq) fgriVar5;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        if (!fgriVar5.L()) {
            v2.U();
        }
        ensq ensqVar3 = (ensq) v2.b;
        enso ensoVar5 = (enso) l.Q();
        ensoVar5.getClass();
        ensqVar3.s = ensoVar5;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v2.Q());
        xqqVar.f(p);
        setResult(a, intent);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.k = bonh.a(this, null);
        this.l = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) atzs.b(getIntent(), "begin_sign_in_request", BeginSignInRequest.CREATOR);
        if (beginSignInRequest == null) {
            k(ygq.a("beginSignInRequest"));
            return;
        }
        long longExtra = getIntent().getLongExtra("start_time_millis", System.currentTimeMillis());
        this.q = (CredentialRequest) atzs.b(getIntent(), "credential_request", CredentialRequest.CREATOR);
        GetCredentialUserSelection getCredentialUserSelection = (GetCredentialUserSelection) atzs.b(getIntent(), "get_credential_user_selection", GetCredentialUserSelection.CREATOR);
        this.s = getCredentialUserSelection;
        if (getCredentialUserSelection != null) {
            k(ygq.a("providerGetCredentialRequest"));
        }
        ChromeOptions chromeOptions = (ChromeOptions) atzs.b(getIntent(), "chrome_option", ChromeOptions.CREATOR);
        yes.a(this, beginSignInRequest.e);
        super.onCreate(bundle);
        getContainerActivity();
        int i = edxt.a;
        bonm.a(this, new ekwb() { // from class: xok
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                AssistedSignInChimeraActivity assistedSignInChimeraActivity = AssistedSignInChimeraActivity.this;
                assistedSignInChimeraActivity.k.a(bono.b(204, (bonn) obj, assistedSignInChimeraActivity.l));
            }
        });
        if (this.s == null) {
            String q = aura.q(this);
            if (q == null) {
                a((xqq) new yeu(ektg.a).c(28442, "Cannot get calling package name."));
                return;
            }
            this.r = new CallingAppInfoCompat(q, SigningInfoCompat.a, null);
        } else {
            CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) atzs.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
            if (callingAppInfoCompat == null) {
                k(ygq.a("callingAppInfoCompat"));
                return;
            }
            this.r = callingAppInfoCompat;
        }
        ekvi a = boiy.a(getApplicationContext(), this.r.a);
        if (!a.h()) {
            a((xqq) new yeu(ektg.a).c(28442, "Cannot get app name and icon."));
            return;
        }
        String stringExtra = getIntent().getStringExtra("caller_verification_token_id");
        xsw xswVar = (xsw) new jxw(this, new xsv(getApplication(), this.r, (itn) a.c(), beginSignInRequest, this.l, this.s, chromeOptions, longExtra, stringExtra)).a(xsw.class);
        this.j = xswVar;
        xswVar.n.g(this, new jvs() { // from class: xol
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.a((xqq) obj);
            }
        });
        this.j.q.g(this, new jvs() { // from class: xom
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.m.b(new acj((PendingIntent) obj).a());
            }
        });
        this.j.r.g(this, new jvs() { // from class: xon
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.n.b(new acj((PendingIntent) obj).a());
            }
        });
        this.j.s.g(this, new jvs() { // from class: xoo
            @Override // defpackage.jvs
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.o.b((Intent) obj);
            }
        });
        this.m = registerForActivityResult(new acr(), new aby() { // from class: xop
            @Override // defpackage.aby
            public final void jF(Object obj) {
                int i2 = ((ActivityResult) obj).a;
                xsw xswVar2 = AssistedSignInChimeraActivity.this.j;
                boolean z = i2 == -1;
                xswVar2.T = z;
                if (z) {
                    xswVar2.t.f(bopq.REFETCH_CREDENTIALS);
                } else if (xswVar2.q()) {
                    xswVar2.t.f(bopq.CHOOSE_MULTI_CREDENTIAL);
                } else {
                    xswVar2.t.k(16, "Zuul key retrieval failed.");
                }
            }
        });
        acr acrVar = new acr();
        final xsw xswVar2 = this.j;
        Objects.requireNonNull(xswVar2);
        itk itkVar = new itk() { // from class: xoq
            @Override // defpackage.itk
            public final void a(Object obj) {
                PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
                xsw xswVar3 = xsw.this;
                if (xswVar3.P == null) {
                    Iterator it = xswVar3.D.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) it.next();
                        if (Arrays.equals(fidoCredentialDetails.a(), publicKeyCredential.e())) {
                            xswVar3.P = fidoCredentialDetails;
                            break;
                        }
                    }
                }
                String str = publicKeyCredential.b;
                atzb.s(str);
                xswVar3.L = new SignInCredential(str, null, null, null, null, null, null, null, publicKeyCredential);
                xswVar3.t.g();
            }
        };
        final xsw xswVar3 = this.j;
        Objects.requireNonNull(xswVar3);
        this.n = registerForActivityResult(acrVar, new yuv(itkVar, new itk() { // from class: xor
            @Override // defpackage.itk
            public final void a(Object obj) {
                yuu yuuVar = (yuu) obj;
                PublicKeyCredential publicKeyCredential = yuuVar.b;
                xsw xswVar4 = xsw.this;
                if (publicKeyCredential != null) {
                    xswVar4.L = new SignInCredential((String) ekvh.c(publicKeyCredential.b, "error"), null, null, null, null, null, null, null, publicKeyCredential);
                }
                xswVar4.t.j(yuuVar.a);
            }
        }, 28451));
        this.o = registerForActivityResult(new acq(), new aby() { // from class: xos
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i2 = activityResult.a;
                Intent intent = activityResult.b;
                xsw xswVar4 = AssistedSignInChimeraActivity.this.j;
                try {
                    xswVar4.N = FullScreenConsentChimeraActivity.a(i2, intent);
                    xswVar4.t.f(bopq.COMPLETE_SIGN_IN);
                } catch (bolg e) {
                    xswVar4.t.j(e);
                }
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("AssistedSignInDialogFragment") == null) {
            new xpl().show(supportFragmentManager, "AssistedSignInDialogFragment");
        }
    }
}
