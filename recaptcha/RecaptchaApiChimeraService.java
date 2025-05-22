package com.google.android.gms.recaptcha;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.azxb;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.czji;
import defpackage.czlf;
import defpackage.czlx;
import defpackage.czly;
import defpackage.elpp;
import defpackage.fgub;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RecaptchaApiChimeraService extends bzot {
    protected fgub a;
    protected azxb b;
    private final czlx c;

    static {
        ausn.b("RecaptchaApiService", auid.RECAPTCHA);
    }

    public RecaptchaApiChimeraService() {
        this(czly.a(), new czji());
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new czlf(this, l(), getServiceRequest.f));
    }

    public final synchronized boolean c() {
        azxb azxbVar = this.b;
        if (azxbVar == null || !azxbVar.b()) {
            return false;
        }
        this.b.close();
        this.b = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (j$.time.Duration.between(defpackage.fgvn.d(r4.a), defpackage.fgvn.d(r4.c.a())).toSeconds() > defpackage.fule.a.lK().a()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.azxb d() {
        /*
            r4 = this;
            monitor-enter(r4)
            azxb r0 = r4.b     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L31
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L31
            fgub r0 = r4.a     // Catch: java.lang.Throwable -> L45
            czlx r1 = r4.c     // Catch: java.lang.Throwable -> L45
            fgub r1 = r1.a()     // Catch: java.lang.Throwable -> L45
            j$.time.Instant r0 = defpackage.fgvn.d(r0)     // Catch: java.lang.Throwable -> L45
            j$.time.Instant r1 = defpackage.fgvn.d(r1)     // Catch: java.lang.Throwable -> L45
            j$.time.Duration r0 = j$.time.Duration.between(r0, r1)     // Catch: java.lang.Throwable -> L45
            long r0 = r0.toSeconds()     // Catch: java.lang.Throwable -> L45
            fule r2 = defpackage.fule.a     // Catch: java.lang.Throwable -> L45
            fulf r2 = r2.lK()     // Catch: java.lang.Throwable -> L45
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L45
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L41
        L31:
            java.lang.String r0 = "recaptcha-android"
            azxb r0 = defpackage.azve.c(r4, r0)     // Catch: java.lang.Throwable -> L45
            r4.b = r0     // Catch: java.lang.Throwable -> L45
            czlx r0 = r4.c     // Catch: java.lang.Throwable -> L45
            fgub r0 = r0.a()     // Catch: java.lang.Throwable -> L45
            r4.a = r0     // Catch: java.lang.Throwable -> L45
        L41:
            azxb r0 = r4.b     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            return r0
        L45:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.recaptcha.RecaptchaApiChimeraService.d():azxb");
    }

    protected RecaptchaApiChimeraService(czlx czlxVar, czji czjiVar) {
        super(205, "com.google.android.gms.recaptcha.service.START", elpp.a, 3, 9);
        this.c = czlxVar;
    }
}
