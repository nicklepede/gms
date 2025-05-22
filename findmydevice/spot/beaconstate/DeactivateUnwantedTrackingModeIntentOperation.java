package com.google.android.gms.findmydevice.spot.beaconstate;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.beaconstate.DeactivateUnwantedTrackingModeIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhff;
import defpackage.bhfh;
import defpackage.dyun;
import defpackage.dyvp;
import defpackage.dyvr;
import defpackage.dyzu;
import defpackage.dyzv;
import defpackage.dzfd;
import defpackage.dzfe;
import defpackage.dzgp;
import defpackage.dzhc;
import defpackage.ejaa;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgp;
import defpackage.ewvg;
import defpackage.fgpr;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DeactivateUnwantedTrackingModeIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("DeUnwantedTrackingIntOp", auid.FIND_MY_DEVICE_SPOT);
    private final dzfe b;

    public DeactivateUnwantedTrackingModeIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.beaconstate.DEACTIVATE_UNWANTED_TRACKING_MODE")) {
            if (!bhfh.a()) {
                ((eluo) ((eluo) a.j()).ai((char) 3935)).x("Eddystone use cases are disabled.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            if (stringExtra == null) {
                ((eluo) ((eluo) a.j()).ai((char) 3934)).x("No canonic device id in intent");
                return;
            }
            byte[] byteArrayExtra = intent.getByteArrayExtra("sighted_eid");
            if (byteArrayExtra == null) {
                ((eluo) ((eluo) a.j()).ai((char) 3933)).x("No sighted eid in intent");
                return;
            }
            fgpr w = fgpr.w(byteArrayExtra);
            fgrc v = ewvg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((ewvg) v.b).b = stringExtra;
            ewvg ewvgVar = (ewvg) v.Q();
            dzfe dzfeVar = this.b;
            dyzu a2 = ((dyzv) dzfeVar.a).a();
            dzhc dzhcVar = (dzhc) dzfeVar.b.a();
            dzhcVar.getClass();
            dyun dyunVar = (dyun) dzfeVar.c.a();
            dyunVar.getClass();
            dyvp a3 = ((dyvr) dzfeVar.d).a();
            eqgp eqgpVar = (eqgp) dzfeVar.e.a();
            eqgpVar.getClass();
            ewvgVar.getClass();
            final dzfd dzfdVar = new dzfd(a2, dzhcVar, dyunVar, a3, eqgpVar, ewvgVar, w);
            dzgp.a("Deactivation of unwanted tracking mode", ejaa.g(ejaa.g(dzfdVar.a.j(dzfdVar.b)).i(new eqdv() { // from class: dzfb
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    ekvi ekviVar = (ekvi) obj;
                    ekvl.q(ekviVar.h());
                    ekvl.q(((dzgv) ekviVar.c()).b.h());
                    ekvl.q(((dzin) ((dzgv) ekviVar.c()).b.c()).b.h());
                    final dzin dzinVar = (dzin) ((dzgv) ekviVar.c()).b.c();
                    ekvl.q(dzinVar.d().h());
                    final dzfd dzfdVar2 = dzfd.this;
                    dzau a4 = dzav.a();
                    a4.b(dzfdVar2.b);
                    a4.e(new elqn(dzfdVar2.c));
                    a4.d(dzfdVar2.e.d());
                    eizy c = eizy.c(dzfdVar2.f.e(a4.a()));
                    eqek eqekVar = new eqek() { // from class: dzfc
                        @Override // defpackage.eqek
                        public final eqeq a(eqeo eqeoVar, Object obj2) {
                            dpvg dpvgVar = ((dytw) obj2).b;
                            dzfd dzfdVar3 = dzfd.this;
                            dyte dyteVar = new dyte(dytf.b(dzfdVar3.e));
                            dyteVar.g(true);
                            return dzfdVar3.f.a(dpvgVar, dyteVar.a()).a;
                        }
                    };
                    eqgp eqgpVar2 = dzfdVar2.d;
                    eizy f = c.f(eqekVar, eqgpVar2);
                    eqdv eqdvVar = new eqdv() { // from class: dzfa
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            dyvd a5 = dzfd.this.g.a((dyyw) obj2);
                            dzin dzinVar2 = dzinVar;
                            fgpr fgprVar = (fgpr) dzinVar2.d().c();
                            dyvs dyvsVar = dyvs.DEACTIVATE_UNWANTED_TRACKING_PROTECTION_MODE;
                            final fgpr fgprVar2 = dzinVar2.a;
                            dyvq dyvqVar = (dyvq) a5;
                            return ejaa.g(dyvqVar.c.d(dyvsVar, fgprVar, new dywe() { // from class: dyvl
                                @Override // defpackage.dywe
                                public final fgpr a(fgpr fgprVar3) {
                                    return dyvq.j(fgpr.this, fgprVar3);
                                }
                            })).h(new ekut() { // from class: dyvm
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    eltl eltlVar = dyvq.a;
                                    return null;
                                }
                            }, dyvqVar.d);
                        }
                    };
                    eqgk eqgkVar = eqeq.a;
                    return f.f(new eqeb(eqdvVar), eqgpVar2).g();
                }
            }, dzfdVar.d)).h(new ekut() { // from class: bfak
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    ((eluo) ((eluo) DeactivateUnwantedTrackingModeIntentOperation.a.h()).ai((char) 3931)).x("Deactivated unwanted tracking mode successfully.");
                    return null;
                }
            }, eqex.a));
        }
    }

    public DeactivateUnwantedTrackingModeIntentOperation(bgdb bgdbVar) {
        this.b = bgdbVar.T();
    }
}
