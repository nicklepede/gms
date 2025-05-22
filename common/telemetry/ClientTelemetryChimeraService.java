package com.google.android.gms.common.telemetry;

import defpackage.bzot;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ClientTelemetryChimeraService extends bzot {
    public ClientTelemetryChimeraService() {
        super(270, "com.google.android.gms.common.telemetry.service.START", Collections.EMPTY_SET, 3, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r4.h.b == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r0.e(r0.c(r8.j), r8.i) == false) goto L21;
     */
    @Override // defpackage.bzot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void a(defpackage.bzoz r7, com.google.android.gms.common.internal.GetServiceRequest r8) {
        /*
            r6 = this;
            boolean r0 = defpackage.fpjx.d()
            r1 = 0
            if (r0 != 0) goto Ld
            r8 = 16
            r7.a(r8, r1)
            return
        Ld:
            boolean r0 = defpackage.dpya.h(r6)
            r2 = 24
            if (r0 == 0) goto L18
            r7.a(r2, r1)
        L18:
            android.os.Bundle r0 = r8.i
            java.lang.String r3 = "api"
            java.lang.String r0 = r0.getString(r3)
            atzn r3 = new atzn
            r3.<init>(r0)
            bjis r0 = r7.b
            auow r4 = new auow
            java.lang.String r8 = r8.f
            r4.<init>(r6, r8, r0, r3)
            atpg r8 = r4.a()
            boolean r0 = r8.e()
            r3 = 23
            if (r0 != 0) goto L3c
        L3a:
            r2 = r3
            goto L60
        L3c:
            auih r8 = r4.b(r8)
            if (r8 != 0) goto L49
            atzn r8 = r4.h
            java.lang.String r8 = r8.b
            if (r8 != 0) goto L60
            goto L3a
        L49:
            atzn r0 = r4.h
            java.lang.String r0 = r0.b
            r3 = 0
            if (r0 == 0) goto L3a
            atph r0 = r4.j
            int r5 = r8.j
            int r5 = r0.c(r5)
            int r8 = r8.i
            boolean r8 = r0.e(r5, r8)
            if (r8 != 0) goto L3a
        L60:
            if (r2 == 0) goto L66
            r7.a(r2, r1)
            return
        L66:
            atzv r8 = new atzv
            bzpe r0 = r6.l()
            r8.<init>(r0, r4)
            r7.c(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.telemetry.ClientTelemetryChimeraService.a(bzoz, com.google.android.gms.common.internal.GetServiceRequest):void");
    }
}
