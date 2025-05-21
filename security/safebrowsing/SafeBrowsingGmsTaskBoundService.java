package com.google.android.gms.security.safebrowsing;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asnz;
import defpackage.byln;
import defpackage.cytz;
import defpackage.czax;
import defpackage.eitj;
import defpackage.ejfh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SafeBrowsingGmsTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SafeBrowsingGmsTaskBoundService";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String str = bylnVar.a;
        if (!str.equals("update_list")) {
            Log.w(b, "Unknown action: ".concat(str));
            return 2;
        }
        eitj l = eitj.l(16);
        cytz a2 = cytz.a(this, asnz.a);
        try {
            if (a2.j.block(cytz.c.toMillis())) {
                SparseArray sparseArray = new SparseArray();
                ejfh it = l.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    sparseArray.put(num.intValue(), a2.h.e(num.intValue()));
                }
                czax c = a2.c(sparseArray, "com.google.android.gms", false);
                if (c != null) {
                    a2.f(c, 0L);
                }
            } else {
                Log.e(cytz.a, "couldn't updateOnDeviceListsFromServer. Lists are not loaded");
            }
            if (a2 != null) {
                a2.close();
            }
            return 0;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
