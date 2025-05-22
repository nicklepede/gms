package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.ResultReceiver;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.magictether.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cead;
import defpackage.dhbu;
import defpackage.kar;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
            final cead ceadVar = new cead(this);
            cead.b();
            cead.b = new dhbu(AppContextProvider.a(), 268435462, "Magic Tether");
            cead.b.e("Starting tethering", cead.a);
            if (ceadVar.d.a() != 10) {
                ceadVar.a(booleanExtra, resultReceiver);
            } else {
                final kar a = kar.a(AppContextProvider.a());
                a.c(new TracingBroadcastReceiver() { // from class: com.google.android.gms.magictether.host.HotspotEnabler$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("auth_magictether");
                    }

                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jP(Context context, Intent intent2) {
                        a.d(this);
                        ceadVar.a(booleanExtra, resultReceiver);
                    }
                }, new IntentFilter("com.google.android.gms.magictether.AP_FINISHED_DISABLING"));
            }
        }
    }
}
