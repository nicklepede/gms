package com.google.android.gms.nearby.discovery.devices;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.chkb;
import defpackage.ciqy;
import defpackage.eluo;
import defpackage.ind;
import defpackage.rxx;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class OptionalModuleActivityProxy$InstallCompleteReceiver extends TracingBroadcastReceiver {
    private final Intent a;
    private final WeakReference b;

    public OptionalModuleActivityProxy$InstallCompleteReceiver(rxx rxxVar, Intent intent) {
        super("nearby");
        this.b = new WeakReference(rxxVar);
        this.a = intent;
        ind.b(rxxVar, this, new IntentFilter("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED"), 2);
    }

    public final synchronized void b(rxx rxxVar) {
        rxxVar.unregisterReceiver(this);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED".equals(intent.getAction())) {
            chkb chkbVar = ciqy.a;
            chkbVar.d().x("loadFastPairModule: Receive fastpair module enable broadcast.");
            rxx rxxVar = (rxx) this.b.get();
            if (rxxVar == null) {
                chkbVar.d().x("loadFastPairModule completed but activity reference is missing!");
                return;
            }
            if (rxxVar.isDestroyed() || rxxVar.isFinishing()) {
                chkbVar.d().x("loadFastPairModule completed but activity is finishing!");
                return;
            }
            try {
                rxxVar.startActivity(this.a);
                rxxVar.finish();
            } catch (ActivityNotFoundException e) {
                ComponentName component = this.a.getComponent();
                if (component != null) {
                    ((eluo) ciqy.a.g().s(e)).B("Optional module download completed but activity:%s not found!", component.getClassName());
                } else {
                    ((eluo) ciqy.a.g().s(e)).x("Optional module download completed but activity is not found!");
                }
            }
        }
    }
}
