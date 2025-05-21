package com.google.android.gms.icing.proxy;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.blpq;
import defpackage.blrv;
import defpackage.blry;
import defpackage.blrz;
import defpackage.eihn;
import defpackage.fmwx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AppsMonitorIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(final Intent intent) {
        if (intent == null) {
            return;
        }
        if (eihn.a(intent.getAction(), "android.intent.action.PACKAGE_CHANGED") && fmwx.c()) {
            return;
        }
        if (eihn.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        try {
            final blpq c = blpq.c(this);
            if (c != null && intent.getAction() != null) {
                blrz.a().b(new blry(new Runnable() { // from class: blpn
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
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.blpn.run():void");
                    }
                }, "AppsCorpusProcessChangeRunnable"));
            }
        } catch (Exception e) {
            blrv.i(e, "Failed to handle package changes", new Object[0]);
        }
        Intent b = UpdateIcingCorporaIntentOperation.b(this);
        if (b != null) {
            startService(b);
        }
    }
}
