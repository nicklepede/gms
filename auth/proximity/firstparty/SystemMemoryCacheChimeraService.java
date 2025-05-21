package com.google.android.gms.auth.proximity.firstparty;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.acod;
import defpackage.armd;
import defpackage.arwm;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SystemMemoryCacheChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (!armd.m(intent)) {
            return 2;
        }
        final acod a = acod.a();
        arwm.b(armd.m(intent));
        a.b.post(new Runnable() { // from class: acnx
            @Override // java.lang.Runnable
            public final void run() {
                acod acodVar = acod.this;
                if (acodVar.d) {
                    return;
                }
                Intent intent2 = intent;
                if (armd.a(intent2) == 0) {
                    acodVar.a.h(intent2);
                    acodVar.d = true;
                    arwm.l(acodVar.d);
                    List list = acodVar.c;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        acodVar.b.post((Runnable) it.next());
                    }
                    list.clear();
                }
            }
        });
        return 2;
    }
}
