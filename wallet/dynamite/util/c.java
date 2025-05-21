package com.google.android.gms.wallet.dynamite.util;

import android.content.Context;
import defpackage.asnp;
import defpackage.dvmh;
import defpackage.dvms;
import defpackage.dvnz;
import defpackage.enre;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ftex;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class c {
    public static final String a = "c";
    private static boolean b = false;

    private c() {
    }

    public static synchronized void a(Context context) {
        enss e;
        synchronized (c.class) {
            if (b) {
                return;
            }
            try {
                dvms.e(context.getApplicationContext());
            } catch (IllegalStateException e2) {
                if (e2.getMessage() != null && !e2.getMessage().contains("PhenotypeContext")) {
                    throw e2;
                }
            }
            b = true;
            int b2 = asnp.b(context, context.getPackageName());
            dvms b3 = dvms.b(context);
            if (b3 == null) {
                e = ensm.a;
            } else {
                dvnz f = b3.f();
                int i = ftex.a;
                e = f.e(dvmh.c(context, "com.google.android.gms.wallet_dynamite"), b2, new String[]{"WALLET_DYNAMITE", "GMS_CORE_WALLET", "ORCHESTRATION_CLIENT", "PAYMENTS_ORCHESTRATION"});
            }
            ensj.t(e, new b(), enre.a);
        }
    }
}
