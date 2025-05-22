package com.google.android.gms.libs.location.settings.observable;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aupz;
import defpackage.bzdo;
import defpackage.bzdp;
import defpackage.ind;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class BroadcastObservable extends TracingBroadcastReceiver implements bzdo {
    private final Context b;
    private final Executor c;
    private String d;
    private bzdp e;

    public BroadcastObservable(Context context, String str, bzdp bzdpVar) {
        super("location", "BroadcastObservable");
        this.b = context;
        this.c = new aupz(1, 9);
        this.d = str;
        this.e = bzdpVar;
    }

    @Override // defpackage.bzdo
    public final void b() {
        String str;
        synchronized (this) {
            if (this.e == null || (str = this.d) == null) {
                throw new IllegalStateException();
            }
            ind.b(this.b, this, new IntentFilter(str), 4);
            this.d = null;
        }
    }

    @Override // defpackage.bzdo
    public final void c() {
        synchronized (this) {
            if (this.e == null || this.d != null) {
                throw new IllegalStateException();
            }
            this.e = null;
        }
        this.b.unregisterReceiver(this);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, final Intent intent) {
        final bzdp bzdpVar;
        synchronized (this) {
            bzdpVar = this.e;
        }
        if (bzdpVar != null) {
            this.c.execute(new Runnable() { // from class: bzdb
                @Override // java.lang.Runnable
                public final void run() {
                    bzdp.this.b(intent);
                }
            });
        }
    }
}
