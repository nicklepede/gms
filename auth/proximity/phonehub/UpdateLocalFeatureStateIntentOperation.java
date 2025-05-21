package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.acvm;
import defpackage.acwa;
import defpackage.acwb;
import defpackage.arxo;
import defpackage.eiho;
import defpackage.enpf;
import defpackage.enre;
import defpackage.flcw;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class UpdateLocalFeatureStateIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("ProximityAuth", "UpdateLocalFeatureStateIntentOperation");

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
                    acvm.a(stringExtra).i(intent.getBooleanExtra("isCameraRollAccessEnabled", false)).get();
                    z = true;
                } else {
                    z = false;
                }
                if (intent.hasExtra("isNotificationAccessGranted") && flcw.v()) {
                    ((enpf) acvm.a(stringExtra).j(intent.getBooleanExtra("isNotificationAccessGranted", false))).u();
                } else {
                    z2 = z;
                }
                if (intent.hasExtra("isPersonalProfileSyncEnabled") && flcw.x()) {
                    final boolean booleanExtra = intent.getBooleanExtra("isPersonalProfileSyncEnabled", false);
                    ((enpf) acvm.a(stringExtra).b.b(new eiho() { // from class: acvd
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            adbc adbcVar = (adbc) obj;
                            arxo arxoVar = acvm.a;
                            fecj fecjVar = (fecj) adbcVar.iB(5, null);
                            fecjVar.X(adbcVar);
                            fecj v = adbr.a.v();
                            if (!v.b.L()) {
                                v.U();
                            }
                            ((adbr) v.b).b = booleanExtra;
                            adbr adbrVar = (adbr) v.Q();
                            if (!fecjVar.b.L()) {
                                fecjVar.U();
                            }
                            adbc adbcVar2 = (adbc) fecjVar.b;
                            adbc adbcVar3 = adbc.a;
                            adbrVar.getClass();
                            adbcVar2.e = adbrVar;
                            adbcVar2.b |= 2;
                            return (adbc) fecjVar.Q();
                        }
                    }, enre.a)).u();
                    Map map = acwb.b().a;
                    synchronized (map) {
                        for (final acwa acwaVar : map.values()) {
                            acwaVar.g.execute(new Runnable() { // from class: acvw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    acwa acwaVar2 = acwa.this;
                                    acwaVar2.u();
                                    acwaVar2.k();
                                }
                            });
                        }
                    }
                } else if (!z2) {
                    return;
                }
                acwb.b().f();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                a.m("Thread interrupted while updating LocalFeatureState", new Object[0]);
            } catch (ExecutionException e) {
                a.n("Failed to update LocalFeatureState", e, new Object[0]);
            }
        }
    }
}
