package com.google.android.gms.findmydevice.spot.beaconstate;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.asej;
import defpackage.asot;
import defpackage.bcyc;
import defpackage.bcyd;
import defpackage.bczc;
import defpackage.bebc;
import defpackage.bebk;
import defpackage.bebl;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfdp;
import defpackage.bfiz;
import defpackage.dnlf;
import defpackage.dwup;
import defpackage.dwvc;
import defpackage.egmx;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ensw;
import defpackage.eufn;
import defpackage.fecj;
import defpackage.fixm;
import defpackage.fobb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TriggerBatteryLevelNotificationIntentOperation extends IntentOperation {
    private static final asot a = asot.b("BatteryLevelNotifIntOp", asej.FIND_MY_DEVICE_SPOT);
    private final bebl b;

    public TriggerBatteryLevelNotificationIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        enss d;
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.beaconstate.TRIGGER_BATTERY_LEVEL_NOTIFICATION")) {
            if (!fobb.f()) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3934)).x("Fast Pair Accessories are disabled.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            if (stringExtra == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3933)).x("No canonic device id in intent");
                return;
            }
            fecj v = eufn.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((eufn) v.b).b = stringExtra;
            eufn eufnVar = (eufn) v.Q();
            int intExtra = intent.getIntExtra("battery_level", -1);
            if (intExtra == -1) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3932)).x("No battery level in intent");
                return;
            }
            if (intExtra != 0) {
                int i2 = 2;
                if (intExtra != 1) {
                    if (intExtra == 2) {
                        i = 3;
                    } else {
                        if (intExtra != 3) {
                            throw new IllegalStateException(a.j(intExtra, "Invalid battery level int value - "));
                        }
                        i2 = 4;
                    }
                }
                i = i2;
            } else {
                i = 1;
            }
            int i3 = i - 1;
            if (i3 == 0 || i3 == 1) {
                ((ejhf) ((ejhf) a.j()).ah((char) 3931)).z("Unexpected battery level %s", intExtra);
                return;
            }
            Account account = (Account) intent.getParcelableExtra("account");
            if (account != null) {
                bebc b = this.b.b(account);
                bebo beboVar = b.P;
                fixm fixmVar = b.e;
                fixm fixmVar2 = beboVar.w;
                fixm fixmVar3 = beboVar.e;
                fixm fixmVar4 = beboVar.b;
                fixmVar2.getClass();
                fixmVar3.getClass();
                fixmVar4.getClass();
                Context b2 = bebk.b();
                dwvc dwvcVar = (dwvc) fixmVar2.a();
                dwvcVar.getClass();
                bcyc a2 = ((bcyd) fixmVar).a();
                dnlf dnlfVar = (dnlf) fixmVar3.a();
                dnlfVar.getClass();
                ensw enswVar = (ensw) fixmVar4.a();
                enswVar.getClass();
                eufnVar.getClass();
                final bczc bczcVar = new bczc(b2, dwvcVar, a2, dnlfVar, enswVar, eufnVar, i);
                if (bfiz.b(bczcVar.b, bczcVar.g)) {
                    egmx f = egmx.f(bczcVar.c.j(bczcVar.f));
                    enqc enqcVar = new enqc() { // from class: bcyz
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            eiid eiidVar = (eiid) obj;
                            if (!eiidVar.h()) {
                                ((ejhf) bczc.a.j()).x("Failed notifying battery level change - no device in cache.");
                                return ensj.i(eigb.a);
                            }
                            bczc bczcVar2 = bczc.this;
                            if (!bcyx.a((dwuv) eiidVar.c(), bczcVar2.h, bczcVar2.d.d().toEpochMilli())) {
                                ((ejhf) bczc.a.j()).x("Should not trigger battery level notification.");
                                return ensj.i(eigb.a);
                            }
                            bcyc bcycVar = bczcVar2.i;
                            eufn eufnVar2 = bczcVar2.f;
                            eujv eujvVar = (eujv) bcycVar.a.o(bzgc.a, bxqv.b);
                            euhi euhiVar = euhi.a;
                            fecj v2 = euhiVar.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            euhi euhiVar2 = (euhi) v2.b;
                            euhiVar2.c = eufnVar2;
                            euhiVar2.b |= 1;
                            euhi euhiVar3 = (euhi) v2.Q();
                            fttm fttmVar = eujvVar.a;
                            ftxe ftxeVar = eujw.j;
                            if (ftxeVar == null) {
                                synchronized (eujw.class) {
                                    ftxeVar = eujw.j;
                                    if (ftxeVar == null) {
                                        ftxb a3 = ftxe.a();
                                        a3.c = ftxd.UNARY;
                                        a3.d = ftxe.c("google.internal.spot.v1.SpotService", "GetBleDevice");
                                        a3.b();
                                        febw febwVar = furo.a;
                                        a3.a = new furn(euhiVar);
                                        a3.b = new furn(euhj.a);
                                        ftxe a4 = a3.a();
                                        eujw.j = a4;
                                        ftxeVar = a4;
                                    }
                                }
                            }
                            return egmx.f(bcxc.a(fusb.a(fttmVar.a(ftxeVar, eujvVar.b), euhiVar3), "getOwnedDevice", bcycVar.e)).h(new eiho() { // from class: bcxt
                                @Override // defpackage.eiho
                                public final Object apply(Object obj2) {
                                    euhj euhjVar = (euhj) obj2;
                                    if ((euhjVar.b & 1) == 0) {
                                        return eigb.a;
                                    }
                                    eugc eugcVar = euhjVar.c;
                                    if (eugcVar == null) {
                                        eugcVar = eugc.a;
                                    }
                                    return eiid.j(eugcVar);
                                }
                            }, bcycVar.c);
                        }
                    };
                    ensw enswVar2 = bczcVar.e;
                    d = f.i(enqcVar, enswVar2).i(new enqc() { // from class: bcza
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
                        
                            if (r0 != 28) goto L35;
                         */
                        @Override // defpackage.enqc
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final defpackage.enss a(java.lang.Object r10) {
                            /*
                                Method dump skipped, instructions count: 267
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bcza.a(java.lang.Object):enss");
                        }
                    }, enswVar2).d(Exception.class, new eiho() { // from class: bczb
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            ((ejhf) ((ejhf) bczc.a.j()).s((Exception) obj)).x("Failed notifying battery level change.");
                            return null;
                        }
                    }, enswVar2);
                } else {
                    d = ensm.a;
                }
                dwup.a("Triggering battery level notification", d);
            }
        }
    }

    public TriggerBatteryLevelNotificationIntentOperation(bebp bebpVar) {
        this.b = bebpVar.i();
    }
}
