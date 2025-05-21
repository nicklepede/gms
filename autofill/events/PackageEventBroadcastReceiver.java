package com.google.android.gms.autofill.events;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.adpr;
import defpackage.aeko;
import defpackage.aeku;
import defpackage.byxs;
import defpackage.drbl;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PackageEventBroadcastReceiver extends TracingBroadcastReceiver {
    private final aeko a;

    public PackageEventBroadcastReceiver(aeko aekoVar) {
        super("autofill");
        this.a = aekoVar;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
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
            final aeku aekuVar = (aeku) this.a;
            ((byxs) aekuVar.b.a()).l(adpr.SYNC_ID_PREDICTIONS_DOWNLOAD).b(new drbl() { // from class: aeks
                @Override // defpackage.drbl
                public final enss a() {
                    return aeku.this.a(substring, false);
                }
            }, 1, (Executor) aekuVar.c.a());
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            ((aeku) this.a).a.V(substring);
        } else if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
            final aeku aekuVar2 = (aeku) this.a;
            ((byxs) aekuVar2.b.a()).l(adpr.SYNC_ID_PREDICTIONS_DOWNLOAD).b(new drbl() { // from class: aekt
                @Override // defpackage.drbl
                public final enss a() {
                    return aeku.this.a(substring, false);
                }
            }, 1, (Executor) aekuVar2.c.a());
        }
    }
}
