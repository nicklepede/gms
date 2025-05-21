package com.google.android.gms.auth.api.credentials.credman.passwordmanager;

import android.app.PendingIntent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.passwordmanager.GooglePasswordManagerProxyChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import defpackage.abt;
import defpackage.abv;
import defpackage.acm;
import defpackage.arxd;
import defpackage.asot;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgx;
import defpackage.eigb;
import defpackage.eiic;
import defpackage.eiid;
import defpackage.eldc;
import defpackage.eldf;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wio;
import defpackage.wkg;
import defpackage.wqc;
import defpackage.wwy;
import defpackage.wwz;
import defpackage.wxz;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GooglePasswordManagerProxyChimeraActivity extends qet {
    private static final asot l = xul.b("GooglePasswordManagerProxyChimeraActivity");
    public wwz j;
    public abv k;
    private bmgq m;
    private String n;
    private CallingAppInfoCompat o;

    private final void k(String str) {
        a((wqc) new wio((eiid) eigb.a, (char[]) null).c(28453, str));
    }

    public final void a(wqc wqcVar) {
        wqcVar.f(l);
        fecj v = eldc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar = (eldc) v.b;
        eldcVar.c = 1;
        eldcVar.b |= 1;
        wxz.a(v, this.o);
        eldf eldfVar = (eldf) eldf.a.v().Q();
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar2 = (eldc) v.b;
        eldfVar.getClass();
        eldcVar2.o = eldfVar;
        eldcVar2.b |= 32768;
        wxz.b(v, wqcVar.b);
        bmgq bmgqVar = this.m;
        fecj v2 = elfd.a.v();
        String str = this.n;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfd elfdVar2 = (elfd) fecpVar2;
        elfdVar2.d = 26;
        elfdVar2.b = 1 | elfdVar2.b;
        if (!fecpVar2.L()) {
            v2.U();
        }
        elfd elfdVar3 = (elfd) v2.b;
        eldc eldcVar3 = (eldc) v.Q();
        eldcVar3.getClass();
        elfdVar3.A = eldcVar3;
        elfdVar3.b |= 33554432;
        bmgqVar.a((elfd) v2.Q());
        setResult(0, wqcVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.ThemeTranslucentDayNight);
        setContentView(R.layout.credentials_password_manager_proxy);
        this.m = bmgp.a(this, null);
        this.n = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) arxd.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(wkg.a("callingAppInfoCompat"));
            return;
        }
        this.o = callingAppInfoCompat;
        CredentialManagerAccount credentialManagerAccount = (CredentialManagerAccount) arxd.b(getIntent(), "credential_manager_account", CredentialManagerAccount.CREATOR);
        if (credentialManagerAccount == null) {
            k(wkg.a("credential_manager_account"));
            return;
        }
        wwz wwzVar = (wwz) new jrh(this, new wwy(credentialManagerAccount)).a(wwz.class);
        this.j = wwzVar;
        wwzVar.b.g(this, new jpd() { // from class: wwq
            @Override // defpackage.jpd
            public final void a(Object obj) {
                GooglePasswordManagerProxyChimeraActivity.this.a((wqc) obj);
            }
        });
        this.j.c.g(this, new jpd() { // from class: wwr
            @Override // defpackage.jpd
            public final void a(Object obj) {
                GooglePasswordManagerProxyChimeraActivity.this.k.b(new ace((PendingIntent) obj).a());
            }
        });
        this.k = registerForActivityResult(new acm(), new abt() { // from class: wws
            @Override // defpackage.abt
            public final void jq(Object obj) {
                int i = ((ActivityResult) obj).a;
                wwz wwzVar2 = GooglePasswordManagerProxyChimeraActivity.this.j;
                if (i == 0) {
                    wwzVar2.a.g();
                } else {
                    wwzVar2.a.k(16, "Password Manager had unexpected ActivityResult.");
                }
            }
        });
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        wwz wwzVar = this.j;
        if (wwzVar != null) {
            wwzVar.a.i();
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.j.a.k(16, "GooglePasswordManagerProxyActivity canceled.");
        return super.onTouchEvent(motionEvent);
    }
}
