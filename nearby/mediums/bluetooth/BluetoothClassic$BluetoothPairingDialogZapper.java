package com.google.android.gms.nearby.mediums.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.cast.JGCastService;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cfcs;
import defpackage.cjfj;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothClassic$BluetoothPairingDialogZapper extends TracingBroadcastReceiver {
    private final Context a;
    private final IntentFilter b;
    private int c;

    public BluetoothClassic$BluetoothPairingDialogZapper(Context context) {
        super("nearby");
        this.c = 0;
        this.a = context;
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST");
        this.b = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.CONNECTION_ACCESS_REQUEST");
        intentFilter.setPriority(999);
    }

    private static final boolean d() {
        return Build.VERSION.SDK_INT < 24;
    }

    public final synchronized void b() {
        if (d()) {
            if (this.c == 0) {
                iln.b(this.a, this, this.b, 2);
            }
            this.c++;
        }
    }

    public final synchronized void c() {
        if (d()) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                cfcs.f(this.a, this);
            }
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        BluetoothDevice a;
        String action = intent.getAction();
        cjfj.a.b().h("Bluetooth Classic pairing intent received: %s", action);
        if (!"android.bluetooth.device.action.PAIRING_REQUEST".equals(action) || (a = cfcs.a(context, intent)) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", JGCastService.FLAG_USE_TDLS);
        if (intExtra == 2 || intExtra == 3) {
            a.setPairingConfirmation(true);
            cjfj.a.b().h("Intercepted and confirmed Bluetooth Classic pairing dialog for %s", a.getName());
            abortBroadcast();
        }
    }
}
