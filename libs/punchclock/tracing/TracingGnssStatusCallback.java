package com.google.android.gms.libs.punchclock.tracing;

import android.content.Context;
import defpackage.caqo;
import defpackage.caqr;
import defpackage.carc;
import defpackage.eixs;
import defpackage.ipt;
import defpackage.ipu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public abstract class TracingGnssStatusCallback extends ipt implements carc {
    private final caqo a;

    public TracingGnssStatusCallback(Context context) {
        this.a = caqr.c.c(getClass(), 23, context);
    }

    @Override // defpackage.ipt
    public final void a(ipu ipuVar) {
        eixs k = this.a.k("onSatelliteStatusChanged");
        try {
            e(ipuVar);
            if (k != null) {
                k.close();
            }
        } catch (Throwable th) {
            if (k != null) {
                try {
                    k.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ipt
    public final void b() {
        eixs k = this.a.k("onStarted");
        if (k != null) {
            k.close();
        }
    }

    @Override // defpackage.ipt
    public final void c() {
        eixs k = this.a.k("onStopped");
        if (k != null) {
            k.close();
        }
    }

    @Override // defpackage.ipt
    public final void d() {
        eixs k = this.a.k("onFirstFix");
        if (k != null) {
            k.close();
        }
    }

    protected abstract void e(ipu ipuVar);
}
