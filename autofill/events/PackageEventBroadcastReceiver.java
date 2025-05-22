package com.google.android.gms.autofill.events;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.afpy;
import defpackage.agla;
import defpackage.aglg;
import defpackage.cbgj;
import defpackage.dtlt;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class PackageEventBroadcastReceiver extends TracingBroadcastReceiver {
    private final agla a;

    public PackageEventBroadcastReceiver(agla aglaVar) {
        super("autofill");
        this.a = aglaVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (action == null || data == null) {
            return;
        }
        String uri = data.toString();
        if (uri.length() <= 8 || !uri.startsWith("package:")) {
            return;
        }
        final String substring = uri.substring(8);
        if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            final aglg aglgVar = (aglg) this.a;
            ((cbgj) aglgVar.b.a()).l(afpy.SYNC_ID_PREDICTIONS_DOWNLOAD).b(new dtlt() { // from class: agle
                @Override // defpackage.dtlt
                public final eqgl a() {
                    return aglg.this.a(substring, false);
                }
            }, 1, (Executor) aglgVar.c.a());
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            ((aglg) this.a).a.V(substring);
        } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            final aglg aglgVar2 = (aglg) this.a;
            ((cbgj) aglgVar2.b.a()).l(afpy.SYNC_ID_PREDICTIONS_DOWNLOAD).b(new dtlt() { // from class: aglf
                @Override // defpackage.dtlt
                public final eqgl a() {
                    return aglg.this.a(substring, false);
                }
            }, 1, (Executor) aglgVar2.c.a());
        }
    }
}
