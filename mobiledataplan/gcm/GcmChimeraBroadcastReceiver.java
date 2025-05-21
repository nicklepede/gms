package com.google.android.gms.mobiledataplan.gcm;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bhyk;
import defpackage.cecl;
import defpackage.ceqi;
import defpackage.elgy;
import defpackage.ensv;
import defpackage.ezms;
import defpackage.ffgu;
import defpackage.fqhf;
import defpackage.fqih;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int c = 0;
    private static final asot d = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);
    ensv b;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        cecl.c().f(ezms.a, elgy.RECEIVED_BY_GCM, "MDP_Notification", ffgu.RECEIVED_BY_GCM);
        fqhf.G();
        if (fqhf.G() || fqih.m()) {
            bhyk.a(context);
            if (!"gcm".equals(bhyk.e(intent))) {
                d.f(ceqi.h()).x("Received broadcasted intent is not a GCM message!");
                return;
            }
            if (this.b == null) {
                this.b = new asmf(1, 9);
            }
            this.b.execute(new Runnable() { // from class: ceca
                /* JADX WARN: Code restructure failed: missing block: B:189:0x03cd, code lost:
                
                    if (r5 == defpackage.ffgs.NOT_ASKED) goto L240;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:504:0x0780, code lost:
                
                    if (r10 != null) goto L440;
                 */
                /* JADX WARN: Removed duplicated region for block: B:196:0x03e4  */
                /* JADX WARN: Removed duplicated region for block: B:199:0x03ea  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x03ed  */
                /* JADX WARN: Removed duplicated region for block: B:203:0x03f2  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x0478  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x04c9  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x05c5  */
                /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2554
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.ceca.run():void");
                }
            });
        }
    }
}
