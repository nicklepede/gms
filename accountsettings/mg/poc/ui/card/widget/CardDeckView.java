package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import defpackage.byhr;
import defpackage.dg;
import defpackage.etii;
import defpackage.fixf;
import defpackage.fixl;
import defpackage.fixm;
import defpackage.fjue;
import defpackage.fvbo;
import defpackage.ld;
import defpackage.le;
import defpackage.rrk;
import defpackage.rsc;
import defpackage.rsd;
import defpackage.scl;
import defpackage.sct;
import defpackage.scx;
import defpackage.sdw;
import defpackage.sdx;
import defpackage.sdy;
import defpackage.sdz;
import defpackage.sea;
import defpackage.seh;
import defpackage.sew;
import defpackage.sfb;
import defpackage.sfo;
import defpackage.sfx;
import defpackage.sii;
import defpackage.sil;
import defpackage.sim;
import defpackage.sin;
import defpackage.sio;
import defpackage.sip;
import defpackage.siq;
import defpackage.sir;
import defpackage.sis;
import defpackage.sit;
import defpackage.skq;
import defpackage.sqg;
import defpackage.srn;
import defpackage.srp;
import defpackage.sxe;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CardDeckView extends sil {
    public static final /* synthetic */ int aD = 0;
    public Set aA;
    public dg aB;
    public rsc aC;
    private final Handler aE;
    public sis ag;
    public sis ah;
    public sis ai;
    public sis aj;
    public sip ak;
    public sir al;
    public sdy am;
    public siq an;
    public sio ao;
    public sit ap;
    public sin aq;
    public sim ar;
    public srn as;
    public sdz at;
    public etii au;
    public srp av;
    public sxe aw;
    public String ax;
    public boolean ay;
    public List az;

    public CardDeckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag = new sis() { // from class: sda
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ah = new sis() { // from class: sdo
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ai = new sis() { // from class: sdp
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                int i = CardDeckView.aD;
            }
        };
        this.aj = new sis() { // from class: sdq
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ak = new sip() { // from class: sdr
            @Override // defpackage.sip
            public final void a(etie etieVar) {
                int i = CardDeckView.aD;
            }
        };
        this.al = new sir() { // from class: sds
            @Override // defpackage.sir
            public final void a(eitj eitjVar) {
                int i = CardDeckView.aD;
            }
        };
        this.am = new sdy() { // from class: sdt
            @Override // defpackage.sdy
            public final void a(rua ruaVar) {
                int i = CardDeckView.aD;
            }
        };
        this.an = new siq() { // from class: sdu
            @Override // defpackage.siq
            public final void a(etie etieVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ao = new sio() { // from class: sdv
            @Override // defpackage.sio
            public final void a() {
                int i = CardDeckView.aD;
            }
        };
        this.ap = new sit() { // from class: sdb
            @Override // defpackage.sit
            public final void a(sim simVar) {
                int i = CardDeckView.aD;
            }
        };
        this.aq = new sin() { // from class: sdl
            @Override // defpackage.sin
            public final void a() {
                int i = CardDeckView.aD;
            }
        };
        this.ay = false;
        this.aE = new byhr();
        this.az = new ArrayList();
        this.aA = new HashSet();
        this.aB = new dg();
        ((sdx) rrk.a(sdx.class, context)).c(this);
    }

    public final void a() {
        this.aE.post(new Runnable() { // from class: sdc
            @Override // java.lang.Runnable
            public final void run() {
                CardDeckView.this.R();
            }
        });
    }

    public final void aF() {
        rsc rscVar = this.aC;
        dg dgVar = this.aB;
        le a = new ld(scx.a).a();
        Context context = getContext();
        fvbo.f(context, "context");
        int a2 = sii.a((int) fjue.a.a().j(), context);
        int a3 = sqg.a(context);
        sis sisVar = new sis() { // from class: sdd
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                CardDeckView.this.ag.a(etgvVar);
            }
        };
        sis sisVar2 = new sis() { // from class: sde
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                CardDeckView.this.ai.a(etgvVar);
            }
        };
        sis sisVar3 = new sis() { // from class: sdf
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                CardDeckView.this.ah.a(etgvVar);
            }
        };
        sis sisVar4 = new sis() { // from class: sdg
            @Override // defpackage.sis
            public final void a(etgv etgvVar) {
                CardDeckView.this.aj.a(etgvVar);
            }
        };
        sip sipVar = new sip() { // from class: sdh
            @Override // defpackage.sip
            public final void a(etie etieVar) {
                CardDeckView.this.ak.a(etieVar);
            }
        };
        sir sirVar = new sir() { // from class: sdi
            @Override // defpackage.sir
            public final void a(eitj eitjVar) {
                CardDeckView.this.al.a(eitjVar);
            }
        };
        sdy sdyVar = new sdy() { // from class: sdj
            @Override // defpackage.sdy
            public final void a(rua ruaVar) {
                CardDeckView.this.am.a(ruaVar);
            }
        };
        siq siqVar = new siq() { // from class: sdk
            @Override // defpackage.siq
            public final void a(etie etieVar) {
                CardDeckView.this.an.a(etieVar);
            }
        };
        sio sioVar = new sio() { // from class: sdm
            @Override // defpackage.sio
            public final void a() {
                CardDeckView.this.ao.a();
            }
        };
        sin sinVar = new sin() { // from class: sdn
            @Override // defpackage.sin
            public final void a() {
                CardDeckView.this.aq.a();
            }
        };
        fixl.b(dgVar);
        rsd rsdVar = new rsd(rscVar.a, dgVar, a, Boolean.valueOf(a3 < a2), sisVar, sisVar2, sisVar3, sisVar4, sipVar, sirVar, sdyVar, siqVar, sioVar, sinVar);
        le leVar = rsdVar.a;
        Boolean bool = rsdVar.b;
        fixm fixmVar = rsdVar.d;
        fixm fixmVar2 = rsdVar.h;
        fixm fixmVar3 = rsdVar.k;
        sdz b = sea.b(leVar, bool.booleanValue(), (skq) ((fixf) fixmVar).a, (seh) ((fixf) fixmVar2).a, (sfo) fixmVar3.a(), (sew) ((fixf) rsdVar.p).a, (sfx) ((fixf) rsdVar.u).a, (sfb) ((fixf) rsdVar.x).a, ((fixf) rsdVar.A).a, ((fixf) rsdVar.C).a, (scl) ((fixf) rsdVar.H).a, (sct) ((fixf) rsdVar.K).a);
        this.at = b;
        b.D(this.au, this.av, this.as, this.az, this.aw, this.ax, this.aA, this.ay);
        this.at.E(this.ar, this.ap);
        ah(this.at);
        this.at.y(new sdw(this));
    }

    public final void aG() {
        sdz sdzVar = this.at;
        if (sdzVar == null) {
            aF();
        } else {
            sdzVar.D(this.au, this.av, this.as, this.az, this.aw, this.ax, this.aA, this.ay);
        }
    }
}
