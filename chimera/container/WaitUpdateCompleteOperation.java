package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.aqdz;
import defpackage.auua;
import defpackage.ekww;
import defpackage.riv;
import defpackage.rnz;
import defpackage.rth;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class WaitUpdateCompleteOperation extends IntentOperation {
    public static final void a(Intent intent, Intent intent2, boolean z) {
        rth.c(intent2, "progressListener", rth.a(intent, "progressListener"));
        intent2.putExtra("chimera.URGENTLY_REQUESTED_FEATURES", intent.getByteArrayExtra("chimera.URGENTLY_REQUESTED_FEATURES"));
        intent2.putExtra("chimera.CLIENT_SESSION_ID", intent.getStringExtra("chimera.CLIENT_SESSION_ID"));
        intent2.putExtra("startTime", intent.getLongExtra("startTime", SystemClock.uptimeMillis()));
        intent2.putExtra("retryCount", intent.getIntExtra("retryCount", 0) + (z ? 1 : 0));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        rnz a = rth.a(intent, "liveListener");
        aqdz aqdzVar = a instanceof aqdz ? (aqdz) a : null;
        long longExtra = intent.getLongExtra("startTime", 0L);
        if (aqdzVar != null) {
            try {
                aqdzVar.b.await(Math.max(TimeUnit.SECONDS.toMillis(auua.d(new ekww() { // from class: aqdy
                    @Override // defpackage.ekww
                    public final Object lK() {
                        return Long.valueOf(fpip.d());
                    }
                }, "gms:chimera:ChimeraCheckin__progress_listener_timeout_secs").longValue()) - (SystemClock.uptimeMillis() - longExtra), 0L), TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.interrupted();
            }
            aqdzVar.c(aqdzVar.c, this);
            return;
        }
        if (intent.getIntExtra("retryCount", 2) < 2) {
            Intent b = riv.b(this, null, null, null);
            a(intent, b, true);
            startService(b);
        } else {
            rnz a2 = rth.a(intent, "progressListener");
            if (a2 != null) {
                rth.e(a2, 1, this);
            }
        }
    }
}
