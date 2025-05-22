package com.google.android.gms.wearable.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.wearable.service.EmulatorBroadcastReceiver;
import defpackage.atzb;
import defpackage.aura;
import defpackage.auuv;
import defpackage.dmmy;
import defpackage.dnyr;
import defpackage.doov;
import defpackage.ind;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class EmulatorBroadcastReceiver extends TracingBroadcastReceiver {
    public ContentObserver a;
    public Context b;
    private boolean c;

    public EmulatorBroadcastReceiver() {
        super("wearable");
        this.c = false;
    }

    private final void e(int i, String str) {
        f(i, str, null, null);
    }

    private final void f(int i, String str, Throwable th, BroadcastReceiver.PendingResult pendingResult) {
        if (th != null) {
            Log.e("wearable.EmuReceiver", str, th);
        } else if (Log.isLoggable("wearable.EmuReceiver", 3)) {
            Log.d("wearable.EmuReceiver", str);
        }
        if (pendingResult != null) {
            pendingResult.setResult(i, str, null);
            pendingResult.finish();
        } else if (isOrderedBroadcast()) {
            setResult(i, str, null);
        }
    }

    private final boolean g() {
        return (Objects.equals(Build.TYPE, "user") && !aura.P() && Settings.Global.getInt(this.b.getContentResolver(), "development_settings_enabled", 0) == 0) ? false : true;
    }

    public final void b() {
        if (!g()) {
            d();
            return;
        }
        if (this.c) {
            return;
        }
        if (Log.isLoggable("wearable.EmuReceiver", 3)) {
            Log.d("wearable.EmuReceiver", "registerReceiver");
        }
        atzb.s(this.b);
        ind.b(this.b, this, new IntentFilter("com.google.android.gms.wearable.EMULATOR"), 2);
        this.c = true;
    }

    public final /* synthetic */ void c(BroadcastReceiver.PendingResult pendingResult) {
        try {
            dnyr dnyrVar = doov.f().s;
            if (dnyrVar != null) {
                dnyrVar.a();
            }
            f(1, "Emulator connection refresh succeeded.", null, pendingResult);
        } catch (IllegalStateException | IllegalThreadStateException | SecurityException e) {
            f(2, "Emulator connection refresh failed.", e, pendingResult);
        }
    }

    public final void d() {
        if (this.c) {
            if (Log.isLoggable("wearable.EmuReceiver", 3)) {
                Log.d("wearable.EmuReceiver", "unregisterReceiver");
            }
            atzb.s(this.b);
            this.b.unregisterReceiver(this);
            this.c = false;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        char c;
        if (Objects.equals(intent.getAction(), "com.google.android.gms.wearable.EMULATOR")) {
            if (Log.isLoggable("wearable.EmuReceiver", 3)) {
                Log.d("wearable.EmuReceiver", "Received broadcast.");
            }
            if (!g()) {
                e(4, "Debug broadcast receiver is disabled.");
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                e(3, "No intent extras specified.");
                return;
            }
            String string = extras.getString("operation");
            if (string == null) {
                e(3, "no extra keyed with operation.");
                return;
            }
            int hashCode = string.hashCode();
            if (hashCode == -972411228) {
                if (string.equals("refresh-emulator-connection")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 351608024) {
                if (hashCode == 1546207726 && string.equals("get-pairing-status")) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (string.equals("version")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                e(1, "1");
                return;
            }
            if (c == 1) {
                if (doov.f() == null) {
                    e(5, "WearableService not initialized yet.");
                    return;
                } else {
                    final BroadcastReceiver.PendingResult goAsync = goAsync();
                    auuv.a(new Runnable() { // from class: domh
                        @Override // java.lang.Runnable
                        public final void run() {
                            EmulatorBroadcastReceiver.this.c(goAsync);
                        }
                    });
                    return;
                }
            }
            if (c != 2) {
                e(3, "Unrecognized operation ".concat(string));
                return;
            }
            if (doov.f() == null || doov.o() == null) {
                e(5, "WearableService not initialized yet.");
                return;
            }
            try {
                dmmy[] v = doov.f().v("");
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("Local:[%s]\n", doov.o().a().a));
                for (dmmy dmmyVar : v) {
                    if (dmmyVar.d == 2) {
                        sb.append(String.format("Peer:[%s,%b,%b]\n", dmmyVar.j, Boolean.valueOf(dmmyVar.g), Boolean.valueOf(dmmyVar.f)));
                    }
                }
                e(1, sb.toString());
            } catch (RuntimeException e) {
                f(2, "Get pairing status failed.", e, null);
            }
        }
    }
}
