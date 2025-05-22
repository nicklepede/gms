package com.google.android.gms.findmydevice.spot.e2ee;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.e2ee.RotateDeviceKeysIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgcy;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgmw;
import defpackage.bgyf;
import defpackage.bhff;
import defpackage.bhfh;
import defpackage.dzgp;
import defpackage.dzgw;
import defpackage.dzha;
import defpackage.dzhc;
import defpackage.ejaa;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.ewvg;
import defpackage.ewvy;
import defpackage.fgpr;
import defpackage.fgrc;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class RotateDeviceKeysIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("RotateDeviceKeysIntent", auid.FIND_MY_DEVICE_SPOT);
    public final bgcy b;
    public final dzhc c;
    public final bgmw d;
    public final bgyf e;
    public final Executor f;

    public RotateDeviceKeysIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ekvi ekviVar;
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.e2ee.ROTATE_DEVICE_KEYS")) {
            if (!bhfh.a()) {
                ((eluo) ((eluo) a.j()).ai((char) 4020)).x("Eddystone use cases are disabled.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            if (stringExtra == null) {
                ((eluo) ((eluo) a.j()).ai((char) 4019)).x("No device information in rotate device keys intent");
                return;
            }
            fgrc v = ewvg.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((ewvg) v.b).b = stringExtra;
            final ewvg ewvgVar = (ewvg) v.Q();
            byte[] byteArrayExtra = intent.getByteArrayExtra("sighted_eid");
            if (byteArrayExtra == null) {
                ((eluo) ((eluo) a.j()).ai((char) 4018)).x("No EID in rotate device keys intent");
                return;
            }
            final fgpr w = fgpr.w(byteArrayExtra);
            ekvi b = intent.hasExtra("component_set") ? dzgw.b(intent.getByteExtra("component_set", (byte) 0)) : ektg.a;
            dzha dzhaVar = dzha.COMPONENTLESS;
            final dzha dzhaVar2 = (dzha) b.b(new ekut() { // from class: dzgy
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return dzha.a((dzgw) obj);
                }
            }).e(dzha.COMPONENTLESS);
            final ewvy b2 = ewvy.b(intent.getIntExtra("trackable_components", 0));
            ekvl.y(b2);
            if (!intent.hasExtra("ble_mac_address") || intent.getStringExtra("ble_mac_address") == null) {
                ekviVar = ektg.a;
            } else {
                String stringExtra2 = intent.getStringExtra("ble_mac_address");
                ekvl.y(stringExtra2);
                ekviVar = ekvi.j(stringExtra2);
            }
            final ekvi ekviVar2 = ekviVar;
            dzgp.a("Secrets rotation", ejaa.g(this.c.e(ewvgVar, Long.MAX_VALUE)).i(new eqdv() { // from class: bfmy
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        ((eluo) ((eluo) RotateDeviceKeysIntentOperation.a.h()).ai((char) 4014)).x("Device no longer requires rotation");
                        return eqgf.a;
                    }
                    final dzha dzhaVar3 = dzhaVar2;
                    final ekvi ekviVar3 = ekviVar2;
                    final ewvy ewvyVar = b2;
                    final fgpr fgprVar = w;
                    final ewvg ewvgVar2 = ewvgVar;
                    final RotateDeviceKeysIntentOperation rotateDeviceKeysIntentOperation = RotateDeviceKeysIntentOperation.this;
                    return ejaa.g(rotateDeviceKeysIntentOperation.c.j(ewvgVar2)).i(new eqdv() { // from class: bfmz
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj2) {
                            ekvi ekviVar4 = (ekvi) obj2;
                            if (!ekviVar4.h() || !((dzgv) ekviVar4.c()).b.h()) {
                                ((eluo) ((eluo) RotateDeviceKeysIntentOperation.a.j()).ai((char) 4015)).x("Could not find user secrets for rotating device");
                                return eqgf.a;
                            }
                            final ekvi ekviVar5 = ekviVar3;
                            final ewvy ewvyVar2 = ewvyVar;
                            final fgpr fgprVar2 = fgprVar;
                            final ewvg ewvgVar3 = ewvgVar2;
                            final RotateDeviceKeysIntentOperation rotateDeviceKeysIntentOperation2 = RotateDeviceKeysIntentOperation.this;
                            final Account account = ((dzgv) ekviVar4.c()).f;
                            Object k = rotateDeviceKeysIntentOperation2.b.b(account).k();
                            final dzin dzinVar = (dzin) ((dzgv) ekviVar4.c()).b.c();
                            final bfes bfesVar = (bfes) k;
                            ekvi b3 = dzinVar.b.b(new ekut() { // from class: bfer
                                @Override // defpackage.ekut
                                public final Object apply(Object obj3) {
                                    bfgz bfgzVar = bfes.this.a;
                                    dpvo dpvoVar = (dpvo) bfgzVar.a.a();
                                    dpvoVar.getClass();
                                    dyzu a2 = ((dyzv) bfgzVar.b).a();
                                    dzhc dzhcVar = (dzhc) bfgzVar.c.a();
                                    dzhcVar.getClass();
                                    dyun dyunVar = (dyun) bfgzVar.d.a();
                                    dyunVar.getClass();
                                    dyuy a3 = ((dyuz) bfgzVar.e).a();
                                    bfhm a4 = ((bfhn) bfgzVar.f).a();
                                    fxqo fxqoVar = bfgzVar.h;
                                    Object a5 = bfgzVar.g.a();
                                    Executor executor = (Executor) fxqoVar.a();
                                    executor.getClass();
                                    ewvg ewvgVar4 = ewvgVar3;
                                    ewvgVar4.getClass();
                                    return new bfgy(dpvoVar, a2, dzhcVar, dyunVar, a3, a4, (bfeo) a5, executor, ewvgVar4, fgprVar2, ewvyVar2, dzinVar, ekviVar5);
                                }
                            });
                            if (b3.h()) {
                                final dzha dzhaVar4 = dzhaVar3;
                                return ejaa.g(((bfeq) b3.c()).a()).h(new ekut() { // from class: bfnb
                                    @Override // defpackage.ekut
                                    public final Object apply(Object obj3) {
                                        RotateDeviceKeysIntentOperation rotateDeviceKeysIntentOperation3 = RotateDeviceKeysIntentOperation.this;
                                        rotateDeviceKeysIntentOperation3.e.a();
                                        rotateDeviceKeysIntentOperation3.d.f(ewvgVar3, dzhaVar4, account, false, fbrp.POST_EIK_ROTATION);
                                        return null;
                                    }
                                }, rotateDeviceKeysIntentOperation2.f);
                            }
                            ((eluo) ((eluo) RotateDeviceKeysIntentOperation.a.j()).ai((char) 4016)).x("Could not create a secrets rotation task");
                            return eqgf.a;
                        }
                    }, rotateDeviceKeysIntentOperation.f).h(new ekut() { // from class: bfna
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            ausn ausnVar = RotateDeviceKeysIntentOperation.a;
                            return null;
                        }
                    }, eqex.a);
                }
            }, this.f));
        }
    }

    public RotateDeviceKeysIntentOperation(bgcy bgcyVar, dzhc dzhcVar, bgmw bgmwVar, bgyf bgyfVar, Executor executor) {
        this.b = bgcyVar;
        this.c = dzhcVar;
        this.d = bgmwVar;
        this.e = bgyfVar;
        this.f = executor;
    }

    private RotateDeviceKeysIntentOperation(bgdb bgdbVar) {
        this(bgdbVar.i(), bgdbVar.D(), bgdbVar.o(), bgdbVar.w(), bgdbVar.G());
    }
}
