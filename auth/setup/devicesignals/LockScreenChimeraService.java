package com.google.android.gms.auth.setup.devicesignals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.setup.devicesignals.LockScreenChimeraService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.addr;
import defpackage.asmf;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LockScreenChimeraService extends Service {
    public static boolean a = false;
    private BroadcastReceiver b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class ScreenOffReceiver extends TracingBroadcastReceiver {
        public ScreenOffReceiver() {
            super("auth_account");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                addr.a(context).c();
            }
        }
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.setup.devicesignals.LockScreenService");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        a = true;
        ScreenOffReceiver screenOffReceiver = new ScreenOffReceiver();
        this.b = screenOffReceiver;
        iln.b(this, screenOffReceiver, new IntentFilter("android.intent.action.SCREEN_OFF"), 2);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        unregisterReceiver(this.b);
        a = false;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !intent.getBooleanExtra("is_boot", false)) {
            return 1;
        }
        new asmf(Integer.MAX_VALUE, 9).submit(new Runnable() { // from class: addp
            @Override // java.lang.Runnable
            public final void run() {
                addr.a(LockScreenChimeraService.this).b();
            }
        });
        return 1;
    }
}
