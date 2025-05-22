package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auad;
import defpackage.dfmz;
import defpackage.dfna;
import defpackage.dfnb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetAccountImportController$ImportReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ dfnb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetAccountImportController$ImportReceiver(dfnb dfnbVar) {
        super("smartdevice");
        this.a = dfnbVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        auad auadVar = dfnb.a;
        auadVar.j("Received broadcast %s", intent);
        String action = intent.getAction();
        if ("com.google.android.gms.smartdevice.setup.RESTORE_DATA".equals(action)) {
            this.a.b.post(new dfmz(this, intent));
        } else {
            if (!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(action)) {
                auadVar.f("Unexpected broadcast action %s", String.valueOf(action));
                return;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("key_extra_ids");
            this.a.b.post(new dfna(this, stringArrayExtra));
        }
    }
}
