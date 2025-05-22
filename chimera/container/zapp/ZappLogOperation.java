package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.fpxv;
import defpackage.tfy;
import defpackage.tgb;
import defpackage.tgf;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ZappLogOperation extends IntentOperation {
    private static final Intent a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("events");
        if (parcelableArrayListExtra != null) {
            tfy tfyVar = null;
            tgb tgfVar = fpxv.h() ? new tgf(null) : new tgb();
            try {
                if (!bindService(a, tgfVar, 1)) {
                    Log.e("ZappLogOperation", "Unable to bind to Phonesky");
                    return;
                }
                try {
                    IBinder a2 = tgfVar.a();
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                        tfyVar = queryLocalInterface instanceof tfy ? (tfy) queryLocalInterface : new tfy(a2);
                    }
                    if (tfyVar == null) {
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
                            tfyVar.a(getPackageName(), (Bundle) it.next());
                        }
                        try {
                            unbindService(tgfVar);
                        } catch (IllegalStateException unused2) {
                        }
                    } catch (Exception e) {
                        Log.e("ZappLogOperation", a.ab(e, "onModuleEvent() failed: "));
                        try {
                            unbindService(tgfVar);
                        } catch (IllegalStateException unused3) {
                        }
                    }
                } catch (InterruptedException unused4) {
                    Thread.currentThread().interrupt();
                    try {
                        unbindService(tgfVar);
                    } catch (IllegalStateException unused5) {
                    }
                }
            } finally {
                try {
                    unbindService(tgfVar);
                } catch (IllegalStateException unused6) {
                }
            }
        }
    }
}
