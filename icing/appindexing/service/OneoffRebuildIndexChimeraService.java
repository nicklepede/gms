package com.google.android.gms.icing.appindexing.service;

import android.os.Bundle;
import defpackage.arwm;
import defpackage.asqx;
import defpackage.blfw;
import defpackage.bljp;
import defpackage.bykx;
import defpackage.byky;
import defpackage.byln;
import defpackage.eiic;
import defpackage.enix;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OneoffRebuildIndexChimeraService extends RebuildIndexChimeraService {
    static final byky a = bykx.a(0, (int) TimeUnit.MINUTES.toSeconds(30), (int) TimeUnit.DAYS.toSeconds(1));
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0020, code lost:
    
        if (defpackage.bljp.c(r7, r0) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (defpackage.fpad.l() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        defpackage.blfw.b("Rebuild index intent missing for package %s.", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r7, java.lang.String r8, defpackage.enix r9) {
        /*
            defpackage.arwm.s(r8)
            java.lang.String r0 = "com.google.android.gms"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L12
            boolean r0 = defpackage.fpad.l()
            if (r0 == 0) goto L23
            goto L29
        L12:
            android.content.Intent r0 = defpackage.bljp.a(r8)
            boolean r1 = defpackage.bljp.d(r7, r0)
            if (r1 != 0) goto L29
            boolean r0 = defpackage.bljp.c(r7, r0)
            if (r0 == 0) goto L23
            goto L29
        L23:
            java.lang.String r7 = "Rebuild index intent missing for package %s."
            defpackage.blfw.b(r7, r8)
            return
        L29:
            int r0 = r8.length()
            int r0 = r0 + (-119)
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.String r0 = r8.substring(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "packageName"
            r2.putString(r3, r8)
            int r9 = r9.a()
            java.lang.String r3 = "sourceValue"
            r2.putInt(r3, r9)
            byjl r9 = defpackage.byjl.a(r7)
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r3 = "adb_enabled"
            int r7 = android.provider.Settings.Global.getInt(r7, r3, r1)
            if (r7 == 0) goto L64
            r3 = 60
            r5 = 30
            goto L78
        L64:
            fpad r7 = defpackage.fpad.a
            fpae r7 = r7.a()
            long r5 = r7.r()
            fpad r7 = defpackage.fpad.a
            fpae r7 = r7.a()
            long r3 = r7.p()
        L78:
            java.lang.String r7 = "OneoffIndexRebuild-"
            java.lang.String r7 = r7.concat(r0)
            bykj r0 = new bykj
            r0.<init>()
            r0.e(r5, r3)
            byky r3 = com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService.a
            r0.t = r3
            r0.u = r2
            r0.t(r7)
            r7 = 1
            r0.p = r7
            fpad r2 = defpackage.fpad.a
            fpae r2 = r2.a()
            long r2 = r2.q()
            int r2 = (int) r2
            r0.y(r2, r7)
            fpad r2 = defpackage.fpad.a
            fpae r2 = r2.a()
            boolean r2 = r2.ad()
            r0.x(r2, r7)
            java.lang.String r2 = "com.google.android.gms.icing.indexapi.OneoffRebuildIndexService"
            r0.j = r2
            r0.v(r7)
            boolean r2 = defpackage.fpbg.l()
            if (r2 == 0) goto Lbe
            r0.f(r1, r7)
            goto Lc5
        Lbe:
            boolean r7 = defpackage.fpad.m()
            r0.i(r7)
        Lc5:
            bykk r7 = r0.b()
            r9.f(r7)
            java.lang.String r7 = "Scheduled oneoff index rebuild for %s."
            defpackage.blfw.b(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.appindexing.service.OneoffRebuildIndexChimeraService.e(android.content.Context, java.lang.String, enix):void");
    }

    @Override // com.google.android.gms.icing.appindexing.service.RebuildIndexChimeraService
    public final int d(byln bylnVar, bljp bljpVar) {
        Bundle bundle = bylnVar.b;
        arwm.s(bundle);
        String string = bundle.getString("packageName");
        int i = bundle.getInt("sourceValue", 0);
        if (string == null || asqx.d(string)) {
            blfw.g("%s: package name is null or empty.", bylnVar.a);
            return 2;
        }
        if (bljpVar.e(string, System.currentTimeMillis(), (enix) eiic.c(enix.b(i), enix.UNKNOWN), true)) {
            return 0;
        }
        blfw.b("Failed to send index request to package %s; will reschedule.", string);
        return 1;
    }
}
