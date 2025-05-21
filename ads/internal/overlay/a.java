package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.l;
import com.google.android.gms.ads.internal.util.m;
import defpackage.ajt;
import defpackage.aju;
import defpackage.ajv;
import defpackage.fyuu;
import defpackage.fyuv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a {
    public static final void a(Context context, Intent intent, i iVar, h hVar, boolean z) {
        if (z) {
            b(context, intent.getData(), iVar, hVar);
            return;
        }
        try {
            intent.toURI();
            if (((Boolean) p.bZ.g()).booleanValue()) {
                com.google.android.gms.ads.internal.c.e();
                m.s(context, intent);
            } else {
                com.google.android.gms.ads.internal.c.e();
                m.r(context, intent);
            }
            if (iVar != null) {
                iVar.a();
            }
            if (hVar != null) {
                hVar.b();
            }
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k(message);
            if (hVar != null) {
                hVar.b();
            }
        }
    }

    private static final void b(Context context, Uri uri, i iVar, h hVar) {
        String a;
        try {
            com.google.android.gms.ads.internal.c.e();
            if (context != null) {
                if (!(context instanceof Activity)) {
                    m.f(context, uri);
                } else if (((Boolean) p.az.g()).booleanValue()) {
                    com.google.android.gms.ads.internal.customtabs.c cVar = com.google.android.gms.ads.internal.c.a.f;
                    if (cVar.b == null) {
                        com.google.android.gms.ads.internal.util.future.e.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.customtabs.a
                            @Override // java.lang.Runnable
                            public final void run() {
                            }
                        });
                    }
                    ajv a2 = new aju(cVar.b).a();
                    a2.a.setPackage(fyuu.a(context));
                    a2.a(context, uri);
                } else if (((Boolean) p.ax.g()).booleanValue()) {
                    com.google.android.gms.ads.internal.customtabs.d dVar = new com.google.android.gms.ads.internal.customtabs.d();
                    dVar.c = new l(dVar, context, uri);
                    Activity activity = (Activity) context;
                    if (dVar.a == null && (a = fyuu.a(activity)) != null) {
                        dVar.b = new fyuv(dVar);
                        ajt.b(activity, a, dVar.b);
                    }
                } else {
                    m.f(context, uri);
                }
            }
            if (iVar != null) {
                iVar.a();
            }
        } catch (ActivityNotFoundException e) {
            String message = e.getMessage();
            int i = com.google.android.gms.ads.internal.util.c.a;
            com.google.android.gms.ads.internal.util.client.h.k(message);
        }
        if (hVar != null) {
            hVar.a();
        }
    }
}
