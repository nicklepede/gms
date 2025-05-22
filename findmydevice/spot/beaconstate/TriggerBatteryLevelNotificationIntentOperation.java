package com.google.android.gms.findmydevice.spot.beaconstate;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bezo;
import defpackage.bezp;
import defpackage.bfao;
import defpackage.bgco;
import defpackage.bgcw;
import defpackage.bgcx;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhff;
import defpackage.bhkp;
import defpackage.dpvo;
import defpackage.dzgp;
import defpackage.dzhc;
import defpackage.ejaa;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgp;
import defpackage.ewvg;
import defpackage.fgrc;
import defpackage.flnj;
import defpackage.fqsv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class TriggerBatteryLevelNotificationIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("BatteryLevelNotifIntOp", auid.FIND_MY_DEVICE_SPOT);
    private final bgcx b;

    public TriggerBatteryLevelNotificationIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int i;
        eqgl e;
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.beaconstate.TRIGGER_BATTERY_LEVEL_NOTIFICATION")) {
            if (!fqsv.f()) {
                ((eluo) ((eluo) a.j()).ai((char) 3940)).x("Fast Pair Accessories are disabled.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            if (stringExtra == null) {
                ((eluo) ((eluo) a.j()).ai((char) 3939)).x("No canonic device id in intent");
                return;
            }
            fgrc v = ewvg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((ewvg) v.b).b = stringExtra;
            ewvg ewvgVar = (ewvg) v.Q();
            int intExtra = intent.getIntExtra("battery_level", -1);
            if (intExtra == -1) {
                ((eluo) ((eluo) a.j()).ai((char) 3938)).x("No battery level in intent");
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
                ((eluo) ((eluo) a.j()).ai((char) 3937)).z("Unexpected battery level %s", intExtra);
                return;
            }
            Account account = (Account) intent.getParcelableExtra("account");
            if (account != null) {
                bgco b = this.b.b(account);
                bgda bgdaVar = b.P;
                flnj flnjVar = b.e;
                flnj flnjVar2 = bgdaVar.w;
                flnj flnjVar3 = bgdaVar.e;
                flnj flnjVar4 = bgdaVar.b;
                flnjVar2.getClass();
                flnjVar3.getClass();
                flnjVar4.getClass();
                Context b2 = bgcw.b();
                dzhc dzhcVar = (dzhc) flnjVar2.a();
                dzhcVar.getClass();
                bezo a2 = ((bezp) flnjVar).a();
                dpvo dpvoVar = (dpvo) flnjVar3.a();
                dpvoVar.getClass();
                eqgp eqgpVar = (eqgp) flnjVar4.a();
                eqgpVar.getClass();
                ewvgVar.getClass();
                final bfao bfaoVar = new bfao(b2, dzhcVar, a2, dpvoVar, eqgpVar, ewvgVar, i);
                if (bhkp.b(bfaoVar.b, bfaoVar.g)) {
                    ejaa g = ejaa.g(bfaoVar.c.j(bfaoVar.f));
                    eqdv eqdvVar = new eqdv() { // from class: bfal
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            ekvi ekviVar = (ekvi) obj;
                            if (!ekviVar.h()) {
                                ((eluo) bfao.a.j()).x("Failed notifying battery level change - no device in cache.");
                                return eqgc.i(ektg.a);
                            }
                            bfao bfaoVar2 = bfao.this;
                            if (!bfaj.a((dzgv) ekviVar.c(), bfaoVar2.h, bfaoVar2.d.d().toEpochMilli())) {
                                ((eluo) bfao.a.j()).x("Should not trigger battery level notification.");
                                return eqgc.i(ektg.a);
                            }
                            bezo bezoVar = bfaoVar2.i;
                            ewvg ewvgVar2 = bfaoVar2.f;
                            ewzo ewzoVar = (ewzo) bezoVar.a.o(cbot.a, bzzl.b);
                            ewxb ewxbVar = ewxb.a;
                            fgrc v2 = ewxbVar.v();
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            ewxb ewxbVar2 = (ewxb) v2.b;
                            ewxbVar2.c = ewvgVar2;
                            ewxbVar2.b |= 1;
                            ewxb ewxbVar3 = (ewxb) v2.Q();
                            fwpk fwpkVar = ewzoVar.a;
                            fwtc fwtcVar = ewzp.j;
                            if (fwtcVar == null) {
                                synchronized (ewzp.class) {
                                    fwtcVar = ewzp.j;
                                    if (fwtcVar == null) {
                                        fwsz a3 = fwtc.a();
                                        a3.c = fwtb.UNARY;
                                        a3.d = fwtc.c("google.internal.spot.v1.SpotService", "GetBleDevice");
                                        a3.b();
                                        fgqp fgqpVar = fxnm.a;
                                        a3.a = new fxnl(ewxbVar);
                                        a3.b = new fxnl(ewxc.a);
                                        fwtc a4 = a3.a();
                                        ewzp.j = a4;
                                        fwtcVar = a4;
                                    }
                                }
                            }
                            return ejaa.g(beyo.a(fxnz.a(fwpkVar.a(fwtcVar, ewzoVar.b), ewxbVar3), "getOwnedDevice")).h(new ekut() { // from class: bezf
                                @Override // defpackage.ekut
                                public final Object apply(Object obj2) {
                                    ewxc ewxcVar = (ewxc) obj2;
                                    if ((ewxcVar.b & 1) == 0) {
                                        return ektg.a;
                                    }
                                    ewvv ewvvVar = ewxcVar.c;
                                    if (ewvvVar == null) {
                                        ewvvVar = ewvv.a;
                                    }
                                    return ekvi.j(ewvvVar);
                                }
                            }, bezoVar.c);
                        }
                    };
                    eqgp eqgpVar2 = bfaoVar.e;
                    e = g.i(eqdvVar, eqgpVar2).i(new eqdv() { // from class: bfam
                        /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
                        
                            if (r0 != 28) goto L35;
                         */
                        @Override // defpackage.eqdv
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final defpackage.eqgl a(java.lang.Object r10) {
                            /*
                                Method dump skipped, instructions count: 267
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bfam.a(java.lang.Object):eqgl");
                        }
                    }, eqgpVar2).e(Exception.class, new ekut() { // from class: bfan
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ((eluo) ((eluo) bfao.a.j()).s((Exception) obj)).x("Failed notifying battery level change.");
                            return null;
                        }
                    }, eqgpVar2);
                } else {
                    e = eqgf.a;
                }
                dzgp.a("Triggering battery level notification", e);
            }
        }
    }

    public TriggerBatteryLevelNotificationIntentOperation(bgdb bgdbVar) {
        this.b = bgdbVar.i();
    }
}
