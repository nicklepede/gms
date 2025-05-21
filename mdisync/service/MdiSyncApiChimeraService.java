package com.google.android.gms.mdisync.service;

import android.accounts.Account;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.mdisync.service.MdiSyncApiChimeraService;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.ccob;
import defpackage.ccoc;
import defpackage.ccog;
import defpackage.ccon;
import defpackage.ccoo;
import defpackage.ccpr;
import defpackage.ccqh;
import defpackage.ccrq;
import defpackage.ccrz;
import defpackage.dphg;
import defpackage.eiho;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejck;
import defpackage.fixd;
import defpackage.fixe;
import defpackage.fixf;
import defpackage.fixl;
import defpackage.fixm;
import defpackage.fqbt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdiSyncApiChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;
    private final eijr b;
    private final eiho c;
    private final eijr d;

    public MdiSyncApiChimeraService() {
        this(new eiho() { // from class: ccqy
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                int i = MdiSyncApiChimeraService.a;
                ccob b = ccog.a().b((Account) obj);
                return new ccoc(b.p, b.b);
            }
        }, new eijr() { // from class: ccqz
            @Override // defpackage.eijr
            public final Object a() {
                int i = MdiSyncApiChimeraService.a;
                return ccog.a().c();
            }
        });
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        eijr eijrVar = this.d;
        ((dphg) eijrVar.a()).b().ah(6350).B("Receiving API connection from package '%s'...", getServiceRequest.f);
        if (!fqbt.g()) {
            bxgjVar.a(16, null);
            ((dphg) eijrVar.a()).b().ah(6352).x("API connection rejected!");
            return;
        }
        Account account = getServiceRequest.j;
        String str = getServiceRequest.f;
        String str2 = getServiceRequest.p;
        ccoc ccocVar = (ccoc) this.c.apply(account);
        bxgo bxgoVar = (bxgo) this.b.a();
        fixl.b(bxgoVar);
        ccocVar.b = bxgoVar;
        fixl.b(str);
        ccocVar.c = str;
        ccocVar.d = str2;
        fixl.a(ccocVar.b, bxgo.class);
        fixl.a(ccocVar.c, String.class);
        bxgo bxgoVar2 = ccocVar.b;
        String str3 = ccocVar.c;
        String str4 = ccocVar.d;
        fixe b = fixf.b(bxgoVar2);
        fixe b2 = fixf.b(str3);
        fixe c = fixf.c(str4);
        ccog ccogVar = ccocVar.e;
        ccob ccobVar = ccocVar.a;
        fixm c2 = fixd.c(new ccqh(ccogVar.O, ccobVar.o, b2, c));
        fixm fixmVar = ccogVar.B;
        ccoo ccooVar = ccon.a;
        fixm fixmVar2 = ccogVar.Q;
        fixm fixmVar3 = ccogVar.E;
        bxgjVar.c((ccpr) fixd.c(new ccrq(b, new ccrz(ccobVar.l, fixmVar, ccooVar, c2, fixmVar2, b2, c, ccobVar.c, fixmVar3), b2, fixmVar3, c)).a());
        ((dphg) eijrVar.a()).b().ah(6351).x("API connection successful!");
    }

    public MdiSyncApiChimeraService(eiho eihoVar, eijr eijrVar) {
        super(215, "com.google.android.gms.mdisync.service.START", ejck.a, 1, 9);
        this.b = eijy.a(new eijr() { // from class: ccqx
            @Override // defpackage.eijr
            public final Object a() {
                return MdiSyncApiChimeraService.this.l();
            }
        });
        this.c = eihoVar;
        this.d = eijy.a(eijrVar);
    }
}
