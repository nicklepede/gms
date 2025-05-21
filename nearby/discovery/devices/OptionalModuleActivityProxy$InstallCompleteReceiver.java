package com.google.android.gms.nearby.discovery.devices;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.cgiv;
import defpackage.ejhf;
import defpackage.iln;
import defpackage.qet;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class OptionalModuleActivityProxy$InstallCompleteReceiver extends TracingBroadcastReceiver {
    private final Intent a;
    private final WeakReference b;

    public OptionalModuleActivityProxy$InstallCompleteReceiver(qet qetVar, Intent intent) {
        super("nearby");
        this.b = new WeakReference(qetVar);
        this.a = intent;
        iln.b(qetVar, this, new IntentFilter("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED"), 2);
    }

    public final synchronized void b(qet qetVar) {
        qetVar.unregisterReceiver(this);
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if ("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED".equals(intent.getAction())) {
            cgiv.a.d().x("loadFastPairModule: Receive fastpair module enable broadcast.");
            qet qetVar = (qet) this.b.get();
            if (qetVar == null) {
                cgiv.a.d().x("loadFastPairModule completed but activity reference is missing!");
                return;
            }
            if (qetVar.isDestroyed() || qetVar.isFinishing()) {
                cgiv.a.d().x("loadFastPairModule completed but activity is finishing!");
                return;
            }
            try {
                qetVar.startActivity(this.a);
                qetVar.finish();
            } catch (ActivityNotFoundException e) {
                ComponentName component = this.a.getComponent();
                if (component != null) {
                    ((ejhf) cgiv.a.g().s(e)).B("Optional module download completed but activity:%s not found!", component.getClassName());
                } else {
                    ((ejhf) cgiv.a.g().s(e)).x("Optional module download completed but activity is not found!");
                }
            }
        }
    }
}
