package com.google.android.gms.auth.proximity.firstparty;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import defpackage.aeod;
import defpackage.atos;
import defpackage.atzb;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SystemMemoryCacheChimeraService extends Service {
    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        if (!atos.m(intent)) {
            return 2;
        }
        final aeod a = aeod.a();
        atzb.b(atos.m(intent));
        a.b.post(new Runnable() { // from class: aenx
            @Override // java.lang.Runnable
            public final void run() {
                aeod aeodVar = aeod.this;
                if (aeodVar.d) {
                    return;
                }
                Intent intent2 = intent;
                if (atos.a(intent2) == 0) {
                    aeodVar.a.h(intent2);
                    aeodVar.d = true;
                    atzb.l(aeodVar.d);
                    List list = aeodVar.c;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aeodVar.b.post((Runnable) it.next());
                    }
                    list.clear();
                }
            }
        });
        return 2;
    }
}
