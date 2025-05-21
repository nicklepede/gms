package com.google.android.gms.locationsharingreporter.service.reporting.periodic;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.locationsharingreporter.AppContextProvider;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asej;
import defpackage.aslw;
import defpackage.asot;
import defpackage.cavm;
import defpackage.cbbk;
import defpackage.cbdu;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.fpws;
import defpackage.fpxh;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DeviceSettingChangeManager extends TracingBroadcastReceiver {
    public static final asot a = asot.b("LSR", asej.LOCATION_SHARING_REPORTER);
    public final Context b;
    public final AtomicBoolean c;
    public final aslw d;
    private final cbbk e;

    public DeviceSettingChangeManager() {
        super("lsrDeviceSettingChangeManager");
        this.b = AppContextProvider.a();
        this.c = new AtomicBoolean(false);
        this.d = new aslw(10);
        this.e = cavm.c();
    }

    public final void b(boolean z) {
        ((ejhf) ((ejhf) a.h()).ah((char) 5799)).B("Device battery saver mode change, isEnabled: %s", Boolean.valueOf(z));
        try {
            ((enpf) this.e.l(z)).v(fpws.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5800)).x("Failed store device battery saver state");
        }
    }

    public final void c(boolean z) {
        ((ejhf) ((ejhf) a.h()).ah((char) 5801)).B("Device location setting change, isEnabled: %s", Boolean.valueOf(z));
        try {
            ((enpf) this.e.m(z)).v(fpws.i(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5802)).x("Failed store device location setting state");
        }
    }

    public final void d() {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5805)).x("Attempting to stop listening to device setting changes");
        if (!this.c.get()) {
            ((ejhf) ((ejhf) asotVar.j()).ah((char) 5806)).x("Can't stop listening to device setting changes, not started");
            return;
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 5807)).x("Stopping listening to device setting changes");
        try {
            this.b.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
        this.c.set(false);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        char c;
        if (!fpxh.E()) {
            d();
            return;
        }
        if (!fpxh.a.a().ai()) {
            d();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 5798)).x("Received intent with null action");
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
            b(cbdu.a(context));
        } else if (c == 1 || c == 2) {
            c(cbdu.b(context));
        } else {
            ((ejhf) ((ejhf) a.j()).ah((char) 5797)).B("Unexpected action received: %s", action);
        }
    }
}
