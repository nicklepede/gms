package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.ProvisionThisDeviceIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.belh;
import defpackage.bfdp;
import defpackage.dwup;
import defpackage.dwwv;
import defpackage.dwyg;
import defpackage.dwyl;
import defpackage.egmx;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.euhg;
import defpackage.fecj;
import defpackage.fecp;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ProvisionThisDeviceIntentOperation extends IntentOperation {
    public static final asot a = asot.b("SelfReportingSyncIntent", asej.FIND_MY_DEVICE_SPOT);
    public final Context b;
    private final dwwv c;
    private final Executor d;

    public ProvisionThisDeviceIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        euhg euhgVar;
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.PROVISION_THIS_DEVICE")) {
            int intExtra = intent.getIntExtra("enrollment_method", -1);
            int i = 0;
            if (intExtra < 0) {
                ((ejhf) ((ejhf) a.i()).ah((char) 4320)).x("EnrollmentMethod unspecified");
            } else {
                int b = dwyg.b(intExtra);
                if (b == 0) {
                    ((ejhf) ((ejhf) a.i()).ah((char) 4319)).z("Invalid EnrollmentMethod number %d", intExtra);
                } else {
                    i = b;
                }
            }
            if (i != 0) {
                int intExtra2 = intent.getIntExtra("fmdn_state", -1);
                if (intExtra2 < 0) {
                    ((ejhf) ((ejhf) a.i()).ah((char) 4322)).x("FindMyDeviceNetworkState unspecified");
                    euhgVar = null;
                } else {
                    euhg b2 = euhg.b(intExtra2);
                    if (b2 == null) {
                        ((ejhf) ((ejhf) a.i()).ah((char) 4321)).z("Invalid FindMyDeviceNetworkState number %d", intExtra2);
                    }
                    euhgVar = b2;
                }
                if (euhgVar != null) {
                    dwwv dwwvVar = this.c;
                    eigb eigbVar = eigb.a;
                    fecj v = dwyl.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fecp fecpVar = v.b;
                    dwyl dwylVar = (dwyl) fecpVar;
                    dwylVar.b |= 1;
                    dwylVar.e = true;
                    if (!fecpVar.L()) {
                        v.U();
                    }
                    dwyl dwylVar2 = (dwyl) v.b;
                    dwylVar2.d = Integer.valueOf(i - 1);
                    dwylVar2.c = 2;
                    dwup.a("Persisting LKL enrollment", egmx.f(dwwvVar.n(eigbVar, eiid.j((dwyl) v.Q()), eiid.i(euhgVar))).h(new eiho() { // from class: benq
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            ((ejhf) ((ejhf) ProvisionThisDeviceIntentOperation.a.h()).ah((char) 4323)).x("LKL enrollment persisted, but still needs sync to server.");
                            bfcs.m(byjl.a(ProvisionThisDeviceIntentOperation.this.b), !((dwwu) obj).b());
                            return null;
                        }
                    }, this.d));
                }
            }
        }
    }

    private ProvisionThisDeviceIntentOperation(belh belhVar) {
        this(belhVar.F(), belhVar.G(), belhVar.c());
    }

    public ProvisionThisDeviceIntentOperation(dwwv dwwvVar, Executor executor, Context context) {
        this.c = dwwvVar;
        this.d = executor;
        this.b = context;
    }
}
