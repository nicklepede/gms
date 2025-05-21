package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.acjm;
import defpackage.acqc;
import defpackage.asot;
import defpackage.asqh;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class WorkProfileStateBroadcastReceiver extends TracingBroadcastReceiver {
    public static final eiuu a;
    private static final asot b = acqc.a("WorkProfileStateBroadcastReceiver");

    static {
        a = asqh.a() ? eiuu.M("android.intent.action.MANAGED_PROFILE_AVAILABLE", "android.intent.action.MANAGED_PROFILE_UNAVAILABLE", "android.intent.action.MANAGED_PROFILE_ADDED", "android.intent.action.MANAGED_PROFILE_REMOVED") : ejck.a;
    }

    public WorkProfileStateBroadcastReceiver() {
        super("auth_proximity");
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        acjm.b();
        ((ejhf) b.j()).x("Exo is not supported!");
    }
}
