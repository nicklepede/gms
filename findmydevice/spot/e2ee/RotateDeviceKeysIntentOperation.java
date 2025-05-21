package com.google.android.gms.findmydevice.spot.e2ee;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.e2ee.RotateDeviceKeysIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebm;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.belk;
import defpackage.bews;
import defpackage.bfdp;
import defpackage.bfdr;
import defpackage.dwup;
import defpackage.dwuw;
import defpackage.dwva;
import defpackage.dwvc;
import defpackage.egmx;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.eufn;
import defpackage.eugf;
import defpackage.feay;
import defpackage.fecj;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RotateDeviceKeysIntentOperation extends IntentOperation {
    public static final asot a = asot.b("RotateDeviceKeysIntent", asej.FIND_MY_DEVICE_SPOT);
    public final bebm b;
    public final dwvc c;
    public final belk d;
    public final bews e;
    public final Executor f;

    public RotateDeviceKeysIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eiid eiidVar;
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.e2ee.ROTATE_DEVICE_KEYS")) {
            if (!bfdr.a()) {
                ((ejhf) ((ejhf) a.j()).ah((char) 4014)).x("Eddystone use cases are disabled.");
                return;
            }
            String stringExtra = intent.getStringExtra("device_id");
            if (stringExtra == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 4013)).x("No device information in rotate device keys intent");
                return;
            }
            fecj v = eufn.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ((eufn) v.b).b = stringExtra;
            final eufn eufnVar = (eufn) v.Q();
            byte[] byteArrayExtra = intent.getByteArrayExtra("sighted_eid");
            if (byteArrayExtra == null) {
                ((ejhf) ((ejhf) a.j()).ah((char) 4012)).x("No EID in rotate device keys intent");
                return;
            }
            final feay w = feay.w(byteArrayExtra);
            eiid b = intent.hasExtra("component_set") ? dwuw.b(intent.getByteExtra("component_set", (byte) 0)) : eigb.a;
            dwva dwvaVar = dwva.COMPONENTLESS;
            final dwva dwvaVar2 = (dwva) b.b(new eiho() { // from class: dwuy
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return dwva.a((dwuw) obj);
                }
            }).e(dwva.COMPONENTLESS);
            final eugf b2 = eugf.b(intent.getIntExtra("trackable_components", 0));
            eiig.x(b2);
            if (!intent.hasExtra("ble_mac_address") || intent.getStringExtra("ble_mac_address") == null) {
                eiidVar = eigb.a;
            } else {
                String stringExtra2 = intent.getStringExtra("ble_mac_address");
                eiig.x(stringExtra2);
                eiidVar = eiid.j(stringExtra2);
            }
            final eiid eiidVar2 = eiidVar;
            dwup.a("Secrets rotation", egmx.f(this.c.e(eufnVar, Long.MAX_VALUE)).i(new enqc() { // from class: bdlm
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        ((ejhf) ((ejhf) RotateDeviceKeysIntentOperation.a.h()).ah((char) 4008)).x("Device no longer requires rotation");
                        return ensm.a;
                    }
                    final dwva dwvaVar3 = dwvaVar2;
                    final eiid eiidVar3 = eiidVar2;
                    final eugf eugfVar = b2;
                    final feay feayVar = w;
                    final eufn eufnVar2 = eufnVar;
                    final RotateDeviceKeysIntentOperation rotateDeviceKeysIntentOperation = RotateDeviceKeysIntentOperation.this;
                    return egmx.f(rotateDeviceKeysIntentOperation.c.j(eufnVar2)).i(new enqc() { // from class: bdln
                        @Override // defpackage.enqc
                        public final enss a(Object obj2) {
                            eiid eiidVar4 = (eiid) obj2;
                            if (!eiidVar4.h() || !((dwuv) eiidVar4.c()).b.h()) {
                                ((ejhf) ((ejhf) RotateDeviceKeysIntentOperation.a.j()).ah((char) 4009)).x("Could not find user secrets for rotating device");
                                return ensm.a;
                            }
                            final eiid eiidVar5 = eiidVar3;
                            final eugf eugfVar2 = eugfVar;
                            final feay feayVar2 = feayVar;
                            final eufn eufnVar3 = eufnVar2;
                            final RotateDeviceKeysIntentOperation rotateDeviceKeysIntentOperation2 = RotateDeviceKeysIntentOperation.this;
                            final Account account = ((dwuv) eiidVar4.c()).f;
                            Object k = rotateDeviceKeysIntentOperation2.b.b(account).k();
                            final dwwn dwwnVar = (dwwn) ((dwuv) eiidVar4.c()).b.c();
                            final bddg bddgVar = (bddg) k;
                            eiid b3 = dwwnVar.b.b(new eiho() { // from class: bddf
                                @Override // defpackage.eiho
                                public final Object apply(Object obj3) {
                                    bdfn bdfnVar = bddg.this.a;
                                    dnlf dnlfVar = (dnlf) bdfnVar.a.a();
                                    dnlfVar.getClass();
                                    dwnt a2 = ((dwnu) bdfnVar.b).a();
                                    dwvc dwvcVar = (dwvc) bdfnVar.c.a();
                                    dwvcVar.getClass();
                                    dwim dwimVar = (dwim) bdfnVar.d.a();
                                    dwimVar.getClass();
                                    dwix a3 = ((dwiy) bdfnVar.e).a();
                                    bdga a4 = ((bdgb) bdfnVar.f).a();
                                    fuuq fuuqVar = bdfnVar.h;
                                    Object a5 = bdfnVar.g.a();
                                    Executor executor = (Executor) fuuqVar.a();
                                    executor.getClass();
                                    eufn eufnVar4 = eufnVar3;
                                    eufnVar4.getClass();
                                    return new bdfm(dnlfVar, a2, dwvcVar, dwimVar, a3, a4, (bddc) a5, executor, eufnVar4, feayVar2, eugfVar2, dwwnVar, eiidVar5);
                                }
                            });
                            if (b3.h()) {
                                final dwva dwvaVar4 = dwvaVar3;
                                return egmx.f(((bdde) b3.c()).a()).h(new eiho() { // from class: bdlp
                                    @Override // defpackage.eiho
                                    public final Object apply(Object obj3) {
                                        RotateDeviceKeysIntentOperation rotateDeviceKeysIntentOperation3 = RotateDeviceKeysIntentOperation.this;
                                        rotateDeviceKeysIntentOperation3.e.a();
                                        rotateDeviceKeysIntentOperation3.d.f(eufnVar3, dwvaVar4, account, false, ezda.POST_EIK_ROTATION);
                                        return null;
                                    }
                                }, rotateDeviceKeysIntentOperation2.f);
                            }
                            ((ejhf) ((ejhf) RotateDeviceKeysIntentOperation.a.j()).ah((char) 4010)).x("Could not create a secrets rotation task");
                            return ensm.a;
                        }
                    }, rotateDeviceKeysIntentOperation.f).h(new eiho() { // from class: bdlo
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            asot asotVar = RotateDeviceKeysIntentOperation.a;
                            return null;
                        }
                    }, enre.a);
                }
            }, this.f));
        }
    }

    public RotateDeviceKeysIntentOperation(bebm bebmVar, dwvc dwvcVar, belk belkVar, bews bewsVar, Executor executor) {
        this.b = bebmVar;
        this.c = dwvcVar;
        this.d = belkVar;
        this.e = bewsVar;
        this.f = executor;
    }

    private RotateDeviceKeysIntentOperation(bebp bebpVar) {
        this(bebpVar.i(), bebpVar.D(), bebpVar.o(), bebpVar.w(), bebpVar.G());
    }
}
