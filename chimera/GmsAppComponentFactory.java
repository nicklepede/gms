package com.google.android.gms.chimera;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Service;
import android.content.Intent;
import com.google.android.chimera.config.InvalidConfigException;
import defpackage.eqwk;
import defpackage.fmps;
import defpackage.pov;
import defpackage.pph;
import defpackage.qdd;
import defpackage.qdt;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GmsAppComponentFactory extends AppComponentFactory {
    static List a;

    private static qdt a(String str) {
        try {
            eqwk s = pph.f().j().s();
            return s.W(qdd.c(s.X(), str));
        } catch (IndexOutOfBoundsException e) {
            throw new InvalidConfigException("IndexOutOfBounds trying to retrieve ".concat(String.valueOf(str)), e);
        }
    }

    private static final Object b(Class cls, String str) {
        Class b;
        if (fmps.e() && (b = pov.e().b(str)) != null) {
            return b.asSubclass(cls).newInstance();
        }
        return null;
    }

    public final Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        Activity activity = (Activity) b(Activity.class, str);
        return activity != null ? activity : super.instantiateActivity(classLoader, str, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0 == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r11, java.lang.String r12) {
        /*
            r10 = this;
            boolean r0 = defpackage.arfc.b()
            if (r0 == 0) goto Lc1
            arfc r0 = defpackage.arfc.a()
            java.lang.String r1 = "GmsAppComponentFactory"
            r2 = 0
            if (r0 != 0) goto L1c
            java.lang.String r0 = "Cannot Instantiate "
            java.lang.String r3 = ": GmsApplicationContext is not available."
            java.lang.String r0 = defpackage.a.a(r12, r0, r3)
            android.util.Log.e(r1, r0)
            goto Lbe
        L1c:
            fmsr r3 = defpackage.fmsr.a
            fmss r3 = r3.a()
            boolean r3 = r3.b()
            r4 = 0
            if (r3 == 0) goto L79
            java.util.List r3 = com.google.android.gms.chimera.GmsAppComponentFactory.a
            if (r3 != 0) goto L72
            android.os.SystemClock.uptimeMillis()
            eite r3 = new eite
            r3.<init>()
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r6 = 648(0x288, float:9.08E-43)
            android.content.pm.PackageInfo r0 = r5.getPackageInfo(r0, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            android.content.pm.ProviderInfo[] r5 = r0.providers     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            if (r5 == 0) goto L69
            android.content.pm.ProviderInfo[] r0 = r0.providers     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            int r5 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r6 = r4
        L4b:
            if (r6 >= r5) goto L69
            r7 = r0[r6]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            android.os.Bundle r8 = r7.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            if (r8 == 0) goto L60
            java.lang.String r9 = "chimera.sliceProviderProxy"
            boolean r8 = r8.getBoolean(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            if (r8 == 0) goto L60
            java.lang.String r7 = r7.name     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r3.i(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
        L60:
            int r6 = r6 + 1
            goto L4b
        L63:
            r0 = move-exception
            java.lang.String r5 = "Cannot get package info"
            android.util.Log.e(r1, r5, r0)
        L69:
            eitj r3 = r3.g()
            com.google.android.gms.chimera.GmsAppComponentFactory.a = r3
            android.os.SystemClock.uptimeMillis()
        L72:
            boolean r0 = r3.contains(r12)
            if (r0 != 0) goto L7a
            goto Lbe
        L79:
            r0 = r4
        L7a:
            qdt r1 = a(r12)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L7f
            goto L95
        L7f:
            r3 = 1
            defpackage.aoah.h(r3)
            qdt r1 = a(r12)     // Catch: com.google.android.chimera.config.InvalidConfigException -> L88
            goto L95
        L88:
            r3 = move-exception
            java.lang.String r5 = "Cannot instantiate "
            java.lang.String r6 = " from invalid Chimera config: "
            java.lang.String r3 = defpackage.a.o(r12, r3, r5, r6)
            android.util.Log.e(r1, r3)
            r1 = r2
        L95:
            if (r1 == 0) goto Lb7
            int r0 = r1.d()
            if (r0 <= 0) goto Lb1
            java.lang.String[] r2 = new java.lang.String[r0]
        L9f:
            if (r4 >= r0) goto Laa
            java.lang.String r3 = r1.e(r4)
            r2[r4] = r3
            int r4 = r4 + 1
            goto L9f
        Laa:
            anxx r0 = new anxx
            r0.<init>(r12, r2)
            r2 = r0
            goto Lbe
        Lb1:
            anxx r2 = new anxx
            r2.<init>(r12)
            goto Lbe
        Lb7:
            if (r0 == 0) goto Lbe
            anxx r2 = new anxx
            r2.<init>(r12)
        Lbe:
            if (r2 == 0) goto Lc1
            return r2
        Lc1:
            android.content.ContentProvider r11 = super.instantiateProvider(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.chimera.GmsAppComponentFactory.instantiateProvider(java.lang.ClassLoader, java.lang.String):android.content.ContentProvider");
    }

    public final Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        Service service = (Service) b(Service.class, str);
        return service != null ? service : super.instantiateService(classLoader, str, intent);
    }
}
