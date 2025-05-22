package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.SightedDeviceInteractionIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bfwi;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bhff;
import defpackage.dzgp;
import defpackage.ejaa;
import defpackage.eluo;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgf;
import defpackage.exaf;
import defpackage.fgqp;
import defpackage.fgsd;
import defpackage.fguy;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SightedDeviceInteractionIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("SightedDeviceIntOp", auid.FIND_MY_DEVICE_SPOT);
    public final bfwi b;
    private final Executor c;

    public SightedDeviceInteractionIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.INTERACT_WITH_SIGHTED_DEVICE")) {
            try {
                List<exaf> j = fguy.j(intent, "sighted_device_interactions", exaf.a, fgqp.a());
                ejaa g = ejaa.g(eqgf.a);
                for (final exaf exafVar : j) {
                    g = g.i(new eqdv() { // from class: bgvw
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
                        
                            if (r6.u(defpackage.dzha.COMPONENTLESS) != false) goto L16;
                         */
                        @Override // defpackage.eqdv
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final defpackage.eqgl a(java.lang.Object r11) {
                            /*
                                Method dump skipped, instructions count: 369
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.bgvw.a(java.lang.Object):eqgl");
                        }
                    }, this.c).f(Throwable.class, new eqdv() { // from class: bgvx
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            Throwable th = (Throwable) obj;
                            ausn ausnVar = SightedDeviceInteractionIntentOperation.a;
                            if (th instanceof InterruptedException) {
                                return eqgc.h(th);
                            }
                            ((eluo) ((eluo) ((eluo) SightedDeviceInteractionIntentOperation.a.j()).s(th)).ai((char) 4411)).x("Error interacting with a sighted device.");
                            return eqgf.a;
                        }
                    }, eqex.a);
                }
                dzgp.a("Interaction with sighted device", g);
            } catch (fgsd | NullPointerException unused) {
                ((eluo) ((eluo) a.j()).ai((char) 4413)).x("Invalid sighted device interaction list.");
            }
        }
    }

    public SightedDeviceInteractionIntentOperation(bgdb bgdbVar) {
        this.b = bgdbVar.P();
        this.c = bgdbVar.G();
    }
}
