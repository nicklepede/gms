package com.google.android.gms.nearby.sharing.discovery;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$1;
import defpackage.chks;
import defpackage.cpbz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FastInitiation$1 extends TracingBroadcastReceiver {
    public final /* synthetic */ cpbz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastInitiation$1(cpbz cpbzVar) {
        super("nearby", "NearbyChangeReceiver");
        this.a = cpbzVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("com.google.android.gms.nearby.sharing.STATE_CHANGED".equals(intent.getAction())) {
            cpbz cpbzVar = this.a;
            ((chks) cpbzVar.a).submit(new Runnable() { // from class: cpbp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    cpbz cpbzVar2 = FastInitiation$1.this.a;
                    synchronized (cpbzVar2) {
                        elso it = elgo.i(cpbzVar2.c.values()).iterator();
                        while (it.hasNext()) {
                            ((cpbx) it.next()).e = false;
                        }
                    }
                }
            });
        }
    }
}
