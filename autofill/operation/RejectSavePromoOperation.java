package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;
import com.google.android.gms.autofill.operation.RejectSavePromoOperation;
import defpackage.adsf;
import defpackage.adtr;
import defpackage.aery;
import defpackage.aerz;
import defpackage.aeyb;
import defpackage.afjd;
import defpackage.afqc;
import defpackage.ageb;
import defpackage.aggx;
import defpackage.agkv;
import defpackage.asej;
import defpackage.asot;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiir;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.feep;
import defpackage.flfc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class RejectSavePromoOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("RejectSavePromoOperation", asej.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        Intent intent2;
        int length;
        Intent intent3;
        aggx j = aery.a(this).j();
        if (!adtr.a.equals(j.z())) {
            ((ejhf) ((ejhf) b.j()).ah((char) 1035)).x("RejectSavePromoOperation called when already setup");
            return;
        }
        aerz a2 = aery.a(this);
        aeyb x = a2.x(this);
        if (flfc.i()) {
            adsf adsfVar = (adsf) eiid.i((DomainUtils$DomainParcel) intent.getParcelableExtra("save_application_domain")).b(new eiho() { // from class: afkg
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = RejectSavePromoOperation.a;
                    return (adsf) ((DomainUtils$DomainParcel) obj).a;
                }
            }).f();
            if (adsfVar != null) {
                String str = adsfVar.a;
                j.W(str);
                if (flfc.a.a().b() && j.s(str) >= ageb.c) {
                    intent3 = agkv.A(R.string.autofill_manage_save_preferences, eiid.j(agkv.r()));
                    intent2 = intent3;
                    z = false;
                }
            }
            intent3 = null;
            intent2 = intent3;
            z = false;
        } else {
            j.ap();
            if (j.w() >= ageb.c) {
                ((ejhf) ((ejhf) b.h()).ah((char) 1034)).x("Disabling Autofill with Google");
                ((afjd) ((eiir) a2.p()).a).d();
                a2.a().disableAutofillServices();
                z = true;
            } else {
                z = false;
            }
            intent2 = null;
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("save_ui_action_event_extra");
            if (byteArrayExtra != null && (length = byteArrayExtra.length) != 0) {
                afqc afqcVar = afqc.a;
                febw febwVar = febw.a;
                feep feepVar = feep.a;
                fecp y = fecp.y(afqcVar, byteArrayExtra, 0, length, febw.a);
                fecp.M(y);
                afqc afqcVar2 = (afqc) y;
                fecj fecjVar = (fecj) afqcVar2.iB(5, null);
                fecjVar.X(afqcVar2);
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ((afqc) fecjVar.b).j = z;
                final afqc afqcVar3 = (afqc) fecjVar.Q();
                x.b().P(new eijr() { // from class: afkh
                    @Override // defpackage.eijr
                    public final Object a() {
                        int i = RejectSavePromoOperation.a;
                        return afqc.this;
                    }
                });
            }
        } catch (fedk unused) {
        }
        if (intent2 != null) {
            startActivity(intent2);
        }
    }
}
