package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.fnfw;
import defpackage.rmu;
import defpackage.rmx;
import defpackage.rnb;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ZappLogOperation extends IntentOperation {
    private static final Intent a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("events");
        if (parcelableArrayListExtra != null) {
            rmu rmuVar = null;
            rmx rnbVar = fnfw.h() ? new rnb(null) : new rmx();
            try {
                if (!bindService(a, rnbVar, 1)) {
                    Log.e("ZappLogOperation", "Unable to bind to Phonesky");
                    return;
                }
                try {
                    IBinder a2 = rnbVar.a();
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                        rmuVar = queryLocalInterface instanceof rmu ? (rmu) queryLocalInterface : new rmu(a2);
                    }
                    if (rmuVar == null) {
                        Log.e("ZappLogOperation", "Unable to connect to Phonesky");
                        try {
                            return;
                        } catch (IllegalStateException unused) {
                            return;
                        }
                    }
                    try {
                        Iterator it = parcelableArrayListExtra.iterator();
                        while (it.hasNext()) {
                            rmuVar.a(getPackageName(), (Bundle) it.next());
                        }
                        try {
                            unbindService(rnbVar);
                        } catch (IllegalStateException unused2) {
                        }
                    } catch (Exception e) {
                        Log.e("ZappLogOperation", a.aa(e, "onModuleEvent() failed: "));
                        try {
                            unbindService(rnbVar);
                        } catch (IllegalStateException unused3) {
                        }
                    }
                } catch (InterruptedException unused4) {
                    Thread.currentThread().interrupt();
                    try {
                        unbindService(rnbVar);
                    } catch (IllegalStateException unused5) {
                    }
                }
            } finally {
                try {
                    unbindService(rnbVar);
                } catch (IllegalStateException unused6) {
                }
            }
        }
    }
}
