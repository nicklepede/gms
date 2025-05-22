package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import defpackage.caqj;
import defpackage.dg;
import defpackage.evya;
import defpackage.flnc;
import defpackage.flni;
import defpackage.flnj;
import defpackage.fmkf;
import defpackage.fxxm;
import defpackage.ld;
import defpackage.le;
import defpackage.tkt;
import defpackage.tll;
import defpackage.tlm;
import defpackage.twb;
import defpackage.twp;
import defpackage.tws;
import defpackage.txr;
import defpackage.txs;
import defpackage.txt;
import defpackage.txu;
import defpackage.txv;
import defpackage.tyc;
import defpackage.tyr;
import defpackage.tyv;
import defpackage.tzi;
import defpackage.tzu;
import defpackage.tzx;
import defpackage.ucp;
import defpackage.ucs;
import defpackage.uct;
import defpackage.ucu;
import defpackage.ucv;
import defpackage.ucw;
import defpackage.ucx;
import defpackage.ucy;
import defpackage.ucz;
import defpackage.uda;
import defpackage.ufc;
import defpackage.ulh;
import defpackage.unl;
import defpackage.unn;
import defpackage.utc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CardDeckView extends ucs {
    public static final /* synthetic */ int aD = 0;
    public Set aA;
    public dg aB;
    public tll aC;
    private final Handler aE;
    public ucz ag;
    public ucz ah;
    public ucz ai;
    public ucz aj;
    public ucw ak;
    public ucy al;
    public txt am;
    public ucx an;
    public ucv ao;
    public uda ap;
    public ucu aq;
    public uct ar;
    public unl as;
    public txu at;
    public evya au;
    public unn av;
    public utc aw;
    public String ax;
    public boolean ay;
    public List az;

    public CardDeckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag = new ucz() { // from class: twv
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ah = new ucz() { // from class: txj
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ai = new ucz() { // from class: txk
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                int i = CardDeckView.aD;
            }
        };
        this.aj = new ucz() { // from class: txl
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ak = new ucw() { // from class: txm
            @Override // defpackage.ucw
            public final void a(evxw evxwVar) {
                int i = CardDeckView.aD;
            }
        };
        this.al = new ucy() { // from class: txn
            @Override // defpackage.ucy
            public final void a(elgo elgoVar) {
                int i = CardDeckView.aD;
            }
        };
        this.am = new txt() { // from class: txo
            @Override // defpackage.txt
            public final void a(tnj tnjVar) {
                int i = CardDeckView.aD;
            }
        };
        this.an = new ucx() { // from class: txp
            @Override // defpackage.ucx
            public final void a(evxw evxwVar) {
                int i = CardDeckView.aD;
            }
        };
        this.ao = new ucv() { // from class: txq
            @Override // defpackage.ucv
            public final void a() {
                int i = CardDeckView.aD;
            }
        };
        this.ap = new uda() { // from class: tww
            @Override // defpackage.uda
            public final void a(uct uctVar) {
                int i = CardDeckView.aD;
            }
        };
        this.aq = new ucu() { // from class: txg
            @Override // defpackage.ucu
            public final void a() {
                int i = CardDeckView.aD;
            }
        };
        this.ay = false;
        this.aE = new caqj();
        this.az = new ArrayList();
        this.aA = new HashSet();
        this.aB = new dg();
        ((txs) tkt.a(txs.class, context)).c(this);
    }

    public final void a() {
        this.aE.post(new Runnable() { // from class: twx
            @Override // java.lang.Runnable
            public final void run() {
                CardDeckView.this.R();
            }
        });
    }

    public final void aF() {
        tll tllVar = this.aC;
        dg dgVar = this.aB;
        le a = new ld(tws.a).a();
        Context context = getContext();
        fxxm.f(context, "context");
        int b = ucp.b((int) fmkf.a.lK().j(), context);
        int a2 = ulh.a(context);
        ucz uczVar = new ucz() { // from class: twy
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                CardDeckView.this.ag.a(evwnVar);
            }
        };
        ucz uczVar2 = new ucz() { // from class: twz
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                CardDeckView.this.ai.a(evwnVar);
            }
        };
        ucz uczVar3 = new ucz() { // from class: txa
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                CardDeckView.this.ah.a(evwnVar);
            }
        };
        ucz uczVar4 = new ucz() { // from class: txb
            @Override // defpackage.ucz
            public final void a(evwn evwnVar) {
                CardDeckView.this.aj.a(evwnVar);
            }
        };
        ucw ucwVar = new ucw() { // from class: txc
            @Override // defpackage.ucw
            public final void a(evxw evxwVar) {
                CardDeckView.this.ak.a(evxwVar);
            }
        };
        ucy ucyVar = new ucy() { // from class: txd
            @Override // defpackage.ucy
            public final void a(elgo elgoVar) {
                CardDeckView.this.al.a(elgoVar);
            }
        };
        txt txtVar = new txt() { // from class: txe
            @Override // defpackage.txt
            public final void a(tnj tnjVar) {
                CardDeckView.this.am.a(tnjVar);
            }
        };
        ucx ucxVar = new ucx() { // from class: txf
            @Override // defpackage.ucx
            public final void a(evxw evxwVar) {
                CardDeckView.this.an.a(evxwVar);
            }
        };
        ucv ucvVar = new ucv() { // from class: txh
            @Override // defpackage.ucv
            public final void a() {
                CardDeckView.this.ao.a();
            }
        };
        ucu ucuVar = new ucu() { // from class: txi
            @Override // defpackage.ucu
            public final void a() {
                CardDeckView.this.aq.a();
            }
        };
        flni.b(dgVar);
        tlm tlmVar = new tlm(tllVar.a, dgVar, a, Boolean.valueOf(a2 < b), uczVar, uczVar2, uczVar3, uczVar4, ucwVar, ucyVar, txtVar, ucxVar, ucvVar, ucuVar);
        le leVar = tlmVar.a;
        Boolean bool = tlmVar.b;
        flnj flnjVar = tlmVar.d;
        flnj flnjVar2 = tlmVar.h;
        flnj flnjVar3 = tlmVar.k;
        txu b2 = txv.b(leVar, bool.booleanValue(), (ufc) ((flnc) flnjVar).a, (tyc) ((flnc) flnjVar2).a, (tzi) flnjVar3.a(), (tyr) ((flnc) tlmVar.p).a, (tzx) ((flnc) tlmVar.s).a, (tzu) ((flnc) tlmVar.w).a, (tyv) ((flnc) tlmVar.z).a, ((flnc) tlmVar.C).a, ((flnc) tlmVar.E).a, (twb) ((flnc) tlmVar.J).a, (twp) ((flnc) tlmVar.M).a);
        this.at = b2;
        b2.D(this.au, this.av, this.as, this.az, this.aw, this.ax, this.aA, this.ay);
        this.at.E(this.ar, this.ap);
        ah(this.at);
        this.at.y(new txr(this));
    }

    public final void aG() {
        txu txuVar = this.at;
        if (txuVar == null) {
            aF();
        } else {
            txuVar.D(this.au, this.av, this.as, this.az, this.aw, this.ax, this.aA, this.ay);
        }
    }
}
