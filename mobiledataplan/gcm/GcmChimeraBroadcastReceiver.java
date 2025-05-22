package com.google.android.gms.mobiledataplan.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bkcz;
import defpackage.cgls;
import defpackage.cgzp;
import defpackage.enul;
import defpackage.eqgo;
import defpackage.fcbh;
import defpackage.fhvs;
import defpackage.ftax;
import defpackage.ftbz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;
    private static final ausn d = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);
    eqgo b;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        cgls.c().f(fcbh.a, enul.RECEIVED_BY_GCM, "MDP_Notification", fhvs.RECEIVED_BY_GCM);
        ftax.G();
        if (ftax.G() || ftbz.m()) {
            bkcz.a(context);
            if (!"gcm".equals(bkcz.e(intent))) {
                d.f(cgzp.h()).x("Received broadcasted intent is not a GCM message!");
                return;
            }
            if (this.b == null) {
                this.b = new aupz(1, 9);
            }
            this.b.execute(new Runnable() { // from class: cglh
                /* JADX WARN: Code restructure failed: missing block: B:188:0x03c7, code lost:
                
                    if (r5 == defpackage.fhvq.NOT_ASKED) goto L238;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:502:0x0776, code lost:
                
                    if (r10 != null) goto L438;
                 */
                /* JADX WARN: Removed duplicated region for block: B:195:0x03de  */
                /* JADX WARN: Removed duplicated region for block: B:198:0x03e4  */
                /* JADX WARN: Removed duplicated region for block: B:200:0x03e7  */
                /* JADX WARN: Removed duplicated region for block: B:202:0x03ec  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x0472  */
                /* JADX WARN: Removed duplicated region for block: B:250:0x04c3  */
                /* JADX WARN: Removed duplicated region for block: B:283:0x05bd  */
                /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2544
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cglh.run():void");
                }
            });
        }
    }
}
