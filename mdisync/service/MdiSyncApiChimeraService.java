package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.mdisync.service.MdiSyncApiChimeraService;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.cewv;
import defpackage.ceww;
import defpackage.cexa;
import defpackage.cexh;
import defpackage.cexi;
import defpackage.ceyl;
import defpackage.cezb;
import defpackage.cfak;
import defpackage.cfat;
import defpackage.drrp;
import defpackage.ekut;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elpp;
import defpackage.flna;
import defpackage.flnb;
import defpackage.flnc;
import defpackage.flni;
import defpackage.flnj;
import defpackage.fsvs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdiSyncApiChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;
    private final ekww b;
    private final ekut c;
    private final ekww d;

    public MdiSyncApiChimeraService() {
        this(new ekut() { // from class: cezs
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                int i = MdiSyncApiChimeraService.a;
                cewv b = cexa.a().b((Account) obj);
                return new ceww(b.p, b.b);
            }
        }, new ekww() { // from class: cezt
            @Override // defpackage.ekww
            public final Object lK() {
                int i = MdiSyncApiChimeraService.a;
                return cexa.a().c();
            }
        });
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        ekww ekwwVar = this.d;
        ((drrp) ekwwVar.lK()).b().ai(6369).B("Receiving API connection from package '%s'...", getServiceRequest.f);
        if (!fsvs.g()) {
            bzozVar.a(16, null);
            ((drrp) ekwwVar.lK()).b().ai(6371).x("API connection rejected!");
            return;
        }
        Account account = getServiceRequest.j;
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        ceww cewwVar = (ceww) this.c.apply(account);
        bzpe bzpeVar = (bzpe) this.b.lK();
        flni.b(bzpeVar);
        cewwVar.b = bzpeVar;
        flni.b(str);
        cewwVar.c = str;
        cewwVar.d = str2;
        flni.a(cewwVar.b, bzpe.class);
        flni.a(cewwVar.c, String.class);
        bzpe bzpeVar2 = cewwVar.b;
        String str3 = cewwVar.c;
        String str4 = cewwVar.d;
        flnb b = flnc.b(bzpeVar2);
        flnb b2 = flnc.b(str3);
        flnb c = flnc.c(str4);
        cexa cexaVar = cewwVar.e;
        cewv cewvVar = cewwVar.a;
        flnj c2 = flna.c(new cezb(cexaVar.O, cewvVar.o, b2, c));
        flnj flnjVar = cexaVar.B;
        cexi cexiVar = cexh.a;
        flnj flnjVar2 = cexaVar.Q;
        flnj flnjVar3 = cexaVar.E;
        bzozVar.c((ceyl) flna.c(new cfak(b, new cfat(cewvVar.l, flnjVar, cexiVar, c2, flnjVar2, b2, c, cewvVar.c, flnjVar3), b2, flnjVar3, c)).a());
        ((drrp) ekwwVar.lK()).b().ai(6370).x("API connection successful!");
    }

    public MdiSyncApiChimeraService(ekut ekutVar, ekww ekwwVar) {
        super(215, "com.google.android.gms.mdisync.service.START", elpp.a, 1, 9);
        this.b = ekxd.a(new ekww() { // from class: cezr
            @Override // defpackage.ekww
            public final Object lK() {
                return MdiSyncApiChimeraService.this.l();
            }
        });
        this.c = ekutVar;
        this.d = ekxd.a(ekwwVar);
    }
}
