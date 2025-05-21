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
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.acm;
import defpackage.arxd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bmcg;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.eble;
import defpackage.eigb;
import defpackage.eiic;
import defpackage.eiid;
import defpackage.eiiw;
import defpackage.eitj;
import defpackage.eldw;
import defpackage.elef;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.iru;
import defpackage.irx;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.vqi;
import defpackage.vtj;
import defpackage.vuo;
import defpackage.vwr;
import defpackage.vws;
import defpackage.wim;
import defpackage.wio;
import defpackage.wkg;
import defpackage.wyb;
import defpackage.xul;
import defpackage.xum;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AssistedSignInChimeraActivity extends qet {
    private static final asot p = xul.a("AssistedSignInChimeraActivity");
    public vws j;
    public bmgq k;
    public String l;
    public abv m;
    public abv n;
    public abv o;
    private CredentialRequest q;
    private CallingAppInfoCompat r;
    private GetCredentialUserSelection s;

    private final void k(String str) {
        a((vuo) new wio(eigb.a).c(28453, str));
    }

    public final void a(vuo vuoVar) {
        Intent intent;
        String str;
        Account account;
        CredentialRequest credentialRequest = this.q;
        if (credentialRequest == null) {
            intent = vuoVar.b();
        } else {
            Intent intent2 = new Intent();
            Object obj = vuoVar.a;
            if (obj != null) {
                SignInCredential signInCredential = (SignInCredential) obj;
                final vqi vqiVar = new vqi(signInCredential.a);
                String str2 = signInCredential.f;
                if (TextUtils.isEmpty(str2)) {
                    vqiVar.e = "https://accounts.google.com";
                    if (credentialRequest.f) {
                        String str3 = signInCredential.b;
                        Objects.requireNonNull(vqiVar);
                        vuo.c(str3, new iru() { // from class: vuj
                            @Override // defpackage.iru
                            public final void a(Object obj2) {
                                vqi.this.a = (String) obj2;
                            }
                        });
                        String str4 = signInCredential.d;
                        Objects.requireNonNull(vqiVar);
                        vuo.c(str4, new iru() { // from class: vuk
                            @Override // defpackage.iru
                            public final void a(Object obj2) {
                                vqi.this.g = (String) obj2;
                            }
                        });
                        String str5 = signInCredential.c;
                        Objects.requireNonNull(vqiVar);
                        vuo.c(str5, new iru() { // from class: vul
                            @Override // defpackage.iru
                            public final void a(Object obj2) {
                                vqi.this.f = (String) obj2;
                            }
                        });
                        Uri uri = signInCredential.e;
                        Objects.requireNonNull(vqiVar);
                        vuo.c(uri, new iru() { // from class: vum
                            @Override // defpackage.iru
                            public final void a(Object obj2) {
                                vqi.this.b = (Uri) obj2;
                            }
                        });
                        String str6 = signInCredential.g;
                        if (str6 != null) {
                            vqiVar.c = eitj.l(new IdToken("https://accounts.google.com", str6));
                        }
                    }
                } else {
                    vqiVar.d = str2;
                }
                intent2.putExtra("com.google.android.gms.credentials.Credential", vqiVar.a());
            }
            intent = intent2;
        }
        int a = vuoVar.a();
        fecj k = vuoVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 203;
        elfbVar.b |= 8;
        vws vwsVar = this.j;
        String str7 = null;
        elef c = null;
        if (vwsVar != null) {
            FidoCredentialDetails fidoCredentialDetails = vwsVar.O;
            if (fidoCredentialDetails != null) {
                str = fidoCredentialDetails.a;
            } else {
                InternalSignInCredentialWrapper internalSignInCredentialWrapper = vwsVar.N;
                str = (internalSignInCredentialWrapper == null || (account = internalSignInCredentialWrapper.f) == null) ? null : account.name;
            }
            vws vwsVar2 = this.j;
            fecj v = eldw.a.v();
            int size = vwsVar2.E.size();
            if (!v.b.L()) {
                v.U();
            }
            fecp fecpVar = v.b;
            eldw eldwVar = (eldw) fecpVar;
            eldwVar.b |= 2;
            eldwVar.d = size;
            boolean z = vwsVar2.R;
            if (!fecpVar.L()) {
                v.U();
            }
            fecp fecpVar2 = v.b;
            eldw eldwVar2 = (eldw) fecpVar2;
            eldwVar2.b |= 4;
            eldwVar2.e = z;
            boolean z2 = vwsVar2.S;
            if (!fecpVar2.L()) {
                v.U();
            }
            fecp fecpVar3 = v.b;
            eldw eldwVar3 = (eldw) fecpVar3;
            eldwVar3.b |= 8;
            eldwVar3.f = z2;
            boolean z3 = vwsVar2.U;
            if (!fecpVar3.L()) {
                v.U();
            }
            eldw eldwVar4 = (eldw) v.b;
            eldwVar4.b |= 16;
            eldwVar4.g = z3;
            boolean w = vwsVar2.w();
            if (!v.b.L()) {
                v.U();
            }
            eldw eldwVar5 = (eldw) v.b;
            eldwVar5.b |= 32;
            eldwVar5.h = w;
            vuo vuoVar2 = (vuo) vwsVar2.m.hT();
            if (vuoVar2 != null && vuoVar2.a != null) {
                if (vwsVar2.X) {
                    c = xum.a();
                } else if (vwsVar2.O != null) {
                    c = xum.b();
                } else {
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = vwsVar2.N;
                    if (internalSignInCredentialWrapper2 != null) {
                        c = xum.c(internalSignInCredentialWrapper2);
                    }
                }
                if (c != null) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    eldw eldwVar6 = (eldw) v.b;
                    eldwVar6.c = c;
                    eldwVar6.b |= 1;
                }
            }
            if (!k.b.L()) {
                k.U();
            }
            elfb elfbVar3 = (elfb) k.b;
            eldw eldwVar7 = (eldw) v.Q();
            eldwVar7.getClass();
            elfbVar3.g = eldwVar7;
            elfbVar3.b |= 16;
            boolean z4 = vwsVar2.V;
            if (!k.b.L()) {
                k.U();
            }
            elfb elfbVar4 = (elfb) k.b;
            elfbVar4.b |= 512;
            elfbVar4.k = z4;
            str7 = str;
        }
        if (str7 != null) {
            this.k = bmgp.a(this, str7);
        }
        bmgq bmgqVar = this.k;
        fecj v2 = elfd.a.v();
        String str8 = this.l;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar4 = v2.b;
        elfd elfdVar = (elfd) fecpVar4;
        str8.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str8;
        if (!fecpVar4.L()) {
            v2.U();
        }
        fecp fecpVar5 = v2.b;
        elfd elfdVar2 = (elfd) fecpVar5;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        if (!fecpVar5.L()) {
            v2.U();
        }
        elfd elfdVar3 = (elfd) v2.b;
        elfb elfbVar5 = (elfb) k.Q();
        elfbVar5.getClass();
        elfdVar3.s = elfbVar5;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v2.Q());
        vuoVar.f(p);
        setResult(a, intent);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.k = bmgp.a(this, null);
        this.l = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) arxd.b(getIntent(), "begin_sign_in_request", BeginSignInRequest.CREATOR);
        if (beginSignInRequest == null) {
            k(wkg.a("beginSignInRequest"));
            return;
        }
        long longExtra = getIntent().getLongExtra("start_time_millis", System.currentTimeMillis());
        this.q = (CredentialRequest) arxd.b(getIntent(), "credential_request", CredentialRequest.CREATOR);
        GetCredentialUserSelection getCredentialUserSelection = (GetCredentialUserSelection) arxd.b(getIntent(), "get_credential_user_selection", GetCredentialUserSelection.CREATOR);
        this.s = getCredentialUserSelection;
        if (getCredentialUserSelection != null) {
            k(wkg.a("providerGetCredentialRequest"));
        }
        ChromeOptions chromeOptions = (ChromeOptions) arxd.b(getIntent(), "chrome_option", ChromeOptions.CREATOR);
        wim.a(this, beginSignInRequest.e);
        super.onCreate(bundle);
        getContainerActivity();
        int i = eble.a;
        bmgu.a(this, new eiiw() { // from class: vsi
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                AssistedSignInChimeraActivity assistedSignInChimeraActivity = AssistedSignInChimeraActivity.this;
                assistedSignInChimeraActivity.k.a(bmgw.b(204, (bmgv) obj, assistedSignInChimeraActivity.l));
            }
        });
        if (this.s == null) {
            String q = asng.q(this);
            if (q == null) {
                a((vuo) new wio(eigb.a).c(28442, "Cannot get calling package name."));
                return;
            }
            this.r = new CallingAppInfoCompat(q, SigningInfoCompat.a, null);
        } else {
            CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) arxd.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
            if (callingAppInfoCompat == null) {
                k(wkg.a("callingAppInfoCompat"));
                return;
            }
            this.r = callingAppInfoCompat;
        }
        eiid a = bmcg.a(getApplicationContext(), this.r.a);
        if (!a.h()) {
            a((vuo) new wio(eigb.a).c(28442, "Cannot get app name and icon."));
            return;
        }
        vws vwsVar = (vws) new jrh(this, new vwr(getApplication(), this.r, (irx) a.c(), beginSignInRequest, this.l, this.s, chromeOptions, longExtra)).a(vws.class);
        this.j = vwsVar;
        vwsVar.m.g(this, new jpd() { // from class: vsj
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.a((vuo) obj);
            }
        });
        this.j.p.g(this, new jpd() { // from class: vsk
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.m.b(new ace((PendingIntent) obj).a());
            }
        });
        this.j.q.g(this, new jpd() { // from class: vsl
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.n.b(new ace((PendingIntent) obj).a());
            }
        });
        this.j.r.g(this, new jpd() { // from class: vsm
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AssistedSignInChimeraActivity.this.o.b((Intent) obj);
            }
        });
        this.m = registerForActivityResult(new acm(), new abt() { // from class: vsn
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i2 = ((ActivityResult) obj).a;
                vws vwsVar2 = AssistedSignInChimeraActivity.this.j;
                boolean z = i2 == -1;
                vwsVar2.S = z;
                if (z) {
                    vwsVar2.s.f(bmiy.REFETCH_CREDENTIALS);
                } else if (vwsVar2.q()) {
                    vwsVar2.s.f(bmiy.CHOOSE_MULTI_CREDENTIAL);
                } else {
                    vwsVar2.s.k(16, "Zuul key retrieval failed.");
                }
            }
        });
        acm acmVar = new acm();
        final vws vwsVar2 = this.j;
        Objects.requireNonNull(vwsVar2);
        iru iruVar = new iru() { // from class: vso
            @Override // defpackage.iru
            public final void a(Object obj) {
                PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
                vws vwsVar3 = vws.this;
                if (vwsVar3.O == null) {
                    Iterator it = vwsVar3.C.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) it.next();
                        if (Arrays.equals(fidoCredentialDetails.a(), publicKeyCredential.e())) {
                            vwsVar3.O = fidoCredentialDetails;
                            break;
                        }
                    }
                }
                String str = publicKeyCredential.b;
                arwm.s(str);
                vwsVar3.K = new SignInCredential(str, null, null, null, null, null, null, null, publicKeyCredential);
                vwsVar3.s.g();
            }
        };
        final vws vwsVar3 = this.j;
        Objects.requireNonNull(vwsVar3);
        this.n = registerForActivityResult(acmVar, new wyb(iruVar, new iru() { // from class: vsp
            @Override // defpackage.iru
            public final void a(Object obj) {
                wya wyaVar = (wya) obj;
                PublicKeyCredential publicKeyCredential = wyaVar.b;
                vws vwsVar4 = vws.this;
                if (publicKeyCredential != null) {
                    vwsVar4.K = new SignInCredential((String) eiic.c(publicKeyCredential.b, "error"), null, null, null, null, null, null, null, publicKeyCredential);
                }
                vwsVar4.s.j(wyaVar.a);
            }
        }, 28451));
        this.o = registerForActivityResult(new acl(), new abt() { // from class: vsq
            @Override // defpackage.abt
            public final void jq(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                int i2 = activityResult.a;
                Intent intent = activityResult.b;
                vws vwsVar4 = AssistedSignInChimeraActivity.this.j;
                try {
                    vwsVar4.M = FullScreenConsentChimeraActivity.a(i2, intent);
                    vwsVar4.s.f(bmiy.COMPLETE_SIGN_IN);
                } catch (bmeo e) {
                    vwsVar4.s.j(e);
                }
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("AssistedSignInDialogFragment") == null) {
            new vtj().show(supportFragmentManager, "AssistedSignInDialogFragment");
        }
    }
}
