package com.google.android.gms.wallet.dynamite.util;

import android.content.Context;
import defpackage.aurj;
import defpackage.dxxi;
import defpackage.dxxt;
import defpackage.dxyz;
import defpackage.dydy;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.fwal;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class c {
    public static final String a = "c";
    private static boolean b = false;

    private c() {
    }

    public static synchronized void a(Context context) {
        eqgl e;
        synchronized (c.class) {
            if (b) {
                return;
            }
            try {
                dxxt.e(context.getApplicationContext());
            } catch (IllegalStateException e2) {
                if (e2.getMessage() != null && !e2.getMessage().contains("PhenotypeContext")) {
                    throw e2;
                }
            }
            b = true;
            int b2 = aurj.b(context, context.getPackageName());
            dxxt b3 = dxxt.b(context);
            if (b3 == null) {
                e = eqgf.a;
            } else {
                dxyz f = b3.f();
                dydy dydyVar = fwal.a;
                e = f.e(dxxi.c(context, "com.google.android.gms.wallet_dynamite"), b2, new String[]{"WALLET_DYNAMITE", "GMS_CORE_WALLET", "ORCHESTRATION_CLIENT", "PAYMENTS_ORCHESTRATION"});
            }
            eqgc.t(e, new b(), eqex.a);
        }
    }
}
