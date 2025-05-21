package com.google.android.gms.fitness.service.maintenance;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asit;
import defpackage.asot;
import defpackage.bggg;
import defpackage.bggi;
import defpackage.bhaf;
import defpackage.eiig;
import defpackage.ejhf;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class StoreMaintenanceIntentOperation extends IntentOperation {
    private bggi d;
    private static final asot b = bhaf.a();
    public static final Set a = new HashSet();
    private static long c = 0;

    public static PendingIntent a(Context context) {
        Intent startIntent = getStartIntent(context, StoreMaintenanceIntentOperation.class, "com.google.android.gms.fitness.trim");
        eiig.x(startIntent);
        PendingIntent pendingIntent = getPendingIntent(context, StoreMaintenanceIntentOperation.class, startIntent, 0, 134217728);
        eiig.x(pendingIntent);
        return pendingIntent;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x0383 A[Catch: IOException -> 0x038c, all -> 0x0431, TRY_LEAVE, TryCatch #4 {IOException -> 0x038c, blocks: (B:90:0x0379, B:92:0x0383), top: B:89:0x0379, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void b() {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fitness.service.maintenance.StoreMaintenanceIntentOperation.b():void");
    }

    private static synchronized void c(Context context) {
        synchronized (StoreMaintenanceIntentOperation.class) {
            Intent startIntent = getStartIntent(context, StoreMaintenanceIntentOperation.class, "com.google.android.gms.fitness.aggregate");
            eiig.x(startIntent);
            PendingIntent pendingIntent = getPendingIntent(context, StoreMaintenanceIntentOperation.class, startIntent, 0, 134217728);
            eiig.x(pendingIntent);
            new asit(context).a(pendingIntent);
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bggi a2 = bggg.a(this);
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
            ((ejhf) b.i()).B("Unexpected intent: %s", intent);
        } else {
            c(this);
        }
    }
}
