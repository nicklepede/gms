package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;
import com.google.android.gms.autofill.operation.RejectSaveOperation;
import defpackage.adsf;
import defpackage.adsv;
import defpackage.adxv;
import defpackage.aert;
import defpackage.aery;
import defpackage.aeyb;
import defpackage.afqc;
import defpackage.afqt;
import defpackage.aggx;
import defpackage.agkv;
import defpackage.asej;
import defpackage.asot;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.enrv;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.fldt;
import defpackage.flek;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RejectSaveOperation extends IntentOperation implements enrv {
    public static final asot a = asot.b("RejectSaveOperation", asej.AUTOFILL);

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        ((ejhf) ((ejhf) ((ejhf) a.j()).s(th)).ah((char) 1033)).v();
    }

    @Override // defpackage.enrv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int length;
        enss g;
        aeyb x = aery.a(this).x(this);
        intent.setExtrasClassLoader(RejectSaveOperation.class.getClassLoader());
        adsv adsvVar = (adsv) eiid.i((DomainUtils$DomainParcel) intent.getParcelableExtra("save_data_domain")).b(new eiho() { // from class: afkd
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = RejectSaveOperation.a;
                return ((DomainUtils$DomainParcel) obj).a;
            }
        }).f();
        final adsf adsfVar = (adsf) eiid.i((DomainUtils$DomainParcel) intent.getParcelableExtra("save_application_domain")).b(new eiho() { // from class: afke
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                asot asotVar = RejectSaveOperation.a;
                return (adsf) ((DomainUtils$DomainParcel) obj).a;
            }
        }).f();
        afqt b = afqt.b(intent.getIntExtra("save_data_type", 0));
        eiig.y(adsvVar, "Data domain can not be null.");
        eiig.y(adsfVar, "Application domain can not be null.");
        eiig.b(b != afqt.UNKNOWN_DATA_TYPE, "Data type can not be UNKNOWN_DATA_TYPE.");
        if (b == afqt.CREDENTIAL) {
            final aggx j = aery.a(this).j();
            String str = adsfVar.a;
            if (j.s(str) + 1 < fldt.b()) {
                j.W(str);
            } else if (flek.a.a().R()) {
                if (x.g().h()) {
                    ensi h = ensi.h(((adxv) x.g().c()).e(adsvVar));
                    enqc enqcVar = new enqc() { // from class: afkb
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            asot asotVar = RejectSaveOperation.a;
                            return ensj.i(true);
                        }
                    };
                    enre enreVar = enre.a;
                    g = enox.g(enps.g(h, enqcVar, enreVar), Exception.class, new enqc() { // from class: afkc
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            ((ejhf) ((ejhf) ((ejhf) RejectSaveOperation.a.j()).s((Exception) obj)).ah(1032)).x("Failed to persist save rejection in Chromesync.");
                            return ensj.i(false);
                        }
                    }, enreVar);
                } else {
                    g = ensj.i(false);
                }
                enps.f(g, new eiho() { // from class: afka
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        asot asotVar = RejectSaveOperation.a;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        aggx.this.V(adsfVar.a);
                        return null;
                    }
                }, enre.a);
            } else {
                ensj.t(((adxv) x.g().c()).e(adsvVar), this, enre.a);
                j.V(str);
            }
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("save_ui_action_event_extra");
            if (byteArrayExtra != null && (length = byteArrayExtra.length) != 0) {
                afqc afqcVar = afqc.a;
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                fecp y = fecp.y(afqcVar, byteArrayExtra, 0, length, febw.a);
                fecp.M(y);
                final afqc afqcVar2 = (afqc) y;
                x.b().P(new eijr() { // from class: afkf
                    @Override // defpackage.eijr
                    public final Object a() {
                        asot asotVar = RejectSaveOperation.a;
                        return afqc.this;
                    }
                });
            }
        } catch (fedk unused) {
        }
        eiid n = aery.a(this).n();
        if (n.h() && ((aert) n.c()).b(2)) {
            Intent k = agkv.k(aert.a(2));
            k.addFlags(268435456);
            startActivity(k);
        }
    }
}
