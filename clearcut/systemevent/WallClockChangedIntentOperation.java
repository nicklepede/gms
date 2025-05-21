package com.google.android.gms.clearcut.systemevent;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import defpackage.fmhx;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class WallClockChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fmhx.f()) {
            return;
        }
        ClearcutLoggerChimeraService.a.execute(new Runnable() { // from class: aqez
            @Override // java.lang.Runnable
            public final void run() {
                aqev aqevVar = null;
                try {
                    try {
                        aqevVar = aqev.c();
                        aqep a = aqevVar.a();
                        if (a != null) {
                            a.B(2);
                        }
                    } catch (IOException e) {
                        Log.e("CCTWallClockChanged", "Could not write internal log event.", e);
                    }
                } finally {
                    aspm.f(aqevVar);
                }
            }
        });
    }
}
