package com.google.android.gms.auth.api.credentials.fullscreenconsent.ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.api.credentials.fullscreenconsent.ui.FullScreenConsentChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.bolg;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonp;
import defpackage.bp;
import defpackage.enso;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.ygq;
import defpackage.zrk;
import defpackage.zrl;
import defpackage.zrm;
import defpackage.zrp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FullScreenConsentChimeraActivity extends rxx {
    private ResolutionData j;
    private Account k;
    private String l;
    private String m;
    private zrm n;
    private boni o;

    public static String a(int i, Intent intent) {
        if (i == 0) {
            throw bolg.f(16, "Cancelled by user.");
        }
        if (intent == null) {
            throw bolg.h(28453, "intent cannot be null. Activity result code: [%s]", Integer.valueOf(i));
        }
        bolg bolgVar = (bolg) intent.getSerializableExtra("internal_exception");
        if (bolgVar != null) {
            throw bolgVar;
        }
        String stringExtra = intent.getStringExtra("full_screen_consent_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw bolg.f(28453, ygq.a("full_screen_consent_result"));
    }

    public final void k(zrk zrkVar) {
        boni boniVar = this.o;
        Account account = this.k;
        if (account != null) {
            boniVar = bonh.a(this, account.name);
        }
        fgrc v = ensq.a.v();
        String str = this.l;
        if (str == null) {
            str = bonp.a();
        }
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        ensq ensqVar = (ensq) fgriVar;
        str.getClass();
        ensqVar.b |= 2;
        ensqVar.e = str;
        if (!fgriVar.L()) {
            v.U();
        }
        ensq ensqVar2 = (ensq) v.b;
        ensqVar2.d = 17;
        ensqVar2.b |= 1;
        fgrc l = zrkVar.l();
        if (!l.b.L()) {
            l.U();
        }
        enso ensoVar = (enso) l.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 212;
        ensoVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        ensq ensqVar3 = (ensq) v.b;
        enso ensoVar3 = (enso) l.Q();
        ensoVar3.getClass();
        ensqVar3.s = ensoVar3;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v.Q());
        setResult(zrkVar.a(), zrkVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.o = bonh.a(this, null);
        setTheme(R.style.FullScreenConsent);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        super.onCreate(bundle);
        setContentView(R.layout.credentials_full_screen_consent);
        ResolutionData resolutionData = (ResolutionData) getIntent().getParcelableExtra("resolution_data");
        if (resolutionData == null) {
            k((zrk) zrk.c().c(28453, ygq.a("resolution_data")));
            return;
        }
        this.j = resolutionData;
        Account account = (Account) getIntent().getParcelableExtra("selected_account");
        if (account == null) {
            k((zrk) zrk.c().c(28453, ygq.a("selected_account")));
            return;
        }
        this.k = account;
        String stringExtra = getIntent().getStringExtra("session_id");
        if (stringExtra == null) {
            k((zrk) zrk.c().c(28453, ygq.a("session_id")));
            return;
        }
        this.l = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("allowlisted_regex");
        if (stringExtra2 == null) {
            k((zrk) zrk.c().c(28453, ygq.a("allowlisted_regex")));
            return;
        }
        this.m = stringExtra2;
        zrm zrmVar = (zrm) new jxw(this, new zrl(this.k, this.j, this.m, getIntent().getBooleanExtra("enable_file_picker", false))).a(zrm.class);
        this.n = zrmVar;
        zrmVar.a.g(this, new jvs() { // from class: zrh
            @Override // defpackage.jvs
            public final void a(Object obj) {
                FullScreenConsentChimeraActivity.this.k((zrk) obj);
            }
        });
        zrp zrpVar = new zrp();
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.F(R.id.fragment_container, zrpVar);
        bpVar.a();
    }
}
