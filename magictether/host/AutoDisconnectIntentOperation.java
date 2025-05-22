package com.google.android.gms.magictether.host;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import defpackage.cdyn;
import defpackage.cdzc;
import defpackage.cdzd;
import defpackage.ceam;
import defpackage.fssz;
import defpackage.fstg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AutoDisconnectIntentOperation extends IntentOperation {
    static {
        Math.round(fssz.c() * 2.5d);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fssz.e() && intent != null && "com.google.android.gms.magictether.operation.AUTO_DISCONNECT".equals(intent.getAction())) {
            cdzc.c();
            if (!cdyn.c(fstg.j())) {
                cdzd.a(AppContextProvider.a()).c(true);
                return;
            }
            ceam a = ceam.a(AppContextProvider.a());
            if (a != null) {
                a.c(true);
            }
        }
    }
}
