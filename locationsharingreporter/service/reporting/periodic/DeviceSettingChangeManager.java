package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.auid;
import defpackage.aupq;
import defpackage.ausn;
import defpackage.cdec;
import defpackage.cdkc;
import defpackage.cdmm;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.fsqm;
import defpackage.fsrb;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DeviceSettingChangeManager extends TracingBroadcastReceiver {
    public static final ausn a = ausn.b("LSR", auid.LOCATION_SHARING_REPORTER);
    public final Context b;
    public final AtomicBoolean c;
    public final aupq d;
    private final cdkc e;

    public DeviceSettingChangeManager() {
        super("lsrDeviceSettingChangeManager");
        this.b = AppContextProvider.a();
        this.c = new AtomicBoolean(false);
        this.d = new aupq(10);
        this.e = cdec.c();
    }

    public final void b(boolean z) {
        ((eluo) ((eluo) a.h()).ai((char) 5813)).B("Device battery saver mode change, isEnabled: %s", Boolean.valueOf(z));
        try {
            ((eqcy) this.e.l(z)).v(fsqm.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 5814)).x("Failed store device battery saver state");
        }
    }

    public final void c(boolean z) {
        ((eluo) ((eluo) a.h()).ai((char) 5815)).B("Device location setting change, isEnabled: %s", Boolean.valueOf(z));
        try {
            ((eqcy) this.e.m(z)).v(fsqm.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 5816)).x("Failed store device location setting state");
        }
    }

    public final void d() {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5819)).x("Attempting to stop listening to device setting changes");
        if (!this.c.get()) {
            ((eluo) ((eluo) ausnVar.j()).ai((char) 5820)).x("Can't stop listening to device setting changes, not started");
            return;
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 5821)).x("Stopping listening to device setting changes");
        try {
            this.b.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
        this.c.set(false);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        char c;
        if (!fsrb.D()) {
            d();
            return;
        }
        if (!fsrb.a.lK().ai()) {
            d();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((eluo) ((eluo) a.j()).ai((char) 5812)).x("Received intent with null action");
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode == -1184851779) {
            if (action.equals("android.location.PROVIDERS_CHANGED")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -511271086) {
            if (hashCode == 1779291251 && action.equals("android.os.action.POWER_SAVE_MODE_CHANGED")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.location.MODE_CHANGED")) {
                c = 2;
            }
            c = 65535;
        }
        if (c == 0) {
            b(cdmm.a(context));
        } else if (c == 1 || c == 2) {
            c(cdmm.b(context));
        } else {
            ((eluo) ((eluo) a.j()).ai((char) 5811)).B("Unexpected action received: %s", action);
        }
    }
}
