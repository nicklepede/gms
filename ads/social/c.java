package com.google.android.gms.ads.social;

import android.content.Context;
import defpackage.dhmr;
import defpackage.dxyi;
import defpackage.ekxd;
import defpackage.wjw;
import defpackage.wjx;
import defpackage.wkg;
import defpackage.wwy;
import defpackage.wxf;
import defpackage.wxh;
import defpackage.wxi;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class c {
    private final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final String a(String str, String str2) {
        ekxd.a(new wxf());
        Context context = this.a;
        dxyi.f(context);
        return wxh.f(context, str, str2, new wwy(context));
    }

    public final void b(String str) {
        Context context = this.a;
        if (!wxi.c(context)) {
            Context context2 = this.a;
            String str2 = wjx.a;
            wkg.k(context2, str);
            return;
        }
        try {
            dhmr.n(new wwy(context.getApplicationContext()).a(str));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException(e);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof wjw) {
                throw ((wjw) e2.getCause());
            }
            String concat = "Unexpected exception while clearing token: ".concat(e2.toString());
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k(concat);
        }
    }
}
