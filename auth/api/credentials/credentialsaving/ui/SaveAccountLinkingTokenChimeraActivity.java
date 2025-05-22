package com.google.android.gms.auth.api.credentials.credentialsaving.ui;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.auth.api.credentials.credentialsaving.ui.SaveAccountLinkingTokenChimeraActivity;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.bp;
import defpackage.ekvh;
import defpackage.ekwb;
import defpackage.elgx;
import defpackage.enso;
import defpackage.ensq;
import defpackage.ew;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.yez;
import defpackage.yje;
import defpackage.yke;
import defpackage.ykf;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SaveAccountLinkingTokenChimeraActivity extends rxx {
    private static final ausn l = zsi.b("SaveAccountLinkingTokenChimeraActivity");
    public boni j;
    public String k;
    private ykf m;
    private String n;

    public final void a(yez yezVar) {
        yezVar.f(l);
        ykf ykfVar = this.m;
        if (ykfVar != null && ykfVar.d.ii() != null) {
            this.j = bonh.a(this, ((Account) this.m.d.ii()).name);
        }
        boni boniVar = this.j;
        fgrc v = ensq.a.v();
        String str = this.k;
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
        fgrc l2 = yezVar.l();
        if (!l2.b.L()) {
            l2.U();
        }
        enso ensoVar = (enso) l2.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = 205;
        ensoVar.b |= 8;
        if (!v.b.L()) {
            v.U();
        }
        ensq ensqVar3 = (ensq) v.b;
        enso ensoVar3 = (enso) l2.Q();
        ensoVar3.getClass();
        ensqVar3.s = ensoVar3;
        ensqVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar.a((ensq) v.Q());
        setResult(yezVar.a(), yezVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        hS().q(-1);
        setTheme(R.style.ThemeTranslucentDayNight);
        super.onCreate(bundle);
        this.k = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        this.j = bonh.a(this, null);
        bonm.a(this, new ekwb() { // from class: yjc
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                SaveAccountLinkingTokenChimeraActivity saveAccountLinkingTokenChimeraActivity = SaveAccountLinkingTokenChimeraActivity.this;
                saveAccountLinkingTokenChimeraActivity.j.a(bono.b(206, (bonn) obj, saveAccountLinkingTokenChimeraActivity.k));
            }
        });
        String q = aura.q(this);
        if (q == null) {
            a((yez) yez.c().c(28442, "Cannot get calling package name."));
            return;
        }
        this.n = q;
        if (((yke) getSupportFragmentManager().h("controller")) == null) {
            String str = this.n;
            String str2 = this.k;
            Bundle bundle2 = new Bundle();
            bundle2.putString("calling_package", str);
            bundle2.putString("session_id", str2);
            yke ykeVar = new yke();
            ykeVar.setArguments(bundle2);
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.v(ykeVar, "controller");
            bpVar.d();
        }
        ykf ykfVar = (ykf) new jxw(this).a(ykf.class);
        this.m = ykfVar;
        ykfVar.c.g(this, new jvs() { // from class: yjb
            @Override // defpackage.jvs
            public final void a(Object obj) {
                SaveAccountLinkingTokenChimeraActivity.this.a((yez) obj);
            }
        });
        ew supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.h("dialog") == null) {
            String str3 = this.n;
            elgx elgxVar = yje.ag;
            Bundle bundle3 = new Bundle();
            bundle3.putString("calling_package", str3);
            yje yjeVar = new yje();
            yjeVar.setArguments(bundle3);
            yjeVar.show(supportFragmentManager, "dialog");
        }
    }
}
