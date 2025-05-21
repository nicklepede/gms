package com.google.android.gms.crisisalerts.state;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.axdg;
import defpackage.eiif;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class CrisisAlertsSystemStateChangeIntentOperation extends IntentOperation {
    private static final AtomicReference a;

    static {
        axdg.a("SysStChng");
        a = new AtomicReference(Optional.empty());
    }

    public static void a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (it.hasNext()) {
            if (it.next().processName.equals("com.google.android.gms.ui")) {
                Intent startIntent = getStartIntent(context, CrisisAlertsSystemStateChangeIntentOperation.class, "com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SYSTEM_STATE_CHANGED");
                if (startIntent != null) {
                    context.startService(startIntent);
                    return;
                }
                return;
            }
        }
    }

    public static void b(Runnable runnable) {
        a.set(Optional.of(runnable));
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !eiif.b(intent.getAction()).equals("com.google.android.gms.crisisalerts.state.CRISIS_ALERTS_SYSTEM_STATE_CHANGED")) {
            return;
        }
        AtomicReference atomicReference = a;
        ((Optional) atomicReference.get()).isPresent();
        if (((Optional) atomicReference.get()).isPresent()) {
            ((Runnable) ((Optional) atomicReference.get()).get()).run();
        }
    }
}
