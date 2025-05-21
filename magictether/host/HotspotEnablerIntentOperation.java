package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ResultReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cbrl;
import defpackage.deqr;
import defpackage.juc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class HotspotEnablerIntentOperation extends IntentOperation {
    public static Intent a(Context context, boolean z, ResultReceiver resultReceiver) {
        Intent startIntent = IntentOperation.getStartIntent(context, HotspotEnablerIntentOperation.class, "com.google.android.gms.magictether.ENABLE_HOTSPOT");
        startIntent.putExtra("EXTRA_SHOW_PROVISIONING_UI", z);
        startIntent.putExtra("EXTRA_RESULT_RECEIVER", resultReceiver);
        return startIntent;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.magictether.ENABLE_HOTSPOT".equals(intent.getAction())) {
            final boolean booleanExtra = intent.getBooleanExtra("EXTRA_SHOW_PROVISIONING_UI", false);
            final ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("EXTRA_RESULT_RECEIVER");
            final cbrl cbrlVar = new cbrl(this);
            cbrl.b();
            cbrl.b = new deqr(AppContextProvider.a(), 268435462, "Magic Tether");
            cbrl.b.e("Starting tethering", cbrl.a);
            if (cbrlVar.d.a() != 10) {
                cbrlVar.a(booleanExtra, resultReceiver);
            } else {
                final juc a = juc.a(AppContextProvider.a());
                a.c(new TracingBroadcastReceiver() { // from class: com.google.android.gms.magictether.host.HotspotEnabler$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("auth_magictether");
                    }

                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jz(Context context, Intent intent2) {
                        a.d(this);
                        cbrlVar.a(booleanExtra, resultReceiver);
                    }
                }, new IntentFilter("com.google.android.gms.magictether.AP_FINISHED_DISABLING"));
            }
        }
    }
}
