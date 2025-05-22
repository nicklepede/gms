package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.ProvisionThisDeviceIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgmt;
import defpackage.bhff;
import defpackage.dzgp;
import defpackage.dziv;
import defpackage.dzkg;
import defpackage.dzkl;
import defpackage.ejaa;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.ewwz;
import defpackage.fgrc;
import defpackage.fgri;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ProvisionThisDeviceIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("SelfReportingSyncIntent", auid.FIND_MY_DEVICE_SPOT);
    public final Context b;
    private final dziv c;
    private final Executor d;

    public ProvisionThisDeviceIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ewwz ewwzVar;
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.PROVISION_THIS_DEVICE")) {
            int intExtra = intent.getIntExtra("enrollment_method", -1);
            int i = 0;
            if (intExtra < 0) {
                ((eluo) ((eluo) a.i()).ai((char) 4326)).x("EnrollmentMethod unspecified");
            } else {
                int a2 = dzkg.a(intExtra);
                if (a2 == 0) {
                    ((eluo) ((eluo) a.i()).ai((char) 4325)).z("Invalid EnrollmentMethod number %d", intExtra);
                } else {
                    i = a2;
                }
            }
            if (i != 0) {
                int intExtra2 = intent.getIntExtra("fmdn_state", -1);
                if (intExtra2 < 0) {
                    ((eluo) ((eluo) a.i()).ai((char) 4328)).x("FindMyDeviceNetworkState unspecified");
                    ewwzVar = null;
                } else {
                    ewwz b = ewwz.b(intExtra2);
                    if (b == null) {
                        ((eluo) ((eluo) a.i()).ai((char) 4327)).z("Invalid FindMyDeviceNetworkState number %d", intExtra2);
                    }
                    ewwzVar = b;
                }
                if (ewwzVar != null) {
                    dziv dzivVar = this.c;
                    ektg ektgVar = ektg.a;
                    fgrc v = dzkl.a.v();
                    if (!v.b.L()) {
                        v.U();
                    }
                    fgri fgriVar = v.b;
                    dzkl dzklVar = (dzkl) fgriVar;
                    dzklVar.b |= 1;
                    dzklVar.e = true;
                    if (!fgriVar.L()) {
                        v.U();
                    }
                    dzkl dzklVar2 = (dzkl) v.b;
                    dzklVar2.d = Integer.valueOf(i - 1);
                    dzklVar2.c = 2;
                    dzgp.a("Persisting LKL enrollment", ejaa.g(dzivVar.n(ektgVar, ekvi.j((dzkl) v.Q()), ekvi.i(ewwzVar))).h(new ekut() { // from class: bgpc
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            ((eluo) ((eluo) ProvisionThisDeviceIntentOperation.a.h()).ai((char) 4329)).x("LKL enrollment persisted, but still needs sync to server.");
                            bhei.m(casd.a(ProvisionThisDeviceIntentOperation.this.b), !((dziu) obj).b());
                            return null;
                        }
                    }, this.d));
                }
            }
        }
    }

    private ProvisionThisDeviceIntentOperation(bgmt bgmtVar) {
        this(bgmtVar.F(), bgmtVar.G(), bgmtVar.c());
    }

    public ProvisionThisDeviceIntentOperation(dziv dzivVar, Executor executor, Context context) {
        this.c = dzivVar;
        this.d = executor;
        this.b = context;
    }
}
