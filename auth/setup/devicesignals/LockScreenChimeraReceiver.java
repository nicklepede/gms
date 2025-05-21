package com.google.android.gms.auth.setup.devicesignals;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.addr;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LockScreenChimeraReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            try {
                addr.a(context).d(true);
                if (LockScreenChimeraService.a) {
                    return;
                }
                context.startService(LockScreenChimeraService.a(context));
            } catch (IllegalStateException e) {
                ((ejhf) ((ejhf) asot.b("LockScreenChimeraReceiver", asej.AUTH_ACCOUNT_DATA).i()).s(e)).x("Got IllegalStateException when initializing module");
            }
        }
    }
}
