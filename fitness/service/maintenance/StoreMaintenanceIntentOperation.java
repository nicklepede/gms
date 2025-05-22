package com.google.android.gms.fitness.service.maintenance;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aumn;
import defpackage.ausn;
import defpackage.bikw;
import defpackage.biky;
import defpackage.bjev;
import defpackage.ekvl;
import defpackage.eluo;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class StoreMaintenanceIntentOperation extends IntentOperation {
    private biky d;
    private static final ausn b = bjev.a();
    public static final Set a = new HashSet();
    private static long c = 0;

    public static PendingIntent a(Context context) {
        Intent startIntent = getStartIntent(context, StoreMaintenanceIntentOperation.class, "com.google.android.gms.fitness.trim");
        ekvl.y(startIntent);
        PendingIntent pendingIntent = getPendingIntent(context, StoreMaintenanceIntentOperation.class, startIntent, 0, 134217728);
        ekvl.y(pendingIntent);
        return pendingIntent;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x037f A[Catch: IOException -> 0x0388, all -> 0x042d, TRY_LEAVE, TryCatch #1 {IOException -> 0x0388, blocks: (B:90:0x0375, B:92:0x037f), top: B:89:0x0375, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void b() {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.service.maintenance.StoreMaintenanceIntentOperation.b():void");
    }

    private static synchronized void c(Context context) {
        synchronized (StoreMaintenanceIntentOperation.class) {
            Intent startIntent = getStartIntent(context, StoreMaintenanceIntentOperation.class, "com.google.android.gms.fitness.aggregate");
            ekvl.y(startIntent);
            PendingIntent pendingIntent = getPendingIntent(context, StoreMaintenanceIntentOperation.class, startIntent, 0, 134217728);
            ekvl.y(pendingIntent);
            new aumn(context).a(pendingIntent);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        biky a2 = bikw.a(this);
        this.d = a2;
        a2.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c2;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -2057545999) {
            if (hashCode == 2107679664 && action.equals("com.google.android.gms.fitness.trim")) {
                c2 = 0;
            }
            c2 = 65535;
        } else {
            if (action.equals("com.google.android.gms.fitness.aggregate")) {
                c2 = 1;
            }
            c2 = 65535;
        }
        if (c2 == 0) {
            b();
        } else if (c2 != 1) {
            ((eluo) b.i()).B("Unexpected intent: %s", intent);
        } else {
            c(this);
        }
    }
}
