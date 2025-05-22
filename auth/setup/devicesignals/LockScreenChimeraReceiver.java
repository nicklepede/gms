package com.google.android.gms.auth.setup.devicesignals;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.afdt;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LockScreenChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            try {
                afdt.a(context).d(true);
                if (LockScreenChimeraService.a) {
                    return;
                }
                context.startService(LockScreenChimeraService.a(context));
            } catch (IllegalStateException e) {
                ((eluo) ((eluo) ausn.b("LockScreenChimeraReceiver", auid.AUTH_ACCOUNT_DATA).i()).s(e)).x("Got IllegalStateException when initializing module");
            }
        }
    }
}
