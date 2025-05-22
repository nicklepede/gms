package com.google.android.gms.personalsafety.psa;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.ausn;
import defpackage.cxze;
import defpackage.cyaa;
import defpackage.cyag;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CPMechanism$CPNetworkCallback extends NetworkCallbackWrapper {
    public final Object a;
    public final Context b;
    public boolean c;

    public CPMechanism$CPNetworkCallback(Context context) {
        super("personalsafety", "CPMechanism");
        this.a = new Object();
        this.b = context;
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void b(Network network, NetworkCapabilities networkCapabilities) {
        Context context = this.b;
        cyag.c(context);
        synchronized (this.a) {
            boolean c = cyaa.c(networkCapabilities);
            if (c == this.c) {
                return;
            }
            if (c) {
                ConnectivityProtectionLockingIntentOperation.b(context);
                this.c = true;
                ausn ausnVar = cxze.a;
            } else {
                ConnectivityProtectionLockingIntentOperation.c(context);
                this.c = false;
                ausn ausnVar2 = cxze.a;
            }
        }
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void c(Network network) {
        e();
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper
    public final void e() {
        Context context = this.b;
        cyag.c(context);
        synchronized (this.a) {
            if (this.c) {
                ConnectivityProtectionLockingIntentOperation.c(context);
                ((eluo) ((eluo) cxze.a.j()).ai(8577)).x("CPMechanism: lost internet");
            }
            this.c = false;
        }
    }
}
