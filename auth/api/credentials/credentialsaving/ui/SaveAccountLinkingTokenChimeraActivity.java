package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credentialsaving.ui.SaveAccountLinkingTokenChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asng;
import defpackage.asot;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bp;
import defpackage.eiic;
import defpackage.eiiw;
import defpackage.eits;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.ew;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.wit;
import defpackage.wmu;
import defpackage.wnu;
import defpackage.wnv;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenChimeraActivity extends qet {
    private static final asot l = xul.b("SaveAccountLinkingTokenChimeraActivity");
    public bmgq j;
    public String k;
    private wnv m;
    private String n;

    public final void a(wit witVar) {
        witVar.f(l);
        wnv wnvVar = this.m;
        if (wnvVar != null && wnvVar.d.hT() != null) {
            this.j = bmgp.a(this, ((Account) this.m.d.hT()).name);
        }
        bmgq bmgqVar = this.j;
        fecj v = elfd.a.v();
        String str = this.k;
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
        fecj k = witVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = 205;
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
        setResult(witVar.a(), witVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        hC().q(-1);
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        this.k = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        this.j = bmgp.a(this, null);
        bmgu.a(this, new eiiw() { // from class: wms
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                SaveAccountLinkingTokenChimeraActivity saveAccountLinkingTokenChimeraActivity = SaveAccountLinkingTokenChimeraActivity.this;
                saveAccountLinkingTokenChimeraActivity.j.a(bmgw.b(206, (bmgv) obj, saveAccountLinkingTokenChimeraActivity.k));
            }
        });
        String q = asng.q(this);
        if (q == null) {
            a((wit) wit.c().c(28442, "Cannot get calling package name."));
            return;
        }
        this.n = q;
        if (((wnu) getSupportFragmentManager().h("controller")) == null) {
            String str = this.n;
            String str2 = this.k;
            Bundle bundle2 = new Bundle();
            bundle2.putString("calling_package", str);
            bundle2.putString("session_id", str2);
            wnu wnuVar = new wnu();
            wnuVar.setArguments(bundle2);
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.v(wnuVar, "controller");
            bpVar.d();
        }
        wnv wnvVar = (wnv) new jrh(this).a(wnv.class);
        this.m = wnvVar;
        wnvVar.c.g(this, new jpd() { // from class: wmr
            @Override // defpackage.jpd
            public final void a(Object obj) {
                SaveAccountLinkingTokenChimeraActivity.this.a((wit) obj);
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("dialog") == null) {
            String str3 = this.n;
            eits eitsVar = wmu.ag;
            Bundle bundle3 = new Bundle();
            bundle3.putString("calling_package", str3);
            wmu wmuVar = new wmu();
            wmuVar.setArguments(bundle3);
            wmuVar.show(supportFragmentManager, "dialog");
        }
    }
}
