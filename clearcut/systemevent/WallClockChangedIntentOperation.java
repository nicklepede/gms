package com.google.android.gms.clearcut.systemevent;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import defpackage.fozj;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class WallClockChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fozj.f()) {
            return;
        }
        ClearcutLoggerChimeraService.a.execute(new Runnable() { // from class: ashq
            @Override // java.lang.Runnable
            public final void run() {
                ashm ashmVar = null;
                try {
                    try {
                        ashmVar = ashm.c();
                        ashg a = ashmVar.a();
                        if (a != null) {
                            a.B(2);
                        }
                    } catch (IOException e) {
                        Log.e("CCTWallClockChanged", "Could not write internal log event.", e);
                    }
                } finally {
                    autg.f(ashmVar);
                }
            }
        });
    }
}
