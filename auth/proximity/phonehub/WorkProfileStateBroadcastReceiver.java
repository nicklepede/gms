package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aejm;
import defpackage.aeqc;
import defpackage.ausn;
import defpackage.auub;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class WorkProfileStateBroadcastReceiver extends TracingBroadcastReceiver {
    public static final elhz a;
    private static final ausn b = aeqc.a("WorkProfileStateBroadcastReceiver");

    static {
        a = auub.a() ? elhz.M("android.intent.action.MANAGED_PROFILE_AVAILABLE", "android.intent.action.MANAGED_PROFILE_UNAVAILABLE", "android.intent.action.MANAGED_PROFILE_ADDED", "android.intent.action.MANAGED_PROFILE_REMOVED") : elpp.a;
    }

    public WorkProfileStateBroadcastReceiver() {
        super("auth_proximity");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        aejm.b();
        ((eluo) b.j()).x("Exo is not supported!");
    }
}
