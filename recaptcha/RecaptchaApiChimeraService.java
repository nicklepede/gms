package com.google.android.gms.recaptcha;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.axtb;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.cwzk;
import defpackage.cxbh;
import defpackage.cxbz;
import defpackage.cxca;
import defpackage.ejck;
import defpackage.fefi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RecaptchaApiChimeraService extends bxgd {
    protected fefi a;
    protected axtb b;
    private final cxbz c;

    static {
        asot.b("RecaptchaApiService", asej.RECAPTCHA);
    }

    public RecaptchaApiChimeraService() {
        this(cxca.a(), new cwzk());
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new cxbh(this, l(), getServiceRequest.f));
    }

    public final synchronized boolean c() {
        axtb axtbVar = this.b;
        if (axtbVar == null || !axtbVar.b()) {
            return false;
        }
        this.b.close();
        this.b = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (j$.time.Duration.between(defpackage.fegu.d(r4.a), defpackage.fegu.d(r4.c.a())).toSeconds() > defpackage.frqu.a.a().a()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.axtb d() {
        /*
            r4 = this;
            monitor-enter(r4)
            axtb r0 = r4.b     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L31
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L31
            fefi r0 = r4.a     // Catch: java.lang.Throwable -> L45
            cxbz r1 = r4.c     // Catch: java.lang.Throwable -> L45
            fefi r1 = r1.a()     // Catch: java.lang.Throwable -> L45
            j$.time.Instant r0 = defpackage.fegu.d(r0)     // Catch: java.lang.Throwable -> L45
            j$.time.Instant r1 = defpackage.fegu.d(r1)     // Catch: java.lang.Throwable -> L45
            j$.time.Duration r0 = j$.time.Duration.between(r0, r1)     // Catch: java.lang.Throwable -> L45
            long r0 = r0.toSeconds()     // Catch: java.lang.Throwable -> L45
            frqu r2 = defpackage.frqu.a     // Catch: java.lang.Throwable -> L45
            frqv r2 = r2.a()     // Catch: java.lang.Throwable -> L45
            long r2 = r2.a()     // Catch: java.lang.Throwable -> L45
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L41
        L31:
            java.lang.String r0 = "recaptcha-android"
            axtb r0 = defpackage.axre.c(r4, r0)     // Catch: java.lang.Throwable -> L45
            r4.b = r0     // Catch: java.lang.Throwable -> L45
            cxbz r0 = r4.c     // Catch: java.lang.Throwable -> L45
            fefi r0 = r0.a()     // Catch: java.lang.Throwable -> L45
            r4.a = r0     // Catch: java.lang.Throwable -> L45
        L41:
            axtb r0 = r4.b     // Catch: java.lang.Throwable -> L45
            monitor-exit(r4)
            return r0
        L45:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.recaptcha.RecaptchaApiChimeraService.d():axtb");
    }

    protected RecaptchaApiChimeraService(cxbz cxbzVar, cwzk cwzkVar) {
        super(205, "com.google.android.gms.recaptcha.service.START", ejck.a, 3, 9);
        this.c = cxbzVar;
    }
}
