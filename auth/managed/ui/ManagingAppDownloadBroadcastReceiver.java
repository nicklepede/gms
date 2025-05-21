package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.abvp;
import defpackage.arwm;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ManagingAppDownloadBroadcastReceiver extends TracingBroadcastReceiver {
    private final Context a;
    private boolean b;
    private final abvp c;

    public ManagingAppDownloadBroadcastReceiver(Context context, abvp abvpVar) {
        super("auth_managed");
        arwm.s(context);
        this.a = context;
        this.c = abvpVar;
    }

    public final synchronized void b() {
        if (this.b) {
            return;
        }
        iln.b(this.a, this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        this.b = true;
    }

    public final synchronized void c() {
        if (this.b) {
            this.a.unregisterReceiver(this);
            this.b = false;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            abvp abvpVar = this.c;
            if (Long.valueOf(intent.getLongExtra("extra_download_id", -1L)).equals(Long.valueOf(abvpVar.a))) {
                abvpVar.b = true;
            }
        }
    }
}
