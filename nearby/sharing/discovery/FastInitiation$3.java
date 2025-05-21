package com.google.android.gms.nearby.sharing.discovery;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$3;
import defpackage.cfdg;
import defpackage.cmtr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FastInitiation$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ cmtr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastInitiation$3(cmtr cmtrVar) {
        super("nearby", "LocationChangeReceiver");
        this.a = cmtrVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        ((cfdg) this.a.a).submit(new Runnable() { // from class: cmtj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                cmtr cmtrVar = FastInitiation$3.this.a;
                synchronized (cmtrVar) {
                    ejfh it = eitj.i(cmtrVar.c.values()).iterator();
                    while (it.hasNext()) {
                        ((cmtp) it.next()).e = false;
                    }
                }
            }
        });
    }
}
