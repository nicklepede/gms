package com.google.android.gms.common.subscriber;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.eluo;
import defpackage.fpkc;
import defpackage.fwhp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AnomalyConfigIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("AnomalyConfigLogger", auid.CORE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (auub.e()) {
            ausn ausnVar = a;
            ((eluo) ((eluo) ausnVar.h()).ai((char) 3275)).B("Received anomaly config intent: %s.", intent.getAction());
            intent.getAction();
            if (!fpkc.f() || !Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
                ((eluo) ((eluo) ausnVar.h()).ai((char) 3277)).x("The flag is disabled or the intent is not ACTION_BOOT_COMPLETED.");
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent(this, AnomalyAlertIntentOperation.class, "com.google.android.gms.common.subscriber.ACTION_ANOMALY_DETECTED");
            if (startIntent == null) {
                ((eluo) ((eluo) ausnVar.j()).ai((char) 3281)).x("Failed to get start intent for AnomalyAlertIntentOperation.");
                return;
            }
            PendingIntent pendingIntent = IntentOperation.getPendingIntent((Context) this, AnomalyAlertIntentOperation.class, startIntent, 0, 134217728, true);
            if (pendingIntent == null) {
                ((eluo) ((eluo) ausnVar.j()).ai((char) 3280)).x("Failed to get pending intent for AnomalyAlertIntentOperation.");
                return;
            }
            try {
                ((eluo) ((eluo) ausnVar.h()).ai(3278)).x("Setting GMS Core subscriber PendingIntent to StatsManager.");
                ((StatsManager) getSystemService(StatsManager.class)).setBroadcastSubscriber(pendingIntent, fwhp.a.lK().a(), 5L);
            } catch (StatsManager.StatsUnavailableException e) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 3279)).B("Failed to set subscriber to StatsManager. Error: %s", e.getMessage());
            }
        }
    }
}
