package com.google.android.gms.common.subscriber;

import android.app.PendingIntent;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.ejhf;
import defpackage.fmse;
import defpackage.ftlw;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AnomalyConfigIntentOperation extends IntentOperation {
    private static final asot a = asot.b("AnomalyConfigLogger", asej.CORE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (asqh.e()) {
            asot asotVar = a;
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 3271)).B("Received anomaly config intent: %s.", intent.getAction());
            intent.getAction();
            if (!fmse.e() || !Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
                ((ejhf) ((ejhf) asotVar.h()).ah((char) 3273)).x("The flag is disabled or the intent is not ACTION_BOOT_COMPLETED.");
                return;
            }
            Intent startIntent = IntentOperation.getStartIntent(this, AnomalyAlertIntentOperation.class, "com.google.android.gms.common.subscriber.ACTION_ANOMALY_DETECTED");
            if (startIntent == null) {
                ((ejhf) ((ejhf) asotVar.j()).ah((char) 3277)).x("Failed to get start intent for AnomalyAlertIntentOperation.");
                return;
            }
            PendingIntent pendingIntent = IntentOperation.getPendingIntent((Context) this, AnomalyAlertIntentOperation.class, startIntent, 0, 134217728, true);
            if (pendingIntent == null) {
                ((ejhf) ((ejhf) asotVar.j()).ah((char) 3276)).x("Failed to get pending intent for AnomalyAlertIntentOperation.");
                return;
            }
            try {
                ((ejhf) ((ejhf) asotVar.h()).ah(3274)).x("Setting GMS Core subscriber PendingIntent to StatsManager.");
                ((StatsManager) getSystemService(StatsManager.class)).setBroadcastSubscriber(pendingIntent, ftlw.a.a().a(), 5L);
            } catch (StatsManager.StatsUnavailableException e) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 3275)).B("Failed to set subscriber to StatsManager. Error: %s", e.getMessage());
            }
        }
    }
}
