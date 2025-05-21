package com.google.android.gms.personalsafety.psa;

import android.content.Context;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.framework.tracing.wrapper.NetworkCallbackWrapper;
import defpackage.asot;
import defpackage.cvpo;
import defpackage.cvqk;
import defpackage.cvqq;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
        cvqq.c(context);
        synchronized (this.a) {
            boolean c = cvqk.c(networkCapabilities);
            if (c == this.c) {
                return;
            }
            if (c) {
                ConnectivityProtectionLockingIntentOperation.b(context);
                this.c = true;
                asot asotVar = cvpo.a;
            } else {
                ConnectivityProtectionLockingIntentOperation.c(context);
                this.c = false;
                asot asotVar2 = cvpo.a;
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
        cvqq.c(context);
        synchronized (this.a) {
            if (this.c) {
                ConnectivityProtectionLockingIntentOperation.c(context);
                ((ejhf) ((ejhf) cvpo.a.j()).ah(8580)).x("CPMechanism: lost internet");
            }
            this.c = false;
        }
    }
}
