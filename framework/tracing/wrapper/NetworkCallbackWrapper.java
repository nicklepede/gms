package com.google.android.gms.framework.tracing.wrapper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.bjmq;
import defpackage.carc;
import defpackage.eixs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public abstract class NetworkCallbackWrapper extends ConnectivityManager.NetworkCallback implements carc {
    private final bjmq a;

    public NetworkCallbackWrapper(Context context) {
        this.a = new bjmq(context, getClass(), 28, "StaleLocationDetectorNetworkCallback");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        eixs o = bjmq.o(this.a, "onAvailable");
        try {
            a(network);
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            if (o != null) {
                try {
                    o.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        eixs o = bjmq.o(this.a, "onBlockedStatusChanged");
        try {
            f(z);
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            if (o != null) {
                try {
                    o.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        eixs o = bjmq.o(this.a, "onCapabilitiesChanged");
        try {
            b(network, networkCapabilities);
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            if (o != null) {
                try {
                    o.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        eixs o = bjmq.o(this.a, "onLinkPropertiesChanged");
        try {
            d(network, linkProperties);
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            if (o != null) {
                try {
                    o.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        eixs o = bjmq.o(this.a, "onLosing");
        if (o != null) {
            o.close();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        eixs o = bjmq.o(this.a, "onLost");
        try {
            c(network);
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            if (o != null) {
                try {
                    o.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        eixs o = bjmq.o(this.a, "onUnavailable");
        try {
            e();
            if (o != null) {
                o.close();
            }
        } catch (Throwable th) {
            if (o != null) {
                try {
                    o.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public NetworkCallbackWrapper(String str, String str2) {
        this.a = new bjmq(getClass(), 28, str2, str);
    }

    public void e() {
    }

    public void a(Network network) {
    }

    public void c(Network network) {
    }

    public void f(boolean z) {
    }

    public void b(Network network, NetworkCapabilities networkCapabilities) {
    }

    public void d(Network network, LinkProperties linkProperties) {
    }
}
