package com.google.android.gms.auth.managed.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.advp;
import defpackage.atzb;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ManagingAppDownloadBroadcastReceiver extends TracingBroadcastReceiver {
    private final Context a;
    private boolean b;
    private final advp c;

    public ManagingAppDownloadBroadcastReceiver(Context context, advp advpVar) {
        super("auth_managed");
        atzb.s(context);
        this.a = context;
        this.c = advpVar;
    }

    public final synchronized void b() {
        if (this.b) {
            return;
        }
        ind.b(this.a, this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 2);
        this.b = true;
    }

    public final synchronized void c() {
        if (this.b) {
            this.a.unregisterReceiver(this);
            this.b = false;
        }
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            advp advpVar = this.c;
            if (Long.valueOf(intent.getLongExtra("extra_download_id", -1L)).equals(Long.valueOf(advpVar.a))) {
                advpVar.b = true;
            }
        }
    }
}
