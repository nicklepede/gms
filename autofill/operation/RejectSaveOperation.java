package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.autofill.data.DomainUtils$DomainParcel;
import com.google.android.gms.autofill.operation.RejectSaveOperation;
import defpackage.afsm;
import defpackage.aftc;
import defpackage.afyc;
import defpackage.agsg;
import defpackage.agsl;
import defpackage.agyo;
import defpackage.ahqo;
import defpackage.ahrf;
import defpackage.aihn;
import defpackage.aill;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqfo;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fgti;
import defpackage.fnvd;
import defpackage.fnvu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RejectSaveOperation extends IntentOperation implements eqfo {
    public static final ausn a = ausn.b("RejectSaveOperation", auid.AUTOFILL);

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        ((eluo) ((eluo) ((eluo) a.j()).s(th)).ai((char) 1027)).v();
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int length;
        eqgl g;
        agyo x = agsl.a(this).x(this);
        intent.setExtrasClassLoader(RejectSaveOperation.class.getClassLoader());
        aftc aftcVar = (aftc) ekvi.i((DomainUtils$DomainParcel) intent.getParcelableExtra("save_data_domain")).b(new ekut() { // from class: ahkp
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = RejectSaveOperation.a;
                return ((DomainUtils$DomainParcel) obj).a;
            }
        }).f();
        final afsm afsmVar = (afsm) ekvi.i((DomainUtils$DomainParcel) intent.getParcelableExtra("save_application_domain")).b(new ekut() { // from class: ahkq
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ausn ausnVar = RejectSaveOperation.a;
                return (afsm) ((DomainUtils$DomainParcel) obj).a;
            }
        }).f();
        ahrf b = ahrf.b(intent.getIntExtra("save_data_type", 0));
        ekvl.z(aftcVar, "Data domain can not be null.");
        ekvl.z(afsmVar, "Application domain can not be null.");
        ekvl.b(b != ahrf.UNKNOWN_DATA_TYPE, "Data type can not be UNKNOWN_DATA_TYPE.");
        if (b == ahrf.CREDENTIAL) {
            final aihn j = agsl.a(this).j();
            String str = afsmVar.a;
            if (j.s(str) + 1 < fnvd.b()) {
                j.W(str);
            } else if (fnvu.a.lK().T()) {
                if (x.g().h()) {
                    eqgb h = eqgb.h(((afyc) x.g().c()).e(aftcVar));
                    eqdv eqdvVar = new eqdv() { // from class: ahkn
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            ausn ausnVar = RejectSaveOperation.a;
                            return eqgc.i(true);
                        }
                    };
                    eqex eqexVar = eqex.a;
                    g = eqcq.g(eqdl.g(h, eqdvVar, eqexVar), Exception.class, new eqdv() { // from class: ahko
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            ((eluo) ((eluo) ((eluo) RejectSaveOperation.a.j()).s((Exception) obj)).ai(1026)).x("Failed to persist save rejection in Chromesync.");
                            return eqgc.i(false);
                        }
                    }, eqexVar);
                } else {
                    g = eqgc.i(false);
                }
                eqdl.f(g, new ekut() { // from class: ahkm
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        ausn ausnVar = RejectSaveOperation.a;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        aihn.this.V(afsmVar.a);
                        return null;
                    }
                }, eqex.a);
            } else {
                eqgc.t(((afyc) x.g().c()).e(aftcVar), this, eqex.a);
                j.V(str);
            }
        }
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("save_ui_action_event_extra");
            if (byteArrayExtra != null && (length = byteArrayExtra.length) != 0) {
                ahqo ahqoVar = ahqo.a;
                fgqp fgqpVar = fgqp.a;
                fgti fgtiVar = fgti.a;
                fgri y = fgri.y(ahqoVar, byteArrayExtra, 0, length, fgqp.a);
                fgri.M(y);
                final ahqo ahqoVar2 = (ahqo) y;
                x.b().P(new ekww() { // from class: ahkr
                    @Override // defpackage.ekww
                    public final Object lK() {
                        ausn ausnVar = RejectSaveOperation.a;
                        return ahqo.this;
                    }
                });
            }
        } catch (fgsd unused) {
        }
        ekvi n = agsl.a(this).n();
        if (n.h() && ((agsg) n.c()).b(2)) {
            Intent k = aill.k(agsg.a(2));
            k.addFlags(268435456);
            startActivity(k);
        }
    }
}
