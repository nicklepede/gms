package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.wearable.internal.NodeParcelable;
import defpackage.bikw;
import defpackage.bjev;
import defpackage.bjfs;
import defpackage.dlwl;
import defpackage.dmmv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class WearableSyncConnectionChimeraService extends dmmv {
    private static boolean a;

    static {
        bjev.a();
        a = false;
    }

    @Override // defpackage.dmmv
    public final void c(NodeParcelable nodeParcelable) {
        boolean z;
        getApplicationContext();
        Context applicationContext = getApplicationContext();
        if (a) {
            return;
        }
        boolean z2 = false;
        if (bjfs.a(dlwl.a(bikw.a(applicationContext).C().a), "com.google.android.gms.fitness.service.wearable.RECEIVE_WEAR_DATA_CAPABILITY")) {
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
