package com.google.android.gms.magictether.host;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import defpackage.cbpv;
import defpackage.cbqk;
import defpackage.cbql;
import defpackage.cbru;
import defpackage.fpzd;
import defpackage.fpzk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class AutoDisconnectIntentOperation extends IntentOperation {
    static {
        Math.round(fpzd.c() * 2.5d);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fpzd.e() && intent != null && "com.google.android.gms.magictether.operation.AUTO_DISCONNECT".equals(intent.getAction())) {
            cbqk.c();
            if (!cbpv.c(fpzk.j())) {
                cbql.a(AppContextProvider.a()).c(true);
                return;
            }
            cbru a = cbru.a(AppContextProvider.a());
            if (a != null) {
                a.c(true);
            }
        }
    }
}
