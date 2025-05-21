package com.google.android.gms.smartdevice.d2d;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.dcyh;
import defpackage.dcyi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceAccountExportController$ExportReceiver extends TracingBroadcastReceiver {
    public final /* synthetic */ dcyi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceAccountExportController$ExportReceiver(dcyi dcyiVar) {
        super("smartdevice");
        this.a = dcyiVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        dcyi.a.j("Received broadcast %s", intent);
        if (!"com.google.android.gms.auth.ACCOUNT_DATA_AVAILABLE_FOR_SETUP".equals(intent.getAction())) {
            dcyi.a.f("Unexpected broadcast action %s", intent.getAction());
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("key_extra_ids");
        this.a.d.execute(new dcyh(this, stringArrayExtra));
    }
}
