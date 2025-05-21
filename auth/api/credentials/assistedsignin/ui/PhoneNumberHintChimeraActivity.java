package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.assistedsignin.ui.PhoneNumberHintChimeraActivity;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arxd;
import defpackage.asng;
import defpackage.asot;
import defpackage.bmgp;
import defpackage.bmgq;
import defpackage.bmgu;
import defpackage.bmgx;
import defpackage.bp;
import defpackage.eiic;
import defpackage.eiiw;
import defpackage.eitj;
import defpackage.elej;
import defpackage.elfb;
import defpackage.elfd;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jrh;
import defpackage.qet;
import defpackage.vuh;
import defpackage.vwu;
import defpackage.vwv;
import defpackage.vww;
import defpackage.wig;
import defpackage.wim;
import defpackage.wkg;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneNumberHintChimeraActivity extends qet {
    private static final asot l = xul.b("PhoneNumberHintChimeraActivity");
    public String j;
    public bmgq k;
    private String m;
    private vww n;

    public final void a(vwu vwuVar) {
        eitj eitjVar;
        vwuVar.f(l);
        fecj v = elej.a.v();
        vww vwwVar = this.n;
        int i = 0;
        if (vwwVar != null && (eitjVar = (eitj) vwwVar.c.hT()) != null) {
            i = eitjVar.size();
        }
        if (!v.b.L()) {
            v.U();
        }
        elej elejVar = (elej) v.b;
        elejVar.b |= 1;
        elejVar.c = i;
        boolean g = vwuVar.g();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        elej elejVar2 = (elej) fecpVar;
        elejVar2.b |= 2;
        elejVar2.d = g;
        String str = this.m;
        if (str != null) {
            if (!fecpVar.L()) {
                v.U();
            }
            elej elejVar3 = (elej) v.b;
            elejVar3.b |= 4;
            elejVar3.e = str;
        }
        bmgq bmgqVar = this.k;
        fecj v2 = elfd.a.v();
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        elfd elfdVar = (elfd) fecpVar2;
        elfdVar.d = 24;
        elfdVar.b |= 1;
        if (!fecpVar2.L()) {
            v2.U();
        }
        elfd elfdVar2 = (elfd) v2.b;
        elej elejVar4 = (elej) v.Q();
        elejVar4.getClass();
        elfdVar2.z = elejVar4;
        elfdVar2.b |= 8388608;
        String str2 = this.j;
        if (!v2.b.L()) {
            v2.U();
        }
        elfd elfdVar3 = (elfd) v2.b;
        str2.getClass();
        elfdVar3.b |= 2;
        elfdVar3.e = str2;
        bmgqVar.a((elfd) v2.Q());
        bmgq bmgqVar2 = this.k;
        fecj v3 = elfd.a.v();
        String str3 = this.j;
        if (!v3.b.L()) {
            v3.U();
        }
        fecp fecpVar3 = v3.b;
        elfd elfdVar4 = (elfd) fecpVar3;
        str3.getClass();
        elfdVar4.b |= 2;
        elfdVar4.e = str3;
        if (!fecpVar3.L()) {
            v3.U();
        }
        elfd elfdVar5 = (elfd) v3.b;
        elfdVar5.d = 17;
        elfdVar5.b |= 1;
        fecj k = vwuVar.k();
        if (!k.b.L()) {
            k.U();
        }
        elfb elfbVar = (elfb) k.b;
        elfb elfbVar2 = elfb.a;
        elfbVar.f = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EMAIL_ADDRESS;
        elfbVar.b |= 8;
        if (!v3.b.L()) {
            v3.U();
        }
        elfd elfdVar6 = (elfd) v3.b;
        elfb elfbVar3 = (elfb) k.Q();
        elfbVar3.getClass();
        elfdVar6.s = elfbVar3;
        elfdVar6.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
        bmgqVar2.a((elfd) v3.Q());
        setResult(vwuVar.a(), vwuVar.b());
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        this.j = (String) eiic.c(getIntent().getStringExtra("session_id"), bmgx.a());
        this.k = bmgp.a(getApplicationContext(), null);
        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest = (GetPhoneNumberHintIntentRequest) arxd.b(getIntent(), "get_phone_number_hint_intent_request", GetPhoneNumberHintIntentRequest.CREATOR);
        if (getPhoneNumberHintIntentRequest == null) {
            this.j = bmgx.a();
            a((vwu) vwu.c().c(28453, wkg.a("getPhoneNumberHintIntentRequest")));
            return;
        }
        wim.a(this, getPhoneNumberHintIntentRequest.a);
        super.onCreate(bundle);
        bmgu.a(this, new eiiw() { // from class: vtz
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                PhoneNumberHintChimeraActivity phoneNumberHintChimeraActivity = PhoneNumberHintChimeraActivity.this;
                phoneNumberHintChimeraActivity.k.a(bmgw.b(209, (bmgv) obj, phoneNumberHintChimeraActivity.j));
            }
        });
        String q = asng.q(this);
        if (q == null) {
            a((vwu) vwu.c().c(28442, "Cannot get calling package name."));
            return;
        }
        this.m = q;
        vww vwwVar = (vww) new jrh(this, new vwv(getApplication(), this.j, this.k)).a(vww.class);
        this.n = vwwVar;
        vwwVar.d.g(this, new jpd() { // from class: vua
            @Override // defpackage.jpd
            public final void a(Object obj) {
                PhoneNumberHintChimeraActivity.this.a((vwu) obj);
            }
        });
        vww vwwVar2 = this.n;
        jpc jpcVar = vwwVar2.c;
        if (jpcVar.hT() == null) {
            eitj a = ((wig) wig.a.b()).a(vwwVar2.a());
            if (a.isEmpty()) {
                vwwVar2.d.hS((vwu) vwu.c().c(28438, null));
            }
            jpcVar.hS(a);
        }
        if (getSupportFragmentManager().h("PhoneNumberHintDialogFragment") != null) {
            return;
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.v(new vuh(), "PhoneNumberHintDialogFragment");
        bpVar.d();
    }
}
