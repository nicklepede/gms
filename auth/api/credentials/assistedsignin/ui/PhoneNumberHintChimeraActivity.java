package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.assistedsignin.ui.PhoneNumberHintChimeraActivity;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.atzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.boni;
import defpackage.bonm;
import defpackage.bonp;
import defpackage.bp;
import defpackage.ekvh;
import defpackage.ekwb;
import defpackage.elgo;
import defpackage.enrw;
import defpackage.enso;
import defpackage.ensq;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxw;
import defpackage.rxx;
import defpackage.xqj;
import defpackage.xsy;
import defpackage.xsz;
import defpackage.xta;
import defpackage.yem;
import defpackage.yes;
import defpackage.ygq;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneNumberHintChimeraActivity extends rxx {
    private static final ausn l = zsi.b("PhoneNumberHintChimeraActivity");
    public String j;
    public boni k;
    private String m;
    private xta n;

    public final void a(xsy xsyVar) {
        elgo elgoVar;
        xsyVar.f(l);
        fgrc v = enrw.a.v();
        xta xtaVar = this.n;
        int i = 0;
        if (xtaVar != null && (elgoVar = (elgo) xtaVar.c.ii()) != null) {
            i = elgoVar.size();
        }
        if (!v.b.L()) {
            v.U();
        }
        enrw enrwVar = (enrw) v.b;
        enrwVar.b |= 1;
        enrwVar.c = i;
        boolean g = xsyVar.g();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        enrw enrwVar2 = (enrw) fgriVar;
        enrwVar2.b |= 2;
        enrwVar2.d = g;
        String str = this.m;
        if (str != null) {
            if (!fgriVar.L()) {
                v.U();
            }
            enrw enrwVar3 = (enrw) v.b;
            enrwVar3.b |= 4;
            enrwVar3.e = str;
        }
        boni boniVar = this.k;
        ensq ensqVar = ensq.a;
        fgrc v2 = ensqVar.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        ensq ensqVar2 = (ensq) fgriVar2;
        ensqVar2.d = 24;
        ensqVar2.b |= 1;
        if (!fgriVar2.L()) {
            v2.U();
        }
        ensq ensqVar3 = (ensq) v2.b;
        enrw enrwVar4 = (enrw) v.Q();
        enrwVar4.getClass();
        ensqVar3.z = enrwVar4;
        ensqVar3.b |= 8388608;
        String str2 = this.j;
        if (!v2.b.L()) {
            v2.U();
        }
        ensq ensqVar4 = (ensq) v2.b;
        str2.getClass();
        ensqVar4.b |= 2;
        ensqVar4.e = str2;
        boniVar.a((ensq) v2.Q());
        boni boniVar2 = this.k;
        fgrc v3 = ensqVar.v();
        String str3 = this.j;
        if (!v3.b.L()) {
            v3.U();
        }
        fgri fgriVar3 = v3.b;
        ensq ensqVar5 = (ensq) fgriVar3;
        str3.getClass();
        ensqVar5.b |= 2;
        ensqVar5.e = str3;
        if (!fgriVar3.L()) {
            v3.U();
        }
        ensq ensqVar6 = (ensq) v3.b;
        ensqVar6.d = 17;
        ensqVar6.b |= 1;
        fgrc l2 = xsyVar.l();
        if (!l2.b.L()) {
            l2.U();
        }
        enso ensoVar = (enso) l2.b;
        enso ensoVar2 = enso.a;
        ensoVar.f = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS;
        ensoVar.b |= 8;
        if (!v3.b.L()) {
            v3.U();
        }
        ensq ensqVar7 = (ensq) v3.b;
        enso ensoVar3 = (enso) l2.Q();
        ensoVar3.getClass();
        ensqVar7.s = ensoVar3;
        ensqVar7.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        boniVar2.a((ensq) v3.Q());
        setResult(xsyVar.a(), xsyVar.b());
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        this.j = (String) ekvh.c(getIntent().getStringExtra("session_id"), bonp.a());
        this.k = bonh.a(getApplicationContext(), null);
        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = (GetPhoneNumberHintIntentRequest) atzs.b(getIntent(), "get_phone_number_hint_intent_request", GetPhoneNumberHintIntentRequest.CREATOR);
        if (getPhoneNumberHintIntentRequest == null) {
            this.j = bonp.a();
            a((xsy) xsy.c().c(28453, ygq.a("getPhoneNumberHintIntentRequest")));
            return;
        }
        yes.a(this, getPhoneNumberHintIntentRequest.a);
        super.onCreate(bundle);
        bonm.a(this, new ekwb() { // from class: xqb
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                PhoneNumberHintChimeraActivity phoneNumberHintChimeraActivity = PhoneNumberHintChimeraActivity.this;
                phoneNumberHintChimeraActivity.k.a(bono.b(209, (bonn) obj, phoneNumberHintChimeraActivity.j));
            }
        });
        String q = aura.q(this);
        if (q == null) {
            a((xsy) xsy.c().c(28442, "Cannot get calling package name."));
            return;
        }
        this.m = q;
        xta xtaVar = (xta) new jxw(this, new xsz(getApplication(), this.j, this.k)).a(xta.class);
        this.n = xtaVar;
        xtaVar.d.g(this, new jvs() { // from class: xqc
            @Override // defpackage.jvs
            public final void a(Object obj) {
                PhoneNumberHintChimeraActivity.this.a((xsy) obj);
            }
        });
        xta xtaVar2 = this.n;
        jvr jvrVar = xtaVar2.c;
        if (jvrVar.ii() == null) {
            elgo a = ((yem) yem.a.b()).a(xtaVar2.a());
            if (a.isEmpty()) {
                xtaVar2.d.ih((xsy) xsy.c().c(28438, null));
            }
            jvrVar.ih(a);
        }
        if (getSupportFragmentManager().h("PhoneNumberHintDialogFragment") != null) {
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(new xqj(), "PhoneNumberHintDialogFragment");
        bpVar.d();
    }
}
