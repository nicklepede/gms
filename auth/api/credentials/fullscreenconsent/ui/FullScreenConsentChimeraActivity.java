package com.google.android.gms.auth.api.credentials.fullscreenconsent.ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.api.credentials.fullscreenconsent.ui.FullScreenConsentChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bmeo;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgx;
import defpackage.bp;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wkg;
import defpackage.xtn;
import defpackage.xto;
import defpackage.xtp;
import defpackage.xts;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FullScreenConsentChimeraActivity extends qet {
    private ResolutionData j;
    private Account k;
    private String l;
    private String m;
    private xtp n;
    private bmgq o;

    public static String a(int i, Intent intent) {
        if (i == 0) {
            throw bmeo.f(16, "Cancelled by user.");
        }
        if (intent == null) {
            throw bmeo.h(28453, "intent cannot be null. Activity result code: [%s]", Integer.valueOf(i));
        }
        bmeo bmeoVar = (bmeo) intent.getSerializableExtra("internal_exception");
        if (bmeoVar != null) {
            throw bmeoVar;
        }
        String stringExtra = intent.getStringExtra("full_screen_consent_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw bmeo.f(28453, wkg.a("full_screen_consent_result"));
    }

    public final void k(xtn xtnVar) {
        bmgq bmgqVar = this.o;
        Account account = this.k;
        if (account != null) {
            bmgqVar = bmgp.a(this, account.name);
        }
        fecj v = elfd.a.v();
        String str = this.l;
        if (str == null) {
            str = bmgx.a();
        }
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elfd elfdVar = (elfd) fecpVar;
        str.getClass();
        elfdVar.b |= 2;
        elfdVar.e = str;
        if (!fecpVar.L()) {
            v.U();
        }
        elfd elfdVar2 = (elfd) v.b;
        elfdVar2.d = 17;
        elfdVar2.b |= 1;
        fecj k = xtnVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 212;
        elfbVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        elfd elfdVar3 = (elfd) v.b;
        elfb elfbVar3 = (elfb) k.Q();
        elfbVar3.getClass();
        elfdVar3.s = elfbVar3;
        elfdVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar.a((elfd) v.Q());
        setResult(xtnVar.a(), xtnVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.o = bmgp.a(this, null);
        setTheme(R.style.FullScreenConsent);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        super.onCreate(bundle);
        setContentView(R.layout.credentials_full_screen_consent);
        ResolutionData resolutionData = (ResolutionData) getIntent().getParcelableExtra("resolution_data");
        if (resolutionData == null) {
            k((xtn) xtn.c().c(28453, wkg.a("resolution_data")));
            return;
        }
        this.j = resolutionData;
        Account account = (Account) getIntent().getParcelableExtra("selected_account");
        if (account == null) {
            k((xtn) xtn.c().c(28453, wkg.a("selected_account")));
            return;
        }
        this.k = account;
        String stringExtra = getIntent().getStringExtra("session_id");
        if (stringExtra == null) {
            k((xtn) xtn.c().c(28453, wkg.a("session_id")));
            return;
        }
        this.l = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("allowlisted_regex");
        if (stringExtra2 == null) {
            k((xtn) xtn.c().c(28453, wkg.a("allowlisted_regex")));
            return;
        }
        this.m = stringExtra2;
        xtp xtpVar = (xtp) new jrh(this, new xto(this.k, this.j, this.m, getIntent().getBooleanExtra("enable_file_picker", false))).a(xtp.class);
        this.n = xtpVar;
        xtpVar.a.g(this, new jpd() { // from class: xtk
            @Override // defpackage.jpd
            public final void a(Object obj) {
                FullScreenConsentChimeraActivity.this.k((xtn) obj);
            }
        });
        xts xtsVar = new xts();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fragment_container, xtsVar);
        bpVar.a();
    }
}
