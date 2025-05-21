package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.scheduler.standalone.ReceiverBasedNetworkConstraintObserver;
import defpackage.asqh;
import defpackage.cybn;
import defpackage.cyfk;
import defpackage.cyfl;
import defpackage.ensv;
import defpackage.fnbr;
import defpackage.iln;
import j$.util.Objects;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReceiverBasedNetworkConstraintObserver extends TracingBroadcastReceiver implements cyfl {
    private int a;
    private int b;
    private boolean c;
    private final ensv d;

    public ReceiverBasedNetworkConstraintObserver(ensv ensvVar) {
        super("scheduler");
        this.c = false;
        this.d = ensvVar;
    }

    private static void g(int i, int i2) {
        if (h(i, 1) && !h(i2, 1)) {
            cybn.b().g.a(10);
        }
        if (h(i, 1) || !h(i2, 1)) {
            return;
        }
        cybn.b().g.a(9);
    }

    private static boolean h(int i, int i2) {
        return (i & i2) == i2;
    }

    private final boolean i(int i) {
        return h(this.a, i);
    }

    @Override // defpackage.cyfl
    public final synchronized void b(PrintWriter printWriter) {
        cyfk.a(printWriter, this.a);
    }

    @Override // defpackage.cyfl
    public final synchronized void c(Context context, int i) {
        try {
            if (i == 7) {
                this.a |= 1;
            } else if (i == 3) {
                this.a |= 2;
            }
            if (this.c) {
                return;
            }
            f(context);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(Context context, Intent intent) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        if (Objects.equals(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                int i = this.b;
                this.b = 0;
                g(i, 0);
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                int i2 = this.b;
                this.b = 0;
                if (networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    this.b |= 2;
                    if (networkCapabilities.hasCapability(11)) {
                        this.b |= 1;
                    }
                }
                g(i2, this.b);
                int i3 = this.a;
                if (i(2) && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    this.a &= -3;
                }
                if (i(1) && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && networkCapabilities.hasCapability(11)) {
                    this.a &= -2;
                }
                if (i3 != this.a) {
                    cybn.b().g.d();
                }
            }
        }
    }

    public final synchronized void e(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo;
        if (Objects.equals(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                int i = this.b;
                this.b = 0;
                g(i, 0);
                return;
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && intent.getIntExtra("networkType", 8) == activeNetworkInfo.getType()) {
                int i2 = this.b;
                this.b = 0;
                if (activeNetworkInfo.isConnected()) {
                    this.b |= 2;
                    if (!connectivityManager.isActiveNetworkMetered()) {
                        this.b |= 1;
                    }
                }
                g(i2, this.b);
                int i3 = this.a;
                if (i(2) && activeNetworkInfo.isConnected()) {
                    this.a &= -3;
                }
                if (i(1) && !connectivityManager.isActiveNetworkMetered()) {
                    this.a &= -2;
                }
                if (i3 != this.a) {
                    cybn.b().g.d();
                }
            }
        }
    }

    public final synchronized void f(Context context) {
        iln.b(context.getApplicationContext(), this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        this.c = true;
        this.b = 0;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final synchronized void jz(final Context context, final Intent intent) {
        if (fnbr.a.a().Q() && asqh.f()) {
            this.d.execute(new Runnable() { // from class: cyfu
                @Override // java.lang.Runnable
                public final void run() {
                    ReceiverBasedNetworkConstraintObserver.this.d(context, intent);
                }
            });
        } else {
            this.d.execute(new Runnable() { // from class: cyfv
                @Override // java.lang.Runnable
                public final void run() {
                    ReceiverBasedNetworkConstraintObserver.this.e(context, intent);
                }
            });
        }
    }
}
