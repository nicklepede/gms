package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.bggg;
import defpackage.bhaf;
import defpackage.bhbc;
import defpackage.djks;
import defpackage.dkbc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WearableSyncConnectionChimeraService extends dkbc {
    private static boolean a;

    static {
        bhaf.a();
        a = false;
    }

    @Override // defpackage.dkbc
    public final void c(NodeParcelable nodeParcelable) {
        boolean z;
        getApplicationContext();
        Context applicationContext = getApplicationContext();
        if (a) {
            return;
        }
        boolean z2 = false;
        if (bhbc.a(djks.a(bggg.a(applicationContext).C().a), "com.google.android.gms.fitness.service.wearable.RECEIVE_WEAR_DATA_CAPABILITY")) {
            try {
                z = applicationContext.getPackageManager().getApplicationInfo("com.google.android.apps.fitness", 0).enabled;
            } catch (PackageManager.NameNotFoundException unused) {
                z = false;
            }
            if (FitAppPackageIntentOperation.a(applicationContext, z)) {
                z2 = true;
            }
        }
        a = z2;
    }
}
