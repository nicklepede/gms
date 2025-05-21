package com.google.android.gms.ads.social;

import android.content.Context;
import defpackage.dfbl;
import defpackage.dvni;
import defpackage.eijy;
import defpackage.unx;
import defpackage.uny;
import defpackage.uoh;
import defpackage.vay;
import defpackage.vbf;
import defpackage.vbh;
import defpackage.vbi;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class c {
    private final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final String a(String str, String str2) {
        eijy.a(new vbf());
        Context context = this.a;
        dvni.f(context);
        return vbh.f(context, str, str2, new vay(context));
    }

    public final void b(String str) {
        Context context = this.a;
        if (!vbi.c(context)) {
            Context context2 = this.a;
            String str2 = uny.a;
            uoh.k(context2, str);
            return;
        }
        try {
            dfbl.n(new vay(context.getApplicationContext()).a(str));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof unx) {
                throw ((unx) e2.getCause());
            }
            String concat = "Unexpected exception while clearing token: ".concat(e2.toString());
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k(concat);
        }
    }
}
