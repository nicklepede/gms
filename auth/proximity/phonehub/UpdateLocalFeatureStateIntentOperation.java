package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aevm;
import defpackage.aewa;
import defpackage.aewb;
import defpackage.auad;
import defpackage.ekut;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.fnuf;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class UpdateLocalFeatureStateIntentOperation extends IntentOperation {
    private static final auad a = new auad("ProximityAuth", "UpdateLocalFeatureStateIntentOperation");

    public static Intent a(Context context, String str) {
        Intent startIntent = IntentOperation.getStartIntent(context, UpdateLocalFeatureStateIntentOperation.class, "com.google.android.gms.auth.proximity.phonehub.ACTION_UPDATE_LOCAL_FEATURE_STATE");
        if (startIntent != null) {
            startIntent.putExtra("accountName", str);
        }
        return startIntent;
    }

    public static Intent b(Context context, String str, boolean z) {
        Intent a2 = a(context, str);
        if (a2 != null) {
            a2.putExtra("isCameraRollAccessEnabled", z);
        }
        return a2;
    }

    public static Intent c(Context context, String str, boolean z) {
        Intent a2 = a(context, str);
        if (a2 != null) {
            a2.putExtra("isPersonalProfileSyncEnabled", z);
        }
        return a2;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        if ("com.google.android.gms.auth.proximity.phonehub.ACTION_UPDATE_LOCAL_FEATURE_STATE".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountName");
            if (stringExtra == null) {
                a.m("No accountName was provided in the Intent to UpdateLocalFeatureStateIntentOperation", new Object[0]);
                return;
            }
            try {
                boolean z2 = true;
                if (intent.hasExtra("isCameraRollAccessEnabled")) {
                    aevm.a(stringExtra).i(intent.getBooleanExtra("isCameraRollAccessEnabled", false)).get();
                    z = true;
                } else {
                    z = false;
                }
                if (intent.hasExtra("isNotificationAccessGranted") && fnuf.v()) {
                    ((eqcy) aevm.a(stringExtra).j(intent.getBooleanExtra("isNotificationAccessGranted", false))).u();
                } else {
                    z2 = z;
                }
                if (intent.hasExtra("isPersonalProfileSyncEnabled") && fnuf.x()) {
                    final boolean booleanExtra = intent.getBooleanExtra("isPersonalProfileSyncEnabled", false);
                    ((eqcy) aevm.a(stringExtra).b.b(new ekut() { // from class: aevd
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            afbc afbcVar = (afbc) obj;
                            auad auadVar = aevm.a;
                            fgrc fgrcVar = (fgrc) afbcVar.iQ(5, null);
                            fgrcVar.X(afbcVar);
                            fgrc v = afbr.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ((afbr) v.b).b = booleanExtra;
                            afbr afbrVar = (afbr) v.Q();
                            if (!fgrcVar.b.L()) {
                                fgrcVar.U();
                            }
                            afbc afbcVar2 = (afbc) fgrcVar.b;
                            afbc afbcVar3 = afbc.a;
                            afbrVar.getClass();
                            afbcVar2.e = afbrVar;
                            afbcVar2.b |= 2;
                            return (afbc) fgrcVar.Q();
                        }
                    }, eqex.a)).u();
                    Map map = aewb.b().a;
                    synchronized (map) {
                        for (final aewa aewaVar : map.values()) {
                            aewaVar.g.execute(new Runnable() { // from class: aevw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    aewa aewaVar2 = aewa.this;
                                    aewaVar2.u();
                                    aewaVar2.k();
                                }
                            });
                        }
                    }
                } else if (!z2) {
                    return;
                }
                aewb.b().f();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                a.m("Thread interrupted while updating LocalFeatureState", new Object[0]);
            } catch (ExecutionException e) {
                a.n("Failed to update LocalFeatureState", e, new Object[0]);
            }
        }
    }
}
