package com.google.android.gms.libs.location.settings.observable;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.asmf;
import defpackage.bwuy;
import defpackage.bwuz;
import defpackage.iln;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BroadcastObservable extends TracingBroadcastReceiver implements bwuy {
    private final Context b;
    private final Executor c;
    private String d;
    private bwuz e;

    public BroadcastObservable(Context context, String str, bwuz bwuzVar) {
        super("location", "BroadcastObservable");
        this.b = context;
        this.c = new asmf(1, 9);
        this.d = str;
        this.e = bwuzVar;
    }

    @Override // defpackage.bwuy
    public final void b() {
        String str;
        synchronized (this) {
            if (this.e == null || (str = this.d) == null) {
                throw new IllegalStateException();
            }
            iln.b(this.b, this, new IntentFilter(str), 4);
            this.d = null;
        }
    }

    @Override // defpackage.bwuy
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
    public final void jz(Context context, final Intent intent) {
        final bwuz bwuzVar;
        synchronized (this) {
            bwuzVar = this.e;
        }
        if (bwuzVar != null) {
            this.c.execute(new Runnable() { // from class: bwul
                @Override // java.lang.Runnable
                public final void run() {
                    bwuz.this.b(intent);
                }
            });
        }
    }
}
