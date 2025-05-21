package com.google.android.gms.auth.api.credentials.credman.authentication;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credman.authentication.AuthenticationChimeraActivity;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
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
import defpackage.elcx;
import defpackage.eldc;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fvbo;
import defpackage.jbe;
import defpackage.jbf;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wio;
import defpackage.wkg;
import defpackage.wps;
import defpackage.wqm;
import defpackage.wqn;
import defpackage.wxz;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthenticationChimeraActivity extends qet {
    private static final asot l = xul.b("AuthenticationChimeraActivity");
    public wqn j;
    public abv k;
    private bmgq m;
    private String n;
    private CallingAppInfoCompat o;
    private jbf p;

    private final void k(String str) {
        a((wps) new wio((eiid) eigb.a, (byte[]) null).c(28453, str));
    }

    public final void a(wps wpsVar) {
        wpsVar.f(l);
        fecj v = eldc.a.v();
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar = (eldc) v.b;
        eldcVar.c = 1;
        eldcVar.b |= 1;
        wxz.a(v, this.o);
        wxz.b(v, wpsVar.b);
        fecj v2 = elcx.a.v();
        wqn wqnVar = this.j;
        if (wqnVar != null) {
            boolean z = wqnVar.j;
            if (!v2.b.L()) {
                v2.U();
            }
            elcx elcxVar = (elcx) v2.b;
            elcxVar.b |= 1;
            elcxVar.c = z;
        }
        if (!v.b.L()) {
            v.U();
        }
        eldc eldcVar2 = (eldc) v.b;
        elcx elcxVar2 = (elcx) v2.Q();
        elcxVar2.getClass();
        eldcVar2.m = elcxVar2;
        eldcVar2.b |= 8192;
        bmgq bmgqVar = this.m;
        fecj v3 = elfd.a.v();
        String str = this.n;
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
        elfdVar2.d = 26;
        elfdVar2.b = 1 | elfdVar2.b;
        if (!fecpVar2.L()) {
            v3.U();
        }
        elfd elfdVar3 = (elfd) v3.b;
        eldc eldcVar3 = (eldc) v.Q();
        eldcVar3.getClass();
        elfdVar3.A = eldcVar3;
        elfdVar3.b |= 33554432;
        bmgqVar.a((elfd) v3.Q());
        setResult(wpsVar.a(), wpsVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(R.style.Theme_GisHidden);
        this.m = bmgp.a(this, null);
        this.n = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        CallingAppInfoCompat callingAppInfoCompat = (CallingAppInfoCompat) arxd.b(getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if (callingAppInfoCompat == null) {
            k(wkg.a("callingAppInfoCompat"));
            return;
        }
        this.o = callingAppInfoCompat;
        String stringExtra = getIntent().getStringExtra("credential_provider_account_name");
        if (stringExtra == null) {
            k(wkg.a("accountName"));
            return;
        }
        Intent intent = getIntent();
        fvbo.f(intent, "intent");
        fvbo.f(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST");
        jbf b = bundleExtra != null ? jbe.b(bundleExtra) : null;
        this.p = b;
        if (b == null) {
            k(wkg.a("beginGetCredentialRequest"));
            return;
        }
        wqn wqnVar = (wqn) new jrh(this, new wqm(this.n, this.o, b, stringExtra)).a(wqn.class);
        this.j = wqnVar;
        wqnVar.h.g(this, new jpd() { // from class: wqd
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthenticationChimeraActivity.this.a((wps) obj);
            }
        });
        this.j.g.g(this, new jpd() { // from class: wqe
            @Override // defpackage.jpd
            public final void a(Object obj) {
                AuthenticationChimeraActivity.this.k.b(new ace((PendingIntent) obj).a());
            }
        });
        this.k = registerForActivityResult(new acm(), new abt() { // from class: wqf
            @Override // defpackage.abt
            public final void jq(Object obj) {
                boolean z = ((ActivityResult) obj).a == -1;
                wqn wqnVar2 = AuthenticationChimeraActivity.this.j;
                wqnVar2.j = z;
                wqnVar2.f.f(2);
            }
        });
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        wqn wqnVar = this.j;
        if (wqnVar != null) {
            wqnVar.f.i();
        }
    }
}
