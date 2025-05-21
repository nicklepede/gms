package com.google.android.gms.findmydevice.spot.beaconstate;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.beaconstate.DeactivateUnwantedTrackingModeIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfdp;
import defpackage.bfdr;
import defpackage.dwim;
import defpackage.dwjo;
import defpackage.dwjq;
import defpackage.dwnt;
import defpackage.dwnu;
import defpackage.dwtd;
import defpackage.dwte;
import defpackage.dwup;
import defpackage.dwvc;
import defpackage.egmx;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensw;
import defpackage.eufn;
import defpackage.feay;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DeactivateUnwantedTrackingModeIntentOperation extends IntentOperation {
    public static final asot a = asot.b("DeUnwantedTrackingIntOp", asej.FIND_MY_DEVICE_SPOT);
    private final dwte b;

    public DeactivateUnwantedTrackingModeIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.beaconstate.DEACTIVATE_UNWANTED_TRACKING_MODE")) {
            if (!bfdr.a()) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3929)).x("Eddystone use cases are disabled.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            if (stringExtra == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3928)).x("No canonic device id in intent");
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("sighted_eid");
            if (byteArrayExtra == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3927)).x("No sighted eid in intent");
                return;
            }
            feay w = feay.w(byteArrayExtra);
            fecj v = eufn.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((eufn) v.b).b = stringExtra;
            eufn eufnVar = (eufn) v.Q();
            dwte dwteVar = this.b;
            dwnt a2 = ((dwnu) dwteVar.a).a();
            dwvc dwvcVar = (dwvc) dwteVar.b.a();
            dwvcVar.getClass();
            dwim dwimVar = (dwim) dwteVar.c.a();
            dwimVar.getClass();
            dwjo a3 = ((dwjq) dwteVar.d).a();
            ensw enswVar = (ensw) dwteVar.e.a();
            enswVar.getClass();
            eufnVar.getClass();
            final dwtd dwtdVar = new dwtd(a2, dwvcVar, dwimVar, a3, enswVar, eufnVar, w);
            dwup.a("Deactivation of unwanted tracking mode", egmx.f(egmx.f(dwtdVar.a.j(dwtdVar.b)).i(new enqc() { // from class: dwtb
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    eiid eiidVar = (eiid) obj;
                    eiig.p(eiidVar.h());
                    eiig.p(((dwuv) eiidVar.c()).b.h());
                    eiig.p(((dwwn) ((dwuv) eiidVar.c()).b.c()).b.h());
                    final dwwn dwwnVar = (dwwn) ((dwuv) eiidVar.c()).b.c();
                    eiig.p(dwwnVar.d().h());
                    final dwtd dwtdVar2 = dwtd.this;
                    dwou a4 = dwov.a();
                    a4.b(dwtdVar2.b);
                    a4.e(new ejdg(dwtdVar2.c));
                    a4.d(dwtdVar2.e.d());
                    egmv c = egmv.c(dwtdVar2.f.e(a4.a()));
                    enqr enqrVar = new enqr() { // from class: dwtc
                        @Override // defpackage.enqr
                        public final enqx a(enqv enqvVar, Object obj2) {
                            dnkx dnkxVar = ((dwhv) obj2).b;
                            dwtd dwtdVar3 = dwtd.this;
                            dwhd dwhdVar = new dwhd(dwhe.b(dwtdVar3.e));
                            dwhdVar.g(true);
                            return dwtdVar3.f.a(dnkxVar, dwhdVar.a()).a;
                        }
                    };
                    ensw enswVar2 = dwtdVar2.d;
                    egmv f = c.f(enqrVar, enswVar2);
                    enqc enqcVar = new enqc() { // from class: dwta
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            dwjc a5 = dwtd.this.g.a((dwmv) obj2);
                            dwwn dwwnVar2 = dwwnVar;
                            feay feayVar = (feay) dwwnVar2.d().c();
                            dwjr dwjrVar = dwjr.DEACTIVATE_UNWANTED_TRACKING_PROTECTION_MODE;
                            final feay feayVar2 = dwwnVar2.a;
                            dwjp dwjpVar = (dwjp) a5;
                            return egmx.f(dwjpVar.c.d(dwjrVar, feayVar, new dwkd() { // from class: dwjk
                                @Override // defpackage.dwkd
                                public final feay a(feay feayVar3) {
                                    return dwjp.j(feay.this, feayVar3);
                                }
                            })).h(new eiho() { // from class: dwjl
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    ejgc ejgcVar = dwjp.a;
                                    return null;
                                }
                            }, dwjpVar.d);
                        }
                    };
                    ensr ensrVar = enqx.a;
                    return f.f(new enqi(enqcVar), enswVar2).g();
                }
            }, dwtdVar.d)).h(new eiho() { // from class: bcyy
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    ((ejhf) ((ejhf) DeactivateUnwantedTrackingModeIntentOperation.a.h()).ah((char) 3925)).x("Deactivated unwanted tracking mode successfully.");
                    return null;
                }
            }, enre.a));
        }
    }

    public DeactivateUnwantedTrackingModeIntentOperation(bebp bebpVar) {
        this.b = bebpVar.T();
    }
}
