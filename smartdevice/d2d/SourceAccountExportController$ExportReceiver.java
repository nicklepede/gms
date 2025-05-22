package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auad;
import defpackage.dfjm;
import defpackage.dfjn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceAccountExportController$ExportReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ dfjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAccountExportController$ExportReceiver(dfjn dfjnVar) {
        super("smartdevice");
        this.a = dfjnVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        auad auadVar = dfjn.a;
        auadVar.j("Received broadcast %s", intent);
        if (!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(intent.getAction())) {
            auadVar.f("Unexpected broadcast action %s", intent.getAction());
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("key_extra_ids");
        this.a.d.execute(new dfjm(this, stringArrayExtra));
    }
}
