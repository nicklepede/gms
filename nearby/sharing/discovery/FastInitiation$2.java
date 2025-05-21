package com.google.android.gms.nearby.sharing.discovery;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.discovery.FastInitiation$2;
import defpackage.cfdg;
import defpackage.cmtr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class FastInitiation$2 extends TracingBroadcastReceiver {
    public final /* synthetic */ cmtr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastInitiation$2(cmtr cmtrVar) {
        super("nearby", "RadioChangeReceiver");
        this.a = cmtrVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (intExtra == 12 || intExtra == 10) {
            cmtr cmtrVar = this.a;
            ((cfdg) cmtrVar.a).submit(new Runnable() { // from class: cmti
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    cmtr cmtrVar2 = FastInitiation$2.this.a;
                    synchronized (cmtrVar2) {
                        ejfh it = eitj.i(cmtrVar2.c.values()).iterator();
                        while (it.hasNext()) {
                            ((cmtp) it.next()).e = false;
                        }
                    }
                }
            });
        }
    }
}
