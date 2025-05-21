package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.SightedDeviceInteractionIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bduw;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bfdp;
import defpackage.dwup;
import defpackage.egmx;
import defpackage.ejhf;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensm;
import defpackage.eukm;
import defpackage.febw;
import defpackage.fedk;
import defpackage.fegf;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SightedDeviceInteractionIntentOperation extends IntentOperation {
    public static final asot a = asot.b("SightedDeviceIntOp", asej.FIND_MY_DEVICE_SPOT);
    public final bduw b;
    private final Executor c;

    public SightedDeviceInteractionIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.INTERACT_WITH_SIGHTED_DEVICE")) {
            try {
                List<eukm> j = fegf.j(intent, "sighted_device_interactions", eukm.a, febw.a());
                egmx f = egmx.f(ensm.a);
                for (final eukm eukmVar : j) {
                    f = f.i(new enqc() { // from class: beuj
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x00cb, code lost:
                        
                            if (r6.u(defpackage.dwva.COMPONENTLESS) != false) goto L16;
                         */
                        @Override // defpackage.enqc
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final defpackage.enss a(java.lang.Object r11) {
                            /*
                                Method dump skipped, instructions count: 371
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.beuj.a(java.lang.Object):enss");
                        }
                    }, this.c).e(Throwable.class, new enqc() { // from class: beuk
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            Throwable th = (Throwable) obj;
                            asot asotVar = SightedDeviceInteractionIntentOperation.a;
                            if (th instanceof InterruptedException) {
                                return ensj.h(th);
                            }
                            ((ejhf) ((ejhf) ((ejhf) SightedDeviceInteractionIntentOperation.a.j()).s(th)).ah((char) 4406)).x("Error interacting with a sighted device.");
                            return ensm.a;
                        }
                    }, enre.a);
                }
                dwup.a("Interaction with sighted device", f);
            } catch (fedk | NullPointerException unused) {
                ((ejhf) ((ejhf) a.j()).ah((char) 4408)).x("Invalid sighted device interaction list.");
            }
        }
    }

    public SightedDeviceInteractionIntentOperation(bebp bebpVar) {
        this.b = bebpVar.P();
        this.c = bebpVar.G();
    }
}
