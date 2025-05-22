package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import defpackage.asvp;
import defpackage.aswe;
import defpackage.asxb;
import defpackage.asxd;
import defpackage.aumo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class a {
    public static asvp a(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                int i = aswe.c;
                asxd.k(context);
                asvp asvpVar = new asvp();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (aumo.a().d(context, intent, asvpVar, 1)) {
                    return asvpVar;
                }
                throw new IOException("Connection failure");
            } catch (asxb e) {
                throw new IOException(e);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new asxb(9);
        }
    }
}
