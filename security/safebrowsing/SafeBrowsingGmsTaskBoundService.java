package com.google.android.gms.security.safebrowsing;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aurt;
import defpackage.cauf;
import defpackage.dbdx;
import defpackage.dbkv;
import defpackage.elgo;
import defpackage.elso;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingGmsTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final String b = "SafeBrowsingGmsTaskBoundService";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String str = caufVar.a;
        if (!str.equals("update_list")) {
            Log.w(b, "Unknown action: ".concat(str));
            return 2;
        }
        elgo l = elgo.l(16);
        dbdx a2 = dbdx.a(this, aurt.a);
        try {
            if (a2.j.block(dbdx.c.toMillis())) {
                SparseArray sparseArray = new SparseArray();
                elso it = l.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    sparseArray.put(num.intValue(), a2.h.e(num.intValue()));
                }
                dbkv c = a2.c(sparseArray, "com.google.android.gms", false);
                if (c != null) {
                    a2.f(c, 0L);
                }
            } else {
                Log.e(dbdx.a, "couldn't updateOnDeviceListsFromServer. Lists are not loaded");
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
