package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.aoch;
import defpackage.asqg;
import defpackage.eijr;
import defpackage.ppr;
import defpackage.puv;
import defpackage.qad;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class WaitUpdateCompleteOperation extends IntentOperation {
    public static final void a(Intent intent, Intent intent2, boolean z) {
        qad.c(intent2, "progressListener", qad.a(intent, "progressListener"));
        intent2.putExtra("chimera.URGENTLY_REQUESTED_FEATURES", intent.getByteArrayExtra("chimera.URGENTLY_REQUESTED_FEATURES"));
        intent2.putExtra("chimera.CLIENT_SESSION_ID", intent.getStringExtra("chimera.CLIENT_SESSION_ID"));
        intent2.putExtra("startTime", intent.getLongExtra("startTime", SystemClock.uptimeMillis()));
        intent2.putExtra("retryCount", intent.getIntExtra("retryCount", 0) + (z ? 1 : 0));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        puv a = qad.a(intent, "liveListener");
        aoch aochVar = a instanceof aoch ? (aoch) a : null;
        long longExtra = intent.getLongExtra("startTime", 0L);
        if (aochVar != null) {
            try {
                aochVar.b.await(Math.max(TimeUnit.SECONDS.toMillis(asqg.d(new eijr() { // from class: aocg
                    @Override // defpackage.eijr
                    public final Object a() {
                        return Long.valueOf(fmqr.d());
                    }
                }, "gms:chimera:ChimeraCheckin__progress_listener_timeout_secs").longValue()) - (SystemClock.uptimeMillis() - longExtra), 0L), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.interrupted();
            }
            aochVar.c(aochVar.c, this);
            return;
        }
        if (intent.getIntExtra("retryCount", 2) < 2) {
            Intent b = ppr.b(this, null, null, null);
            a(intent, b, true);
            startService(b);
        } else {
            puv a2 = qad.a(intent, "progressListener");
            if (a2 != null) {
                qad.e(a2, 1, this);
            }
        }
    }
}
