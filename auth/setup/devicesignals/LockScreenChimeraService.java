package com.google.android.gms.auth.setup.devicesignals;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.setup.devicesignals.LockScreenChimeraService;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.afdt;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.fmyn;
import defpackage.ind;
import defpackage.wxb;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LockScreenChimeraService extends Service {
    public static boolean a = false;
    public final ausn b = wxb.a("LockScreenChimeraService");
    public BroadcastReceiver c;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ScreenOffReceiver extends TracingBroadcastReceiver {
        public ScreenOffReceiver() {
            super("auth_account");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                afdt.a(context).c();
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
        this.c = new ScreenOffReceiver();
        if (fmyn.e()) {
            new aupz(1, 9).submit(new Callable() { // from class: afdq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ind.b(AppContextProvider.a(), LockScreenChimeraService.this.c, new IntentFilter("android.intent.action.SCREEN_OFF"), 2);
                }
            });
        } else {
            ind.b(this, this.c, new IntentFilter("android.intent.action.SCREEN_OFF"), 2);
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        if (fmyn.e()) {
            new aupz(1, 9).submit(new Runnable() { // from class: afdp
                @Override // java.lang.Runnable
                public final void run() {
                    LockScreenChimeraService lockScreenChimeraService = LockScreenChimeraService.this;
                    try {
                        lockScreenChimeraService.unregisterReceiver(lockScreenChimeraService.c);
                    } catch (IllegalArgumentException e) {
                        ((eluo) ((eluo) lockScreenChimeraService.b.h()).s(e)).x("Error during unregisterReceiver call");
                    }
                }
            });
        } else {
            unregisterReceiver(this.c);
        }
        a = false;
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !intent.getBooleanExtra("is_boot", false)) {
            return 1;
        }
        new aupz(Integer.MAX_VALUE, 9).submit(new Runnable() { // from class: afdr
            @Override // java.lang.Runnable
            public final void run() {
                afdt.a(LockScreenChimeraService.this).b();
            }
        });
        return 1;
    }
}
