package com.google.android.gms.nearby.sharing.discovery;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$3;
import defpackage.chks;
import defpackage.cpbz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FastInitiation$3 extends TracingBroadcastReceiver {
    public final /* synthetic */ cpbz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastInitiation$3(cpbz cpbzVar) {
        super("nearby", "LocationChangeReceiver");
        this.a = cpbzVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        ((chks) this.a.a).submit(new Runnable() { // from class: cpbr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                cpbz cpbzVar = FastInitiation$3.this.a;
                synchronized (cpbzVar) {
                    elso it = elgo.i(cpbzVar.c.values()).iterator();
                    while (it.hasNext()) {
                        ((cpbx) it.next()).e = false;
                    }
                }
            }
        });
    }
}
