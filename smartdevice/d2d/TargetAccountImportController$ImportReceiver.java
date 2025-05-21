package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.ddbu;
import defpackage.ddbv;
import defpackage.ddbw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetAccountImportController$ImportReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ ddbw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetAccountImportController$ImportReceiver(ddbw ddbwVar) {
        super("smartdevice");
        this.a = ddbwVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        ddbw.a.j("Received broadcast %s", intent);
        String action = intent.getAction();
        if ("com.google.android.gms.smartdevice.setup.RESTORE_DATA".equals(action)) {
            this.a.b.post(new ddbu(this, intent));
        } else {
            if (!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(action)) {
                ddbw.a.f("Unexpected broadcast action %s", String.valueOf(action));
                return;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("key_extra_ids");
            this.a.b.post(new ddbv(this, stringArrayExtra));
        }
    }
}
