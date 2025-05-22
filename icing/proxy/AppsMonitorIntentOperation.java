package com.google.android.gms.icing.proxy;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bnwi;
import defpackage.bnyn;
import defpackage.bnyq;
import defpackage.bnyr;
import defpackage.ekus;
import defpackage.fpow;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppsMonitorIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(final Intent intent) {
        if (intent == null) {
            return;
        }
        if (ekus.a(intent.getAction(), "android.intent.action.PACKAGE_CHANGED") && fpow.c()) {
            return;
        }
        if (ekus.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        try {
            final bnwi c = bnwi.c(this);
            if (c != null && intent.getAction() != null) {
                bnyr.a().b(new bnyq(new Runnable() { // from class: bnwf
                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Removed duplicated region for block: B:90:0x0195 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 464
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnwf.run():void");
                    }
                }, "AppsCorpusProcessChangeRunnable"));
            }
        } catch (Exception e) {
            bnyn.i(e, "Failed to handle package changes", new Object[0]);
        }
        Intent b = UpdateIcingCorporaIntentOperation.b(this);
        if (b != null) {
            startService(b);
        }
    }
}
