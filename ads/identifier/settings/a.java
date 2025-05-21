package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import defpackage.aqsz;
import defpackage.aqtp;
import defpackage.aqum;
import defpackage.aquo;
import defpackage.asiu;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class a {
    public static aqsz a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                int i = aqtp.c;
                aquo.k(context);
                aqsz aqszVar = new aqsz();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (asiu.a().d(context, intent, aqszVar, 1)) {
                    return aqszVar;
                }
                throw new IOException("Connection failure");
            } catch (aqum e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new aqum(9);
        }
    }
}
